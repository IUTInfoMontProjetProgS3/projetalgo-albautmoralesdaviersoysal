package fr.umontpellier.iut.algogen.individus;

import fr.umontpellier.iut.algogen.Instance;
import fr.umontpellier.iut.algogen.Solution;

public interface IIndividu<T extends IIndividu<T>> {
    public Solution calculerSol();

    public int evaluerFitness();

    public T calculerCroisement(T i2);

    public T calculerMutation();

    public Instance getInstance();

   

}

