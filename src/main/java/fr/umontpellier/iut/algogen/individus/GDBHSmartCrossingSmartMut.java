package fr.umontpellier.iut.algogen.individus;

import java.util.ArrayList;

import fr.umontpellier.iut.algogen.Instance;
import fr.umontpellier.iut.algogen.Solution;

/**
 * GDBHSmartCrossingSmartMut est la classe représentant une fonctionnalité de
 * croisement idantique à {@link GDBHSmartCrossing} mais avec une mutation plus
 * intéligente.
 * 
 * @see IndividuGDBH
 * @version 1.0
 */
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
     * Cette fonction est la même que
     * {@link GDBHSmartCrossing#calculerCroisement(GDBHSmartCrossing)}
     * 
     * @param individu2 : Un deuxieme individu
     * @return un individu fils de type GDBHSmartCrossingSmartMut.
     * 
     * @see GDBHSmartCrossing#calculerCroisement(GDBHSmartCrossing)
     **/
    public GDBHSmartCrossingSmartMut calculerCroisement(GDBHSmartCrossingSmartMut individu2) {
        GDBHSmartCrossing iSmartCrossing1 = new GDBHSmartCrossing(instance, trajet);
        GDBHSmartCrossing iSmartCrossing2 = new GDBHSmartCrossing(individu2.instance, individu2.trajet);
        return new GDBHSmartCrossingSmartMut(instance, iSmartCrossing1.calculerCroisement(iSmartCrossing2).trajet);
    }

    /**
     * Mettre direction2 dans l'indice x et mettre direction1 dans l'indice x+1 et
     * enlever deux directions a la fin.
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
