package fr.umontpellier.iut.algogen.individus;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.withSettings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import fr.umontpellier.iut.algogen.Coord;
import fr.umontpellier.iut.algogen.Instance;
import fr.umontpellier.iut.algogen.Solution;

class GDBHSmartCrossingTest {

	static ArrayList<Character> trajet(Character... directions) {
		return new ArrayList<Character>(Arrays.asList(directions));
	}

	@Test
	void testCalculerCroisementCasConcret() throws Exception {
		boolean[][] p4 = new boolean[50][50];
		Coord sp4 = new Coord(25, 25);
		int k4 = 10;
		Instance in4 = new Instance(p4, sp4, k4);
		GDBHSmartCrossing individu = new GDBHSmartCrossing(in4,
				trajet('b', 'd', 'd', 'h', 'd', 'd', 'b', 'b', 'd', 'h'));
		GDBHSmartCrossing individu1 = new GDBHSmartCrossing(in4,
				trajet('d', 'b', 'd', 'b', 'g', 'b', 'b', 'b', 'd', 'b'));

		assertEquals(trajet('b', 'd', 'd', 'h', 'h', 'h', 'g', 'b', 'b', 'b'),
				calculerCroisementAvecSpy(individu, individu1, 4).t);
	}

	private GDBHSmartCrossing calculerCroisementAvecSpy(GDBHSmartCrossing individu1, GDBHSmartCrossing individu2,
			int nombreRandom) throws Exception {
		GDBHSmartCrossing spy = Mockito.spy(new GDBHSmartCrossing(individu1.in, individu1.t));
		when(spy.indexRandom()).thenReturn(nombreRandom);
		return spy.calculerCroisement(individu2);
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
		individu.t.clear();
		individu.t.add('d');
		individu.t.add('b');
		individu.t.add('b');
		individu.t.add('d');
		individu.t.add('d');
		individu.t.add('h');
		individu.t.add('d');
		individu.t.add('b');
		individu.t.add('d');
		individu.t.add('b');
		GDBHSmartCrossing individu1 = new GDBHSmartCrossing(in4);
		individu1.t.clear();
		individu1.t.add('b');
		individu1.t.add('b');
		individu1.t.add('b');
		individu1.t.add('b');
		individu1.t.add('d');
		individu1.t.add('d');
		individu1.t.add('d');
		individu1.t.add('b');
		individu1.t.add('d');
		individu1.t.add('d');
		int distance = 0;
		Coord previous = sp4;
		for (char c : individu.t) {
			Coord next = individu.calculerNextCoord(previous, c);
			distance += (next.distanceFrom(previous));
			previous = next;

		}

		int distance1 = 0;
		previous = sp4;
		for (char c : individu1.t) {
			Coord next = individu1.calculerNextCoord(previous, c);
			distance1 += (next.distanceFrom(previous));
			previous = next;

		}

		GDBHSmartCrossing result = individu1.calculerCroisement(individu);
		int distance2 = 0;
		previous = sp4;
		for (char c : result.t) {
			Coord next = result.calculerNextCoord(previous, c);
			distance2 += (next.distanceFrom(previous));
			previous = next;

		}

		assertEquals(10, distance);
		assertEquals(10, distance1);
		assertEquals(10, distance2);

		assertFalse(Collections.disjoint(result.t, individu.t));
		assertFalse(Collections.disjoint(result.t, individu1.t));

	}

	@Test
	void testCalculerMutation() throws Exception {

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
		individu.t.clear();
		individu.t.add('d');
		individu.t.add('b');
		individu.t.add('b');
		individu.t.add('d');
		individu.t.add('d');
		individu.t.add('h');
		individu.t.add('d');
		individu.t.add('b');
		individu.t.add('d');
		individu.t.add('b');
		GDBHSmartCrossing result = null;
		ArrayList<Boolean> equals = new ArrayList<>();
		for (int i = 0; i < 30; i++) {
			result = individu.calculerMutation();
			equals.add(result.t.equals(individu.t));
		}
		assertNotEquals(30, Collections.frequency(equals, true));
		assertFalse(Collections.disjoint(result.t, individu.t));
		assertTrue(in4.estValide(individu.calculerSol()));

	}

}
