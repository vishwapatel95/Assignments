package basic.day5.selfReview;

interface Count{
    short counter = 0;
    void countUp();
}
public class TestCount implements Count {
    public static void main(String[] args) {
        TestCount testCount = new TestCount();
        testCount.countUp();
    }

    @Override
    public void countUp() {
        for (int x=6;x>counter;x--){
            System.out.println(" "+counter);
        }
    }
}
