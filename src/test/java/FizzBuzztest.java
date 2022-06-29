import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzztest {
    @Test
    public void shouldreturnfizzifnumberisdivisibleby3() {
        final FizzBuzz fizzBuzz = new FizzBuzz();
        final String result = FizzBuzz.convert(6);
        assertEquals("Fizz",result);

    }

    @Test
    public void shouldreturnbuzzifnumberisdivisibleby5(){
        final FizzBuzz fizzBuzz = new FizzBuzz();
        final String result = FizzBuzz.convert(10);
        assertEquals("Buzz",result);

    }
}
