import model.Cena;
import repository.CenaDao;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        int cenaId = 1;

        try {
            // Chama o mét p/ buscar a cena
            Cena cena = CenaDao.findCenaById(cenaId);

            //se a cena foi encontrada
            if (cena != null) {
                System.out.println(cena.toString());
            } else {
                System.out.println("Cena não encontrada.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
