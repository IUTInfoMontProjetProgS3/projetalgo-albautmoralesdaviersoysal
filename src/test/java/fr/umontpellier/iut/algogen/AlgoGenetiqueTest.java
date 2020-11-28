package fr.umontpellier.iut.algogen;

import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mockito;

import fr.umontpellier.iut.algogen.fabriques.CreationIndividuGDBHSmartCrossingSmartMutViaPermut;
import fr.umontpellier.iut.algogen.fabriques.ICreator;
import fr.umontpellier.iut.algogen.individus.GDBHSmartCrossingSmartMut;
import fr.umontpellier.iut.algogen.individus.IIndividu;

public class AlgoGenetiqueTest {

	@Ignore
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

		AlgoGenetique ag = new AlgoGenetique(in4, new CreationIndividuGDBHSmartCrossingSmartMutViaPermut());
		assertDoesNotThrow(() -> ag.run(2, 30));
	}

	@Test
	public void testRun_AvecMock_retourneMeilleurIndividu() {
		Solution resultatAttendu = new Solution();
		boolean[][] plateau = new boolean[][] { // Disposition des pièces :
				{ false, true, false, false, false }, // l0: . o . . .
				{ false, true, true, false, false }, // ,l1: . o o . .
				{ false, false, true, true, false }, // ,l2: . . o o .
				{ false, false, false, true, true }, // ,l3: . . . o o
				{ false, false, false, false, true } // ,l4: . . . . o
		};
		Coord coordDepart = new Coord(0, 0);
		int k = 8;
		Instance instance = new Instance(plateau, coordDepart, k);
		ICreator<?> mockICreator = Mockito.mock(ICreator.class);
		AlgoGenetique<?> algoGenetique = new AlgoGenetique<>(instance, null, mockICreator);
		IIndividu mockIIndividu1 = initMockIndividu(resultatAttendu, 50);
		IIndividu mockIIndividu2 = initMockIndividu(new Solution(), 1);
		when(mockICreator.creerPopInit(any(Instance.class), anyInt()))
				.thenReturn(new ArrayList<>(Arrays.asList(mockIIndividu1, mockIIndividu2)));
		assertSame(resultatAttendu, algoGenetique.run(2, 0));
	}

	private IIndividu initMockIndividu(Solution solution, int fitness) {
		IIndividu mockIIndividu = Mockito.mock(IIndividu.class);
		when(mockIIndividu.evaluerFitness()).thenReturn(fitness);
		when(mockIIndividu.calculerSol()).thenReturn(solution);
		return mockIIndividu;
	}

}
