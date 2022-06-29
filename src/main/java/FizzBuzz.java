public class FizzBuzz {
   public static String convert(int number) {
        if(divisibleby(number, 3) && divisibleby(number, 5))
            return "FizzBuzz";
        if(divisibleby(number, 3))
            return "Fizz";
        if(divisibleby(number, 5))
            return "Buzz";
        return Integer.toString(number);
    }

    private static boolean divisibleby(int dividend, int divisor) {
        return dividend % divisor == 0;
    }
}
