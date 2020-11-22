package fr.umontpellier.iut.algogen.strategies;

import java.util.ArrayList;
import java.util.Random;

import fr.umontpellier.iut.algogen.individus.IIndividu;

/**
 * StrategieCalculNextGen est la classe qui permet de récupérer la nouvelle
 * génération en fonction de la population initial et en suivant trois étapes
 * principales (Sélection, Mutation, Croisement).
 * <p>
 * De plus StrategieCalculNextGen est par généricité une liste d'objet qui extends {@link IIndividu}. 
 * </p>
 * 
 * @see IIndividu
 * @version 1.0
 */
public abstract class StrategieCalculNextGen<T extends IIndividu<T>> {

   /**
    * @param pop : Une population
    * @return un individu selectinné par roullette.
    * 
    *         Example : supposons que pop.size()==3, avec S = 6, et
    *         pop.get(0).evaluerFitness() == 2 (l'individu 0 a une fitness de 2)
    *         pop.get(1).evaluerFitness() == 3 (l'individu 1 a une fitness de 3)
    *         pop.get(2).evaluerFitness() == 1 (l'individu 2 a une fitness de 1)
    *         dans ce cas, on tire un entier r dans [0,6-1] (=[0,5]), puis :
    * 
    *         si r est dans {0,1} , on selectionne l'individu 0
    * 
    *         si r est dans {2,3,4} on selectionne l'individu 1
    * 
    *         si r est dans {5}, on selectionne l'individu 2
    * 
    **/
   protected T selectionRoulette(ArrayList<T> pop) {
      int s=0;
      Random random = new Random();

      // Calcul de de la somme S
      for (T t : pop) {
         s += t.evaluerFitness();
      }

      // Tirage de r dans [0;s-1]
      int r = random.nextInt(s);

      // Sélectionne l'individu
      s=0;
      for (T t : pop) {
         s += t.evaluerFitness();
         if (s > r) {
            return t;
         }
      }
      return pop.get(pop.size()-1);
   }

   /**
    * @param pop : Une population
    * @return deux individus parents selectinnés par roulette.
    * 
    **/
   public ArrayList<T> selectionParents(ArrayList<T> pop) {
      ArrayList<T> pop1 = new ArrayList<T>(pop);
      ArrayList<T> parents = new ArrayList<>();

      parents.add(selectionRoulette(pop));
      pop1.remove(parents.get(0));
      parents.add(selectionRoulette(pop1));

      return parents;
   }

   public abstract ArrayList<T> calculerNextGen(ArrayList<T> pop);
}
