package fr.umontpellier.iut.algogen.individus;

import java.util.ArrayList;

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
 * @version 1.0
 */
public class PermutSimple extends IndividuPermut<PermutSimple> {
    public PermutSimple(Instance instance, ArrayList<Integer> permutations) {
        super(instance, permutations);
    }

    public PermutSimple(Instance instance) {
        super(instance);
    }

    /**
     * Tire au hasard deux variable x,y comprit en 0 et k-1. Prend les cases de x à
     * y de this. Puis les combines avec les cases d'individu2 non compris dans
     * l'intervalle x,y.
     * 
     * @param individu2 : Un deuxieme individu qui sera sujet au croisement
     * @return un individu fils de type {@link GDBHSimple}.
     * 
     **/
    public PermutSimple calculerCroisement(PermutSimple individu2) {
        return null;
    }

    /**
     * Permute indice1 et indice2
     * 
     * @param indice1 : indice du premier mouvement
     * @param indice2 : indice du deuxieme mouvement
     * 
     **/
    private void mutationAux(int indice1, int indice2) {

    }

    /**
     * Tire aléatoirement deux variables x,y compris entre 0 et k-1. Permute les
     * cases à l'indice x et y.
     * 
     * @return un individu fils muté de type GDBHSimple.
     * @see PermutSimple#calculerCroisement(PermutSimple)
     **/
    public PermutSimple calculerMutation() {
        return null;
    }

}
