package fr.umontpellier.iut.algogen.individus;

import java.util.ArrayList;

import fr.umontpellier.iut.algogen.Instance;
import fr.umontpellier.iut.algogen.Solution;

public class GDBHSimple extends IndividuGDBH<GDBHSimple> {
    public GDBHSimple(Instance in, ArrayList<Character> t) {
        super(in, t);
    }

    public GDBHSimple(Instance in) {
        super(in);
    }

    public GDBHSimple(Instance in, Solution s) {
        super(in, s);
    }

    /**
     * @param i2 : Un deuxieme individu Faire le croisement entre this et i2 comme
     *           dans le texte.
     * @return un individu fils de type GDBHSimple.
     * 
     **/
    public GDBHSimple calculerCroisement(GDBHSimple i2) {
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