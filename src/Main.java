import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you Birth Month(1-12): ");
        int birthMonth = sc.nextInt();

        if(birthMonth > 12 || birthMonth < 1){
            System.out.println("You entered an incorrect month: " + birthMonth);
        }else{
            System.out.println("Your birth month is: " + birthMonth);
        }

    }
}