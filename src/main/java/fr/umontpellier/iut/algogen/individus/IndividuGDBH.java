package fr.umontpellier.iut.algogen.individus;

import java.util.ArrayList;
import java.util.Random;

import fr.umontpellier.iut.algogen.Coord;
import fr.umontpellier.iut.algogen.Instance;
import fr.umontpellier.iut.algogen.Solution;

/**
 * IndividuGDBH est la classe représentant un encodage consistant à créer k
 * mouvement aléatoire ou chaque mouvement peut prendre une des 4 direction : G,
 * D, H, B
 * 
 * @see IIndividu
 * @version 1.0
 */
public abstract class IndividuGDBH<T extends IndividuGDBH<T>> implements IIndividu<T> {
    protected Instance instance;
    public ArrayList<Character> trajet;

    public IndividuGDBH(Instance instance, ArrayList<Character> trajet) {

    }

    public IndividuGDBH(Instance instance) {

        normaliseTrajet();
    }

    public IndividuGDBH(Instance instance, Solution solution) {
    }

    /**
     * @param coordonnee : coordonnées du mouvement courant
     * @param direction  : mouvement prochain Calcule les coordonnées du mouvement c
     * @return les coordonnées de c
     * 
     **/
    static Coord calculerNextCoord(Coord coordonnee, char direction) {
        int prochaineLigne = coordonnee.getL();
        int prochaineColonne = coordonnee.getC();
        switch (direction) {
            case 'h':
                prochaineLigne--;
                break;
            case 'b':
                prochaineLigne++;
                break;
            case 'g':
                prochaineColonne--;
                break;
            case 'd':
                prochaineColonne++;
                break;
            default:
                break;
        }
        return new Coord(prochaineLigne, prochaineColonne);
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
        Coord coordonnee = instance.getStartingP();
        ArrayList<Character> nouveauTrajet = new ArrayList<>();
        for (char direction : trajet) {

            Coord next = calculerNextCoord(coordonnee, direction);
            if (next.estDansPlateau(instance.getNbL(), instance.getNbC())) {
                nouveauTrajet.add(direction);
                coordonnee = next;
            }
        }

        ArrayList<Character> directionPossible = new ArrayList<>();
        directionPossible.add('h');
        directionPossible.add('b');
        directionPossible.add('g');
        directionPossible.add('d');
        Random r = new Random();

        while (nouveauTrajet.size() < trajet.size()) {
            boolean ok = false;
            while (!ok) {
                char directionRandom = directionPossible.get(r.nextInt(4));
                Coord prochaineCoord = calculerNextCoord(coordonnee, directionRandom);
                if (prochaineCoord.estDansPlateau(instance.getNbL(), instance.getNbC())) {
                    nouveauTrajet.add(directionRandom);
                    coordonnee = prochaineCoord;
                    ok = true;
                }
            }

        }
        trajet = nouveauTrajet;
    }

}
