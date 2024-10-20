
public class PascalsTriangle {

	public static int[][] createPascalTriangle(int rows) {
		int[][] pt = new int[rows][];
		for (int i = 0; i < rows; i++) {
            pt[i] = new int[i + 1];
            pt[i][0] = 1; 
            pt[i][i] = 1; 

            for (int j = 1; j < i; j++) {
                pt[i][j] = pt[i - 1][j - 1] + pt[i - 1][j];
            }
        }

        return pt;
	}
	
	public static void main(String[] args) {
		int rows = Integer.parseInt(args[0]);
	
		int[][] triangle = createPascalTriangle(rows);
		
		// iterate over the triangle variable to print out
		// the pascal's triangle.
		for(int i = 0;i<rows;i++){
			for(int j = 0;j<=i;j++){
				System.out.print(triangle[i][j] + " ");
			}
			System.out.println();
		}
	}

}
