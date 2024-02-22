import Robots.Robot;
import java.util.Scanner;
public class AnalyseDemande {
        public static Robot analyserDemande(Scanner scanner) {
            System.out.println("Veuillez saisir les informations du robot (type positionX positionY orientation actions) :");
            String input = scanner.nextLine();

            // Découper l'entrée en morceaux en utilisant l'espace comme délimiteur
            String[] partie = input.split(" ");

            // Extraire les informations nécessaires

            String type = partie[0];
            // Résultat recherché C ou V
            if (!type.equals("C") && !type.equals("V")) {
                System.out.println("Erreur : Le type du robot doit être 'C' ou 'V'.");
            }

            int positionX = Integer.parseInt(partie[1]);
            // Résultat recherché entre 0 et 50
            if (positionX < 0 || positionX > 50) {
                System.out.println("Erreur : La position X du robot doit être comprise entre 0 et 50.");
            }

            int positionY = Integer.parseInt(partie[2]);
            // Résultat recherché entre 0 et 50
            if (positionY < 0 || positionY > 50) {
                System.out.println("Erreur : La position Y du robot doit être comprise entre 0 et 50.");
            }
            char orientation = partie[3].charAt(0);
            //Résultat recherché entre 'N','E','O' et 'S'
            if (orientation != 'N' && orientation != 'E' && orientation != 'O' && orientation != 'S') {
                System.out.println("Erreur : L'orientation du robot doit être 'N', 'E', 'O' ou 'S'.");
            }
            String actions = partie[4];
            // Résultat recherché entre 'F','B','L' et 'R'
            for (char action : actions.toCharArray()) {
                if (action != 'F' && action != 'B' && action != 'L' && action != 'R') {
                    System.out.println("Erreur : Les actions du robot doivent être 'F', 'B', 'L' ou 'R'.");
                    break; // Sortir de la boucle si une action invalide est trouvée
                }
            }

            // Créer un robot avec les informations extraites et le retourner
            return new Robot(type, 5, positionX, positionY, orientation);
        }
}
