package advance1;

public class Assignment2 {
    public static void main(String[] args) {

        int[] employeeNum = {1, 2, 3, 4, 5};
        double[] cus1Fedd = {4, 5, 3, 4, 1};
        double[] cus2Feed = {5, 3, 4, 2, 5};
        double[] cus3Feed = {4, 5, 3, 5, 1};
        float[] averageFeed = new float[5];
        char[] grade = new char[5];

        double sum = 0;
        float average = 0;
        for (int i = 0; i < cus1Fedd.length; i++) {
            sum = cus1Fedd[i] + cus2Feed[i] + cus3Feed[i];
            average = (float) sum / 3;
            averageFeed[i] = average;
        }

        for (int i = 0; i < averageFeed.length; i++) {
            if (averageFeed[i] > 4) {
                grade[i] = 'A';
            } else if (averageFeed[i] > 3 || averageFeed[i] < 4) {
                grade[i] = 'B';
            } else {
                grade[i] = 'C';
            }
        }

        for (int i = 0; i < employeeNum.length; i++) {
            for (int j = i; j < averageFeed.length; j++) {
                for (int k = j; k < grade.length; k++) {
                    System.out.println("Employee id : " + employeeNum[i] + "\n" +
                            "Employee average : " + averageFeed[j] + "\n" +
                            "Employee grade : " + grade[k]);

                    System.out.println();
                    j++;
                    i++;
                }
            }
        }


    }
}
