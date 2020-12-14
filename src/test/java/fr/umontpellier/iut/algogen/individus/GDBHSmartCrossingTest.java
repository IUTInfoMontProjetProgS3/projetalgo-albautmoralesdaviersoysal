package fr.umontpellier.iut.algogen.individus;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.Test;
import org.junit.Ignore;
import org.junit.jupiter.api.Disabled;

import fr.umontpellier.iut.algogen.Coord;
import fr.umontpellier.iut.algogen.Instance;

class GDBHSmartCrossingTest {

	private ArrayList<Character> trajet(Character... directions) {
		return new ArrayList<Character>(Arrays.asList(directions));
	}

	@Ignore("Test non-validé")
	@Test
	void testCalculerCroisementCasConcret() {
		//FIXME Le test doit mocker la méthode privé indexRandom() 
		boolean[][] p4 = new boolean[10][10];
		Coord sp4 = new Coord(0, 0);
		int k4 = p4.length * p4.length / 10;
		Instance in4 = new Instance(p4, sp4, k4);
		GDBHSmartCrossing individu = new GDBHSmartCrossing(in4,
				trajet('b', 'd', 'd', 'h', 'd', 'd', 'b', 'b', 'd', 'h'));
		GDBHSmartCrossing individu1 = new GDBHSmartCrossing(in4,
				trajet('d', 'b', 'd', 'b', 'g', 'b', 'b', 'b', 'd', 'b'));

		assertEquals(trajet('b', 'd', 'd', 'h', 'h', 'h', 'g', 'b', 'b', 'b'),
				individu.calculerCroisement(individu1).trajet);
	}

	@Test
	void testCalculerCroisement() throws Exception {

		boolean[][] p4 = new boolean[10][10];
		for (int i = 0; i < p4.length; i++) {
			for (int j = 0; j < p4[0].length; j += 2) {

				p4[i][j] = true;

			}
		}
		Coord sp4 = new Coord(0, 0);
		int k4 = p4.length * p4.length / 10;
		Instance in4 = new Instance(p4, sp4, k4);
		GDBHSmartCrossing individu = new GDBHSmartCrossing(in4);
		individu.trajet.clear();
		individu.trajet.add('d');
		individu.trajet.add('b');
		individu.trajet.add('b');
		individu.trajet.add('d');
		individu.trajet.add('d');
		individu.trajet.add('h');
		individu.trajet.add('d');
		individu.trajet.add('b');
		individu.trajet.add('d');
		individu.trajet.add('b');
		GDBHSmartCrossing individu1 = new GDBHSmartCrossing(in4);
		individu1.trajet.clear();
		individu1.trajet.add('b');
		individu1.trajet.add('b');
		individu1.trajet.add('b');
		individu1.trajet.add('b');
		individu1.trajet.add('d');
		individu1.trajet.add('d');
		individu1.trajet.add('d');
		individu1.trajet.add('b');
		individu1.trajet.add('d');
		individu1.trajet.add('d');
		int distance = 0;
		Coord previous = sp4;
		for (char c : individu.trajet) {
			Coord next = individu.calculerNextCoord(previous, c);
			distance += (next.distanceFrom(previous));
			previous = next;

		}

		int distance1 = 0;
		previous = sp4;
		for (char c : individu1.trajet) {
			Coord next = individu1.calculerNextCoord(previous, c);
			distance1 += (next.distanceFrom(previous));
			previous = next;

		}

		GDBHSmartCrossing result = individu1.calculerCroisement(individu);
		int distance2 = 0;
		previous = sp4;
		for (char c : result.trajet) {
			Coord next = result.calculerNextCoord(previous, c);
			distance2 += (next.distanceFrom(previous));
			previous = next;

		}

		assertEquals(10, distance);
		assertEquals(10, distance1);
		assertEquals(10, distance2);

		assertFalse(Collections.disjoint(result.trajet, individu.trajet));
		assertFalse(Collections.disjoint(result.trajet, individu1.trajet));

	}

	@Disabled
	@Test
	public void testCalculerMutation() throws Exception {

		boolean[][] p4 = new boolean[10][10];
		for (int i = 0; i < p4.length; i++) {
			for (int j = 0; j < p4[0].length; j += 2) {

				p4[i][j] = true;

			}
		}
		Coord sp4 = new Coord(0, 0);
		int k4 = p4.length * p4.length / 10;
		Instance in4 = new Instance(p4, sp4, k4);
		GDBHSmartCrossing individu = new GDBHSmartCrossing(in4);
		individu.trajet.clear();
		individu.trajet.add('d');
		individu.trajet.add('b');
		individu.trajet.add('b');
		individu.trajet.add('d');
		individu.trajet.add('d');
		individu.trajet.add('h');
		individu.trajet.add('d');
		individu.trajet.add('b');
		individu.trajet.add('d');
		individu.trajet.add('b');
		GDBHSmartCrossing result = null;
		ArrayList<Boolean> equals = new ArrayList<>();
		for (int i = 0; i < 30; i++) {
			result = individu.calculerMutation();
			equals.add(result.trajet.equals(individu.trajet));
		}
		assertNotEquals(30, Collections.frequency(equals, true));
		assertFalse(Collections.disjoint(result.trajet, individu.trajet));
		assertTrue(in4.estValide(individu.calculerSol()));

	}

}
