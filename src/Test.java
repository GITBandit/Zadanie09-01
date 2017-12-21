import java.util.Scanner;

public class Test {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String fName = scanner.nextLine();
        String lName = scanner.nextLine();
        int age = scanner.nextInt();
        scanner.nextLine();
        String pesel = scanner.nextLine();

        Person person = null;

        try {
            person = new Person(fName, lName, age, pesel);
        } catch (NameUndefinedException err1){
            System.out.println("Imię / Nazwisko za krótkie ");
        } catch (IncorrectAgeException err2){
            System.out.println("Podany wiek nieprawidłowy");
        } finally {
            System.out.println(person);
        }
    }
}
