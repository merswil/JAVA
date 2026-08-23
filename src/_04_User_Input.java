import java.util.Scanner;

public class _04_User_Input {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scanner.nextLine(); // During execution, there is a '\n' that exist at the end of the string
        // ie. name\n. So it reads name and leaves \n for the next use of Scanner which needs to be cleared before use

        System.out.println("How old are you? ");
        int age = scanner.nextInt();

        scanner.nextLine(); // This line is used to clear the '\n' that exist after the use of the Scanner above.
        System.out.println("What is your favorite food?");
        String food = scanner.nextLine();

        System.out.println("Hello " +name);
        System.out.println("You are " + age + " years old");
        System.out.println("You love " + food);
    }
}
