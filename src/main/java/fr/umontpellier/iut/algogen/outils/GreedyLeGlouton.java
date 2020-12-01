package fr.umontpellier.iut.algogen.outils;

import java.util.ArrayList;
import java.util.HashSet;

import fr.umontpellier.iut.algogen.Coord;
import fr.umontpellier.iut.algogen.Instance;
import fr.umontpellier.iut.algogen.Solution;

/**
 * <b>GreedyLeGlouton est la classe permetant de trouver la {@link Solution}
 * d'une {@link Instance} en suivant une approche greedy.</b>
 * <p>
 * Une instance GreedyLeGlouton est caractérisé par les informations suivantes :
 * <ul>
 * <li>Une {@link Instance} pour l'instance du jeu.</li>
 * <li>Un une liste des pièces récolté.</li>
 * </ul>
 * </p>
 * 
 * @author @MathieuSoysal
 * @version 1.1.0
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
     * @param instance
     */
    public GreedyLeGlouton(Instance instance) {
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
        HashSet<Coord> piecesEnJeu = new HashSet<>(instance.getListeCoordPieces());
        if (instance.getListeCoordPieces().isEmpty())
            return new Solution();
        Solution solution = new Solution();
        solution.add(instance.getStartingP());
        Coord coordCourante = instance.getStartingP();
        while (solution.size() < instance.getK() + 1) {
            Coord piece = DetecteurDePiece.getPiecePlusProcheFrom(coordCourante, piecesEnJeu);
            piecesEnJeu.remove(piece);
            if (piece == null)
                solution.addAll(comblerKPasRestant(coordCourante, instance.getK() + 1 - solution.size()));
            else
                solution.addAll(PetitPoucet.getPlusCourtChemin(coordCourante, piece));
            coordCourante = piece;
        }
        if (solution.size() > instance.getK() + 1)
            solution.troncker(instance.getK() + 1);
        return solution;
    }

    public ArrayList<Integer> greedyPermut() {
        ArrayList<Integer> result = new ArrayList<>();
        HashSet<Coord> piecesEnJeu = new HashSet<>(instance.getListeCoordPieces());
        Coord coordCourante = instance.getStartingP();
        while (!piecesEnJeu.isEmpty()) {
            Coord piecePlusProche = DetecteurDePiece.getPiecePlusProcheFrom(coordCourante, piecesEnJeu);
            piecesEnJeu.remove(piecePlusProche);
            result.add(instance.getListeCoordPieces().indexOf(piecePlusProche));
            coordCourante = piecePlusProche;
        }
        return result;
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
}
