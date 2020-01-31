package attendance;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    static Scanner input = new Scanner(System.in);

    public static Attendance main(String[] args){

    ArrayList<Attendance> reports = loadReport();

    Attendance report = startReport();

    private static void saveOrders(ArrayList<Attendance> report) {
        try {
            FileOutputStream fileStream = new FileOutputStream("orders.ser");
            ObjectOutputStream os = new ObjectOutputStream(fileStream);
            os.writeObject(report);
            os.close();
        } catch (IOException ex) {
            System.out.println("Save Failed! :(");

        }
    }

    public static Attendance startReport() {
        System.out.print("Last Name: ");
        String lastName = input.nextLine();
        System.out.print("First Name: ");
        String firstName = input.nextLine();
        return new Attendance(lastName, firstName);
    }

    public static ArrayList<Attendance> loadReport() {
        try {
            FileInputStream fileStream = new FileInputStream("orders.ser");
            ObjectInputStream os = new ObjectInputStream(fileStream);
            ArrayList<Attendance> orders = (ArrayList<Attendance>) os.readObject();
            os.close();
            return reports;
        } catch (IOException | ClassNotFoundException ex) {
            return new ArrayList<Attendance>();
        }
    }
}