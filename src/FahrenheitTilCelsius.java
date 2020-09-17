import java.util.Scanner;

public class FahrenheitTilCelsius {
    public static void main(String[] args) {
       double fahrenheit = fahrenheitmetode();
       celsiusmetode(fahrenheit);
    }

    public static double fahrenheitmetode() {
        Scanner input = new Scanner(System.in);
        System.out.println("Indtast grader i Fahrenheit: ");

        double fahrenheit = input.nextDouble();
        return fahrenheit;
    }

    public static double celsiusmetode(double fahrenheit){

        double celsius = (5.0/9) * (fahrenheit - 32);
        System.out.println("Fahrenheit " + fahrenheit + " er " + celsius + " i Celcius");
        return celsius;




    }
}
