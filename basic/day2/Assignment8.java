package basic.day2;

public class Assignment8 {
    static int i=22;
    static int j=14000;
    static boolean k;
    static boolean l;
    public static void main(String args[]) {
        i = 22;
        j = 14000;
        Assignment8 class1 = new Assignment8();
        k = class1.method1(i);
        l = class1.method2(j);
        if (k == true && l == true) {
            System.out.print(" Is a new employee");
        } else {
            System.out.print(" Is not a new employee");
        }
    }

    public boolean method1(int i) {
        if (i > 20 && i < 30) {
            return true;
        } else {
            return false;
        }
    }

    public boolean method2(int j)
    {
        if (j>=14000 && j<20000)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

