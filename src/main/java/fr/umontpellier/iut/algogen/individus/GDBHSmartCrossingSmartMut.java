package fr.umontpellier.iut.algogen.individus;

import fr.umontpellier.iut.algogen.Coord;
import fr.umontpellier.iut.algogen.Instance;
import fr.umontpellier.iut.algogen.Solution;

import java.util.ArrayList;
import java.util.Random;


public class GDBHSmartCrossingSmartMut extends IndividuGDBH<GDBHSmartCrossingSmartMut> {


    public GDBHSmartCrossingSmartMut(Instance in, ArrayList<Character> t) {
        super(in, t);
    }

    public GDBHSmartCrossingSmartMut(Instance in) {
        super(in);
    }

    public GDBHSmartCrossingSmartMut(Instance in, Solution s) {
        super(in, s);
    }
    /**
     * @param c : Un mouvement
     * 
     * @return L'inverse du mouvement.
     * 
    **/
    private static char inv(char c) {
     return '-';
    }

    /**
     * @param i2 : Un deuxieme individu
     * Faire le croisement intelligent entre this et i2 comme dans le texte.
     * @return un individu fils de type GDBHSimple.
     * 
    **/
    public GDBHSmartCrossingSmartMut calculerCroisement(GDBHSmartCrossingSmartMut i2) {
    		return null;
    }
    /**
     * @param x : Un indice 
     * @param new1 : Un premier Mouvement
     * @param new2 : Un deuxieme Mouvement
     * Mettre new2 dans l'indice x et mettre new1 dans l'indice x+1 
     * et enlever deux mouvements a la fin.
     * 
    **/
    public void mutationAux(int x, char new1, char new2) {
    	
    }
    /**
     * Faire la mutation intelligente de this comme dans le texte.
     * @return un individu fils muté de type GDBHSimple.
     * 
    **/

    public GDBHSmartCrossingSmartMut calculerMutation() {
       return null;
    }
}
