package fr.umontpellier.iut.algogen.individus;

import java.util.ArrayList;

import fr.umontpellier.iut.algogen.Coord;
import fr.umontpellier.iut.algogen.Instance;
import fr.umontpellier.iut.algogen.Solution;
import fr.umontpellier.iut.algogen.outils.Direction;

/**
 * <b>IndividuGDBH est la classe représentant un encodage consistant à créer k
 * mouvement aléatoire ou chaque mouvement peut prendre une des 4 direction : G,
 * D, H, B</b>
 * <p>
 * Un individu de type IndividuGDBH est caractérisé par les informations
 * suivantes :
 * <ul>
 * <li>L'instance du jeu {@code instance}.</li>
 * <li>Du trajet effectué {@code ArrayList<Character>}.</li>
 * </ul>
 * </p>
 * <p>
 * De plus, IndividuGDBH possède une méthode permettant de normaliser un trajet.
 * </p>
 * 
 * @see IIndividu
 * @version 1.0.3
 */
public abstract class IndividuGDBH<T extends IndividuGDBH<T>> implements IIndividu<T> {

    /**
     * Cet attribut représente l'instance du jeu.
     * 
     * @see IndividuGDBH#IndividuGDBH(Instance)
     * @see IndividuGDBH#IndividuGDBH(Instance, ArrayList)
     * @see IndividuGDBH#IndividuGDBH(Instance, Solution)
     */
    protected Instance instance;

    /**
     * Un {@code trajet} contient l'ensemble des directions emprunté par l'individu.
     * 
     * @see IndividuGDBH#IndividuGDBH(Instance, ArrayList)
     */
    public ArrayList<Character> trajet;

    public IndividuGDBH(Instance instance, ArrayList<Character> trajet) {
        this.trajet = trajet;
        this.instance = instance;
    }

    public IndividuGDBH(Instance instance) {
        this.instance = instance;
        initTrajetRandom();
        normaliseTrajet();
    }

    public IndividuGDBH(Instance instance, Solution solution) {
        genereTrajetFromSolution(solution);
        this.instance = instance;
    }

    private void initTrajetRandom() {
        trajet = new ArrayList<>();
        for (int i = 0; i < instance.getK(); i++)
            trajet.add(Direction.directionRandom());
    }

    private void genereTrajetFromSolution(Solution solution) {
        trajet = new ArrayList<>();
        Coord coordCourant = solution.get(0);
        for (int i = 1; i < solution.size(); i++) {
            trajet.add(Direction.trouverDirectionEmprunte(coordCourant, solution.get(i)));
            coordCourant = solution.get(i);
        }
    }

    /**
     * Renvoi les coordonnées {@code Coord} résultante après avoir faire un pas dans
     * la {@code direction} donnée en paramètre. A partir des coordonnée initial
     * {@code coordInitial} qui ont étaient données en paramètre.
     * 
     * @param coordInitial : coordonnées initial avant de faire un pas
     * @param direction    : la direction dans la quelle le pas doit être effectué
     * @return {@code Coord} les coordonnées final une fois le pas effectué
     * 
     **/
    static Coord calculerNextCoord(Coord coordInitial, char direction) {
        return Direction.calculerProchaineCoord(coordInitial, direction);
    }

    @Override
    public Instance getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return trajet + "";
    }

    /**
     * 
     * @return {@code Solution} les coordonnées des k mouvements comme solution.
     * 
     * @see Solution
     **/
    @Override
    public Solution calculerSol() {
        Solution solution = new Solution();
        solution.add(instance.getStartingP());
        Coord coordCourant = solution.get(0);
        for (char direction : trajet) {
            coordCourant = calculerNextCoord(coordCourant, direction);
            solution.add(coordCourant);
        }
        return solution;
    }

    /**
     * La fitness d'un individu est la fonction qui prend en compte le nombre de
     * pièces récolté après le trajet.
     * 
     * @return {@code int} fitness
     */
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
        while (nouveauTrajet.size() < trajet.size()) {
            boolean ok = false;
            while (!ok) {
                char directionRandom = Direction.directionRandom();
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
