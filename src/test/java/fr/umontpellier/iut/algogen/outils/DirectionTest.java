package fr.umontpellier.iut.algogen.outils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import fr.umontpellier.iut.algogen.Coord;
import fr.umontpellier.iut.algogen.Instance;

class DirectionTest {
    @ParameterizedTest(name = "Vérifie que la méthode retourne bien des coordonné valide pour {0}")
    @MethodSource("genererArgumentsPourtestGetCoordAdjacent")
    void testGetCoordAdjacent(Coord coordActuelle) {
        Instance instance = new Instance(new boolean[5][5], new Coord(0, 0), 50);
        assertTrue(Direction.getCoordAdjacentValide(coordActuelle, instance).estDansPlateau(instance.getNbL(),
                instance.getNbC()));
    }

    private static Stream<Arguments> genererArgumentsPourtestGetCoordAdjacent() {
        return Stream.of(//
                Arguments.of(new Coord(0, 0)), //
                Arguments.of(new Coord(4, 0)), //
                Arguments.of(new Coord(0, 4)), //
                Arguments.of(new Coord(4, 4)));
    }

    @ParameterizedTest(name = "Vérifie que la Coord resultante est bien {2} losque la Coord de départ est {0} avec une direction {1}")
    @MethodSource("genererArgumentsPourtestCalculerProchaineCoord")
    void testCalculerProchaineCoord(Coord coordActuelle, char direction, Coord resultatAttendu) {
        assertEquals(resultatAttendu, Direction.calculerProchaineCoord(coordActuelle, direction));
    }

    private static Stream<Arguments> genererArgumentsPourtestCalculerProchaineCoord() {
        return Stream.of(//
                Arguments.of(new Coord(0, 0), Direction.BAS, new Coord(-1, 0)), //
                Arguments.of(new Coord(0, 0), Direction.HAUT, new Coord(1, 0)), //
                Arguments.of(new Coord(0, 0), Direction.DROITE, new Coord(0, -1)), //
                Arguments.of(new Coord(0, 0), Direction.GAUCHE, new Coord(0, 1)));
    }
}
