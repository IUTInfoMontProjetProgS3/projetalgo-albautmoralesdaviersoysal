package fr.umontpellier.iut.algogen.individus;

import java.util.ArrayList;

import fr.umontpellier.iut.algogen.Instance;

/**
 * PermutSimple est la classe représentant un encodage qui fournit une
 * ifnormation sur le positionnement des pièces dans al grille, il est généré en
 * fonction de l'ordre avec le quel on récolte les pièces.
 * 
 * @see IIndividu
 * @version 1.0
 */
public class PermutSimple extends IndividuPermut<PermutSimple> {
    public PermutSimple(Instance instance, ArrayList<Integer> p) {
        super(instance, p);
    }

    public PermutSimple(Instance instance) {
        super(instance);
    }

    /**
     * @param individu2 : Un deuxieme individu Execute le croisement entre this et i2 comme
     *           dans le texte.
     * @return un individu fils de type GDBHSimple.
     * 
     **/

    public PermutSimple calculerCroisement(PermutSimple individu2) {
        return null;
    }

    /**
     * @param indice1 : indice du premier mouvement
     * @param indice2 : indice du deuxieme mouvement faire un echange entre les valeurs
     *          des indices x y
     * 
     **/
    private void mutationAux(int indice1, int indice2) {

    }

    /**
     * Faire la mutation de this comme dans le texte.
     * 
     * @return un individu fils muté de type GDBHSimple.
     * 
     **/
    public PermutSimple calculerMutation() {
        return null;
    }

}
