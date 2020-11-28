package fr.umontpellier.iut.algogen.outils;

import static org.junit.Assert.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import fr.umontpellier.iut.algogen.Coord;
import fr.umontpellier.iut.algogen.Solution;

class PetitPoucetTest {

    @ParameterizedTest(name = "Le chemin le plus court qui commence de la coordonnée {0} et finit à {1} doit être de taille {2}")
    @MethodSource("genererArgumentsPourtestPlusCourtChemin")
    void testPlusCourtChemin_avecTaille(Coord coordDepart, Coord coordArrivee, int tailleAttendu) {
        assertEquals(tailleAttendu, PetitPoucet.getPlusCourtChemin(coordDepart, coordArrivee).size());
    }

    private static Stream<Arguments> genererArgumentsPourtestPlusCourtChemin() {
        return Stream.of(//
                Arguments.of(new Coord(0, 0), new Coord(0, 0), 0), //
                Arguments.of(new Coord(0, 0), new Coord(5, 5), 10), //
                Arguments.of(new Coord(0, 0), new Coord(5, 0), 5), //
                Arguments.of(new Coord(5, 0), new Coord(5, 5), 5), //
                Arguments.of(new Coord(5, 5), new Coord(0, 0), 10), //
                Arguments.of(new Coord(0, 0), new Coord(0, 5), 5));
    }

    @Test
    void testPlusCourtCheminLigneDroite() {
        Solution resultatAttendu = new Solution();
        resultatAttendu.add(new Coord(1, 0));
        resultatAttendu.add(new Coord(2, 0));
        resultatAttendu.add(new Coord(3, 0));
        assertEquals(resultatAttendu, PetitPoucet.getPlusCourtChemin(new Coord(0, 0), new Coord(3, 0)));
    }
}
