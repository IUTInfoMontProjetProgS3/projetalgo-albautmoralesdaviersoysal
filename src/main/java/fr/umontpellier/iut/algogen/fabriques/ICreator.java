package fr.umontpellier.iut.algogen.fabriques;

import fr.umontpellier.iut.algogen.Instance;
import fr.umontpellier.iut.algogen.individus.IIndividu;

import java.util.ArrayList;

public abstract class ICreator<T extends IIndividu<T>> {

    public ArrayList<T> creerPopInit(Instance in, int n) {
        //retourne une population de n individus créés grâce à la méthode create

        ArrayList<T> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            res.add(create(in));
        }
        return res;
    }

    protected abstract T create(Instance in);
}



