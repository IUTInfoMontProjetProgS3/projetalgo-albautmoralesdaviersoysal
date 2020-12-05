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
import fr.umontpellier.iut.algogen.individus.GDBHSmartCrossingSmartMut;

public class CroisementMutationV1Test {

	@Ignore
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
		individu.trajet.clear();
		individu.trajet.add('d');
		individu.trajet.add('d');
		individu.trajet.add('d');
		individu.trajet.add('b');
		GDBHSimple individu_ = new GDBHSimple(in4);
		individu_.trajet.clear();
		individu_.trajet.add('b');
		individu_.trajet.add('d');
		individu_.trajet.add('d');
		individu_.trajet.add('b');
		ArrayList<GDBHSimple> pop = new ArrayList<>(Arrays.asList(individu, individu_));

		CroisementMutationV1<GDBHSimple> croisementMutationV1 = new CroisementMutationV1<>(0.1);
		ArrayList<GDBHSimple> selected = croisementMutationV1.calculerNextGen(pop);
		GDBHSimple selected1 = croisementMutationV1.selectionRoulette(pop);
		assertTrue(selected.contains(selected1));

		selected.removeAll(pop);
		for (GDBHSimple i : pop)
			for (GDBHSimple j : selected)
				assertEquals(i.trajet, j.trajet);
	}

	@Ignore
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

		ArrayList<Integer> scores = new ArrayList();
		ArrayList<Integer> avg1 = new ArrayList();
		ArrayList<Integer> avg2 = new ArrayList();
		ArrayList<Integer> avg3 = new ArrayList();
		ArrayList<GDBHSmartCrossingSmartMut> pop = new ArrayList(Arrays.asList(individu, individu1, individu_));

		for (int i = 0; i < 30; i++) {

			for (int j = 0; j < 30; j++) {
				GDBHSmartCrossingSmartMut selected = (GDBHSmartCrossingSmartMut) new CroisementMutationV1(0.1)
						.selectionRoulette(pop);
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

	@Ignore
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

		ArrayList<Integer> scores = new ArrayList();
		ArrayList<Integer> avg1 = new ArrayList();
		ArrayList<Integer> avg2 = new ArrayList();
		ArrayList<Integer> avg3 = new ArrayList();
		ArrayList<GDBHSmartCrossingSmartMut> pop = new ArrayList(Arrays.asList(individu, individu1, individu_));

		for (int i = 0; i < 30; i++) {

			for (int j = 0; j < 30; j++) {
				GDBHSmartCrossingSmartMut selected = (GDBHSmartCrossingSmartMut) new CroisementMutationV1(0.1)
						.selectionRoulette(pop);
				scores.add(selected.evaluerFitness());
			}
			avg1.add(Collections.frequency(scores, 21));
			avg2.add(Collections.frequency(scores, 31));
			avg3.add(Collections.frequency(scores, 41));
		}

		assertTrue(calculateAverage(avg3) > 12);

		ArrayList<GDBHSmartCrossingSmartMut> parents = new CroisementMutationV1(0.1).selectionParents(pop);

		assertTrue(parents.size() == 2);

	}

}
