package fr.umontpellier.iut.algogen.individus;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
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

	private ArrayList<Character> trajet(Character... directions) {
		return new ArrayList<Character>(Arrays.asList(directions));
	}

	@Test
	void testCalculerCroisementCasConcret() throws Exception {
		boolean[][] p4 = new boolean[10][10];
		Coord sp4 = new Coord(0, 0);
		int k4 = p4.length * p4.length / 10;
		Instance in4 = new Instance(p4, sp4, k4);
		GDBHSmartCrossing individu = new GDBHSmartCrossing(in4,
				trajet('b', 'd', 'd', 'h', 'd', 'd', 'b', 'b', 'd', 'h'));
		GDBHSmartCrossing individu1 = new GDBHSmartCrossing(in4,
				trajet('d', 'b', 'd', 'b', 'g', 'b', 'b', 'b', 'd', 'b'));

		assertEquals(trajet('b', 'd', 'd', 'h', 'h', 'h', 'g', 'b', 'b', 'b'),
				calculerCroisementAvecSpy(individu, individu1, 4).trajet);
	}

	private GDBHSmartCrossing calculerCroisementAvecSpy(GDBHSmartCrossing individu1, GDBHSmartCrossing individu2,
			int nombreRandom) throws Exception {
		GDBHSmartCrossing mock = Mockito.mock(GDBHSmartCrossing.class,
				withSettings().useConstructor(individu1.instance, individu1.trajet));
		when(mock.indexRandom()).thenReturn(nombreRandom);
		when(mock.convertieEnTrajet(any(Solution.class))).thenCallRealMethod();
		when(mock.calculerSol()).thenCallRealMethod();
		when(mock.calculerCroisement(any(GDBHSmartCrossing.class))).thenCallRealMethod();
		return mock.calculerCroisement(individu2);
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
