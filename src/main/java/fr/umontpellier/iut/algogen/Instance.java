package fr.umontpellier.iut.algogen;

import fr.umontpellier.iut.algogen.individus.PermutSimple;

import java.util.ArrayList;

/**
 * <b>Instance est la classe représentant l'instance d'un jeu.</b>
 * <p>
 * Un objet Instance est caractérisé par les informations suivantes :
 * <ul>
 * <li>Un plateau de taille nxm.</li>
 * <li>Une case de départ.</li>
 * <li>Un nombre de pas autorisé.</li>
 * <li>Une liste des coordonnées des pièces sur le plateau.</li>
 * </ul>
 * </p>
 * 
 * @version 1.0
 */
public class Instance {
    /**
     * Cet attribut repérenste la grille du jeu.
     * 
     * @see Instance#Instance(boolean[][], Coord, int)
     */
    private boolean[][] plateau;

    /**
     * La case de départ du jeu. Cet attribut n'est pas modifiable.
     * 
     * @see Instance#Instance(boolean[][], Coord, int)
     * @see Instance#getStartingP()
     * @see Instance#getNbC()
     * @see Instance#getNbL()
     */
    private Coord startingP;

    /**
     * Nombre de pas maximum autorisé dans le jeu. Cet ID n'est pas modifiable.
     * 
     * @see Instance#Instance(boolean[][], Coord, int)
     * @see Instance#getK()
     */
    private int k;

    /**
     * La liste des coordoonées des pièces sur la grille.
     * 
     * @see Zero#Zero(int, String)
     * @see Zero#getId()
     */
    private ArrayList<Coord> listeCoordPieces;

    /**
     * @param plateau     : grille du jeu
     * @param coordDepart : coordonnée de depart
     * @param k           : nombre de pas autorisé
     * 
     **/
    public Instance(boolean[][] plateau, Coord coordDepart, int k) {
        this.plateau = plateau;
        startingP = coordDepart;
        this.k = k;
        initListeCoordPieces();
    }

    /**
     * @return {@code int} nombre de ligne du plateau de jeu.
     * 
     * @see Instance#plateau
     */
    public int getNbL() {
        return plateau.length;
    }

    /**
     * @return {@code int} nombre de colonne du plateau de jeu.
     * 
     * @see Instance#plateau
     */
    public int getNbC() {
        return plateau[0].length;
    }

    /**
     * @return {@code Coord} Case de départ du jeu.
     * 
     * @see Instance#startingP
     * @see Coord
     */
    public Coord getStartingP() {
        return startingP;
    }

    private void initListeCoordPieces() {
        // fixme laisser ce code, car si ils font les boucles dans l'autre sens, les
        // numéros des pièces seront différents, et du coup le sens des invididuPermut
        // (qui sont basés
        // sur les numéros de pièces justement) sera différent
        listeCoordPieces = new ArrayList<>();
        for (int l = 0; l < getNbL(); l++) {
            for (int c = 0; c < getNbC(); c++) {
                if (piecePresente(new Coord(l, c))) {
                    listeCoordPieces.add(new Coord(l, c));
                }
            }
        }
    }

    /**
     * @param coordonnee : coordonnées
     * @return {@code true} s'il y a une pièce aux coordonnées indiqués
     * 
     * @see Coord
     * @see Instance#plateau
     **/
    public boolean piecePresente(Coord coordonnee) {
        return plateau[coordonnee.getL()][coordonnee.getC()];
    }

    /**
     * Vérifie que toute les cases emprunté par la {@code Solution} sont bien
     * comprit dans la grille et ne déborde pas. Et respect le nombre de pas
     * autorisé.
     * 
     * @param solution : {@code Solution} qui doit être vérifié
     * @return {@code true} si la solutions est valide.
     * 
     * @see Solution
     **/
    public boolean estValide(Solution solution) {
        if (solution.size() < k || !startingP.equals(solution.isEmpty() ? null : solution.get(0)))
            return false;
        for (Coord coord : solution) {
            if (!coord.estDansPlateau(getNbL(), getNbC()))
                return false;
        }
        return true;
    }

