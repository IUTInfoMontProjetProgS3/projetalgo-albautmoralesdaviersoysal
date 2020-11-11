package fr.umontpellier.iut.algogen.individus;

import java.util.ArrayList;

import fr.umontpellier.iut.algogen.Instance;
import fr.umontpellier.iut.algogen.Solution;

/**
 * GDBHsimple est la classe représentant une fonctionnalité de croisementet
 * mutation basique.
 * 
 * @see IndividuGDBH
 * @version 1.0
 */
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
     * Les individus this et {@code individu2} sont croisés avec des partitions aléatoire, puis l'individu
     * résultant est normalisé.
     * 
     * @param individu2 : individu avec le quel le croisement doit être opéré
     * 
     * @return un individu fils de type GDBHSimple.
     * 
     **/
    public GDBHSimple calculerCroisement(GDBHSimple individu2) {
        return null;
    }

    /**
     * Permute aléatoirement deux index entre eux. Et normalise celui-ci.
     * 
     * @return un individu fils muté de type GDBHSimple.
     * 
     **/
    public GDBHSimple calculerMutation() {
        return null;
    }

}