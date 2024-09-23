package repository;

import model.Prova;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProvaDao {

    private static final String URL = "jdbc:mysql://localhost:3306/projeto";
    private static final String USER = "root";

    // encontrar prova pelo ID
    public static Prova findProvaById(Integer id) {
        Prova prova = null;

        try (Connection connection = DriverManager.getConnection(URL, USER, "")) {
            String sql = "SELECT * FROM prova WHERE provaId = ?";
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
}