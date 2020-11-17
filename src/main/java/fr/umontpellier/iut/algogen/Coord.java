package fr.umontpellier.iut.algogen;

import java.util.Objects;

/**
 * <b>Coord est la classe représentant une coordonnée sur le plateau de jeu.</b>
 * <p>
 * Une instance du Coord est caractérisé par les informations suivantes :
 * <ul>
 * <li>Un numéro de ligne qui indique sur quelle ligne il se trouve. </li>
 * <li>Un numéro de colonne qui indique sur quelle colonne il se trouve. </li>
 * </ul>
 * </p>
 * 
 * @version 1.0.4
 * 
 * @author @MathieuSoysal 
 * @author @bastian-albaut
 */
public class Coord {

    /**
     * La ligne sur laquelle se trouve this.
     * 
     * @see Coord#Coord(int, int)
     * @see Coord#getL()
     */
    private final int indexLigne;

    /**
     * La colonne sur laquelle se trouve this.
     * 
     * @see Coord#Coord(int, int)
     * @see Coord#getC()
     */
    private final int indexColonne;

    public Coord(int indexLigne, int indexColonne) {
        this.indexLigne = indexLigne;
        this.indexColonne = indexColonne;
    }

    /**
     * Vérifie si this peut être dans une grille avec {@code nbLigne} et
     * {@code nbColonne}.
     * 
     * @param nbLigne   : nombre de lignes de la grille
     * @param nbColonne : nombre de colonnes de la grille
     * @return {@code true} si la coordonnée ne dépace pas les bordures de la grille
     * 
     **/
    public boolean estDansPlateau(int nbLigne, int nbColonne) {
        return indexColonne < nbColonne && indexLigne < nbLigne && nbLigne >= 0 && nbColonne >= 0 && indexColonne >= 0
                && indexLigne >= 0;
    }

    /**
     * Vérifie si la {@code Coord} donné en paramétre est adjacent à this.
     * 
     * @param coordCible : Coordonnée dont on va vérifié la distance
     * @return {@code true} si this est de distance 1 de la coordonnée coord
     * 
     **/
    public boolean estADistanceUn(Coord coordCible) {
        return distanceFrom(coordCible) == 1;
    }

    /**
     * Renvoi la distance entre this et {@code coordCible} donné en paramètre
     * 
     * @param coordCible : Coordonnée ciblé
     * @return {@code int} distance entre this et la coordonnée ciblé
     *         {@code coordCible}
     * 
     **/
    public int distanceFrom(Coord coordCible) {
        int coordLigne = coordCible.getL();
        int coordColonne = coordCible.getC();
        return Math.abs(indexLigne - coordLigne) + Math.abs(indexColonne - coordColonne);
    }

    public String toString() {
        return "(" + indexLigne + "," + indexColonne + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Coord coord = (Coord) o;
        return indexLigne == coord.indexLigne && indexColonne == coord.indexColonne;
    }

    @Override
    public int hashCode() {
        return Objects.hash(indexLigne, indexColonne);
    }

    /**
     * Retourne le numéro de ligne de this.
     * 
     * @return un {@code int} qui correspond au numéro de ligne de this.
     * 
     * @see Coord#indexLigne
     */
    public int getL() {
        return indexLigne;
    }

    /**
     * Retourne le numéro de colonne de this.
     * 
     * @return un {@code int} qui correspond au numéro de colonne de this.
     * 
     * @see Coord#indexColonne
     */
    public int getC() {
        return indexColonne;
    }
}