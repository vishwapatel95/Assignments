package basic.day4.assignment1;

public class Hostelite extends Student {
        private String hostelName;
        private int roomNumber;

        public Hostelite() {
        }

        public Hostelite(int studentId, char studetnType, String fname, String lname, String hostelName, int roomNumber) {
            super(studentId, studetnType, fname, lname);
            this.hostelName = hostelName;
            this.roomNumber = roomNumber;
        }

        public String getHostelName() {
            return hostelName;
        }

        public int getRoomNumber() {
            return roomNumber;
        }
}
