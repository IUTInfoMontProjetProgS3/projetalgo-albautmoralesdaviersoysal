package fr.umontpellier.iut.algogen.individus;

import java.security.SecureRandom;
import java.util.ArrayList;

import fr.umontpellier.iut.algogen.Coord;
import fr.umontpellier.iut.algogen.Instance;
import fr.umontpellier.iut.algogen.Solution;
import fr.umontpellier.iut.algogen.outils.PetitPoucet;

/**
 * GDBHSmartCrossing est la classe représentant une fonctionnalité de croisement
 * un peut plus intélligente.
 * 
 * @see IndividuGDBH
 * @version 1.0.1
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
     * 
     * @since 1.0.1
     **/
    public GDBHSmartCrossing calculerCroisement(GDBHSmartCrossing individu2) {
        int p = indexRandom();
        Coord coord1 = calculerSol().get(p);
        Coord coord2 = individu2.calculerSol().get(p);
        Solution transition = PetitPoucet.getPlusCourtChemin(coord1, coord2);
        transition.add(0, coord1);
        ArrayList<Character> trajetCroise = new ArrayList<>(trajet.subList(0, p));
        trajetCroise.addAll(convertieEnTrajet(transition));
        if (trajetCroise.size() < instance.getK())
            trajetCroise.addAll(individu2.trajet.subList(p, p + instance.getK() - trajetCroise.size()));
        return new GDBHSmartCrossing(instance, trajetCroise);
    }

    private int indexRandom() {
        return new SecureRandom().nextInt(instance.getK() / 2);
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
