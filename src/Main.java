import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.RowFilter;

public class Main {

	public static void main(String[] args) {
		List<List<Integer>> lista = new ArrayList<>();

		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Número de linhas:");
			int numRows = Integer.parseInt(in.nextLine());
			if(numRows >= 1 && numRows <= 30) {
				for(int i = 0; i < numRows; i++) {
					List<Integer> row =  new ArrayList<Integer>();
					for(int j = 0; j <= i; j++) {
						if(j == 0 || j == i) {
							row.add(1);
							if(j==i) {
								System.out.print(row);
							}
						}else {
							row.add(lista.get(i-1).get(j-1) + lista.get(i-1).get(j));
						}
					}
					lista.add(row);
					System.out.println();
				}
			}else {
				System.out.println(" de 1 a 30");
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
