package fr.umontpellier.iut.algogen;

import fr.umontpellier.iut.algogen.individus.PermutSimple;

import java.util.ArrayList;

public class Instance {
    private  Coord startingP; 
    private  int k; 
    private boolean[][] plateau; 
    private ArrayList<Coord> listeCoordPieces;
    /**
     * @param p : grille du jeu
     * @param s : coordonnée de depart 
     * @param kk : nombre de pas autorisé 
     * 
    **/
    public Instance(boolean[][] p, Coord s, int kk) {
       
    }


    public int getNbL() {
        return plateau.length;
    }

    public int getNbC() {
        return plateau[0].length;
    }

    public Coord getStartingP() {
        return startingP;
    }


    private void initListeCoordPieces() {
        //fixme laisser ce code, car si ils font les boucles dans l'autre sens, les numéros des pièces seront différents, et du coup le sens des invididuPermut (qui sont basés
        //sur les numéros de pièces justement) sera différent
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
     * @param c : coordonnées
     *@return vrai si la piéce de coordonées c est presente dans la grille
     * 
    **/
    public boolean piecePresente(Coord c) {
    	return false;
    }
    /**
     * @param s : Solution
     *@return vrai la solutions est valide, c-a-d depuis le point de départ on a fait k pas sans sortir de la grille.
     * 
    **/
    public boolean estValide(Solution s) {
    return false;
    }
    /**
     * @param s : Solution
     *@return le nombre de piéces récolté
     * 
    **/

    public int evaluerSolution(Solution s) {
       return 0;
    }

    @Override
    public String toString() {
       //retourne une chaine représentant this, au format de votre choix
        StringBuilder res = new StringBuilder("k = " + k + "\n" + "nb pieces = " + listeCoordPieces.size() + "\nstarting point = " + startingP + "\n");
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

    public String toString(Solution s) {
        //prérequis : s est valide
        //retourne une chaine sous la forme suivante
        //o!..
        //.ox.
        //.o..
        //.o..

        //où
        // '.' signifie que la solution ne passe pas là, et qu'il n'y a pas de pièce
        // 'x' signifie que la solution ne passe pas là, et qu'il y a pas une pièce
        // 'o' signifie que la solution passe par là, et qu'il n'y a pas de pièce
        // '!' signifie que la solution passe par là, et qu'il y a une pièce

        // dans l'exemple ci-dessus, on avait donc 2 pièces dans l'instance (dont 1 ramassée par s)
        //et la chaîne de l'exemple contient 4 fois le caractère "\n" (une fois à chaque fin de ligne)

        StringBuilder res = new StringBuilder("");//\n k = " + k + "\n" + "nb pieces = " + listeCoordPieces.size() + "\n");
        for (int l = 0; l < getNbL(); l++) {
            for (int c = 0; c < getNbC(); c++) {
                if (s.contains(new Coord(l, c)) && piecePresente(new Coord(l, c))) {
                    res.append("!");
                }
                if (!s.contains(new Coord(l, c)) && piecePresente(new Coord(l, c))) {
                    res.append("x");
                }
                if (s.contains(new Coord(l, c)) && !piecePresente(new Coord(l, c))) {
                    res.append("o");
                }
                if (!s.contains(new Coord(l, c)) && !piecePresente(new Coord(l, c))) {
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
     *@return Une solution de l'instance.
    **/
    public Solution greedySolver() {
       return new Solution();
    }


	public int getK() {
		// TODO Auto-generated method stub
		return 0;
	}


	public ArrayList<Integer> greedyPermut() {
		// TODO Auto-generated method stub
		return null;
	}


	public ArrayList<Coord> getListeCoordPieces() {
		// TODO Auto-generated method stub
		return null;
	}

   

}
