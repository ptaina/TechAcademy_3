package Testes;

import repository.ProvaDao;
import model.Prova;

import java.util.List;

public class ProvaDaoTest {
    public static void main(String[] args) {
        // Testar encontrar prova pelo ID
        Prova prova = ProvaDao.findProvaById(1);
        if (prova != null) {
            System.out.println("Prova encontrada: " + prova.getDescricao());
        } else {
            System.out.println("Prova não encontrada.");
        }

        // Testar encontrar todas as provas
        List<Prova> todasProvas = ProvaDao.findAllProvas();
        if (!todasProvas.isEmpty()) {
            System.out.println("Todas as provas encontradas:");
            for (Prova p : todasProvas) {
                System.out.println(p.getDescricao());
            }
        } else {
            System.out.println("Nenhuma prova encontrada.");
        }
    }
}
