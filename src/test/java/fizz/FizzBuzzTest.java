package fizz;

import org.junit.Test;

import static fizz.FizzBuzzConstants.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FizzBuzzTest {

    @Test
    public void should_say_0_when_0() {
        assertThat(FizzBuzz.of(0), equalTo("0"));
    }

    @Test
    public void should_say_1_when_1() {
        assertThat(FizzBuzz.of(1), equalTo("1"));
    }

    @Test
    public void should_say_fizz_when_3() {
        assertThat(FizzBuzz.of(3), equalTo(FIZZ));
    }

    @Test
    public void should_say_fizz_when_6() {
        assertThat(FizzBuzz.of(6), equalTo(FIZZ));
    }

    @Test
    public void should_say_buzz_when_5() {
        assertThat(FizzBuzz.of(5), equalTo(BUZZ));
    }

    @Test
    public void should_say_buzz_when_10() {
        assertThat(FizzBuzz.of(10), equalTo(BUZZ));
    }

    @Test
    public void should_say_fizzbuzz_when_15() {
        assertThat(FizzBuzz.of(15), equalTo(FIZZ + BUZZ));
    }
}
