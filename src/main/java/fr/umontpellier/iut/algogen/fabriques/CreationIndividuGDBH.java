package fr.umontpellier.iut.algogen.fabriques;

import fr.umontpellier.iut.algogen.Instance;
import fr.umontpellier.iut.algogen.individus.GDBHSimple;

/**
 * <b>CreationIndividuGDBH est la classe qui permet de fabriquer des individus
 * de type {@link GDBHSimple}.</b>
 * 
 * @see ICreator
 * @see GDBHSimple
 * 
 * @version 1.0
 */
public class CreationIndividuGDBH extends ICreator<GDBHSimple> {

    /**
     * Fabrique un individu de type {@link GDBHSimple} en fonction de l'instance du
     * jeu donnée en paramètre.
     * 
     * @return Un individu {@link GDBHSimple}.
     * 
     * @see GDBHSimple
     * @see Instance
     */
    @Override
    protected GDBHSimple create(Instance instance) {
        return new GDBHSimple(instance);
    }
}
