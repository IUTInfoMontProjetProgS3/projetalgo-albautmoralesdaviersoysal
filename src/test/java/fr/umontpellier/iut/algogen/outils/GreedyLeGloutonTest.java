package fr.umontpellier.iut.algogen.outils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import fr.umontpellier.iut.algogen.Coord;
import fr.umontpellier.iut.algogen.Instance;
import fr.umontpellier.iut.algogen.Solution;
import jdk.jfr.Name;

class GreedyLeGloutonTest {

    @Test
    void testGreedySolver_solutionValide() throws Exception {
        boolean[][] plateau = new boolean[][] { // Disposition des pièces :
                { false, true, false, false, false }, // l0: . o . . .
                { false, true, true, false, false }, // ,l1: . o o . .
                { false, false, true, true, false }, // ,l2: . . o o .
                { false, false, false, true, true }, // ,l3: . . . o o
                { false, false, false, false, true } // ,l4: . . . . o
        };
        Coord coordDepart = new Coord(0, 0);
        int k = 8;
        Instance instance = new Instance(plateau, coordDepart, k);
        GreedyLeGlouton greedyLeGlouton = new GreedyLeGlouton(instance);
        assertTrue(instance.estValide(greedyLeGlouton.greedySolver()));
    }

    @Test
    void testGreedySolver_verrifieSiBonneSolution_avecUnePieceSurLaCaseDeDepart() throws Exception {
        boolean[][] plateau = new boolean[][] { // Disposition des pièces :
                { true, false, false, false, true }, // ,,,l0: o . . . o
                { false, false, false, false, false }, // ,l1: . . . . .
                { false, false, false, false, false }, // ,l2: . . . . .
                { false, false, false, false, false }, // ,l3: . . . . .
                { false, false, false, false, false } // ,,l4: . . . . .
        };
        Coord coordDepart = new Coord(0, 0);
        int k = 4;
        Instance instance = new Instance(plateau, coordDepart, k);
        GreedyLeGlouton greedyLeGlouton = new GreedyLeGlouton(instance);
        Solution resultaAttendu = new Solution();
        // resultat attendu :
        // l0: x x x x x
        // l1: . . . . .
        // l2: . . . . .
        // l3: . . . . .
        // l4: . . . . .
        resultaAttendu.add(new Coord(0, 0));
        resultaAttendu.add(new Coord(0, 1));
        resultaAttendu.add(new Coord(0, 2));
        resultaAttendu.add(new Coord(0, 3));
        resultaAttendu.add(new Coord(0, 4));
        assertEquals(resultaAttendu, greedyLeGlouton.greedySolver());
    }

    @Test
    void testGreedySolver() throws Exception {
        boolean[][] plateau = new boolean[][] { // Disposition des pièces :
                { false, true, false, false, false }, // l0: . o . . .
                { false, true, true, false, false }, // ,l1: . o o . .
                { false, false, true, true, false }, // ,l2: . . o o .
                { false, false, false, true, true }, // ,l3: . . . o o
                { false, false, false, false, true } // ,l4: . . . . o
        };
        Coord coordDepart = new Coord(0, 0);
        int k = 8;
        Instance instance = new Instance(plateau, coordDepart, k);
        GreedyLeGlouton greedyLeGlouton = new GreedyLeGlouton(instance);
        Solution resultaAttendu = new Solution();
        // resultat attendu :
        // l0: x x . . .
        // l1: . x x . .
        // l2: . . x x .
        // l3: . . . x x
        // l4: . . . . x
        resultaAttendu.add(new Coord(0, 0));
        resultaAttendu.add(new Coord(0, 1));
        resultaAttendu.add(new Coord(1, 1));
        resultaAttendu.add(new Coord(1, 2));
        resultaAttendu.add(new Coord(2, 2));
        resultaAttendu.add(new Coord(2, 3));
        resultaAttendu.add(new Coord(3, 3));
        resultaAttendu.add(new Coord(3, 4));
        resultaAttendu.add(new Coord(4, 4));
        assertEquals(resultaAttendu, greedyLeGlouton.greedySolver());
    }

