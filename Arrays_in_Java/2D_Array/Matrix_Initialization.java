public class Matrix_Initialization {
    public static void main(String[] args) {
        int i,j;
        int[][] arr = { {1,2},
                        {1,2}
                        };
        System.out.println("Matrix : ");
        for(i = 0; i < arr.length; i++){
            for(j = 0; j < arr[0].length; j++){
                System.out.format("%3d",arr[i][j]);
            }
            System.out.println();
        }
    }
}
