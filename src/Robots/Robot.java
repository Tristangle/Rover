package Robots;

import Actions.Deplacement;

public class Robot {

    public String type = "";
    // Vie du robot
    public int vie = 5;

    public void setVie(int vie) {
        this.vie = vie;
    }

    public int getVie() {
        return vie;
    }

    // Position du robot
    public int positionX = 0;

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int positionY = 0;


    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    // Orientation du robot
    public char orientation = 'N';

    public char getOrientation() {
        return orientation;
    }

    public void setOrientation(char orientation) {
        this.orientation = orientation;
    }


    // Constructeur de robots
    public Robot(String type, int vie, int positionX, int positionY, char orientation) {
        this.type = type;
        this.vie = vie;
        this.positionX = positionX;
        this.positionY = positionY;
        this.orientation = orientation;
    }

    // Déplacement du robot
    public void deplacement(Deplacement deplacement){
        deplacement.deplacement(this);
    }
}
