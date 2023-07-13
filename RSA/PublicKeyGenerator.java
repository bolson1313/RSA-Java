package Additional.RSA;

import java.util.Random;

public class PublicKeyGenerator {
    protected static int e, n, p, q, ro;

    public int getE() {
        return e;
    }

    public int getRo() {
        return ro;
    }

    public PublicKeyGenerator() {
        PrimeNumbers prime = new PrimeNumbers();
        p = prime.PrimeGenerator();
        q = prime.PrimeGenerator();
        n = p*q;
        eGenerator();
    }

    private void eGenerator(){
        ro = (p-1)*(q-1);
        Random random = new Random();
        for(int i = random.nextInt(1,n); i <= n; i++){
            if(RelativlyPrime(i, ro)){
                e = i;
                break;
            }
        }
    }


    //checking if two numbers are relativly prime
    public boolean RelativlyPrime(int a, int b){
        int tmp;
        boolean condition = false;
        if(a > b){
            while(!((tmp =a%b) == 1)){
                if(tmp == 0){
                    condition = false;
                    break;
                }else{
                    a = b;
                    b = tmp;
                    condition = true;
                }
            }
        } else if (b > a) {
            return RelativlyPrime(b, a);
        } else if (a == b) {
            condition = false;
        }

        return condition;
    }

    @Override
    public String toString() {
        return "PublicKeyGenerator{" +
                "e=" + e +
                ", n=" + n +
                '}';
    }
}