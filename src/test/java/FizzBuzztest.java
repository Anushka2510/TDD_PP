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
    @Test
    public void shouldreturnfizzbuzzifnumberisdivisibleby3and5(){
        final FizzBuzz fizzBuzz = new FizzBuzz();
        final String result = FizzBuzz.convert(15);
        assertEquals("FizzBuzz",result);

    }
    @Test
    public void shouldreturnnumberifnumberisdivisibleby3nor5(){
        final FizzBuzz fizzBuzz = new FizzBuzz();
        final String result = FizzBuzz.convert(7);
        assertEquals("7",result);

    }
}
