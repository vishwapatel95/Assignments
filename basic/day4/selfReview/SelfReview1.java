package basic.day4.selfReview;

public class SelfReview1 {

    private int num;
    public void setNum(int val){
        num = val;
    }
    public int getNum(){
        return num;
    }
    public void display(){
        System.out.println("Number :"+num);
    }
}


class Child extends SelfReview1{
    private int val;

    public void setVal(int num){
        val = num;
    }
    public int getVal(){
        return val;
    }
    public void display(){
        System.out.println("Number :"+getNum());
        System.out.println("Value :"+val);
    }
}


class CourseMgmt{
    public static void main(String args[]){
        Child child;
        child = new Child();
        child.setNum(100);
        child.setVal(200);
        child.display();
    }
}