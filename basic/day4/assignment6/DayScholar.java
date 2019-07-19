package basic.day4.assignment6;

public class DayScholar extends Student {
    private String residentialAddress;

//    public void setResAddress(String resAddress){
//        this.residentialAddress=resAddress;
//    }


    public void setResidentialAddress(String residentialAddress) {
        this.residentialAddress = residentialAddress;
    }

    public void getDetails(){
        super.getDetails();
        System.out.println("Student Name "+studentName);
        System.out.println("Residential Address : "+residentialAddress);
    }
}
