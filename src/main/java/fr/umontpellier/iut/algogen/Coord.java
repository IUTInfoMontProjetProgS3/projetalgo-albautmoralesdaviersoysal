package fr.umontpellier.iut.algogen;

import java.util.Objects;

/**
 * <b>Coord est la classe représentant une coordonnée sur le plateau de jeu.</b>
 * <p>
 * Une instance du Coord est caractérisé par les informations suivantes :
 * <ul>
 * <li>Un numéro de ligne qui indique sur quelle ligne il se trouve.</li>
 * <li>Un numéro de colonne qui indique sur quelle colonne il se trouve.li>
 * </ul>
 * </p>
 * 
 * @version 1.0
 */
public class Coord {
    private final int ligne = 0;
    private final int colonne = 0;

    public Coord(int ligne, int colonne) {

    }

    /**
     * Vérifie si this peut être dans une grille avec {@code nbLigne} et {@code nbColonne}.
     * 
     * @param nbLigne : nombre de lignes de la grille
     * @param nbColonne : nombre de colonnes de la grille
     * @return true si la coordonnée ne dépace pas les bordures de la grille
     * 
     **/
    public boolean estDansPlateau(int nbLigne, int nbColonne) {
        return false;
    }

    /**
     * Vérifie si la {@code Coord} donné en paramétre est adjacent à this.
     * 
     * @param coordCible : Coordonnée dont on va vérifié la distance
     * @return {@code true} si this est de distance 1 de la coordonnée coord
     * 
     **/
    public boolean estADistanceUn(Coord coordCible) {
        return false;
    }


    /**
     * Renvoi la distance entre this et {@code coordCible} donné en paramètre
     * 
     * @param coordCible : Coordonnée ciblé
     * @return {@code int} distance entre this et la coordonnée ciblé {@code coordCible}
     * 
     **/
    public int distanceFrom(Coord coordCible) {
        return 0;
    }

    public String toString() {
        return "(" + ligne + "," + colonne + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Coord coord = (Coord) o;
        return ligne == coord.ligne && colonne == coord.colonne;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ligne, colonne);
    }

    /**
     * Retourne le numéro de ligne de this.
     * 
     * @return un {@code int} qui correspond au numéro de ligne de this.
     * 
     * @see Coord#ligne
     */
    public int getL() {
        // TODO Auto-generated method stub
        return 0;
    }


    /**
     * Retourne le numéro de colonne de this.
     * 
     * @return un {@code int} qui correspond au numéro de colonne de this.
     * 
     * @see Coord#colonne
     */
    public int getC() {
        // TODO Auto-generated method stub
        return 0;
    }
}