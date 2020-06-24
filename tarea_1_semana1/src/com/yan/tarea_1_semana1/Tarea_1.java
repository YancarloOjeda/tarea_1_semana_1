package com.yan.tarea_1_semana1;

public class Tarea_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] miArray = new int[4][4];
		int aux = 2;
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j<4; j++) {
				miArray[i][j] = aux;
				aux = aux + 2;
			}
		}
		
		
		for(int[] row : miArray) {
            printRow(row);
        }
		
		
	}
	
	
	public static void printRow(int[] row) {
        for (int i : row) {
            System.out.print(i);
            System.out.print("\t");
        }
        System.out.println();
    }

}
