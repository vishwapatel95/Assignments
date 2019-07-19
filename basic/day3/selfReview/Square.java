package basic.day3.selfReview;

class thisExample{
    public static void main(String[] args) {
        Square square = new Square();
        square.display(5);
        int area = square.calculateArea();

        System.out.println("The area of square is : " +area);
    }
}


public class Square {
    int length;
    void display(int length){
        this.length = length;
    }

    int calculateArea(){
        return (length * length);
    }
}
