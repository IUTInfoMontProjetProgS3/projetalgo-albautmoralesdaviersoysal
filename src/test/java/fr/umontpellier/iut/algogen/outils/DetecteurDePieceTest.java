package fr.umontpellier.iut.algogen.outils;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import fr.umontpellier.iut.algogen.Coord;
import fr.umontpellier.iut.algogen.Instance;

class DetecteurDePieceTest {

    @ParameterizedTest(name = "Lorsque l'on cherche la pièce la plus proche parmis {2} depuis les coordonées {0} doit retourner les coordonné de la pièce {1}")
    @MethodSource("genererArgumentsPourtestGetPieacePlusProche")
    void testGetPieacePlusProche(Coord coordCourante, Coord coordPieceAttendu, HashSet<Coord> pieces) {
        assertEquals(coordPieceAttendu, DetecteurDePiece.getPiecePlusProcheFrom(coordCourante, pieces));
    }

    private static Stream<Arguments> genererArgumentsPourtestGetPieacePlusProche() {
        return Stream.of(//
                Arguments.of(new Coord(0, 0), new Coord(0, 0), list(new Coord(0, 0))), //
                Arguments.of(new Coord(0, 0), new Coord(2, 1), list(new Coord(2, 1), new Coord(2, 3))), //
                Arguments.of(new Coord(2, 3), new Coord(2, 4), list(new Coord(2, 1), new Coord(2, 4))), //
                Arguments.of(new Coord(5, 5), new Coord(2, 4), list(new Coord(2, 1), new Coord(2, 4))), //
                Arguments.of(new Coord(2, 2), new Coord(2, 1), list(new Coord(2, 1), new Coord(2, 4))));
    }

    private static HashSet<Coord> list(Coord... coords) {
        return new HashSet<>(Arrays.asList(coords));
    }
}
