package javabasics._8;

public class _8 {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    /**
     * 1: Using the 'Integer' and the String class, convert ourNumber below to an int
     * <p>
     * Once this is converted to an int, increase its value by 2
     * <p>
     * Then convert this back to a string and print it, it should be 90 and not 882
     */
    private static void exercise1() {
        System.out.println("\nExercise 1:");
        String ourNumberStr = String.valueOf(88);
        int intNumber= Integer.valueOf(ourNumberStr);
        System.out.println(intNumber+2);
        //Write your code here
    }

    /**
     * 2a: Convert ourChar to a String, make it uppercase
     * <p>
     * 2b: Play around line 37, experiment the integer of 0 to a number where it prints 'w', instead of 'H'
     * think about what the charAt method is doing?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2a:");
        char ourChar = 'a';
        String ourCharString = String.valueOf(ourChar).toUpperCase(); // <--- Change this line
        // Notice below what happens, the `charAt()` method
        System.out.println(ourCharString.charAt(0));

        System.out.println("\nExercise 2b:");
        String anotherString = "Hello world";
        int charAtIndex = 6; // <--- Change this line
        System.out.println("Make this print 'w' -> current result: '" + anotherString.charAt(charAtIndex) + "'");
    }


    /**
     * 3: This exercise currently throws 'exceptions' (big red error messages in our console)
     * <p>
     * Change the 3 lines indicated below so it no longer crashes, think about the type
     * conversions. "hello" can't be a number
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");

        String intStrToConvert = String.valueOf(5); // Change this line
        System.out.println(Integer.valueOf(intStrToConvert));

        String booleanStrToConvert = String.valueOf("true"); // And this line
        System.out.println(Boolean.valueOf(booleanStrToConvert));

        String doubleStrToConvert = String.valueOf(1); // Also this line
        System.out.println(Double.valueOf(doubleStrToConvert));
    }


    /**
     * 4: Given our string 'startStr'
     *    4.1: use a string method to make sure it can convert to an int and convert it to an int
     *    4.2: Times our number by 2
     *    4.3: Convert back to a string, and concatenate our number with itself,
     *         (i.e. 4 concatenated with itself is 44, not 8)
     *    4.4: Convert to a double and divide our number by 3.5
     *    4.5: Use Math.floor to remove decimal places on our number
     *
     *    Your result should be 288.0!
     */
    private static void exercise4() {
        System.out.println("\nExercise 4:");
        String startStr = String.valueOf(5);
        System.out.println("start "+startStr);
        //transform into an integer, times by 2
        int startInt= Integer.valueOf(startStr)*2;
        String finishString = String.valueOf(startInt);
        System.out.println("times 2= "+finishString);
        //concatenation

     //questo passaggio funziona, solo che nel prossimo step non riesco a convertire il new o stringa a double
//        StringBuilder concatenate=new StringBuilder();
//        concatenate.append(finishString);
//        concatenate.append(finishString);
//        System.out.println("concatenate "+concatenate.toString());

        String concatenate= finishString;
        concatenate= concatenate+ concatenate;
        System.out.println("concatenate "+concatenate.toString());


        //Convert to a double and divide our number by 3.5
        double endDouble = Double.valueOf(concatenate)/3.5;
        System.out.println("double and divide our number by 3.5 = "+ endDouble);

        //remove decimal places on our number by using Math.floor

        System.out.println("remove decimal places on our number by using Math.floor= " + Math.floor(endDouble));



        // Write your code here
    }
}