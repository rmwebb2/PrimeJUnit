package PrimeJUnitTest;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public List<Integer> generate(int num) {
        List<Integer> primes = new ArrayList<>();
        for (int candidate = 2; num > 1; candidate++) {
            for (;num % candidate == 0; num /= candidate){
                primes.add(candidate);
            }
        }
        return primes;
    }

    public static void main(String[] args) {
        int num = 0;
        for (;;) {

            //DON"T DO THIS
            if (num >= 10) {
                break;
            }
            System.out.println(num);
            num++;
        }
    }
}
