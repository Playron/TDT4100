package Oving4;

import java.util.Scanner;

public class SudokuBrett {

	int[][] brett = new int[9][9];
	
	public SudokuBrett(int[][] brett) {
		this.brett = brett;
		for(int i = 0; i < 9; i++) {
			System.out.print("| ");
			for(int j = 0; j<9; j++) {
				System.out.print(brett[i][j] + " | ");
			}
			System.out.println();
		}
	}
	
	public static void printBoard(int[][] brett) {
		
		System.out.println("-------------------------------------");
		for(int i = 0; i < 9; i++) {
			System.out.print("| ");
			for(int j = 0; j<9; j++) {
				System.out.print(brett[i][j] + " | ");
			}
			System.out.println();
		}
	}
	
	
	public void plasserTall() {
		int rad; int kol; int tall;
		Scanner sc = new Scanner(System.in);
		System.out.println("Hvilken kolonne vil du plassere tallet? ");
		rad = sc.nextInt();
		System.out.println("Hvilken rad vil du plassere tallet på?");
		kol = sc.nextInt();
		System.out.println("Hvilket tall vil du plassere?");
		tall = sc.nextInt();
		this.brett[rad][kol] = tall;
		sc.close();
	}
	
	
	
	public static void main(String[] args) {
		int[][] brett = new int[9][9];
		SudokuBrett b1 = new SudokuBrett(brett);
		brett[1][2] = 3;
		printBoard(brett);
		b1.plasserTall();
		printBoard(brett);
		
	}
	
	
}
