import java.util.Scanner;

public class Moms {
    public static void main(String[] args) {

        System.out.println(" Dansk Moms er " + (int) (plusDanskMoms() * 100) / 100 + "kr");
        System.out.println(" Tysk Moms er " + (int) (plusTyskMoms() * 100) / 100 + "kr");


    }
    public static double plusDanskMoms(){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter purchase amount : ");

        double købesum = input.nextDouble();
        double moms = købesum * 0.25;
        return moms;

    }

    public static double plusTyskMoms() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter purchase amount : ");
        double købesum = input.nextDouble();
        double moms = købesum * 0.16;
        return moms;




    }
}

