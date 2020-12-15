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
 * </p>
 * <ul>
 * <li>L'instance du jeu {@code instance}.</li>
 * <li>L'ordre de récolte des pièces {@code permutations}.</li>
 * </ul>
 * 
 * @see IIndividu
 * @version 1.0.3
 */
public class PermutSimple extends IndividuPermut<PermutSimple> {
    public PermutSimple(Instance instance, ArrayList<Integer> permutations) {
        super(instance, permutations);
    }

    public PermutSimple(Instance instance) {
        super(instance);
    }

    /**
     * Tire au hasard deux variables d,f comprit en 0 et k-1. Prend les cases de d f
     * y de this. Puis les combines avec les cases d'individu2 non compris dans
     * l'intervalle d,f.
     * 
     * @param individu2 : Un deuxieme individu qui sera sujet au croisement
     * @return un individu fils de type {@link GDBHSimple}.
     * 
     **/
    public PermutSimple calculerCroisement(PermutSimple individu2) {
        ArrayList<Integer> permutCroise = partitionAleatoire();
        fusion(permutCroise, individu2.permut);
        return new PermutSimple(inst, new ArrayList<>(permutCroise));
    }

    private void fusion(ArrayList<Integer> permutCroise, ArrayList<Integer> permutParent) {
        for (Integer integer : permutParent)
            if (!permutCroise.contains(integer))
                permutCroise.add(integer);
    }

    private ArrayList<Integer> partitionAleatoire() {
        int d = indexRandom();
        int f = indexRandom();
        return new ArrayList<>(permut.subList(Math.min(d, f), Math.max(d, f) + 1));
    }

    /**
     * Permute index1 et index2
     * 
     * @param index1 : indice du premier mouvement
     * @param index2 : indice du deuxieme mouvement
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
        PermutSimple individuMute = new PermutSimple(inst, new ArrayList<>(permut));
        individuMute.mutationAux(indexRandom(), indexRandom());
        return individuMute;
    }

    private int indexRandom() {
        return new SecureRandom().nextInt(permut.size());
    }
}
