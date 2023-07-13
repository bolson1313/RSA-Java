package Additional.RSA;

import java.util.Random;

public class PrimeNumbers {
    private final Random random = new Random();

    public PrimeNumbers(){
    }

    //generating prime number
    public int PrimeGenerator(){
        int number = random.nextInt(20);
        int SqrtNumber = (int) Math.sqrt(number);
        boolean NotPrime = false;
        for(int i = 2; i <= SqrtNumber; i++){
            if(number % i == 0) {
                NotPrime = true;
                break;
            }
        }
        if(NotPrime){
            return PrimeGenerator();
        }else{
            return number;
        }
    }

}
