import java.util.Scanner;

public class Systemtid {
    public static void main(String[] args) {
        int sekunder = Mydisplaytime();

        int minutter = sekunder / 60;
        int resterendesekunder = sekunder % 60;

        System.out.println(sekunder + " sekunder er " + minutter + " minutter og " + resterendesekunder + " sekunder" );

    }

        public static int Mydisplaytime() {

            Scanner input = new Scanner(System.in);

            System.out.print("indtast antal sekunder som heltal : ");

            int sekunder = input.nextInt();

            return sekunder;







    }
}
