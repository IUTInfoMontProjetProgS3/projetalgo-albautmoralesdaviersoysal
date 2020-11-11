package fr.umontpellier.iut.algogen.individus;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;
import org.junit.Ignore;

import fr.umontpellier.iut.algogen.Coord;
import fr.umontpellier.iut.algogen.Instance;

public class GDBHSmartCrossingSmartMutTest {

	@Ignore
	@Test
	public void testCalculerCroisement() throws Exception {

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

	@Ignore
	@Test
	public void testMutationAux() throws Exception {

		boolean[][] p4 = new boolean[10][10];
		for (int i = 0; i < p4.length; i++) {
			for (int j = 0; j < p4[0].length; j += 2) {

				p4[i][j] = true;

			}
		}
		Coord sp4 = new Coord(0, 0);
		int k4 = p4.length * p4.length / 10;
		Instance in4 = new Instance(p4, sp4, k4);
		GDBHSmartCrossingSmartMut individu = new GDBHSmartCrossingSmartMut(in4);
		individu.trajet.clear();
		individu.trajet.add('d');
		individu.trajet.add('b');
		individu.trajet.add('b');
		individu.trajet.add('d');
		individu.trajet.add('d');
		individu.trajet.add('b');
		individu.trajet.add('b');
		individu.trajet.add('b');
		individu.trajet.add('b');
		individu.trajet.add('g');
		individu.mutationAux(0, 'b', 'h');
		GDBHSmartCrossingSmartMut individu1 = new GDBHSmartCrossingSmartMut(in4);
		individu1.trajet.clear();
		individu1.trajet.add('b');
		individu1.trajet.add('d');
		individu1.trajet.add('h');
		individu1.trajet.add('b');
		individu1.trajet.add('b');
		individu1.trajet.add('d');
		individu1.trajet.add('d');
		individu1.trajet.add('b');
		individu1.trajet.add('b');
		individu1.trajet.add('b');

		assertTrue(individu.trajet.equals(individu1.trajet));

		individu.mutationAux(1, 'b', 'd');

		GDBHSmartCrossingSmartMut individu2 = new GDBHSmartCrossingSmartMut(in4);
		individu2.trajet.clear();
		individu2.trajet.add('b');
		individu2.trajet.add('b');
		individu2.trajet.add('d');
		individu2.trajet.add('d');
		individu2.trajet.add('h');
		individu2.trajet.add('b');
		individu2.trajet.add('b');
		individu2.trajet.add('d');
		individu2.trajet.add('d');
		individu2.trajet.add('b');

		assertTrue(individu.trajet.equals(individu2.trajet));
		individu1.normaliseTrajet();
		individu2.normaliseTrajet();

		assertTrue(in4.estValide(individu1.calculerSol()));
		assertTrue(in4.estValide(individu2.calculerSol()));

	}

	@Ignore
	@Test
	public void testCalculerMutation() throws Exception {

		boolean[][] p4 = new boolean[10][10];
		for (int i = 0; i < p4.length; i++) {
			for (int j = 0; j < p4[0].length; j += 2) {

				p4[i][j] = true;

			}
		}
		Coord sp4 = new Coord(0, 0);
		int k4 = 4;
		Instance in4 = new Instance(p4, sp4, k4);
		GDBHSmartCrossingSmartMut individu = new GDBHSmartCrossingSmartMut(in4);
		individu.trajet.clear();
		individu.trajet.add('d');
		individu.trajet.add('d');
		individu.trajet.add('d');
		individu.trajet.add('b');
		GDBHSmartCrossingSmartMut individu_ = new GDBHSmartCrossingSmartMut(in4);
		individu_.trajet.clear();
		individu_.trajet.add('b');
		individu_.trajet.add('d');
		individu_.trajet.add('d');
		individu_.trajet.add('b');
		GDBHSmartCrossingSmartMut individu1 = new GDBHSmartCrossingSmartMut(in4);
		individu1.trajet.clear();
		individu1.trajet.add('d');
		individu1.trajet.add('b');
		individu1.trajet.add('d');
		individu1.trajet.add('h');
		GDBHSmartCrossingSmartMut individu2 = new GDBHSmartCrossingSmartMut(in4);
		individu2.trajet.clear();
		individu2.trajet.add('d');
		individu2.trajet.add('d');
		individu2.trajet.add('b');
		individu2.trajet.add('d');
		GDBHSmartCrossingSmartMut individu3 = new GDBHSmartCrossingSmartMut(in4);
		individu3.trajet.clear();
		individu3.trajet.add('d');
		individu3.trajet.add('b');
		individu3.trajet.add('d');
		individu3.trajet.add('b');
		GDBHSmartCrossingSmartMut individu4 = new GDBHSmartCrossingSmartMut(in4);
		individu4.trajet.clear();
		individu4.trajet.add('b');
		individu4.trajet.add('d');
		individu4.trajet.add('b');
		individu4.trajet.add('d');
		GDBHSmartCrossingSmartMut result = null;
		ArrayList<Boolean> equals = new ArrayList<>();
		for (int i = 0; i < 30; i++) {
			result = individu.calculerMutation();
			assertTrue(result.trajet.equals(individu1.trajet) || result.trajet.equals(individu2.trajet));
			result = individu_.calculerMutation();
			assertTrue(result.trajet.equals(individu3.trajet) || result.trajet.equals(individu4.trajet));

		}

		assertNotEquals(30, Collections.frequency(equals, true));
		assertFalse(Collections.disjoint(result.trajet, individu.trajet));
		assertTrue(in4.estValide(individu.calculerSol()));

	}

}
