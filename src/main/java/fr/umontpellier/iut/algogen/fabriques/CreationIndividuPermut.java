package fr.umontpellier.iut.algogen.fabriques;

import fr.umontpellier.iut.algogen.Instance;
import fr.umontpellier.iut.algogen.individus.PermutSimple;

/**
 * <b>CreationIndividuPermut est la classe qui permet de fabriquer des individus
 * de type {@link PermutSimple}.</b>
 * 
 * @see ICreator
 * @see PermutSimple
 * 
 * @version 1.0
 */
public class CreationIndividuPermut extends ICreator<PermutSimple> {

    /**
     * Fabrique un individu de type {@link PermutSimple} en fonction de l'instance
     * du jeu donnée en paramètre.
     * 
     * @return Un individu {@link PermutSimple}
     * 
     * @see PermutSimple
     * @see Instance
     */
    @Override
    protected PermutSimple create(Instance instance) {
        return new PermutSimple(instance);
    }
}
