package fr.umontpellier.iut.algogen.individus;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;

import fr.umontpellier.iut.algogen.Instance;

/**
 * <b>PermutSimple est la classe représentant un encodage qui fournit une
 * information sur le positionnement des pièces dans la grille, il est généré en
 * fonction de l'ordre avec le quel on récolte les pièces.</b>
 * <p>
 * Un individu PermutSimple est caractérisé par les informations suivantes :
 * <ul>
 * <li>L'instance du jeu {@code instance}.</li>
 * <li>le trajet de l'individu {@code permutations}.</li>
 * </ul>
 * </p>
 * 
 * @see IIndividu
 * @version 1.0.1
 */
public class PermutSimple extends IndividuPermut<PermutSimple> {
    public PermutSimple(Instance instance, ArrayList<Integer> permutations) {
        super(instance, permutations);
    }

    public PermutSimple(Instance instance) {
        super(instance);
    }

    /**
     * Tire au hasard deux variables x,y comprit en 0 et k-1. Prend les cases de x à
     * y de this. Puis les combines avec les cases d'individu2 non compris dans
     * l'intervalle x,y.
     * 
     * @param individu2 : Un deuxieme individu qui sera sujet au croisement
     * @return un individu fils de type {@link GDBHSimple}.
     * 
     **/
    public PermutSimple calculerCroisement(PermutSimple individu2) {
        ArrayList<Integer> sortedSet = new ArrayList<>(permut.subList(0, indexRandom()));
        for (Integer integer : individu2.permut)
            if (!sortedSet.contains(integer))
                sortedSet.add(integer);
        // TODO l'ordre est-il bon ?
        return new PermutSimple(instance, new ArrayList<>(sortedSet));
    }

    /**
     * Permute index1 et index2
     * 
     * @param index1 : index du premier mouvement
     * @param index2 : index du deuxieme mouvement
     * 
     **/
    private void mutationAux(int index1, int index2) {
        Collections.swap(permut, index1, index2);
    }

    /**
     * Tire aléatoirement deux variables x,y . Permute les cases à l'indice x et y.
     * 
     * @return un individu fils muté de type GDBHSimple.
     * 
     * @since 1.0.1
     **/
    public PermutSimple calculerMutation() {
        ArrayList<Integer> permutMute = new ArrayList<>(permut);
        Collections.swap(permutMute, indexRandom(), indexRandom());
        return new PermutSimple(instance, permutMute);
    }

    private int indexRandom() {
        return new SecureRandom().nextInt(permut.size());
    }
}
