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

    @ParameterizedTest(name = "Lorsque l'on cherche la pièce la plus proche depuis les coordonées {0} doit retourner les coordonné de la pièce {1}")
    @MethodSource("genererArgumentsPourtestGetPieacePlusProche")
    void testGetPieacePlusProche(Coord coordCourante, Coord coordPieceAttendu) {
        boolean[][] plateau = new boolean[][] { // Disposition des pièces :
                { false, false, false, false, false }, // l0: . . . . .
                { false, false, false, false, false }, // l1: . . . . .
                { false, true, false, false, true }, // ,,l2: . o . . o
                { false, false, false, false, false }, // l3: . . . . .
                { false, false, false, false, false } // ,l4: . . . . .
        };
        Coord coordDepart = new Coord(0, 0);
        int k = 3;
        Instance instance = new Instance(plateau, coordDepart, k);
        DetecteurDePiece detecteurDePiece = new DetecteurDePiece(instance);
        assertEquals(coordPieceAttendu, detecteurDePiece.getPiecePlusProcheFrom(coordCourante));
    }

    private static Stream<Arguments> genererArgumentsPourtestGetPieacePlusProche() {
        return Stream.of(//
                Arguments.of(new Coord(0, 0), new Coord(2, 1)), //
                Arguments.of(new Coord(2, 3), new Coord(2, 4)), //
                Arguments.of(new Coord(5, 5), new Coord(2, 4)), //
                Arguments.of(new Coord(2, 2), new Coord(2, 1)));
    }

    @ParameterizedTest(name = "Lorsque l'on cherche la pièce la plus proche depuis les coordonées {0} avec {2} pièces déjà visitées la méthode doit retourner les coordonné de la pièce {1}")
    @MethodSource("genererArgumentsPourtestGetPieceNonRecolteePlusProcheFrom")
    void testGetPieceNonRecolteePlusProcheFrom(Coord coordActuelle, Coord resultatAttendu,
            HashSet<Coord> piecesRecolte) {
        boolean[][] plateau = new boolean[][] { // Disposition des pièces :
                { false, false, false, false, false }, // l0: . . . . .
                { false, false, false, false, false }, // l1: . . . . .
                { false, true, false, false, true }, // ,,l2: . o . . o
                { false, false, false, false, false }, // l3: . . . . .
                { false, false, false, false, false } // ,l4: . . . . .
        };
        Coord coordDepart = new Coord(0, 0);
        int k = 3;
        Instance instance = new Instance(plateau, coordDepart, k);
        DetecteurDePiece detecteurDePiece = new DetecteurDePiece(instance);
        assertEquals(resultatAttendu, detecteurDePiece.getPieceNonRecolteePlusProcheFrom(coordActuelle,piecesRecolte));
    }

    private static Stream<Arguments> genererArgumentsPourtestGetPieceNonRecolteePlusProcheFrom() {
        return Stream.of(//
                Arguments.of(new Coord(0, 0), new Coord(2, 4), list(new Coord(2, 1))), //
                Arguments.of(new Coord(2, 3), new Coord(2, 4), list(new Coord(2, 1))), //
                Arguments.of(new Coord(5, 5), new Coord(2, 1), list(new Coord(2, 4))), //
                Arguments.of(new Coord(2, 2), new Coord(2, 4), list(new Coord(2, 1))));
    }

    private static HashSet<Coord> list(Coord... coords) {
        return new HashSet<>(Arrays.asList(coords));
    }
}
