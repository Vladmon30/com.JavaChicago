package day31_NewArrays;

import java.util.Arrays;

public class Shows {
	public static void main(String[] args) {

		/*
		 * Write a program that has the following array of string called "shows" Game of
		 * throne, Friends, Prison Break, Doctor Who, Greys Anatomy Sort it and print
		 * them in the folowing format 
		 * output: 
		 * Sorted list of shows: 
		 * #0 Doctor Who 
		 * #1 Friends 
		 * #2 Game of throne 
		 * #3 Greys Anatomy 
		 * #4 Prison break
		 */

		String[] shows = { "Game of throne", "Friends", "Prison Break", "Doctor Who", "Greys Anatomy" };
		Arrays.sort(shows);
		System.out.println("Sorted list of shows:");
		for (int i = 0; i < shows.length; i++) {
			System.out.println("#" + i + "" + shows[i]);
		}
	}
}
