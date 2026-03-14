public class BinaryTriangle {
    public static void main(String[] args) {
        int rows = 6; // Total number of rows required by the prompt

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                // The secret logic: if row + column is even, print 1. Else print 0.
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            // Move to the next line after finishing the row
            System.out.println();
        }
    }
}