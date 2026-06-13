public class searchmatrics {
    public static void main(String[] args) {

        int[][] matrix = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };

        int key = 29;

        int row = 0;
        int col = matrix[0].length - 1;

        boolean found = false;

        while (row < matrix.length && col >= 0) {

            if (matrix[row][col] == key) {
                System.out.println("Element found at (" + row + ", " + col + ")");
                found = true;
                break;
            }
            else if (matrix[row][col] > key) {
                col--;
            }
            else {
                row++;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }
}
