public class _02_Variables {

    public static void main(String[] args){
        // A variable is a placeholder for a value that behaves as the value it contains



        int x; // declaration
        x = 123; // assignment
        int y = 123; // initialization



        // 1. boolean (1 bit) - true or false
        boolean isJavaFun = true;
        boolean isFishTasty = false;

        // 2. byte (1 byte) - range: -128 to 127
        byte age = 25;
        byte minByte = -128;

        // 3. short (2 bytes) - range: -32,768 to 32,767
        short currentYear = 2026;
        short temperatureCelsius = -15;

        // 4. int (4 bytes) - range: -2 billion to 2 billion (keyword is 'int', not 'integer')
        int population = 1500000;
        int viewsCount = 987654321;

        // 5. long (8 bytes) - append an 'L' or 'l' at the end
        long worldPopulation = 8000000000L;
        long nationalDebt = 34000000000000L;

        // 6. float (4 bytes) - 6-7 decimal digits of precision; append an 'F' or 'f'
        float pi = 3.141592f;
        float pricePerKg = 4.99f;

        // 7. double (8 bytes) - 15 decimal digits of precision (default for decimal numbers)
        double precisePi = 3.141592653589793;
        double accountBalance = 125000.75;

        // 8. char (2 bytes) - single character in single quotes
        char grade = 'A';
        char currencySymbol = '$';

        // 9. String (varies) - Reference type (capital 'S'), sequence of chars in double quotes
        String greeting = "Hello, World!";
        String username = "Name";

        // Print examples to verify
        System.out.println("Boolean: " + isJavaFun);
        System.out.println("Byte: " + age);
        System.out.println("Short: " + currentYear);
        System.out.println("Int: " + population);
        System.out.println("Long: " + worldPopulation);
        System.out.println("Float: " + pi);
        System.out.println("Double: " + precisePi);
        System.out.println("Char: " + grade);
        System.out.println("String: " + greeting);

        /*

        Data type       |   size    |   primitive / reference   |     value
        ---------------------------------------------------------------------------------
        boolean         |   1 bit   |   primitive               |   true or false
        byte            |   1 byte  |   primitive               |   -128 to 127
        short           |   2 bytes |   primitive               |   -32,768 to 32,767
        integer         |   4 bytes |   primitive               |   -2 billion to 2 billion
        long            |   8 bytes |   primitive               |   -9 quintillion to 9 quintillion
        float           |   4 bytes |   primitive               |   fractional number up to 6-7 digits ex. 3.141592f
        double          |   8 bytes |   primitive               |   fractional number up to 15 digits ex. 3.141592653589793
        char            |   2 bytes |   primitive               |   single character / letter / ASCII value ex. 'f'
        string          |   varies  |   reference               |   a sequence of characters ex. "Hello world!"

        */

    }
}
