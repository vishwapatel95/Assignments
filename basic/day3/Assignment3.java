package basic.day3;

public class Assignment3 {
    public static void main(String[] args) {
        String jArray[][]=new String[4][];

        //First row has 4 colomns
        jArray[0]=new String[4];
        jArray[0][1]="Tony";
        jArray[0][2]="java";
        jArray[0][3]="C";
        jArray[0][0]="C++";


        //second
        jArray[1]=new String[3];
        jArray[1][0]="Thomas";
        jArray[1][1]="Unix";
        jArray[1][2]="Java";


        //third
        jArray[2]=new String[3];
        jArray[2][0]="Daniel";

        jArray[2][1]="Linux";
        jArray[2][2]="Oracle";
        //forth
        jArray[3]=new String[4];
        jArray[3][0]="Dalvin";
        jArray[3][1]="Linux";
        jArray[3][2]="oracle";
        jArray[3][3]="RDBMS";



        for(int i=0;i<jArray.length;i++)
        {
            for(int j=0;j<jArray[i].length;j++)
            {
                System.out.print("  "+jArray[i][j]);
            }

            System.out.println("");
        }
    }
}
