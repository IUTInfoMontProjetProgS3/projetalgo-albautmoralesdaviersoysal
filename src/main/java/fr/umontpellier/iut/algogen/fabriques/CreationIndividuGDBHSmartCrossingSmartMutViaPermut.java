package fr.umontpellier.iut.algogen.fabriques;

import fr.umontpellier.iut.algogen.Instance;
import fr.umontpellier.iut.algogen.individus.GDBHSmartCrossingSmartMut;

/**
 * <b>CreationIndividuGDBHSmartCrossingSmartMutViaPermut est la classe qui
 * permet de fabriquer des individus de type
 * {@link GDBHSmartCrossingSmartMut}.</b>
 * <p>
 * Sa spécificité réside dans le fait qu'il utilise le <strong> permut </strong>
 * </p>
 * 
 * @see ICreator
 * @see GDBHSmartCrossingSmartMut
 * 
 * @version 1.0
 */
public class CreationIndividuGDBHSmartCrossingSmartMutViaPermut extends ICreator<GDBHSmartCrossingSmartMut> {

    /**
     * Fabrique un individu de type {@link GDBHSmartCrossingSmartMut} en fonction de
     * l'instance de jeu donnée en paramètre.
     * 
     * @return Un individu {@link GDBHSmartCrossingSmartMut}.
     * 
     * @see Instance
     * @see GDBHSmartCrossingSmartMut#GDBHSmartCrossingSmartMut(Instance)
     */
    @Override
    protected GDBHSmartCrossingSmartMut create(Instance instance) {
        return new GDBHSmartCrossingSmartMut(instance);
    }
}
