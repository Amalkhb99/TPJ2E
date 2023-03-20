package presentation;


import dao.DaoImpl;
import metier.MetierImpl;
public class presentation {
    public static void main(String [] args) {

        MetierImpl metier = new MetierImpl();
        DaoImpl sql = new DaoImpl();

        metier.setDao(sql);
        double resultat = metier.calcul();

        System.out.println("Résultat est: "+resultat);
    }

}
