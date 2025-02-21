
package view;

public class Ex02 {
    public static void main(String[] args) {
        
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {1, 9, 0, 9},
            {2, 3, 4, 5}
        };
        System.out.println("Mảng trước khi chuyển");
        for(int[] row : matrix){
            for(int cell : row){
                System.out.print(cell+" ");
            }
            System.out.println();
        }
        System.out.println("Mảng sau khi chuyển");
        transforMatrix(matrix);
        for(int[] row : matrix){
            for(int cell : row){
                System.out.print(cell+" ");
            }
            System.out.println();
        }
    }
    
    private static void transforMatrix(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;
        int zeroRow = - 1, zeroCol = -1;
        
        for(int i = 0 ; i < row; i++){
            for(int j = 0 ; j < col ; j++){
                if(matrix[i][j] == 0){
                    zeroCol = j;
                    zeroRow = i;
                    break;
                }
            }
            if(zeroRow != -1) break;
        }
        if(zeroRow == -1) return;
        
        for(int j = 0 ; j < col ; j++){
            matrix[zeroRow][j] = 0;
        }
        for(int i = 0 ; i < row; i++){
            matrix[i][zeroCol] = 0;
        }
    }
}
