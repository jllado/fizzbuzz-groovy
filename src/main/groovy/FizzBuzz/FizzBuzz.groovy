package FizzBuzz

/**
 * Created by jllado on 23/05/17.
 */
class FizzBuzz {

    private final int input

    FizzBuzz(int input) {
        this.input = input
    }

    def get() {
        if (isDivisibleByThree(input) && isDivisibleByFive(input)) {
            return "FizzBuzz"
        }
        if (isDivisibleByThree(input)) {
            return "Fizz"
        }
        if (isDivisibleByFive(input)) {
            return "Buzz"
        }
        String.valueOf(input)
    }

    private isDivisibleByThree(int number) {
        isDivisibleBy(number, 3)
    }

    private isDivisibleByFive(int number) {
        isDivisibleBy(number, 5)
    }

    private isDivisibleBy(int number, int divisor) {
        number % divisor == 0
    }

}
