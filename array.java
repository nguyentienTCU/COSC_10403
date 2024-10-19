public class array {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        int value = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = value;
                System.out.print(matrix[i][j]+" ");
                value++;
                
            }
            System.out.println();
        }
    }
}
 //comment