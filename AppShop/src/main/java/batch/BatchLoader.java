package batch;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BatchLoader {
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USER = "user";
    private static final String PASSWORD = "password";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(DB_URL, USER, PASSWORD)) {
            connection.setAutoCommit(false);

            loadCliente(connection, "src/main/resources/clienti.csv");
            loadCalzatura(connection, "src/main/resources/calzature.csv");
            loadAcquisto(connection, "src/main/resources/acquisti.csv");

            connection.commit();
            System.out.println("Database popolato con successo.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void loadCalzatura(Connection connection, String filePath) {
        String sql = "INSERT INTO calzature (id, nome, descrizione) VALUES (?, ?, ?)";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath));
             PreparedStatement pstmt = connection.prepareStatement(sql)) {

            String line = br.readLine(); // Salta la prima riga (intestazione)
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                pstmt.setInt(1, Integer.parseInt(fields[0]));
                pstmt.setString(2, fields[1]);
                pstmt.setString(3, fields[2]);
                pstmt.addBatch();
            }
            pstmt.executeBatch();
        } catch (Exception e) {
            System.err.println("Errore durante il caricamento di calzatura: " + e.getMessage());
        }
    }

    private static void loadCliente(Connection connection, String filePath) {
        String sql = "INSERT INTO clienti (id_cliente, nome) VALUES (?, ?)";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath));
             PreparedStatement pstmt = connection.prepareStatement(sql)) {

            String line = br.readLine(); // Salta la prima riga (intestazione)
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                pstmt.setInt(1, Integer.parseInt(fields[0]));
                pstmt.setString(2, fields[1]);
                pstmt.addBatch();
            }
            pstmt.executeBatch();
        } catch (Exception e) {
            System.err.println("Errore durante il caricamento di cliente: " + e.getMessage());
        }
    }

    private static void loadAcquisto(Connection connection, String filePath) {
        String sql = "INSERT INTO acquisti (id, id_cliente, id_calzatura) VALUES (?, ?, ?)";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath));
             PreparedStatement pstmt = connection.prepareStatement(sql)) {

            String line;
            br.readLine(); // Salta la prima riga (intestazione)
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(","); // Assicurati che il delimitatore sia corretto
                pstmt.setInt(1, Integer.parseInt(fields[0])); // id
                pstmt.setInt(2, Integer.parseInt(fields[1])); // id_cliente
                pstmt.setInt(3, Integer.parseInt(fields[2])); // id_calzatura
                pstmt.addBatch();
            }
            pstmt.executeBatch();
        } catch (Exception e) {
            System.err.println("Errore durante il caricamento di acquisto: " + e.getMessage());
        }
    }

}
