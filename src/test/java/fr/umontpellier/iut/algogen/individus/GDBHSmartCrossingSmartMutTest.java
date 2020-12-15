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
		individu.t.clear();
		individu.t.add('d');
		individu.t.add('b');
		individu.t.add('b');
		individu.t.add('d');
		individu.t.add('d');
		individu.t.add('b');
		individu.t.add('b');
		individu.t.add('b');
		individu.t.add('b');
		individu.t.add('g');
		individu.mutationAux(0, 'b', 'h');
		GDBHSmartCrossingSmartMut individu1 = new GDBHSmartCrossingSmartMut(in4);
		individu1.t.clear();
		individu1.t.add('b');
		individu1.t.add('d');
		individu1.t.add('h');
		individu1.t.add('b');
		individu1.t.add('b');
		individu1.t.add('d');
		individu1.t.add('d');
		individu1.t.add('b');
		individu1.t.add('b');
		individu1.t.add('b');

		assertEquals(individu.t, individu1.t);

		individu.mutationAux(1, 'b', 'd');

		GDBHSmartCrossingSmartMut individu2 = new GDBHSmartCrossingSmartMut(in4);
		individu2.t.clear();
		individu2.t.add('b');
		individu2.t.add('b');
		individu2.t.add('d');
		individu2.t.add('d');
		individu2.t.add('h');
		individu2.t.add('b');
		individu2.t.add('b');
		individu2.t.add('d');
		individu2.t.add('d');
		individu2.t.add('b');

		assertTrue(individu.t.equals(individu2.t));
		individu1.normaliseTrajet();
		individu2.normaliseTrajet();

		assertTrue(in4.estValide(individu1.calculerSol()));
		assertTrue(in4.estValide(individu2.calculerSol()));

	}

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
		individu.t.clear();
		individu.t.add('d');
		individu.t.add('d');
		individu.t.add('d');
		individu.t.add('b');
		GDBHSmartCrossingSmartMut individu_ = new GDBHSmartCrossingSmartMut(in4);
		individu_.t.clear();
		individu_.t.add('b');
		individu_.t.add('d');
		individu_.t.add('d');
		individu_.t.add('b');
		GDBHSmartCrossingSmartMut individu1 = new GDBHSmartCrossingSmartMut(in4);
		individu1.t.clear();
		individu1.t.add('d');
		individu1.t.add('b');
		individu1.t.add('d');
		individu1.t.add('h');
		GDBHSmartCrossingSmartMut individu2 = new GDBHSmartCrossingSmartMut(in4);
		individu2.t.clear();
		individu2.t.add('d');
		individu2.t.add('d');
		individu2.t.add('b');
		individu2.t.add('d');
		GDBHSmartCrossingSmartMut individu3 = new GDBHSmartCrossingSmartMut(in4);
		individu3.t.clear();
		individu3.t.add('d');
		individu3.t.add('b');
		individu3.t.add('d');
		individu3.t.add('b');
		GDBHSmartCrossingSmartMut individu4 = new GDBHSmartCrossingSmartMut(in4);
		individu4.t.clear();
		individu4.t.add('b');
		individu4.t.add('d');
		individu4.t.add('b');
		individu4.t.add('d');
		GDBHSmartCrossingSmartMut result = null;
		ArrayList<Boolean> equals = new ArrayList<>();
		for (int i = 0; i < 30; i++) {
			result = individu.calculerMutation();
			assertTrue(result.t.equals(individu1.t) || result.t.equals(individu2.t));
			result = individu_.calculerMutation();
			assertTrue(result.t.equals(individu3.t) || result.t.equals(individu4.t));

		}

		assertNotEquals(30, Collections.frequency(equals, true));
		assertFalse(Collections.disjoint(result.t, individu.t));
		assertTrue(in4.estValide(individu.calculerSol()));

	}

}
