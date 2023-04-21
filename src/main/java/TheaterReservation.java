import java.time.LocalDate;
import java.util.Scanner;

public class TheaterReservation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = input.nextLine();
        String[] nameParts = name.split(" ");
        String firstName = nameParts[0];
        String lastName = nameParts[1];

        System.out.println("What date will you be coming? (MM/dd/yyyy) ");
        String date = input.nextLine();
        System.out.println("How many tickets would you like? ");
        int tickets = input.nextInt();


        System.out.println(tickets + "tickets reserved for " + date + lastName + ", " + firstName);
    }
}
