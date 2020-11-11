package fr.umontpellier.iut.algogen;

import java.util.Objects;

public class Coord {
    private final int l = 0;
    private final int c = 0;

    public Coord(int nbLinge, int nbColonne) {

    }

    /**
     * @param nbLigne : nombre de lignes de la grille
     * @param nbColonne : nombre de colonnes de la grille
     * @return true si la coordonnée ne dépace pas les bordures de la grille
     * 
     **/
    public boolean estDansPlateau(int nbLigne, int nbColonne) {
        return false;
    }

    /**
     * @param coord : Coordonnée
     * @return true si this est de distance 1 de la coordonnée cd
     * 
     **/
    public boolean estADistanceUn(Coord coord) {
        return false;
    }

    /**
     * @param coord : Coordonnée
     * @return distance entre this et la coordonnée cd
     * 
     **/
    public int distanceFrom(Coord coord) {
        return 0;
    }

    public String toString() {
        return "(" + l + "," + c + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Coord coord = (Coord) o;
        return l == coord.l && c == coord.c;
    }

    @Override
    public int hashCode() {
        return Objects.hash(l, c);
    }

    public int getL() {
        // TODO Auto-generated method stub
        return 0;
    }

    public int getC() {
        // TODO Auto-generated method stub
        return 0;
    }
}