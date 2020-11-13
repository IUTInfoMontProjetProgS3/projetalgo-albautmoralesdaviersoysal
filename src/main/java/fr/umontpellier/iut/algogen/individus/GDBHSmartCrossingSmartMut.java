package fr.umontpellier.iut.algogen.individus;

import java.util.ArrayList;

import fr.umontpellier.iut.algogen.Instance;
import fr.umontpellier.iut.algogen.Solution;

public class GDBHSmartCrossingSmartMut extends IndividuGDBH<GDBHSmartCrossingSmartMut> {

    public GDBHSmartCrossingSmartMut(Instance instance, ArrayList<Character> trajet) {
        super(instance, trajet);
    }

    public GDBHSmartCrossingSmartMut(Instance instance) {
        super(instance);
    }

    public GDBHSmartCrossingSmartMut(Instance instance, Solution solution) {
        super(instance, solution);
    }

    /**
     * @param direction : Une direction emprinté
     * 
     * @return L'inverse de la direction.
     * 
     **/
    private static char inv(char direction) {
        return '-';
    }

    /**
     * @param individu2 : Un deuxieme individu
     * @return un individu fils de type GDBHSmartCrossingSmartMut.
     * 
     * 
     *         Cette fonction est la même que GDBHSmartCrossing
     **/
    public GDBHSmartCrossingSmartMut calculerCroisement(GDBHSmartCrossingSmartMut individu2) {
        return null;
    }

    /**
     * Mettre new2 dans l'indice x et mettre new1 dans l'indice x+1 et enlever deux
     * mouvements a la fin.
     * 
     * @param indice     : Un indice
     * @param direction1 : Un premier Mouvement
     * @param direction2 : Un deuxieme Mouvement
     * 
     **/
    public void mutationAux(int indice, char direction1, char direction2) {

    }

    /**
     * Faire la mutation intelligente de this comme dans le texte.
     * 
     * @return un individu fils muté de type GDBHSimple.
     * 
     **/
    public GDBHSmartCrossingSmartMut calculerMutation() {
        return null;
    }
}
