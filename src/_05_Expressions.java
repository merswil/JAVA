public class _05_Expressions {

    // An expression is a combination of operands and operators that evaluates to a single value.
    // Operands: values, variables, numbers, quantities (e.g., 10, friends)
    // Operators: symbols that perform operations (e.g., +, -, *, /, %, ++)

    public static void main(String[] args) {

        int friends = 10;

        // 1. Addition (+)
        friends = friends + 1; // friends = 11

        // 2. Subtraction (-)
        friends = friends - 2; // friends = 9

        // 3. Multiplication (*)
        friends = friends * 2; // friends = 18

        // 4. Division (/) - Truncates decimals if using integers
        friends = friends / 3; // friends = 6

        // 5. Modulus (%) - Returns the remainder of division
        int remainder = friends % 4; // 6 % 4 = 2

        // 6. Augmented Assignment (Shorthand Operators)
        friends += 5; // equivalent to: friends = friends + 5 (11)
        friends -= 3; // equivalent to: friends = friends - 3 (8)
        friends *= 2; // equivalent to: friends = friends * 2 (16)
        friends /= 4; // equivalent to: friends = friends / 4 (4)
        friends %= 3; // equivalent to: friends = friends % 3 (1)

        // 7. Increment (++) and Decrement (--)
        friends++; // friends = friends + 1 (2)
        friends--; // friends = friends - 1 (1)

        // 8. Integer Division vs. Floating Point Division
        int items = 10;
        // Integer division drops the decimal (.3333 is lost):
        int intResult = items / 3; // result is 3

        // To keep the decimal, cast an operand to double:
        double doubleResult = (double) items / 3; // result is 3.3333333333333335

        System.out.println("Final friends count: " + friends);
        System.out.println("Remainder: " + remainder);
        System.out.println("Int division: " + intResult);
        System.out.println("Double division: " + doubleResult);
    }
}