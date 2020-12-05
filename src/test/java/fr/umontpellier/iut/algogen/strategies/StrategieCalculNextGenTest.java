package fr.umontpellier.iut.algogen.strategies;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyCollection;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import fr.umontpellier.iut.algogen.individus.IIndividu;

class StrategieCalculNextGenTest {

    @Test
    void test_selectionParants() {
        StrategieCalculNextGen calculGen = Mockito.mock(StrategieCalculNextGen.class);
        IIndividu<?> individu1 = mockIndividu(5);
        IIndividu<?> individu2 = mockIndividu(7);
        ArrayList pop = new ArrayList<>(Arrays.asList(individu1, individu2));

        when(calculGen.selectionParents(pop)).thenCallRealMethod();
        when(calculGen.selectionRoulette((ArrayList) anyList())).thenCallRealMethod();
        ArrayList selectionParents = calculGen.selectionParents(pop);

        assertTrue(selectionParents.contains(individu1));
        assertTrue(selectionParents.contains(individu2));
        assertEquals(2, selectionParents.size());
    }

    private IIndividu mockIndividu(int fitness) {
        IIndividu individu = mock(IIndividu.class);
        when(individu.evaluerFitness()).thenReturn(fitness);
        return individu;
    }

}
