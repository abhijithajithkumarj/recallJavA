package MyTest;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {


    public static List<Integer> primeNumber(int [] arr){

        List<Integer> primes = new ArrayList<>();

        for (int num:arr){
            if (isPrime(num)){
                primes.add(num);
            }

        }
        return primes;
    }

    public static boolean isPrime(int number){
        if (number<=1){
            return  false;
        }

        for (int i = 2; i <=Math.sqrt(number); i++) {
            if (number%i==0){
                return false;
            }
            
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println(primeNumber(arr));
    }
}
