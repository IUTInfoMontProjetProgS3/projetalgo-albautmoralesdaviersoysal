package fr.umontpellier.iut.algogen.outils;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.SecureRandom;

import fr.umontpellier.iut.algogen.Coord;
import fr.umontpellier.iut.algogen.Instance;

/**
 * <b>Direction est la classe qui regroupe tous les outils concernant les
 * directions.</b>
 * 
 * @author @MathieuSoysal
 * @version 1.2.0
 */
public class Direction {

    private Direction() {
        throw new IllegalStateException("Utility class");
    }

    public static final char DROITE = 'd';
    public static final char GAUCHE = 'g';
    public static final char HAUT = 'h';
    public static final char BAS = 'b';
    public static final char[] DIRECTIONS = new char[] { DROITE, GAUCHE, BAS, HAUT };

    public static Coord getCoordAdjacentValide(Coord coordActuelle, Instance instance) {
        int nbLigne = instance.getNbL();
        int nbColonne = instance.getNbC();
        int i = 0;
        Coord coordAdjacent = null;
        do {
            coordAdjacent = calculerProchaineCoord(coordActuelle, DIRECTIONS[i]);
            i++;
        } while (!coordAdjacent.estDansPlateau(nbLigne, nbColonne));
        return coordAdjacent;
    }

    public static Coord calculerProchaineCoord(Coord coordActuelle, char direction) {
        int prochaineLigne = coordActuelle.getL();
        int prochaineColonne = coordActuelle.getC();
        switch (direction) {
            case HAUT:
                prochaineLigne--;
                break;
            case BAS:
                prochaineLigne++;
                break;
            case GAUCHE:
                prochaineColonne--;
                break;
            case DROITE:
                prochaineColonne++;
                break;
            default:
                break;
        }
        return new Coord(prochaineLigne, prochaineColonne);
    }

    public static char directionRandom() {
        return DIRECTIONS[new SecureRandom().nextInt(DIRECTIONS.length)];
    }

    public static char trouverDirectionEmprunte(Coord coordDepart, Coord coordArrivee) {
        int ecartColonne = coordDepart.getC() - coordArrivee.getC();
        int ecartLigne = coordDepart.getL() - coordArrivee.getL();
        if (ecartColonne > 0)
            return 'g';
        if (ecartColonne < 0)
            return 'd';
        if (ecartLigne > 0)
            return 'h';
        if (ecartLigne < 0)
            return 'b';
        throw new ArithmeticException();
    }

    public static char inverse(char direction) {
        switch (direction) {
            case HAUT:
                return BAS;
            case BAS:
                return HAUT;
            case DROITE:
                return GAUCHE;
            case GAUCHE:
                return DROITE;
            default:
                throw new InvalidParameterException();
    }
}
