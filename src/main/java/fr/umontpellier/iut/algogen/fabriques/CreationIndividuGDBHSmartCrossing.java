package fr.umontpellier.iut.algogen.fabriques;

import fr.umontpellier.iut.algogen.Instance;
import fr.umontpellier.iut.algogen.individus.GDBHSmartCrossing;

/**
 * <b>CreationIndividuGDBHSmartCrossing est la classe qui permet de fabriquer
 * des individus de type {@link GDBHSmartCrossing}.</b>
 * 
 * @see ICreator
 * @see GDBHSmartCrossing
 * 
 * @version 1.0.1
 */
public class CreationIndividuGDBHSmartCrossing extends ICreator<GDBHSmartCrossing> {

    /**
     * Fabrique un individu de type {@link GDBHSmartCrossing} en fonction du
     * l'instance de jeu donnée en paramètre.
     * 
     * @return Un individu {@link GDBHSmartCrossing}.
     * 
     * @see GDBHSmartCrossing
     * @see Instance
     * 
     * @since 1.0.1
     */
    @Override
    protected GDBHSmartCrossing create(Instance instance) {
        return new GDBHSmartCrossing(instance);
    }
}
