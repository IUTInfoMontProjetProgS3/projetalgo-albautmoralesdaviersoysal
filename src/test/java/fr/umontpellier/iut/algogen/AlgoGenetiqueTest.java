package fr.umontpellier.iut.algogen;

import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoInteractions;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Ignore;
import org.junit.Test;

import fr.umontpellier.iut.algogen.fabriques.CreationIndividuGDBH;
import fr.umontpellier.iut.algogen.fabriques.CreationIndividuGDBHSmartCrossing;
import fr.umontpellier.iut.algogen.fabriques.CreationIndividuGDBHSmartCrossingSmartMut;
import fr.umontpellier.iut.algogen.fabriques.CreationIndividuPermut;
import fr.umontpellier.iut.algogen.fabriques.ICreator;
import fr.umontpellier.iut.algogen.individus.GDBHSimple;
import fr.umontpellier.iut.algogen.individus.GDBHSmartCrossing;
import fr.umontpellier.iut.algogen.individus.GDBHSmartCrossingSmartMut;
import fr.umontpellier.iut.algogen.individus.IIndividu;
import fr.umontpellier.iut.algogen.individus.PermutSimple;
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

		AlgoGenetique<GDBHSimple> ag = new AlgoGenetique(in4, new CreationIndividuGDBH());
		assertDoesNotThrow(() -> ag.run(30, 1000));
	}

	@Test
	public void testRun_SmartCrossing() throws Exception {
		boolean[][] p4 = new boolean[10][10];
		for (int i = 0; i < p4.length; i++) {
			for (int j = 0; j < p4[0].length; j += 2) {
				p4[i][j] = true;
			}
		}
		Coord sp4 = new Coord(0, 0);
		int k4 = 4;
		Instance in4 = new Instance(p4, sp4, k4);

		AlgoGenetique<GDBHSmartCrossing> ag = new AlgoGenetique(in4, new CreationIndividuGDBHSmartCrossing());
		assertDoesNotThrow(() -> ag.run(30, 1000));
	}

	@Test
	public void testRun_SmartCrossingSmartMut() throws Exception {
		boolean[][] p4 = new boolean[10][10];
		for (int i = 0; i < p4.length; i++) {
			for (int j = 0; j < p4[0].length; j += 2) {
				p4[i][j] = true;
			}
		}
		Coord sp4 = new Coord(0, 0);
		int k4 = 4;
		Instance in4 = new Instance(p4, sp4, k4);

		AlgoGenetique<GDBHSmartCrossingSmartMut> ag = new AlgoGenetique(in4, new CreationIndividuGDBHSmartCrossingSmartMut());
		assertDoesNotThrow(() -> ag.run(30, 1000));
	}

	@Test
	public void testRun_PermutSimple() throws Exception {
		boolean[][] p4 = new boolean[10][10];
		for (int i = 0; i < p4.length; i++) {
			for (int j = 0; j < p4[0].length; j += 2) {
				p4[i][j] = true;
			}
		}
		Coord sp4 = new Coord(0, 0);
		int k4 = 4;
		Instance in4 = new Instance(p4, sp4, k4);

		AlgoGenetique<PermutSimple> ag = new AlgoGenetique(in4, new CreationIndividuPermut());
		assertDoesNotThrow(() -> ag.run(30, 1000));
	}

	@Test
	public void testRun_AvecMock_retourneMeilleurIndividu() {
		Solution resultatAttendu = new Solution();
		ICreator mockICreator = mock(ICreator.class);
		CroisementMutationV1 mockCalculNextGen = mock(CroisementMutationV1.class);
		AlgoGenetique algoGenetique = new AlgoGenetique<>(mock(Instance.class), mockCalculNextGen, mockICreator);
		IIndividu mockIIndividu1 = initMockIndividu(resultatAttendu, 50);
		IIndividu mockIIndividu2 = initMockIndividu(new Solution(), 1);
		when(mockICreator.creerPopInit(any(Instance.class), anyInt()))
				.thenReturn(new ArrayList<>(Arrays.asList(mockIIndividu1, mockIIndividu2)));

		assertSame(resultatAttendu, algoGenetique.run(2, 0));
		verify(mockICreator).creerPopInit(any(Instance.class), anyInt());
		verifyNoInteractions(mockCalculNextGen);
	}

	@Test
	public void testRun_AvecMock_utiliseUneFoisCalculNextGen() {
		Solution resultatAttendu = new Solution();
		ICreator<?> mockICreator = mock(ICreator.class);
		CroisementMutationV1 mockCalculNextGen = mock(CroisementMutationV1.class);
		AlgoGenetique<?> algoGenetique = new AlgoGenetique<>(mock(Instance.class), mockCalculNextGen, mockICreator);
		ArrayList<?> value = new ArrayList<>(
				Arrays.asList(initMockIndividu(resultatAttendu, 50), initMockIndividu(new Solution(), 1)));
		when(mockICreator.creerPopInit(any(Instance.class), anyInt())).thenReturn((ArrayList) value);
		when(mockCalculNextGen.calculerNextGen((ArrayList) value)).thenReturn((ArrayList) value);

		assertSame(resultatAttendu, algoGenetique.run(2, 1));
		verify(mockICreator).creerPopInit(any(Instance.class), anyInt());
		verify(mockCalculNextGen, times(1)).calculerNextGen((ArrayList) value);
	}

	private IIndividu initMockIndividu(Solution solution, int fitness) {
		IIndividu mockIIndividu = mock(IIndividu.class);
		when(mockIIndividu.evaluerFitness()).thenReturn(fitness);
		when(mockIIndividu.calculerSol()).thenReturn(solution);
		return mockIIndividu;
	}

}
