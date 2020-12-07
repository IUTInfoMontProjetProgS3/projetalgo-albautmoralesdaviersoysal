package fr.umontpellier.iut.algogen.strategies;

import java.util.ArrayList;
import java.util.Random;

import fr.umontpellier.iut.algogen.individus.IIndividu;

/**
 * <b>CroisementMutationV2 est la classe qui récupére la nouvelle génération en
 * suivant les étapes :</b>
 * <ul>
 * <li>Sélection par roulette de deux individus.</li>
 * <li>Mutation des parents avec une probabilité de p.</li>
 * <li>Génération du fils.</li>
 * </ul>
 * </p>
 * <p>
 * De plus, on ajoute aussi les deux meilleurs parents de la génération
 * précédente à la nouvelle génération.
 * </p>
 * 
 * @see StrategieCalculNextGen
 * @see IIndividu
 * 
 * @version 1.0
 */
public class CroisementMutationV2<T extends IIndividu<T>> extends StrategieCalculNextGen<T> {

    /**
     * Probabilité de mutation.
     * 
     * @see CroisementMutationV2#CroisementMutationV2(double)
     */
    private double probaMutation;

    public CroisementMutationV2(double probaMutation) {
        this.probaMutation = probaMutation;
    }

    @Override
    protected ArrayList<T> nouveauxFilsDeLaPopu(ArrayList<T> pop) {
        ArrayList<T> newPop = new ArrayList<>();
        for (int i = 0; i < pop.size() - 2; i++) {
            ArrayList<T> parents = selectionParentsAvecChanceMutation(pop);
            newPop.add(croiserLesParents(parents));
        }
        return newPop;
    }

    private T croiserLesParents(ArrayList<T> parents) {
        //TODO Voir si randomise le croisement
        return parents.get(0).calculerCroisement(parents.get(1));
    }

    private ArrayList<T> selectionParentsAvecChanceMutation(ArrayList<T> pop) {
        ArrayList<T> parents = selectionParentsAvecChanceMutation(pop);
        for (int i = 0; i < parents.size(); i++) {
            if (estMute())
                parents.set(i, parents.get(i).calculerMutation());
        }
        return parents;
    }

    private boolean estMute() {
        return new Random().nextDouble() < probaMutation;
    }

}
