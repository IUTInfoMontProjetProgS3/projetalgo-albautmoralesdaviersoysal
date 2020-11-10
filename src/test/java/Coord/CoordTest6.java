package Coord;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import fr.umontpellier.iut.algogen.Coord;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CoordTest6 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int6 = coord2.distanceFrom(coord5);
        int int7 = coord2.getC();
        java.lang.String str8 = coord2.toString();
        int int9 = coord2.getL();
        boolean boolean12 = coord2.estDansPlateau(65, 0);
        fr.umontpellier.iut.algogen.Coord coord15 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (byte) -1);
        boolean boolean18 = coord15.estDansPlateau((int) ' ', (int) 'a');
        fr.umontpellier.iut.algogen.Coord coord21 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord24 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int25 = coord21.distanceFrom(coord24);
        fr.umontpellier.iut.algogen.Coord coord28 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord31 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int32 = coord28.distanceFrom(coord31);
        boolean boolean33 = coord21.estADistanceUn(coord28);
        int int34 = coord28.getC();
        fr.umontpellier.iut.algogen.Coord coord37 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        int int38 = coord28.distanceFrom(coord37);
        boolean boolean39 = coord15.estADistanceUn(coord28);
        int int40 = coord15.getC();
        int int41 = coord15.getL();
        int int42 = coord15.getC();
        int int43 = coord15.getC();
        boolean boolean44 = coord2.estADistanceUn(coord15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(0,-1)" + "'", str8, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 101 + "'", int38 == 101);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) 0);
        int int3 = coord2.getC();
        boolean boolean6 = coord2.estDansPlateau((int) (byte) 0, 33);
        int int7 = coord2.getL();
        java.lang.String str8 = coord2.toString();
        fr.umontpellier.iut.algogen.Coord coord11 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (byte) -1);
        int int12 = coord11.getL();
        int int13 = coord11.getC();
        int int14 = coord11.getL();
        fr.umontpellier.iut.algogen.Coord coord17 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        java.lang.String str18 = coord17.toString();
        boolean boolean19 = coord11.estADistanceUn(coord17);
        int int20 = coord17.getC();
        fr.umontpellier.iut.algogen.Coord coord23 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord26 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int27 = coord23.distanceFrom(coord26);
        fr.umontpellier.iut.algogen.Coord coord30 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord33 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int34 = coord30.distanceFrom(coord33);
        boolean boolean35 = coord23.estADistanceUn(coord30);
        java.lang.String str36 = coord30.toString();
        boolean boolean39 = coord30.estDansPlateau(101, 65);
        boolean boolean40 = coord17.estADistanceUn(coord30);
        int int41 = coord17.getL();
        int int42 = coord2.distanceFrom(coord17);
        java.lang.String str43 = coord17.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(0,0)" + "'", str8, "(0,0)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(100,0)" + "'", str18, "(100,0)");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "(0,-1)" + "'", str36, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "(100,0)" + "'", str43, "(100,0)");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) (short) 10, (int) (short) 1);
        boolean boolean5 = coord2.estDansPlateau((int) (short) 10, 12);
        fr.umontpellier.iut.algogen.Coord coord8 = new fr.umontpellier.iut.algogen.Coord(100, (int) (short) 0);
        boolean boolean11 = coord8.estDansPlateau((int) '#', (int) 'a');
        boolean boolean12 = coord2.equals((java.lang.Object) coord8);
        fr.umontpellier.iut.algogen.Coord coord15 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord18 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int19 = coord15.distanceFrom(coord18);
        int int20 = coord15.getL();
        int int21 = coord15.getC();
        int int22 = coord15.getL();
        fr.umontpellier.iut.algogen.Coord coord25 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int26 = coord15.distanceFrom(coord25);
        int int27 = coord25.getL();
        fr.umontpellier.iut.algogen.Coord coord30 = new fr.umontpellier.iut.algogen.Coord((int) (byte) -1, 0);
        int int31 = coord25.distanceFrom(coord30);
        int int32 = coord8.distanceFrom(coord25);
        fr.umontpellier.iut.algogen.Coord coord35 = new fr.umontpellier.iut.algogen.Coord((int) (short) 1, (int) '4');
        boolean boolean37 = coord35.equals((java.lang.Object) 10L);
        fr.umontpellier.iut.algogen.Coord coord40 = new fr.umontpellier.iut.algogen.Coord((int) ' ', 0);
        boolean boolean42 = coord40.equals((java.lang.Object) (-1L));
        fr.umontpellier.iut.algogen.Coord coord45 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord48 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int49 = coord45.distanceFrom(coord48);
        int int50 = coord45.getC();
        java.lang.String str51 = coord45.toString();
        int int52 = coord45.getL();
        int int53 = coord40.distanceFrom(coord45);
        fr.umontpellier.iut.algogen.Coord coord56 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        boolean boolean58 = coord56.equals((java.lang.Object) 'a');
        fr.umontpellier.iut.algogen.Coord coord61 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str62 = coord61.toString();
        java.lang.String str63 = coord61.toString();
        fr.umontpellier.iut.algogen.Coord coord66 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord69 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int70 = coord66.distanceFrom(coord69);
        int int71 = coord66.getC();
        boolean boolean72 = coord61.estADistanceUn(coord66);
        int int73 = coord56.distanceFrom(coord61);
        int int74 = coord40.distanceFrom(coord56);
        int int75 = coord40.getL();
        boolean boolean78 = coord40.estDansPlateau(54, (int) (short) 100);
        boolean boolean81 = coord40.estDansPlateau((int) (byte) 1, 69);
        boolean boolean84 = coord40.estDansPlateau(151, 54);
        boolean boolean85 = coord35.estADistanceUn(coord40);
        int int86 = coord8.distanceFrom(coord35);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 101 + "'", int32 == 101);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "(0,-1)" + "'", str51, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 33 + "'", int53 == 33);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "(0,-1)" + "'", str62, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "(0,-1)" + "'", str63, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 33 + "'", int74 == 33);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 32 + "'", int75 == 32);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 151 + "'", int86 == 151);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(279, 135);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(151, 80);
        java.lang.Class<?> wildcardClass3 = coord2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int6 = coord2.distanceFrom(coord5);
        int int7 = coord2.getC();
        java.lang.String str8 = coord2.toString();
        int int9 = coord2.getL();
        fr.umontpellier.iut.algogen.Coord coord12 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord15 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int16 = coord12.distanceFrom(coord15);
        fr.umontpellier.iut.algogen.Coord coord19 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord22 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int23 = coord19.distanceFrom(coord22);
        boolean boolean24 = coord12.estADistanceUn(coord19);
        fr.umontpellier.iut.algogen.Coord coord27 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord30 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int31 = coord27.distanceFrom(coord30);
        boolean boolean33 = coord27.equals((java.lang.Object) (byte) 1);
        boolean boolean36 = coord27.estDansPlateau(100, (int) (byte) 1);
        int int37 = coord12.distanceFrom(coord27);
        int int38 = coord2.distanceFrom(coord27);
        fr.umontpellier.iut.algogen.Coord coord41 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord44 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int45 = coord41.distanceFrom(coord44);
        fr.umontpellier.iut.algogen.Coord coord48 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord51 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int52 = coord48.distanceFrom(coord51);
        fr.umontpellier.iut.algogen.Coord coord55 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord58 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int59 = coord55.distanceFrom(coord58);
        boolean boolean60 = coord48.estADistanceUn(coord55);
        boolean boolean61 = coord41.estADistanceUn(coord48);
        boolean boolean64 = coord48.estDansPlateau(0, (int) (short) 1);
        fr.umontpellier.iut.algogen.Coord coord67 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        fr.umontpellier.iut.algogen.Coord coord70 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord73 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int74 = coord70.distanceFrom(coord73);
        int int75 = coord70.getL();
        int int76 = coord70.getC();
        int int77 = coord70.getL();
        boolean boolean78 = coord67.estADistanceUn(coord70);
        boolean boolean79 = coord48.equals((java.lang.Object) coord67);
        boolean boolean80 = coord2.estADistanceUn(coord67);
        int int81 = coord67.getL();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(0,-1)" + "'", str8, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int6 = coord2.distanceFrom(coord5);
        boolean boolean8 = coord2.equals((java.lang.Object) (byte) 1);
        java.lang.String str9 = coord2.toString();
        fr.umontpellier.iut.algogen.Coord coord12 = new fr.umontpellier.iut.algogen.Coord((int) (short) 100, (int) (short) 10);
        boolean boolean13 = coord2.estADistanceUn(coord12);
        boolean boolean16 = coord12.estDansPlateau(100, 101);
        java.lang.String str17 = coord12.toString();
        fr.umontpellier.iut.algogen.Coord coord20 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord23 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int24 = coord20.distanceFrom(coord23);
        int int25 = coord20.getL();
        int int26 = coord20.getC();
        int int27 = coord20.getL();
        java.lang.String str28 = coord20.toString();
        fr.umontpellier.iut.algogen.Coord coord31 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (byte) 0);
        boolean boolean32 = coord20.equals((java.lang.Object) coord31);
        fr.umontpellier.iut.algogen.Coord coord35 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 32);
        int int36 = coord35.getC();
        int int37 = coord20.distanceFrom(coord35);
        int int38 = coord12.distanceFrom(coord20);
        boolean boolean41 = coord20.estDansPlateau(74, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(0,-1)" + "'", str9, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(100,10)" + "'", str17, "(100,10)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "(0,-1)" + "'", str28, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32 + "'", int36 == 32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 133 + "'", int37 == 133);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 111 + "'", int38 == 111);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(74, (int) (byte) 1);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str6 = coord5.toString();
        java.lang.String str7 = coord5.toString();
        fr.umontpellier.iut.algogen.Coord coord10 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord13 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int14 = coord10.distanceFrom(coord13);
        int int15 = coord10.getC();
        boolean boolean16 = coord5.estADistanceUn(coord10);
        java.lang.String str17 = coord5.toString();
        java.lang.String str18 = coord5.toString();
        java.lang.String str19 = coord5.toString();
        fr.umontpellier.iut.algogen.Coord coord22 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        fr.umontpellier.iut.algogen.Coord coord25 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord28 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int29 = coord25.distanceFrom(coord28);
        int int30 = coord25.getL();
        int int31 = coord25.getC();
        int int32 = coord25.getL();
        boolean boolean33 = coord22.estADistanceUn(coord25);
        boolean boolean36 = coord22.estDansPlateau((int) (byte) -1, (int) ' ');
        fr.umontpellier.iut.algogen.Coord coord39 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean42 = coord39.estDansPlateau((int) (byte) -1, (int) ' ');
        boolean boolean45 = coord39.estDansPlateau((int) ' ', (int) (byte) 1);
        fr.umontpellier.iut.algogen.Coord coord48 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean49 = coord39.estADistanceUn(coord48);
        boolean boolean50 = coord22.estADistanceUn(coord39);
        fr.umontpellier.iut.algogen.Coord coord53 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord56 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int57 = coord53.distanceFrom(coord56);
        fr.umontpellier.iut.algogen.Coord coord60 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord63 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int64 = coord60.distanceFrom(coord63);
        boolean boolean65 = coord53.estADistanceUn(coord60);
        int int66 = coord60.getC();
        fr.umontpellier.iut.algogen.Coord coord69 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        int int70 = coord60.distanceFrom(coord69);
        boolean boolean72 = coord69.equals((java.lang.Object) 0);
        boolean boolean74 = coord69.equals((java.lang.Object) "(100,0)");
        boolean boolean75 = coord39.equals((java.lang.Object) "(100,0)");
        int int76 = coord5.distanceFrom(coord39);
        java.lang.String str77 = coord5.toString();
        boolean boolean80 = coord5.estDansPlateau(122, 69);
        boolean boolean81 = coord2.estADistanceUn(coord5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(0,-1)" + "'", str6, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(0,-1)" + "'", str7, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(0,-1)" + "'", str17, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(0,-1)" + "'", str18, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(0,-1)" + "'", str19, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 101 + "'", int70 == 101);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 2 + "'", int76 == 2);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "(0,-1)" + "'", str77, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int6 = coord2.distanceFrom(coord5);
        int int7 = coord2.getL();
        fr.umontpellier.iut.algogen.Coord coord10 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord13 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int14 = coord10.distanceFrom(coord13);
        fr.umontpellier.iut.algogen.Coord coord17 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord20 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int21 = coord17.distanceFrom(coord20);
        boolean boolean22 = coord10.estADistanceUn(coord17);
        int int23 = coord17.getC();
        fr.umontpellier.iut.algogen.Coord coord26 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        int int27 = coord17.distanceFrom(coord26);
        boolean boolean29 = coord26.equals((java.lang.Object) 0);
        boolean boolean30 = coord2.estADistanceUn(coord26);
        fr.umontpellier.iut.algogen.Coord coord33 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str34 = coord33.toString();
        java.lang.String str35 = coord33.toString();
        fr.umontpellier.iut.algogen.Coord coord38 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord41 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int42 = coord38.distanceFrom(coord41);
        int int43 = coord38.getC();
        boolean boolean44 = coord33.estADistanceUn(coord38);
        java.lang.String str45 = coord38.toString();
        boolean boolean46 = coord2.equals((java.lang.Object) coord38);
        boolean boolean49 = coord38.estDansPlateau(65, 33);
        boolean boolean52 = coord38.estDansPlateau((int) (byte) 10, (int) 'a');
        int int53 = coord38.getC();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 101 + "'", int27 == 101);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "(0,-1)" + "'", str34, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "(0,-1)" + "'", str35, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "(0,-1)" + "'", str45, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(74, 45);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 10, (int) (byte) -1);
        fr.umontpellier.iut.algogen.Coord coord8 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord11 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int12 = coord8.distanceFrom(coord11);
        fr.umontpellier.iut.algogen.Coord coord15 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord18 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int19 = coord15.distanceFrom(coord18);
        boolean boolean20 = coord8.estADistanceUn(coord15);
        fr.umontpellier.iut.algogen.Coord coord23 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord26 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int27 = coord23.distanceFrom(coord26);
        boolean boolean29 = coord23.equals((java.lang.Object) (byte) 1);
        boolean boolean32 = coord23.estDansPlateau(100, (int) (byte) 1);
        int int33 = coord8.distanceFrom(coord23);
        boolean boolean36 = coord23.estDansPlateau((int) (byte) 0, 12);
        fr.umontpellier.iut.algogen.Coord coord39 = new fr.umontpellier.iut.algogen.Coord(1, (int) '#');
        boolean boolean40 = coord23.equals((java.lang.Object) coord39);
        int int41 = coord5.distanceFrom(coord39);
        int int42 = coord2.distanceFrom(coord5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 45 + "'", int41 == 45);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 110 + "'", int42 == 110);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(45, 135);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(10, 152);
        int int6 = coord5.getL();
        int int7 = coord2.distanceFrom(coord5);
        fr.umontpellier.iut.algogen.Coord coord10 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean13 = coord10.estDansPlateau((int) (byte) -1, (int) ' ');
        fr.umontpellier.iut.algogen.Coord coord16 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord19 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int20 = coord16.distanceFrom(coord19);
        boolean boolean22 = coord16.equals((java.lang.Object) (byte) 1);
        java.lang.String str23 = coord16.toString();
        boolean boolean24 = coord10.equals((java.lang.Object) coord16);
        fr.umontpellier.iut.algogen.Coord coord27 = new fr.umontpellier.iut.algogen.Coord(33, (int) (byte) 0);
        boolean boolean28 = coord10.estADistanceUn(coord27);
        int int29 = coord10.getL();
        java.lang.String str30 = coord10.toString();
        fr.umontpellier.iut.algogen.Coord coord33 = new fr.umontpellier.iut.algogen.Coord(67, 122);
        int int34 = coord10.distanceFrom(coord33);
        java.lang.Class<?> wildcardClass35 = coord10.getClass();
        boolean boolean36 = coord2.equals((java.lang.Object) wildcardClass35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "(0,-1)" + "'", str23, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "(-1,0)" + "'", str30, "(-1,0)");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 190 + "'", int34 == 190);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str3 = coord2.toString();
        fr.umontpellier.iut.algogen.Coord coord6 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord9 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int10 = coord6.distanceFrom(coord9);
        int int11 = coord6.getC();
        java.lang.String str12 = coord6.toString();
        java.lang.String str13 = coord6.toString();
        boolean boolean14 = coord2.estADistanceUn(coord6);
        java.lang.Object obj15 = null;
        boolean boolean16 = coord6.equals(obj15);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0,-1)" + "'", str3, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(0,-1)" + "'", str12, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(0,-1)" + "'", str13, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int6 = coord2.distanceFrom(coord5);
        boolean boolean8 = coord2.equals((java.lang.Object) (byte) 1);
        int int9 = coord2.getL();
        java.lang.String str10 = coord2.toString();
        fr.umontpellier.iut.algogen.Coord coord13 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        fr.umontpellier.iut.algogen.Coord coord16 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord19 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int20 = coord16.distanceFrom(coord19);
        int int21 = coord16.getL();
        int int22 = coord16.getC();
        int int23 = coord16.getL();
        boolean boolean24 = coord13.estADistanceUn(coord16);
        boolean boolean27 = coord13.estDansPlateau((int) '#', 1);
        int int28 = coord2.distanceFrom(coord13);
        fr.umontpellier.iut.algogen.Coord coord31 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean34 = coord31.estDansPlateau((int) (byte) -1, (int) ' ');
        boolean boolean37 = coord31.estDansPlateau((int) ' ', (int) (byte) 1);
        int int38 = coord31.getL();
        boolean boolean40 = coord31.equals((java.lang.Object) 33);
        boolean boolean41 = coord2.estADistanceUn(coord31);
        fr.umontpellier.iut.algogen.Coord coord44 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean47 = coord44.estDansPlateau((int) (byte) -1, (int) ' ');
        int int48 = coord44.getC();
        int int49 = coord44.getC();
        int int50 = coord44.getL();
        int int51 = coord44.getC();
        boolean boolean52 = coord31.equals((java.lang.Object) int51);
        fr.umontpellier.iut.algogen.Coord coord55 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord58 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int59 = coord55.distanceFrom(coord58);
        fr.umontpellier.iut.algogen.Coord coord62 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord65 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int66 = coord62.distanceFrom(coord65);
        int int67 = coord62.getL();
        int int68 = coord62.getC();
        int int69 = coord62.getL();
        java.lang.String str70 = coord62.toString();
        boolean boolean71 = coord55.estADistanceUn(coord62);
        boolean boolean72 = coord31.equals((java.lang.Object) coord55);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(0,-1)" + "'", str10, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "(0,-1)" + "'", str70, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int6 = coord2.distanceFrom(coord5);
        int int7 = coord2.getC();
        fr.umontpellier.iut.algogen.Coord coord10 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str11 = coord10.toString();
        java.lang.String str12 = coord10.toString();
        boolean boolean13 = coord2.estADistanceUn(coord10);
        int int14 = coord2.getL();
        fr.umontpellier.iut.algogen.Coord coord17 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 10, (int) (byte) 100);
        fr.umontpellier.iut.algogen.Coord coord20 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord23 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int24 = coord20.distanceFrom(coord23);
        int int25 = coord20.getL();
        fr.umontpellier.iut.algogen.Coord coord28 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord31 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int32 = coord28.distanceFrom(coord31);
        fr.umontpellier.iut.algogen.Coord coord35 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord38 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int39 = coord35.distanceFrom(coord38);
        boolean boolean40 = coord28.estADistanceUn(coord35);
        int int41 = coord35.getC();
        fr.umontpellier.iut.algogen.Coord coord44 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        int int45 = coord35.distanceFrom(coord44);
        boolean boolean47 = coord44.equals((java.lang.Object) 0);
        boolean boolean48 = coord20.estADistanceUn(coord44);
        int int49 = coord17.distanceFrom(coord20);
        int int50 = coord2.distanceFrom(coord17);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(0,-1)" + "'", str11, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(0,-1)" + "'", str12, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 101 + "'", int45 == 101);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 111 + "'", int49 == 111);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 111 + "'", int50 == 111);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (byte) -1);
        int int3 = coord2.getL();
        int int4 = coord2.getC();
        int int5 = coord2.getL();
        fr.umontpellier.iut.algogen.Coord coord8 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        java.lang.String str9 = coord8.toString();
        boolean boolean10 = coord2.estADistanceUn(coord8);
        int int11 = coord8.getC();
        int int12 = coord8.getL();
        fr.umontpellier.iut.algogen.Coord coord15 = new fr.umontpellier.iut.algogen.Coord((int) (short) 1, (int) '4');
        boolean boolean17 = coord15.equals((java.lang.Object) 10L);
        int int18 = coord15.getC();
        boolean boolean19 = coord8.equals((java.lang.Object) int18);
        java.lang.String str20 = coord8.toString();
        int int21 = coord8.getC();
        int int22 = coord8.getL();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(100,0)" + "'", str9, "(100,0)");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(100,0)" + "'", str20, "(100,0)");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (byte) -1);
        int int3 = coord2.getL();
        int int4 = coord2.getC();
        int int5 = coord2.getL();
        fr.umontpellier.iut.algogen.Coord coord8 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        java.lang.String str9 = coord8.toString();
        boolean boolean10 = coord2.estADistanceUn(coord8);
        fr.umontpellier.iut.algogen.Coord coord13 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean16 = coord13.estDansPlateau((int) (byte) -1, (int) ' ');
        fr.umontpellier.iut.algogen.Coord coord19 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord22 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int23 = coord19.distanceFrom(coord22);
        boolean boolean25 = coord19.equals((java.lang.Object) (byte) 1);
        java.lang.String str26 = coord19.toString();
        boolean boolean27 = coord13.equals((java.lang.Object) coord19);
        fr.umontpellier.iut.algogen.Coord coord30 = new fr.umontpellier.iut.algogen.Coord(33, (int) (byte) 0);
        boolean boolean31 = coord13.estADistanceUn(coord30);
        boolean boolean32 = coord8.estADistanceUn(coord30);
        int int33 = coord30.getC();
        int int34 = coord30.getC();
        fr.umontpellier.iut.algogen.Coord coord37 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord40 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int41 = coord37.distanceFrom(coord40);
        java.lang.String str42 = coord40.toString();
        fr.umontpellier.iut.algogen.Coord coord45 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord48 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int49 = coord45.distanceFrom(coord48);
        int int50 = coord48.getC();
        int int51 = coord40.distanceFrom(coord48);
        boolean boolean54 = coord40.estDansPlateau(0, 2);
        boolean boolean57 = coord40.estDansPlateau(122, 0);
        boolean boolean60 = coord40.estDansPlateau(22, 69);
        fr.umontpellier.iut.algogen.Coord coord63 = new fr.umontpellier.iut.algogen.Coord(52, (int) (short) 0);
        boolean boolean64 = coord40.estADistanceUn(coord63);
        boolean boolean65 = coord30.estADistanceUn(coord63);
        boolean boolean68 = coord63.estDansPlateau(103, 37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(100,0)" + "'", str9, "(100,0)");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(0,-1)" + "'", str26, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "(0,-1)" + "'", str42, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(38, 32);
        boolean boolean5 = coord2.estDansPlateau((int) '#', 21);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) 0);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(149, 33);
        fr.umontpellier.iut.algogen.Coord coord8 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean11 = coord8.estDansPlateau((int) (byte) -1, (int) ' ');
        fr.umontpellier.iut.algogen.Coord coord14 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord17 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int18 = coord14.distanceFrom(coord17);
        boolean boolean20 = coord14.equals((java.lang.Object) (byte) 1);
        java.lang.String str21 = coord14.toString();
        boolean boolean22 = coord8.equals((java.lang.Object) coord14);
        fr.umontpellier.iut.algogen.Coord coord25 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord28 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int29 = coord25.distanceFrom(coord28);
        fr.umontpellier.iut.algogen.Coord coord32 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord35 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int36 = coord32.distanceFrom(coord35);
        fr.umontpellier.iut.algogen.Coord coord39 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord42 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int43 = coord39.distanceFrom(coord42);
        boolean boolean44 = coord32.estADistanceUn(coord39);
        boolean boolean45 = coord25.estADistanceUn(coord32);
        boolean boolean48 = coord32.estDansPlateau(0, (int) (short) 1);
        fr.umontpellier.iut.algogen.Coord coord51 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (byte) -1);
        boolean boolean52 = coord32.estADistanceUn(coord51);
        int int53 = coord51.getL();
        boolean boolean54 = coord14.estADistanceUn(coord51);
        fr.umontpellier.iut.algogen.Coord coord57 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str58 = coord57.toString();
        java.lang.String str59 = coord57.toString();
        fr.umontpellier.iut.algogen.Coord coord62 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord65 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int66 = coord62.distanceFrom(coord65);
        int int67 = coord62.getC();
        boolean boolean68 = coord57.estADistanceUn(coord62);
        java.lang.String str69 = coord57.toString();
        int int70 = coord57.getL();
        boolean boolean71 = coord51.equals((java.lang.Object) int70);
        boolean boolean72 = coord5.estADistanceUn(coord51);
        fr.umontpellier.iut.algogen.Coord coord75 = new fr.umontpellier.iut.algogen.Coord(101, 101);
        int int76 = coord75.getL();
        int int77 = coord75.getC();
        fr.umontpellier.iut.algogen.Coord coord80 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean83 = coord80.estDansPlateau((int) (byte) -1, (int) ' ');
        int int84 = coord80.getC();
        int int85 = coord80.getC();
        fr.umontpellier.iut.algogen.Coord coord88 = new fr.umontpellier.iut.algogen.Coord(32, 32);
        int int89 = coord80.distanceFrom(coord88);
        boolean boolean90 = coord75.equals((java.lang.Object) coord80);
        boolean boolean91 = coord51.equals((java.lang.Object) coord80);
        int int92 = coord2.distanceFrom(coord80);
        java.lang.String str93 = coord80.toString();
        int int94 = coord80.getC();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(0,-1)" + "'", str21, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "(0,-1)" + "'", str58, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "(0,-1)" + "'", str59, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "(0,-1)" + "'", str69, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 101 + "'", int76 == 101);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 101 + "'", int77 == 101);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 65 + "'", int89 == 65);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 1 + "'", int92 == 1);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "(-1,0)" + "'", str93, "(-1,0)");
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 0, 69);
        boolean boolean5 = coord2.estDansPlateau(76, 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(21, 52);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(101, 101);
        int int6 = coord5.getL();
        int int7 = coord5.getC();
        fr.umontpellier.iut.algogen.Coord coord10 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean13 = coord10.estDansPlateau((int) (byte) -1, (int) ' ');
        int int14 = coord10.getC();
        int int15 = coord10.getC();
        fr.umontpellier.iut.algogen.Coord coord18 = new fr.umontpellier.iut.algogen.Coord(32, 32);
        int int19 = coord10.distanceFrom(coord18);
        boolean boolean20 = coord5.equals((java.lang.Object) coord10);
        java.lang.Object obj21 = null;
        boolean boolean22 = coord10.equals(obj21);
        boolean boolean23 = coord2.equals((java.lang.Object) coord10);
        java.lang.String str24 = coord10.toString();
        fr.umontpellier.iut.algogen.Coord coord27 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord30 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int31 = coord27.distanceFrom(coord30);
        fr.umontpellier.iut.algogen.Coord coord34 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord37 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int38 = coord34.distanceFrom(coord37);
        boolean boolean39 = coord27.estADistanceUn(coord34);
        fr.umontpellier.iut.algogen.Coord coord42 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean45 = coord42.estDansPlateau((int) (byte) -1, (int) ' ');
        int int46 = coord42.getC();
        int int47 = coord42.getC();
        int int48 = coord42.getL();
        int int49 = coord42.getL();
        boolean boolean50 = coord34.estADistanceUn(coord42);
        int int51 = coord42.getC();
        boolean boolean52 = coord10.estADistanceUn(coord42);
        java.lang.String str53 = coord10.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 101 + "'", int7 == 101);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 65 + "'", int19 == 65);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(-1,0)" + "'", str24, "(-1,0)");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "(-1,0)" + "'", str53, "(-1,0)");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(271, 0);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int6 = coord2.distanceFrom(coord5);
        fr.umontpellier.iut.algogen.Coord coord9 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord12 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int13 = coord9.distanceFrom(coord12);
        boolean boolean14 = coord2.estADistanceUn(coord9);
        fr.umontpellier.iut.algogen.Coord coord17 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord20 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int21 = coord17.distanceFrom(coord20);
        boolean boolean23 = coord17.equals((java.lang.Object) (byte) 1);
        boolean boolean26 = coord17.estDansPlateau(100, (int) (byte) 1);
        int int27 = coord2.distanceFrom(coord17);
        fr.umontpellier.iut.algogen.Coord coord30 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord33 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int34 = coord30.distanceFrom(coord33);
        int int35 = coord17.distanceFrom(coord33);
        int int36 = coord17.getL();
        boolean boolean39 = coord17.estDansPlateau(20, 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int6 = coord2.distanceFrom(coord5);
        java.lang.String str7 = coord5.toString();
        fr.umontpellier.iut.algogen.Coord coord10 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord13 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int14 = coord10.distanceFrom(coord13);
        int int15 = coord13.getC();
        int int16 = coord5.distanceFrom(coord13);
        fr.umontpellier.iut.algogen.Coord coord19 = new fr.umontpellier.iut.algogen.Coord(1, (-1));
        fr.umontpellier.iut.algogen.Coord coord22 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) 0);
        fr.umontpellier.iut.algogen.Coord coord25 = new fr.umontpellier.iut.algogen.Coord(10, (int) (short) 10);
        boolean boolean26 = coord22.estADistanceUn(coord25);
        boolean boolean27 = coord19.equals((java.lang.Object) coord22);
        fr.umontpellier.iut.algogen.Coord coord30 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str31 = coord30.toString();
        java.lang.String str32 = coord30.toString();
        fr.umontpellier.iut.algogen.Coord coord35 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord38 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int39 = coord35.distanceFrom(coord38);
        int int40 = coord35.getC();
        boolean boolean41 = coord30.estADistanceUn(coord35);
        java.lang.String str42 = coord30.toString();
        int int43 = coord22.distanceFrom(coord30);
        boolean boolean44 = coord13.estADistanceUn(coord30);
        fr.umontpellier.iut.algogen.Coord coord47 = new fr.umontpellier.iut.algogen.Coord((int) ' ', 0);
        fr.umontpellier.iut.algogen.Coord coord50 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord53 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int54 = coord50.distanceFrom(coord53);
        fr.umontpellier.iut.algogen.Coord coord57 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord60 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int61 = coord57.distanceFrom(coord60);
        boolean boolean62 = coord50.estADistanceUn(coord57);
        boolean boolean63 = coord47.estADistanceUn(coord50);
        boolean boolean66 = coord47.estDansPlateau((int) (short) 10, (int) (byte) -1);
        java.lang.String str67 = coord47.toString();
        int int68 = coord13.distanceFrom(coord47);
        int int69 = coord47.getL();
        int int70 = coord47.getC();
        int int71 = coord47.getC();
        int int72 = coord47.getL();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(0,-1)" + "'", str7, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "(0,-1)" + "'", str31, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "(0,-1)" + "'", str32, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "(0,-1)" + "'", str42, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "(32,0)" + "'", str67, "(32,0)");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 33 + "'", int68 == 33);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 32 + "'", int69 == 32);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 32 + "'", int72 == 32);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(1, (int) '#');
        java.lang.String str3 = coord2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(1,35)" + "'", str3, "(1,35)");
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int6 = coord2.distanceFrom(coord5);
        java.lang.String str7 = coord5.toString();
        fr.umontpellier.iut.algogen.Coord coord10 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord13 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int14 = coord10.distanceFrom(coord13);
        int int15 = coord13.getC();
        int int16 = coord5.distanceFrom(coord13);
        fr.umontpellier.iut.algogen.Coord coord19 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (byte) -1);
        int int20 = coord19.getL();
        int int21 = coord19.getC();
        int int22 = coord19.getL();
        fr.umontpellier.iut.algogen.Coord coord25 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        java.lang.String str26 = coord25.toString();
        boolean boolean27 = coord19.estADistanceUn(coord25);
        int int28 = coord25.getC();
        fr.umontpellier.iut.algogen.Coord coord31 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord34 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int35 = coord31.distanceFrom(coord34);
        fr.umontpellier.iut.algogen.Coord coord38 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord41 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int42 = coord38.distanceFrom(coord41);
        boolean boolean43 = coord31.estADistanceUn(coord38);
        java.lang.String str44 = coord38.toString();
        boolean boolean47 = coord38.estDansPlateau(101, 65);
        boolean boolean48 = coord25.estADistanceUn(coord38);
        boolean boolean49 = coord5.equals((java.lang.Object) coord38);
        int int50 = coord5.getC();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(0,-1)" + "'", str7, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(100,0)" + "'", str26, "(100,0)");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "(0,-1)" + "'", str44, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) '4');
        java.lang.String str3 = coord2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(-1,52)" + "'", str3, "(-1,52)");
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int6 = coord2.distanceFrom(coord5);
        fr.umontpellier.iut.algogen.Coord coord9 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord12 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int13 = coord9.distanceFrom(coord12);
        fr.umontpellier.iut.algogen.Coord coord16 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord19 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int20 = coord16.distanceFrom(coord19);
        boolean boolean21 = coord9.estADistanceUn(coord16);
        boolean boolean22 = coord2.estADistanceUn(coord9);
        fr.umontpellier.iut.algogen.Coord coord25 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str26 = coord25.toString();
        java.lang.String str27 = coord25.toString();
        fr.umontpellier.iut.algogen.Coord coord30 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord33 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int34 = coord30.distanceFrom(coord33);
        int int35 = coord30.getC();
        boolean boolean36 = coord25.estADistanceUn(coord30);
        java.lang.String str37 = coord25.toString();
        int int38 = coord25.getL();
        boolean boolean39 = coord9.equals((java.lang.Object) int38);
        int int40 = coord9.getL();
        boolean boolean43 = coord9.estDansPlateau(2, (int) (short) 10);
        fr.umontpellier.iut.algogen.Coord coord46 = new fr.umontpellier.iut.algogen.Coord(100, (int) (byte) -1);
        boolean boolean47 = coord9.estADistanceUn(coord46);
        boolean boolean50 = coord46.estDansPlateau(20, 169);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(0,-1)" + "'", str26, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(0,-1)" + "'", str27, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "(0,-1)" + "'", str37, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 10, (int) (byte) 100);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str6 = coord5.toString();
        java.lang.String str7 = coord5.toString();
        fr.umontpellier.iut.algogen.Coord coord10 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord13 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int14 = coord10.distanceFrom(coord13);
        int int15 = coord10.getC();
        boolean boolean16 = coord5.estADistanceUn(coord10);
        int int17 = coord10.getL();
        int int18 = coord2.distanceFrom(coord10);
        fr.umontpellier.iut.algogen.Coord coord21 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord24 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int25 = coord21.distanceFrom(coord24);
        int int26 = coord21.getC();
        fr.umontpellier.iut.algogen.Coord coord29 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord32 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int33 = coord29.distanceFrom(coord32);
        boolean boolean35 = coord29.equals((java.lang.Object) (byte) 1);
        int int36 = coord29.getL();
        java.lang.String str37 = coord29.toString();
        boolean boolean38 = coord21.equals((java.lang.Object) str37);
        fr.umontpellier.iut.algogen.Coord coord41 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord44 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int45 = coord41.distanceFrom(coord44);
        fr.umontpellier.iut.algogen.Coord coord48 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord51 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int52 = coord48.distanceFrom(coord51);
        boolean boolean53 = coord41.estADistanceUn(coord48);
        int int54 = coord48.getC();
        fr.umontpellier.iut.algogen.Coord coord57 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        int int58 = coord48.distanceFrom(coord57);
        int int59 = coord48.getL();
        boolean boolean62 = coord48.estDansPlateau((int) (short) 100, 1);
        int int63 = coord21.distanceFrom(coord48);
        boolean boolean65 = coord21.equals((java.lang.Object) 1);
        int int66 = coord21.getL();
        fr.umontpellier.iut.algogen.Coord coord69 = new fr.umontpellier.iut.algogen.Coord(149, 100);
        boolean boolean70 = coord21.equals((java.lang.Object) 149);
        boolean boolean71 = coord2.estADistanceUn(coord21);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(0,-1)" + "'", str6, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(0,-1)" + "'", str7, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 111 + "'", int18 == 111);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "(0,-1)" + "'", str37, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 101 + "'", int58 == 101);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(217, 49);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord8 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int9 = coord5.distanceFrom(coord8);
        boolean boolean11 = coord5.equals((java.lang.Object) (byte) 1);
        boolean boolean14 = coord5.estDansPlateau(100, (int) (byte) 1);
        boolean boolean16 = coord5.equals((java.lang.Object) (byte) 0);
        boolean boolean17 = coord2.estADistanceUn(coord5);
        fr.umontpellier.iut.algogen.Coord coord20 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        int int21 = coord20.getC();
        fr.umontpellier.iut.algogen.Coord coord24 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        boolean boolean25 = coord20.equals((java.lang.Object) (byte) 100);
        java.lang.String str26 = coord20.toString();
        fr.umontpellier.iut.algogen.Coord coord29 = new fr.umontpellier.iut.algogen.Coord(67, 96);
        fr.umontpellier.iut.algogen.Coord coord32 = new fr.umontpellier.iut.algogen.Coord(97, 10);
        boolean boolean33 = coord29.equals((java.lang.Object) 97);
        int int34 = coord20.distanceFrom(coord29);
        int int35 = coord29.getL();
        boolean boolean36 = coord5.estADistanceUn(coord29);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(-1,0)" + "'", str26, "(-1,0)");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 164 + "'", int34 == 164);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 67 + "'", int35 == 67);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int6 = coord2.distanceFrom(coord5);
        java.lang.String str7 = coord5.toString();
        fr.umontpellier.iut.algogen.Coord coord10 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord13 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int14 = coord10.distanceFrom(coord13);
        int int15 = coord13.getC();
        int int16 = coord5.distanceFrom(coord13);
        fr.umontpellier.iut.algogen.Coord coord19 = new fr.umontpellier.iut.algogen.Coord(1, (-1));
        fr.umontpellier.iut.algogen.Coord coord22 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) 0);
        fr.umontpellier.iut.algogen.Coord coord25 = new fr.umontpellier.iut.algogen.Coord(10, (int) (short) 10);
        boolean boolean26 = coord22.estADistanceUn(coord25);
        boolean boolean27 = coord19.equals((java.lang.Object) coord22);
        fr.umontpellier.iut.algogen.Coord coord30 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str31 = coord30.toString();
        java.lang.String str32 = coord30.toString();
        fr.umontpellier.iut.algogen.Coord coord35 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord38 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int39 = coord35.distanceFrom(coord38);
        int int40 = coord35.getC();
        boolean boolean41 = coord30.estADistanceUn(coord35);
        java.lang.String str42 = coord30.toString();
        int int43 = coord22.distanceFrom(coord30);
        boolean boolean44 = coord13.estADistanceUn(coord30);
        fr.umontpellier.iut.algogen.Coord coord47 = new fr.umontpellier.iut.algogen.Coord((int) (short) 100, (int) (short) 10);
        boolean boolean50 = coord47.estDansPlateau(101, 32);
        int int51 = coord47.getC();
        fr.umontpellier.iut.algogen.Coord coord54 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord57 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int58 = coord54.distanceFrom(coord57);
        java.lang.String str59 = coord57.toString();
        boolean boolean60 = coord47.estADistanceUn(coord57);
        int int61 = coord47.getC();
        int int62 = coord30.distanceFrom(coord47);
        fr.umontpellier.iut.algogen.Coord coord65 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord68 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int69 = coord65.distanceFrom(coord68);
        int int70 = coord65.getC();
        java.lang.String str71 = coord65.toString();
        int int72 = coord65.getL();
        boolean boolean75 = coord65.estDansPlateau(65, 0);
        int int76 = coord65.getL();
        int int77 = coord65.getL();
        boolean boolean78 = coord30.equals((java.lang.Object) int77);
        java.lang.String str79 = coord30.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(0,-1)" + "'", str7, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "(0,-1)" + "'", str31, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "(0,-1)" + "'", str32, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "(0,-1)" + "'", str42, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 10 + "'", int51 == 10);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "(0,-1)" + "'", str59, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 10 + "'", int61 == 10);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 111 + "'", int62 == 111);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "(0,-1)" + "'", str71, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "(0,-1)" + "'", str79, "(0,-1)");
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int6 = coord2.distanceFrom(coord5);
        fr.umontpellier.iut.algogen.Coord coord9 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord12 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int13 = coord9.distanceFrom(coord12);
        boolean boolean14 = coord2.estADistanceUn(coord9);
        int int15 = coord9.getC();
        fr.umontpellier.iut.algogen.Coord coord18 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        int int19 = coord9.distanceFrom(coord18);
        boolean boolean21 = coord18.equals((java.lang.Object) 0);
        fr.umontpellier.iut.algogen.Coord coord24 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str25 = coord24.toString();
        java.lang.String str26 = coord24.toString();
        fr.umontpellier.iut.algogen.Coord coord29 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord32 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int33 = coord29.distanceFrom(coord32);
        int int34 = coord29.getC();
        boolean boolean35 = coord24.estADistanceUn(coord29);
        java.lang.String str36 = coord29.toString();
        fr.umontpellier.iut.algogen.Coord coord39 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str40 = coord39.toString();
        java.lang.String str41 = coord39.toString();
        fr.umontpellier.iut.algogen.Coord coord44 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord47 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int48 = coord44.distanceFrom(coord47);
        int int49 = coord44.getC();
        boolean boolean50 = coord39.estADistanceUn(coord44);
        java.lang.String str51 = coord39.toString();
        int int52 = coord39.getL();
        boolean boolean55 = coord39.estDansPlateau((int) (short) -1, (int) (short) 0);
        fr.umontpellier.iut.algogen.Coord coord58 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean61 = coord58.estDansPlateau((int) (byte) -1, (int) ' ');
        boolean boolean62 = coord39.estADistanceUn(coord58);
        int int63 = coord58.getL();
        boolean boolean64 = coord29.estADistanceUn(coord58);
        fr.umontpellier.iut.algogen.Coord coord67 = new fr.umontpellier.iut.algogen.Coord((int) (short) 100, 21);
        int int68 = coord58.distanceFrom(coord67);
        java.lang.String str69 = coord58.toString();
        int int70 = coord18.distanceFrom(coord58);
        java.lang.Class<?> wildcardClass71 = coord58.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 101 + "'", int19 == 101);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "(0,-1)" + "'", str25, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(0,-1)" + "'", str26, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "(0,-1)" + "'", str36, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "(0,-1)" + "'", str40, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "(0,-1)" + "'", str41, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "(0,-1)" + "'", str51, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 122 + "'", int68 == 122);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "(-1,0)" + "'", str69, "(-1,0)");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 101 + "'", int70 == 101);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int6 = coord2.distanceFrom(coord5);
        fr.umontpellier.iut.algogen.Coord coord9 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord12 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int13 = coord9.distanceFrom(coord12);
        boolean boolean14 = coord2.estADistanceUn(coord9);
        fr.umontpellier.iut.algogen.Coord coord17 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord20 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int21 = coord17.distanceFrom(coord20);
        boolean boolean23 = coord17.equals((java.lang.Object) (byte) 1);
        boolean boolean26 = coord17.estDansPlateau(100, (int) (byte) 1);
        int int27 = coord2.distanceFrom(coord17);
        boolean boolean30 = coord17.estDansPlateau((int) (byte) 0, 12);
        fr.umontpellier.iut.algogen.Coord coord33 = new fr.umontpellier.iut.algogen.Coord(1, (int) '#');
        boolean boolean34 = coord17.equals((java.lang.Object) coord33);
        java.lang.String str35 = coord17.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "(0,-1)" + "'", str35, "(0,-1)");
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) 0);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(10, (int) (short) 10);
        boolean boolean6 = coord2.estADistanceUn(coord5);
        java.lang.Object obj7 = null;
        boolean boolean8 = coord5.equals(obj7);
        fr.umontpellier.iut.algogen.Coord coord11 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str12 = coord11.toString();
        java.lang.String str13 = coord11.toString();
        fr.umontpellier.iut.algogen.Coord coord16 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord19 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int20 = coord16.distanceFrom(coord19);
        int int21 = coord16.getC();
        boolean boolean22 = coord11.estADistanceUn(coord16);
        java.lang.String str23 = coord11.toString();
        int int24 = coord11.getL();
        boolean boolean27 = coord11.estDansPlateau((int) (short) -1, (int) (short) 0);
        fr.umontpellier.iut.algogen.Coord coord30 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean33 = coord30.estDansPlateau((int) (byte) -1, (int) ' ');
        boolean boolean34 = coord11.estADistanceUn(coord30);
        java.lang.String str35 = coord30.toString();
        int int36 = coord5.distanceFrom(coord30);
        int int37 = coord5.getL();
        fr.umontpellier.iut.algogen.Coord coord40 = new fr.umontpellier.iut.algogen.Coord((int) ' ', 32);
        int int41 = coord40.getC();
        boolean boolean42 = coord5.estADistanceUn(coord40);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(0,-1)" + "'", str12, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(0,-1)" + "'", str13, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "(0,-1)" + "'", str23, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "(-1,0)" + "'", str35, "(-1,0)");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 21 + "'", int36 == 21);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 32 + "'", int41 == 32);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int6 = coord2.distanceFrom(coord5);
        int int7 = coord2.getL();
        fr.umontpellier.iut.algogen.Coord coord10 = new fr.umontpellier.iut.algogen.Coord((int) (byte) -1, 32);
        int int11 = coord10.getC();
        fr.umontpellier.iut.algogen.Coord coord14 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) 100);
        int int15 = coord10.distanceFrom(coord14);
        boolean boolean16 = coord2.estADistanceUn(coord14);
        int int17 = coord14.getC();
        int int18 = coord14.getC();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(151, (int) (short) 10);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) (short) 1, (int) '4');
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        int int6 = coord5.getC();
        fr.umontpellier.iut.algogen.Coord coord9 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        boolean boolean10 = coord5.equals((java.lang.Object) (byte) 100);
        java.lang.String str11 = coord5.toString();
        fr.umontpellier.iut.algogen.Coord coord14 = new fr.umontpellier.iut.algogen.Coord(67, 96);
        fr.umontpellier.iut.algogen.Coord coord17 = new fr.umontpellier.iut.algogen.Coord(97, 10);
        boolean boolean18 = coord14.equals((java.lang.Object) 97);
        int int19 = coord5.distanceFrom(coord14);
        boolean boolean20 = coord2.equals((java.lang.Object) coord14);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(-1,0)" + "'", str11, "(-1,0)");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 164 + "'", int19 == 164);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(122, 87);
        boolean boolean5 = coord2.estDansPlateau(99, 122);
        fr.umontpellier.iut.algogen.Coord coord8 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord11 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int12 = coord8.distanceFrom(coord11);
        fr.umontpellier.iut.algogen.Coord coord15 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord18 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int19 = coord15.distanceFrom(coord18);
        boolean boolean20 = coord8.estADistanceUn(coord15);
        fr.umontpellier.iut.algogen.Coord coord23 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord26 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int27 = coord23.distanceFrom(coord26);
        boolean boolean29 = coord23.equals((java.lang.Object) (byte) 1);
        boolean boolean32 = coord23.estDansPlateau(100, (int) (byte) 1);
        int int33 = coord8.distanceFrom(coord23);
        int int34 = coord23.getL();
        java.lang.String str35 = coord23.toString();
        int int36 = coord23.getL();
        boolean boolean39 = coord23.estDansPlateau((int) '4', (int) (byte) 10);
        int int40 = coord2.distanceFrom(coord23);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "(0,-1)" + "'", str35, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 210 + "'", int40 == 210);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int6 = coord2.distanceFrom(coord5);
        fr.umontpellier.iut.algogen.Coord coord9 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord12 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int13 = coord9.distanceFrom(coord12);
        fr.umontpellier.iut.algogen.Coord coord16 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord19 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int20 = coord16.distanceFrom(coord19);
        boolean boolean21 = coord9.estADistanceUn(coord16);
        boolean boolean22 = coord2.estADistanceUn(coord9);
        int int23 = coord2.getC();
        int int24 = coord2.getL();
        java.lang.String str25 = coord2.toString();
        fr.umontpellier.iut.algogen.Coord coord28 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str29 = coord28.toString();
        java.lang.String str30 = coord28.toString();
        fr.umontpellier.iut.algogen.Coord coord33 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord36 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int37 = coord33.distanceFrom(coord36);
        int int38 = coord33.getC();
        boolean boolean39 = coord28.estADistanceUn(coord33);
        java.lang.String str40 = coord33.toString();
        fr.umontpellier.iut.algogen.Coord coord43 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str44 = coord43.toString();
        java.lang.String str45 = coord43.toString();
        fr.umontpellier.iut.algogen.Coord coord48 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord51 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int52 = coord48.distanceFrom(coord51);
        int int53 = coord48.getC();
        boolean boolean54 = coord43.estADistanceUn(coord48);
        java.lang.String str55 = coord43.toString();
        int int56 = coord43.getL();
        boolean boolean59 = coord43.estDansPlateau((int) (short) -1, (int) (short) 0);
        fr.umontpellier.iut.algogen.Coord coord62 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean65 = coord62.estDansPlateau((int) (byte) -1, (int) ' ');
        boolean boolean66 = coord43.estADistanceUn(coord62);
        int int67 = coord62.getL();
        boolean boolean68 = coord33.estADistanceUn(coord62);
        int int69 = coord33.getL();
        boolean boolean70 = coord2.equals((java.lang.Object) coord33);
        int int71 = coord2.getC();
        int int72 = coord2.getC();
        boolean boolean75 = coord2.estDansPlateau(149, 123);
        fr.umontpellier.iut.algogen.Coord coord78 = new fr.umontpellier.iut.algogen.Coord(21, 101);
        fr.umontpellier.iut.algogen.Coord coord81 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        int int82 = coord78.distanceFrom(coord81);
        int int83 = coord2.distanceFrom(coord78);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "(0,-1)" + "'", str25, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "(0,-1)" + "'", str29, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "(0,-1)" + "'", str30, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "(0,-1)" + "'", str40, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "(0,-1)" + "'", str44, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "(0,-1)" + "'", str45, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "(0,-1)" + "'", str55, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 180 + "'", int82 == 180);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 123 + "'", int83 == 123);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str3 = coord2.toString();
        java.lang.String str4 = coord2.toString();
        fr.umontpellier.iut.algogen.Coord coord7 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord10 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int11 = coord7.distanceFrom(coord10);
        int int12 = coord7.getC();
        boolean boolean13 = coord2.estADistanceUn(coord7);
        java.lang.String str14 = coord7.toString();
        int int15 = coord7.getC();
        fr.umontpellier.iut.algogen.Coord coord18 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        boolean boolean20 = coord18.equals((java.lang.Object) 'a');
        fr.umontpellier.iut.algogen.Coord coord23 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str24 = coord23.toString();
        java.lang.String str25 = coord23.toString();
        fr.umontpellier.iut.algogen.Coord coord28 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord31 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int32 = coord28.distanceFrom(coord31);
        int int33 = coord28.getC();
        boolean boolean34 = coord23.estADistanceUn(coord28);
        int int35 = coord18.distanceFrom(coord23);
        fr.umontpellier.iut.algogen.Coord coord38 = new fr.umontpellier.iut.algogen.Coord(101, 101);
        int int39 = coord38.getL();
        int int40 = coord38.getC();
        fr.umontpellier.iut.algogen.Coord coord43 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean46 = coord43.estDansPlateau((int) (byte) -1, (int) ' ');
        int int47 = coord43.getC();
        int int48 = coord43.getC();
        fr.umontpellier.iut.algogen.Coord coord51 = new fr.umontpellier.iut.algogen.Coord(32, 32);
        int int52 = coord43.distanceFrom(coord51);
        boolean boolean53 = coord38.equals((java.lang.Object) coord43);
        java.lang.Object obj54 = null;
        boolean boolean55 = coord43.equals(obj54);
        fr.umontpellier.iut.algogen.Coord coord58 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord61 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int62 = coord58.distanceFrom(coord61);
        fr.umontpellier.iut.algogen.Coord coord65 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord68 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int69 = coord65.distanceFrom(coord68);
        boolean boolean70 = coord58.estADistanceUn(coord65);
        int int71 = coord65.getC();
        fr.umontpellier.iut.algogen.Coord coord74 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        int int75 = coord65.distanceFrom(coord74);
        int int76 = coord65.getL();
        boolean boolean79 = coord65.estDansPlateau((int) (short) 100, 1);
        int int80 = coord43.distanceFrom(coord65);
        boolean boolean81 = coord18.estADistanceUn(coord43);
        boolean boolean82 = coord7.estADistanceUn(coord43);
        boolean boolean85 = coord43.estDansPlateau((int) '4', 190);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0,-1)" + "'", str3, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(0,-1)" + "'", str4, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(0,-1)" + "'", str14, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(0,-1)" + "'", str24, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "(0,-1)" + "'", str25, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 101 + "'", int39 == 101);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 101 + "'", int40 == 101);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 65 + "'", int52 == 65);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 101 + "'", int75 == 101);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 2 + "'", int80 == 2);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(101, 1);
        boolean boolean5 = coord2.estDansPlateau((int) (byte) 100, (int) ' ');
        boolean boolean8 = coord2.estDansPlateau((int) '#', 0);
        fr.umontpellier.iut.algogen.Coord coord11 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (byte) -1);
        int int12 = coord11.getL();
        int int13 = coord11.getC();
        int int14 = coord11.getL();
        fr.umontpellier.iut.algogen.Coord coord17 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        java.lang.String str18 = coord17.toString();
        boolean boolean19 = coord11.estADistanceUn(coord17);
        fr.umontpellier.iut.algogen.Coord coord22 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean25 = coord22.estDansPlateau((int) (byte) -1, (int) ' ');
        fr.umontpellier.iut.algogen.Coord coord28 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord31 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int32 = coord28.distanceFrom(coord31);
        boolean boolean34 = coord28.equals((java.lang.Object) (byte) 1);
        java.lang.String str35 = coord28.toString();
        boolean boolean36 = coord22.equals((java.lang.Object) coord28);
        fr.umontpellier.iut.algogen.Coord coord39 = new fr.umontpellier.iut.algogen.Coord(33, (int) (byte) 0);
        boolean boolean40 = coord22.estADistanceUn(coord39);
        boolean boolean41 = coord17.estADistanceUn(coord39);
        int int42 = coord39.getC();
        int int43 = coord39.getC();
        int int44 = coord2.distanceFrom(coord39);
        fr.umontpellier.iut.algogen.Coord coord47 = new fr.umontpellier.iut.algogen.Coord(101, 101);
        int int48 = coord47.getL();
        int int49 = coord47.getC();
        fr.umontpellier.iut.algogen.Coord coord52 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean55 = coord52.estDansPlateau((int) (byte) -1, (int) ' ');
        int int56 = coord52.getC();
        int int57 = coord52.getC();
        fr.umontpellier.iut.algogen.Coord coord60 = new fr.umontpellier.iut.algogen.Coord(32, 32);
        int int61 = coord52.distanceFrom(coord60);
        boolean boolean62 = coord47.equals((java.lang.Object) coord52);
        fr.umontpellier.iut.algogen.Coord coord65 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 10, (-1));
        int int66 = coord47.distanceFrom(coord65);
        int int67 = coord39.distanceFrom(coord47);
        fr.umontpellier.iut.algogen.Coord coord70 = new fr.umontpellier.iut.algogen.Coord(87, 118);
        int int71 = coord47.distanceFrom(coord70);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(100,0)" + "'", str18, "(100,0)");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "(0,-1)" + "'", str35, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 69 + "'", int44 == 69);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 101 + "'", int48 == 101);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 101 + "'", int49 == 101);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 65 + "'", int61 == 65);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 193 + "'", int66 == 193);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 169 + "'", int67 == 169);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 31 + "'", int71 == 31);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(1, 101);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        boolean boolean7 = coord5.equals((java.lang.Object) 'a');
        fr.umontpellier.iut.algogen.Coord coord10 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, (int) (byte) 1);
        fr.umontpellier.iut.algogen.Coord coord13 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord16 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int17 = coord13.distanceFrom(coord16);
        int int18 = coord13.getL();
        fr.umontpellier.iut.algogen.Coord coord21 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord24 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int25 = coord21.distanceFrom(coord24);
        fr.umontpellier.iut.algogen.Coord coord28 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord31 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int32 = coord28.distanceFrom(coord31);
        fr.umontpellier.iut.algogen.Coord coord35 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord38 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int39 = coord35.distanceFrom(coord38);
        boolean boolean40 = coord28.estADistanceUn(coord35);
        boolean boolean41 = coord21.estADistanceUn(coord28);
        fr.umontpellier.iut.algogen.Coord coord44 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str45 = coord44.toString();
        java.lang.String str46 = coord44.toString();
        fr.umontpellier.iut.algogen.Coord coord49 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord52 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int53 = coord49.distanceFrom(coord52);
        int int54 = coord49.getC();
        boolean boolean55 = coord44.estADistanceUn(coord49);
        java.lang.String str56 = coord44.toString();
        int int57 = coord44.getL();
        boolean boolean58 = coord28.equals((java.lang.Object) int57);
        fr.umontpellier.iut.algogen.Coord coord61 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        fr.umontpellier.iut.algogen.Coord coord64 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord67 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int68 = coord64.distanceFrom(coord67);
        int int69 = coord64.getL();
        int int70 = coord64.getC();
        int int71 = coord64.getL();
        boolean boolean72 = coord61.estADistanceUn(coord64);
        boolean boolean73 = coord28.estADistanceUn(coord64);
        int int74 = coord13.distanceFrom(coord64);
        boolean boolean75 = coord10.estADistanceUn(coord13);
        boolean boolean76 = coord5.equals((java.lang.Object) coord10);
        boolean boolean77 = coord2.equals((java.lang.Object) coord10);
        fr.umontpellier.iut.algogen.Coord coord80 = new fr.umontpellier.iut.algogen.Coord(45, 457);
        boolean boolean81 = coord2.equals((java.lang.Object) 45);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "(0,-1)" + "'", str45, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "(0,-1)" + "'", str46, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "(0,-1)" + "'", str56, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int6 = coord2.distanceFrom(coord5);
        fr.umontpellier.iut.algogen.Coord coord9 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord12 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int13 = coord9.distanceFrom(coord12);
        boolean boolean14 = coord2.estADistanceUn(coord9);
        java.lang.String str15 = coord9.toString();
        boolean boolean18 = coord9.estDansPlateau(101, 65);
        boolean boolean21 = coord9.estDansPlateau(102, 150);
        int int22 = coord9.getL();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(0,-1)" + "'", str15, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) ' ', 0);
        boolean boolean4 = coord2.equals((java.lang.Object) (-1L));
        fr.umontpellier.iut.algogen.Coord coord7 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord10 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int11 = coord7.distanceFrom(coord10);
        int int12 = coord7.getC();
        java.lang.String str13 = coord7.toString();
        int int14 = coord7.getL();
        int int15 = coord2.distanceFrom(coord7);
        fr.umontpellier.iut.algogen.Coord coord18 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        boolean boolean20 = coord18.equals((java.lang.Object) 'a');
        fr.umontpellier.iut.algogen.Coord coord23 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str24 = coord23.toString();
        java.lang.String str25 = coord23.toString();
        fr.umontpellier.iut.algogen.Coord coord28 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord31 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int32 = coord28.distanceFrom(coord31);
        int int33 = coord28.getC();
        boolean boolean34 = coord23.estADistanceUn(coord28);
        int int35 = coord18.distanceFrom(coord23);
        int int36 = coord2.distanceFrom(coord18);
        fr.umontpellier.iut.algogen.Coord coord39 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) 0);
        fr.umontpellier.iut.algogen.Coord coord42 = new fr.umontpellier.iut.algogen.Coord(10, (int) (short) 10);
        boolean boolean43 = coord39.estADistanceUn(coord42);
        boolean boolean44 = coord2.estADistanceUn(coord39);
        int int45 = coord39.getC();
        fr.umontpellier.iut.algogen.Coord coord48 = new fr.umontpellier.iut.algogen.Coord(101, 101);
        int int49 = coord48.getL();
        int int50 = coord48.getC();
        fr.umontpellier.iut.algogen.Coord coord53 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean56 = coord53.estDansPlateau((int) (byte) -1, (int) ' ');
        int int57 = coord53.getC();
        int int58 = coord53.getC();
        fr.umontpellier.iut.algogen.Coord coord61 = new fr.umontpellier.iut.algogen.Coord(32, 32);
        int int62 = coord53.distanceFrom(coord61);
        boolean boolean63 = coord48.equals((java.lang.Object) coord53);
        fr.umontpellier.iut.algogen.Coord coord66 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord69 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int70 = coord66.distanceFrom(coord69);
        boolean boolean72 = coord66.equals((java.lang.Object) (byte) 1);
        java.lang.String str73 = coord66.toString();
        fr.umontpellier.iut.algogen.Coord coord76 = new fr.umontpellier.iut.algogen.Coord((int) (short) 100, (int) (short) 10);
        boolean boolean77 = coord66.estADistanceUn(coord76);
        boolean boolean78 = coord53.equals((java.lang.Object) coord76);
        boolean boolean81 = coord53.estDansPlateau(87, (int) (short) 1);
        boolean boolean82 = coord39.estADistanceUn(coord53);
        fr.umontpellier.iut.algogen.Coord coord85 = new fr.umontpellier.iut.algogen.Coord(100, 67);
        boolean boolean86 = coord53.equals((java.lang.Object) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(0,-1)" + "'", str13, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(0,-1)" + "'", str24, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "(0,-1)" + "'", str25, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 33 + "'", int36 == 33);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 101 + "'", int49 == 101);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 101 + "'", int50 == 101);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 65 + "'", int62 == 65);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "(0,-1)" + "'", str73, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean5 = coord2.estDansPlateau((int) (byte) -1, (int) ' ');
        boolean boolean8 = coord2.estDansPlateau((int) ' ', (int) (byte) 1);
        fr.umontpellier.iut.algogen.Coord coord11 = new fr.umontpellier.iut.algogen.Coord((int) '4', (int) (short) -1);
        int int12 = coord11.getL();
        fr.umontpellier.iut.algogen.Coord coord15 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str16 = coord15.toString();
        java.lang.String str17 = coord15.toString();
        fr.umontpellier.iut.algogen.Coord coord20 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord23 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int24 = coord20.distanceFrom(coord23);
        int int25 = coord20.getC();
        boolean boolean26 = coord15.estADistanceUn(coord20);
        java.lang.String str27 = coord15.toString();
        int int28 = coord15.getL();
        boolean boolean31 = coord15.estDansPlateau((int) (short) -1, (int) (short) 0);
        fr.umontpellier.iut.algogen.Coord coord34 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord37 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int38 = coord34.distanceFrom(coord37);
        fr.umontpellier.iut.algogen.Coord coord41 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord44 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int45 = coord41.distanceFrom(coord44);
        boolean boolean46 = coord34.estADistanceUn(coord41);
        int int47 = coord41.getC();
        fr.umontpellier.iut.algogen.Coord coord50 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        int int51 = coord41.distanceFrom(coord50);
        boolean boolean53 = coord50.equals((java.lang.Object) 0);
        java.lang.String str54 = coord50.toString();
        int int55 = coord15.distanceFrom(coord50);
        boolean boolean56 = coord11.estADistanceUn(coord50);
        fr.umontpellier.iut.algogen.Coord coord59 = new fr.umontpellier.iut.algogen.Coord((int) '4', (int) (short) -1);
        int int60 = coord59.getC();
        fr.umontpellier.iut.algogen.Coord coord63 = new fr.umontpellier.iut.algogen.Coord((int) ' ', (int) (short) 1);
        int int64 = coord63.getL();
        boolean boolean65 = coord59.estADistanceUn(coord63);
        int int66 = coord50.distanceFrom(coord63);
        int int67 = coord2.distanceFrom(coord50);
        int int68 = coord50.getL();
        boolean boolean71 = coord50.estDansPlateau(49, 33);
        boolean boolean74 = coord50.estDansPlateau(0, 217);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(0,-1)" + "'", str16, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(0,-1)" + "'", str17, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(0,-1)" + "'", str27, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 101 + "'", int51 == 101);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "(100,0)" + "'", str54, "(100,0)");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 101 + "'", int55 == 101);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 32 + "'", int64 == 32);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 69 + "'", int66 == 69);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 101 + "'", int67 == 101);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 100 + "'", int68 == 100);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(200, 9);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(21, (int) (short) 0);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (byte) -1);
        boolean boolean5 = coord2.estDansPlateau((int) ' ', (int) 'a');
        fr.umontpellier.iut.algogen.Coord coord8 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord11 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int12 = coord8.distanceFrom(coord11);
        fr.umontpellier.iut.algogen.Coord coord15 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord18 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int19 = coord15.distanceFrom(coord18);
        boolean boolean20 = coord8.estADistanceUn(coord15);
        int int21 = coord15.getC();
        fr.umontpellier.iut.algogen.Coord coord24 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        int int25 = coord15.distanceFrom(coord24);
        boolean boolean26 = coord2.estADistanceUn(coord15);
        boolean boolean29 = coord2.estDansPlateau((int) (short) 1, (int) (byte) 0);
        boolean boolean32 = coord2.estDansPlateau(100, 0);
        int int33 = coord2.getC();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 101 + "'", int25 == 101);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) (short) 1, (int) '4');
        boolean boolean4 = coord2.equals((java.lang.Object) 10L);
        int int5 = coord2.getC();
        fr.umontpellier.iut.algogen.Coord coord8 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord11 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int12 = coord8.distanceFrom(coord11);
        boolean boolean14 = coord8.equals((java.lang.Object) (byte) 1);
        boolean boolean17 = coord8.estDansPlateau(100, (int) (byte) 1);
        boolean boolean18 = coord2.estADistanceUn(coord8);
        java.lang.Class<?> wildcardClass19 = coord2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean5 = coord2.estDansPlateau((int) (byte) -1, (int) ' ');
        int int6 = coord2.getC();
        int int7 = coord2.getC();
        int int8 = coord2.getL();
        int int9 = coord2.getL();
        fr.umontpellier.iut.algogen.Coord coord12 = new fr.umontpellier.iut.algogen.Coord((int) (byte) -1, (int) 'a');
        boolean boolean13 = coord2.estADistanceUn(coord12);
        int int14 = coord12.getL();
        boolean boolean17 = coord12.estDansPlateau(118, 0);
        fr.umontpellier.iut.algogen.Coord coord20 = new fr.umontpellier.iut.algogen.Coord(122, 87);
        fr.umontpellier.iut.algogen.Coord coord23 = new fr.umontpellier.iut.algogen.Coord((int) ' ', 0);
        boolean boolean25 = coord23.equals((java.lang.Object) (-1L));
        fr.umontpellier.iut.algogen.Coord coord28 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord31 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int32 = coord28.distanceFrom(coord31);
        int int33 = coord28.getC();
        java.lang.String str34 = coord28.toString();
        int int35 = coord28.getL();
        int int36 = coord23.distanceFrom(coord28);
        fr.umontpellier.iut.algogen.Coord coord39 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        boolean boolean41 = coord39.equals((java.lang.Object) 'a');
        fr.umontpellier.iut.algogen.Coord coord44 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str45 = coord44.toString();
        java.lang.String str46 = coord44.toString();
        fr.umontpellier.iut.algogen.Coord coord49 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord52 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int53 = coord49.distanceFrom(coord52);
        int int54 = coord49.getC();
        boolean boolean55 = coord44.estADistanceUn(coord49);
        int int56 = coord39.distanceFrom(coord44);
        int int57 = coord23.distanceFrom(coord39);
        int int58 = coord39.getL();
        boolean boolean59 = coord20.estADistanceUn(coord39);
        fr.umontpellier.iut.algogen.Coord coord62 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (byte) -1);
        int int63 = coord62.getL();
        int int64 = coord62.getC();
        boolean boolean67 = coord62.estDansPlateau((int) (short) 1, 1);
        fr.umontpellier.iut.algogen.Coord coord70 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord73 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int74 = coord70.distanceFrom(coord73);
        boolean boolean76 = coord70.equals((java.lang.Object) (byte) 1);
        boolean boolean79 = coord70.estDansPlateau(100, (int) (byte) 1);
        int int80 = coord62.distanceFrom(coord70);
        boolean boolean81 = coord20.estADistanceUn(coord70);
        boolean boolean82 = coord12.equals((java.lang.Object) coord70);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "(0,-1)" + "'", str34, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 33 + "'", int36 == 33);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "(0,-1)" + "'", str45, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "(0,-1)" + "'", str46, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 33 + "'", int57 == 33);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 1 + "'", int80 == 1);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(111, 96);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str6 = coord5.toString();
        java.lang.String str7 = coord5.toString();
        fr.umontpellier.iut.algogen.Coord coord10 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord13 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int14 = coord10.distanceFrom(coord13);
        int int15 = coord10.getC();
        boolean boolean16 = coord5.estADistanceUn(coord10);
        boolean boolean19 = coord5.estDansPlateau((int) (byte) 1, (int) (short) 10);
        fr.umontpellier.iut.algogen.Coord coord22 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean25 = coord22.estDansPlateau((int) (byte) -1, (int) ' ');
        int int26 = coord22.getC();
        int int27 = coord22.getC();
        fr.umontpellier.iut.algogen.Coord coord30 = new fr.umontpellier.iut.algogen.Coord(32, 32);
        int int31 = coord22.distanceFrom(coord30);
        int int32 = coord5.distanceFrom(coord30);
        boolean boolean33 = coord2.estADistanceUn(coord5);
        java.lang.String str34 = coord5.toString();
        int int35 = coord5.getL();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(0,-1)" + "'", str6, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(0,-1)" + "'", str7, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 65 + "'", int31 == 65);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 65 + "'", int32 == 65);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "(0,-1)" + "'", str34, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, 69);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean8 = coord5.estDansPlateau((int) (byte) -1, (int) ' ');
        boolean boolean11 = coord5.estDansPlateau((int) ' ', (int) (byte) 1);
        int int12 = coord5.getL();
        boolean boolean14 = coord5.equals((java.lang.Object) 33);
        fr.umontpellier.iut.algogen.Coord coord17 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        fr.umontpellier.iut.algogen.Coord coord20 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord23 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int24 = coord20.distanceFrom(coord23);
        boolean boolean26 = coord20.equals((java.lang.Object) (byte) 1);
        fr.umontpellier.iut.algogen.Coord coord29 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        boolean boolean30 = coord20.equals((java.lang.Object) (byte) 100);
        boolean boolean31 = coord17.equals((java.lang.Object) (byte) 100);
        int int32 = coord5.distanceFrom(coord17);
        fr.umontpellier.iut.algogen.Coord coord35 = new fr.umontpellier.iut.algogen.Coord(33, (int) (byte) 0);
        boolean boolean36 = coord17.equals((java.lang.Object) coord35);
        int int37 = coord35.getC();
        java.lang.String str38 = coord35.toString();
        int int39 = coord2.distanceFrom(coord35);
        fr.umontpellier.iut.algogen.Coord coord42 = new fr.umontpellier.iut.algogen.Coord(101, 101);
        int int43 = coord42.getL();
        int int44 = coord42.getC();
        fr.umontpellier.iut.algogen.Coord coord47 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean50 = coord47.estDansPlateau((int) (byte) -1, (int) ' ');
        int int51 = coord47.getC();
        int int52 = coord47.getC();
        fr.umontpellier.iut.algogen.Coord coord55 = new fr.umontpellier.iut.algogen.Coord(32, 32);
        int int56 = coord47.distanceFrom(coord55);
        boolean boolean57 = coord42.equals((java.lang.Object) coord47);
        java.lang.Object obj58 = null;
        boolean boolean59 = coord47.equals(obj58);
        boolean boolean60 = coord35.estADistanceUn(coord47);
        java.lang.String str61 = coord35.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 101 + "'", int32 == 101);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "(33,0)" + "'", str38, "(33,0)");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 102 + "'", int39 == 102);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 101 + "'", int43 == 101);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 101 + "'", int44 == 101);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 65 + "'", int56 == 65);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "(33,0)" + "'", str61, "(33,0)");
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 1, (-1));
        int int3 = coord2.getC();
        fr.umontpellier.iut.algogen.Coord coord6 = new fr.umontpellier.iut.algogen.Coord((int) (byte) -1, (int) 'a');
        fr.umontpellier.iut.algogen.Coord coord9 = new fr.umontpellier.iut.algogen.Coord(1, 10);
        int int10 = coord9.getL();
        boolean boolean13 = coord9.estDansPlateau((int) (byte) 100, 2);
        fr.umontpellier.iut.algogen.Coord coord16 = new fr.umontpellier.iut.algogen.Coord(65, 52);
        boolean boolean17 = coord9.equals((java.lang.Object) coord16);
        boolean boolean18 = coord6.estADistanceUn(coord9);
        boolean boolean19 = coord2.estADistanceUn(coord6);
        fr.umontpellier.iut.algogen.Coord coord22 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        fr.umontpellier.iut.algogen.Coord coord25 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord28 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int29 = coord25.distanceFrom(coord28);
        int int30 = coord25.getL();
        int int31 = coord25.getC();
        int int32 = coord25.getL();
        boolean boolean33 = coord22.estADistanceUn(coord25);
        boolean boolean35 = coord22.equals((java.lang.Object) 100.0d);
        int int36 = coord22.getL();
        boolean boolean39 = coord22.estDansPlateau(151, 178);
        fr.umontpellier.iut.algogen.Coord coord42 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord45 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int46 = coord42.distanceFrom(coord45);
        fr.umontpellier.iut.algogen.Coord coord49 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord52 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int53 = coord49.distanceFrom(coord52);
        fr.umontpellier.iut.algogen.Coord coord56 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord59 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int60 = coord56.distanceFrom(coord59);
        boolean boolean61 = coord49.estADistanceUn(coord56);
        boolean boolean62 = coord42.estADistanceUn(coord49);
        boolean boolean65 = coord49.estDansPlateau(0, (int) (short) 1);
        fr.umontpellier.iut.algogen.Coord coord68 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (byte) -1);
        boolean boolean69 = coord49.estADistanceUn(coord68);
        boolean boolean70 = coord22.estADistanceUn(coord49);
        boolean boolean71 = coord2.estADistanceUn(coord49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(210, 31);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) 0);
        int int3 = coord2.getC();
        boolean boolean6 = coord2.estDansPlateau((int) (byte) 0, 33);
        int int7 = coord2.getL();
        fr.umontpellier.iut.algogen.Coord coord10 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean13 = coord10.estDansPlateau((int) (byte) -1, (int) ' ');
        int int14 = coord10.getC();
        int int15 = coord10.getC();
        int int16 = coord10.getL();
        int int17 = coord10.getL();
        int int18 = coord2.distanceFrom(coord10);
        fr.umontpellier.iut.algogen.Coord coord21 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord24 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int25 = coord21.distanceFrom(coord24);
        int int26 = coord21.getL();
        int int27 = coord21.getC();
        int int28 = coord21.getL();
        java.lang.String str29 = coord21.toString();
        boolean boolean30 = coord2.estADistanceUn(coord21);
        fr.umontpellier.iut.algogen.Coord coord33 = new fr.umontpellier.iut.algogen.Coord((int) ' ', 0);
        boolean boolean35 = coord33.equals((java.lang.Object) (-1L));
        boolean boolean38 = coord33.estDansPlateau((int) (byte) 10, 100);
        int int39 = coord33.getL();
        fr.umontpellier.iut.algogen.Coord coord42 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord45 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int46 = coord42.distanceFrom(coord45);
        fr.umontpellier.iut.algogen.Coord coord49 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord52 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int53 = coord49.distanceFrom(coord52);
        boolean boolean54 = coord42.estADistanceUn(coord49);
        boolean boolean55 = coord33.equals((java.lang.Object) coord42);
        int int56 = coord42.getL();
        fr.umontpellier.iut.algogen.Coord coord59 = new fr.umontpellier.iut.algogen.Coord((int) (short) 100, 21);
        fr.umontpellier.iut.algogen.Coord coord62 = new fr.umontpellier.iut.algogen.Coord(1, (-1));
        fr.umontpellier.iut.algogen.Coord coord65 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) 0);
        fr.umontpellier.iut.algogen.Coord coord68 = new fr.umontpellier.iut.algogen.Coord(10, (int) (short) 10);
        boolean boolean69 = coord65.estADistanceUn(coord68);
        boolean boolean70 = coord62.equals((java.lang.Object) coord65);
        boolean boolean71 = coord59.equals((java.lang.Object) boolean70);
        int int72 = coord59.getC();
        boolean boolean73 = coord42.estADistanceUn(coord59);
        boolean boolean74 = coord2.estADistanceUn(coord42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "(0,-1)" + "'", str29, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 32 + "'", int39 == 32);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 21 + "'", int72 == 21);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(133, 127);
        java.lang.String str3 = coord2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(133,127)" + "'", str3, "(133,127)");
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(276, (int) (byte) 1);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int6 = coord2.distanceFrom(coord5);
        int int7 = coord2.getL();
        fr.umontpellier.iut.algogen.Coord coord10 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord13 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int14 = coord10.distanceFrom(coord13);
        fr.umontpellier.iut.algogen.Coord coord17 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord20 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int21 = coord17.distanceFrom(coord20);
        boolean boolean22 = coord10.estADistanceUn(coord17);
        int int23 = coord17.getC();
        fr.umontpellier.iut.algogen.Coord coord26 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        int int27 = coord17.distanceFrom(coord26);
        boolean boolean29 = coord26.equals((java.lang.Object) 0);
        boolean boolean30 = coord2.estADistanceUn(coord26);
        fr.umontpellier.iut.algogen.Coord coord33 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str34 = coord33.toString();
        java.lang.String str35 = coord33.toString();
        fr.umontpellier.iut.algogen.Coord coord38 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord41 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int42 = coord38.distanceFrom(coord41);
        int int43 = coord38.getC();
        boolean boolean44 = coord33.estADistanceUn(coord38);
        java.lang.String str45 = coord38.toString();
        boolean boolean46 = coord2.equals((java.lang.Object) coord38);
        int int47 = coord38.getL();
        fr.umontpellier.iut.algogen.Coord coord50 = new fr.umontpellier.iut.algogen.Coord((int) '#', (int) ' ');
        boolean boolean53 = coord50.estDansPlateau((-1), 0);
        int int54 = coord38.distanceFrom(coord50);
        fr.umontpellier.iut.algogen.Coord coord57 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, 21);
        boolean boolean58 = coord38.estADistanceUn(coord57);
        int int59 = coord38.getL();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 101 + "'", int27 == 101);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "(0,-1)" + "'", str34, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "(0,-1)" + "'", str35, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "(0,-1)" + "'", str45, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 68 + "'", int54 == 68);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) 0);
        int int3 = coord2.getC();
        boolean boolean6 = coord2.estDansPlateau((int) (byte) 0, 33);
        int int7 = coord2.getL();
        fr.umontpellier.iut.algogen.Coord coord10 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean13 = coord10.estDansPlateau((int) (byte) -1, (int) ' ');
        int int14 = coord10.getC();
        int int15 = coord10.getC();
        int int16 = coord10.getL();
        int int17 = coord10.getL();
        int int18 = coord2.distanceFrom(coord10);
        fr.umontpellier.iut.algogen.Coord coord21 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean24 = coord21.estDansPlateau((int) (byte) -1, (int) ' ');
        boolean boolean27 = coord21.estDansPlateau((int) ' ', (int) (byte) 1);
        int int28 = coord21.getL();
        boolean boolean30 = coord21.equals((java.lang.Object) 33);
        fr.umontpellier.iut.algogen.Coord coord33 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        boolean boolean35 = coord33.equals((java.lang.Object) 'a');
        fr.umontpellier.iut.algogen.Coord coord38 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str39 = coord38.toString();
        java.lang.String str40 = coord38.toString();
        fr.umontpellier.iut.algogen.Coord coord43 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord46 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int47 = coord43.distanceFrom(coord46);
        int int48 = coord43.getC();
        boolean boolean49 = coord38.estADistanceUn(coord43);
        int int50 = coord33.distanceFrom(coord38);
        fr.umontpellier.iut.algogen.Coord coord53 = new fr.umontpellier.iut.algogen.Coord(101, 101);
        int int54 = coord53.getL();
        int int55 = coord53.getC();
        fr.umontpellier.iut.algogen.Coord coord58 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean61 = coord58.estDansPlateau((int) (byte) -1, (int) ' ');
        int int62 = coord58.getC();
        int int63 = coord58.getC();
        fr.umontpellier.iut.algogen.Coord coord66 = new fr.umontpellier.iut.algogen.Coord(32, 32);
        int int67 = coord58.distanceFrom(coord66);
        boolean boolean68 = coord53.equals((java.lang.Object) coord58);
        java.lang.Object obj69 = null;
        boolean boolean70 = coord58.equals(obj69);
        fr.umontpellier.iut.algogen.Coord coord73 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord76 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int77 = coord73.distanceFrom(coord76);
        fr.umontpellier.iut.algogen.Coord coord80 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord83 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int84 = coord80.distanceFrom(coord83);
        boolean boolean85 = coord73.estADistanceUn(coord80);
        int int86 = coord80.getC();
        fr.umontpellier.iut.algogen.Coord coord89 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        int int90 = coord80.distanceFrom(coord89);
        int int91 = coord80.getL();
        boolean boolean94 = coord80.estDansPlateau((int) (short) 100, 1);
        int int95 = coord58.distanceFrom(coord80);
        boolean boolean96 = coord33.estADistanceUn(coord58);
        int int97 = coord21.distanceFrom(coord58);
        boolean boolean98 = coord10.estADistanceUn(coord58);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "(0,-1)" + "'", str39, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "(0,-1)" + "'", str40, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 101 + "'", int54 == 101);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 101 + "'", int55 == 101);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 65 + "'", int67 == 65);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 101 + "'", int90 == 101);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 2 + "'", int95 == 2);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(43, 68);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(101, 101);
        int int3 = coord2.getL();
        int int4 = coord2.getC();
        java.lang.Object obj5 = null;
        boolean boolean6 = coord2.equals(obj5);
        int int7 = coord2.getC();
        fr.umontpellier.iut.algogen.Coord coord10 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord13 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int14 = coord10.distanceFrom(coord13);
        int int15 = coord10.getL();
        fr.umontpellier.iut.algogen.Coord coord18 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord21 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int22 = coord18.distanceFrom(coord21);
        int int23 = coord18.getL();
        fr.umontpellier.iut.algogen.Coord coord26 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord29 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int30 = coord26.distanceFrom(coord29);
        fr.umontpellier.iut.algogen.Coord coord33 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord36 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int37 = coord33.distanceFrom(coord36);
        fr.umontpellier.iut.algogen.Coord coord40 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord43 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int44 = coord40.distanceFrom(coord43);
        boolean boolean45 = coord33.estADistanceUn(coord40);
        boolean boolean46 = coord26.estADistanceUn(coord33);
        boolean boolean49 = coord33.estDansPlateau(0, (int) (short) 1);
        int int50 = coord18.distanceFrom(coord33);
        boolean boolean51 = coord10.equals((java.lang.Object) coord18);
        fr.umontpellier.iut.algogen.Coord coord54 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord57 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int58 = coord54.distanceFrom(coord57);
        fr.umontpellier.iut.algogen.Coord coord61 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord64 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int65 = coord61.distanceFrom(coord64);
        boolean boolean66 = coord54.estADistanceUn(coord61);
        int int67 = coord61.getC();
        fr.umontpellier.iut.algogen.Coord coord70 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        int int71 = coord61.distanceFrom(coord70);
        boolean boolean73 = coord70.equals((java.lang.Object) 0);
        boolean boolean76 = coord70.estDansPlateau((int) (short) 100, 100);
        int int77 = coord18.distanceFrom(coord70);
        fr.umontpellier.iut.algogen.Coord coord80 = new fr.umontpellier.iut.algogen.Coord(100, (int) (short) 0);
        int int81 = coord18.distanceFrom(coord80);
        int int82 = coord2.distanceFrom(coord80);
        boolean boolean85 = coord2.estDansPlateau(31, 151);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 101 + "'", int7 == 101);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 101 + "'", int71 == 101);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 101 + "'", int77 == 101);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 101 + "'", int81 == 101);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 102 + "'", int82 == 102);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int3 = coord2.getL();
        fr.umontpellier.iut.algogen.Coord coord6 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord9 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int10 = coord6.distanceFrom(coord9);
        boolean boolean12 = coord6.equals((java.lang.Object) (byte) 1);
        fr.umontpellier.iut.algogen.Coord coord15 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        boolean boolean16 = coord6.equals((java.lang.Object) (byte) 100);
        fr.umontpellier.iut.algogen.Coord coord19 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord22 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int23 = coord19.distanceFrom(coord22);
        int int24 = coord19.getL();
        fr.umontpellier.iut.algogen.Coord coord27 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord30 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int31 = coord27.distanceFrom(coord30);
        int int32 = coord27.getL();
        fr.umontpellier.iut.algogen.Coord coord35 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord38 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int39 = coord35.distanceFrom(coord38);
        fr.umontpellier.iut.algogen.Coord coord42 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord45 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int46 = coord42.distanceFrom(coord45);
        fr.umontpellier.iut.algogen.Coord coord49 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord52 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int53 = coord49.distanceFrom(coord52);
        boolean boolean54 = coord42.estADistanceUn(coord49);
        boolean boolean55 = coord35.estADistanceUn(coord42);
        boolean boolean58 = coord42.estDansPlateau(0, (int) (short) 1);
        int int59 = coord27.distanceFrom(coord42);
        boolean boolean60 = coord19.equals((java.lang.Object) coord27);
        int int61 = coord6.distanceFrom(coord27);
        int int62 = coord6.getC();
        int int63 = coord2.distanceFrom(coord6);
        fr.umontpellier.iut.algogen.Coord coord66 = new fr.umontpellier.iut.algogen.Coord((int) ' ', 0);
        boolean boolean68 = coord66.equals((java.lang.Object) (-1L));
        boolean boolean71 = coord66.estDansPlateau((int) (byte) 10, 100);
        int int72 = coord66.getL();
        fr.umontpellier.iut.algogen.Coord coord75 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord78 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int79 = coord75.distanceFrom(coord78);
        fr.umontpellier.iut.algogen.Coord coord82 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord85 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int86 = coord82.distanceFrom(coord85);
        boolean boolean87 = coord75.estADistanceUn(coord82);
        boolean boolean88 = coord66.equals((java.lang.Object) coord75);
        int int89 = coord75.getL();
        int int90 = coord75.getL();
        boolean boolean91 = coord6.equals((java.lang.Object) int90);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 32 + "'", int72 == 32);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) '#', (int) ' ');
        boolean boolean5 = coord2.estDansPlateau((-1), 0);
        fr.umontpellier.iut.algogen.Coord coord8 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean11 = coord8.estDansPlateau((int) (byte) -1, (int) ' ');
        boolean boolean12 = coord2.estADistanceUn(coord8);
        int int13 = coord8.getL();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int6 = coord2.distanceFrom(coord5);
        int int7 = coord2.getL();
        int int8 = coord2.getC();
        int int9 = coord2.getL();
        java.lang.String str10 = coord2.toString();
        fr.umontpellier.iut.algogen.Coord coord13 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (byte) 0);
        boolean boolean14 = coord2.equals((java.lang.Object) coord13);
        fr.umontpellier.iut.algogen.Coord coord17 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) 0);
        int int18 = coord17.getC();
        boolean boolean21 = coord17.estDansPlateau((int) (byte) 0, 33);
        int int22 = coord17.getL();
        fr.umontpellier.iut.algogen.Coord coord25 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean28 = coord25.estDansPlateau((int) (byte) -1, (int) ' ');
        int int29 = coord25.getC();
        int int30 = coord25.getC();
        int int31 = coord25.getL();
        int int32 = coord25.getL();
        int int33 = coord17.distanceFrom(coord25);
        int int34 = coord25.getC();
        fr.umontpellier.iut.algogen.Coord coord37 = new fr.umontpellier.iut.algogen.Coord(101, 101);
        int int38 = coord37.getL();
        int int39 = coord37.getC();
        fr.umontpellier.iut.algogen.Coord coord42 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean45 = coord42.estDansPlateau((int) (byte) -1, (int) ' ');
        int int46 = coord42.getC();
        int int47 = coord42.getC();
        fr.umontpellier.iut.algogen.Coord coord50 = new fr.umontpellier.iut.algogen.Coord(32, 32);
        int int51 = coord42.distanceFrom(coord50);
        boolean boolean52 = coord37.equals((java.lang.Object) coord42);
        java.lang.Object obj53 = null;
        boolean boolean54 = coord42.equals(obj53);
        fr.umontpellier.iut.algogen.Coord coord57 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord60 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int61 = coord57.distanceFrom(coord60);
        fr.umontpellier.iut.algogen.Coord coord64 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord67 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int68 = coord64.distanceFrom(coord67);
        boolean boolean69 = coord57.estADistanceUn(coord64);
        int int70 = coord64.getC();
        fr.umontpellier.iut.algogen.Coord coord73 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        int int74 = coord64.distanceFrom(coord73);
        int int75 = coord64.getL();
        boolean boolean78 = coord64.estDansPlateau((int) (short) 100, 1);
        int int79 = coord42.distanceFrom(coord64);
        boolean boolean80 = coord25.estADistanceUn(coord42);
        int int81 = coord2.distanceFrom(coord25);
        java.lang.String str82 = coord2.toString();
        fr.umontpellier.iut.algogen.Coord coord85 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str86 = coord85.toString();
        java.lang.String str87 = coord85.toString();
        boolean boolean90 = coord85.estDansPlateau(2, 32);
        boolean boolean91 = coord2.equals((java.lang.Object) coord85);
        java.lang.Class<?> wildcardClass92 = coord2.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(0,-1)" + "'", str10, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 101 + "'", int38 == 101);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 101 + "'", int39 == 101);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 65 + "'", int51 == 65);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 101 + "'", int74 == 101);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 2 + "'", int79 == 2);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 2 + "'", int81 == 2);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "(0,-1)" + "'", str82, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "(0,-1)" + "'", str86, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "(0,-1)" + "'", str87, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int6 = coord2.distanceFrom(coord5);
        boolean boolean8 = coord2.equals((java.lang.Object) (byte) 1);
        java.lang.String str9 = coord2.toString();
        fr.umontpellier.iut.algogen.Coord coord12 = new fr.umontpellier.iut.algogen.Coord((int) (short) 100, (int) (short) 10);
        boolean boolean13 = coord2.estADistanceUn(coord12);
        boolean boolean16 = coord12.estDansPlateau(100, 101);
        java.lang.String str17 = coord12.toString();
        fr.umontpellier.iut.algogen.Coord coord20 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord23 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int24 = coord20.distanceFrom(coord23);
        int int25 = coord20.getC();
        fr.umontpellier.iut.algogen.Coord coord28 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord31 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int32 = coord28.distanceFrom(coord31);
        boolean boolean34 = coord28.equals((java.lang.Object) (byte) 1);
        int int35 = coord28.getL();
        java.lang.String str36 = coord28.toString();
        boolean boolean37 = coord20.equals((java.lang.Object) str36);
        fr.umontpellier.iut.algogen.Coord coord40 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord43 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int44 = coord40.distanceFrom(coord43);
        fr.umontpellier.iut.algogen.Coord coord47 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord50 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int51 = coord47.distanceFrom(coord50);
        boolean boolean52 = coord40.estADistanceUn(coord47);
        int int53 = coord47.getC();
        fr.umontpellier.iut.algogen.Coord coord56 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        int int57 = coord47.distanceFrom(coord56);
        int int58 = coord47.getL();
        boolean boolean61 = coord47.estDansPlateau((int) (short) 100, 1);
        int int62 = coord20.distanceFrom(coord47);
        boolean boolean65 = coord20.estDansPlateau((int) (short) 1, (int) (byte) 1);
        int int66 = coord12.distanceFrom(coord20);
        int int67 = coord12.getL();
        int int68 = coord12.getL();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(0,-1)" + "'", str9, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(100,10)" + "'", str17, "(100,10)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "(0,-1)" + "'", str36, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 101 + "'", int57 == 101);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 111 + "'", int66 == 111);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 100 + "'", int67 == 100);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 100 + "'", int68 == 100);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (byte) -1);
        int int3 = coord2.getL();
        int int4 = coord2.getC();
        int int5 = coord2.getL();
        fr.umontpellier.iut.algogen.Coord coord8 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        java.lang.String str9 = coord8.toString();
        boolean boolean10 = coord2.estADistanceUn(coord8);
        int int11 = coord8.getC();
        java.lang.String str12 = coord8.toString();
        int int13 = coord8.getC();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(100,0)" + "'", str9, "(100,0)");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(100,0)" + "'", str12, "(100,0)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) '4', (int) (short) -1);
        int int3 = coord2.getC();
        fr.umontpellier.iut.algogen.Coord coord6 = new fr.umontpellier.iut.algogen.Coord((int) ' ', (int) (short) 1);
        int int7 = coord6.getL();
        boolean boolean8 = coord2.estADistanceUn(coord6);
        fr.umontpellier.iut.algogen.Coord coord11 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (byte) -1);
        boolean boolean14 = coord11.estDansPlateau((int) ' ', (int) 'a');
        fr.umontpellier.iut.algogen.Coord coord17 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord20 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int21 = coord17.distanceFrom(coord20);
        fr.umontpellier.iut.algogen.Coord coord24 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord27 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int28 = coord24.distanceFrom(coord27);
        boolean boolean29 = coord17.estADistanceUn(coord24);
        int int30 = coord24.getC();
        fr.umontpellier.iut.algogen.Coord coord33 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        int int34 = coord24.distanceFrom(coord33);
        boolean boolean35 = coord11.estADistanceUn(coord24);
        fr.umontpellier.iut.algogen.Coord coord38 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (byte) -1);
        int int39 = coord38.getL();
        int int40 = coord38.getC();
        boolean boolean41 = coord11.estADistanceUn(coord38);
        java.lang.String str42 = coord11.toString();
        boolean boolean43 = coord2.equals((java.lang.Object) coord11);
        boolean boolean46 = coord11.estDansPlateau((int) (short) 0, 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 101 + "'", int34 == 101);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "(-1,-1)" + "'", str42, "(-1,-1)");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) (short) 100, (int) (short) 10);
        boolean boolean5 = coord2.estDansPlateau(101, 32);
        int int6 = coord2.getL();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(101, 101);
        int int3 = coord2.getL();
        java.lang.String str4 = coord2.toString();
        fr.umontpellier.iut.algogen.Coord coord7 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean10 = coord7.estDansPlateau((int) (byte) -1, (int) ' ');
        boolean boolean13 = coord7.estDansPlateau((int) ' ', (int) (byte) 1);
        int int14 = coord7.getL();
        boolean boolean16 = coord7.equals((java.lang.Object) 33);
        fr.umontpellier.iut.algogen.Coord coord19 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        fr.umontpellier.iut.algogen.Coord coord22 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord25 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int26 = coord22.distanceFrom(coord25);
        boolean boolean28 = coord22.equals((java.lang.Object) (byte) 1);
        fr.umontpellier.iut.algogen.Coord coord31 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        boolean boolean32 = coord22.equals((java.lang.Object) (byte) 100);
        boolean boolean33 = coord19.equals((java.lang.Object) (byte) 100);
        int int34 = coord7.distanceFrom(coord19);
        fr.umontpellier.iut.algogen.Coord coord37 = new fr.umontpellier.iut.algogen.Coord(33, (int) (byte) 0);
        boolean boolean38 = coord19.equals((java.lang.Object) coord37);
        boolean boolean39 = coord2.equals((java.lang.Object) coord37);
        fr.umontpellier.iut.algogen.Coord coord42 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (byte) -1);
        int int43 = coord42.getL();
        int int44 = coord42.getC();
        int int45 = coord42.getL();
        int int46 = coord42.getL();
        boolean boolean48 = coord42.equals((java.lang.Object) (-1L));
        fr.umontpellier.iut.algogen.Coord coord51 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        fr.umontpellier.iut.algogen.Coord coord54 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord57 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int58 = coord54.distanceFrom(coord57);
        int int59 = coord54.getL();
        int int60 = coord54.getC();
        int int61 = coord54.getL();
        boolean boolean62 = coord51.estADistanceUn(coord54);
        boolean boolean65 = coord51.estDansPlateau((int) (byte) -1, (int) ' ');
        boolean boolean66 = coord42.equals((java.lang.Object) boolean65);
        java.lang.String str67 = coord42.toString();
        int int68 = coord42.getC();
        boolean boolean69 = coord2.equals((java.lang.Object) int68);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(101,101)" + "'", str4, "(101,101)");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 101 + "'", int34 == 101);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "(-1,-1)" + "'", str67, "(-1,-1)");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(140, 480);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(31, 236);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(130, 54);
        int int3 = coord2.getC();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 54 + "'", int3 == 54);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        boolean boolean5 = coord2.estDansPlateau((int) (byte) 10, (int) (byte) 10);
        fr.umontpellier.iut.algogen.Coord coord8 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) 0);
        int int9 = coord8.getC();
        boolean boolean12 = coord8.estDansPlateau((int) (byte) 0, 33);
        int int13 = coord8.getL();
        fr.umontpellier.iut.algogen.Coord coord16 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean19 = coord16.estDansPlateau((int) (byte) -1, (int) ' ');
        int int20 = coord16.getC();
        int int21 = coord16.getC();
        int int22 = coord16.getL();
        int int23 = coord16.getL();
        int int24 = coord8.distanceFrom(coord16);
        int int25 = coord16.getL();
        boolean boolean26 = coord2.equals((java.lang.Object) int25);
        int int27 = coord2.getL();
        fr.umontpellier.iut.algogen.Coord coord30 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (byte) -1);
        int int31 = coord30.getL();
        int int32 = coord30.getC();
        int int33 = coord30.getL();
        int int34 = coord30.getL();
        int int35 = coord2.distanceFrom(coord30);
        fr.umontpellier.iut.algogen.Coord coord38 = new fr.umontpellier.iut.algogen.Coord((int) '#', 38);
        int int39 = coord38.getC();
        fr.umontpellier.iut.algogen.Coord coord42 = new fr.umontpellier.iut.algogen.Coord(10, (int) (short) 10);
        fr.umontpellier.iut.algogen.Coord coord45 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord48 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int49 = coord45.distanceFrom(coord48);
        boolean boolean51 = coord45.equals((java.lang.Object) (byte) 1);
        java.lang.String str52 = coord45.toString();
        fr.umontpellier.iut.algogen.Coord coord55 = new fr.umontpellier.iut.algogen.Coord((int) (short) 100, (int) (short) 10);
        boolean boolean56 = coord45.estADistanceUn(coord55);
        boolean boolean57 = coord42.equals((java.lang.Object) boolean56);
        fr.umontpellier.iut.algogen.Coord coord60 = new fr.umontpellier.iut.algogen.Coord((int) (short) 10, (int) (short) 1);
        boolean boolean63 = coord60.estDansPlateau((int) (short) 10, 12);
        fr.umontpellier.iut.algogen.Coord coord66 = new fr.umontpellier.iut.algogen.Coord(100, (int) (short) 0);
        boolean boolean69 = coord66.estDansPlateau((int) '#', (int) 'a');
        boolean boolean70 = coord60.equals((java.lang.Object) coord66);
        fr.umontpellier.iut.algogen.Coord coord73 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord76 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int77 = coord73.distanceFrom(coord76);
        int int78 = coord73.getC();
        java.lang.String str79 = coord73.toString();
        int int80 = coord73.getL();
        boolean boolean81 = coord66.estADistanceUn(coord73);
        int int82 = coord42.distanceFrom(coord66);
        int int83 = coord38.distanceFrom(coord66);
        int int84 = coord2.distanceFrom(coord66);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 102 + "'", int35 == 102);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 38 + "'", int39 == 38);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "(0,-1)" + "'", str52, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "(0,-1)" + "'", str79, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 100 + "'", int82 == 100);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 103 + "'", int83 == 103);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str3 = coord2.toString();
        java.lang.String str4 = coord2.toString();
        fr.umontpellier.iut.algogen.Coord coord7 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord10 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int11 = coord7.distanceFrom(coord10);
        int int12 = coord7.getC();
        boolean boolean13 = coord2.estADistanceUn(coord7);
        java.lang.String str14 = coord7.toString();
        boolean boolean17 = coord7.estDansPlateau((int) ' ', (int) (short) 10);
        boolean boolean20 = coord7.estDansPlateau(21, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord23 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord26 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int27 = coord23.distanceFrom(coord26);
        int int28 = coord23.getL();
        fr.umontpellier.iut.algogen.Coord coord31 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord34 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int35 = coord31.distanceFrom(coord34);
        int int36 = coord31.getL();
        fr.umontpellier.iut.algogen.Coord coord39 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord42 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int43 = coord39.distanceFrom(coord42);
        fr.umontpellier.iut.algogen.Coord coord46 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord49 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int50 = coord46.distanceFrom(coord49);
        fr.umontpellier.iut.algogen.Coord coord53 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord56 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int57 = coord53.distanceFrom(coord56);
        boolean boolean58 = coord46.estADistanceUn(coord53);
        boolean boolean59 = coord39.estADistanceUn(coord46);
        boolean boolean62 = coord46.estDansPlateau(0, (int) (short) 1);
        int int63 = coord31.distanceFrom(coord46);
        boolean boolean64 = coord23.equals((java.lang.Object) coord31);
        boolean boolean65 = coord7.estADistanceUn(coord31);
        java.lang.String str66 = coord7.toString();
        int int67 = coord7.getC();
        fr.umontpellier.iut.algogen.Coord coord70 = new fr.umontpellier.iut.algogen.Coord(35, 1);
        int int71 = coord70.getL();
        boolean boolean72 = coord7.estADistanceUn(coord70);
        fr.umontpellier.iut.algogen.Coord coord75 = new fr.umontpellier.iut.algogen.Coord(135, 65);
        int int76 = coord70.distanceFrom(coord75);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0,-1)" + "'", str3, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(0,-1)" + "'", str4, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(0,-1)" + "'", str14, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "(0,-1)" + "'", str66, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 35 + "'", int71 == 35);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 164 + "'", int76 == 164);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int6 = coord2.distanceFrom(coord5);
        java.lang.String str7 = coord5.toString();
        fr.umontpellier.iut.algogen.Coord coord10 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord13 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int14 = coord10.distanceFrom(coord13);
        int int15 = coord13.getC();
        int int16 = coord5.distanceFrom(coord13);
        fr.umontpellier.iut.algogen.Coord coord19 = new fr.umontpellier.iut.algogen.Coord(1, (-1));
        fr.umontpellier.iut.algogen.Coord coord22 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) 0);
        fr.umontpellier.iut.algogen.Coord coord25 = new fr.umontpellier.iut.algogen.Coord(10, (int) (short) 10);
        boolean boolean26 = coord22.estADistanceUn(coord25);
        boolean boolean27 = coord19.equals((java.lang.Object) coord22);
        fr.umontpellier.iut.algogen.Coord coord30 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str31 = coord30.toString();
        java.lang.String str32 = coord30.toString();
        fr.umontpellier.iut.algogen.Coord coord35 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord38 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int39 = coord35.distanceFrom(coord38);
        int int40 = coord35.getC();
        boolean boolean41 = coord30.estADistanceUn(coord35);
        java.lang.String str42 = coord30.toString();
        int int43 = coord22.distanceFrom(coord30);
        boolean boolean44 = coord13.estADistanceUn(coord30);
        fr.umontpellier.iut.algogen.Coord coord47 = new fr.umontpellier.iut.algogen.Coord((int) ' ', 0);
        fr.umontpellier.iut.algogen.Coord coord50 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord53 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int54 = coord50.distanceFrom(coord53);
        fr.umontpellier.iut.algogen.Coord coord57 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord60 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int61 = coord57.distanceFrom(coord60);
        boolean boolean62 = coord50.estADistanceUn(coord57);
        boolean boolean63 = coord47.estADistanceUn(coord50);
        boolean boolean66 = coord47.estDansPlateau((int) (short) 10, (int) (byte) -1);
        java.lang.String str67 = coord47.toString();
        int int68 = coord13.distanceFrom(coord47);
        java.lang.String str69 = coord13.toString();
        fr.umontpellier.iut.algogen.Coord coord72 = new fr.umontpellier.iut.algogen.Coord(101, (int) (short) 0);
        boolean boolean73 = coord13.equals((java.lang.Object) (short) 0);
        java.lang.String str74 = coord13.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(0,-1)" + "'", str7, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "(0,-1)" + "'", str31, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "(0,-1)" + "'", str32, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "(0,-1)" + "'", str42, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "(32,0)" + "'", str67, "(32,0)");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 33 + "'", int68 == 33);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "(0,-1)" + "'", str69, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "(0,-1)" + "'", str74, "(0,-1)");
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 1, (int) '#');
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord8 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int9 = coord5.distanceFrom(coord8);
        fr.umontpellier.iut.algogen.Coord coord12 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord15 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int16 = coord12.distanceFrom(coord15);
        fr.umontpellier.iut.algogen.Coord coord19 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord22 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int23 = coord19.distanceFrom(coord22);
        boolean boolean24 = coord12.estADistanceUn(coord19);
        boolean boolean25 = coord5.estADistanceUn(coord12);
        boolean boolean28 = coord12.estDansPlateau(0, (int) (short) 1);
        fr.umontpellier.iut.algogen.Coord coord31 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (byte) -1);
        boolean boolean32 = coord12.estADistanceUn(coord31);
        boolean boolean33 = coord2.equals((java.lang.Object) boolean32);
        java.lang.String str34 = coord2.toString();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "(1,35)" + "'", str34, "(1,35)");
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(101, 1);
        boolean boolean5 = coord2.estDansPlateau((int) (byte) 100, (int) ' ');
        boolean boolean8 = coord2.estDansPlateau((int) '#', 0);
        int int9 = coord2.getL();
        java.lang.Class<?> wildcardClass10 = coord2.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(231, 87);
        int int3 = coord2.getL();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 231 + "'", int3 == 231);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean5 = coord2.estDansPlateau((int) (byte) -1, (int) ' ');
        fr.umontpellier.iut.algogen.Coord coord8 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord11 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int12 = coord8.distanceFrom(coord11);
        boolean boolean14 = coord8.equals((java.lang.Object) (byte) 1);
        java.lang.String str15 = coord8.toString();
        boolean boolean16 = coord2.equals((java.lang.Object) coord8);
        fr.umontpellier.iut.algogen.Coord coord19 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord22 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int23 = coord19.distanceFrom(coord22);
        fr.umontpellier.iut.algogen.Coord coord26 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord29 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int30 = coord26.distanceFrom(coord29);
        fr.umontpellier.iut.algogen.Coord coord33 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord36 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int37 = coord33.distanceFrom(coord36);
        boolean boolean38 = coord26.estADistanceUn(coord33);
        boolean boolean39 = coord19.estADistanceUn(coord26);
        boolean boolean42 = coord26.estDansPlateau(0, (int) (short) 1);
        fr.umontpellier.iut.algogen.Coord coord45 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (byte) -1);
        boolean boolean46 = coord26.estADistanceUn(coord45);
        int int47 = coord45.getL();
        boolean boolean48 = coord8.estADistanceUn(coord45);
        java.lang.String str49 = coord45.toString();
        int int50 = coord45.getL();
        java.lang.String str51 = coord45.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(0,-1)" + "'", str15, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "(-1,-1)" + "'", str49, "(-1,-1)");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "(-1,-1)" + "'", str51, "(-1,-1)");
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int6 = coord2.distanceFrom(coord5);
        boolean boolean8 = coord2.equals((java.lang.Object) (byte) 1);
        java.lang.String str9 = coord2.toString();
        fr.umontpellier.iut.algogen.Coord coord12 = new fr.umontpellier.iut.algogen.Coord((int) (short) 100, (int) (short) 10);
        boolean boolean13 = coord2.estADistanceUn(coord12);
        boolean boolean16 = coord12.estDansPlateau(100, 101);
        boolean boolean19 = coord12.estDansPlateau(21, (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(0,-1)" + "'", str9, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int6 = coord2.distanceFrom(coord5);
        int int7 = coord2.getL();
        int int8 = coord2.getC();
        int int9 = coord2.getL();
        java.lang.String str10 = coord2.toString();
        int int11 = coord2.getL();
        int int12 = coord2.getL();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(0,-1)" + "'", str10, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str3 = coord2.toString();
        java.lang.String str4 = coord2.toString();
        fr.umontpellier.iut.algogen.Coord coord7 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord10 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int11 = coord7.distanceFrom(coord10);
        int int12 = coord7.getC();
        boolean boolean13 = coord2.estADistanceUn(coord7);
        fr.umontpellier.iut.algogen.Coord coord16 = new fr.umontpellier.iut.algogen.Coord(101, 101);
        boolean boolean19 = coord16.estDansPlateau((int) (short) 10, 32);
        boolean boolean20 = coord7.estADistanceUn(coord16);
        fr.umontpellier.iut.algogen.Coord coord23 = new fr.umontpellier.iut.algogen.Coord(101, 101);
        int int24 = coord23.getL();
        int int25 = coord23.getC();
        fr.umontpellier.iut.algogen.Coord coord28 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean31 = coord28.estDansPlateau((int) (byte) -1, (int) ' ');
        int int32 = coord28.getC();
        int int33 = coord28.getC();
        fr.umontpellier.iut.algogen.Coord coord36 = new fr.umontpellier.iut.algogen.Coord(32, 32);
        int int37 = coord28.distanceFrom(coord36);
        boolean boolean38 = coord23.equals((java.lang.Object) coord28);
        int int39 = coord28.getC();
        fr.umontpellier.iut.algogen.Coord coord42 = new fr.umontpellier.iut.algogen.Coord((int) (short) 10, (int) (short) 0);
        boolean boolean43 = coord28.equals((java.lang.Object) coord42);
        int int44 = coord7.distanceFrom(coord28);
        fr.umontpellier.iut.algogen.Coord coord47 = new fr.umontpellier.iut.algogen.Coord(103, 68);
        boolean boolean48 = coord28.equals((java.lang.Object) coord47);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0,-1)" + "'", str3, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(0,-1)" + "'", str4, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 101 + "'", int24 == 101);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 101 + "'", int25 == 101);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 65 + "'", int37 == 65);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int6 = coord2.distanceFrom(coord5);
        boolean boolean8 = coord2.equals((java.lang.Object) (byte) 1);
        java.lang.String str9 = coord2.toString();
        fr.umontpellier.iut.algogen.Coord coord12 = new fr.umontpellier.iut.algogen.Coord((int) (short) 100, (int) (short) 10);
        boolean boolean13 = coord2.estADistanceUn(coord12);
        boolean boolean16 = coord12.estDansPlateau(100, 101);
        java.lang.String str17 = coord12.toString();
        fr.umontpellier.iut.algogen.Coord coord20 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord23 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int24 = coord20.distanceFrom(coord23);
        int int25 = coord20.getC();
        fr.umontpellier.iut.algogen.Coord coord28 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord31 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int32 = coord28.distanceFrom(coord31);
        boolean boolean34 = coord28.equals((java.lang.Object) (byte) 1);
        int int35 = coord28.getL();
        java.lang.String str36 = coord28.toString();
        boolean boolean37 = coord20.equals((java.lang.Object) str36);
        fr.umontpellier.iut.algogen.Coord coord40 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord43 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int44 = coord40.distanceFrom(coord43);
        fr.umontpellier.iut.algogen.Coord coord47 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord50 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int51 = coord47.distanceFrom(coord50);
        boolean boolean52 = coord40.estADistanceUn(coord47);
        int int53 = coord47.getC();
        fr.umontpellier.iut.algogen.Coord coord56 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        int int57 = coord47.distanceFrom(coord56);
        int int58 = coord47.getL();
        boolean boolean61 = coord47.estDansPlateau((int) (short) 100, 1);
        int int62 = coord20.distanceFrom(coord47);
        boolean boolean65 = coord20.estDansPlateau((int) (short) 1, (int) (byte) 1);
        int int66 = coord12.distanceFrom(coord20);
        int int67 = coord12.getC();
        java.lang.String str68 = coord12.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(0,-1)" + "'", str9, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(100,10)" + "'", str17, "(100,10)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "(0,-1)" + "'", str36, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 101 + "'", int57 == 101);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 111 + "'", int66 == 111);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 10 + "'", int67 == 10);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "(100,10)" + "'", str68, "(100,10)");
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int6 = coord2.distanceFrom(coord5);
        fr.umontpellier.iut.algogen.Coord coord9 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord12 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int13 = coord9.distanceFrom(coord12);
        fr.umontpellier.iut.algogen.Coord coord16 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord19 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int20 = coord16.distanceFrom(coord19);
        boolean boolean21 = coord9.estADistanceUn(coord16);
        boolean boolean22 = coord2.estADistanceUn(coord9);
        fr.umontpellier.iut.algogen.Coord coord25 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str26 = coord25.toString();
        java.lang.String str27 = coord25.toString();
        fr.umontpellier.iut.algogen.Coord coord30 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord33 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int34 = coord30.distanceFrom(coord33);
        int int35 = coord30.getC();
        boolean boolean36 = coord25.estADistanceUn(coord30);
        java.lang.String str37 = coord25.toString();
        int int38 = coord25.getL();
        boolean boolean39 = coord9.equals((java.lang.Object) int38);
        int int40 = coord9.getL();
        boolean boolean43 = coord9.estDansPlateau(2, (int) (short) 10);
        fr.umontpellier.iut.algogen.Coord coord46 = new fr.umontpellier.iut.algogen.Coord(100, (int) (byte) -1);
        boolean boolean47 = coord9.estADistanceUn(coord46);
        int int48 = coord46.getC();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(0,-1)" + "'", str26, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(0,-1)" + "'", str27, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "(0,-1)" + "'", str37, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean5 = coord2.estDansPlateau((int) (byte) -1, (int) ' ');
        fr.umontpellier.iut.algogen.Coord coord8 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord11 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int12 = coord8.distanceFrom(coord11);
        boolean boolean14 = coord8.equals((java.lang.Object) (byte) 1);
        java.lang.String str15 = coord8.toString();
        boolean boolean16 = coord2.equals((java.lang.Object) coord8);
        fr.umontpellier.iut.algogen.Coord coord19 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str20 = coord19.toString();
        java.lang.String str21 = coord19.toString();
        fr.umontpellier.iut.algogen.Coord coord24 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord27 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int28 = coord24.distanceFrom(coord27);
        int int29 = coord24.getC();
        boolean boolean30 = coord19.estADistanceUn(coord24);
        java.lang.String str31 = coord19.toString();
        int int32 = coord19.getL();
        boolean boolean35 = coord19.estDansPlateau((int) (short) -1, (int) (short) 0);
        fr.umontpellier.iut.algogen.Coord coord38 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord41 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int42 = coord38.distanceFrom(coord41);
        fr.umontpellier.iut.algogen.Coord coord45 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord48 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int49 = coord45.distanceFrom(coord48);
        boolean boolean50 = coord38.estADistanceUn(coord45);
        int int51 = coord45.getC();
        fr.umontpellier.iut.algogen.Coord coord54 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        int int55 = coord45.distanceFrom(coord54);
        boolean boolean57 = coord54.equals((java.lang.Object) 0);
        java.lang.String str58 = coord54.toString();
        int int59 = coord19.distanceFrom(coord54);
        boolean boolean60 = coord8.equals((java.lang.Object) int59);
        boolean boolean63 = coord8.estDansPlateau(35, 52);
        boolean boolean66 = coord8.estDansPlateau(12, 135);
        fr.umontpellier.iut.algogen.Coord coord69 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord72 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int73 = coord69.distanceFrom(coord72);
        fr.umontpellier.iut.algogen.Coord coord76 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord79 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int80 = coord76.distanceFrom(coord79);
        boolean boolean81 = coord69.estADistanceUn(coord76);
        int int82 = coord76.getC();
        fr.umontpellier.iut.algogen.Coord coord85 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        int int86 = coord76.distanceFrom(coord85);
        boolean boolean88 = coord85.equals((java.lang.Object) 0);
        boolean boolean89 = coord8.estADistanceUn(coord85);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(0,-1)" + "'", str15, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(0,-1)" + "'", str20, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(0,-1)" + "'", str21, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "(0,-1)" + "'", str31, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 101 + "'", int55 == 101);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "(100,0)" + "'", str58, "(100,0)");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 101 + "'", int59 == 101);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 101 + "'", int86 == 101);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(52, (int) (short) 0);
        boolean boolean5 = coord2.estDansPlateau(178, 22);
        fr.umontpellier.iut.algogen.Coord coord8 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) 0);
        int int9 = coord8.getC();
        boolean boolean12 = coord8.estDansPlateau((int) (byte) 0, 33);
        int int13 = coord8.getL();
        fr.umontpellier.iut.algogen.Coord coord16 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean19 = coord16.estDansPlateau((int) (byte) -1, (int) ' ');
        int int20 = coord16.getC();
        int int21 = coord16.getC();
        int int22 = coord16.getL();
        int int23 = coord16.getL();
        int int24 = coord8.distanceFrom(coord16);
        int int25 = coord16.getL();
        fr.umontpellier.iut.algogen.Coord coord28 = new fr.umontpellier.iut.algogen.Coord((int) ' ', 0);
        boolean boolean30 = coord28.equals((java.lang.Object) (-1L));
        boolean boolean33 = coord28.estDansPlateau((int) (byte) 10, 100);
        int int34 = coord16.distanceFrom(coord28);
        fr.umontpellier.iut.algogen.Coord coord37 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) 0);
        int int38 = coord37.getC();
        boolean boolean41 = coord37.estDansPlateau((int) (byte) 0, 33);
        int int42 = coord37.getL();
        fr.umontpellier.iut.algogen.Coord coord45 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean48 = coord45.estDansPlateau((int) (byte) -1, (int) ' ');
        int int49 = coord45.getC();
        int int50 = coord45.getC();
        int int51 = coord45.getL();
        int int52 = coord45.getL();
        int int53 = coord37.distanceFrom(coord45);
        int int54 = coord45.getL();
        fr.umontpellier.iut.algogen.Coord coord57 = new fr.umontpellier.iut.algogen.Coord((int) ' ', 0);
        boolean boolean59 = coord57.equals((java.lang.Object) (-1L));
        boolean boolean62 = coord57.estDansPlateau((int) (byte) 10, 100);
        int int63 = coord45.distanceFrom(coord57);
        int int64 = coord16.distanceFrom(coord45);
        java.lang.String str65 = coord45.toString();
        boolean boolean66 = coord2.equals((java.lang.Object) str65);
        java.lang.Class<?> wildcardClass67 = coord2.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 33 + "'", int34 == 33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 33 + "'", int63 == 33);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "(-1,0)" + "'", str65, "(-1,0)");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int6 = coord2.distanceFrom(coord5);
        fr.umontpellier.iut.algogen.Coord coord9 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord12 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int13 = coord9.distanceFrom(coord12);
        fr.umontpellier.iut.algogen.Coord coord16 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord19 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int20 = coord16.distanceFrom(coord19);
        boolean boolean21 = coord9.estADistanceUn(coord16);
        boolean boolean22 = coord2.estADistanceUn(coord9);
        fr.umontpellier.iut.algogen.Coord coord25 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str26 = coord25.toString();
        java.lang.String str27 = coord25.toString();
        fr.umontpellier.iut.algogen.Coord coord30 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord33 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int34 = coord30.distanceFrom(coord33);
        int int35 = coord30.getC();
        boolean boolean36 = coord25.estADistanceUn(coord30);
        java.lang.String str37 = coord25.toString();
        int int38 = coord25.getL();
        boolean boolean39 = coord9.equals((java.lang.Object) int38);
        fr.umontpellier.iut.algogen.Coord coord42 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        fr.umontpellier.iut.algogen.Coord coord45 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord48 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int49 = coord45.distanceFrom(coord48);
        int int50 = coord45.getL();
        int int51 = coord45.getC();
        int int52 = coord45.getL();
        boolean boolean53 = coord42.estADistanceUn(coord45);
        boolean boolean54 = coord9.estADistanceUn(coord45);
        int int55 = coord9.getL();
        java.lang.String str56 = coord9.toString();
        boolean boolean59 = coord9.estDansPlateau(0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(0,-1)" + "'", str26, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(0,-1)" + "'", str27, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "(0,-1)" + "'", str37, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "(0,-1)" + "'", str56, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int3 = coord2.getL();
        int int4 = coord2.getL();
        int int5 = coord2.getC();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int6 = coord2.distanceFrom(coord5);
        int int7 = coord2.getC();
        int int8 = coord2.getL();
        fr.umontpellier.iut.algogen.Coord coord11 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord14 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int15 = coord11.distanceFrom(coord14);
        fr.umontpellier.iut.algogen.Coord coord18 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord21 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int22 = coord18.distanceFrom(coord21);
        boolean boolean23 = coord11.estADistanceUn(coord18);
        int int24 = coord18.getC();
        fr.umontpellier.iut.algogen.Coord coord27 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        int int28 = coord18.distanceFrom(coord27);
        int int29 = coord18.getL();
        int int30 = coord2.distanceFrom(coord18);
        fr.umontpellier.iut.algogen.Coord coord33 = new fr.umontpellier.iut.algogen.Coord((int) ' ', 0);
        fr.umontpellier.iut.algogen.Coord coord36 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord39 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int40 = coord36.distanceFrom(coord39);
        fr.umontpellier.iut.algogen.Coord coord43 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord46 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int47 = coord43.distanceFrom(coord46);
        boolean boolean48 = coord36.estADistanceUn(coord43);
        boolean boolean49 = coord33.estADistanceUn(coord36);
        java.lang.String str50 = coord36.toString();
        java.lang.Class<?> wildcardClass51 = coord36.getClass();
        boolean boolean52 = coord2.equals((java.lang.Object) coord36);
        boolean boolean55 = coord2.estDansPlateau(22, 150);
        java.lang.String str56 = coord2.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 101 + "'", int28 == 101);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "(0,-1)" + "'", str50, "(0,-1)");
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "(0,-1)" + "'", str56, "(0,-1)");
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(32, (int) (short) 1);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord((int) '#', 52);
        int int6 = coord2.distanceFrom(coord5);
        java.lang.String str7 = coord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 54 + "'", int6 == 54);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(35,52)" + "'", str7, "(35,52)");
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int6 = coord2.distanceFrom(coord5);
        fr.umontpellier.iut.algogen.Coord coord9 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord12 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int13 = coord9.distanceFrom(coord12);
        boolean boolean14 = coord2.estADistanceUn(coord9);
        fr.umontpellier.iut.algogen.Coord coord17 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord20 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int21 = coord17.distanceFrom(coord20);
        boolean boolean23 = coord17.equals((java.lang.Object) (byte) 1);
        boolean boolean26 = coord17.estDansPlateau(100, (int) (byte) 1);
        int int27 = coord2.distanceFrom(coord17);
        fr.umontpellier.iut.algogen.Coord coord30 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord33 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int34 = coord30.distanceFrom(coord33);
        int int35 = coord17.distanceFrom(coord33);
        fr.umontpellier.iut.algogen.Coord coord38 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 1, (-1));
        int int39 = coord33.distanceFrom(coord38);
        boolean boolean42 = coord38.estDansPlateau(200, 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (byte) 10);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str6 = coord5.toString();
        java.lang.String str7 = coord5.toString();
        fr.umontpellier.iut.algogen.Coord coord10 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord13 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int14 = coord10.distanceFrom(coord13);
        int int15 = coord10.getC();
        boolean boolean16 = coord5.estADistanceUn(coord10);
        java.lang.String str17 = coord5.toString();
        int int18 = coord5.getL();
        fr.umontpellier.iut.algogen.Coord coord21 = new fr.umontpellier.iut.algogen.Coord((int) ' ', 0);
        boolean boolean23 = coord21.equals((java.lang.Object) (-1L));
        fr.umontpellier.iut.algogen.Coord coord26 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord29 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int30 = coord26.distanceFrom(coord29);
        int int31 = coord26.getC();
        java.lang.String str32 = coord26.toString();
        int int33 = coord26.getL();
        int int34 = coord21.distanceFrom(coord26);
        fr.umontpellier.iut.algogen.Coord coord37 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        boolean boolean39 = coord37.equals((java.lang.Object) 'a');
        fr.umontpellier.iut.algogen.Coord coord42 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str43 = coord42.toString();
        java.lang.String str44 = coord42.toString();
        fr.umontpellier.iut.algogen.Coord coord47 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord50 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int51 = coord47.distanceFrom(coord50);
        int int52 = coord47.getC();
        boolean boolean53 = coord42.estADistanceUn(coord47);
        int int54 = coord37.distanceFrom(coord42);
        int int55 = coord21.distanceFrom(coord37);
        boolean boolean56 = coord5.estADistanceUn(coord21);
        java.lang.String str57 = coord21.toString();
        boolean boolean60 = coord21.estDansPlateau(2, (int) (short) 0);
        java.lang.String str61 = coord21.toString();
        java.lang.String str62 = coord21.toString();
        boolean boolean63 = coord2.estADistanceUn(coord21);
        boolean boolean66 = coord21.estDansPlateau(214, 231);
        java.lang.String str67 = coord21.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(0,-1)" + "'", str6, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(0,-1)" + "'", str7, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(0,-1)" + "'", str17, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "(0,-1)" + "'", str32, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 33 + "'", int34 == 33);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "(0,-1)" + "'", str43, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "(0,-1)" + "'", str44, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 33 + "'", int55 == 33);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "(32,0)" + "'", str57, "(32,0)");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "(32,0)" + "'", str61, "(32,0)");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "(32,0)" + "'", str62, "(32,0)");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "(32,0)" + "'", str67, "(32,0)");
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int6 = coord2.distanceFrom(coord5);
        int int7 = coord2.getC();
        fr.umontpellier.iut.algogen.Coord coord10 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str11 = coord10.toString();
        java.lang.String str12 = coord10.toString();
        boolean boolean13 = coord2.estADistanceUn(coord10);
        int int14 = coord2.getL();
        java.lang.String str15 = coord2.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(0,-1)" + "'", str11, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(0,-1)" + "'", str12, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(0,-1)" + "'", str15, "(0,-1)");
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        boolean boolean4 = coord2.equals((java.lang.Object) 'a');
        fr.umontpellier.iut.algogen.Coord coord7 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str8 = coord7.toString();
        java.lang.String str9 = coord7.toString();
        fr.umontpellier.iut.algogen.Coord coord12 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord15 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int16 = coord12.distanceFrom(coord15);
        int int17 = coord12.getC();
        boolean boolean18 = coord7.estADistanceUn(coord12);
        int int19 = coord2.distanceFrom(coord7);
        boolean boolean22 = coord2.estDansPlateau((int) (byte) 100, 2);
        fr.umontpellier.iut.algogen.Coord coord25 = new fr.umontpellier.iut.algogen.Coord((int) ' ', 0);
        boolean boolean27 = coord25.equals((java.lang.Object) (-1L));
        fr.umontpellier.iut.algogen.Coord coord30 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord33 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int34 = coord30.distanceFrom(coord33);
        int int35 = coord30.getC();
        java.lang.String str36 = coord30.toString();
        int int37 = coord30.getL();
        int int38 = coord25.distanceFrom(coord30);
        boolean boolean39 = coord2.estADistanceUn(coord25);
        boolean boolean42 = coord2.estDansPlateau(62, 123);
        fr.umontpellier.iut.algogen.Coord coord45 = new fr.umontpellier.iut.algogen.Coord(76, 178);
        int int46 = coord2.distanceFrom(coord45);
        fr.umontpellier.iut.algogen.Coord coord49 = new fr.umontpellier.iut.algogen.Coord((int) (short) 100, 100);
        fr.umontpellier.iut.algogen.Coord coord52 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord55 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int56 = coord52.distanceFrom(coord55);
        int int57 = coord52.getC();
        boolean boolean60 = coord52.estDansPlateau((int) (short) 0, (int) (byte) 10);
        fr.umontpellier.iut.algogen.Coord coord63 = new fr.umontpellier.iut.algogen.Coord(1, (-1));
        fr.umontpellier.iut.algogen.Coord coord66 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) 0);
        fr.umontpellier.iut.algogen.Coord coord69 = new fr.umontpellier.iut.algogen.Coord(10, (int) (short) 10);
        boolean boolean70 = coord66.estADistanceUn(coord69);
        boolean boolean71 = coord63.equals((java.lang.Object) coord66);
        fr.umontpellier.iut.algogen.Coord coord74 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str75 = coord74.toString();
        java.lang.String str76 = coord74.toString();
        fr.umontpellier.iut.algogen.Coord coord79 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord82 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int83 = coord79.distanceFrom(coord82);
        int int84 = coord79.getC();
        boolean boolean85 = coord74.estADistanceUn(coord79);
        java.lang.String str86 = coord74.toString();
        int int87 = coord66.distanceFrom(coord74);
        boolean boolean88 = coord52.equals((java.lang.Object) coord74);
        int int89 = coord49.distanceFrom(coord74);
        boolean boolean90 = coord45.equals((java.lang.Object) coord49);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(0,-1)" + "'", str8, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(0,-1)" + "'", str9, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "(0,-1)" + "'", str36, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 33 + "'", int38 == 33);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 255 + "'", int46 == 255);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "(0,-1)" + "'", str75, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "(0,-1)" + "'", str76, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "(0,-1)" + "'", str86, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 1 + "'", int87 == 1);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 201 + "'", int89 == 201);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(149, 74);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (byte) -1);
        int int3 = coord2.getL();
        int int4 = coord2.getC();
        int int5 = coord2.getL();
        fr.umontpellier.iut.algogen.Coord coord8 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        java.lang.String str9 = coord8.toString();
        boolean boolean10 = coord2.estADistanceUn(coord8);
        int int11 = coord8.getC();
        int int12 = coord8.getL();
        fr.umontpellier.iut.algogen.Coord coord15 = new fr.umontpellier.iut.algogen.Coord((int) (short) 1, (int) '4');
        boolean boolean17 = coord15.equals((java.lang.Object) 10L);
        int int18 = coord15.getC();
        boolean boolean19 = coord8.equals((java.lang.Object) int18);
        int int20 = coord8.getL();
        fr.umontpellier.iut.algogen.Coord coord21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = coord8.estADistanceUn(coord21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(100,0)" + "'", str9, "(100,0)");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int6 = coord2.distanceFrom(coord5);
        fr.umontpellier.iut.algogen.Coord coord9 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord12 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int13 = coord9.distanceFrom(coord12);
        fr.umontpellier.iut.algogen.Coord coord16 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord19 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int20 = coord16.distanceFrom(coord19);
        boolean boolean21 = coord9.estADistanceUn(coord16);
        boolean boolean22 = coord2.estADistanceUn(coord9);
        boolean boolean25 = coord9.estDansPlateau(0, (int) (short) 1);
        fr.umontpellier.iut.algogen.Coord coord28 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (byte) -1);
        boolean boolean29 = coord9.estADistanceUn(coord28);
        int int30 = coord28.getL();
        java.lang.Class<?> wildcardClass31 = coord28.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(85, 105);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) ' ', 0);
        boolean boolean4 = coord2.equals((java.lang.Object) (-1L));
        fr.umontpellier.iut.algogen.Coord coord7 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord10 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int11 = coord7.distanceFrom(coord10);
        int int12 = coord7.getC();
        java.lang.String str13 = coord7.toString();
        int int14 = coord7.getL();
        int int15 = coord2.distanceFrom(coord7);
        fr.umontpellier.iut.algogen.Coord coord18 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord21 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int22 = coord18.distanceFrom(coord21);
        int int23 = coord18.getC();
        boolean boolean26 = coord18.estDansPlateau((int) (short) 0, (int) (byte) 10);
        boolean boolean27 = coord2.estADistanceUn(coord18);
        fr.umontpellier.iut.algogen.Coord coord30 = new fr.umontpellier.iut.algogen.Coord(35, 49);
        boolean boolean31 = coord18.equals((java.lang.Object) 49);
        fr.umontpellier.iut.algogen.Coord coord34 = new fr.umontpellier.iut.algogen.Coord(101, 101);
        int int35 = coord34.getL();
        int int36 = coord34.getC();
        fr.umontpellier.iut.algogen.Coord coord39 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean42 = coord39.estDansPlateau((int) (byte) -1, (int) ' ');
        int int43 = coord39.getC();
        int int44 = coord39.getC();
        fr.umontpellier.iut.algogen.Coord coord47 = new fr.umontpellier.iut.algogen.Coord(32, 32);
        int int48 = coord39.distanceFrom(coord47);
        boolean boolean49 = coord34.equals((java.lang.Object) coord39);
        java.lang.Object obj50 = null;
        boolean boolean51 = coord39.equals(obj50);
        fr.umontpellier.iut.algogen.Coord coord54 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord57 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int58 = coord54.distanceFrom(coord57);
        fr.umontpellier.iut.algogen.Coord coord61 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord64 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int65 = coord61.distanceFrom(coord64);
        boolean boolean66 = coord54.estADistanceUn(coord61);
        int int67 = coord61.getC();
        fr.umontpellier.iut.algogen.Coord coord70 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        int int71 = coord61.distanceFrom(coord70);
        int int72 = coord61.getL();
        boolean boolean75 = coord61.estDansPlateau((int) (short) 100, 1);
        int int76 = coord39.distanceFrom(coord61);
        int int77 = coord39.getC();
        int int78 = coord18.distanceFrom(coord39);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(0,-1)" + "'", str13, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 101 + "'", int35 == 101);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 101 + "'", int36 == 101);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 65 + "'", int48 == 65);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 101 + "'", int71 == 101);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 2 + "'", int76 == 2);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 2 + "'", int78 == 2);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int6 = coord2.distanceFrom(coord5);
        int int7 = coord2.getL();
        fr.umontpellier.iut.algogen.Coord coord10 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord13 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int14 = coord10.distanceFrom(coord13);
        fr.umontpellier.iut.algogen.Coord coord17 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord20 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int21 = coord17.distanceFrom(coord20);
        boolean boolean22 = coord10.estADistanceUn(coord17);
        int int23 = coord17.getC();
        fr.umontpellier.iut.algogen.Coord coord26 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        int int27 = coord17.distanceFrom(coord26);
        boolean boolean29 = coord26.equals((java.lang.Object) 0);
        boolean boolean30 = coord2.estADistanceUn(coord26);
        fr.umontpellier.iut.algogen.Coord coord33 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str34 = coord33.toString();
        java.lang.String str35 = coord33.toString();
        fr.umontpellier.iut.algogen.Coord coord38 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord41 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int42 = coord38.distanceFrom(coord41);
        int int43 = coord38.getC();
        boolean boolean44 = coord33.estADistanceUn(coord38);
        java.lang.String str45 = coord38.toString();
        boolean boolean46 = coord2.equals((java.lang.Object) coord38);
        boolean boolean49 = coord38.estDansPlateau((-1), 32);
        int int50 = coord38.getC();
        java.lang.Class<?> wildcardClass51 = coord38.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 101 + "'", int27 == 101);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "(0,-1)" + "'", str34, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "(0,-1)" + "'", str35, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "(0,-1)" + "'", str45, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) ' ', (int) (short) 0);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord8 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int9 = coord5.distanceFrom(coord8);
        fr.umontpellier.iut.algogen.Coord coord12 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord15 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int16 = coord12.distanceFrom(coord15);
        boolean boolean17 = coord5.estADistanceUn(coord12);
        fr.umontpellier.iut.algogen.Coord coord20 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord23 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int24 = coord20.distanceFrom(coord23);
        boolean boolean26 = coord20.equals((java.lang.Object) (byte) 1);
        boolean boolean29 = coord20.estDansPlateau(100, (int) (byte) 1);
        int int30 = coord5.distanceFrom(coord20);
        int int31 = coord20.getL();
        fr.umontpellier.iut.algogen.Coord coord34 = new fr.umontpellier.iut.algogen.Coord(101, 101);
        boolean boolean37 = coord34.estDansPlateau((int) (short) 10, 32);
        boolean boolean40 = coord34.estDansPlateau((int) (byte) 10, (int) (short) 0);
        boolean boolean41 = coord20.estADistanceUn(coord34);
        boolean boolean44 = coord34.estDansPlateau((int) (short) -1, 122);
        boolean boolean45 = coord2.estADistanceUn(coord34);
        int int46 = coord2.getL();
        int int47 = coord2.getL();
        fr.umontpellier.iut.algogen.Coord coord50 = new fr.umontpellier.iut.algogen.Coord(101, 101);
        int int51 = coord50.getL();
        int int52 = coord50.getC();
        fr.umontpellier.iut.algogen.Coord coord55 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean58 = coord55.estDansPlateau((int) (byte) -1, (int) ' ');
        int int59 = coord55.getC();
        int int60 = coord55.getC();
        fr.umontpellier.iut.algogen.Coord coord63 = new fr.umontpellier.iut.algogen.Coord(32, 32);
        int int64 = coord55.distanceFrom(coord63);
        boolean boolean65 = coord50.equals((java.lang.Object) coord55);
        fr.umontpellier.iut.algogen.Coord coord68 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord71 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int72 = coord68.distanceFrom(coord71);
        boolean boolean74 = coord68.equals((java.lang.Object) (byte) 1);
        java.lang.String str75 = coord68.toString();
        fr.umontpellier.iut.algogen.Coord coord78 = new fr.umontpellier.iut.algogen.Coord((int) (short) 100, (int) (short) 10);
        boolean boolean79 = coord68.estADistanceUn(coord78);
        boolean boolean80 = coord55.equals((java.lang.Object) coord78);
        boolean boolean83 = coord55.estDansPlateau(87, (int) (short) 1);
        java.lang.String str84 = coord55.toString();
        boolean boolean85 = coord2.equals((java.lang.Object) coord55);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 32 + "'", int46 == 32);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 32 + "'", int47 == 32);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 101 + "'", int51 == 101);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 101 + "'", int52 == 101);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 65 + "'", int64 == 65);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "(0,-1)" + "'", str75, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "(-1,0)" + "'", str84, "(-1,0)");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) 0);
        int int3 = coord2.getC();
        boolean boolean6 = coord2.estDansPlateau((int) (byte) 0, 33);
        int int7 = coord2.getL();
        fr.umontpellier.iut.algogen.Coord coord10 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean13 = coord10.estDansPlateau((int) (byte) -1, (int) ' ');
        int int14 = coord10.getC();
        int int15 = coord10.getC();
        int int16 = coord10.getL();
        int int17 = coord10.getL();
        int int18 = coord2.distanceFrom(coord10);
        fr.umontpellier.iut.algogen.Coord coord21 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 1, (int) '#');
        fr.umontpellier.iut.algogen.Coord coord24 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord27 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int28 = coord24.distanceFrom(coord27);
        fr.umontpellier.iut.algogen.Coord coord31 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord34 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int35 = coord31.distanceFrom(coord34);
        fr.umontpellier.iut.algogen.Coord coord38 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord41 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int42 = coord38.distanceFrom(coord41);
        boolean boolean43 = coord31.estADistanceUn(coord38);
        boolean boolean44 = coord24.estADistanceUn(coord31);
        boolean boolean47 = coord31.estDansPlateau(0, (int) (short) 1);
        fr.umontpellier.iut.algogen.Coord coord50 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (byte) -1);
        boolean boolean51 = coord31.estADistanceUn(coord50);
        boolean boolean52 = coord21.equals((java.lang.Object) boolean51);
        boolean boolean55 = coord21.estDansPlateau(100, 101);
        boolean boolean58 = coord21.estDansPlateau((int) (byte) 0, 0);
        boolean boolean59 = coord10.equals((java.lang.Object) 0);
        int int60 = coord10.getL();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(32, 178);
        int int3 = coord2.getL();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int6 = coord2.distanceFrom(coord5);
        boolean boolean8 = coord2.equals((java.lang.Object) (byte) 1);
        java.lang.String str9 = coord2.toString();
        fr.umontpellier.iut.algogen.Coord coord12 = new fr.umontpellier.iut.algogen.Coord((int) (short) 100, (int) (short) 10);
        boolean boolean13 = coord2.estADistanceUn(coord12);
        boolean boolean16 = coord12.estDansPlateau(100, 101);
        boolean boolean19 = coord12.estDansPlateau(112, 37);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(0,-1)" + "'", str9, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(99, 11);
        int int3 = coord2.getC();
        fr.umontpellier.iut.algogen.Coord coord6 = new fr.umontpellier.iut.algogen.Coord((int) (short) 10, (int) (short) 1);
        boolean boolean9 = coord6.estDansPlateau((int) (short) 10, 12);
        fr.umontpellier.iut.algogen.Coord coord12 = new fr.umontpellier.iut.algogen.Coord(100, (int) (short) 0);
        boolean boolean15 = coord12.estDansPlateau((int) '#', (int) 'a');
        boolean boolean16 = coord6.equals((java.lang.Object) coord12);
        fr.umontpellier.iut.algogen.Coord coord19 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord22 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int23 = coord19.distanceFrom(coord22);
        int int24 = coord19.getL();
        int int25 = coord19.getC();
        int int26 = coord19.getL();
        fr.umontpellier.iut.algogen.Coord coord29 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int30 = coord19.distanceFrom(coord29);
        int int31 = coord29.getL();
        fr.umontpellier.iut.algogen.Coord coord34 = new fr.umontpellier.iut.algogen.Coord((int) (byte) -1, 0);
        int int35 = coord29.distanceFrom(coord34);
        int int36 = coord12.distanceFrom(coord29);
        int int37 = coord2.distanceFrom(coord29);
        boolean boolean39 = coord2.equals((java.lang.Object) "(33,0)");
        java.lang.String str40 = coord2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 101 + "'", int36 == 101);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 111 + "'", int37 == 111);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "(99,11)" + "'", str40, "(99,11)");
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) 0);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(10, (int) (short) 10);
        boolean boolean6 = coord2.estADistanceUn(coord5);
        java.lang.Object obj7 = null;
        boolean boolean8 = coord5.equals(obj7);
        fr.umontpellier.iut.algogen.Coord coord11 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str12 = coord11.toString();
        java.lang.String str13 = coord11.toString();
        fr.umontpellier.iut.algogen.Coord coord16 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord19 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int20 = coord16.distanceFrom(coord19);
        int int21 = coord16.getC();
        boolean boolean22 = coord11.estADistanceUn(coord16);
        java.lang.String str23 = coord11.toString();
        int int24 = coord11.getL();
        boolean boolean27 = coord11.estDansPlateau((int) (short) -1, (int) (short) 0);
        fr.umontpellier.iut.algogen.Coord coord30 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean33 = coord30.estDansPlateau((int) (byte) -1, (int) ' ');
        boolean boolean34 = coord11.estADistanceUn(coord30);
        java.lang.String str35 = coord30.toString();
        int int36 = coord5.distanceFrom(coord30);
        int int37 = coord30.getC();
        java.lang.Class<?> wildcardClass38 = coord30.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(0,-1)" + "'", str12, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(0,-1)" + "'", str13, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "(0,-1)" + "'", str23, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "(-1,0)" + "'", str35, "(-1,0)");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 21 + "'", int36 == 21);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) 0);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(149, 33);
        fr.umontpellier.iut.algogen.Coord coord8 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean11 = coord8.estDansPlateau((int) (byte) -1, (int) ' ');
        fr.umontpellier.iut.algogen.Coord coord14 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord17 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int18 = coord14.distanceFrom(coord17);
        boolean boolean20 = coord14.equals((java.lang.Object) (byte) 1);
        java.lang.String str21 = coord14.toString();
        boolean boolean22 = coord8.equals((java.lang.Object) coord14);
        fr.umontpellier.iut.algogen.Coord coord25 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord28 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int29 = coord25.distanceFrom(coord28);
        fr.umontpellier.iut.algogen.Coord coord32 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord35 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int36 = coord32.distanceFrom(coord35);
        fr.umontpellier.iut.algogen.Coord coord39 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord42 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int43 = coord39.distanceFrom(coord42);
        boolean boolean44 = coord32.estADistanceUn(coord39);
        boolean boolean45 = coord25.estADistanceUn(coord32);
        boolean boolean48 = coord32.estDansPlateau(0, (int) (short) 1);
        fr.umontpellier.iut.algogen.Coord coord51 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (byte) -1);
        boolean boolean52 = coord32.estADistanceUn(coord51);
        int int53 = coord51.getL();
        boolean boolean54 = coord14.estADistanceUn(coord51);
        fr.umontpellier.iut.algogen.Coord coord57 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str58 = coord57.toString();
        java.lang.String str59 = coord57.toString();
        fr.umontpellier.iut.algogen.Coord coord62 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord65 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int66 = coord62.distanceFrom(coord65);
        int int67 = coord62.getC();
        boolean boolean68 = coord57.estADistanceUn(coord62);
        java.lang.String str69 = coord57.toString();
        int int70 = coord57.getL();
        boolean boolean71 = coord51.equals((java.lang.Object) int70);
        boolean boolean72 = coord5.estADistanceUn(coord51);
        fr.umontpellier.iut.algogen.Coord coord75 = new fr.umontpellier.iut.algogen.Coord(101, 101);
        int int76 = coord75.getL();
        int int77 = coord75.getC();
        fr.umontpellier.iut.algogen.Coord coord80 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean83 = coord80.estDansPlateau((int) (byte) -1, (int) ' ');
        int int84 = coord80.getC();
        int int85 = coord80.getC();
        fr.umontpellier.iut.algogen.Coord coord88 = new fr.umontpellier.iut.algogen.Coord(32, 32);
        int int89 = coord80.distanceFrom(coord88);
        boolean boolean90 = coord75.equals((java.lang.Object) coord80);
        boolean boolean91 = coord51.equals((java.lang.Object) coord80);
        int int92 = coord2.distanceFrom(coord80);
        java.lang.Class<?> wildcardClass93 = coord2.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(0,-1)" + "'", str21, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "(0,-1)" + "'", str58, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "(0,-1)" + "'", str59, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "(0,-1)" + "'", str69, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 101 + "'", int76 == 101);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 101 + "'", int77 == 101);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 65 + "'", int89 == 65);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 1 + "'", int92 == 1);
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        boolean boolean4 = coord2.equals((java.lang.Object) 'a');
        fr.umontpellier.iut.algogen.Coord coord7 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str8 = coord7.toString();
        java.lang.String str9 = coord7.toString();
        fr.umontpellier.iut.algogen.Coord coord12 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord15 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int16 = coord12.distanceFrom(coord15);
        int int17 = coord12.getC();
        boolean boolean18 = coord7.estADistanceUn(coord12);
        int int19 = coord2.distanceFrom(coord7);
        boolean boolean22 = coord2.estDansPlateau((int) (byte) 100, 2);
        fr.umontpellier.iut.algogen.Coord coord25 = new fr.umontpellier.iut.algogen.Coord(101, 101);
        fr.umontpellier.iut.algogen.Coord coord28 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord31 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int32 = coord28.distanceFrom(coord31);
        fr.umontpellier.iut.algogen.Coord coord35 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord38 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int39 = coord35.distanceFrom(coord38);
        fr.umontpellier.iut.algogen.Coord coord42 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord45 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int46 = coord42.distanceFrom(coord45);
        boolean boolean47 = coord35.estADistanceUn(coord42);
        boolean boolean48 = coord28.estADistanceUn(coord35);
        boolean boolean49 = coord25.estADistanceUn(coord35);
        boolean boolean50 = coord2.estADistanceUn(coord25);
        fr.umontpellier.iut.algogen.Coord coord53 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord56 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int57 = coord53.distanceFrom(coord56);
        fr.umontpellier.iut.algogen.Coord coord60 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord63 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int64 = coord60.distanceFrom(coord63);
        int int65 = coord60.getL();
        int int66 = coord60.getC();
        int int67 = coord60.getL();
        java.lang.String str68 = coord60.toString();
        boolean boolean69 = coord53.estADistanceUn(coord60);
        fr.umontpellier.iut.algogen.Coord coord72 = new fr.umontpellier.iut.algogen.Coord((int) ' ', 0);
        fr.umontpellier.iut.algogen.Coord coord75 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord78 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int79 = coord75.distanceFrom(coord78);
        fr.umontpellier.iut.algogen.Coord coord82 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord85 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int86 = coord82.distanceFrom(coord85);
        boolean boolean87 = coord75.estADistanceUn(coord82);
        boolean boolean88 = coord72.estADistanceUn(coord75);
        boolean boolean89 = coord60.estADistanceUn(coord72);
        int int90 = coord2.distanceFrom(coord72);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(0,-1)" + "'", str8, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(0,-1)" + "'", str9, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "(0,-1)" + "'", str68, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 33 + "'", int90 == 33);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 1, 34);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord((int) ' ', 65);
        int int6 = coord2.distanceFrom(coord5);
        fr.umontpellier.iut.algogen.Coord coord9 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord12 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int13 = coord9.distanceFrom(coord12);
        int int14 = coord9.getL();
        fr.umontpellier.iut.algogen.Coord coord17 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord20 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int21 = coord17.distanceFrom(coord20);
        fr.umontpellier.iut.algogen.Coord coord24 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord27 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int28 = coord24.distanceFrom(coord27);
        boolean boolean29 = coord17.estADistanceUn(coord24);
        int int30 = coord24.getC();
        fr.umontpellier.iut.algogen.Coord coord33 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        int int34 = coord24.distanceFrom(coord33);
        boolean boolean36 = coord33.equals((java.lang.Object) 0);
        boolean boolean37 = coord9.estADistanceUn(coord33);
        int int38 = coord33.getL();
        boolean boolean41 = coord33.estDansPlateau((int) (byte) 100, (int) (byte) 0);
        java.lang.String str42 = coord33.toString();
        java.lang.String str43 = coord33.toString();
        boolean boolean46 = coord33.estDansPlateau(38, 54);
        int int47 = coord2.distanceFrom(coord33);
        fr.umontpellier.iut.algogen.Coord coord50 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord53 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int54 = coord50.distanceFrom(coord53);
        int int55 = coord50.getL();
        int int56 = coord50.getC();
        int int57 = coord50.getL();
        java.lang.String str58 = coord50.toString();
        fr.umontpellier.iut.algogen.Coord coord61 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (byte) 0);
        boolean boolean62 = coord50.equals((java.lang.Object) coord61);
        fr.umontpellier.iut.algogen.Coord coord65 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 32);
        int int66 = coord65.getC();
        int int67 = coord50.distanceFrom(coord65);
        boolean boolean68 = coord2.estADistanceUn(coord50);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 62 + "'", int6 == 62);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 101 + "'", int34 == 101);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "(100,0)" + "'", str42, "(100,0)");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "(100,0)" + "'", str43, "(100,0)");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 133 + "'", int47 == 133);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "(0,-1)" + "'", str58, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 32 + "'", int66 == 32);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 133 + "'", int67 == 133);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int6 = coord2.distanceFrom(coord5);
        int int7 = coord2.getL();
        fr.umontpellier.iut.algogen.Coord coord10 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord13 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int14 = coord10.distanceFrom(coord13);
        int int15 = coord10.getL();
        fr.umontpellier.iut.algogen.Coord coord18 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord21 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int22 = coord18.distanceFrom(coord21);
        fr.umontpellier.iut.algogen.Coord coord25 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord28 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int29 = coord25.distanceFrom(coord28);
        fr.umontpellier.iut.algogen.Coord coord32 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord35 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int36 = coord32.distanceFrom(coord35);
        boolean boolean37 = coord25.estADistanceUn(coord32);
        boolean boolean38 = coord18.estADistanceUn(coord25);
        boolean boolean41 = coord25.estDansPlateau(0, (int) (short) 1);
        int int42 = coord10.distanceFrom(coord25);
        boolean boolean43 = coord2.equals((java.lang.Object) coord10);
        java.lang.String str44 = coord10.toString();
        java.lang.String str45 = coord10.toString();
        java.lang.String str46 = coord10.toString();
        int int47 = coord10.getC();
        int int48 = coord10.getL();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "(0,-1)" + "'", str44, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "(0,-1)" + "'", str45, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "(0,-1)" + "'", str46, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (byte) -1);
        boolean boolean5 = coord2.estDansPlateau((int) ' ', (int) 'a');
        fr.umontpellier.iut.algogen.Coord coord8 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord11 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int12 = coord8.distanceFrom(coord11);
        fr.umontpellier.iut.algogen.Coord coord15 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord18 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int19 = coord15.distanceFrom(coord18);
        boolean boolean20 = coord8.estADistanceUn(coord15);
        int int21 = coord15.getC();
        fr.umontpellier.iut.algogen.Coord coord24 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        int int25 = coord15.distanceFrom(coord24);
        boolean boolean26 = coord2.estADistanceUn(coord15);
        int int27 = coord2.getC();
        java.lang.String str28 = coord2.toString();
        int int29 = coord2.getL();
        java.lang.String str30 = coord2.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 101 + "'", int25 == 101);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "(-1,-1)" + "'", str28, "(-1,-1)");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "(-1,-1)" + "'", str30, "(-1,-1)");
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(97, 101);
        int int3 = coord2.getC();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(188, 19);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(100, (int) (byte) -1);
        int int6 = coord5.getL();
        fr.umontpellier.iut.algogen.Coord coord9 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord12 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int13 = coord9.distanceFrom(coord12);
        fr.umontpellier.iut.algogen.Coord coord16 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord19 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int20 = coord16.distanceFrom(coord19);
        fr.umontpellier.iut.algogen.Coord coord23 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord26 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int27 = coord23.distanceFrom(coord26);
        boolean boolean28 = coord16.estADistanceUn(coord23);
        boolean boolean29 = coord9.estADistanceUn(coord16);
        fr.umontpellier.iut.algogen.Coord coord32 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str33 = coord32.toString();
        java.lang.String str34 = coord32.toString();
        fr.umontpellier.iut.algogen.Coord coord37 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord40 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int41 = coord37.distanceFrom(coord40);
        int int42 = coord37.getC();
        boolean boolean43 = coord32.estADistanceUn(coord37);
        java.lang.String str44 = coord32.toString();
        int int45 = coord32.getL();
        boolean boolean46 = coord16.equals((java.lang.Object) int45);
        boolean boolean49 = coord16.estDansPlateau(0, (-1));
        boolean boolean52 = coord16.estDansPlateau(33, (int) (short) -1);
        java.lang.String str53 = coord16.toString();
        java.lang.String str54 = coord16.toString();
        int int55 = coord5.distanceFrom(coord16);
        boolean boolean56 = coord2.estADistanceUn(coord16);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "(0,-1)" + "'", str33, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "(0,-1)" + "'", str34, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "(0,-1)" + "'", str44, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "(0,-1)" + "'", str53, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "(0,-1)" + "'", str54, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 100 + "'", int55 == 100);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) '#', 38);
        int int3 = coord2.getC();
        fr.umontpellier.iut.algogen.Coord coord6 = new fr.umontpellier.iut.algogen.Coord(10, (int) (short) 10);
        fr.umontpellier.iut.algogen.Coord coord9 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord12 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int13 = coord9.distanceFrom(coord12);
        boolean boolean15 = coord9.equals((java.lang.Object) (byte) 1);
        java.lang.String str16 = coord9.toString();
        fr.umontpellier.iut.algogen.Coord coord19 = new fr.umontpellier.iut.algogen.Coord((int) (short) 100, (int) (short) 10);
        boolean boolean20 = coord9.estADistanceUn(coord19);
        boolean boolean21 = coord6.equals((java.lang.Object) boolean20);
        fr.umontpellier.iut.algogen.Coord coord24 = new fr.umontpellier.iut.algogen.Coord((int) (short) 10, (int) (short) 1);
        boolean boolean27 = coord24.estDansPlateau((int) (short) 10, 12);
        fr.umontpellier.iut.algogen.Coord coord30 = new fr.umontpellier.iut.algogen.Coord(100, (int) (short) 0);
        boolean boolean33 = coord30.estDansPlateau((int) '#', (int) 'a');
        boolean boolean34 = coord24.equals((java.lang.Object) coord30);
        fr.umontpellier.iut.algogen.Coord coord37 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord40 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int41 = coord37.distanceFrom(coord40);
        int int42 = coord37.getC();
        java.lang.String str43 = coord37.toString();
        int int44 = coord37.getL();
        boolean boolean45 = coord30.estADistanceUn(coord37);
        int int46 = coord6.distanceFrom(coord30);
        int int47 = coord2.distanceFrom(coord30);
        int int48 = coord2.getC();
        boolean boolean51 = coord2.estDansPlateau(256, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 38 + "'", int3 == 38);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(0,-1)" + "'", str16, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "(0,-1)" + "'", str43, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 100 + "'", int46 == 100);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 103 + "'", int47 == 103);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 38 + "'", int48 == 38);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) ' ', 0);
        boolean boolean4 = coord2.equals((java.lang.Object) (-1L));
        fr.umontpellier.iut.algogen.Coord coord7 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str8 = coord7.toString();
        java.lang.String str9 = coord7.toString();
        fr.umontpellier.iut.algogen.Coord coord12 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord15 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int16 = coord12.distanceFrom(coord15);
        int int17 = coord12.getC();
        boolean boolean18 = coord7.estADistanceUn(coord12);
        java.lang.String str19 = coord12.toString();
        int int20 = coord12.getC();
        boolean boolean23 = coord12.estDansPlateau(1, 0);
        boolean boolean26 = coord12.estDansPlateau((int) (byte) 1, 0);
        boolean boolean27 = coord2.equals((java.lang.Object) coord12);
        java.lang.String str28 = coord12.toString();
        int int29 = coord12.getC();
        fr.umontpellier.iut.algogen.Coord coord32 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord35 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int36 = coord32.distanceFrom(coord35);
        int int37 = coord32.getC();
        fr.umontpellier.iut.algogen.Coord coord40 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str41 = coord40.toString();
        java.lang.String str42 = coord40.toString();
        boolean boolean43 = coord32.estADistanceUn(coord40);
        fr.umontpellier.iut.algogen.Coord coord46 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str47 = coord46.toString();
        java.lang.String str48 = coord46.toString();
        fr.umontpellier.iut.algogen.Coord coord51 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord54 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int55 = coord51.distanceFrom(coord54);
        int int56 = coord51.getC();
        boolean boolean57 = coord46.estADistanceUn(coord51);
        java.lang.String str58 = coord51.toString();
        int int59 = coord32.distanceFrom(coord51);
        int int60 = coord12.distanceFrom(coord32);
        fr.umontpellier.iut.algogen.Coord coord63 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) 0);
        boolean boolean66 = coord63.estDansPlateau((int) (byte) -1, (int) (short) 10);
        int int67 = coord63.getL();
        fr.umontpellier.iut.algogen.Coord coord70 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord73 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int74 = coord70.distanceFrom(coord73);
        fr.umontpellier.iut.algogen.Coord coord77 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord80 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int81 = coord77.distanceFrom(coord80);
        fr.umontpellier.iut.algogen.Coord coord84 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord87 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int88 = coord84.distanceFrom(coord87);
        boolean boolean89 = coord77.estADistanceUn(coord84);
        boolean boolean90 = coord70.estADistanceUn(coord77);
        int int91 = coord70.getC();
        int int92 = coord70.getL();
        java.lang.String str93 = coord70.toString();
        boolean boolean94 = coord63.equals((java.lang.Object) str93);
        boolean boolean95 = coord32.estADistanceUn(coord63);
        boolean boolean98 = coord63.estDansPlateau(0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(0,-1)" + "'", str8, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(0,-1)" + "'", str9, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(0,-1)" + "'", str19, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "(0,-1)" + "'", str28, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "(0,-1)" + "'", str41, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "(0,-1)" + "'", str42, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "(0,-1)" + "'", str47, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "(0,-1)" + "'", str48, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "(0,-1)" + "'", str58, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "(0,-1)" + "'", str93, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(21, 10);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord8 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int9 = coord5.distanceFrom(coord8);
        int int10 = coord5.getL();
        fr.umontpellier.iut.algogen.Coord coord13 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord16 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int17 = coord13.distanceFrom(coord16);
        int int18 = coord13.getL();
        fr.umontpellier.iut.algogen.Coord coord21 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord24 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int25 = coord21.distanceFrom(coord24);
        fr.umontpellier.iut.algogen.Coord coord28 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord31 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int32 = coord28.distanceFrom(coord31);
        fr.umontpellier.iut.algogen.Coord coord35 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord38 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int39 = coord35.distanceFrom(coord38);
        boolean boolean40 = coord28.estADistanceUn(coord35);
        boolean boolean41 = coord21.estADistanceUn(coord28);
        boolean boolean44 = coord28.estDansPlateau(0, (int) (short) 1);
        int int45 = coord13.distanceFrom(coord28);
        boolean boolean46 = coord5.equals((java.lang.Object) coord13);
        int int47 = coord2.distanceFrom(coord5);
        fr.umontpellier.iut.algogen.Coord coord50 = new fr.umontpellier.iut.algogen.Coord((-1), 10);
        fr.umontpellier.iut.algogen.Coord coord53 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord56 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int57 = coord53.distanceFrom(coord56);
        int int58 = coord53.getC();
        boolean boolean61 = coord53.estDansPlateau((int) (short) 0, (int) (byte) 10);
        fr.umontpellier.iut.algogen.Coord coord64 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord67 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int68 = coord64.distanceFrom(coord67);
        fr.umontpellier.iut.algogen.Coord coord71 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord74 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int75 = coord71.distanceFrom(coord74);
        fr.umontpellier.iut.algogen.Coord coord78 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord81 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int82 = coord78.distanceFrom(coord81);
        boolean boolean83 = coord71.estADistanceUn(coord78);
        boolean boolean84 = coord64.estADistanceUn(coord71);
        boolean boolean85 = coord53.estADistanceUn(coord64);
        int int86 = coord50.distanceFrom(coord64);
        int int87 = coord5.distanceFrom(coord50);
        fr.umontpellier.iut.algogen.Coord coord90 = new fr.umontpellier.iut.algogen.Coord(122, 101);
        int int91 = coord50.distanceFrom(coord90);
        int int92 = coord90.getL();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 32 + "'", int47 == 32);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 12 + "'", int86 == 12);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 12 + "'", int87 == 12);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 214 + "'", int91 == 214);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 122 + "'", int92 == 122);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) '4', 2);
        int int3 = coord2.getC();
        fr.umontpellier.iut.algogen.Coord coord6 = new fr.umontpellier.iut.algogen.Coord(101, 101);
        int int7 = coord6.getL();
        int int8 = coord6.getC();
        fr.umontpellier.iut.algogen.Coord coord11 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean14 = coord11.estDansPlateau((int) (byte) -1, (int) ' ');
        int int15 = coord11.getC();
        int int16 = coord11.getC();
        fr.umontpellier.iut.algogen.Coord coord19 = new fr.umontpellier.iut.algogen.Coord(32, 32);
        int int20 = coord11.distanceFrom(coord19);
        boolean boolean21 = coord6.equals((java.lang.Object) coord11);
        boolean boolean22 = coord2.estADistanceUn(coord11);
        fr.umontpellier.iut.algogen.Coord coord25 = new fr.umontpellier.iut.algogen.Coord(102, (int) (short) 0);
        boolean boolean26 = coord11.equals((java.lang.Object) coord25);
        java.lang.String str27 = coord25.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 101 + "'", int7 == 101);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 65 + "'", int20 == 65);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(102,0)" + "'", str27, "(102,0)");
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int6 = coord2.distanceFrom(coord5);
        int int7 = coord2.getL();
        fr.umontpellier.iut.algogen.Coord coord10 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord13 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int14 = coord10.distanceFrom(coord13);
        int int15 = coord10.getL();
        fr.umontpellier.iut.algogen.Coord coord18 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord21 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int22 = coord18.distanceFrom(coord21);
        fr.umontpellier.iut.algogen.Coord coord25 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord28 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int29 = coord25.distanceFrom(coord28);
        fr.umontpellier.iut.algogen.Coord coord32 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord35 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int36 = coord32.distanceFrom(coord35);
        boolean boolean37 = coord25.estADistanceUn(coord32);
        boolean boolean38 = coord18.estADistanceUn(coord25);
        boolean boolean41 = coord25.estDansPlateau(0, (int) (short) 1);
        int int42 = coord10.distanceFrom(coord25);
        boolean boolean43 = coord2.equals((java.lang.Object) coord10);
        int int44 = coord10.getL();
        boolean boolean47 = coord10.estDansPlateau((int) '4', 49);
        java.lang.String str48 = coord10.toString();
        int int49 = coord10.getC();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "(0,-1)" + "'", str48, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) '4', 210);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) '4', (int) (short) -1);
        int int3 = coord2.getC();
        fr.umontpellier.iut.algogen.Coord coord6 = new fr.umontpellier.iut.algogen.Coord((int) ' ', (int) (short) 1);
        int int7 = coord6.getL();
        boolean boolean8 = coord2.estADistanceUn(coord6);
        fr.umontpellier.iut.algogen.Coord coord11 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord14 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int15 = coord11.distanceFrom(coord14);
        int int16 = coord11.getL();
        fr.umontpellier.iut.algogen.Coord coord19 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord22 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int23 = coord19.distanceFrom(coord22);
        fr.umontpellier.iut.algogen.Coord coord26 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord29 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int30 = coord26.distanceFrom(coord29);
        boolean boolean31 = coord19.estADistanceUn(coord26);
        int int32 = coord26.getC();
        fr.umontpellier.iut.algogen.Coord coord35 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        int int36 = coord26.distanceFrom(coord35);
        boolean boolean38 = coord35.equals((java.lang.Object) 0);
        boolean boolean39 = coord11.estADistanceUn(coord35);
        int int40 = coord2.distanceFrom(coord35);
        int int41 = coord35.getC();
        boolean boolean44 = coord35.estDansPlateau((int) (byte) -1, 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 101 + "'", int36 == 101);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 49 + "'", int40 == 49);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean5 = coord2.estDansPlateau((int) (byte) -1, (int) ' ');
        boolean boolean8 = coord2.estDansPlateau((int) ' ', (int) (byte) 1);
        int int9 = coord2.getL();
        boolean boolean11 = coord2.equals((java.lang.Object) 33);
        fr.umontpellier.iut.algogen.Coord coord14 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        fr.umontpellier.iut.algogen.Coord coord17 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord20 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int21 = coord17.distanceFrom(coord20);
        boolean boolean23 = coord17.equals((java.lang.Object) (byte) 1);
        fr.umontpellier.iut.algogen.Coord coord26 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        boolean boolean27 = coord17.equals((java.lang.Object) (byte) 100);
        boolean boolean28 = coord14.equals((java.lang.Object) (byte) 100);
        int int29 = coord2.distanceFrom(coord14);
        fr.umontpellier.iut.algogen.Coord coord32 = new fr.umontpellier.iut.algogen.Coord(33, (int) (byte) 0);
        boolean boolean33 = coord14.equals((java.lang.Object) coord32);
        java.lang.Class<?> wildcardClass34 = coord32.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 101 + "'", int29 == 101);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean5 = coord2.estDansPlateau((int) (byte) -1, (int) ' ');
        boolean boolean8 = coord2.estDansPlateau((int) ' ', (int) (byte) 1);
        int int9 = coord2.getL();
        int int10 = coord2.getL();
        boolean boolean13 = coord2.estDansPlateau((int) '#', (int) (byte) 100);
        fr.umontpellier.iut.algogen.Coord coord16 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord19 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int20 = coord16.distanceFrom(coord19);
        boolean boolean22 = coord16.equals((java.lang.Object) (byte) 1);
        int int23 = coord16.getL();
        int int24 = coord2.distanceFrom(coord16);
        boolean boolean27 = coord16.estDansPlateau(133, 101);
        java.lang.String str28 = coord16.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "(0,-1)" + "'", str28, "(0,-1)");
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str3 = coord2.toString();
        java.lang.String str4 = coord2.toString();
        fr.umontpellier.iut.algogen.Coord coord7 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord10 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int11 = coord7.distanceFrom(coord10);
        int int12 = coord7.getC();
        boolean boolean13 = coord2.estADistanceUn(coord7);
        java.lang.String str14 = coord2.toString();
        int int15 = coord2.getL();
        boolean boolean18 = coord2.estDansPlateau((int) (short) -1, (int) (short) 0);
        fr.umontpellier.iut.algogen.Coord coord21 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean24 = coord21.estDansPlateau((int) (byte) -1, (int) ' ');
        boolean boolean25 = coord2.estADistanceUn(coord21);
        java.lang.String str26 = coord2.toString();
        java.lang.String str27 = coord2.toString();
        java.lang.Class<?> wildcardClass28 = coord2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0,-1)" + "'", str3, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(0,-1)" + "'", str4, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(0,-1)" + "'", str14, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(0,-1)" + "'", str26, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(0,-1)" + "'", str27, "(0,-1)");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) ' ', 0);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord8 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int9 = coord5.distanceFrom(coord8);
        fr.umontpellier.iut.algogen.Coord coord12 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord15 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int16 = coord12.distanceFrom(coord15);
        boolean boolean17 = coord5.estADistanceUn(coord12);
        boolean boolean18 = coord2.estADistanceUn(coord5);
        fr.umontpellier.iut.algogen.Coord coord21 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord24 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int25 = coord21.distanceFrom(coord24);
        int int26 = coord21.getL();
        fr.umontpellier.iut.algogen.Coord coord29 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord32 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int33 = coord29.distanceFrom(coord32);
        fr.umontpellier.iut.algogen.Coord coord36 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord39 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int40 = coord36.distanceFrom(coord39);
        boolean boolean41 = coord29.estADistanceUn(coord36);
        int int42 = coord36.getC();
        fr.umontpellier.iut.algogen.Coord coord45 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        int int46 = coord36.distanceFrom(coord45);
        boolean boolean48 = coord45.equals((java.lang.Object) 0);
        boolean boolean49 = coord21.estADistanceUn(coord45);
        fr.umontpellier.iut.algogen.Coord coord52 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str53 = coord52.toString();
        java.lang.String str54 = coord52.toString();
        fr.umontpellier.iut.algogen.Coord coord57 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord60 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int61 = coord57.distanceFrom(coord60);
        int int62 = coord57.getC();
        boolean boolean63 = coord52.estADistanceUn(coord57);
        java.lang.String str64 = coord57.toString();
        boolean boolean65 = coord21.equals((java.lang.Object) coord57);
        boolean boolean68 = coord57.estDansPlateau((-1), 32);
        int int69 = coord5.distanceFrom(coord57);
        boolean boolean72 = coord5.estDansPlateau(2, (int) (short) 1);
        int int73 = coord5.getL();
        java.lang.String str74 = coord5.toString();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 101 + "'", int46 == 101);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "(0,-1)" + "'", str53, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "(0,-1)" + "'", str54, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "(0,-1)" + "'", str64, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "(0,-1)" + "'", str74, "(0,-1)");
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str3 = coord2.toString();
        java.lang.String str4 = coord2.toString();
        fr.umontpellier.iut.algogen.Coord coord7 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord10 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int11 = coord7.distanceFrom(coord10);
        int int12 = coord7.getC();
        boolean boolean13 = coord2.estADistanceUn(coord7);
        java.lang.String str14 = coord7.toString();
        fr.umontpellier.iut.algogen.Coord coord17 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str18 = coord17.toString();
        java.lang.String str19 = coord17.toString();
        fr.umontpellier.iut.algogen.Coord coord22 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord25 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int26 = coord22.distanceFrom(coord25);
        int int27 = coord22.getC();
        boolean boolean28 = coord17.estADistanceUn(coord22);
        java.lang.String str29 = coord17.toString();
        int int30 = coord17.getL();
        boolean boolean33 = coord17.estDansPlateau((int) (short) -1, (int) (short) 0);
        fr.umontpellier.iut.algogen.Coord coord36 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean39 = coord36.estDansPlateau((int) (byte) -1, (int) ' ');
        boolean boolean40 = coord17.estADistanceUn(coord36);
        int int41 = coord36.getL();
        boolean boolean42 = coord7.estADistanceUn(coord36);
        int int43 = coord7.getL();
        boolean boolean46 = coord7.estDansPlateau(22, (int) (short) 1);
        fr.umontpellier.iut.algogen.Coord coord49 = new fr.umontpellier.iut.algogen.Coord((int) '4', (int) (short) -1);
        int int50 = coord49.getC();
        fr.umontpellier.iut.algogen.Coord coord53 = new fr.umontpellier.iut.algogen.Coord((int) ' ', (int) (short) 1);
        int int54 = coord53.getL();
        boolean boolean55 = coord49.estADistanceUn(coord53);
        fr.umontpellier.iut.algogen.Coord coord58 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord61 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int62 = coord58.distanceFrom(coord61);
        int int63 = coord58.getL();
        fr.umontpellier.iut.algogen.Coord coord66 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord69 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int70 = coord66.distanceFrom(coord69);
        fr.umontpellier.iut.algogen.Coord coord73 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord76 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int77 = coord73.distanceFrom(coord76);
        boolean boolean78 = coord66.estADistanceUn(coord73);
        int int79 = coord73.getC();
        fr.umontpellier.iut.algogen.Coord coord82 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        int int83 = coord73.distanceFrom(coord82);
        boolean boolean85 = coord82.equals((java.lang.Object) 0);
        boolean boolean86 = coord58.estADistanceUn(coord82);
        int int87 = coord49.distanceFrom(coord82);
        int int88 = coord82.getC();
        int int89 = coord82.getC();
        int int90 = coord7.distanceFrom(coord82);
        java.lang.String str91 = coord82.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0,-1)" + "'", str3, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(0,-1)" + "'", str4, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(0,-1)" + "'", str14, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(0,-1)" + "'", str18, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(0,-1)" + "'", str19, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "(0,-1)" + "'", str29, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 32 + "'", int54 == 32);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 101 + "'", int83 == 101);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 49 + "'", int87 == 49);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 101 + "'", int90 == 101);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "(100,0)" + "'", str91, "(100,0)");
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str3 = coord2.toString();
        java.lang.String str4 = coord2.toString();
        fr.umontpellier.iut.algogen.Coord coord7 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord10 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int11 = coord7.distanceFrom(coord10);
        int int12 = coord7.getC();
        boolean boolean13 = coord2.estADistanceUn(coord7);
        java.lang.String str14 = coord2.toString();
        int int15 = coord2.getL();
        boolean boolean18 = coord2.estDansPlateau((int) (short) -1, (int) (short) 0);
        fr.umontpellier.iut.algogen.Coord coord21 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean24 = coord21.estDansPlateau((int) (byte) -1, (int) ' ');
        boolean boolean25 = coord2.estADistanceUn(coord21);
        fr.umontpellier.iut.algogen.Coord coord28 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord31 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int32 = coord28.distanceFrom(coord31);
        fr.umontpellier.iut.algogen.Coord coord35 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord38 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int39 = coord35.distanceFrom(coord38);
        boolean boolean40 = coord28.estADistanceUn(coord35);
        fr.umontpellier.iut.algogen.Coord coord43 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord46 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int47 = coord43.distanceFrom(coord46);
        boolean boolean49 = coord43.equals((java.lang.Object) (byte) 1);
        boolean boolean52 = coord43.estDansPlateau(100, (int) (byte) 1);
        int int53 = coord28.distanceFrom(coord43);
        int int54 = coord43.getL();
        fr.umontpellier.iut.algogen.Coord coord57 = new fr.umontpellier.iut.algogen.Coord((int) ' ', 32);
        boolean boolean58 = coord43.estADistanceUn(coord57);
        boolean boolean59 = coord2.estADistanceUn(coord43);
        boolean boolean62 = coord2.estDansPlateau(180, 20);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0,-1)" + "'", str3, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(0,-1)" + "'", str4, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(0,-1)" + "'", str14, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int6 = coord2.distanceFrom(coord5);
        int int7 = coord2.getC();
        java.lang.String str8 = coord2.toString();
        int int9 = coord2.getL();
        fr.umontpellier.iut.algogen.Coord coord12 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord15 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int16 = coord12.distanceFrom(coord15);
        fr.umontpellier.iut.algogen.Coord coord19 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord22 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int23 = coord19.distanceFrom(coord22);
        boolean boolean24 = coord12.estADistanceUn(coord19);
        fr.umontpellier.iut.algogen.Coord coord27 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord30 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int31 = coord27.distanceFrom(coord30);
        boolean boolean33 = coord27.equals((java.lang.Object) (byte) 1);
        boolean boolean36 = coord27.estDansPlateau(100, (int) (byte) 1);
        int int37 = coord12.distanceFrom(coord27);
        int int38 = coord2.distanceFrom(coord27);
        fr.umontpellier.iut.algogen.Coord coord41 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord44 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int45 = coord41.distanceFrom(coord44);
        int int46 = coord44.getL();
        boolean boolean47 = coord27.equals((java.lang.Object) coord44);
        java.lang.String str48 = coord44.toString();
        fr.umontpellier.iut.algogen.Coord coord51 = new fr.umontpellier.iut.algogen.Coord(65, 52);
        boolean boolean54 = coord51.estDansPlateau(21, (-1));
        fr.umontpellier.iut.algogen.Coord coord57 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord60 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int61 = coord57.distanceFrom(coord60);
        fr.umontpellier.iut.algogen.Coord coord64 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord67 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int68 = coord64.distanceFrom(coord67);
        boolean boolean69 = coord57.estADistanceUn(coord64);
        java.lang.String str70 = coord64.toString();
        int int71 = coord64.getC();
        int int72 = coord64.getL();
        int int73 = coord64.getC();
        int int74 = coord51.distanceFrom(coord64);
        boolean boolean75 = coord44.equals((java.lang.Object) int74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(0,-1)" + "'", str8, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "(0,-1)" + "'", str48, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "(0,-1)" + "'", str70, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 118 + "'", int74 == 118);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(101, (int) (byte) 0);
        java.lang.String str3 = coord2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(101,0)" + "'", str3, "(101,0)");
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int6 = coord2.distanceFrom(coord5);
        fr.umontpellier.iut.algogen.Coord coord9 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord12 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int13 = coord9.distanceFrom(coord12);
        fr.umontpellier.iut.algogen.Coord coord16 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord19 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int20 = coord16.distanceFrom(coord19);
        boolean boolean21 = coord9.estADistanceUn(coord16);
        boolean boolean22 = coord2.estADistanceUn(coord9);
        boolean boolean25 = coord9.estDansPlateau(0, (int) (short) 1);
        fr.umontpellier.iut.algogen.Coord coord28 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (byte) -1);
        boolean boolean29 = coord9.estADistanceUn(coord28);
        int int30 = coord28.getL();
        fr.umontpellier.iut.algogen.Coord coord33 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (byte) -1);
        int int34 = coord33.getL();
        int int35 = coord33.getC();
        boolean boolean38 = coord33.estDansPlateau((int) (short) 1, 1);
        fr.umontpellier.iut.algogen.Coord coord41 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord44 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int45 = coord41.distanceFrom(coord44);
        boolean boolean47 = coord41.equals((java.lang.Object) (byte) 1);
        boolean boolean50 = coord41.estDansPlateau(100, (int) (byte) 1);
        int int51 = coord33.distanceFrom(coord41);
        boolean boolean52 = coord28.equals((java.lang.Object) coord33);
        int int53 = coord33.getC();
        int int54 = coord33.getL();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(57, 135);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int6 = coord2.distanceFrom(coord5);
        fr.umontpellier.iut.algogen.Coord coord9 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord12 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int13 = coord9.distanceFrom(coord12);
        boolean boolean14 = coord2.estADistanceUn(coord9);
        int int15 = coord9.getC();
        fr.umontpellier.iut.algogen.Coord coord18 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        int int19 = coord9.distanceFrom(coord18);
        java.lang.String str20 = coord9.toString();
        fr.umontpellier.iut.algogen.Coord coord23 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord26 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int27 = coord23.distanceFrom(coord26);
        fr.umontpellier.iut.algogen.Coord coord30 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord33 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int34 = coord30.distanceFrom(coord33);
        fr.umontpellier.iut.algogen.Coord coord37 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord40 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int41 = coord37.distanceFrom(coord40);
        boolean boolean42 = coord30.estADistanceUn(coord37);
        boolean boolean43 = coord23.estADistanceUn(coord30);
        fr.umontpellier.iut.algogen.Coord coord46 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str47 = coord46.toString();
        java.lang.String str48 = coord46.toString();
        fr.umontpellier.iut.algogen.Coord coord51 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord54 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int55 = coord51.distanceFrom(coord54);
        int int56 = coord51.getC();
        boolean boolean57 = coord46.estADistanceUn(coord51);
        java.lang.String str58 = coord46.toString();
        int int59 = coord46.getL();
        boolean boolean60 = coord30.equals((java.lang.Object) int59);
        fr.umontpellier.iut.algogen.Coord coord63 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        fr.umontpellier.iut.algogen.Coord coord66 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord69 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int70 = coord66.distanceFrom(coord69);
        int int71 = coord66.getL();
        int int72 = coord66.getC();
        int int73 = coord66.getL();
        boolean boolean74 = coord63.estADistanceUn(coord66);
        boolean boolean75 = coord30.estADistanceUn(coord66);
        int int76 = coord30.getL();
        boolean boolean77 = coord9.estADistanceUn(coord30);
        fr.umontpellier.iut.algogen.Coord coord80 = new fr.umontpellier.iut.algogen.Coord(0, 22);
        java.lang.String str81 = coord80.toString();
        boolean boolean82 = coord9.estADistanceUn(coord80);
        fr.umontpellier.iut.algogen.Coord coord83 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int84 = coord9.distanceFrom(coord83);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 101 + "'", int19 == 101);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(0,-1)" + "'", str20, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "(0,-1)" + "'", str47, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "(0,-1)" + "'", str48, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "(0,-1)" + "'", str58, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "(0,22)" + "'", str81, "(0,22)");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) (short) 10, 31);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str3 = coord2.toString();
        java.lang.String str4 = coord2.toString();
        fr.umontpellier.iut.algogen.Coord coord7 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord10 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int11 = coord7.distanceFrom(coord10);
        int int12 = coord7.getC();
        boolean boolean13 = coord2.estADistanceUn(coord7);
        java.lang.String str14 = coord2.toString();
        int int15 = coord2.getL();
        boolean boolean18 = coord2.estDansPlateau((int) (short) -1, (int) (short) 0);
        fr.umontpellier.iut.algogen.Coord coord21 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean24 = coord21.estDansPlateau((int) (byte) -1, (int) ' ');
        boolean boolean25 = coord2.estADistanceUn(coord21);
        fr.umontpellier.iut.algogen.Coord coord28 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord31 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int32 = coord28.distanceFrom(coord31);
        fr.umontpellier.iut.algogen.Coord coord35 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord38 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int39 = coord35.distanceFrom(coord38);
        boolean boolean40 = coord28.estADistanceUn(coord35);
        fr.umontpellier.iut.algogen.Coord coord43 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord46 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int47 = coord43.distanceFrom(coord46);
        boolean boolean49 = coord43.equals((java.lang.Object) (byte) 1);
        boolean boolean52 = coord43.estDansPlateau(100, (int) (byte) 1);
        int int53 = coord28.distanceFrom(coord43);
        int int54 = coord43.getL();
        fr.umontpellier.iut.algogen.Coord coord57 = new fr.umontpellier.iut.algogen.Coord((int) ' ', 32);
        boolean boolean58 = coord43.estADistanceUn(coord57);
        boolean boolean59 = coord2.estADistanceUn(coord43);
        fr.umontpellier.iut.algogen.Coord coord62 = new fr.umontpellier.iut.algogen.Coord((int) ' ', 0);
        boolean boolean64 = coord62.equals((java.lang.Object) (-1L));
        fr.umontpellier.iut.algogen.Coord coord67 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord70 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int71 = coord67.distanceFrom(coord70);
        int int72 = coord67.getC();
        java.lang.String str73 = coord67.toString();
        int int74 = coord67.getL();
        int int75 = coord62.distanceFrom(coord67);
        int int76 = coord62.getL();
        int int77 = coord43.distanceFrom(coord62);
        java.lang.String str78 = coord62.toString();
        java.lang.String str79 = coord62.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0,-1)" + "'", str3, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(0,-1)" + "'", str4, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(0,-1)" + "'", str14, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "(0,-1)" + "'", str73, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 33 + "'", int75 == 33);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 32 + "'", int76 == 32);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 33 + "'", int77 == 33);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "(32,0)" + "'", str78, "(32,0)");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "(32,0)" + "'", str79, "(32,0)");
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(1, 101);
        int int3 = coord2.getL();
        int int4 = coord2.getC();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (byte) -1);
        int int3 = coord2.getL();
        int int4 = coord2.getC();
        int int5 = coord2.getL();
        boolean boolean8 = coord2.estDansPlateau(38, 52);
        boolean boolean11 = coord2.estDansPlateau(62, 74);
        fr.umontpellier.iut.algogen.Coord coord12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = coord2.estADistanceUn(coord12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int6 = coord2.distanceFrom(coord5);
        int int7 = coord2.getL();
        fr.umontpellier.iut.algogen.Coord coord10 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord13 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int14 = coord10.distanceFrom(coord13);
        fr.umontpellier.iut.algogen.Coord coord17 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord20 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int21 = coord17.distanceFrom(coord20);
        fr.umontpellier.iut.algogen.Coord coord24 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord27 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int28 = coord24.distanceFrom(coord27);
        boolean boolean29 = coord17.estADistanceUn(coord24);
        boolean boolean30 = coord10.estADistanceUn(coord17);
        boolean boolean33 = coord17.estDansPlateau(0, (int) (short) 1);
        int int34 = coord2.distanceFrom(coord17);
        fr.umontpellier.iut.algogen.Coord coord37 = new fr.umontpellier.iut.algogen.Coord(21, 52);
        int int38 = coord17.distanceFrom(coord37);
        java.lang.String str39 = coord37.toString();
        fr.umontpellier.iut.algogen.Coord coord42 = new fr.umontpellier.iut.algogen.Coord(52, 1);
        boolean boolean43 = coord37.equals((java.lang.Object) coord42);
        fr.umontpellier.iut.algogen.Coord coord46 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord49 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int50 = coord46.distanceFrom(coord49);
        fr.umontpellier.iut.algogen.Coord coord53 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord56 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int57 = coord53.distanceFrom(coord56);
        boolean boolean58 = coord46.estADistanceUn(coord53);
        java.lang.String str59 = coord53.toString();
        int int60 = coord53.getC();
        int int61 = coord53.getL();
        int int62 = coord42.distanceFrom(coord53);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 74 + "'", int38 == 74);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "(21,52)" + "'", str39, "(21,52)");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "(0,-1)" + "'", str59, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 54 + "'", int62 == 54);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int6 = coord2.distanceFrom(coord5);
        fr.umontpellier.iut.algogen.Coord coord9 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord12 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int13 = coord9.distanceFrom(coord12);
        fr.umontpellier.iut.algogen.Coord coord16 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord19 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int20 = coord16.distanceFrom(coord19);
        boolean boolean21 = coord9.estADistanceUn(coord16);
        boolean boolean22 = coord2.estADistanceUn(coord9);
        boolean boolean25 = coord9.estDansPlateau(0, (int) (short) 1);
        fr.umontpellier.iut.algogen.Coord coord28 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (byte) -1);
        boolean boolean29 = coord9.estADistanceUn(coord28);
        boolean boolean32 = coord9.estDansPlateau((int) (byte) 10, (int) (short) -1);
        int int33 = coord9.getL();
        int int34 = coord9.getC();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int6 = coord2.distanceFrom(coord5);
        fr.umontpellier.iut.algogen.Coord coord9 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord12 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int13 = coord9.distanceFrom(coord12);
        boolean boolean14 = coord2.estADistanceUn(coord9);
        fr.umontpellier.iut.algogen.Coord coord17 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord20 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int21 = coord17.distanceFrom(coord20);
        boolean boolean23 = coord17.equals((java.lang.Object) (byte) 1);
        boolean boolean26 = coord17.estDansPlateau(100, (int) (byte) 1);
        int int27 = coord2.distanceFrom(coord17);
        fr.umontpellier.iut.algogen.Coord coord30 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord33 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int34 = coord30.distanceFrom(coord33);
        int int35 = coord17.distanceFrom(coord33);
        fr.umontpellier.iut.algogen.Coord coord38 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 1, (-1));
        int int39 = coord33.distanceFrom(coord38);
        java.lang.String str40 = coord38.toString();
        java.lang.String str41 = coord38.toString();
        fr.umontpellier.iut.algogen.Coord coord44 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        boolean boolean47 = coord44.estDansPlateau((int) (byte) 0, 101);
        int int48 = coord44.getC();
        boolean boolean49 = coord38.estADistanceUn(coord44);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "(1,-1)" + "'", str40, "(1,-1)");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "(1,-1)" + "'", str41, "(1,-1)");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) 0);
        boolean boolean5 = coord2.estDansPlateau((int) (byte) -1, (int) (short) 10);
        int int6 = coord2.getL();
        fr.umontpellier.iut.algogen.Coord coord9 = new fr.umontpellier.iut.algogen.Coord(0, 69);
        int int10 = coord9.getL();
        int int11 = coord2.distanceFrom(coord9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 69 + "'", int11 == 69);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(123, 103);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(1, (-1));
        java.lang.String str6 = coord5.toString();
        fr.umontpellier.iut.algogen.Coord coord9 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (byte) -1);
        boolean boolean12 = coord9.estDansPlateau((int) ' ', (int) 'a');
        fr.umontpellier.iut.algogen.Coord coord15 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord18 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int19 = coord15.distanceFrom(coord18);
        fr.umontpellier.iut.algogen.Coord coord22 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord25 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int26 = coord22.distanceFrom(coord25);
        boolean boolean27 = coord15.estADistanceUn(coord22);
        int int28 = coord22.getC();
        fr.umontpellier.iut.algogen.Coord coord31 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        int int32 = coord22.distanceFrom(coord31);
        boolean boolean33 = coord9.estADistanceUn(coord22);
        fr.umontpellier.iut.algogen.Coord coord36 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (byte) -1);
        int int37 = coord36.getL();
        int int38 = coord36.getC();
        boolean boolean39 = coord9.estADistanceUn(coord36);
        fr.umontpellier.iut.algogen.Coord coord42 = new fr.umontpellier.iut.algogen.Coord((int) '4', (int) (short) -1);
        boolean boolean43 = coord36.estADistanceUn(coord42);
        boolean boolean46 = coord36.estDansPlateau(12, (int) (short) 100);
        boolean boolean49 = coord36.estDansPlateau(65, 33);
        fr.umontpellier.iut.algogen.Coord coord52 = new fr.umontpellier.iut.algogen.Coord((int) ' ', 0);
        boolean boolean54 = coord52.equals((java.lang.Object) (-1L));
        fr.umontpellier.iut.algogen.Coord coord57 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord60 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int61 = coord57.distanceFrom(coord60);
        int int62 = coord57.getC();
        java.lang.String str63 = coord57.toString();
        int int64 = coord57.getL();
        int int65 = coord52.distanceFrom(coord57);
        fr.umontpellier.iut.algogen.Coord coord68 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord71 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int72 = coord68.distanceFrom(coord71);
        fr.umontpellier.iut.algogen.Coord coord75 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord78 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int79 = coord75.distanceFrom(coord78);
        fr.umontpellier.iut.algogen.Coord coord82 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord85 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int86 = coord82.distanceFrom(coord85);
        boolean boolean87 = coord75.estADistanceUn(coord82);
        boolean boolean88 = coord68.estADistanceUn(coord75);
        java.lang.String str89 = coord68.toString();
        boolean boolean90 = coord57.equals((java.lang.Object) str89);
        boolean boolean91 = coord36.estADistanceUn(coord57);
        boolean boolean94 = coord57.estDansPlateau(33, 111);
        boolean boolean95 = coord5.estADistanceUn(coord57);
        boolean boolean96 = coord2.equals((java.lang.Object) coord57);
        boolean boolean99 = coord57.estDansPlateau(36, 201);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(1,-1)" + "'", str6, "(1,-1)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 101 + "'", int32 == 101);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "(0,-1)" + "'", str63, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 33 + "'", int65 == 33);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "(0,-1)" + "'", str89, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) ' ', 0);
        boolean boolean4 = coord2.equals((java.lang.Object) (-1L));
        boolean boolean7 = coord2.estDansPlateau((int) (byte) 10, 100);
        int int8 = coord2.getL();
        fr.umontpellier.iut.algogen.Coord coord11 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord14 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int15 = coord11.distanceFrom(coord14);
        fr.umontpellier.iut.algogen.Coord coord18 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord21 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int22 = coord18.distanceFrom(coord21);
        boolean boolean23 = coord11.estADistanceUn(coord18);
        boolean boolean24 = coord2.equals((java.lang.Object) coord11);
        fr.umontpellier.iut.algogen.Coord coord27 = new fr.umontpellier.iut.algogen.Coord((int) '#', (int) ' ');
        boolean boolean28 = coord11.estADistanceUn(coord27);
        int int29 = coord27.getL();
        boolean boolean32 = coord27.estDansPlateau((int) (byte) -1, (int) 'a');
        int int33 = coord27.getL();
        fr.umontpellier.iut.algogen.Coord coord36 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean39 = coord36.estDansPlateau((int) (byte) -1, (int) ' ');
        fr.umontpellier.iut.algogen.Coord coord42 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord45 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int46 = coord42.distanceFrom(coord45);
        boolean boolean48 = coord42.equals((java.lang.Object) (byte) 1);
        java.lang.String str49 = coord42.toString();
        boolean boolean50 = coord36.equals((java.lang.Object) coord42);
        fr.umontpellier.iut.algogen.Coord coord53 = new fr.umontpellier.iut.algogen.Coord(33, (int) (byte) 0);
        boolean boolean54 = coord36.estADistanceUn(coord53);
        int int55 = coord53.getC();
        int int56 = coord53.getC();
        fr.umontpellier.iut.algogen.Coord coord59 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 1, (int) '#');
        int int60 = coord53.distanceFrom(coord59);
        int int61 = coord59.getL();
        int int62 = coord27.distanceFrom(coord59);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "(0,-1)" + "'", str49, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 67 + "'", int60 == 67);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 37 + "'", int62 == 37);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(135, (int) (short) 10);
        int int3 = coord2.getC();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str3 = coord2.toString();
        java.lang.String str4 = coord2.toString();
        fr.umontpellier.iut.algogen.Coord coord7 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord10 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int11 = coord7.distanceFrom(coord10);
        int int12 = coord7.getC();
        boolean boolean13 = coord2.estADistanceUn(coord7);
        java.lang.String str14 = coord7.toString();
        fr.umontpellier.iut.algogen.Coord coord17 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str18 = coord17.toString();
        java.lang.String str19 = coord17.toString();
        fr.umontpellier.iut.algogen.Coord coord22 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord25 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int26 = coord22.distanceFrom(coord25);
        int int27 = coord22.getC();
        boolean boolean28 = coord17.estADistanceUn(coord22);
        java.lang.String str29 = coord17.toString();
        int int30 = coord17.getL();
        boolean boolean33 = coord17.estDansPlateau((int) (short) -1, (int) (short) 0);
        fr.umontpellier.iut.algogen.Coord coord36 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean39 = coord36.estDansPlateau((int) (byte) -1, (int) ' ');
        boolean boolean40 = coord17.estADistanceUn(coord36);
        int int41 = coord36.getL();
        boolean boolean42 = coord7.estADistanceUn(coord36);
        fr.umontpellier.iut.algogen.Coord coord45 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean48 = coord45.estDansPlateau((int) (byte) -1, (int) ' ');
        int int49 = coord45.getC();
        int int50 = coord45.getC();
        java.lang.String str51 = coord45.toString();
        int int52 = coord7.distanceFrom(coord45);
        java.lang.String str53 = coord45.toString();
        int int54 = coord45.getC();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0,-1)" + "'", str3, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(0,-1)" + "'", str4, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(0,-1)" + "'", str14, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(0,-1)" + "'", str18, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(0,-1)" + "'", str19, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "(0,-1)" + "'", str29, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "(-1,0)" + "'", str51, "(-1,0)");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "(-1,0)" + "'", str53, "(-1,0)");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(164, (int) (short) 1);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(21, 103);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int6 = coord2.distanceFrom(coord5);
        int int7 = coord2.getL();
        fr.umontpellier.iut.algogen.Coord coord10 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord13 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int14 = coord10.distanceFrom(coord13);
        fr.umontpellier.iut.algogen.Coord coord17 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord20 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int21 = coord17.distanceFrom(coord20);
        boolean boolean22 = coord10.estADistanceUn(coord17);
        int int23 = coord17.getC();
        fr.umontpellier.iut.algogen.Coord coord26 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        int int27 = coord17.distanceFrom(coord26);
        boolean boolean29 = coord26.equals((java.lang.Object) 0);
        boolean boolean30 = coord2.estADistanceUn(coord26);
        int int31 = coord26.getL();
        boolean boolean34 = coord26.estDansPlateau((int) (byte) 100, (int) (byte) 0);
        java.lang.String str35 = coord26.toString();
        int int36 = coord26.getL();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 101 + "'", int27 == 101);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "(100,0)" + "'", str35, "(100,0)");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str3 = coord2.toString();
        java.lang.String str4 = coord2.toString();
        fr.umontpellier.iut.algogen.Coord coord7 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord10 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int11 = coord7.distanceFrom(coord10);
        int int12 = coord7.getC();
        boolean boolean13 = coord2.estADistanceUn(coord7);
        java.lang.String str14 = coord7.toString();
        fr.umontpellier.iut.algogen.Coord coord17 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str18 = coord17.toString();
        java.lang.String str19 = coord17.toString();
        fr.umontpellier.iut.algogen.Coord coord22 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord25 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int26 = coord22.distanceFrom(coord25);
        int int27 = coord22.getC();
        boolean boolean28 = coord17.estADistanceUn(coord22);
        java.lang.String str29 = coord17.toString();
        int int30 = coord17.getL();
        boolean boolean33 = coord17.estDansPlateau((int) (short) -1, (int) (short) 0);
        fr.umontpellier.iut.algogen.Coord coord36 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean39 = coord36.estDansPlateau((int) (byte) -1, (int) ' ');
        boolean boolean40 = coord17.estADistanceUn(coord36);
        int int41 = coord36.getL();
        boolean boolean42 = coord7.estADistanceUn(coord36);
        fr.umontpellier.iut.algogen.Coord coord45 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean48 = coord45.estDansPlateau((int) (byte) -1, (int) ' ');
        int int49 = coord45.getC();
        int int50 = coord45.getC();
        java.lang.String str51 = coord45.toString();
        int int52 = coord7.distanceFrom(coord45);
        fr.umontpellier.iut.algogen.Coord coord55 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord58 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int59 = coord55.distanceFrom(coord58);
        fr.umontpellier.iut.algogen.Coord coord62 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord65 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int66 = coord62.distanceFrom(coord65);
        boolean boolean67 = coord55.estADistanceUn(coord62);
        fr.umontpellier.iut.algogen.Coord coord70 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean73 = coord70.estDansPlateau((int) (byte) -1, (int) ' ');
        int int74 = coord70.getC();
        int int75 = coord70.getC();
        int int76 = coord70.getL();
        int int77 = coord70.getL();
        boolean boolean78 = coord62.estADistanceUn(coord70);
        boolean boolean79 = coord7.estADistanceUn(coord62);
        java.lang.String str80 = coord7.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0,-1)" + "'", str3, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(0,-1)" + "'", str4, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(0,-1)" + "'", str14, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(0,-1)" + "'", str18, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(0,-1)" + "'", str19, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "(0,-1)" + "'", str29, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "(-1,0)" + "'", str51, "(-1,0)");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "(0,-1)" + "'", str80, "(0,-1)");
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord8 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int9 = coord5.distanceFrom(coord8);
        int int10 = coord5.getL();
        int int11 = coord5.getC();
        int int12 = coord5.getL();
        boolean boolean13 = coord2.estADistanceUn(coord5);
        boolean boolean15 = coord2.equals((java.lang.Object) 100.0d);
        int int16 = coord2.getL();
        fr.umontpellier.iut.algogen.Coord coord19 = new fr.umontpellier.iut.algogen.Coord(101, 67);
        fr.umontpellier.iut.algogen.Coord coord22 = new fr.umontpellier.iut.algogen.Coord(111, (int) (short) 0);
        fr.umontpellier.iut.algogen.Coord coord25 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean28 = coord25.estDansPlateau((int) (byte) -1, (int) ' ');
        boolean boolean31 = coord25.estDansPlateau((int) ' ', (int) (byte) 1);
        boolean boolean33 = coord25.equals((java.lang.Object) true);
        int int34 = coord22.distanceFrom(coord25);
        int int35 = coord19.distanceFrom(coord25);
        boolean boolean36 = coord2.equals((java.lang.Object) coord19);
        fr.umontpellier.iut.algogen.Coord coord39 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord42 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int43 = coord39.distanceFrom(coord42);
        int int44 = coord39.getC();
        boolean boolean45 = coord2.estADistanceUn(coord39);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 112 + "'", int34 == 112);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 169 + "'", int35 == 169);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(100, 12);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(152, (int) (byte) 10);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (byte) -1);
        boolean boolean5 = coord2.estDansPlateau((int) ' ', (int) 'a');
        fr.umontpellier.iut.algogen.Coord coord8 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord11 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int12 = coord8.distanceFrom(coord11);
        fr.umontpellier.iut.algogen.Coord coord15 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord18 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int19 = coord15.distanceFrom(coord18);
        boolean boolean20 = coord8.estADistanceUn(coord15);
        int int21 = coord15.getC();
        fr.umontpellier.iut.algogen.Coord coord24 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        int int25 = coord15.distanceFrom(coord24);
        boolean boolean26 = coord2.estADistanceUn(coord15);
        fr.umontpellier.iut.algogen.Coord coord29 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (byte) -1);
        int int30 = coord29.getL();
        int int31 = coord29.getC();
        boolean boolean32 = coord2.estADistanceUn(coord29);
        fr.umontpellier.iut.algogen.Coord coord35 = new fr.umontpellier.iut.algogen.Coord((int) '4', (int) (short) -1);
        boolean boolean36 = coord29.estADistanceUn(coord35);
        boolean boolean39 = coord29.estDansPlateau(12, (int) (short) 100);
        fr.umontpellier.iut.algogen.Coord coord42 = new fr.umontpellier.iut.algogen.Coord(21, 101);
        fr.umontpellier.iut.algogen.Coord coord45 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        int int46 = coord42.distanceFrom(coord45);
        boolean boolean47 = coord29.equals((java.lang.Object) coord45);
        int int48 = coord45.getL();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 101 + "'", int25 == 101);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 180 + "'", int46 == 180);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int6 = coord2.distanceFrom(coord5);
        int int7 = coord2.getL();
        fr.umontpellier.iut.algogen.Coord coord10 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord13 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int14 = coord10.distanceFrom(coord13);
        fr.umontpellier.iut.algogen.Coord coord17 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord20 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int21 = coord17.distanceFrom(coord20);
        boolean boolean22 = coord10.estADistanceUn(coord17);
        int int23 = coord17.getC();
        fr.umontpellier.iut.algogen.Coord coord26 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        int int27 = coord17.distanceFrom(coord26);
        boolean boolean29 = coord26.equals((java.lang.Object) 0);
        boolean boolean30 = coord2.estADistanceUn(coord26);
        fr.umontpellier.iut.algogen.Coord coord33 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str34 = coord33.toString();
        java.lang.String str35 = coord33.toString();
        fr.umontpellier.iut.algogen.Coord coord38 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord41 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int42 = coord38.distanceFrom(coord41);
        int int43 = coord38.getC();
        boolean boolean44 = coord33.estADistanceUn(coord38);
        java.lang.String str45 = coord38.toString();
        boolean boolean46 = coord2.equals((java.lang.Object) coord38);
        boolean boolean49 = coord38.estDansPlateau((-1), 32);
        fr.umontpellier.iut.algogen.Coord coord52 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean55 = coord52.estDansPlateau((int) (byte) -1, (int) ' ');
        boolean boolean58 = coord52.estDansPlateau((int) ' ', (int) (byte) 1);
        fr.umontpellier.iut.algogen.Coord coord61 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean62 = coord52.estADistanceUn(coord61);
        fr.umontpellier.iut.algogen.Coord coord65 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord68 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int69 = coord65.distanceFrom(coord68);
        boolean boolean71 = coord65.equals((java.lang.Object) (byte) 1);
        java.lang.String str72 = coord65.toString();
        boolean boolean73 = coord52.equals((java.lang.Object) coord65);
        boolean boolean74 = coord38.estADistanceUn(coord65);
        java.lang.String str75 = coord65.toString();
        java.lang.String str76 = coord65.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 101 + "'", int27 == 101);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "(0,-1)" + "'", str34, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "(0,-1)" + "'", str35, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "(0,-1)" + "'", str45, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "(0,-1)" + "'", str72, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "(0,-1)" + "'", str75, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "(0,-1)" + "'", str76, "(0,-1)");
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int6 = coord2.distanceFrom(coord5);
        int int7 = coord2.getL();
        fr.umontpellier.iut.algogen.Coord coord10 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord13 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int14 = coord10.distanceFrom(coord13);
        fr.umontpellier.iut.algogen.Coord coord17 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord20 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int21 = coord17.distanceFrom(coord20);
        boolean boolean22 = coord10.estADistanceUn(coord17);
        int int23 = coord17.getC();
        fr.umontpellier.iut.algogen.Coord coord26 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        int int27 = coord17.distanceFrom(coord26);
        boolean boolean29 = coord26.equals((java.lang.Object) 0);
        boolean boolean30 = coord2.estADistanceUn(coord26);
        fr.umontpellier.iut.algogen.Coord coord33 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str34 = coord33.toString();
        java.lang.String str35 = coord33.toString();
        fr.umontpellier.iut.algogen.Coord coord38 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord41 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int42 = coord38.distanceFrom(coord41);
        int int43 = coord38.getC();
        boolean boolean44 = coord33.estADistanceUn(coord38);
        java.lang.String str45 = coord38.toString();
        boolean boolean46 = coord2.equals((java.lang.Object) coord38);
        int int47 = coord38.getL();
        fr.umontpellier.iut.algogen.Coord coord50 = new fr.umontpellier.iut.algogen.Coord((int) '#', (int) ' ');
        boolean boolean53 = coord50.estDansPlateau((-1), 0);
        int int54 = coord38.distanceFrom(coord50);
        boolean boolean57 = coord50.estDansPlateau((int) (short) -1, 149);
        fr.umontpellier.iut.algogen.Coord coord60 = new fr.umontpellier.iut.algogen.Coord(138, 169);
        boolean boolean61 = coord50.equals((java.lang.Object) 138);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 101 + "'", int27 == 101);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "(0,-1)" + "'", str34, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "(0,-1)" + "'", str35, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "(0,-1)" + "'", str45, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 68 + "'", int54 == 68);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int6 = coord2.distanceFrom(coord5);
        fr.umontpellier.iut.algogen.Coord coord9 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord12 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int13 = coord9.distanceFrom(coord12);
        boolean boolean14 = coord2.estADistanceUn(coord9);
        fr.umontpellier.iut.algogen.Coord coord17 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord20 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int21 = coord17.distanceFrom(coord20);
        boolean boolean23 = coord17.equals((java.lang.Object) (byte) 1);
        boolean boolean26 = coord17.estDansPlateau(100, (int) (byte) 1);
        int int27 = coord2.distanceFrom(coord17);
        boolean boolean30 = coord17.estDansPlateau((int) 'a', 32);
        int int31 = coord17.getC();
        fr.umontpellier.iut.algogen.Coord coord34 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        boolean boolean36 = coord34.equals((java.lang.Object) 'a');
        fr.umontpellier.iut.algogen.Coord coord39 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str40 = coord39.toString();
        java.lang.String str41 = coord39.toString();
        fr.umontpellier.iut.algogen.Coord coord44 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord47 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int48 = coord44.distanceFrom(coord47);
        int int49 = coord44.getC();
        boolean boolean50 = coord39.estADistanceUn(coord44);
        int int51 = coord34.distanceFrom(coord39);
        boolean boolean54 = coord34.estDansPlateau((int) (byte) 100, 2);
        fr.umontpellier.iut.algogen.Coord coord57 = new fr.umontpellier.iut.algogen.Coord((int) ' ', 0);
        boolean boolean59 = coord57.equals((java.lang.Object) (-1L));
        fr.umontpellier.iut.algogen.Coord coord62 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord65 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int66 = coord62.distanceFrom(coord65);
        int int67 = coord62.getC();
        java.lang.String str68 = coord62.toString();
        int int69 = coord62.getL();
        int int70 = coord57.distanceFrom(coord62);
        boolean boolean71 = coord34.estADistanceUn(coord57);
        boolean boolean72 = coord17.equals((java.lang.Object) boolean71);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "(0,-1)" + "'", str40, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "(0,-1)" + "'", str41, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "(0,-1)" + "'", str68, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 33 + "'", int70 == 33);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int6 = coord2.distanceFrom(coord5);
        int int7 = coord2.getL();
        fr.umontpellier.iut.algogen.Coord coord10 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord13 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int14 = coord10.distanceFrom(coord13);
        int int15 = coord10.getL();
        fr.umontpellier.iut.algogen.Coord coord18 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord21 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int22 = coord18.distanceFrom(coord21);
        fr.umontpellier.iut.algogen.Coord coord25 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord28 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int29 = coord25.distanceFrom(coord28);
        fr.umontpellier.iut.algogen.Coord coord32 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord35 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int36 = coord32.distanceFrom(coord35);
        boolean boolean37 = coord25.estADistanceUn(coord32);
        boolean boolean38 = coord18.estADistanceUn(coord25);
        boolean boolean41 = coord25.estDansPlateau(0, (int) (short) 1);
        int int42 = coord10.distanceFrom(coord25);
        boolean boolean43 = coord2.equals((java.lang.Object) coord10);
        java.lang.String str44 = coord10.toString();
        fr.umontpellier.iut.algogen.Coord coord47 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord50 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int51 = coord47.distanceFrom(coord50);
        fr.umontpellier.iut.algogen.Coord coord54 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord57 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int58 = coord54.distanceFrom(coord57);
        int int59 = coord54.getL();
        int int60 = coord54.getC();
        int int61 = coord54.getL();
        java.lang.String str62 = coord54.toString();
        boolean boolean63 = coord47.estADistanceUn(coord54);
        fr.umontpellier.iut.algogen.Coord coord66 = new fr.umontpellier.iut.algogen.Coord((int) ' ', 0);
        fr.umontpellier.iut.algogen.Coord coord69 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord72 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int73 = coord69.distanceFrom(coord72);
        fr.umontpellier.iut.algogen.Coord coord76 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord79 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int80 = coord76.distanceFrom(coord79);
        boolean boolean81 = coord69.estADistanceUn(coord76);
        boolean boolean82 = coord66.estADistanceUn(coord69);
        boolean boolean83 = coord54.estADistanceUn(coord66);
        int int84 = coord10.distanceFrom(coord66);
        boolean boolean87 = coord10.estDansPlateau(33, (int) (byte) -1);
        int int88 = coord10.getC();
        java.lang.Class<?> wildcardClass89 = coord10.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "(0,-1)" + "'", str44, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "(0,-1)" + "'", str62, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 33 + "'", int84 == 33);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(65, 52);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord((int) ' ', 0);
        fr.umontpellier.iut.algogen.Coord coord8 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord11 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int12 = coord8.distanceFrom(coord11);
        fr.umontpellier.iut.algogen.Coord coord15 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord18 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int19 = coord15.distanceFrom(coord18);
        boolean boolean20 = coord8.estADistanceUn(coord15);
        boolean boolean21 = coord5.estADistanceUn(coord8);
        java.lang.Class<?> wildcardClass22 = coord5.getClass();
        boolean boolean23 = coord2.equals((java.lang.Object) coord5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int6 = coord2.distanceFrom(coord5);
        fr.umontpellier.iut.algogen.Coord coord9 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord12 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int13 = coord9.distanceFrom(coord12);
        boolean boolean14 = coord2.estADistanceUn(coord9);
        fr.umontpellier.iut.algogen.Coord coord17 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord20 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int21 = coord17.distanceFrom(coord20);
        boolean boolean23 = coord17.equals((java.lang.Object) (byte) 1);
        boolean boolean26 = coord17.estDansPlateau(100, (int) (byte) 1);
        int int27 = coord2.distanceFrom(coord17);
        int int28 = coord17.getL();
        java.lang.String str29 = coord17.toString();
        int int30 = coord17.getL();
        boolean boolean33 = coord17.estDansPlateau((int) '4', (int) (byte) 10);
        int int34 = coord17.getC();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "(0,-1)" + "'", str29, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(11, 87);
        boolean boolean5 = coord2.estDansPlateau(100, 203);
        int int6 = coord2.getL();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(214, 279);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str3 = coord2.toString();
        java.lang.String str4 = coord2.toString();
        fr.umontpellier.iut.algogen.Coord coord7 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord10 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int11 = coord7.distanceFrom(coord10);
        int int12 = coord7.getC();
        boolean boolean13 = coord2.estADistanceUn(coord7);
        java.lang.String str14 = coord7.toString();
        boolean boolean17 = coord7.estDansPlateau((int) ' ', (int) (short) 10);
        fr.umontpellier.iut.algogen.Coord coord20 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord23 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int24 = coord20.distanceFrom(coord23);
        fr.umontpellier.iut.algogen.Coord coord27 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord30 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int31 = coord27.distanceFrom(coord30);
        int int32 = coord27.getL();
        int int33 = coord27.getC();
        int int34 = coord27.getL();
        java.lang.String str35 = coord27.toString();
        boolean boolean36 = coord20.estADistanceUn(coord27);
        boolean boolean37 = coord7.estADistanceUn(coord20);
        java.lang.String str38 = coord20.toString();
        boolean boolean41 = coord20.estDansPlateau(110, 96);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0,-1)" + "'", str3, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(0,-1)" + "'", str4, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(0,-1)" + "'", str14, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "(0,-1)" + "'", str35, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "(0,-1)" + "'", str38, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean5 = coord2.estDansPlateau((int) (byte) -1, (int) ' ');
        int int6 = coord2.getC();
        int int7 = coord2.getC();
        fr.umontpellier.iut.algogen.Coord coord10 = new fr.umontpellier.iut.algogen.Coord(32, 32);
        int int11 = coord2.distanceFrom(coord10);
        java.lang.Class<?> wildcardClass12 = coord10.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 65 + "'", int11 == 65);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int6 = coord2.distanceFrom(coord5);
        fr.umontpellier.iut.algogen.Coord coord9 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord12 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int13 = coord9.distanceFrom(coord12);
        boolean boolean14 = coord2.estADistanceUn(coord9);
        int int15 = coord9.getC();
        fr.umontpellier.iut.algogen.Coord coord18 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        int int19 = coord9.distanceFrom(coord18);
        boolean boolean21 = coord18.equals((java.lang.Object) 0);
        boolean boolean23 = coord18.equals((java.lang.Object) "(100,0)");
        int int24 = coord18.getC();
        boolean boolean26 = coord18.equals((java.lang.Object) 212);
        int int27 = coord18.getL();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 101 + "'", int19 == 101);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean5 = coord2.estDansPlateau((int) (byte) -1, (int) ' ');
        boolean boolean8 = coord2.estDansPlateau((int) ' ', (int) (byte) 1);
        int int9 = coord2.getL();
        int int10 = coord2.getL();
        boolean boolean13 = coord2.estDansPlateau((int) '#', (int) (byte) 100);
        java.lang.String str14 = coord2.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(-1,0)" + "'", str14, "(-1,0)");
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str3 = coord2.toString();
        java.lang.String str4 = coord2.toString();
        fr.umontpellier.iut.algogen.Coord coord7 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord10 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int11 = coord7.distanceFrom(coord10);
        int int12 = coord7.getC();
        boolean boolean13 = coord2.estADistanceUn(coord7);
        java.lang.String str14 = coord7.toString();
        boolean boolean17 = coord7.estDansPlateau(0, (int) '4');
        int int18 = coord7.getC();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0,-1)" + "'", str3, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(0,-1)" + "'", str4, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(0,-1)" + "'", str14, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 10, (-1));
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(193, 152);
        boolean boolean6 = coord2.estADistanceUn(coord5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(102, 217);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (byte) 10);
        fr.umontpellier.iut.algogen.Coord coord8 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord11 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int12 = coord8.distanceFrom(coord11);
        fr.umontpellier.iut.algogen.Coord coord15 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord18 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int19 = coord15.distanceFrom(coord18);
        fr.umontpellier.iut.algogen.Coord coord22 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord25 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int26 = coord22.distanceFrom(coord25);
        boolean boolean27 = coord15.estADistanceUn(coord22);
        boolean boolean28 = coord8.estADistanceUn(coord15);
        boolean boolean31 = coord15.estDansPlateau(0, (int) (short) 1);
        fr.umontpellier.iut.algogen.Coord coord34 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (byte) -1);
        boolean boolean35 = coord15.estADistanceUn(coord34);
        boolean boolean38 = coord34.estDansPlateau((int) ' ', (int) ' ');
        fr.umontpellier.iut.algogen.Coord coord41 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (byte) -1);
        boolean boolean44 = coord41.estDansPlateau((int) ' ', (int) 'a');
        fr.umontpellier.iut.algogen.Coord coord47 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord50 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int51 = coord47.distanceFrom(coord50);
        fr.umontpellier.iut.algogen.Coord coord54 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord57 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int58 = coord54.distanceFrom(coord57);
        boolean boolean59 = coord47.estADistanceUn(coord54);
        int int60 = coord54.getC();
        fr.umontpellier.iut.algogen.Coord coord63 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        int int64 = coord54.distanceFrom(coord63);
        boolean boolean65 = coord41.estADistanceUn(coord54);
        boolean boolean68 = coord41.estDansPlateau((int) (short) 1, (int) (byte) 0);
        int int69 = coord34.distanceFrom(coord41);
        int int70 = coord5.distanceFrom(coord41);
        int int71 = coord2.distanceFrom(coord41);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 101 + "'", int64 == 101);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 12 + "'", int70 == 12);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 321 + "'", int71 == 321);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        boolean boolean4 = coord2.equals((java.lang.Object) 'a');
        fr.umontpellier.iut.algogen.Coord coord7 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str8 = coord7.toString();
        java.lang.String str9 = coord7.toString();
        fr.umontpellier.iut.algogen.Coord coord12 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord15 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int16 = coord12.distanceFrom(coord15);
        int int17 = coord12.getC();
        boolean boolean18 = coord7.estADistanceUn(coord12);
        int int19 = coord2.distanceFrom(coord7);
        boolean boolean22 = coord2.estDansPlateau((int) (byte) 100, 2);
        int int23 = coord2.getC();
        fr.umontpellier.iut.algogen.Coord coord26 = new fr.umontpellier.iut.algogen.Coord((int) ' ', 0);
        boolean boolean28 = coord26.equals((java.lang.Object) (-1L));
        fr.umontpellier.iut.algogen.Coord coord31 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord34 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int35 = coord31.distanceFrom(coord34);
        int int36 = coord31.getC();
        java.lang.String str37 = coord31.toString();
        int int38 = coord31.getL();
        int int39 = coord26.distanceFrom(coord31);
        fr.umontpellier.iut.algogen.Coord coord42 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (byte) -1);
        int int43 = coord42.getL();
        int int44 = coord42.getC();
        int int45 = coord42.getL();
        int int46 = coord42.getL();
        boolean boolean48 = coord42.equals((java.lang.Object) (-1L));
        fr.umontpellier.iut.algogen.Coord coord51 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        fr.umontpellier.iut.algogen.Coord coord54 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord57 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int58 = coord54.distanceFrom(coord57);
        int int59 = coord54.getL();
        int int60 = coord54.getC();
        int int61 = coord54.getL();
        boolean boolean62 = coord51.estADistanceUn(coord54);
        boolean boolean65 = coord51.estDansPlateau((int) (byte) -1, (int) ' ');
        boolean boolean66 = coord42.equals((java.lang.Object) boolean65);
        int int67 = coord31.distanceFrom(coord42);
        int int68 = coord2.distanceFrom(coord42);
        java.lang.String str69 = coord42.toString();
        fr.umontpellier.iut.algogen.Coord coord72 = new fr.umontpellier.iut.algogen.Coord(101, 101);
        int int73 = coord72.getL();
        int int74 = coord72.getC();
        fr.umontpellier.iut.algogen.Coord coord77 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean80 = coord77.estDansPlateau((int) (byte) -1, (int) ' ');
        int int81 = coord77.getC();
        int int82 = coord77.getC();
        fr.umontpellier.iut.algogen.Coord coord85 = new fr.umontpellier.iut.algogen.Coord(32, 32);
        int int86 = coord77.distanceFrom(coord85);
        boolean boolean87 = coord72.equals((java.lang.Object) coord77);
        int int88 = coord77.getC();
        int int89 = coord77.getC();
        java.lang.String str90 = coord77.toString();
        java.lang.Object obj91 = null;
        boolean boolean92 = coord77.equals(obj91);
        int int93 = coord42.distanceFrom(coord77);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(0,-1)" + "'", str8, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(0,-1)" + "'", str9, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "(0,-1)" + "'", str37, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 33 + "'", int39 == 33);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "(-1,-1)" + "'", str69, "(-1,-1)");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 101 + "'", int73 == 101);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 101 + "'", int74 == 101);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 65 + "'", int86 == 65);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "(-1,0)" + "'", str90, "(-1,0)");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 1 + "'", int93 == 1);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int6 = coord2.distanceFrom(coord5);
        fr.umontpellier.iut.algogen.Coord coord9 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord12 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int13 = coord9.distanceFrom(coord12);
        boolean boolean14 = coord2.estADistanceUn(coord9);
        int int15 = coord9.getC();
        fr.umontpellier.iut.algogen.Coord coord18 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        int int19 = coord9.distanceFrom(coord18);
        boolean boolean21 = coord18.equals((java.lang.Object) 0);
        boolean boolean24 = coord18.estDansPlateau((int) (short) 100, 100);
        java.lang.String str25 = coord18.toString();
        int int26 = coord18.getL();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 101 + "'", int19 == 101);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "(100,0)" + "'", str25, "(100,0)");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean5 = coord2.estDansPlateau((int) (byte) -1, (int) ' ');
        int int6 = coord2.getC();
        int int7 = coord2.getC();
        int int8 = coord2.getL();
        int int9 = coord2.getL();
        fr.umontpellier.iut.algogen.Coord coord12 = new fr.umontpellier.iut.algogen.Coord((int) (byte) -1, (int) 'a');
        boolean boolean13 = coord2.estADistanceUn(coord12);
        fr.umontpellier.iut.algogen.Coord coord16 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str17 = coord16.toString();
        java.lang.String str18 = coord16.toString();
        fr.umontpellier.iut.algogen.Coord coord21 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord24 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int25 = coord21.distanceFrom(coord24);
        int int26 = coord21.getC();
        boolean boolean27 = coord16.estADistanceUn(coord21);
        java.lang.String str28 = coord21.toString();
        boolean boolean31 = coord21.estDansPlateau((int) ' ', (int) (short) 10);
        boolean boolean34 = coord21.estDansPlateau(21, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord37 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord40 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int41 = coord37.distanceFrom(coord40);
        int int42 = coord37.getL();
        fr.umontpellier.iut.algogen.Coord coord45 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord48 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int49 = coord45.distanceFrom(coord48);
        int int50 = coord45.getL();
        fr.umontpellier.iut.algogen.Coord coord53 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord56 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int57 = coord53.distanceFrom(coord56);
        fr.umontpellier.iut.algogen.Coord coord60 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord63 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int64 = coord60.distanceFrom(coord63);
        fr.umontpellier.iut.algogen.Coord coord67 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord70 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int71 = coord67.distanceFrom(coord70);
        boolean boolean72 = coord60.estADistanceUn(coord67);
        boolean boolean73 = coord53.estADistanceUn(coord60);
        boolean boolean76 = coord60.estDansPlateau(0, (int) (short) 1);
        int int77 = coord45.distanceFrom(coord60);
        boolean boolean78 = coord37.equals((java.lang.Object) coord45);
        boolean boolean79 = coord21.estADistanceUn(coord45);
        java.lang.String str80 = coord21.toString();
        int int81 = coord21.getL();
        boolean boolean82 = coord2.estADistanceUn(coord21);
        int int83 = coord21.getC();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(0,-1)" + "'", str17, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(0,-1)" + "'", str18, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "(0,-1)" + "'", str28, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "(0,-1)" + "'", str80, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) '#');
        boolean boolean5 = coord2.estDansPlateau(21, 33);
        fr.umontpellier.iut.algogen.Coord coord8 = new fr.umontpellier.iut.algogen.Coord(65, 52);
        int int9 = coord2.distanceFrom(coord8);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 83 + "'", int9 == 83);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(101, 101);
        boolean boolean5 = coord2.estDansPlateau((int) (short) 10, 32);
        int int6 = coord2.getL();
        fr.umontpellier.iut.algogen.Coord coord9 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str10 = coord9.toString();
        java.lang.String str11 = coord9.toString();
        fr.umontpellier.iut.algogen.Coord coord14 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord17 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int18 = coord14.distanceFrom(coord17);
        int int19 = coord14.getC();
        boolean boolean20 = coord9.estADistanceUn(coord14);
        java.lang.String str21 = coord9.toString();
        int int22 = coord9.getL();
        fr.umontpellier.iut.algogen.Coord coord25 = new fr.umontpellier.iut.algogen.Coord((int) ' ', 0);
        boolean boolean27 = coord25.equals((java.lang.Object) (-1L));
        fr.umontpellier.iut.algogen.Coord coord30 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord33 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int34 = coord30.distanceFrom(coord33);
        int int35 = coord30.getC();
        java.lang.String str36 = coord30.toString();
        int int37 = coord30.getL();
        int int38 = coord25.distanceFrom(coord30);
        fr.umontpellier.iut.algogen.Coord coord41 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        boolean boolean43 = coord41.equals((java.lang.Object) 'a');
        fr.umontpellier.iut.algogen.Coord coord46 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str47 = coord46.toString();
        java.lang.String str48 = coord46.toString();
        fr.umontpellier.iut.algogen.Coord coord51 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord54 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int55 = coord51.distanceFrom(coord54);
        int int56 = coord51.getC();
        boolean boolean57 = coord46.estADistanceUn(coord51);
        int int58 = coord41.distanceFrom(coord46);
        int int59 = coord25.distanceFrom(coord41);
        boolean boolean60 = coord9.estADistanceUn(coord25);
        java.lang.String str61 = coord25.toString();
        boolean boolean62 = coord2.estADistanceUn(coord25);
        fr.umontpellier.iut.algogen.Coord coord65 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        fr.umontpellier.iut.algogen.Coord coord68 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord71 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int72 = coord68.distanceFrom(coord71);
        int int73 = coord68.getL();
        int int74 = coord68.getC();
        int int75 = coord68.getL();
        boolean boolean76 = coord65.estADistanceUn(coord68);
        boolean boolean79 = coord65.estDansPlateau((int) (byte) -1, (int) ' ');
        int int80 = coord2.distanceFrom(coord65);
        java.lang.String str81 = coord2.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(0,-1)" + "'", str10, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(0,-1)" + "'", str11, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(0,-1)" + "'", str21, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "(0,-1)" + "'", str36, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 33 + "'", int38 == 33);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "(0,-1)" + "'", str47, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "(0,-1)" + "'", str48, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 33 + "'", int59 == 33);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "(32,0)" + "'", str61, "(32,0)");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 203 + "'", int80 == 203);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "(101,101)" + "'", str81, "(101,101)");
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        boolean boolean5 = coord2.estDansPlateau(127, 190);
        int int6 = coord2.getC();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 1, (int) '#');
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord8 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int9 = coord5.distanceFrom(coord8);
        fr.umontpellier.iut.algogen.Coord coord12 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord15 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int16 = coord12.distanceFrom(coord15);
        fr.umontpellier.iut.algogen.Coord coord19 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord22 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int23 = coord19.distanceFrom(coord22);
        boolean boolean24 = coord12.estADistanceUn(coord19);
        boolean boolean25 = coord5.estADistanceUn(coord12);
        boolean boolean28 = coord12.estDansPlateau(0, (int) (short) 1);
        fr.umontpellier.iut.algogen.Coord coord31 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (byte) -1);
        boolean boolean32 = coord12.estADistanceUn(coord31);
        boolean boolean33 = coord2.equals((java.lang.Object) boolean32);
        fr.umontpellier.iut.algogen.Coord coord36 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (byte) -1);
        boolean boolean39 = coord36.estDansPlateau((int) ' ', (int) 'a');
        fr.umontpellier.iut.algogen.Coord coord42 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord45 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int46 = coord42.distanceFrom(coord45);
        fr.umontpellier.iut.algogen.Coord coord49 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord52 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int53 = coord49.distanceFrom(coord52);
        boolean boolean54 = coord42.estADistanceUn(coord49);
        int int55 = coord49.getC();
        fr.umontpellier.iut.algogen.Coord coord58 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        int int59 = coord49.distanceFrom(coord58);
        boolean boolean60 = coord36.estADistanceUn(coord49);
        int int61 = coord2.distanceFrom(coord36);
        fr.umontpellier.iut.algogen.Coord coord64 = new fr.umontpellier.iut.algogen.Coord((int) (short) 1, 0);
        boolean boolean65 = coord2.estADistanceUn(coord64);
        int int66 = coord64.getC();
        boolean boolean69 = coord64.estDansPlateau(127, 54);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 101 + "'", int59 == 101);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 38 + "'", int61 == 38);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(87, 118);
        int int3 = coord2.getC();
        fr.umontpellier.iut.algogen.Coord coord6 = new fr.umontpellier.iut.algogen.Coord((int) ' ', 0);
        boolean boolean8 = coord6.equals((java.lang.Object) (-1L));
        boolean boolean11 = coord6.estDansPlateau((int) (byte) 10, 100);
        int int12 = coord6.getL();
        fr.umontpellier.iut.algogen.Coord coord15 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord18 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int19 = coord15.distanceFrom(coord18);
        fr.umontpellier.iut.algogen.Coord coord22 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord25 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int26 = coord22.distanceFrom(coord25);
        boolean boolean27 = coord15.estADistanceUn(coord22);
        boolean boolean28 = coord6.equals((java.lang.Object) coord15);
        fr.umontpellier.iut.algogen.Coord coord31 = new fr.umontpellier.iut.algogen.Coord((int) '#', (int) ' ');
        boolean boolean32 = coord15.estADistanceUn(coord31);
        java.lang.String str33 = coord15.toString();
        java.lang.Class<?> wildcardClass34 = coord15.getClass();
        boolean boolean35 = coord2.equals((java.lang.Object) coord15);
        boolean boolean38 = coord2.estDansPlateau(153, 191);
        int int39 = coord2.getL();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 118 + "'", int3 == 118);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "(0,-1)" + "'", str33, "(0,-1)");
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 87 + "'", int39 == 87);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) (byte) -1, (int) 'a');
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord((int) (byte) -1, (int) (short) -1);
        boolean boolean6 = coord2.estADistanceUn(coord5);
        java.lang.String str7 = coord2.toString();
        int int8 = coord2.getC();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(-1,97)" + "'", str7, "(-1,97)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(97, 210);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(212, 178);
        int int3 = coord2.getC();
        fr.umontpellier.iut.algogen.Coord coord6 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        int int7 = coord6.getC();
        fr.umontpellier.iut.algogen.Coord coord10 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        boolean boolean11 = coord6.equals((java.lang.Object) (byte) 100);
        int int12 = coord6.getL();
        boolean boolean15 = coord6.estDansPlateau(65, (int) (short) 1);
        fr.umontpellier.iut.algogen.Coord coord18 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (byte) -1);
        int int19 = coord18.getL();
        int int20 = coord18.getC();
        int int21 = coord18.getL();
        int int22 = coord18.getL();
        fr.umontpellier.iut.algogen.Coord coord25 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str26 = coord25.toString();
        java.lang.String str27 = coord25.toString();
        fr.umontpellier.iut.algogen.Coord coord30 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord33 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int34 = coord30.distanceFrom(coord33);
        int int35 = coord30.getC();
        boolean boolean36 = coord25.estADistanceUn(coord30);
        java.lang.String str37 = coord25.toString();
        int int38 = coord25.getL();
        boolean boolean41 = coord25.estDansPlateau((int) (short) -1, (int) (short) 0);
        fr.umontpellier.iut.algogen.Coord coord44 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean47 = coord44.estDansPlateau((int) (byte) -1, (int) ' ');
        boolean boolean48 = coord25.estADistanceUn(coord44);
        int int49 = coord18.distanceFrom(coord25);
        boolean boolean50 = coord6.equals((java.lang.Object) coord25);
        int int51 = coord6.getL();
        boolean boolean52 = coord2.estADistanceUn(coord6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 178 + "'", int3 == 178);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(0,-1)" + "'", str26, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(0,-1)" + "'", str27, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "(0,-1)" + "'", str37, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 0, 202);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) ' ', 0);
        boolean boolean4 = coord2.equals((java.lang.Object) (-1L));
        boolean boolean7 = coord2.estDansPlateau((int) (byte) 10, 100);
        int int8 = coord2.getL();
        fr.umontpellier.iut.algogen.Coord coord11 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord14 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int15 = coord11.distanceFrom(coord14);
        fr.umontpellier.iut.algogen.Coord coord18 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord21 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int22 = coord18.distanceFrom(coord21);
        boolean boolean23 = coord11.estADistanceUn(coord18);
        boolean boolean24 = coord2.equals((java.lang.Object) coord11);
        fr.umontpellier.iut.algogen.Coord coord27 = new fr.umontpellier.iut.algogen.Coord((int) '#', (int) ' ');
        boolean boolean28 = coord11.estADistanceUn(coord27);
        int int29 = coord27.getL();
        boolean boolean32 = coord27.estDansPlateau((int) (byte) -1, (int) 'a');
        boolean boolean35 = coord27.estDansPlateau(169, 0);
        boolean boolean38 = coord27.estDansPlateau((int) (byte) 0, 152);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(122, 101);
        boolean boolean5 = coord2.estDansPlateau((-1), 32);
        boolean boolean8 = coord2.estDansPlateau(102, (int) 'a');
        fr.umontpellier.iut.algogen.Coord coord9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = coord2.distanceFrom(coord9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(139, 457);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(137, 151);
        java.lang.String str3 = coord2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(137,151)" + "'", str3, "(137,151)");
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 32);
        int int3 = coord2.getC();
        boolean boolean6 = coord2.estDansPlateau((int) (short) 100, 2);
        fr.umontpellier.iut.algogen.Coord coord9 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str10 = coord9.toString();
        java.lang.String str11 = coord9.toString();
        fr.umontpellier.iut.algogen.Coord coord14 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord17 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int18 = coord14.distanceFrom(coord17);
        int int19 = coord14.getC();
        boolean boolean20 = coord9.estADistanceUn(coord14);
        java.lang.String str21 = coord9.toString();
        int int22 = coord9.getL();
        fr.umontpellier.iut.algogen.Coord coord25 = new fr.umontpellier.iut.algogen.Coord((int) ' ', 0);
        boolean boolean27 = coord25.equals((java.lang.Object) (-1L));
        fr.umontpellier.iut.algogen.Coord coord30 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord33 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int34 = coord30.distanceFrom(coord33);
        int int35 = coord30.getC();
        java.lang.String str36 = coord30.toString();
        int int37 = coord30.getL();
        int int38 = coord25.distanceFrom(coord30);
        fr.umontpellier.iut.algogen.Coord coord41 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        boolean boolean43 = coord41.equals((java.lang.Object) 'a');
        fr.umontpellier.iut.algogen.Coord coord46 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str47 = coord46.toString();
        java.lang.String str48 = coord46.toString();
        fr.umontpellier.iut.algogen.Coord coord51 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord54 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int55 = coord51.distanceFrom(coord54);
        int int56 = coord51.getC();
        boolean boolean57 = coord46.estADistanceUn(coord51);
        int int58 = coord41.distanceFrom(coord46);
        int int59 = coord25.distanceFrom(coord41);
        boolean boolean60 = coord9.estADistanceUn(coord25);
        int int61 = coord25.getL();
        java.lang.Object obj62 = new java.lang.Object();
        boolean boolean63 = coord25.equals(obj62);
        fr.umontpellier.iut.algogen.Coord coord66 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str67 = coord66.toString();
        java.lang.String str68 = coord66.toString();
        fr.umontpellier.iut.algogen.Coord coord71 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord74 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int75 = coord71.distanceFrom(coord74);
        int int76 = coord71.getC();
        boolean boolean77 = coord66.estADistanceUn(coord71);
        java.lang.String str78 = coord66.toString();
        int int79 = coord66.getL();
        boolean boolean82 = coord66.estDansPlateau((int) (short) -1, (int) (short) 0);
        fr.umontpellier.iut.algogen.Coord coord85 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean88 = coord85.estDansPlateau((int) (byte) -1, (int) ' ');
        boolean boolean89 = coord66.estADistanceUn(coord85);
        boolean boolean90 = coord25.estADistanceUn(coord66);
        fr.umontpellier.iut.algogen.Coord coord93 = new fr.umontpellier.iut.algogen.Coord((int) (short) 10, 65);
        int int94 = coord25.distanceFrom(coord93);
        boolean boolean95 = coord2.equals((java.lang.Object) int94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(0,-1)" + "'", str10, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(0,-1)" + "'", str11, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(0,-1)" + "'", str21, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "(0,-1)" + "'", str36, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 33 + "'", int38 == 33);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "(0,-1)" + "'", str47, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "(0,-1)" + "'", str48, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 33 + "'", int59 == 33);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 32 + "'", int61 == 32);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "(0,-1)" + "'", str67, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "(0,-1)" + "'", str68, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "(0,-1)" + "'", str78, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 87 + "'", int94 == 87);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean5 = coord2.estDansPlateau((int) (byte) -1, (int) ' ');
        fr.umontpellier.iut.algogen.Coord coord8 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord11 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int12 = coord8.distanceFrom(coord11);
        boolean boolean14 = coord8.equals((java.lang.Object) (byte) 1);
        java.lang.String str15 = coord8.toString();
        boolean boolean16 = coord2.equals((java.lang.Object) coord8);
        fr.umontpellier.iut.algogen.Coord coord19 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str20 = coord19.toString();
        java.lang.String str21 = coord19.toString();
        fr.umontpellier.iut.algogen.Coord coord24 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord27 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int28 = coord24.distanceFrom(coord27);
        int int29 = coord24.getC();
        boolean boolean30 = coord19.estADistanceUn(coord24);
        java.lang.String str31 = coord19.toString();
        int int32 = coord19.getL();
        boolean boolean35 = coord19.estDansPlateau((int) (short) -1, (int) (short) 0);
        fr.umontpellier.iut.algogen.Coord coord38 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord41 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int42 = coord38.distanceFrom(coord41);
        fr.umontpellier.iut.algogen.Coord coord45 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord48 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int49 = coord45.distanceFrom(coord48);
        boolean boolean50 = coord38.estADistanceUn(coord45);
        int int51 = coord45.getC();
        fr.umontpellier.iut.algogen.Coord coord54 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        int int55 = coord45.distanceFrom(coord54);
        boolean boolean57 = coord54.equals((java.lang.Object) 0);
        java.lang.String str58 = coord54.toString();
        int int59 = coord19.distanceFrom(coord54);
        boolean boolean60 = coord8.equals((java.lang.Object) int59);
        boolean boolean63 = coord8.estDansPlateau(35, 52);
        int int64 = coord8.getC();
        boolean boolean67 = coord8.estDansPlateau(38, 97);
        int int68 = coord8.getC();
        int int69 = coord8.getL();
        int int70 = coord8.getL();
        java.lang.String str71 = coord8.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(0,-1)" + "'", str15, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(0,-1)" + "'", str20, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(0,-1)" + "'", str21, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "(0,-1)" + "'", str31, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 101 + "'", int55 == 101);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "(100,0)" + "'", str58, "(100,0)");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 101 + "'", int59 == 101);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "(0,-1)" + "'", str71, "(0,-1)");
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int6 = coord2.distanceFrom(coord5);
        int int7 = coord2.getL();
        fr.umontpellier.iut.algogen.Coord coord10 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord13 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int14 = coord10.distanceFrom(coord13);
        fr.umontpellier.iut.algogen.Coord coord17 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord20 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int21 = coord17.distanceFrom(coord20);
        boolean boolean22 = coord10.estADistanceUn(coord17);
        int int23 = coord17.getC();
        fr.umontpellier.iut.algogen.Coord coord26 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        int int27 = coord17.distanceFrom(coord26);
        boolean boolean29 = coord26.equals((java.lang.Object) 0);
        boolean boolean30 = coord2.estADistanceUn(coord26);
        fr.umontpellier.iut.algogen.Coord coord33 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str34 = coord33.toString();
        java.lang.String str35 = coord33.toString();
        fr.umontpellier.iut.algogen.Coord coord38 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord41 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int42 = coord38.distanceFrom(coord41);
        int int43 = coord38.getC();
        boolean boolean44 = coord33.estADistanceUn(coord38);
        java.lang.String str45 = coord33.toString();
        int int46 = coord33.getL();
        boolean boolean49 = coord33.estDansPlateau((int) (short) -1, (int) (short) 0);
        fr.umontpellier.iut.algogen.Coord coord52 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean55 = coord52.estDansPlateau((int) (byte) -1, (int) ' ');
        boolean boolean56 = coord33.estADistanceUn(coord52);
        boolean boolean57 = coord2.equals((java.lang.Object) coord52);
        boolean boolean60 = coord2.estDansPlateau(105, 12);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 101 + "'", int27 == 101);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "(0,-1)" + "'", str34, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "(0,-1)" + "'", str35, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "(0,-1)" + "'", str45, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str6 = coord5.toString();
        java.lang.String str7 = coord5.toString();
        fr.umontpellier.iut.algogen.Coord coord10 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord13 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int14 = coord10.distanceFrom(coord13);
        int int15 = coord10.getC();
        boolean boolean16 = coord5.estADistanceUn(coord10);
        int int17 = coord5.getL();
        boolean boolean18 = coord2.estADistanceUn(coord5);
        fr.umontpellier.iut.algogen.Coord coord21 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord24 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int25 = coord21.distanceFrom(coord24);
        int int26 = coord21.getL();
        fr.umontpellier.iut.algogen.Coord coord29 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord32 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int33 = coord29.distanceFrom(coord32);
        fr.umontpellier.iut.algogen.Coord coord36 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord39 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int40 = coord36.distanceFrom(coord39);
        boolean boolean41 = coord29.estADistanceUn(coord36);
        int int42 = coord36.getC();
        fr.umontpellier.iut.algogen.Coord coord45 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        int int46 = coord36.distanceFrom(coord45);
        boolean boolean48 = coord45.equals((java.lang.Object) 0);
        boolean boolean49 = coord21.estADistanceUn(coord45);
        fr.umontpellier.iut.algogen.Coord coord52 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str53 = coord52.toString();
        java.lang.String str54 = coord52.toString();
        fr.umontpellier.iut.algogen.Coord coord57 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord60 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int61 = coord57.distanceFrom(coord60);
        int int62 = coord57.getC();
        boolean boolean63 = coord52.estADistanceUn(coord57);
        java.lang.String str64 = coord57.toString();
        boolean boolean65 = coord21.equals((java.lang.Object) coord57);
        boolean boolean68 = coord57.estDansPlateau((-1), 32);
        boolean boolean70 = coord57.equals((java.lang.Object) 1L);
        int int71 = coord57.getC();
        boolean boolean72 = coord5.estADistanceUn(coord57);
        int int73 = coord57.getL();
        java.lang.Class<?> wildcardClass74 = coord57.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(0,-1)" + "'", str6, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(0,-1)" + "'", str7, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 101 + "'", int46 == 101);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "(0,-1)" + "'", str53, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "(0,-1)" + "'", str54, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "(0,-1)" + "'", str64, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int6 = coord2.distanceFrom(coord5);
        int int7 = coord2.getC();
        int int8 = coord2.getL();
        java.lang.String str9 = coord2.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(0,-1)" + "'", str9, "(0,-1)");
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int6 = coord2.distanceFrom(coord5);
        int int7 = coord2.getC();
        boolean boolean10 = coord2.estDansPlateau((int) (short) 0, (int) (byte) 10);
        fr.umontpellier.iut.algogen.Coord coord13 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord16 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int17 = coord13.distanceFrom(coord16);
        fr.umontpellier.iut.algogen.Coord coord20 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord23 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int24 = coord20.distanceFrom(coord23);
        fr.umontpellier.iut.algogen.Coord coord27 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord30 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int31 = coord27.distanceFrom(coord30);
        boolean boolean32 = coord20.estADistanceUn(coord27);
        boolean boolean33 = coord13.estADistanceUn(coord20);
        boolean boolean34 = coord2.estADistanceUn(coord13);
        fr.umontpellier.iut.algogen.Coord coord37 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord40 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int41 = coord37.distanceFrom(coord40);
        int int42 = coord37.getL();
        fr.umontpellier.iut.algogen.Coord coord45 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord48 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int49 = coord45.distanceFrom(coord48);
        int int50 = coord45.getL();
        fr.umontpellier.iut.algogen.Coord coord53 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord56 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int57 = coord53.distanceFrom(coord56);
        fr.umontpellier.iut.algogen.Coord coord60 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord63 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int64 = coord60.distanceFrom(coord63);
        fr.umontpellier.iut.algogen.Coord coord67 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord70 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int71 = coord67.distanceFrom(coord70);
        boolean boolean72 = coord60.estADistanceUn(coord67);
        boolean boolean73 = coord53.estADistanceUn(coord60);
        boolean boolean76 = coord60.estDansPlateau(0, (int) (short) 1);
        int int77 = coord45.distanceFrom(coord60);
        boolean boolean78 = coord37.equals((java.lang.Object) coord45);
        int int79 = coord45.getL();
        int int80 = coord13.distanceFrom(coord45);
        boolean boolean83 = coord13.estDansPlateau(2, (int) (byte) 0);
        java.lang.String str84 = coord13.toString();
        int int85 = coord13.getC();
        boolean boolean88 = coord13.estDansPlateau(212, 180);
        boolean boolean91 = coord13.estDansPlateau(32, 201);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "(0,-1)" + "'", str84, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(21, 10);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (byte) -1);
        int int6 = coord5.getL();
        int int7 = coord5.getC();
        int int8 = coord5.getL();
        fr.umontpellier.iut.algogen.Coord coord11 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        java.lang.String str12 = coord11.toString();
        boolean boolean13 = coord5.estADistanceUn(coord11);
        int int14 = coord11.getC();
        boolean boolean15 = coord2.equals((java.lang.Object) int14);
        fr.umontpellier.iut.algogen.Coord coord18 = new fr.umontpellier.iut.algogen.Coord((int) ' ', 32);
        int int19 = coord18.getC();
        boolean boolean20 = coord2.estADistanceUn(coord18);
        fr.umontpellier.iut.algogen.Coord coord23 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        int int24 = coord23.getC();
        fr.umontpellier.iut.algogen.Coord coord27 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        boolean boolean28 = coord23.equals((java.lang.Object) (byte) 100);
        int int29 = coord23.getL();
        boolean boolean32 = coord23.estDansPlateau(65, (int) (short) 1);
        fr.umontpellier.iut.algogen.Coord coord35 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (byte) -1);
        int int36 = coord35.getL();
        int int37 = coord35.getC();
        int int38 = coord35.getL();
        int int39 = coord35.getL();
        fr.umontpellier.iut.algogen.Coord coord42 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str43 = coord42.toString();
        java.lang.String str44 = coord42.toString();
        fr.umontpellier.iut.algogen.Coord coord47 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord50 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int51 = coord47.distanceFrom(coord50);
        int int52 = coord47.getC();
        boolean boolean53 = coord42.estADistanceUn(coord47);
        java.lang.String str54 = coord42.toString();
        int int55 = coord42.getL();
        boolean boolean58 = coord42.estDansPlateau((int) (short) -1, (int) (short) 0);
        fr.umontpellier.iut.algogen.Coord coord61 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean64 = coord61.estDansPlateau((int) (byte) -1, (int) ' ');
        boolean boolean65 = coord42.estADistanceUn(coord61);
        int int66 = coord35.distanceFrom(coord42);
        boolean boolean67 = coord23.equals((java.lang.Object) coord42);
        boolean boolean68 = coord2.estADistanceUn(coord42);
        java.lang.Class<?> wildcardClass69 = coord42.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(100,0)" + "'", str12, "(100,0)");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "(0,-1)" + "'", str43, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "(0,-1)" + "'", str44, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "(0,-1)" + "'", str54, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (byte) -1);
        int int3 = coord2.getL();
        int int4 = coord2.getC();
        int int5 = coord2.getL();
        int int6 = coord2.getL();
        boolean boolean8 = coord2.equals((java.lang.Object) (-1L));
        fr.umontpellier.iut.algogen.Coord coord11 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str12 = coord11.toString();
        java.lang.String str13 = coord11.toString();
        fr.umontpellier.iut.algogen.Coord coord16 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord19 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int20 = coord16.distanceFrom(coord19);
        int int21 = coord16.getC();
        boolean boolean22 = coord11.estADistanceUn(coord16);
        java.lang.String str23 = coord11.toString();
        int int24 = coord11.getL();
        fr.umontpellier.iut.algogen.Coord coord27 = new fr.umontpellier.iut.algogen.Coord((int) ' ', 0);
        boolean boolean29 = coord27.equals((java.lang.Object) (-1L));
        fr.umontpellier.iut.algogen.Coord coord32 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord35 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int36 = coord32.distanceFrom(coord35);
        int int37 = coord32.getC();
        java.lang.String str38 = coord32.toString();
        int int39 = coord32.getL();
        int int40 = coord27.distanceFrom(coord32);
        fr.umontpellier.iut.algogen.Coord coord43 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        boolean boolean45 = coord43.equals((java.lang.Object) 'a');
        fr.umontpellier.iut.algogen.Coord coord48 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str49 = coord48.toString();
        java.lang.String str50 = coord48.toString();
        fr.umontpellier.iut.algogen.Coord coord53 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord56 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int57 = coord53.distanceFrom(coord56);
        int int58 = coord53.getC();
        boolean boolean59 = coord48.estADistanceUn(coord53);
        int int60 = coord43.distanceFrom(coord48);
        int int61 = coord27.distanceFrom(coord43);
        boolean boolean62 = coord11.estADistanceUn(coord27);
        int int63 = coord27.getL();
        java.lang.Object obj64 = new java.lang.Object();
        boolean boolean65 = coord27.equals(obj64);
        boolean boolean66 = coord2.estADistanceUn(coord27);
        int int67 = coord2.getC();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(0,-1)" + "'", str12, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(0,-1)" + "'", str13, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "(0,-1)" + "'", str23, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "(0,-1)" + "'", str38, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 33 + "'", int40 == 33);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "(0,-1)" + "'", str49, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "(0,-1)" + "'", str50, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 33 + "'", int61 == 33);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 32 + "'", int63 == 32);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean5 = coord2.estDansPlateau((int) (byte) -1, (int) ' ');
        int int6 = coord2.getC();
        int int7 = coord2.getC();
        fr.umontpellier.iut.algogen.Coord coord10 = new fr.umontpellier.iut.algogen.Coord(32, 32);
        int int11 = coord2.distanceFrom(coord10);
        int int12 = coord2.getC();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 65 + "'", int11 == 65);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(101, 101);
        boolean boolean5 = coord2.estDansPlateau((int) (short) 10, 32);
        int int6 = coord2.getL();
        fr.umontpellier.iut.algogen.Coord coord9 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str10 = coord9.toString();
        java.lang.String str11 = coord9.toString();
        fr.umontpellier.iut.algogen.Coord coord14 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord17 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int18 = coord14.distanceFrom(coord17);
        int int19 = coord14.getC();
        boolean boolean20 = coord9.estADistanceUn(coord14);
        java.lang.String str21 = coord9.toString();
        int int22 = coord9.getL();
        fr.umontpellier.iut.algogen.Coord coord25 = new fr.umontpellier.iut.algogen.Coord((int) ' ', 0);
        boolean boolean27 = coord25.equals((java.lang.Object) (-1L));
        fr.umontpellier.iut.algogen.Coord coord30 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord33 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int34 = coord30.distanceFrom(coord33);
        int int35 = coord30.getC();
        java.lang.String str36 = coord30.toString();
        int int37 = coord30.getL();
        int int38 = coord25.distanceFrom(coord30);
        fr.umontpellier.iut.algogen.Coord coord41 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        boolean boolean43 = coord41.equals((java.lang.Object) 'a');
        fr.umontpellier.iut.algogen.Coord coord46 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str47 = coord46.toString();
        java.lang.String str48 = coord46.toString();
        fr.umontpellier.iut.algogen.Coord coord51 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord54 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int55 = coord51.distanceFrom(coord54);
        int int56 = coord51.getC();
        boolean boolean57 = coord46.estADistanceUn(coord51);
        int int58 = coord41.distanceFrom(coord46);
        int int59 = coord25.distanceFrom(coord41);
        boolean boolean60 = coord9.estADistanceUn(coord25);
        java.lang.String str61 = coord25.toString();
        boolean boolean62 = coord2.estADistanceUn(coord25);
        fr.umontpellier.iut.algogen.Coord coord65 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        int int66 = coord65.getC();
        fr.umontpellier.iut.algogen.Coord coord69 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        boolean boolean70 = coord65.equals((java.lang.Object) (byte) 100);
        int int71 = coord65.getL();
        boolean boolean74 = coord65.estDansPlateau(65, (int) (short) 1);
        java.lang.String str75 = coord65.toString();
        boolean boolean76 = coord25.estADistanceUn(coord65);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(0,-1)" + "'", str10, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(0,-1)" + "'", str11, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(0,-1)" + "'", str21, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "(0,-1)" + "'", str36, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 33 + "'", int38 == 33);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "(0,-1)" + "'", str47, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "(0,-1)" + "'", str48, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 33 + "'", int59 == 33);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "(32,0)" + "'", str61, "(32,0)");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "(-1,0)" + "'", str75, "(-1,0)");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) ' ', 0);
        boolean boolean4 = coord2.equals((java.lang.Object) (-1L));
        boolean boolean7 = coord2.estDansPlateau((int) (byte) 10, 100);
        fr.umontpellier.iut.algogen.Coord coord10 = new fr.umontpellier.iut.algogen.Coord((int) ' ', 0);
        boolean boolean12 = coord10.equals((java.lang.Object) (-1L));
        fr.umontpellier.iut.algogen.Coord coord15 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord18 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int19 = coord15.distanceFrom(coord18);
        int int20 = coord15.getC();
        java.lang.String str21 = coord15.toString();
        int int22 = coord15.getL();
        int int23 = coord10.distanceFrom(coord15);
        fr.umontpellier.iut.algogen.Coord coord26 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (byte) -1);
        int int27 = coord26.getL();
        int int28 = coord26.getC();
        int int29 = coord10.distanceFrom(coord26);
        int int30 = coord2.distanceFrom(coord26);
        int int31 = coord26.getC();
        fr.umontpellier.iut.algogen.Coord coord34 = new fr.umontpellier.iut.algogen.Coord(32, (int) (short) 1);
        fr.umontpellier.iut.algogen.Coord coord37 = new fr.umontpellier.iut.algogen.Coord((int) '#', 52);
        int int38 = coord34.distanceFrom(coord37);
        int int39 = coord26.distanceFrom(coord34);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(0,-1)" + "'", str21, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 33 + "'", int23 == 33);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 34 + "'", int29 == 34);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 34 + "'", int30 == 34);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 54 + "'", int38 == 54);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) '#', 33);
        java.lang.String str3 = coord2.toString();
        int int4 = coord2.getL();
        int int5 = coord2.getL();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(35,33)" + "'", str3, "(35,33)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(43, 9);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(137, 85);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (byte) 10);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord8 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int9 = coord5.distanceFrom(coord8);
        fr.umontpellier.iut.algogen.Coord coord12 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord15 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int16 = coord12.distanceFrom(coord15);
        fr.umontpellier.iut.algogen.Coord coord19 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord22 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int23 = coord19.distanceFrom(coord22);
        boolean boolean24 = coord12.estADistanceUn(coord19);
        boolean boolean25 = coord5.estADistanceUn(coord12);
        boolean boolean28 = coord12.estDansPlateau(0, (int) (short) 1);
        fr.umontpellier.iut.algogen.Coord coord31 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (byte) -1);
        boolean boolean32 = coord12.estADistanceUn(coord31);
        boolean boolean35 = coord31.estDansPlateau((int) ' ', (int) ' ');
        fr.umontpellier.iut.algogen.Coord coord38 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (byte) -1);
        boolean boolean41 = coord38.estDansPlateau((int) ' ', (int) 'a');
        fr.umontpellier.iut.algogen.Coord coord44 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord47 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int48 = coord44.distanceFrom(coord47);
        fr.umontpellier.iut.algogen.Coord coord51 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord54 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int55 = coord51.distanceFrom(coord54);
        boolean boolean56 = coord44.estADistanceUn(coord51);
        int int57 = coord51.getC();
        fr.umontpellier.iut.algogen.Coord coord60 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        int int61 = coord51.distanceFrom(coord60);
        boolean boolean62 = coord38.estADistanceUn(coord51);
        boolean boolean65 = coord38.estDansPlateau((int) (short) 1, (int) (byte) 0);
        int int66 = coord31.distanceFrom(coord38);
        int int67 = coord2.distanceFrom(coord38);
        int int68 = coord2.getL();
        boolean boolean71 = coord2.estDansPlateau(36, (int) (short) 10);
        boolean boolean74 = coord2.estDansPlateau(123, 65);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 101 + "'", int61 == 101);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 12 + "'", int67 == 12);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(87, (int) (short) 0);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord8 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int9 = coord5.distanceFrom(coord8);
        boolean boolean11 = coord5.equals((java.lang.Object) (byte) 1);
        java.lang.String str12 = coord5.toString();
        fr.umontpellier.iut.algogen.Coord coord15 = new fr.umontpellier.iut.algogen.Coord((int) (short) 100, (int) (short) 10);
        boolean boolean16 = coord5.estADistanceUn(coord15);
        boolean boolean19 = coord15.estDansPlateau(100, 101);
        java.lang.String str20 = coord15.toString();
        fr.umontpellier.iut.algogen.Coord coord23 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord26 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int27 = coord23.distanceFrom(coord26);
        int int28 = coord23.getC();
        fr.umontpellier.iut.algogen.Coord coord31 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord34 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int35 = coord31.distanceFrom(coord34);
        boolean boolean37 = coord31.equals((java.lang.Object) (byte) 1);
        int int38 = coord31.getL();
        java.lang.String str39 = coord31.toString();
        boolean boolean40 = coord23.equals((java.lang.Object) str39);
        fr.umontpellier.iut.algogen.Coord coord43 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord46 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int47 = coord43.distanceFrom(coord46);
        fr.umontpellier.iut.algogen.Coord coord50 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord53 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int54 = coord50.distanceFrom(coord53);
        boolean boolean55 = coord43.estADistanceUn(coord50);
        int int56 = coord50.getC();
        fr.umontpellier.iut.algogen.Coord coord59 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        int int60 = coord50.distanceFrom(coord59);
        int int61 = coord50.getL();
        boolean boolean64 = coord50.estDansPlateau((int) (short) 100, 1);
        int int65 = coord23.distanceFrom(coord50);
        boolean boolean68 = coord23.estDansPlateau((int) (short) 1, (int) (byte) 1);
        int int69 = coord15.distanceFrom(coord23);
        int int70 = coord15.getL();
        int int71 = coord2.distanceFrom(coord15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(0,-1)" + "'", str12, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(100,10)" + "'", str20, "(100,10)");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "(0,-1)" + "'", str39, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 101 + "'", int60 == 101);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 111 + "'", int69 == 111);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 100 + "'", int70 == 100);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 23 + "'", int71 == 23);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str3 = coord2.toString();
        java.lang.String str4 = coord2.toString();
        fr.umontpellier.iut.algogen.Coord coord7 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord10 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int11 = coord7.distanceFrom(coord10);
        int int12 = coord7.getC();
        boolean boolean13 = coord2.estADistanceUn(coord7);
        java.lang.String str14 = coord7.toString();
        fr.umontpellier.iut.algogen.Coord coord17 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str18 = coord17.toString();
        java.lang.String str19 = coord17.toString();
        fr.umontpellier.iut.algogen.Coord coord22 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord25 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int26 = coord22.distanceFrom(coord25);
        int int27 = coord22.getC();
        boolean boolean28 = coord17.estADistanceUn(coord22);
        java.lang.String str29 = coord17.toString();
        int int30 = coord17.getL();
        boolean boolean33 = coord17.estDansPlateau((int) (short) -1, (int) (short) 0);
        fr.umontpellier.iut.algogen.Coord coord36 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean39 = coord36.estDansPlateau((int) (byte) -1, (int) ' ');
        boolean boolean40 = coord17.estADistanceUn(coord36);
        int int41 = coord36.getL();
        boolean boolean42 = coord7.estADistanceUn(coord36);
        fr.umontpellier.iut.algogen.Coord coord45 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean48 = coord45.estDansPlateau((int) (byte) -1, (int) ' ');
        int int49 = coord45.getC();
        int int50 = coord45.getC();
        java.lang.String str51 = coord45.toString();
        int int52 = coord7.distanceFrom(coord45);
        int int53 = coord45.getL();
        java.lang.Class<?> wildcardClass54 = coord45.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0,-1)" + "'", str3, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(0,-1)" + "'", str4, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(0,-1)" + "'", str14, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(0,-1)" + "'", str18, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(0,-1)" + "'", str19, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "(0,-1)" + "'", str29, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "(-1,0)" + "'", str51, "(-1,0)");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (byte) -1);
        int int3 = coord2.getL();
        int int4 = coord2.getC();
        int int5 = coord2.getL();
        int int6 = coord2.getL();
        boolean boolean8 = coord2.equals((java.lang.Object) (-1L));
        fr.umontpellier.iut.algogen.Coord coord11 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (byte) -1);
        int int12 = coord11.getL();
        fr.umontpellier.iut.algogen.Coord coord15 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str16 = coord15.toString();
        java.lang.String str17 = coord15.toString();
        fr.umontpellier.iut.algogen.Coord coord20 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord23 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int24 = coord20.distanceFrom(coord23);
        int int25 = coord20.getC();
        boolean boolean26 = coord15.estADistanceUn(coord20);
        java.lang.String str27 = coord15.toString();
        int int28 = coord15.getL();
        boolean boolean31 = coord15.estDansPlateau((int) (short) -1, (int) (short) 0);
        fr.umontpellier.iut.algogen.Coord coord34 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean37 = coord34.estDansPlateau((int) (byte) -1, (int) ' ');
        boolean boolean38 = coord15.estADistanceUn(coord34);
        boolean boolean39 = coord11.equals((java.lang.Object) coord34);
        int int40 = coord2.distanceFrom(coord34);
        java.lang.String str41 = coord2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(0,-1)" + "'", str16, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(0,-1)" + "'", str17, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(0,-1)" + "'", str27, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "(-1,-1)" + "'", str41, "(-1,-1)");
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(149, 54);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(130, 140);
        int int6 = coord2.distanceFrom(coord5);
        fr.umontpellier.iut.algogen.Coord coord9 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord12 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int13 = coord9.distanceFrom(coord12);
        java.lang.String str14 = coord12.toString();
        fr.umontpellier.iut.algogen.Coord coord17 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord20 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int21 = coord17.distanceFrom(coord20);
        int int22 = coord20.getC();
        int int23 = coord12.distanceFrom(coord20);
        fr.umontpellier.iut.algogen.Coord coord26 = new fr.umontpellier.iut.algogen.Coord(1, (-1));
        fr.umontpellier.iut.algogen.Coord coord29 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) 0);
        fr.umontpellier.iut.algogen.Coord coord32 = new fr.umontpellier.iut.algogen.Coord(10, (int) (short) 10);
        boolean boolean33 = coord29.estADistanceUn(coord32);
        boolean boolean34 = coord26.equals((java.lang.Object) coord29);
        fr.umontpellier.iut.algogen.Coord coord37 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str38 = coord37.toString();
        java.lang.String str39 = coord37.toString();
        fr.umontpellier.iut.algogen.Coord coord42 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord45 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int46 = coord42.distanceFrom(coord45);
        int int47 = coord42.getC();
        boolean boolean48 = coord37.estADistanceUn(coord42);
        java.lang.String str49 = coord37.toString();
        int int50 = coord29.distanceFrom(coord37);
        boolean boolean51 = coord20.estADistanceUn(coord37);
        fr.umontpellier.iut.algogen.Coord coord54 = new fr.umontpellier.iut.algogen.Coord((int) ' ', 0);
        fr.umontpellier.iut.algogen.Coord coord57 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord60 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int61 = coord57.distanceFrom(coord60);
        fr.umontpellier.iut.algogen.Coord coord64 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord67 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int68 = coord64.distanceFrom(coord67);
        boolean boolean69 = coord57.estADistanceUn(coord64);
        boolean boolean70 = coord54.estADistanceUn(coord57);
        boolean boolean73 = coord54.estDansPlateau((int) (short) 10, (int) (byte) -1);
        java.lang.String str74 = coord54.toString();
        int int75 = coord20.distanceFrom(coord54);
        int int76 = coord5.distanceFrom(coord20);
        java.lang.String str77 = coord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 105 + "'", int6 == 105);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(0,-1)" + "'", str14, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "(0,-1)" + "'", str38, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "(0,-1)" + "'", str39, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "(0,-1)" + "'", str49, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "(32,0)" + "'", str74, "(32,0)");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 33 + "'", int75 == 33);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 271 + "'", int76 == 271);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "(130,140)" + "'", str77, "(130,140)");
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) ' ', 0);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord8 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int9 = coord5.distanceFrom(coord8);
        fr.umontpellier.iut.algogen.Coord coord12 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord15 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int16 = coord12.distanceFrom(coord15);
        boolean boolean17 = coord5.estADistanceUn(coord12);
        boolean boolean18 = coord2.estADistanceUn(coord5);
        fr.umontpellier.iut.algogen.Coord coord21 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord24 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int25 = coord21.distanceFrom(coord24);
        int int26 = coord21.getL();
        fr.umontpellier.iut.algogen.Coord coord29 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord32 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int33 = coord29.distanceFrom(coord32);
        fr.umontpellier.iut.algogen.Coord coord36 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord39 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int40 = coord36.distanceFrom(coord39);
        boolean boolean41 = coord29.estADistanceUn(coord36);
        int int42 = coord36.getC();
        fr.umontpellier.iut.algogen.Coord coord45 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        int int46 = coord36.distanceFrom(coord45);
        boolean boolean48 = coord45.equals((java.lang.Object) 0);
        boolean boolean49 = coord21.estADistanceUn(coord45);
        fr.umontpellier.iut.algogen.Coord coord52 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str53 = coord52.toString();
        java.lang.String str54 = coord52.toString();
        fr.umontpellier.iut.algogen.Coord coord57 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord60 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int61 = coord57.distanceFrom(coord60);
        int int62 = coord57.getC();
        boolean boolean63 = coord52.estADistanceUn(coord57);
        java.lang.String str64 = coord57.toString();
        boolean boolean65 = coord21.equals((java.lang.Object) coord57);
        boolean boolean68 = coord57.estDansPlateau((-1), 32);
        int int69 = coord5.distanceFrom(coord57);
        fr.umontpellier.iut.algogen.Coord coord72 = new fr.umontpellier.iut.algogen.Coord(10, (-1));
        int int73 = coord57.distanceFrom(coord72);
        fr.umontpellier.iut.algogen.Coord coord76 = new fr.umontpellier.iut.algogen.Coord(10, 10);
        boolean boolean77 = coord72.equals((java.lang.Object) 10);
        int int78 = coord72.getL();
        int int79 = coord72.getL();
        int int80 = coord72.getL();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 101 + "'", int46 == 101);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "(0,-1)" + "'", str53, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "(0,-1)" + "'", str54, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "(0,-1)" + "'", str64, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 10 + "'", int73 == 10);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 10 + "'", int78 == 10);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 10 + "'", int79 == 10);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 10 + "'", int80 == 10);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, 22);
        java.lang.String str3 = coord2.toString();
        fr.umontpellier.iut.algogen.Coord coord6 = new fr.umontpellier.iut.algogen.Coord(65, 52);
        boolean boolean9 = coord6.estDansPlateau(21, (-1));
        fr.umontpellier.iut.algogen.Coord coord12 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord15 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int16 = coord12.distanceFrom(coord15);
        fr.umontpellier.iut.algogen.Coord coord19 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord22 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int23 = coord19.distanceFrom(coord22);
        boolean boolean24 = coord12.estADistanceUn(coord19);
        java.lang.String str25 = coord19.toString();
        int int26 = coord19.getC();
        int int27 = coord19.getL();
        int int28 = coord19.getC();
        int int29 = coord6.distanceFrom(coord19);
        boolean boolean30 = coord2.equals((java.lang.Object) coord19);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0,22)" + "'", str3, "(0,22)");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "(0,-1)" + "'", str25, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 118 + "'", int29 == 118);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int6 = coord2.distanceFrom(coord5);
        fr.umontpellier.iut.algogen.Coord coord9 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord12 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int13 = coord9.distanceFrom(coord12);
        fr.umontpellier.iut.algogen.Coord coord16 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord19 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int20 = coord16.distanceFrom(coord19);
        boolean boolean21 = coord9.estADistanceUn(coord16);
        boolean boolean22 = coord2.estADistanceUn(coord9);
        boolean boolean25 = coord9.estDansPlateau(0, (int) (short) 1);
        fr.umontpellier.iut.algogen.Coord coord28 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (byte) -1);
        boolean boolean29 = coord9.estADistanceUn(coord28);
        boolean boolean32 = coord28.estDansPlateau((int) (short) 100, (int) 'a');
        int int33 = coord28.getC();
        fr.umontpellier.iut.algogen.Coord coord36 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord39 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int40 = coord36.distanceFrom(coord39);
        int int41 = coord36.getL();
        fr.umontpellier.iut.algogen.Coord coord44 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord47 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int48 = coord44.distanceFrom(coord47);
        fr.umontpellier.iut.algogen.Coord coord51 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord54 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int55 = coord51.distanceFrom(coord54);
        boolean boolean56 = coord44.estADistanceUn(coord51);
        int int57 = coord51.getC();
        fr.umontpellier.iut.algogen.Coord coord60 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        int int61 = coord51.distanceFrom(coord60);
        boolean boolean63 = coord60.equals((java.lang.Object) 0);
        boolean boolean64 = coord36.estADistanceUn(coord60);
        fr.umontpellier.iut.algogen.Coord coord67 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str68 = coord67.toString();
        java.lang.String str69 = coord67.toString();
        fr.umontpellier.iut.algogen.Coord coord72 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord75 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int76 = coord72.distanceFrom(coord75);
        int int77 = coord72.getC();
        boolean boolean78 = coord67.estADistanceUn(coord72);
        java.lang.String str79 = coord67.toString();
        int int80 = coord67.getL();
        boolean boolean83 = coord67.estDansPlateau((int) (short) -1, (int) (short) 0);
        fr.umontpellier.iut.algogen.Coord coord86 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean89 = coord86.estDansPlateau((int) (byte) -1, (int) ' ');
        boolean boolean90 = coord67.estADistanceUn(coord86);
        boolean boolean91 = coord36.equals((java.lang.Object) coord86);
        int int92 = coord36.getC();
        int int93 = coord36.getC();
        int int94 = coord28.distanceFrom(coord36);
        java.lang.Class<?> wildcardClass95 = coord36.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 101 + "'", int61 == 101);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "(0,-1)" + "'", str68, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "(0,-1)" + "'", str69, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "(0,-1)" + "'", str79, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 1 + "'", int94 == 1);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 32);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord((int) ' ', (int) (short) 1);
        java.lang.Class<?> wildcardClass6 = coord5.getClass();
        boolean boolean7 = coord2.equals((java.lang.Object) coord5);
        java.lang.String str8 = coord2.toString();
        fr.umontpellier.iut.algogen.Coord coord11 = new fr.umontpellier.iut.algogen.Coord((int) ' ', 0);
        boolean boolean13 = coord11.equals((java.lang.Object) (-1L));
        fr.umontpellier.iut.algogen.Coord coord16 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str17 = coord16.toString();
        java.lang.String str18 = coord16.toString();
        fr.umontpellier.iut.algogen.Coord coord21 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord24 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int25 = coord21.distanceFrom(coord24);
        int int26 = coord21.getC();
        boolean boolean27 = coord16.estADistanceUn(coord21);
        java.lang.String str28 = coord21.toString();
        int int29 = coord21.getC();
        boolean boolean32 = coord21.estDansPlateau(1, 0);
        boolean boolean35 = coord21.estDansPlateau((int) (byte) 1, 0);
        boolean boolean36 = coord11.equals((java.lang.Object) coord21);
        java.lang.String str37 = coord21.toString();
        boolean boolean40 = coord21.estDansPlateau(11, (int) (short) 1);
        boolean boolean41 = coord2.estADistanceUn(coord21);
        fr.umontpellier.iut.algogen.Coord coord44 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (byte) -1);
        int int45 = coord44.getL();
        int int46 = coord44.getC();
        int int47 = coord44.getL();
        int int48 = coord44.getL();
        boolean boolean50 = coord44.equals((java.lang.Object) (-1L));
        fr.umontpellier.iut.algogen.Coord coord53 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        fr.umontpellier.iut.algogen.Coord coord56 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord59 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int60 = coord56.distanceFrom(coord59);
        int int61 = coord56.getL();
        int int62 = coord56.getC();
        int int63 = coord56.getL();
        boolean boolean64 = coord53.estADistanceUn(coord56);
        boolean boolean67 = coord53.estDansPlateau((int) (byte) -1, (int) ' ');
        boolean boolean68 = coord44.equals((java.lang.Object) boolean67);
        boolean boolean71 = coord44.estDansPlateau(102, 62);
        fr.umontpellier.iut.algogen.Coord coord74 = new fr.umontpellier.iut.algogen.Coord((int) (short) 10, 87);
        int int75 = coord44.distanceFrom(coord74);
        boolean boolean76 = coord2.estADistanceUn(coord44);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(100,32)" + "'", str8, "(100,32)");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(0,-1)" + "'", str17, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(0,-1)" + "'", str18, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "(0,-1)" + "'", str28, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "(0,-1)" + "'", str37, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 99 + "'", int75 == 99);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str3 = coord2.toString();
        java.lang.String str4 = coord2.toString();
        fr.umontpellier.iut.algogen.Coord coord7 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord10 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int11 = coord7.distanceFrom(coord10);
        int int12 = coord7.getC();
        boolean boolean13 = coord2.estADistanceUn(coord7);
        java.lang.String str14 = coord2.toString();
        java.lang.String str15 = coord2.toString();
        java.lang.String str16 = coord2.toString();
        fr.umontpellier.iut.algogen.Coord coord19 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        fr.umontpellier.iut.algogen.Coord coord22 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord25 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int26 = coord22.distanceFrom(coord25);
        int int27 = coord22.getL();
        int int28 = coord22.getC();
        int int29 = coord22.getL();
        boolean boolean30 = coord19.estADistanceUn(coord22);
        boolean boolean33 = coord19.estDansPlateau((int) (byte) -1, (int) ' ');
        fr.umontpellier.iut.algogen.Coord coord36 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean39 = coord36.estDansPlateau((int) (byte) -1, (int) ' ');
        boolean boolean42 = coord36.estDansPlateau((int) ' ', (int) (byte) 1);
        fr.umontpellier.iut.algogen.Coord coord45 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean46 = coord36.estADistanceUn(coord45);
        boolean boolean47 = coord19.estADistanceUn(coord36);
        fr.umontpellier.iut.algogen.Coord coord50 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord53 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int54 = coord50.distanceFrom(coord53);
        fr.umontpellier.iut.algogen.Coord coord57 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord60 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int61 = coord57.distanceFrom(coord60);
        boolean boolean62 = coord50.estADistanceUn(coord57);
        int int63 = coord57.getC();
        fr.umontpellier.iut.algogen.Coord coord66 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        int int67 = coord57.distanceFrom(coord66);
        boolean boolean69 = coord66.equals((java.lang.Object) 0);
        boolean boolean71 = coord66.equals((java.lang.Object) "(100,0)");
        boolean boolean72 = coord36.equals((java.lang.Object) "(100,0)");
        int int73 = coord2.distanceFrom(coord36);
        boolean boolean75 = coord2.equals((java.lang.Object) (byte) 100);
        java.lang.String str76 = coord2.toString();
        boolean boolean79 = coord2.estDansPlateau((int) (byte) 100, 201);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0,-1)" + "'", str3, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(0,-1)" + "'", str4, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(0,-1)" + "'", str14, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(0,-1)" + "'", str15, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(0,-1)" + "'", str16, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 101 + "'", int67 == 101);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 2 + "'", int73 == 2);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "(0,-1)" + "'", str76, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean5 = coord2.estDansPlateau((int) (byte) -1, (int) ' ');
        fr.umontpellier.iut.algogen.Coord coord8 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord11 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int12 = coord8.distanceFrom(coord11);
        boolean boolean14 = coord8.equals((java.lang.Object) (byte) 1);
        java.lang.String str15 = coord8.toString();
        boolean boolean16 = coord2.equals((java.lang.Object) coord8);
        fr.umontpellier.iut.algogen.Coord coord19 = new fr.umontpellier.iut.algogen.Coord(33, (int) (byte) 0);
        boolean boolean20 = coord2.estADistanceUn(coord19);
        int int21 = coord19.getC();
        int int22 = coord19.getC();
        fr.umontpellier.iut.algogen.Coord coord25 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 1, (int) '#');
        int int26 = coord19.distanceFrom(coord25);
        java.lang.String str27 = coord25.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(0,-1)" + "'", str15, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 67 + "'", int26 == 67);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(1,35)" + "'", str27, "(1,35)");
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(112, 10);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord8 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int9 = coord5.distanceFrom(coord8);
        boolean boolean11 = coord5.equals((java.lang.Object) (byte) 1);
        int int12 = coord5.getL();
        java.lang.String str13 = coord5.toString();
        fr.umontpellier.iut.algogen.Coord coord16 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        fr.umontpellier.iut.algogen.Coord coord19 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord22 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int23 = coord19.distanceFrom(coord22);
        int int24 = coord19.getL();
        int int25 = coord19.getC();
        int int26 = coord19.getL();
        boolean boolean27 = coord16.estADistanceUn(coord19);
        boolean boolean30 = coord16.estDansPlateau((int) '#', 1);
        int int31 = coord5.distanceFrom(coord16);
        fr.umontpellier.iut.algogen.Coord coord34 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean37 = coord34.estDansPlateau((int) (byte) -1, (int) ' ');
        boolean boolean40 = coord34.estDansPlateau((int) ' ', (int) (byte) 1);
        int int41 = coord34.getL();
        boolean boolean43 = coord34.equals((java.lang.Object) 33);
        boolean boolean44 = coord5.estADistanceUn(coord34);
        boolean boolean45 = coord2.estADistanceUn(coord5);
        boolean boolean48 = coord2.estDansPlateau(10, (int) ' ');
        boolean boolean51 = coord2.estDansPlateau(1, (int) (short) 0);
        java.lang.Class<?> wildcardClass52 = coord2.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(0,-1)" + "'", str13, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) (byte) -1, 54);
        int int3 = coord2.getL();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) '4', 76);
        java.lang.Class<?> wildcardClass3 = coord2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 1, (-1));
        int int3 = coord2.getC();
        boolean boolean6 = coord2.estDansPlateau(97, 0);
        fr.umontpellier.iut.algogen.Coord coord9 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        fr.umontpellier.iut.algogen.Coord coord12 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord15 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int16 = coord12.distanceFrom(coord15);
        int int17 = coord12.getL();
        int int18 = coord12.getC();
        int int19 = coord12.getL();
        boolean boolean20 = coord9.estADistanceUn(coord12);
        int int21 = coord9.getL();
        boolean boolean22 = coord2.equals((java.lang.Object) coord9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(10, 21);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 1, (int) '#');
        fr.umontpellier.iut.algogen.Coord coord8 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord11 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int12 = coord8.distanceFrom(coord11);
        fr.umontpellier.iut.algogen.Coord coord15 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord18 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int19 = coord15.distanceFrom(coord18);
        fr.umontpellier.iut.algogen.Coord coord22 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord25 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int26 = coord22.distanceFrom(coord25);
        boolean boolean27 = coord15.estADistanceUn(coord22);
        boolean boolean28 = coord8.estADistanceUn(coord15);
        boolean boolean31 = coord15.estDansPlateau(0, (int) (short) 1);
        fr.umontpellier.iut.algogen.Coord coord34 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (byte) -1);
        boolean boolean35 = coord15.estADistanceUn(coord34);
        boolean boolean36 = coord5.equals((java.lang.Object) boolean35);
        fr.umontpellier.iut.algogen.Coord coord39 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (byte) -1);
        boolean boolean42 = coord39.estDansPlateau((int) ' ', (int) 'a');
        fr.umontpellier.iut.algogen.Coord coord45 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord48 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int49 = coord45.distanceFrom(coord48);
        fr.umontpellier.iut.algogen.Coord coord52 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord55 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int56 = coord52.distanceFrom(coord55);
        boolean boolean57 = coord45.estADistanceUn(coord52);
        int int58 = coord52.getC();
        fr.umontpellier.iut.algogen.Coord coord61 = new fr.umontpellier.iut.algogen.Coord((int) (byte) 100, 0);
        int int62 = coord52.distanceFrom(coord61);
        boolean boolean63 = coord39.estADistanceUn(coord52);
        int int64 = coord5.distanceFrom(coord39);
        int int65 = coord2.distanceFrom(coord39);
        int int66 = coord2.getC();
        fr.umontpellier.iut.algogen.Coord coord69 = new fr.umontpellier.iut.algogen.Coord(203, (int) ' ');
        boolean boolean70 = coord2.estADistanceUn(coord69);
        java.lang.Class<?> wildcardClass71 = coord2.getClass();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 101 + "'", int62 == 101);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 38 + "'", int64 == 38);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 33 + "'", int65 == 33);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 21 + "'", int66 == 21);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(133, 20);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(133, 33);
        boolean boolean5 = coord2.estDansPlateau(68, 90);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(152, 11);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(69, 214);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(21, 20);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(135, (int) (short) 10);
        java.lang.String str3 = coord2.toString();
        fr.umontpellier.iut.algogen.Coord coord6 = new fr.umontpellier.iut.algogen.Coord((int) '4', (int) (short) -1);
        int int7 = coord6.getC();
        fr.umontpellier.iut.algogen.Coord coord10 = new fr.umontpellier.iut.algogen.Coord((int) ' ', (int) (short) 1);
        int int11 = coord10.getL();
        boolean boolean12 = coord6.estADistanceUn(coord10);
        fr.umontpellier.iut.algogen.Coord coord15 = new fr.umontpellier.iut.algogen.Coord(1, (int) '4');
        boolean boolean16 = coord6.estADistanceUn(coord15);
        boolean boolean17 = coord2.equals((java.lang.Object) coord15);
        int int18 = coord15.getL();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(135,10)" + "'", str3, "(135,10)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) (short) 100, 21);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(1, (-1));
        fr.umontpellier.iut.algogen.Coord coord8 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) 0);
        fr.umontpellier.iut.algogen.Coord coord11 = new fr.umontpellier.iut.algogen.Coord(10, (int) (short) 10);
        boolean boolean12 = coord8.estADistanceUn(coord11);
        boolean boolean13 = coord5.equals((java.lang.Object) coord8);
        boolean boolean14 = coord2.equals((java.lang.Object) boolean13);
        fr.umontpellier.iut.algogen.Coord coord17 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord20 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int21 = coord17.distanceFrom(coord20);
        fr.umontpellier.iut.algogen.Coord coord24 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord27 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int28 = coord24.distanceFrom(coord27);
        fr.umontpellier.iut.algogen.Coord coord31 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord34 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int35 = coord31.distanceFrom(coord34);
        boolean boolean36 = coord24.estADistanceUn(coord31);
        boolean boolean37 = coord17.estADistanceUn(coord24);
        fr.umontpellier.iut.algogen.Coord coord40 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str41 = coord40.toString();
        java.lang.String str42 = coord40.toString();
        fr.umontpellier.iut.algogen.Coord coord45 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord48 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int49 = coord45.distanceFrom(coord48);
        int int50 = coord45.getC();
        boolean boolean51 = coord40.estADistanceUn(coord45);
        java.lang.String str52 = coord40.toString();
        int int53 = coord40.getL();
        boolean boolean54 = coord24.equals((java.lang.Object) int53);
        fr.umontpellier.iut.algogen.Coord coord57 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        fr.umontpellier.iut.algogen.Coord coord60 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord63 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int64 = coord60.distanceFrom(coord63);
        int int65 = coord60.getL();
        int int66 = coord60.getC();
        int int67 = coord60.getL();
        boolean boolean68 = coord57.estADistanceUn(coord60);
        boolean boolean69 = coord24.estADistanceUn(coord60);
        boolean boolean72 = coord60.estDansPlateau(70, 80);
        boolean boolean73 = coord2.estADistanceUn(coord60);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "(0,-1)" + "'", str41, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "(0,-1)" + "'", str42, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "(0,-1)" + "'", str52, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(457, 33);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord((int) 'a', 32);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord((int) ' ', 0);
        boolean boolean7 = coord5.equals((java.lang.Object) (-1L));
        fr.umontpellier.iut.algogen.Coord coord10 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord13 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int14 = coord10.distanceFrom(coord13);
        int int15 = coord10.getC();
        java.lang.String str16 = coord10.toString();
        int int17 = coord10.getL();
        int int18 = coord5.distanceFrom(coord10);
        fr.umontpellier.iut.algogen.Coord coord21 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        boolean boolean23 = coord21.equals((java.lang.Object) 'a');
        fr.umontpellier.iut.algogen.Coord coord26 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str27 = coord26.toString();
        java.lang.String str28 = coord26.toString();
        fr.umontpellier.iut.algogen.Coord coord31 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord34 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int35 = coord31.distanceFrom(coord34);
        int int36 = coord31.getC();
        boolean boolean37 = coord26.estADistanceUn(coord31);
        int int38 = coord21.distanceFrom(coord26);
        int int39 = coord5.distanceFrom(coord21);
        boolean boolean40 = coord2.estADistanceUn(coord21);
        fr.umontpellier.iut.algogen.Coord coord43 = new fr.umontpellier.iut.algogen.Coord(1, 10);
        int int44 = coord43.getL();
        boolean boolean47 = coord43.estDansPlateau((int) (byte) 100, 2);
        fr.umontpellier.iut.algogen.Coord coord50 = new fr.umontpellier.iut.algogen.Coord(65, 52);
        boolean boolean51 = coord43.equals((java.lang.Object) coord50);
        int int52 = coord2.distanceFrom(coord43);
        int int53 = coord43.getL();
        fr.umontpellier.iut.algogen.Coord coord56 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord59 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int60 = coord56.distanceFrom(coord59);
        int int61 = coord56.getC();
        fr.umontpellier.iut.algogen.Coord coord64 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        java.lang.String str65 = coord64.toString();
        java.lang.String str66 = coord64.toString();
        boolean boolean67 = coord56.estADistanceUn(coord64);
        int int68 = coord56.getL();
        int int69 = coord43.distanceFrom(coord56);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(0,-1)" + "'", str16, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 33 + "'", int18 == 33);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(0,-1)" + "'", str27, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "(0,-1)" + "'", str28, "(0,-1)");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 33 + "'", int39 == 33);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 118 + "'", int52 == 118);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "(0,-1)" + "'", str65, "(0,-1)");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "(0,-1)" + "'", str66, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 12 + "'", int69 == 12);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        fr.umontpellier.iut.algogen.Coord coord2 = new fr.umontpellier.iut.algogen.Coord(118, 69);
        fr.umontpellier.iut.algogen.Coord coord5 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) 0);
        int int6 = coord5.getC();
        boolean boolean9 = coord5.estDansPlateau((int) (byte) 0, 33);
        int int10 = coord5.getL();
        fr.umontpellier.iut.algogen.Coord coord13 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean16 = coord13.estDansPlateau((int) (byte) -1, (int) ' ');
        int int17 = coord13.getC();
        int int18 = coord13.getC();
        int int19 = coord13.getL();
        int int20 = coord13.getL();
        int int21 = coord5.distanceFrom(coord13);
        int int22 = coord13.getL();
        fr.umontpellier.iut.algogen.Coord coord25 = new fr.umontpellier.iut.algogen.Coord((int) ' ', 0);
        boolean boolean27 = coord25.equals((java.lang.Object) (-1L));
        boolean boolean30 = coord25.estDansPlateau((int) (byte) 10, 100);
        int int31 = coord13.distanceFrom(coord25);
        fr.umontpellier.iut.algogen.Coord coord34 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) 0);
        int int35 = coord34.getC();
        boolean boolean38 = coord34.estDansPlateau((int) (byte) 0, 33);
        int int39 = coord34.getL();
        fr.umontpellier.iut.algogen.Coord coord42 = new fr.umontpellier.iut.algogen.Coord((int) (short) -1, (int) (short) 0);
        boolean boolean45 = coord42.estDansPlateau((int) (byte) -1, (int) ' ');
        int int46 = coord42.getC();
        int int47 = coord42.getC();
        int int48 = coord42.getL();
        int int49 = coord42.getL();
        int int50 = coord34.distanceFrom(coord42);
        int int51 = coord42.getL();
        fr.umontpellier.iut.algogen.Coord coord54 = new fr.umontpellier.iut.algogen.Coord((int) ' ', 0);
        boolean boolean56 = coord54.equals((java.lang.Object) (-1L));
        boolean boolean59 = coord54.estDansPlateau((int) (byte) 10, 100);
        int int60 = coord42.distanceFrom(coord54);
        int int61 = coord13.distanceFrom(coord42);
        int int62 = coord13.getC();
        fr.umontpellier.iut.algogen.Coord coord65 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord68 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int69 = coord65.distanceFrom(coord68);
        fr.umontpellier.iut.algogen.Coord coord72 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        fr.umontpellier.iut.algogen.Coord coord75 = new fr.umontpellier.iut.algogen.Coord(0, (int) (short) -1);
        int int76 = coord72.distanceFrom(coord75);
        boolean boolean77 = coord65.estADistanceUn(coord72);
        java.lang.String str78 = coord72.toString();
        boolean boolean79 = coord13.equals((java.lang.Object) str78);
        java.lang.String str80 = coord13.toString();
        boolean boolean81 = coord2.equals((java.lang.Object) str80);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 33 + "'", int31 == 33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 33 + "'", int60 == 33);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "(0,-1)" + "'", str78, "(0,-1)");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "(-1,0)" + "'", str80, "(-1,0)");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }
}

