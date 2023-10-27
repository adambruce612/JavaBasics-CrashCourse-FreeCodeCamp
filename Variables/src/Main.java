
public class Main
{
    public static void main(String[] args)
    {
        String name = "Christian";
        int age = 23;
        System.out.println("Hello " + name + ". Your age is " + age);

        // These two variables store the min and max values for data type int
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println("The maximum value for an int = " + max);
        System.out.println("The minimum value for an int = " + min);

        // These two variables store the min and max values for data type byte
        byte maxByteValue = Byte.MAX_VALUE;
        byte minByteValue = Byte.MIN_VALUE;

        System.out.println("The maximum value for a byte = " + maxByteValue);
        System.out.println("The minimum value for a byte = " + minByteValue);

        // These two variables store the min and max values for data type long
        long maxLongValue = Long.MAX_VALUE;
        long minLongValue = Long.MIN_VALUE;

        System.out.println("Long max value = " + maxLongValue);
        System.out.println("Long min value = " + minLongValue);

        long myNumber = 2147483648L; // This will error without the 'L' at the end. The 'L' designates it as a long data type.

        // These two variables store the min and max values for data type short
        short maxShortValue = Short.MAX_VALUE;
        short minShortValue = Short.MIN_VALUE;

        System.out.println("Max short value = " + maxShortValue);
        System.out.println("Min short value = " + minShortValue);

        float number = 3.14f; // Will error without the f at the end. The f designates it as a float
        double number1 = 2.0;

        // These two variables store the min and max values for data type float
        float maxFloatValue = Float.MAX_VALUE;
        float minFloatValue = Float.MIN_VALUE;

        System.out.println("Maximum float number = " + maxFloatValue);
        System.out.println("Minimum float number = " + minFloatValue);

        // These two variables store the min and max values for data type double
        double maxDoubleValue = Double.MAX_VALUE;
        double minDoubleValue = Double.MIN_VALUE;

        System.out.println("Maximum double number = " + maxDoubleValue);
        System.out.println("Minimum double number = " + minDoubleValue);
        // If you need precision use double, if not use float.

        // Char is used to store a single character.
        char letter = 'A';
        System.out.println(letter);

        // A boolean data type is either true or false
        boolean isActive = false;
        System.out.println(isActive);

        // Expressions are something that returns a value. Shift + Control + P will show what data type the return is.
        int num1 = 5;
        int num2 = 3;

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2); // will not show fractional part if data type is int
        System.out.println(num1 % num2); // Will return the remainder for 5 / 3.
        System.out.println((num1 + num2) * 4);

        int myIntNumber = 0;
        myIntNumber += 4;
        System.out.println(myIntNumber);

        myIntNumber -= 4;
        System.out.println(myIntNumber);

        myIntNumber *= 4;
        System.out.println(myIntNumber);

        myIntNumber /= 4;
        System.out.println(myIntNumber);

        myIntNumber %= 4;
        System.out.println(myIntNumber);

        // Postfix and prefix incrementing/decrementing. Can be used with plus for incrementing or minus for decrementing.
        myNumber = 4;
        System.out.println(myNumber++); // Postfixing incrementation (happens at the end of the variable). Will print and then increment.
        System.out.println(myNumber); // Output will be 1.
        System.out.println("Prefix decrementation " + --myNumber); // Will increment and then print out the value of the number. Will print out 2.
        System.out.println("Postfix decrementation " + myNumber--); // Will increment and then print out the value of the number. Will print out 2.
        System.out.println("Prefix incrementation " + ++myNumber); // Will increment and then print out the value of the number.
        System.out.println("Postfix incrementation " + myNumber++); // 

    }

}