package fr.umontpellier.iut.algogen.strategies;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.junit.Ignore;
import org.junit.Test;

import fr.umontpellier.iut.algogen.Coord;
import fr.umontpellier.iut.algogen.Instance;
import fr.umontpellier.iut.algogen.individus.GDBHSimple;

public class CroisementMutationV1Test {

	@Test
	public void testCroisementPuisMutation() throws Exception {

		boolean[][] p4 = new boolean[10][10];
		for (int i = 0; i < p4.length; i++) {
			for (int j = 0; j < p4[0].length; j += 2) {

				p4[i][j] = true;

			}
		}
		Coord sp4 = new Coord(0, 0);
		int k4 = 4;
		Instance in4 = new Instance(p4, sp4, k4);
		GDBHSimple individu = new GDBHSimple(in4);
		individu.t.clear();
		individu.t.add('d');
		individu.t.add('d');
		individu.t.add('d');
		individu.t.add('b');
		GDBHSimple individu_ = new GDBHSimple(in4);
		individu_.t.clear();
		individu_.t.add('b');
		individu_.t.add('d');
		individu_.t.add('d');
		individu_.t.add('b');
		ArrayList<GDBHSimple> pop = new ArrayList<>(Arrays.asList(individu, individu_));

		CroisementMutationV1<GDBHSimple> croisementMutationV1 = new CroisementMutationV1<>(0.1);
		ArrayList<GDBHSimple> selected = croisementMutationV1.calculerNextGen(pop);
		GDBHSimple selected1 = croisementMutationV1.selectionRoulette(pop);
		assertTrue(selected.contains(selected1));

		selected.removeAll(pop);
		for (GDBHSimple i : pop)
			for (GDBHSimple j : selected)
				assertEquals(i.t, j.t);
	}

	@Test
	public void testSelectionRoulette() throws Exception {

		boolean[][] p4 = new boolean[10][10];
		for (int i = 0; i < p4.length; i++) {
			for (int j = 0; j < p4[0].length; j += 2) {

				p4[i][j] = true;

			}
		}
		Coord sp4 = new Coord(0, 0);
		int k4 = 4;
		Instance in4 = new Instance(p4, sp4, k4);
		GDBHSimple individu = new GDBHSimple(in4);
		individu.t.clear();
		individu.t.add('d');
		individu.t.add('d');
		individu.t.add('d');
		individu.t.add('b');
		GDBHSimple individu_ = new GDBHSimple(in4);
		individu_.t.clear();
		individu_.t.add('b');
		individu_.t.add('d');
		individu_.t.add('d');
		individu_.t.add('b');
		GDBHSimple individu1 = new GDBHSimple(in4);
		individu1.t.clear();
		individu1.t.add('d');
		individu1.t.add('b');
		individu1.t.add('d');
		individu1.t.add('h');

		ArrayList<Integer> scores = new ArrayList<>();
		ArrayList<Integer> avg1 = new ArrayList<>();
		ArrayList<Integer> avg2 = new ArrayList<>();
		ArrayList<Integer> avg3 = new ArrayList<>();
		ArrayList<GDBHSimple> pop = new ArrayList<>(Arrays.asList(individu, individu1, individu_));

		for (int i = 0; i < 30; i++) {
			for (int j = 0; j < 30; j++) {
				CroisementMutationV1<GDBHSimple> croisementMutationV1 = new CroisementMutationV1<>(0.1);
				GDBHSimple selected = croisementMutationV1.selectionRoulette(pop);
				scores.add(selected.evaluerFitness());
			}
			avg1.add(Collections.frequency(scores, 21));
			avg2.add(Collections.frequency(scores, 31));
			avg3.add(Collections.frequency(scores, 41));
		}

		assertTrue(calculateAverage(avg3) > 12);

	}

	private double calculateAverage(ArrayList<Integer> marks) {
		Integer sum = 0;
		if (!marks.isEmpty()) {
			for (Integer mark : marks) {
				sum += mark;
			}
			return sum.doubleValue() / marks.size();
		}
		return sum;
	}

	@Test
	public void testSelectionParents() throws Exception {

		boolean[][] p4 = new boolean[10][10];
		for (int i = 0; i < p4.length; i++) {
			for (int j = 0; j < p4[0].length; j += 2) {

				p4[i][j] = true;

			}
		}
		Coord sp4 = new Coord(0, 0);
		int k4 = 4;
		Instance in4 = new Instance(p4, sp4, k4);
		GDBHSimple individu = new GDBHSimple(in4);
		individu.t.clear();
		individu.t.add('d');
		individu.t.add('d');
		individu.t.add('d');
		individu.t.add('b');
		GDBHSimple individu_ = new GDBHSimple(in4);
		individu_.t.clear();
		individu_.t.add('b');
		individu_.t.add('d');
		individu_.t.add('d');
		individu_.t.add('b');
		GDBHSimple individu1 = new GDBHSimple(in4);
		individu1.t.clear();
		individu1.t.add('d');
		individu1.t.add('b');
		individu1.t.add('d');
		individu1.t.add('h');

		ArrayList<Integer> scores = new ArrayList<>();
		ArrayList<Integer> avg1 = new ArrayList<>();
		ArrayList<Integer> avg2 = new ArrayList<>();
		ArrayList<Integer> avg3 = new ArrayList<>();
		ArrayList<GDBHSimple> pop = new ArrayList<>(Arrays.asList(individu, individu1, individu_));

		CroisementMutationV1<GDBHSimple> croisementMutationV1 = new CroisementMutationV1<>(0.1);
		for (int i = 0; i < 30; i++) {

			for (int j = 0; j < 30; j++) {
				GDBHSimple selected = croisementMutationV1.selectionRoulette(pop);
				scores.add(selected.evaluerFitness());
			}
			avg1.add(Collections.frequency(scores, 21));
			avg2.add(Collections.frequency(scores, 31));
			avg3.add(Collections.frequency(scores, 41));
		}

		assertTrue(calculateAverage(avg3) > 12);

		ArrayList<GDBHSimple> parents = croisementMutationV1.selectionParents(pop);

		assertEquals(2, parents.size());

	}

}
