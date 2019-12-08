import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("What task do you want to run (1, 2 or 3) ? ");
        choice();

    }

    public static void choice () {
        int number;
        number = numberInput();
        if (number == 1) {
            Task1();
        }
        if (number == 2) {
            Task2();
        }
        if (number == 3) {
            Task3();
        } else {
            System.out.println("\nPlease, try again (possible variants: 1, 2 or 3) : ");
            choice();
        }

    }

    public static void Task1 () {
        System.out.println("Как я провел лето");
        System.out.println("\nЛето было жарким\n\tЛето было очень жарким\n\t\tНо в принципе было хорошим");
        System.out.println();
    }

    public static void Task2 () {

        String passport1 = "-------------------- PASSPORT ----------------------------";
        String passport2 = "----------------------------------------------------------";
        String passport3 = "-----";

        System.out.print("\nPlease, enter your NAME :  ");
        String name = stringInput();

        System.out.print("\nAnd your SURNAME :  ");
        String surname = stringInput();

        System.out.print("\nWhat's your AGE :  ");
        int age = numberInput();

        System.out.print("\nWhat city were you born in :  ");
        String birthCity = stringInput();

        System.out.print("\nWhat city do you LIVE in :  ");
        String currentCity = stringInput();

        System.out.print("\nEnter your GENDER (MALE or FEMALE) :  ");
        String gender = stringInput();

        System.out.println();
        System.out.println(passport1);
        System.out.println(passport2);
        System.out.println(passport3);


        // ----- Person: {имя} {фамилия}

        System.out.print(passport3);
        System.out.println(" Person:  " + name + " " + surname);


        // ----- Gender: {пол}, age: {возраст}

        System.out.print(passport3);
        System.out.println(" Gender:  " + gender + ", age: " + age);


        // ----- Location: from - {город рождения}, current - {город проживания}

        System.out.print(passport3);
        System.out.println(" Location: from - " + birthCity + ", current - " + currentCity);

        System.out.println(passport3);
        System.out.println(passport2);
        System.out.println(passport2);

    }

    public static void Task3 () {
        int number1;
        int number2;

        System.out.println();
        System.out.println("Please, enter number1 : ");
        number1 = numberInput();

        System.out.println("Please, enter number2 : ");
        number2 = numberInput();

        /*
              сумма
              умножение
              деление
              разница
              деление по модулю
              ==
              <
              >
        */

        System.out.println("\nSum : " + (number1 + number2));
        System.out.println("Multiply : " + (number1 * number2));

        // этот блок выводит результат в формате double (что дает слишком много цифр после точки)
        //System.out.println("Division " + number1 + " / " + number2 + " = "  + ((double) number1 / (double) number2));
        //System.out.println("Division " + number2 + " / " + number1 + " = "  + ((double) number2 / (double) number1));

        // а так будет видно всего 2 цифры после точки
        System.out.print("Division " + number1 + " / " + number2 + " = ");
        System.out.printf("%.2f", ((double) number1 / (double) number2));
        System.out.println();
        System.out.print("Division " + number2 + " / " + number1 + " = ");
        System.out.printf("%.2f", ((double) number2 / (double) number1));
        System.out.println();

        // эта логика позволит избежать отрицательных чисел
        if (number1 >= number2) {
            System.out.println("Difference : " + (number1 - number2));
        } else {
            System.out.println("Difference : " + (number2 - number1));
        }

        System.out.println("Mod division " + number1 + " % " + number2 + " = "  + ( number1 % number2));
        System.out.println("Mod division " + number2 + " % " + number1 + " = "  + ( number2 % number1));

        if (number1 == number2) {
            System.out.println(number1 + " equals " + number2);

        } else {
            if (number1 < number2) {
                System.out.println(number1 + " < " + number2);
            } else {
                System.out.println(number1 + " > " + number2);
            }
        }
    }

    public static String stringInput () {
        Scanner input = new Scanner(System.in);
        String name = input.next();
        return name;
    }


    public static int numberInput () {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        return number;
    }

}

//  Домашняя работа 01   задание 1, 2 and 3

