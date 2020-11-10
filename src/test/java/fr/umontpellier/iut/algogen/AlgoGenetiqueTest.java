package fr.umontpellier.iut.algogen;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import fr.umontpellier.iut.algogen.fabriques.CreationIndividuGDBHSmartCrossingSmartMutViaPermut;
import fr.umontpellier.iut.algogen.individus.GDBHSmartCrossingSmartMut;
import fr.umontpellier.iut.algogen.strategies.CroisementMutationV1;

public class AlgoGenetiqueTest {

	@Test
	public void testRun() throws Exception {

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
		
		AlgoGenetique ag =new AlgoGenetique(in4,  new CreationIndividuGDBHSmartCrossingSmartMutViaPermut());
        assertDoesNotThrow(() -> ag.run(2, 30));

		;
	}

}
