package Instance;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;
import org.junit.Ignore;

import fr.umontpellier.iut.algogen.Coord;
import fr.umontpellier.iut.algogen.Instance;
import fr.umontpellier.iut.algogen.Solution;

public class InstanceTest {

        @Test
        public void testConstructeur_initListCoordPiece() throws Exception {
                Coord result = new Coord(1, 1);
                boolean[][] plateau = new boolean[][] { //
                                { false, false, false }, // l0
                                { false, true, false }, // l1
                                { false, false, false }// l2
                };

                Instance instance = new Instance(plateau, new Coord(0, 0), 2);
                assertEquals(result, instance.getListeCoordPieces().get(0));
        }

        @Test
        public void testPiecePresente() throws Exception {
                boolean[][] p4 = new boolean[10][10];
                for (int i = 0; i < p4.length; i++) {
                        for (int j = 0; j < p4[0].length; j += 2) {

                                p4[i][j] = true;

                        }
                }
                Coord sp4 = new Coord(9, 5);
                int k4 = p4.length * p4.length / 10;
                Instance in4 = new Instance(p4, sp4, k4);
                for (int i = 0; i < p4.length; i++) {
                        for (int j = 0; j < p4[0].length; j += 2) {

                                assertEquals(true, in4.piecePresente(new Coord(i, j)));

                        }
                }
        }

        @Test
        public void testEstValide() throws Exception {

                boolean[][] p4 = new boolean[10][10];
                for (int i = 0; i < p4.length; i++) {
                        for (int j = 0; j < p4[0].length; j += 2) {

                                p4[i][j] = true;

                        }
                }
                Coord sp4 = new Coord(9, 5);
                int k4 = p4.length * p4.length / 10;
                Instance in4 = new Instance(p4, sp4, k4);
                Solution s = new Solution();
                s.add(new Coord(9, 5));
                s.add(new Coord(9, 6));
                s.add(new Coord(8, 6));
                s.add(new Coord(7, 6));
                s.add(new Coord(6, 6));
                s.add(new Coord(5, 6));
                s.add(new Coord(4, 6));
                s.add(new Coord(3, 6));
                s.add(new Coord(2, 6));
                s.add(new Coord(1, 6));
                s.add(new Coord(0, 6));
                assertEquals(true, in4.estValide(s));

        }

        @Test
        public void testEvaluerSolution() throws Exception {
                boolean[][] p4 = new boolean[10][10];
                for (int i = 0; i < p4.length; i++) {
                        for (int j = 0; j < p4[0].length; j += 2) {

                                p4[i][j] = true;

                        }
                }
                Coord sp4 = new Coord(9, 5);
                int k4 = p4.length * p4.length / 10;
                Instance in4 = new Instance(p4, sp4, k4);
                Solution s = new Solution();
                s.add(new Coord(9, 5));
                s.add(new Coord(9, 6));
                s.add(new Coord(8, 6));
                s.add(new Coord(7, 6));
                s.add(new Coord(6, 6));
                s.add(new Coord(5, 6));
                s.add(new Coord(4, 6));
                s.add(new Coord(3, 6));
                s.add(new Coord(2, 6));
                s.add(new Coord(1, 6));
                s.add(new Coord(0, 6));
                assertEquals(10, in4.evaluerSolution(s));
        }

        @Test
        public void testEvaluerSolution2() throws Exception {
                boolean[][] p4 = new boolean[10][10];
                for (int i = 0; i < p4.length; i++) {
                        for (int j = 0; j < p4[0].length; j += 2) {
                                p4[i][j] = true;
                        }
                }
                Coord sp4 = new Coord(9, 5);
                int k4 = p4.length * p4.length / 10;
                Instance in4 = new Instance(p4, sp4, k4);
                Solution s = new Solution();
                s.add(new Coord(9, 5));
                s.add(new Coord(9, 4));
                s.add(new Coord(8, 4));
                s.add(new Coord(7, 4));
                s.add(new Coord(6, 4));
                s.add(new Coord(5, 4));
                s.add(new Coord(4, 4));
                s.add(new Coord(3, 4));
                s.add(new Coord(2, 4));
                s.add(new Coord(1, 4));
                s.add(new Coord(0, 4));
                assertEquals(10, in4.evaluerSolution(s));
        }

        @Ignore
        @Test
        public void testGreedySolver() throws Exception {
                boolean[][] plateau = new boolean[][] { // Disposition des pièces :
                                { false, true, false, false, false }, // l0: . o . . .
                                { false, true, true, false, false }, // ,l1: . o o . .
                                { false, false, true, true, false }, // ,l2: . . o o .
                                { false, false, false, true, true }, // ,l3: . . . o o
                                { false, false, false, false, true } // ,l4: . . . . o
                };
                Coord coordDepart = new Coord(0, 0);
                int k = 9;
                Instance instance = new Instance(plateau, coordDepart, k);
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
                assertEquals(resultaAttendu, instance.greedySolver());
        }

        @Ignore
        @Test
        public void testGreedyPermut() throws Exception {
                boolean[][] p4 = new boolean[10][10];
                for (int i = 0; i < p4.length; i++) {
                        for (int j = 0; j < p4[0].length; j += 2) {
                                p4[i][j] = true;
                        }
                }
                Coord sp4 = new Coord(9, 5);
                int k4 = p4.length * p4.length / 10;
                Instance in4 = new Instance(p4, sp4, k4);
                ArrayList<Integer> s = new ArrayList<>();
                int[] values = new int[] { 47, 42, 37, 32, 27, 22, 17, 12, 7, 2, 1, 6, 11, 16, 21, 26, 31, 36, 41, 46,
                                45, 40, 35, 30, 25, 20, 15, 10, 5, 0, 3, 8, 13, 18, 23, 28, 33, 38, 43, 48, 49, 44, 39,
                                34, 29, 24, 19, 14, 9, 4 };
                for (int a : values)
                        s.add(a);
                assertTrue(s.equals(in4.greedyPermut()));
        }

}
