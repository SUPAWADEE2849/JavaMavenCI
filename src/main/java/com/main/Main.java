/**
 * 
 */
package com.main;

import java.util.Scanner;

/**
 * @author Dell
 *
 */
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int score = in.nextInt();
		
		Calculate cal = new Calculate();
		cal.setScore(score);
		
		System.out.println(cal.CalculateGrade());
	}

}
