// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import Carte.*;
import Actions.*;
import Robots.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Génération de la map

        Carte.map map = new map(50);
        map.genererArbres(10);
        map.genererMares(10);

        // Demande d'ajout de robots

        Scanner nombreRobot = new Scanner(System.in);
        System.out.println("Entrez le nombre de robots que vous souhaitez, minimum 3 !");
        int nombre = nombreRobot.nextInt();
        Scanner demande = new Scanner(System.in);

        if(nombre < 3){
            System.out.println("Nombre de robots minimal non atteint");
        }
        else{
            for(int i = 0; i < nombre; i++){
                Robot robot = AnalyseDemande.analyserDemande(demande);
            }
        }




    }
}