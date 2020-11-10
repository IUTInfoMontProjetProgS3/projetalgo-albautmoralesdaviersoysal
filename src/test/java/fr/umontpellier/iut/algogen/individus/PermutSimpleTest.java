package fr.umontpellier.iut.algogen.individus;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;

import fr.umontpellier.iut.algogen.Coord;
import fr.umontpellier.iut.algogen.Instance;
import fr.umontpellier.iut.algogen.fabriques.CreationIndividuPermut;

public class PermutSimpleTest {

	
	@Test
	public void testCalculerCroisement() throws Exception {
		 boolean[][] p4 = new boolean[10][10];
	        for (int i = 0; i < p4.length; i++) {
	            for (int j = 0; j < p4[0].length; j+=2) {
	                
	                    p4[i][j] = true;
	                
	            }
	        }
	        Coord sp4 = new Coord(9, 5);
	        int k4 = p4.length * p4.length / 10;
	        Instance in4 = new Instance(p4, sp4, k4);
	        CreationIndividuPermut cr = new CreationIndividuPermut();
	        ArrayList<PermutSimple> individu = cr.creerPopInit(in4, 2);
	        individu.get(0).permut.clear();
	        individu.get(1).permut.clear();
	        individu.get(0).permut= new ArrayList<>(Arrays.asList(19, 36, 40, 23, 30, 10, 22, 9, 44, 24, 31, 39, 0, 29, 45, 13, 46, 38, 25, 17, 12, 28, 1, 49, 15, 20, 6, 11, 41, 42, 2, 33, 3, 7, 35, 26, 37, 4, 43, 32, 18, 48, 14, 8, 5, 27, 47, 34, 21, 16));
	        individu.get(1).permut= new ArrayList<>(Arrays.asList(6, 36, 3, 23, 41, 24, 37, 17, 44, 38, 20, 42, 0, 25, 33, 30, 39, 31, 21, 11, 10, 28, 18, 48, 27, 49, 29, 2, 47, 46, 22, 12, 8, 40, 4, 13, 1, 9, 7, 43, 34, 15, 19, 16, 14, 45, 26, 5, 32, 35));
	        PermutSimple result = individu.get(1).calculerCroisement(individu.get(0));
			assertFalse(Collections.disjoint(result.permut, individu.get(0).permut));
			assertFalse(Collections.disjoint(result.permut, individu.get(1).permut));	        
	}

	@Test
	public void testCalculerMutation() throws Exception {
		 boolean[][] p4 = new boolean[10][10];
	        for (int i = 0; i < p4.length; i++) {
	            for (int j = 0; j < p4[0].length; j+=2) {
	                
	                    p4[i][j] = true;
	                
	            }
	        }
	        Coord sp4 = new Coord(9, 5);
	        int k4 = p4.length * p4.length / 10;
	        Instance in4 = new Instance(p4, sp4, k4);
	        CreationIndividuPermut cr = new CreationIndividuPermut();
	        ArrayList<PermutSimple> individu = cr.creerPopInit(in4, 2);
	        individu.get(0).permut.clear();
	        individu.get(1).permut.clear();
	        individu.get(0).permut= new ArrayList<>(Arrays.asList(19, 36, 40, 23, 30, 10, 22, 9, 44, 24, 31, 39, 0, 29, 45, 13, 46, 38, 25, 17, 12, 28, 1, 49, 15, 20, 6, 11, 41, 42, 2, 33, 3, 7, 35, 26, 37, 4, 43, 32, 18, 48, 14, 8, 5, 27, 47, 34, 21, 16));
	        individu.get(1).permut= new ArrayList<>(Arrays.asList(6, 36, 3, 23, 41, 24, 37, 17, 44, 38, 20, 42, 0, 25, 33, 30, 39, 31, 21, 11, 10, 28, 18, 48, 27, 49, 29, 2, 47, 46, 22, 12, 8, 40, 4, 13, 1, 9, 7, 43, 34, 15, 19, 16, 14, 45, 26, 5, 32, 35));
			PermutSimple result = null;
			PermutSimple result1 = null;

		ArrayList<Boolean> equals = new ArrayList<>();
		ArrayList<Boolean> equals1 = new ArrayList<>();

		for (int i = 0; i < 30; i++) {
			result = individu.get(0).calculerMutation();
			result1 = individu.get(1).calculerMutation();
			equals.add(result.equals(individu.get(0)));

			equals1.add(result1.equals(individu.get(1)));
		}
		assertNotEquals(30, Collections.frequency(equals, true));
		assertNotEquals(30, Collections.frequency(equals1, true));

		assertFalse(Collections.disjoint(result.permut, individu.get(0).permut));
		assertFalse(Collections.disjoint(result.permut, individu.get(1).permut));

	}

}
