package advance1Day2.assignment1314;

public class WellsBank {
    public static void main(String[] args) {
        Customer john = new Customer(1, "JOHN", "Irving", 91776);
        SavingsAccount johnSA = new SavingsAccount(101, john, 1000);

        Customer jenny = new Customer(2, "Jenny", "Austin", 91776);

        OverDraftAccount jennyOA = new OverDraftAccount(201, jenny, 500, 2000);
        jennyOA.deposit(1500);
        System.out.println("Eligibility amount is "+jennyOA.getEligiblityAmount());;
        jennyOA.withDraw(1000);

        System.out.println("Eligibility amount is "+jennyOA.getEligiblityAmount());;
        jennyOA.withDraw(1000);

        System.out.println("Eligibility amount is "+jennyOA.getEligiblityAmount());;
        jennyOA.withDraw(1000);

        System.out.println("Eligibility amount is "+jennyOA.getEligiblityAmount());
        jennyOA.withDraw(900);

        System.out.println("Eligibility amount is "+jennyOA.getEligiblityAmount());

        jennyOA.withDraw(1000);

        System.out.println("Eligibility amount is "+jennyOA.getEligiblityAmount());

        jennyOA.deposit(1100);
        System.out.println("Eligibility amount is "+jennyOA.getEligiblityAmount());

        jennyOA.withDraw(1000);
        System.out.println("Eligibility amount is "+jennyOA.getEligiblityAmount());

    }
}
