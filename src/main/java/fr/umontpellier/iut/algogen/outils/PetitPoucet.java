package fr.umontpellier.iut.algogen.outils;

import fr.umontpellier.iut.algogen.Coord;
import fr.umontpellier.iut.algogen.Solution;

/**
 * <b>PetitPoucet est la classe utilitaire permetant de retrouver le plus court
 * chemin entre deux {@link Coord}.</b>
 * 
 * @author @MathieuSoysal
 * @version 1.0
 */
public class PetitPoucet {

    private PetitPoucet() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Retourne le chemin le plus court entre coordDepart et coordArrivee.
     * 
     * @param coordDepart
     * @param coordArrivee
     * 
     * @return {@link Solution} le chemin le plus cours.
     */
    public static Solution getPlusCourtChemin(Coord coordDepart, Coord coordArrivee) {
        Solution solution = new Solution();
        if (coordDepart.estADistanceUn(coordArrivee)) {
            solution.add(coordArrivee);
            return solution;
        }
        if (coordDepart.getL() != coordArrivee.getL())
            solution.addAll(getCheminPourObtenirMemeLigne(coordDepart, coordArrivee.getL()));
        if (coordDepart.getC() != coordArrivee.getC())
            solution.addAll(getCheminPourObtenirMemeColonne(new Coord(coordArrivee.getL(), coordDepart.getC()),
                    coordArrivee.getC()));
        return solution;
    }

    private static Solution getCheminPourObtenirMemeColonne(Coord coordDepart, int colonneArrivee) {
        Solution solution = new Solution();
        int ligneDepart = coordDepart.getL();
        int colonneDepart = coordDepart.getC();
        if (colonneDepart < colonneArrivee)
            while (colonneDepart < colonneArrivee)
                solution.add(new Coord(ligneDepart, ++colonneDepart));
        else
            while (colonneDepart > colonneArrivee)
                solution.add(new Coord(ligneDepart, --colonneDepart));
        return solution;
    }

    private static Solution getCheminPourObtenirMemeLigne(Coord coordDepart, int ligneArrivee) {
        Solution solution = new Solution();
        int ligneDepart = coordDepart.getL();
        int colonneDepart = coordDepart.getC();
        if (ligneDepart < ligneArrivee)
            while (ligneDepart < ligneArrivee)
                solution.add(new Coord(++ligneDepart, colonneDepart));
        else
            while (ligneDepart > ligneArrivee)
                solution.add(new Coord(--ligneDepart, colonneDepart));
        return solution;
    }
}
