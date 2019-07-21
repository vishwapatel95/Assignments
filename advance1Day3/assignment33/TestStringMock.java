package advance1Day3.assignment33;

public class TestStringMock {
    public static void main(String[] args) {
        String message = "What's in the main?";
        StringMock stringMock = new StringMock("2");
        System.out.println(stringMock.search(message,'i'));

        System.out.println(stringMock.search(message,'V'));

    }
}
