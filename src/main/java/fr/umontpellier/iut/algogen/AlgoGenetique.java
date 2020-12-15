package fr.umontpellier.iut.algogen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import fr.umontpellier.iut.algogen.fabriques.ICreator;
import fr.umontpellier.iut.algogen.individus.IIndividu;
import fr.umontpellier.iut.algogen.strategies.CroisementMutationV1;
import fr.umontpellier.iut.algogen.strategies.StrategieCalculNextGen;

/**
 * <b>AlgoGenetique est la classe représentant un système de résolution.</b>
 * <p>
 * Une instance de AlgoGenetique est caractérisé par les informations suivantes
 * :
 * <ul>
 * <li>Une {@code Instance}.</li>
 * <li>Un {@code ICreator} createur d'individu.</li>
 * <li>Un {@code StrategieCalculNextGen}.</li>
 * </ul>
 * </p>
 * <p>
 * De plus, un AlgoGenetique est une liste d'objet qui extend {@link IIndividu}.
 * </p>
 *
 * @see IIndividu
 *
 * @version 1.0.1
 */

class AlgoGenetique<T extends IIndividu<T>> {

    private Instance inn;
    private StrategieCalculNextGen<T> utt;
    private ICreator<T> crr;

    /**
     * @param instance         : instance
     * @param calculGen        : strategie de calcul des nouvelles generations
     * @param createurIndividu : createur d'individus
     *
     */
    public AlgoGenetique(Instance instance, StrategieCalculNextGen<T> calculGen, ICreator<T> createurIndividu) {
        this.inn = instance;
        this.utt = calculGen;
        this.crr = createurIndividu;
    }

    /**
     * @param instance         : instance
     * @param createurIndividu : createur d'individus
     *
     */
    public AlgoGenetique(Instance instance, ICreator<T> createurIndividu) {
        this.inn = instance;
        utt = new CroisementMutationV1<>(0.1);
        this.crr = createurIndividu;
    }

    /**
     * Créer population initiale Lancer Strategie de calcule de nouvelles
     * generations nbGen fois
     * 
     * @param taillePop    : taille de la Population
     * @param nbGeneration : nombre de generations
     * @return retourne la meilleur solution
     *
     */
    public Solution run(int taillePop, int nbGeneration) {
        ArrayList<T> population = crr.creerPopInit(inn, taillePop);
        for (int i = 0; i < nbGeneration; i++) {
            population = utt.calculerNextGen(population);
        }
        T meilleurIndividu = Collections.max(population, Comparator.comparing(T::evaluerFitness));
        return meilleurIndividu.calculerSol();
    }

}