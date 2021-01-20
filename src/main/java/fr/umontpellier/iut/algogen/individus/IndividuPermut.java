package fr.umontpellier.iut.algogen.individus;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import fr.umontpellier.iut.algogen.Coord;
import fr.umontpellier.iut.algogen.Instance;
import fr.umontpellier.iut.algogen.Solution;
import fr.umontpellier.iut.algogen.outils.PetitPoucet;

/**
 * <b>IndividuPermut est la classe représentant un encodage celui-ci fournit une
 * information sur le positionnement des pièces dans la grille, il est généré en
 * fonction de l'ordre avec le quel on récolte les pièces.</b>
 * <p>
 * Un individu de type IndividuGDBH est caractérisé par les informations
 * suivantes :
 * </p>
 * <ul>
 * <li>L'instance du jeu {@code instance}.</li>
 * <li>L'ordre de récolte des pièces {@code ArrayList<Integer>}.</li>
 * </ul>
 * 
 * @see IIndividu
 * @version 1.0.4
 */
public abstract class IndividuPermut<T extends IndividuPermut<T>> implements IIndividu<T> {
    /**
     * Cet attribut représente l'instance du jeu.
     * 
     * @see IndividuPermut#IndividuPermut(Instance)
     * @see IndividuPermut#IndividuPermut(Instance, ArrayList)
     */
    protected Instance inst;

    /**
     * Cet attribut représente l'ordre de récolte des pièces. Elle contient l'index
     * des pièces.
     * 
     * @see IndividuPermut#IndividuPermut(Instance, ArrayList)
     */
    protected ArrayList<Integer> permut;

    /**
     * Constructeur IndidivuPermut.
     * 
     * @param instance : l'instance du jeu.
     * @param permut : une list des index des pièces récoltées.
     * 
     * @see Instance
     * @see #permut
     */
    public IndividuPermut(Instance instance, ArrayList<Integer> permut) {
        this.inst = instance;
        this.permut = permut;
    }

    /**
     * Constructeur IndividuPermut.
     * <p>
     * A la construction d'un individu de type IndividuPermut, la liste des index
     * des pièces récoltés est généré aléatoirement.
     * </p>
     * 
     * @param instance : L'iinstance du jeu.
     * 
     * @see Instance#getListeCoordPieces()
     * @see Instance
     * @see Collections#shuffle(java.util.List)
     */
    public IndividuPermut(Instance instance) {
        permut = new ArrayList<>();
        inst = instance;
        for (int i = 0; i < instance.getListeCoordPieces().size(); i++)
            permut.add(i);
        Collections.shuffle(permut);
    }

    /**
     * Renvoie le plus court chemin entre {@code c1} et {@code c2}
     * 
     * @param c1 : premiere coordonnée
     * @param c2 : deuxieme coordonnée
     * 
     * @return {@code ArrayList<Coord>} la liste des coordonnées emprunté par le
     *         plus court chemin
     * 
     * @see PetitPoucet#getPlusCourtChemin(Coord, Coord)
     **/
    public static ArrayList<Coord> plusCourtChemin(Coord c1, Coord c2) {
        return PetitPoucet.getPlusCourtChemin(c1, c2);
    }

    public Instance getInstance() {
        return inst;
    }

    @Override
    public String toString() {
        return permut + "";
    }

    /**
     * Génére une {@link Solution} en fonction de l'attribut permut de this.
     * 
     * @return Une {@link Solution}.
     * 
     * @see #permut
     */
    @Override
    public Solution calculerSol() {
        Solution solution = new Solution();
        Coord coordCourante = inst.getStartingP();
        solution.add(coordCourante);
        for (Integer indexPiece : permut) {
            Coord coordPiece = inst.getListeCoordPieces().get(indexPiece);
            solution.addAll(PetitPoucet.getPlusCourtChemin(coordCourante, coordPiece));
            coordCourante = coordPiece;
        }
        if (solution.size() > inst.getK() + 1)
            solution.troncker(inst.getK() + 1);
        return solution;
    }

    /**
     * La fitness d'un individu est la fonction qui prend en compte le nombre de
     * pièces récolté après le trajet.
     * 
     * @return {@code int} fitness
     */
    public int evaluerFitness() {
        return 1 + 10 * inst.evaluerSolution(calculerSol());
    }
}
