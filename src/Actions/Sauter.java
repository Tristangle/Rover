package Actions;
import Robots.Robot;
public class Sauter implements Deplacement{

    @Override
    public void deplacement(Robot robot) {
        robot.setPositionX(robot.getPositionX() + 2);
        // Si besoin déplacement diagonale
        // robot.setPositionY(robot.getPositionY() + 2);
    }

    @Override
    public boolean deplacementIllegal() {
        return false;
    }
}
