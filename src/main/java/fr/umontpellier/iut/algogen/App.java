package fr.umontpellier.iut.algogen;

import fr.umontpellier.iut.algogen.fabriques.*;
import fr.umontpellier.iut.algogen.individus.*;

import java.util.Random;
//test ~ pablito

class App {

    public static void main(String[] args) {

        boolean[][] p = { { true, false, false, false, true }, { false, false, false, false, false },
                { false, false, false, true, false }, };

        Coord sp = new Coord(2, 2);
        int k = 4;
        Instance in1 = new Instance(p, sp, k);
        System.out.println(in1);

        /////////////////////////////////////////////////
        // définition des instances ////////////////////
        /////////////////////////////////////////////////
        boolean[][] p0 = new boolean[10][10];
        for (int i = 0; i < p0.length; i++) {
            for (int j = 0; j < p0[0].length; j += 2) {

                p0[i][j] = true;

            }
        }
        Coord sp0 = new Coord(9, 5);
        int k0 = p0.length * p0.length / 10;
        Instance in0 = new Instance(p0, sp0, k0);
        System.out.println("in0 \n" + in0);

        // in2 : avec pieces dans la diagonale
        boolean[][] p2 = new boolean[40][40];
        for (int i = 0; i < p2.length; i++) {
            p2[i][i] = true;
        }
        Coord sp2 = new Coord(0, 0);
        int k2 = p2.length * 2;
        Instance in2 = new Instance(p2, sp2, k2);
        System.out.println("in2 \n" + in2);

        // in3 : avec pieces groupees dans petit sous carre
        boolean[][] p3 = new boolean[50][50];
        for (int i = 0; i < p3.length / 10; i++) {
            for (int j = 0; j < p3[0].length / 10; j++) {
                p3[i][j] = true;
            }
        }
        Coord sp3 = new Coord(p3.length / 2, p3[0].length / 2);
        int k3 = p3.length * 4;
        Instance in3 = new Instance(p3, sp3, k3);
        System.out.println("in3 \n" + in3);

        // in4 : avec pieces tirees au hasard indep pour chaque case
        boolean[][] p4 = new boolean[40][40];
        Random r = new Random();
        for (int i = 0; i < p4.length; i++) {
            for (int j = 0; j < p4[0].length; j++) {
                if (r.nextInt(20) == 0) {
                    p4[i][j] = true;
                }
            }
        }
        Coord sp4 = new Coord(0, 0);
        int k4 = p4.length * p4.length / 10;
        Instance in4 = new Instance(p4, sp4, k4);
        System.out.println("in4 \n" + in4);

        // in5 : avec paquets de pieces dont position du coin haut gauche tiree au
        // hasard
        boolean[][] p5 = new boolean[40][40];
        int nbpaquets = r.nextInt(p5.length * 3 / 2);
        for (int i = 0; i < nbpaquets; i++) {
            // on tire coin haut gauche du rectangle, et ses dimensions
            int l = r.nextInt(p5.length);
            int c = r.nextInt(p5[0].length);
            int larg = r.nextInt(p5[0].length / 5);
            int haut = Math.min(larg, p5.length - 1 - l);
            larg = Math.min(haut, p5[0].length - 1 - c);
            for (int ll = l; ll < l + haut; ll++) {
                for (int cc = c; cc < c + larg; cc++) {
                    p5[ll][cc] = true;
                }
            }
        }
        Coord sp5 = new Coord(r.nextInt(p5.length), r.nextInt(p5[0].length));
        int k5 = p5.length * p5[0].length / 10;
        Instance in5 = new Instance(p5, sp5, k5);
        System.out.println("in5 \n" + in5);

    }
}
