package Carte;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import Robots.Robot;

public class map {

    // Taille de la carte
    int taille = 50;
    // Tableau de positions des robots
    private List<Robot> listeRobots = new ArrayList<>();
    // Tableau position obstacles
    private List<Arbre> listeArbres = new ArrayList<>();
    private List<Mare> listeMares = new ArrayList<>();

    // Initialisation d'un générateur de valeur aléatoire.
    private Random random = new Random();
    public map(int taille) {
        this.taille = taille;
    }

    // Génération des obstacles
    public void genererArbres(int nombreArbres){
        for (int i = 0; i < nombreArbres; i++) {
            listeArbres.add(new Arbre(1,random.nextInt(taille), random.nextInt(taille)));
        }
    }
    public void genererMares(int nombreMares) {
        for (int i = 0; i < nombreMares; i++) {
            listeMares.add(new Mare(random.nextInt(taille), random.nextInt(taille)));
        }
    }
}
