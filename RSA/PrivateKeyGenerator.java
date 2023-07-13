package Additional.RSA;

public class PrivateKeyGenerator extends PublicKeyGenerator{
    private int d;
    // e * d mod ro = 1 szukamy se d

    public PrivateKeyGenerator(){
        DGenerator();
    }
    private void DGenerator(){
        int fi = ro;
        int tmpe = e;
        int tmp;
        for(int i = 1; i < fi; i++){
            tmp = (tmpe * i) % fi;
            if(tmp == 1){
                this.d = i;
            }
        }
    }

    @Override
    public String toString() {
        return "PrivateKeyGenerator{" +
                "d=" + d +
                ", n=" + n +
                '}';
    }
}
