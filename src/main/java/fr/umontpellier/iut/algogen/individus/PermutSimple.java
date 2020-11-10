package fr.umontpellier.iut.algogen.individus;

import fr.umontpellier.iut.algogen.Instance;

import java.util.ArrayList;
import java.util.Random;

public class PermutSimple extends IndividuPermut<PermutSimple> {
    public PermutSimple(Instance in, ArrayList<Integer> p) {
        super(in, p);
    }

    public PermutSimple(Instance in) {
        super(in);
    }

    /**
     * @param i2 : Un deuxieme individu
     * Execute le croisement entre this et i2 comme dans le texte.
     * @return un individu fils de type GDBHSimple.
     * 
    **/

    public PermutSimple calculerCroisement(PermutSimple i2) {
	return null;
    }

    /**
     * @param x : indice du premier mouvement
     * @param y : indice du deuxieme mouvement
     * faire un echange entre les valeurs des indices x y
     * 
    **/
    private void mutationAux(int x, int y) {
      
    }
/**
    * Faire la mutation de this comme dans le texte.
    * @return un individu fils muté de type GDBHSimple.
    * 
   **/
    public PermutSimple calculerMutation() {
       return null;
    }


}
