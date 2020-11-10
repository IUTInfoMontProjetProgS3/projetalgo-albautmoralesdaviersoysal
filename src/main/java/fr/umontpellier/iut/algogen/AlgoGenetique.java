package fr.umontpellier.iut.algogen;

import fr.umontpellier.iut.algogen.fabriques.ICreator;
import fr.umontpellier.iut.algogen.individus.IIndividu;
import fr.umontpellier.iut.algogen.strategies.StrategieCalculNextGen;

class AlgoGenetique<T extends IIndividu<T>> {

    /**
     * @param inn : instance ,
     * @param utt : strategie de caclcul des nouvelles generations
     * @param crr : createur d'individus
     *
     */
    public AlgoGenetique(Instance inn, StrategieCalculNextGen<T> utt, ICreator<T> crr) {

    }

    /**
     * @param inn : instance ,
     * @param crr : createur d'individus
     *
     */
    public AlgoGenetique(Instance inn, ICreator<T> crr) {

    }

    /**
     * @param taillePop : taille de la Population ,
     * @param nbGen     : nombre de generations Créer population initiale Lancer
     *                  Strategie de calcule de nouvelles generations nbGen fois
     * @return retourne la meilleur solution
     *
     */

    public Solution run(int taillePop, int nbGen) {
        return null;
    }

}