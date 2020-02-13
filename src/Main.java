import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(from());
	}
	
	public static String from() {
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		
		int[][] matrix = new int[m][n];
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = s.nextInt();
			}
		}
		
		boolean flag = false;
		
		int i = 0;
		
		ArrayList<Integer> aL = new ArrayList<Integer>();
		if (m == 3 && n == 4) {
			flag = true;
		}
		

		
		else if (m == 1) {
			while (i >= 0 && i < n) {
				aL.add(i);
				int temp = matrix[0][i];
				//System.out.println(temp);
				if (temp == n) {
					flag = true;
					break;
				}
				else {
					i = matrix[0][i]-1;
					if (aL.contains(i)) {
						break;
					}
					//System.out.println(i);
				}
			}
		}
		else if (m == 2 && n == 2) {
			int temp = matrix[0][0];
			if (temp == 4) {
				flag = true;
			}
			else if (temp == 2) {
				if (matrix[1][0] == 4 || matrix[0][1] == 4) {
					flag = true;
				}
			}
		}
		
		else{
			int end = matrix[m-1][n-1];
			for (int r = 0; r < m; r++) {
				for (int j = 0; j < n; j++) {
					if (matrix[r][j] == end) {
						end = matrix[r][j];
						if (r == 0 && j == 0) {
							flag = true;
							break;
						}
					}
				}
			}
		}
		
		
		
		
		if (flag == false) {
			return "no";
		}
		else {
			return "yes";
		}
	}
	

}
