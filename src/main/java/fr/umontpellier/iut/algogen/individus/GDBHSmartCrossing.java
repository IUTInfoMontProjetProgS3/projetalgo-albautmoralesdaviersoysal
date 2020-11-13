package fr.umontpellier.iut.algogen.individus;

import java.util.ArrayList;

import fr.umontpellier.iut.algogen.Instance;
import fr.umontpellier.iut.algogen.Solution;

/**
 * GDBHSmartCrossing est la classe représentant une fonctionnalité de croisement
 * un peut plus intélligente.
 * 
 * @see IndividuGDBH
 * @version 1.0
 */
public class GDBHSmartCrossing extends IndividuGDBH<GDBHSmartCrossing> {

    public GDBHSmartCrossing(Instance instance, ArrayList<Character> trajet) {
        super(instance, trajet);
    }

    public GDBHSmartCrossing(Instance instance) {
        super(instance);
    }

    public GDBHSmartCrossing(Instance instance, Solution solution) {
        super(instance, solution);
    }

    /**
     * Faire le croisement intelligent entre this et individu2 comme dans le texte.
     * 
     * @param individu2 : Un deuxieme individu
     * @return un individu fils de type {@code GDBHSimple}.
     **/
    public GDBHSmartCrossing calculerCroisement(GDBHSmartCrossing individu2) {

        return null;
    }

    /**
     * Cette fonction est la même que {@link GDBHSimple#calculerMutation()}
     * 
     * @return un individu fils muté de type {@code GDBHSimple}.
     * 
     * @see GDBHSimple#calculerMutation()
     **/
    public GDBHSmartCrossing calculerMutation() {
        return null;
    }

}
