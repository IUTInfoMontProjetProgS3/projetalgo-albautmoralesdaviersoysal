package fr.umontpellier.iut.algogen.individus;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;

import fr.umontpellier.iut.algogen.Instance;
import fr.umontpellier.iut.algogen.Solution;

/**
 * GDBHsimple est la classe représentant une fonctionnalité de croisement
 * mutation basique.
 * 
 * @see IndividuGDBH
 * @version 1.0.5
 */
public class GDBHSimple extends IndividuGDBH<GDBHSimple> {
    public GDBHSimple(Instance instance, ArrayList<Character> trajet) {
        super(instance, trajet);
    }

    public GDBHSimple(Instance instance) {
        super(instance);
    }

    public GDBHSimple(Instance instance, Solution solution) {
        super(instance, solution);
    }

    /**
     * Les individus {@code this} et {@code individu2} sont croisés avec des
     * partitions de taille aléatoire, puis l'individu résultant est normalisé.
     * 
     * @param individu2 : individu avec le quel le croisement doit être opéré
     * 
     * @return un individu fils de type GDBHSimple.
     * 
     * @since 1.0.5
     **/
    public GDBHSimple calculerCroisement(GDBHSimple individu2) {
        int indexSeparation = indexRandom();
        ArrayList<Character> trajetFils = new ArrayList<>(trajet.subList(0, indexSeparation));
        trajetFils.addAll(individu2.trajet.subList(indexSeparation, trajet.size()));
        GDBHSimple croise = new GDBHSimple(instance, trajetFils);
        croise.normaliseTrajet();
        return croise;
    }

    /**
     * Permute aléatoirement deux index entre eux. Et normalise celui-ci.
     * 
     * @return un individu muté de type GDBHSimple.
     * 
     * @since 1.0.5
     **/
    public GDBHSimple calculerMutation() {
        ArrayList<Character> trajetMute = new ArrayList<>(trajet);
        Collections.swap(trajetMute, indexRandom(), indexRandom());
        GDBHSimple mute = new GDBHSimple(instance, trajetMute);
        mute.normaliseTrajet();
        return mute;
    }

    private int indexRandom() {
        return new SecureRandom().nextInt(trajet.size());
    }

}