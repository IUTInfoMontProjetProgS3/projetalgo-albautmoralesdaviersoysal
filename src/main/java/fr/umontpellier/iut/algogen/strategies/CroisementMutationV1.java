package fr.umontpellier.iut.algogen.strategies;

import fr.umontpellier.iut.algogen.individus.IIndividu;

import java.util.ArrayList;
import java.util.Random;

public class CroisementMutationV1<T extends IIndividu<T>> extends StrategieCalculNextGen<T> {

    private double pmutation;

    public CroisementMutationV1(double pmut){
    }
    /**
     * @param pop : Une population
     * @return une nouvelle generation qui contient les meilleurs individu de pop 
     * ainsi que des individu fils. 
     * 
    **/
    @Override
    public ArrayList<T> calculerNextGen(ArrayList<T> pop) {
      
        return null;
    }


}
