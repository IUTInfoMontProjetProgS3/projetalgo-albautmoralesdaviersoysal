package fr.umontpellier.iut.algogen;

import java.util.ArrayList;

import fr.umontpellier.iut.algogen.fabriques.ICreator;
import fr.umontpellier.iut.algogen.individus.IIndividu;
import fr.umontpellier.iut.algogen.strategies.StrategieCalculNextGen;

class AlgoGenetique<T extends IIndividu<T>> {

    /**
     * @param instance : instance ,
     * @param calculGen : strategie de calcul des nouvelles generations
     * @param createurIndividu : createur d'individus
     *
     */
    public AlgoGenetique(Instance instance, StrategieCalculNextGen<T> calculGen, ICreator<T> createurIndividu) {

    }

    /**
     * @param instance : instance ,
     * @param createurIndividu : createur d'individus
     *
     */
    public AlgoGenetique(Instance instance, ICreator<T> createurIndividu) {

    }

    /**
     * @param taillePop : taille de la Population ,
     * @param nbGeneration     : nombre de generations Créer population initiale Lancer
     *                  Strategie de calcule de nouvelles generations nbGen fois
     * @return retourne la meilleur solution
     *
     */

    public Solution run(int taillePop, int nbGeneration) {
        return null;
    }

}