package dao;

import model.Etudiant;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import dao.DBConnection;

public class EtudiantDAO {

    // Connexion DB
    private static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/scolarite", "root", "");
    }

    // =========================
    // CREATE (Ajouter)
    // =========================
    public boolean addEtudiant(Etudiant etudiant) {
        String sql = "INSERT INTO etudiant (nom, prenom, email, filiere, niveau) VALUES (?, ?, ?, ?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, etudiant.getNom());
            ps.setString(2, etudiant.getPrenom());
            ps.setString(3, etudiant.getEmail());
            ps.setString(4, etudiant.getFiliere());
            ps.setInt(5, etudiant.getNiveau());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // =========================
    // READ ALL (Afficher tout)
    // =========================
    public List<Etudiant> getAllEtudiants() {
        List<Etudiant> list = new ArrayList<>();
        String sql = "SELECT * FROM etudiant";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Etudiant e = new Etudiant();
                e.setId(rs.getInt("id"));
                e.setNom(rs.getString("nom"));
                e.setPrenom(rs.getString("prenom"));
                e.setEmail(rs.getString("email"));
                e.setFiliere(rs.getString("filiere"));
                e.setNiveau(rs.getInt("niveau"));

                list.add(e);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    // =========================
    // READ BY ID (chercher 1 étudiant)
    // =========================
    public Etudiant getEtudiantById(int id) {
        String sql = "SELECT * FROM etudiant WHERE id = ?";
        Etudiant e = null;

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                e = new Etudiant();
                e.setId(rs.getInt("id"));
                e.setNom(rs.getString("nom"));
                e.setPrenom(rs.getString("prenom"));
                e.setEmail(rs.getString("email"));
                e.setFiliere(rs.getString("filiere"));
                e.setNiveau(rs.getInt("niveau"));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return e;
    }

    // =========================
    // UPDATE (Modifier)
    // =========================
    public boolean updateEtudiant(Etudiant etudiant) {
        String sql = "UPDATE etudiant SET nom=?, prenom=?, email=?, filiere=?, niveau=? WHERE id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, etudiant.getNom());
            ps.setString(2, etudiant.getPrenom());
            ps.setString(3, etudiant.getEmail());
            ps.setString(4, etudiant.getFiliere());
            ps.setInt(5, etudiant.getNiveau());
            ps.setInt(6, etudiant.getId());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // =========================
    // DELETE (Supprimer)
    // =========================
    public boolean deleteEtudiant(int id) {
        String sql = "DELETE FROM etudiant WHERE id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}