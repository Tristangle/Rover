package Actions;
import Robots.Robot;
public interface Deplacement {
    // Méthode de déplacement
    void deplacement(Robot robot);

    // Déplacement illégal
    boolean deplacementIllegal();

}
