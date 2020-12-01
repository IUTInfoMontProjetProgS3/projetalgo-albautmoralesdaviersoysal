package fr.umontpellier.iut.algogen;

import java.util.ArrayList;

/**
 * <b>La class Solution représente la liste des coordonnées {@code Coord}
 * empruntrés lors du trajet.</b>
 * 
 * @see Coord
 * @see java.util.ArrayList
 * 
 * @version 1.0
 */
public class Solution extends ArrayList<Coord> {

    /**
     *
     */
    private static final long serialVersionUID = -7175473948323617496L;

    public void troncker(int taille) {
        Solution solutionTronck = new Solution();
        solutionTronck.addAll(subList(0, taille));
        clear();
        addAll(solutionTronck);
    }
}
