package repository;

import model.Jogador;
import java.sql.*;

public class JogadorDao {

    //criar um jogador no banco de dados
    public static void createJogador(Jogador jogador) throws SQLException {
        Connection conn = Mysql.getConnection();
        String sql = "INSERT INTO jogador (nome, idade, progresso_cena) VALUES (?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setString(1, jogador.getNome());
        stmt.setInt(2, jogador.getIdade());
        stmt.setInt(3, jogador.getProgressoCena());

        stmt.executeUpdate();
        stmt.close();
        conn.close();
    }

    //encontrar um jogador pelo ID
    public static Jogador findJogadorById(Integer jogadorId) throws SQLException {
        Connection conn = Mysql.getConnection();
        String sql = "SELECT * FROM jogador WHERE id = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, jogadorId);
        ResultSet rs = stmt.executeQuery();

        Jogador jogador = null;
        if (rs.next()) {
            jogador = new Jogador();
            jogador.setJogadorId(rs.getInt("id"));
            jogador.setNome(rs.getString("nome"));
            jogador.setIdade(rs.getInt("idade"));
            jogador.setProgressoCena(rs.getInt("progresso_cena"));
        }

        rs.close();
        stmt.close();
        conn.close();

        return jogador;
    }

    // atualizar o progresso da cena de um jogador
    public static void updateProgressoCena(Integer jogadorId, Integer novaCena) throws SQLException {
        Connection conn = Mysql.getConnection();
        String sql = "UPDATE jogador SET progresso_cena = ? WHERE id = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setInt(1, novaCena);
        stmt.setInt(2, jogadorId);

        stmt.executeUpdate();
        stmt.close();
        conn.close();
    }

    // atualizar um jogador no banco de dados
    public static void updateJogador(Jogador jogador) throws SQLException {
        Connection conn = Mysql.getConnection();
        String sql = "UPDATE jogador SET nome = ?, idade = ?, progresso_cena = ? WHERE id = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setString(1, jogador.getNome());
        stmt.setInt(2, jogador.getIdade());
        stmt.setInt(3, jogador.getProgressoCena());
        stmt.setInt(4, jogador.getJogadorId());

        stmt.executeUpdate();
        stmt.close();
        conn.close();
    }
}
