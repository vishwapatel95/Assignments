package basic.day5.caseStudy.study2;

public class Demo {
    public static void main(String[] args) {
        Travel travel = new Travel();
        travel.setModeOfTravel('F');
        travel.setNumOfTickets(4);

        if (travel.getModeOfTravel() == 'F'){
            travel.setAmount(500 * travel.getNumOfTickets());
        }else if (travel.getModeOfTravel() ==  'T'){
            travel.setAmount(100 * travel.getNumOfTickets());
        }else {
            travel.setAmount(50 * travel.getNumOfTickets());
        }

        System.out.println("Total fare is : " + travel.getAmount());
    }
}
