import FizzBuzz.FizzBuzz
import spock.lang.Specification


/**
 * 1  - 1
 * 2  - 2
 * 3  - Fizz
 * 4  - 4
 * 5  - Buzz
 * 6  - Fizz
 * 7  - 7
 * 8  - 8
 * 9  - Fizz
 * 10 - Buzz
 * 15 - FizzBuz
 */

class FizzBuzzSpec extends Specification {

    def "return the input number as string"() {
        expect:
            fizzbuzz(input) == result
        where:
            input | result
            1     | "1"
            2     | "2"
            4     | "4"
    }

    def "return Fizz given an input number divisible by three"() {
        expect:
            fizzbuzz(input) == result
        where:
            input | result
            3     | "Fizz"
            6     | "Fizz"
            9     | "Fizz"
    }

    def "return Buzz given an input number divisible by five"() {
        expect:
            fizzbuzz(input) == result
        where:
            input | result
            5     | "Buzz"
            10    | "Buzz"
    }

    def "return FizzBuzz given an input number divisible by three and five"() {
        expect:
            fizzbuzz(15) == "FizzBuzz"
    }

    String fizzbuzz(int input) {
        new FizzBuzz(input).get()
    }

}