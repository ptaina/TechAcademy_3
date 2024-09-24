package repository;

import model.Prova;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProvaDao {

    private static final String URL = "jdbc:mysql://localhost:3306/projeto";
    private static final String USER = "root";


    public static Prova findProvaById(Integer id) {
        Prova prova = null;

        try (Connection connection = DriverManager.getConnection(URL, USER, "")) {
            String sql = "SELECT * FROM prova WHERE id= ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                prova = new Prova();
                prova.setProvaId(resultSet.getInt("provaId"));
                prova.setDescricao(resultSet.getString("descricao"));
                prova.setCenaEncontrada(resultSet.getInt("cenaEncontrada"));
                prova.setInventarioId(resultSet.getInt("inventarioId"));
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar prova com ID: " + id);
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Erro inesperado ao buscar prova");
            e.printStackTrace();
        }

        return prova;
    }

    // Encontrar todas as provas
    public static List<Prova> findAllProvas() {
        List<Prova> provas = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(URL, USER, "")) {
            String sql = "SELECT * FROM prova";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Prova prova = new Prova();
                prova.setProvaId(resultSet.getInt("provaId"));
                prova.setDescricao(resultSet.getString("descricao"));
                prova.setCenaEncontrada(resultSet.getInt("cenaEncontrada"));
                prova.setInventarioId(resultSet.getInt("inventarioId"));
                provas.add(prova);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar todas as provas.");
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Erro inesperado ao buscar todas as provas");
            e.printStackTrace();
        }

        return provas;
    }
}
