import java.util.Scanner;

public class grades
 {

    public static void main(String[] args) 
    {
    
        Scanner scan = new Scanner(System.in);

        
        System.out.println("Enter your percentage: ");
        int percentage = scan.nextInt();

        
        String division;
        if (percentage >= 90) {
            division = "First Division";
        } else if (percentage >= 75) {
            division = "Second Division";
        } else if (percentage >= 60) {
            division = "Third Division";
        } else {
            division = "Fail";
        }

        
        System.out.println("Your division is: " + division);
    }
}