    @Name("Test du cas où la class doit ignorer les cases où la pièce a été récolté")
    @Test
    void testGreedySolver_casSpecial() throws Exception {
        boolean[][] plateau = new boolean[][] { // Disposition des pièces :
                { false, false, true, true, true }, // ,,,l0: . . o o o
                { false, false, false, false, false }, // l1: . . . . .
                { false, false, false, false, false }, // l2: . . . . .
                { false, false, false, false, false }, // l3: . . . . .
                { false, false, false, false, true } // ,,l4: . . . . o
        };
        Coord coordDepart = new Coord(0, 0);
        int k = 8;
        Instance instance = new Instance(plateau, coordDepart, k);
        GreedyLeGlouton greedyLeGlouton = new GreedyLeGlouton(instance);
        Solution resultaAttendu = new Solution();
        // resultat attendu :
        // l0: x x x x x
        // l1: . . . . x
        // l2: . . . . x
        // l3: . . . . x
        // l4: . . . . x
        resultaAttendu.add(new Coord(0, 0));
        resultaAttendu.add(new Coord(0, 1));
        resultaAttendu.add(new Coord(0, 2));
        resultaAttendu.add(new Coord(0, 3));
        resultaAttendu.add(new Coord(0, 4));
        resultaAttendu.add(new Coord(1, 4));
        resultaAttendu.add(new Coord(2, 4));
        resultaAttendu.add(new Coord(3, 4));
        resultaAttendu.add(new Coord(4, 4));
        assertEquals(resultaAttendu, greedyLeGlouton.greedySolver());
    }

    @Name("Test du cas où il a des k pas restant")
    @Test
    void testGreedySolver_KTropEleve() throws Exception {
        boolean[][] plateau = new boolean[][] { // Disposition des pièces :
                { false, false, true, true, true }, // ,,,l0: . . o o o
                { false, false, false, false, false }, // l1: . . . . .
                { false, false, false, false, false }, // l2: . . . . .
                { false, false, false, false, false }, // l3: . . . . .
                { false, false, false, false, false } // ,,l4: . . . . .
        };
        Coord coordDepart = new Coord(0, 0);
        int k = 8;
        Instance instance = new Instance(plateau, coordDepart, k);
        GreedyLeGlouton greedyLeGlouton = new GreedyLeGlouton(instance);
        assertTrue(instance.estValide(greedyLeGlouton.greedySolver()));
    }

    @Test
    void testGreedySolver_KPasInsufisant() throws Exception {
        boolean[][] plateau = new boolean[][] { // Disposition des pièces :
                { false, true, false, false, false }, // l0: . o . . .
                { false, true, true, false, false }, // ,l1: . o o . .
                { false, false, true, true, false }, // ,l2: . . o o .
                { false, false, false, true, true }, // ,l3: . . . o o
                { false, false, false, false, true } // ,l4: . . . . o
        };
        Coord coordDepart = new Coord(0, 0);
        int k = 3;
        Instance instance = new Instance(plateau, coordDepart, k);
        GreedyLeGlouton greedyLeGlouton = new GreedyLeGlouton(instance);
        // resultat attendu :
        // l0: x x . . .
        // l1: . x x . .
        // l2: . . . . .
        // l3: . . . . .
        // l4: . . . . .
        assertTrue(instance.estValide(greedyLeGlouton.greedySolver()));
    }

    @Test
    void testGreedySolver_BonneSolutionQuandPieceTropLoin() throws Exception {
        boolean[][] plateau = new boolean[][] { // Disposition des pièces :
                { false, true, false, false, true }, // ,,l0: . o . . o
                { false, false, false, false, false }, // l1: . . . . .
                { false, false, false, false, false }, // l2: . . . . .
                { false, false, false, false, false }, // l3: . . . . .
                { false, false, false, false, false } // ,l4: . . . . .
        };
        Coord coordDepart = new Coord(0, 0);
        int k = 3;
        Instance instance = new Instance(plateau, coordDepart, k);
        GreedyLeGlouton greedyLeGlouton = new GreedyLeGlouton(instance);
        Solution resultaAttendu = new Solution();
        // resultat attendu :
        // l0: x x x x .
        // l1: . . . . .
        // l2: . . . . .
        // l3: . . . . .
        // l4: . . . . .
        resultaAttendu.add(new Coord(0, 0));
        resultaAttendu.add(new Coord(0, 1));
        resultaAttendu.add(new Coord(0, 2));
        resultaAttendu.add(new Coord(0, 3));
        assertEquals(resultaAttendu, greedyLeGlouton.greedySolver());
    }
}
