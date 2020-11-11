package fr.umontpellier.iut.algogen.individus;

import java.util.ArrayList;

import fr.umontpellier.iut.algogen.Instance;
import fr.umontpellier.iut.algogen.Solution;

/**
 * GDBHSmartCrossing est la classe représentant une fonctionnalité de croisementet
 * mutation un peut plus intélligente.
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
     * @param individu2 : Un deuxieme individu Faire le croisement intelligent entre
     *                  this et i2 comme dans le texte.
     * @return un individu fils de type GDBHSimple.
     * 
     **/
    public GDBHSmartCrossing calculerCroisement(GDBHSmartCrossing individu2) {

        return null;
    }

    /**
     * Execute la mutation de this comme dans le texte.
     * 
     * @return un individu fils muté de type GDBHSimple.
     * 
     * Cette fonction est la même que GDBHSimple
     **/
    public GDBHSmartCrossing calculerMutation() {
        return null;
    }

}
