package basic.day3.selfReview;

public class Selfreview4 {
    static int count=10;
    Selfreview4(){
        count++;
    }
    static void display(){
        System.out.println(count);
    }
    static{
        System.out.println("Static Block written Before Main");
    }
    public static void main(String args[]){
        Selfreview4 t1=new Selfreview4();
        Selfreview4 t2=new Selfreview4();
        Selfreview4.display();
        t2.display();
    }
    static{
        System.out.println("Static Block written After Main");
    }
}
