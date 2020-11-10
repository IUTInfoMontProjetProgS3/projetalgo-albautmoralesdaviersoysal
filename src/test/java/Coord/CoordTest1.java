package Coord;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import fr.umontpellier.iut.algogen.Coord;

public class CoordTest1 {

	@Test
	public void testEstDansPlateau() throws Exception {
		int nbL=10,nbC=10;
		int nbL1=40,nbC1=40;
		int nbL2=50,nbC2=50;
		assertTrue(new Coord(0,0).estDansPlateau(nbL,nbC));
		assertTrue(new Coord(5,5).estDansPlateau(nbL,nbC));
		assertTrue(new Coord(9,9).estDansPlateau(nbL,nbC));
		assertTrue(new Coord(0,0).estDansPlateau(nbL1,nbC1));
		assertTrue(new Coord(20,20).estDansPlateau(nbL1,nbC1));
		assertTrue(new Coord(39,39).estDansPlateau(nbL1,nbC1));
		assertTrue(new Coord(0,0).estDansPlateau(nbL2,nbC2));
		assertTrue(new Coord(35,25).estDansPlateau(nbL2,nbC2));
		assertTrue(new Coord(49,49).estDansPlateau(nbL2,nbC2));
	}

	@Test
	public void testEstADistanceUn() throws Exception {
		int l=0,c=1;
		int l1=1,c1=0;
		Coord coor= new Coord(0,0);
		assertTrue(coor.estADistanceUn(new Coord(l,c)));
		assertTrue(coor.estADistanceUn(new Coord(l1,c1)));
		
	}

	@Test
	public void testDistanceFrom() throws Exception {
		Coord start= new Coord(0,0);
		Coord end= new Coord(10,10);
		assertEquals(20,start.distanceFrom(end));

	}

}
