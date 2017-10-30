package arrays;

public class MaxPlatform3x3 {

	public static void main(String[] args) {
		int[][] matrix = {
				{0,2,4,0,9,5,6},
				{7,1,3,3,2,1,9},
				{1,3,9,8,5,6,2},
				{4,6,7,9,1,0,4},
				{2,8,7,9,1,3,5}
		};
		int bestsum = 0;
		int bestRow = 0;
		int bestCol = 0;
		for (int row = 0; row < matrix.length-2; row++) {
			for (int col = 0; col < matrix[0].length-2; col++) {
				if(matrix[row][col]+ matrix[row][col+1] + matrix[row][col+2]+
						matrix[row+1][col]+matrix[row+1][col+1]+matrix[row+1][col+2]+
						matrix[row+2][col]+matrix[row+2][col+1]+matrix[row+2][col+2]>bestsum){
					bestsum = matrix[row][col]+ matrix[row][col+1] + matrix[row][col+2]+matrix[row+1][col]+matrix[row+1][col+1]+matrix[row+1][col+2]+matrix[row+2][col]+matrix[row+2][col+1]+matrix[row+2][col+2];
					bestRow=row;
					bestCol =col;	
				}
			
				
			}
			
		}
		for(int i =bestRow ; i<bestRow+3;i++){
			for(int j = bestCol ; j<bestCol+3;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(bestsum);

	}

}
