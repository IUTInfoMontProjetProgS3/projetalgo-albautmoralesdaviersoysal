package fr.umontpellier.iut.algogen.strategies;

import java.util.ArrayList;

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
    }

    /**
     * @param pop : Une population
     * @return une nouvelle generation qui contient les meilleurs individu de pop
     *         ainsi que des individu fils.
     * 
     **/
    @Override
    public ArrayList<T> calculerNextGen(ArrayList<T> pop) {

        return null;
    }

}
