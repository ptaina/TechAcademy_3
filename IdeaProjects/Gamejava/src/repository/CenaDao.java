package repository;

import model.Cena;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CenaDao {
    public static Cena findCenaById(Integer id) throws SQLException {
        Connection conn = Mysql.getConnection();
        String sql = "SELECT * FROM cena WHERE id = ?";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Cena cena = null;

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();

            if (rs.next()) {
                cena = new Cena();
                cena.setCenaId(rs.getInt("cena_id"));
                cena.setDescricao(rs.getString("descricao"));
                cena.setProximaCenaA(rs.getInt("proxima_cena_a"));
                cena.setProximaCenaB(rs.getInt("proxima_cena_b"));
                cena.setProximaCenaC(rs.getInt("proxima_cena_c"));
                cena.setPersonagemId(rs.getInt("personagem_id"));
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        }

        return cena;
    }
}
