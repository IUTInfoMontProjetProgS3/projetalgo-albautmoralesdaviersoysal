package fr.umontpellier.iut.algogen.strategies;

import fr.umontpellier.iut.algogen.individus.IIndividu;

import java.util.ArrayList;
import java.util.Random;

public abstract class StrategieCalculNextGen<T extends IIndividu<T>> {
	 /**
     * @param pop : Une population
     * @return un individu selectinné par roullette. 
     * 
     * Example :
	* supposons que pop.size()==3, avec S = 6, et
    *pop.get(0).evaluerFitness() == 2 (l'individu 0 a une fitness de 2)
 * pop.get(1).evaluerFitness() == 3 (l'individu 1 a une fitness de 3)
      *pop.get(2).evaluerFitness() == 1 (l'individu 2 a une fitness de 1)
       * dans ce cas, on tire un entier r dans [0,S-1] (=[0,5]), puis :
       * si r est dans {0,1} , on selectionne l'individu 0
       * si r est dans {2,3,4} on selectionne l'individu 1
        * si r est dans {5}, on selectionne l'individu 2

    **/
    protected T selectionRoulette(ArrayList<T> pop) {
       return null;
    }
    /**
     * @param pop : Une population
     * @return deux individus parents selectinnés par roullette. 
     * 
    **/
    public ArrayList<T> selectionParents(ArrayList<T> pop) {
       return null;
    }

    public abstract ArrayList<T> calculerNextGen(ArrayList<T> pop);
   
}








