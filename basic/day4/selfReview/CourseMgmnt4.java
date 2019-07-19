package basic.day4.selfReview;

class Parent{
    private int num;
    Parent(int num){
        this.num = num;
    }
    public int getNum(){
        return num;
    }

}
class Child4 extends Parent{
    private int val;
    Child4(int num,int val){
// To invoke super class constructor
        super(num);
        this.val = val;
    }
    public int getVal(){
        return val;
    }
}
class CourseMgmt4{
    public static void main(String args[]){
        Child4 child;
        child = new Child4(100, 200);
        System.out.println("Parent: Num:" + child.getNum());
        System.out.println("Child: Val:" + child.getVal());

    }
}
