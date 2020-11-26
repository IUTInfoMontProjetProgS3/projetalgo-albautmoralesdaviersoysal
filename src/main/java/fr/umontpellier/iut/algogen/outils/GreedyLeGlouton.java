package fr.umontpellier.iut.algogen.outils;

import java.util.HashSet;

import fr.umontpellier.iut.algogen.Coord;
import fr.umontpellier.iut.algogen.Instance;
import fr.umontpellier.iut.algogen.Solution;

/**
 * <b>GreedyLeGlouton est la classe représentant un algo de résolution.</b>
 * <p>
 * Une instance GreedyLeGlouton est caractérisé par les informations suivantes :
 * <ul>
 * <li>Une {@link Instance} pour l'instance du jeu.</li>
 * <li>Un une liste des pièces récolté.</li>
 * </ul>
 * </p>
 * 
 * @author @MathieuSoysal
 * @version 1.0
 */
public class GreedyLeGlouton {

    /**
     * L'instance du jeu où l'algorithme GreedyLeGlouton doit être effectué. Cet
     * attribut n'est pas modifiable.
     * 
     * @see GreedyLeGlouton#GreedyLeGlouton(Instance)
     * @see GreedyLeGlouton#getPiecePlusProcheFrom(Coord)
     * @see GreedyLeGlouton#greedySolver()
     */
    private Instance instance;

    /**
     * La liste des pièces récoltées.
     * 
     * @see GreedyLeGlouton#GreedyLeGlouton(Instance)
     * @see GreedyLeGlouton#greedySolver()
     * @see GreedyLeGlouton#getPiecePlusProcheFrom(Coord)
     */
    private HashSet<Coord> piecesRecolte;

    /**
     * @param instance
     */
    public GreedyLeGlouton(Instance instance) {
        piecesRecolte = new HashSet<>();
        this.instance = instance;
    }

    /**
     * Retourne la {@link Solution} trouvé par l'algorithme glouton.
     * 
     * @return {@link Solution} une solution du jeu.
     * 
     * @see Solution
     * @see Instance
     */
    public Solution greedySolver() {
        if (instance.getListeCoordPieces().isEmpty())
            return new Solution();
        Solution solution = new Solution();
        solution.add(instance.getStartingP());
        Coord coordCourante = instance.getStartingP();
        while (solution.size() < instance.getK() + 1) {
            Coord piece = getPiecePlusProcheFrom(coordCourante);
            piecesRecolte.add(piece);
            if (piece == null)
                solution.addAll(comblerKPasRestant(coordCourante, instance.getK() + 1 - solution.size()));
            else
                solution.addAll(PetitPoucet.getPlusCourtChemin(coordCourante, piece));
            coordCourante = piece;
        }
        if (solution.size() > instance.getK() + 1)
            tronckerSolution(solution);
        piecesRecolte.clear();
        return solution;
    }

    private void tronckerSolution(Solution solution) {
        Solution solutionTronck = new Solution();
        solutionTronck.addAll(solution.subList(0, instance.getK() + 1));
        solution.clear();
        solution.addAll(solutionTronck);
    }

    private Solution comblerKPasRestant(Coord coordCourante, int pasRestant) {
        Solution solutionComble = new Solution();
        boolean phase1 = false;
        Coord prochaineCoord = Direction.getCoordAdjacentValide(coordCourante, instance);
        while (pasRestant-- != 0) {
            if (phase1)
                solutionComble.add(prochaineCoord);
            else
                solutionComble.add(coordCourante);
            phase1 = !phase1;
        }
        return solutionComble;
    }

    /**
     * Retourne les pièces les plus proche par rapport à la {@link Coord} donnée en
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
        Coord piecePlusProche = null;
        int distMin = Integer.MAX_VALUE;
        for (Coord coord : instance.getListeCoordPieces()) {
            int dist = coordCourante.distanceFrom(coord);
            if (dist < distMin && !piecesRecolte.contains(coord)) {
                distMin = dist;
                piecePlusProche = coord;
            }
        }
        return piecePlusProche;
    }
}
