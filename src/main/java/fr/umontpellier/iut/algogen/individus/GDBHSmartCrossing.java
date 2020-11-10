package fr.umontpellier.iut.algogen.individus;

import java.util.ArrayList;

import fr.umontpellier.iut.algogen.Instance;
import fr.umontpellier.iut.algogen.Solution;

public class GDBHSmartCrossing extends IndividuGDBH<GDBHSmartCrossing> {

    public GDBHSmartCrossing(Instance in, ArrayList<Character> t) {
        super(in, t);
    }

    public GDBHSmartCrossing(Instance in) {
        super(in);
    }

    public GDBHSmartCrossing(Instance in, Solution s) {
        super(in, s);
    }

    /**
     * @param i2 : Un deuxieme individu Faire le croisement intelligent entre this
     *           et i2 comme dans le texte.
     * @return un individu fils de type GDBHSimple.
     * 
     **/
    public GDBHSmartCrossing calculerCroisement(GDBHSmartCrossing i2) {

        return null;
    }

    /**
     * Execute la mutation de this comme dans le texte.
     * 
     * @return un individu fils muté de type GDBHSimple.
     * 
     **/
    public GDBHSmartCrossing calculerMutation() {
        return null;
    }

}
