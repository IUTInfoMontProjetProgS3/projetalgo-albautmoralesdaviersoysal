package fr.umontpellier.iut.algogen.strategies;

import java.util.ArrayList;

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
        // TODO Auto-generated method stub
        return null;
    }

}
