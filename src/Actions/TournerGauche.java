package Actions;
import Robots.Robot;
public class TournerGauche implements Deplacement {
    @Override
    public void deplacement(Robot robot) {
        if(!deplacementIllegal()){
            switch(robot.getOrientation()){
                case 'N':
                    robot.setOrientation('O');
                    break;
                case 'O':
                    robot.setOrientation('S');
                    break;
                case 'S':
                    robot.setOrientation('E');
                    break;
                case 'E':
                    robot.setOrientation('N');
                    break;
            }
        }

    }

    @Override
    public boolean deplacementIllegal() {
        return false;
    }
}
