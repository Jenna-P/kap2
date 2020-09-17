import java.util.Scanner;

public class BeregneLån {
    public static void main(String[] args) {
        lån();
    }

        public static void lån(){
        Scanner input = new Scanner(System.in);

        System.out.print("Indtast årlig rente fx. 7.27 : ");
        double årligrent = input.nextDouble();
        double månedligrent = årligrent / 1200;

        System.out.print("Indtast antal år som heltal fx.5 : ");
        int antalår = input.nextInt();

        System.out.print("Indtast lånebeløb fx. 120000.95 : ");
        double lånebeløb = input.nextDouble();

        double månedligbetaling = lånebeløb * månedligrent / (1 - 1 / Math.pow(1 + månedligrent, antalår * 12));
        double samledebetaling = månedligbetaling * antalår * 12;

        System.out.println("Den månedlige betaling er " + (int)(månedligbetaling * 100) / 100.0 + " kr ");
        System.out.println("Den samlede betaling er " + (int)(samledebetaling * 100) / 100.0 + "kr");





    }
}

