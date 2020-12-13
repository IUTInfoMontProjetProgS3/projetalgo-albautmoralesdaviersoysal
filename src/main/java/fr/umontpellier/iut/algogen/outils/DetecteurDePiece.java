package fr.umontpellier.iut.algogen.outils;

import java.util.Collection;

import fr.umontpellier.iut.algogen.Coord;

/**
 * <b>DetecteurDePiece est la classe utilitaire permetant de recherche de
 * pièces.</b>
 * 
 * @author @MathieuSoysal
 * @version 2.0
 */
public class DetecteurDePiece {

    private DetecteurDePiece() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Retourne la pièce la plus proche par rapport à {@link Coord} donnée en
     * paramètre, la pièce est choisie parmis les pièces données en paramètre
     * {@code piecesDejaRecolte}
     * 
     * @param coordCourante : Coordonée courante
     * @param pieces        : Coordonnées des pièces
     * 
     * @return {@link Coord} de la pièce la plus proche de {@code coordCourante}.
     * 
     * @see Coord
     */
    public static Coord getPiecePlusProcheFrom(Coord coordCourante, Collection<Coord> pieces) {
        Coord piecePlusProche = null;
        int distMin = Integer.MAX_VALUE;
        for (Coord coord : pieces) {
            int dist = coordCourante.distanceFrom(coord);
            if (dist < distMin) {
                distMin = dist;
                piecePlusProche = coord;
            }
        }
        return piecePlusProche;
    }

}
