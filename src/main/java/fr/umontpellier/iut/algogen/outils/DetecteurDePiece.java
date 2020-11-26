package fr.umontpellier.iut.algogen.outils;

import java.util.Collection;
import java.util.Collections;

import fr.umontpellier.iut.algogen.Coord;
import fr.umontpellier.iut.algogen.Instance;

/**
 * <b>DetecteurDePiece est la classe permetant de faciliter la recherche de
 * pièces.</b>
 * 
 * @author @MathieuSoysal
 * @version 1.0
 */
public class DetecteurDePiece {

    private Instance instance;

    /**
     * @param instance
     */
    public DetecteurDePiece(Instance instance) {
        this.instance = instance;
    }

    /**
     * Retourne la pièce la plus proche par rapport à la {@link Coord} donnée en
     * paramètre.
     * 
     * @param coordCourante Coordonée courante
     * 
     * @return {@link Coord} de la pièce la plus proche de {@code coordCourante}.
     * 
     * @see Coord
     * @see Instance#getListeCoordPieces()
     */
    public Coord getPiecePlusProcheFrom(Coord coordCourante) {
        return getPieceNonRecolteePlusProcheFrom(coordCourante, Collections.<Coord>emptyList());
    }

    /**
     * Retourne la pièce la plus proche par rapport à la {@link Coord} donnée en
     * paramètre et vérifie quelle ne soit pas dans {@code piecesDejaRecolte}
     * 
     * @param coordCourante     Coordonée courante
     * @param piecesDejaRecolte les pièces ignorées lors de la recherche
     * 
     * @return {@link Coord} de la pièce la plus proche de {@code coordCourante}.
     * 
     * @see Coord
     * @see Instance#getListeCoordPieces()
     */
    public Coord getPieceNonRecolteePlusProcheFrom(Coord coordCourante, Collection<Coord> piecesDejaRecolte) {
        Coord piecePlusProche = null;
        int distMin = Integer.MAX_VALUE;
        for (Coord coord : instance.getListeCoordPieces()) {
            int dist = coordCourante.distanceFrom(coord);
            if (dist < distMin && !piecesDejaRecolte.contains(coord)) {
                distMin = dist;
                piecePlusProche = coord;
            }
        }
        return piecePlusProche;
    }

}
