import java.util.Scanner;

public class bonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int age, year;

        System.out.println("digite seu nome");
        name = scanner.next();
        System.out.println("digite seu ano de nascimento");
        year = scanner.nextInt();
        age = 2024 - year;

        System.out.println("seu nome é " +name+ " e sua idade é " + age);
    }
}
