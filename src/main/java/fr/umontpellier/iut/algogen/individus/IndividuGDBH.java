package fr.umontpellier.iut.algogen.individus;

import fr.umontpellier.iut.algogen.Coord;
import fr.umontpellier.iut.algogen.Instance;
import fr.umontpellier.iut.algogen.Solution;

import java.util.ArrayList;
import java.util.Random;


public abstract class IndividuGDBH<T extends IndividuGDBH<T>> implements IIndividu<T> {
    protected  Instance inst;
    public ArrayList<Character> trajet;

    public IndividuGDBH(Instance in, ArrayList<Character> t) {
        
    }

    public IndividuGDBH(Instance in) {
        
        normaliseTrajet();
    }

    public IndividuGDBH(Instance in, Solution s) {
    }
    /**
     * @param cour : coordonnées du mouvement courant
     * @param c : mouvement prochain
     * Calcule les coordonnées du mouvement c
     * @return les coordonnées de c
     * 
    **/
    static Coord calculerNextCoord(Coord cour, char c) {
        int nextL = cour.getL();
        int nextC = cour.getC();
        if (c == 'h') {
            nextL--;
        }
        if (c == 'b') {
            nextL++;
        }
        if (c == 'g') {
            nextC--;
        }
        if (c == 'd') {
            nextC++;
        }
        return new Coord(nextL, nextC);
    }

    @Override
    public Instance getInstance() {
        return null;
    }

    @Override
    public String toString() {
        return trajet + "";
    }
    /**
     * 
     * @return les coordonnées des k mouvements comme solution.
     * 
    **/
    @Override
    public Solution calculerSol() {
      return new Solution();
    }
    /**
     * 
     * @return la valeur fitness de l'individu comme dans le texte du TD
     * 
    **/
    @Override
    public int evaluerFitness() {
        return 0;
    }
    /**
     * 
     * Normalise le trajet de l'individu.
     * 
    **/
    public void normaliseTrajet() {
        Coord cour = inst.getStartingP();
        ArrayList<Character> newL = new ArrayList<>();
        for (char c : trajet) {

            Coord next = calculerNextCoord(cour, c);
            if (next.estDansPlateau(inst.getNbL(), inst.getNbC())) {
                newL.add(c);
                cour = next;
            }
        }

        ArrayList<Character> dictio = new ArrayList<>();
        dictio.add('h');
        dictio.add('b');
        dictio.add('g');
        dictio.add('d');
        Random r = new Random();

        while (newL.size() < trajet.size()) {
            boolean ok = false;
            while (!ok) {
                char cc = dictio.get(r.nextInt(4));
                Coord next = calculerNextCoord(cour, cc);
                if (next.estDansPlateau(inst.getNbL(), inst.getNbC())) {
                    newL.add(cc);
                    cour = next;
                    ok = true;
                }
            }

        }
        trajet = newL;
    }

}
