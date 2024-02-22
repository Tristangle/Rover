package Actions;
import Robots.Robot;
public class Avancer implements Deplacement {
    @Override
    public void deplacement(Robot robot) {
        if(!deplacementIllegal()){
            // Mettre à jour les coordonnées du robot
            robot.setPositionX(robot.getPositionX() + 1);
            // Si besoin déplacement diagonale
            //robot.setPositionY(robot.getPositionY() + 1);
        }
        else{
            robot.setVie(robot.getVie() - 1);
        }

    }

    @Override
    public boolean deplacementIllegal() {
        return false;
    }
}
