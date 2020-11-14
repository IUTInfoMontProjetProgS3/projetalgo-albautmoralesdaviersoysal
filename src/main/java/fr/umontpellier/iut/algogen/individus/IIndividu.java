package fr.umontpellier.iut.algogen.individus;

import fr.umontpellier.iut.algogen.Instance;
import fr.umontpellier.iut.algogen.Solution;

/**
 * Individu est l'interface représentant un chemin dans la grille depuis un
 * point de depart et termine après k pas.
 * 
 * @version 1.0
 */
public interface IIndividu<T extends IIndividu<T>> {

    /**
     * Un individu génére une solution en fonction de son encodage.
     * 
     * @return {@code Solution} solution
     * @see Solution
     */
    public Solution calculerSol();

    /**
     * La fitness d'un individu est la fonction qui prend en compte le nombre de
     * pièces récolté après le trajet.
     * 
     * @return {@code int} fitness
     */
    public int evaluerFitness();

    public T calculerCroisement(T individu2);

    public T calculerMutation();

    public Instance getInstance();

}
