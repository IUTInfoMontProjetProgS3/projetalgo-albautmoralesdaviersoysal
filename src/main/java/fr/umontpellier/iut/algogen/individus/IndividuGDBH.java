package fr.umontpellier.iut.algogen.individus;

import java.util.ArrayList;

import fr.umontpellier.iut.algogen.Coord;
import fr.umontpellier.iut.algogen.Instance;
import fr.umontpellier.iut.algogen.Solution;
import fr.umontpellier.iut.algogen.outils.Direction;

/**
 * <b>IndividuGDBH est la classe représentant un encodage consistant à créer k
 * mouvement aléatoire où chaque mouvement peut prendre une des 4 direction : G,
 * D, H, B</b>
 * <p>
 * Un individu de type IndividuGDBH est caractérisé par les informations
 * suivantes :
 * </p>
 * <ul>
 * <li>L'instance du jeu {@code instance}.</li>
 * <li>Le trajet effectué {@code ArrayList<Character>} qui contient l'historique
 * des directions empruntés.</li>
 * </ul>
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
    protected Instance in;

    /**
     * Un {@code trajet} contient l'ensemble des directions emprunté par l'individu.
     * 
     * @see IndividuGDBH#IndividuGDBH(Instance, ArrayList)
     */
    public ArrayList<Character> t;

    public IndividuGDBH(Instance instance, ArrayList<Character> trajet) {
        this.t = trajet;
        this.in = instance;
    }

    /**
     * Constructeur IndividuGDBH.
     * <p>
     * A la construction d'un IndividuGDBH, le trajet est généré aléatoirement en
     * fonction de l'{@code instance} donnée en paramètre.
     * </p>
     * 
     * @param instance : instance du jeu
     * 
     * @see Instance
     * @see #initTrajetRandom()
     * @see #normaliseTrajet()
     */
    public IndividuGDBH(Instance instance) {
        this.in = instance;
        initTrajetRandom();
        normaliseTrajet();
    }

    /**
     * Constructeur IndividuGDBH.
     * <p>
     * A la construction d'un IndividuGDBH, le trajet est généré en fonction de la
     * {@code solution} donnée en paramètre.
     * </p>
     * 
     * @param instance : l'instance du jeu.
     * @param solution : la solution utilisé pour généré le trajet
     * 
     * @see #genereTrajetFromSolution(Solution)
     * @see Solution
     * @see Instance
     */
    public IndividuGDBH(Instance instance, Solution solution) {
        genereTrajetFromSolution(solution);
        this.in = instance;
    }

    private void initTrajetRandom() {
        t = new ArrayList<>();
        for (int i = 0; i < in.getK(); i++)
            t.add(Direction.directionRandom());
    }

    private void genereTrajetFromSolution(Solution solution) {
        t = convertieEnTrajet(solution);
    }

    /**
     * Renvoie la liste des directions emprunté en fonction de la {@code solution}
     * donnée en paramètre.
     * 
     * @param solution : solution devant être convertie.
     * 
     * @return une {@code ArrayList<Character>} de directions empruntées.
     * 
     * @see Direction#trouverDirectionEmprunte(Coord, Coord)
     * @see Solution
     */
    protected ArrayList<Character> convertieEnTrajet(Solution solution) {
        ArrayList<Character> result = new ArrayList<>();
        Coord coordCourant = solution.get(0);
        for (int i = 1; i < solution.size(); i++) {
            result.add(Direction.trouverDirectionEmprunte(coordCourant, solution.get(i)));
            coordCourant = solution.get(i);
        }
        return result;
    }

    /**
     * Renvoi les coordonnées {@code Coord} résultante après avoir faire un pas dans
     * la {@code direction} donnée en paramètre. A partir des coordonnée initial
     * {@code coordInitial} qui ont étaient données en paramètre.
     * 
     * @param coordInitial : coordonnées initial avant de faire un pas
     * @param direction    : la direction dans la quelle le pas doit être effectué
     * 
     * @return {@code Coord} les coordonnées final une fois le pas effectué
     * 
     * @see Coord
     * @see Direction#calculerProchaineCoord(Coord, char)
     **/
    static Coord calculerNextCoord(Coord coordInitial, char direction) {
        return Direction.calculerProchaineCoord(coordInitial, direction);
    }

    @Override
    public Instance getInstance() {
        return in;
    }

    @Override
    public String toString() {
        return t + "";
    }

    /**
     * Génére une {@link Solution} en fonction du trajet.
     * 
     * @return {@code Solution} les {@link Coord} obtenues à la suite du trajet.
     * 
     * @see #t
     * @see Solution
     **/
    @Override
    public Solution calculerSol() {
        Solution solution = new Solution();
        solution.add(in.getStartingP());
        Coord coordCourant = solution.get(0);
        for (char direction : t) {
            coordCourant = calculerNextCoord(coordCourant, direction);
            solution.add(coordCourant);
        }
        return solution;
    }

    /**
     * La fitness d'un individu est la fonction qui prend en compte le nombre de
     * pièces récoltées après le trajet.
     * 
     * @return {@code int} fitness
     * 
     * @see Instance#evaluerSolution(Solution)
     */
    @Override
    public int evaluerFitness() {
        return 1 + 10 * in.evaluerSolution(calculerSol());
    }

    /**
     * 
     * Normalise le trajet de l'individu.
     * 
     **/
    public void normaliseTrajet() {
        Coord coordonnee = in.getStartingP();
        ArrayList<Character> nouveauTrajet = new ArrayList<>();
        for (char direction : t) {

            Coord next = calculerNextCoord(coordonnee, direction);
            if (next.estDansPlateau(in.getNbL(), in.getNbC())) {
                nouveauTrajet.add(direction);
                coordonnee = next;
            }
        }
        while (nouveauTrajet.size() < t.size()) {
            boolean ok = false;
            while (!ok) {
                char directionRandom = Direction.directionRandom();
                Coord prochaineCoord = calculerNextCoord(coordonnee, directionRandom);
                if (prochaineCoord.estDansPlateau(in.getNbL(), in.getNbC())) {
                    nouveauTrajet.add(directionRandom);
                    coordonnee = prochaineCoord;
                    ok = true;
                }
            }
        }
        t = nouveauTrajet;
    }

}
