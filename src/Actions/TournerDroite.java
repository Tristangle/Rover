package Actions;
import Robots.Robot;
public class TournerDroite implements Deplacement{
    @Override
    public void deplacement(Robot robot) {
        if(!deplacementIllegal()){
            switch(robot.getOrientation()){
                case 'N':
                    robot.setOrientation('E');
                    break;
                case 'E':
                    robot.setOrientation('S');
                    break;
                case 'S':
                    robot.setOrientation('O');
                    break;
                case 'O':
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
