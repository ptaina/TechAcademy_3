package repository;

import model.Cena;
import model.Escolha;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EscolhaDao {

    public static Escolha findEscolhaById(Integer id) throws SQLException {
        Connection conn = Mysql.getConnection();
        String sql = "SELECT * FROM escolha WHERE escolha_id = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, id);

        ResultSet rs = stmt.executeQuery();
        Escolha escolha = null;
        if (rs.next()) {
            escolha = new Escolha();
            escolha.setEscolhaId(rs.getInt("escolha_id"));
            escolha.setJogadorId(rs.getInt("jogador_id"));
            escolha.setEscolha(rs.getString("escolha"));

            // Recupera a Cena associada
            Integer cenaId = rs.getInt("cena_id");
            Cena cena = CenaDao.findCenaById(cenaId);
            escolha.setCena(cena);
        }

        // Fecha as conex. e recursos
        rs.close();
        stmt.close();
        conn.close();

        return escolha;
    }

    public static void createEscolha(Escolha escolha) throws SQLException {
        Connection conn = Mysql.getConnection();
        String sql = "INSERT INTO escolha (jogador_id, cena_id, escolha) VALUES (?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, escolha.getJogadorId());
        stmt.setInt(2, escolha.getCena().getCenaId());
        stmt.setString(3, escolha.getEscolha());

        stmt.executeUpdate();

        stmt.close();
        conn.close();
    }

    public static void updateEscolha(Escolha escolha) throws SQLException {
        Connection conn = Mysql.getConnection();
        String sql = "UPDATE escolha SET jogador_id = ?, cena_id = ?, escolha = ? WHERE escolha_id = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, escolha.getJogadorId());
        stmt.setInt(2, escolha.getCena().getCenaId());
        stmt.setString(3, escolha.getEscolha());
        stmt.setInt(4, escolha.getEscolhaId());

        stmt.executeUpdate();

        stmt.close();
        conn.close();
    }

    public static void deleteEscolha(Integer id) throws SQLException {

    }

    public static void createEscolha(Integer jogadorId, int i, String s) {
    }
}
