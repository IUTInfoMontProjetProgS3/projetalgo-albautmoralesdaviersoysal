package fr.umontpellier.iut.algogen.strategies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

import fr.umontpellier.iut.algogen.individus.IIndividu;

/**
 * <b>CroisementMutationV1 est la classe qui récupére la nouvelle génération en
 * suivant les étapes :</b>
 * <ul>
 * <li>Sélection par roulette de deux individus.</li>
 * <li>Génération d'un fils.</li>
 * <li>Mutation du fils.</li>
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
public class CroisementMutationV1<T extends IIndividu<T>> extends StrategieCalculNextGen<T> {

    /**
     * Probabilité de mutation.
     * 
     * @see CroisementMutationV1#CroisementMutationV1(double)
     */
    private double probaMutation;

    public CroisementMutationV1(double probaMutation) {
        this.probaMutation = probaMutation;
    }

    /**
     * @param pop : Une population
     * @return une nouvelle generation qui contient les meilleurs individu de pop
     *         ainsi que des individu fils.
     * 
     **/
    @Override
    public ArrayList<T> calculerNextGen(ArrayList<T> pop) {
        ArrayList<T> newPop = nouveauxFilsDeLaPopu(pop);
        newPop.addAll(deuxMeilleurIndividus(pop));
        return newPop;
    }

    private ArrayList<T> nouveauxFilsDeLaPopu(ArrayList<T> pop) {
        ArrayList<T> newPop = new ArrayList<>();
        for (int i = 0; i < pop.size() - 2; i++) {
            T fils = calculerNouveauFils(pop);
            if (filsEstMute())
                fils = fils.calculerMutation();
            newPop.add(fils);
        }
        return newPop;
    }

    private Collection<T> deuxMeilleurIndividus(ArrayList<T> pop) {
        T meilleurIndividu1 = Collections.max(pop, Comparator.comparing(T::evaluerFitness));
        ArrayList<T> popSansMeilleur = new ArrayList<>(pop);
        popSansMeilleur.remove(meilleurIndividu1);
        T meilleurIndividu2 = Collections.max(popSansMeilleur, Comparator.comparing(T::evaluerFitness));
        return Arrays.asList(meilleurIndividu1, meilleurIndividu2);
    }

    private boolean filsEstMute() {
        return new Random().nextDouble() < probaMutation;
    }

    private T calculerNouveauFils(ArrayList<T> pop) {
        ArrayList<T> parents = selectionParents(pop);
        return parents.get(0).calculerCroisement(parents.get(1));
    }

}