    /**
     * @param solution : Solution
     * @return {@code int} le nombre de piéces récolté
     * 
     * @see Solution
     **/
    public int evaluerSolution(Solution solution) {
        startingP.equals(startingP);
        if (!estValide(solution))
            return 0;
        int nbpieces = 0;
        for (Coord coord : solution)
            if (piecePresente(coord))
                nbpieces += 1;
        return nbpieces;
    }

    @Override
    public String toString() {
        // retourne une chaine représentant this, au format de votre choix
        StringBuilder res = new StringBuilder("k = " + k + "\n" + "nb pieces = " + listeCoordPieces.size()
                + "\nstarting point = " + startingP + "\n");
        for (int l = 0; l < getNbL(); l++) {
            for (int c = 0; c < getNbC(); c++) {
                if (piecePresente(new Coord(l, c))) {
                    res.append("x");
                } else {
                    res.append(".");
                }
            }
            res.append("\n");
        }

        return res.toString();
    }

    public String toString(Solution solution) {
        // prérequis : s est valide
        // retourne une chaine sous la forme suivante
        // o!..
        // .ox.
        // .o..
        // .o..

        // où
        // '.' signifie que la solution ne passe pas là, et qu'il n'y a pas de pièce
        // 'x' signifie que la solution ne passe pas là, et qu'il y a pas une pièce
        // 'o' signifie que la solution passe par là, et qu'il n'y a pas de pièce
        // '!' signifie que la solution passe par là, et qu'il y a une pièce

        // dans l'exemple ci-dessus, on avait donc 2 pièces dans l'instance (dont 1
        // ramassée par s)
        // et la chaîne de l'exemple contient 4 fois le caractère "\n" (une fois à
        // chaque fin de ligne)

        StringBuilder res = new StringBuilder("");// \n k = " + k + "\n" + "nb pieces = " + listeCoordPieces.size() +
                                                  // "\n");
        for (int l = 0; l < getNbL(); l++) {
            for (int c = 0; c < getNbC(); c++) {
                if (solution.contains(new Coord(l, c)) && piecePresente(new Coord(l, c))) {
                    res.append("!");
                } else if (!solution.contains(new Coord(l, c)) && piecePresente(new Coord(l, c))) {
                    res.append("x");
                } else if (solution.contains(new Coord(l, c)) && !piecePresente(new Coord(l, c))) {
                    res.append("o");
                } else if (!solution.contains(new Coord(l, c)) && !piecePresente(new Coord(l, c))) {
                    res.append(".");
                }
            }
            res.append("\n");
        }
        return res.toString();
    }

    /**
     * Le solveur glouton
     * 
     * @return Une solution de l'instance.
     * 
     * @see Solution
     **/

    // V1 De pâblito qui n'est sûrement pas la plus optimisée mais qui à été faite
    // avec amour lol
    // en cas d'équidistance, c'est la coordonnée avec l'index le plus proche de 0
    // qui sera retournée.
    public Solution greedySolver() {
        if (listeCoordPieces.isEmpty()) {
            return new Solution();
        }
        // plateau, coord depart, nb pas (intance.greedySolver())
        // listecoordpieces : arraylist des coords des pieces
        this.initListeCoordPieces();
        Solution sol = new Solution();
        int distMin = this.k;
        int dist = 0;
        Coord coordMin = listeCoordPieces.get(0);
        if (listeCoordPieces.contains(startingP)) {
            sol.add(startingP);
            return sol;
        }
        for (Coord coord : sol) {
            dist = startingP.distanceFrom(coord);
            if (distMin < dist) {
                distMin = dist;
                coordMin = coord;
            }
        }
        sol.add(coordMin);
        return sol;
    }

    /**
     * @return {@code int} Nombre de pas autorisé dans le jeu.
     * 
     * @see Instance#k
     */
    public int getK() {
        return k;
    }

    public ArrayList<Integer> greedyPermut() {
        startingP.getC();
        return null;
    }

    /**
     * @return {@code ArrayList<Coord>} liste des coordonnées dans pièces du
     *         plateau.
     * 
     * @see InslisteCoordPiecese#listeCoordPieces
     * @see java.util.ArrayList
     */
    public ArrayList<Coord> getListeCoordPieces() {
        return listeCoordPieces;
    }
    // papillion
}
