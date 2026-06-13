public class largestelement {
    public static void main(String[] args) {

        int[][] matrix = {
            {12, 45, 7},
            {89, 34, 56},
            {23, 90, 11}
        };

        int max = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }

        System.out.println("Maximum element = " + max);
    }
}