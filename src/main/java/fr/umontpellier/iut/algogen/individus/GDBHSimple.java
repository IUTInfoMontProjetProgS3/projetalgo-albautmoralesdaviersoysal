package fr.umontpellier.iut.algogen.individus;

import java.util.ArrayList;

import fr.umontpellier.iut.algogen.Instance;
import fr.umontpellier.iut.algogen.Solution;

public class GDBHSimple extends IndividuGDBH<GDBHSimple> {
    public GDBHSimple(Instance instance, ArrayList<Character> trajet) {
        super(instance, trajet);
    }

    public GDBHSimple(Instance instance) {
        super(instance);
    }

    public GDBHSimple(Instance instance, Solution solution) {
        super(instance, solution);
    }

    /**
     * @param individu2 : Un deuxieme individu Faire le croisement entre this et i2 comme
     *           dans le texte.
     * @return un individu fils de type GDBHSimple.
     * 
     **/
    public GDBHSimple calculerCroisement(GDBHSimple individu2) {
        return null;
    }

    /**
     * Faire la mutation de this comme dans le texte.
     * 
     * @return un individu fils muté de type GDBHSimple.
     * 
     **/

    public GDBHSimple calculerMutation() {
        return null;
    }

}