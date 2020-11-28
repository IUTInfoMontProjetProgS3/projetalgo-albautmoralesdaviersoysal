package fr.umontpellier.iut.algogen.individus;

import java.util.ArrayList;

import fr.umontpellier.iut.algogen.Coord;
import fr.umontpellier.iut.algogen.Instance;
import fr.umontpellier.iut.algogen.Solution;

/**
 * <b>IndividuPermut est la classe représentant un encodage celui-ci fournit une
 * information sur le positionnement des pièces dans la grille, il est généré en
 * fonction de l'ordre avec le quel on récolte les pièces.</b>
 * <p>
 * Un individu de type IndividuGDBH est caractérisé par les informations
 * suivantes :
 * <ul>
 * <li>L'instance du jeu {@code instance}.</li>
 * <li>Un premut {@code ArrayList<Integer>}.</li>
 * </ul>
 * </p>
 * 
 * @see IIndividu
 * @version 1.0
 */
public abstract class IndividuPermut<T extends IndividuPermut<T>> implements IIndividu<T> {

    /**
     * Cet attribut représente l'instance du jeu.
     * 
     * @see IndividuPermut#IndividuPermut(Instance)
     * @see IndividuPermut#IndividuPermut(Instance, ArrayList)
     */
    protected Instance instance;

    /**
     * Cet attribut représente : TODO: Qu'est-ce quelle représente
     * 
     * @see IndividuPermut#IndividuPermut(Instance, ArrayList)
     */
    protected ArrayList<Integer> permut;

    public IndividuPermut(Instance instance, ArrayList<Integer> p) {

    }

    public IndividuPermut(Instance instance) {

    }

    /**
     * Renvoie le plus court chemin entre {@code c1} et {@code c2}
     * 
     * @param c1 : premiere coordonnée
     * @param c2 : deuxieme coordonnée
     * @return {@code ArrayList<Coord>} la liste des coordonnées emprunté par le
     *         plus court chemin
     * 
     **/
    public static ArrayList<Coord> plusCourtChemin(Coord c1, Coord c2) {
        return null;
    }

    public Instance getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return permut + "";
    }

    @Override
    public Solution calculerSol() {
        return new Solution();
    }

    public int evaluerFitness() {
        return 0;
    }

}
