package fizz;

public class FizzBuzz {

    public static String of(int number) {
        if (number == 0) {
            return "0";
        }
        String result = "";
        if(number % 3 == 0) {
            result += FizzBuzzConstants.FIZZ;
        }
        if(number % 5 == 0) {
            result += FizzBuzzConstants.BUZZ;
        }
        if (result == "") {
            result = String.valueOf(number);
        }
        return result;
    }
}
