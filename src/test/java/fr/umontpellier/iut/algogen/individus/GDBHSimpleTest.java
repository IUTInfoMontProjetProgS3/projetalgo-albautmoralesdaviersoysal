package fr.umontpellier.iut.algogen.individus;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.Test;

import fr.umontpellier.iut.algogen.Coord;
import fr.umontpellier.iut.algogen.Instance;
import fr.umontpellier.iut.algogen.individus.GDBHSimple;
import fr.umontpellier.iut.algogen.individus.GDBHSimple;

public class GDBHSimpleTest {

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
		GDBHSimple individu = new GDBHSimple(in4);
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
		GDBHSimple individu1 = new GDBHSimple(in4);
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
		GDBHSimple result = individu1.calculerCroisement(individu);

		assertFalse(Collections.disjoint(result.trajet, individu.trajet));
		assertFalse(Collections.disjoint(result.trajet, individu1.trajet));

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
		int k4 = p4.length * p4.length / 10;
		Instance in4 = new Instance(p4, sp4, k4);
		GDBHSimple individu = new GDBHSimple(in4);
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
		GDBHSimple result = null;
		ArrayList<Boolean> equals = new ArrayList<>();
		for (int i = 0; i < 30; i++) {
			result = individu.calculerMutation();
			equals.add(result.trajet.equals(individu.trajet));
		}
		assertNotEquals(30, Collections.frequency(equals, true));
		assertFalse(Collections.disjoint(result.trajet, individu.trajet));

	}

}
