package fr.umontpellier.iut.algogen.individus;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;

import fr.umontpellier.iut.algogen.Instance;
import fr.umontpellier.iut.algogen.Solution;
import fr.umontpellier.iut.algogen.outils.Direction;

/**
 * GDBHSmartCrossingSmartMut est la classe représentant une fonctionnalité de
 * croisement idantique à {@link GDBHSmartCrossing} mais avec une mutation plus
 * intéligente.
 * 
 * @see IndividuGDBH
 * @version 1.0.1
 */
public class GDBHSmartCrossingSmartMut extends IndividuGDBH<GDBHSmartCrossingSmartMut> {

    public GDBHSmartCrossingSmartMut(Instance instance, ArrayList<Character> trajet) {
        super(instance, trajet);
    }

    public GDBHSmartCrossingSmartMut(Instance instance) {
        super(instance);
    }

    public GDBHSmartCrossingSmartMut(Instance instance, Solution solution) {
        super(instance, solution);
    }

    /**
     * @param direction : Une direction
     * 
     * @return L'inverse de la direction.
     * 
     * @since 1.0.1
     * 
     **/
    private static char inv(char direction) {
        return Direction.inverse(direction);
    }

    /**
     * Cette fonction est la même que
     * {@link GDBHSmartCrossing#calculerCroisement(GDBHSmartCrossing)}
     * 
     * @param individu2 : Un deuxieme individu
     * @return un individu fils de type GDBHSmartCrossingSmartMut.
     * 
     * @see GDBHSmartCrossing#calculerCroisement(GDBHSmartCrossing)
     **/
    public GDBHSmartCrossingSmartMut calculerCroisement(GDBHSmartCrossingSmartMut individu2) {
        GDBHSmartCrossing iSmartCrossing1 = new GDBHSmartCrossing(instance, trajet);
        GDBHSmartCrossing iSmartCrossing2 = new GDBHSmartCrossing(individu2.instance, individu2.trajet);
        return new GDBHSmartCrossingSmartMut(instance, iSmartCrossing1.calculerCroisement(iSmartCrossing2).trajet);
    }

    /**
     * Mettre direction2 dans l'indice x et mettre direction1 dans l'indice x+1 et
     * enlever deux directions a la fin.
     * 
     * @param indice     : Un indice
     * @param direction1 : Un premier Mouvement
     * @param direction2 : Un deuxieme Mouvement
     * 
     **/
    public void mutationAux(int indice, char direction1, char direction2) {
        insererAvecSupressionDuDernier(indice + 1, direction2);
        insererAvecSupressionDuDernier(indice, direction1);
    }

    private void insererAvecSupressionDuDernier(int indice, char direction) {
        trajet.add(indice, direction);
        trajet.remove(trajet.size() - 1);
    }

    /**
     * Faire la mutation intelligente de this comme dans le texte.
     * 
     * @return un individu fils muté de type GDBHSimple.
     * 
     **/
    public GDBHSmartCrossingSmartMut calculerMutation() {
        GDBHSmartCrossingSmartMut individuMute = new GDBHSmartCrossingSmartMut(instance, new ArrayList<>(trajet));
        int p = indexRandom();
        if (individuMute.trajet.get(p - 1).equals(individuMute.trajet.get(p))) {
            if (individuMute.trajet.get(p).equals(individuMute.trajet.get(p + 1)))
                individuMute.mutationAux(p - 1, inv(individuMute.trajet.get(p)), inv(individuMute.trajet.get(p)));
            else
                Collections.swap(individuMute.trajet, p, p + 1);
        } else
            Collections.swap(individuMute.trajet, p - 1, p);
        return individuMute;
    }

    private int indexRandom() {
        return new SecureRandom().nextInt(instance.getK() - 2) + 1;
    }
}
