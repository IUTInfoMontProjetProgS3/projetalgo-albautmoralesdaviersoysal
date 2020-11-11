package fr.umontpellier.iut.algogen.individus;

import java.util.ArrayList;

import fr.umontpellier.iut.algogen.Coord;
import fr.umontpellier.iut.algogen.Instance;
import fr.umontpellier.iut.algogen.Solution;

public abstract class IndividuPermut<T extends IndividuPermut<T>> implements IIndividu<T> {
    protected Instance instance;
    protected ArrayList<Integer> permut;

    public IndividuPermut(Instance instance, ArrayList<Integer> p) {

    }

    public IndividuPermut(Instance instace) {

    }

    /**
     * @param c1 : premiere coordonnée
     * @param c2 : deuxieme coordonnée
     * @return le plus cours chemin entre c1 et c2
     * 
     **/
    public static ArrayList<Coord> plusCourtChemin(Coord c1, Coord c2) {
        return null;
    }

    public Instance getInstance() {
        return null;
    }

    @Override
    public String toString() {
        return permut + "";
    }

    @Override
    public Solution calculerSol() {
        return new Solution();
    }

    public int evaluerFitness() {
        return 0;
    }

}
