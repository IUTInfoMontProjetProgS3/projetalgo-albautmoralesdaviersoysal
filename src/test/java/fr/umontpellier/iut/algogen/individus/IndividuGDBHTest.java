package fr.umontpellier.iut.algogen.individus;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;
import org.junit.Ignore;

import fr.umontpellier.iut.algogen.Coord;
import fr.umontpellier.iut.algogen.Instance;
import fr.umontpellier.iut.algogen.Solution;
import fr.umontpellier.iut.algogen.individus.GDBHSimple;

public class IndividuGDBHTest {

	@Test
	public void testIndividuGDBHInstance() throws Exception {
		boolean[][] p4 = new boolean[10][10];
		for (int i = 0; i < p4.length; i++) {
			for (int j = 0; j < p4[0].length; j += 2) {

				p4[i][j] = true;

			}
		}
		Coord sp4 = new Coord(9, 5);
		int k4 = p4.length * p4.length / 10;
		Instance in4 = new Instance(p4, sp4, k4);

		GDBHSimple individu = new GDBHSimple(in4);
		int occurrences = Collections.frequency(individu.trajet, 'h');
		int occurrences1 = Collections.frequency(individu.trajet, 'b');
		int occurrences2 = Collections.frequency(individu.trajet, 'd');
		int occurrences3 = Collections.frequency(individu.trajet, 'g');
		assertNotEquals(10, occurrences);
		assertNotEquals(10, occurrences1);
		assertNotEquals(10, occurrences2);
		assertNotEquals(10, occurrences3);
		assertEquals(10, individu.trajet.size());

	}

	@Test
	public void testIndividuGDBHInstanceSolution() throws Exception {
		boolean[][] p4 = new boolean[10][10];
		for (int i = 0; i < p4.length; i++) {
			for (int j = 0; j < p4[0].length; j += 2) {

				p4[i][j] = true;

			}
		}
		Coord sp4 = new Coord(9, 5);
		int k4 = p4.length * p4.length / 10;
		Instance in4 = new Instance(p4, sp4, k4);
		ArrayList<Character> trajet = new ArrayList<Character>();
		trajet.add('h');
		trajet.add('g');
		trajet.add('h');
		trajet.add('d');
		trajet.add('h');
		trajet.add('d');
		trajet.add('b');
		trajet.add('b');
		trajet.add('b');
		trajet.add('h');
		Solution c = new Solution();
		c.add(new Coord(9, 5));
		c.add(new Coord(8, 5));
		c.add(new Coord(8, 4));
		c.add(new Coord(7, 4));
		c.add(new Coord(7, 5));
		c.add(new Coord(6, 5));
		c.add(new Coord(6, 6));
		c.add(new Coord(7, 6));
		c.add(new Coord(8, 6));
		c.add(new Coord(9, 6));
		c.add(new Coord(8, 6));
		GDBHSimple individu = new GDBHSimple(in4, c);

		assertEquals(trajet, individu.trajet);
	}

	@Test
	public void testCalculerSol() throws Exception {
		boolean[][] p4 = new boolean[10][10];
		for (int i = 0; i < p4.length; i++) {
			for (int j = 0; j < p4[0].length; j += 2) {

				p4[i][j] = true;

			}
		}
		Coord sp4 = new Coord(9, 5);
		int k4 = p4.length * p4.length / 10;
		Instance in4 = new Instance(p4, sp4, k4);

		GDBHSimple individu = new GDBHSimple(in4);
		individu.trajet.clear();
		individu.trajet.add('h');
		individu.trajet.add('g');
		individu.trajet.add('h');
		individu.trajet.add('d');
		individu.trajet.add('h');
		individu.trajet.add('d');
		individu.trajet.add('b');
		individu.trajet.add('b');
		individu.trajet.add('b');
		individu.trajet.add('h');
		Solution c = new Solution();
		c.add(new Coord(9, 5));
		c.add(new Coord(8, 5));
		c.add(new Coord(8, 4));
		c.add(new Coord(7, 4));
		c.add(new Coord(7, 5));
		c.add(new Coord(6, 5));
		c.add(new Coord(6, 6));
		c.add(new Coord(7, 6));
		c.add(new Coord(8, 6));
		c.add(new Coord(9, 6));
		c.add(new Coord(8, 6));
		assertTrue(c.equals(individu.calculerSol()));

	}

	@Ignore
	@Test
	public void testEvaluerFitness() throws Exception {
		boolean[][] p4 = new boolean[10][10];
		for (int i = 0; i < p4.length; i++) {
			for (int j = 0; j < p4[0].length; j += 2) {

				p4[i][j] = true;

			}
		}
		Coord sp4 = new Coord(9, 5);
		int k4 = p4.length * p4.length / 10;
		Instance in4 = new Instance(p4, sp4, k4);

		GDBHSimple individu = new GDBHSimple(in4);
		individu.trajet.clear();
		individu.trajet.add('h');
		individu.trajet.add('g');
		individu.trajet.add('h');
		individu.trajet.add('d');
		individu.trajet.add('h');
		individu.trajet.add('d');
		individu.trajet.add('b');
		individu.trajet.add('b');
		individu.trajet.add('b');
		individu.trajet.add('h');
		assertEquals(61, individu.evaluerFitness());

	}

}
