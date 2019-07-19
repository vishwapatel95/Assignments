package basic.day3;

public class Assignment2 {
    public static void main(String[] args) {
        int firstArrayMatrix[][] = {{1, 1, 1}, {1, 1, 1}};
        int secondArrayMatrix[][] = {{2, 2, 2}, {2, 2, 2}};
        int[][] ans = new int[3][3];

        //Dispay matrix 1
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(firstArrayMatrix[i][j]);
            }
            System.out.println("");
        }
        System.out.println("Second matrics");
        //Dispay second matrics
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(secondArrayMatrix[i][j]);
            }
            System.out.println("");
        }


        for (int i = 0; i < 2; i++) {
            for (int j = 0; j <= 2; j++) {
                ans[i][j] = firstArrayMatrix[i][j] + secondArrayMatrix[i][j];
            }
        }

        //Displaying Addition of mattixs
        System.out.println("Addition of matrics");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(ans[i][j]);
            }
            System.out.println("");
        }

    }
}