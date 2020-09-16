public class Variable {
    //byte	1 byte	Stores whole numbers from -128 to 127
    //short	2 bytes	Stores whole numbers from -32,768 to 32,767
    //int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
    //long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    //float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
    //double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
    //boolean	1 bit	Stores true or false values
    //char	2 bytes	Stores a single character/letter or ASCII values

    public static void main(String[] args) {
        byte a = 126;
        short b = -32677;
        int c = 12;
        long d = 5378600000L;
        float e = 0.999f;
        double f = 3.141592;
        boolean g = true;
        char h = 'J';
        char ch1 = 66;


        System.out.println(a + b + f);
        System.out.println(h);
        System.out.println(d - e);
        System.out.println(f);
        System.out.println(ch1);
        System.out.println((int)h);
        System.out.println(g);
        System.out.println((char)ch1);


    }
}
