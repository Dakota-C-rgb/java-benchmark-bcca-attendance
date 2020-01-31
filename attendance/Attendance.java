package attendance;

public class Attendance {
    String lastName;
    String firstName;
    Integer tardyCount;
    Integer absentCount;

    public Attendance(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.tardyCount = 0;
        this.absentCount = 0;
    }

    public Attendance(String lastName, String firstName, Integer tardyCount, Integer absentCount) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.tardyCount = tardyCount;
        this.absentCount = absentCount;
    }

    public Attendance(String lastName2, String address, String phoneOrEmail) {
    }

    public String getReport() {
        return (firstName + " " + lastName + " " + "you have " + tardyCount + " tardies and  " + absentCount
                + " absences.");
    }
}