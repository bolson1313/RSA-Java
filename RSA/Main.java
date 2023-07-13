package Additional.RSA;

public class Main {
    public static void main(String[] args) {
        //PublicKeyGenerator publicKey = new PublicKeyGenerator();
        //PrivateKeyGenerator privateKey = new PrivateKeyGenerator();
        Encryption encryption = new Encryption("abcd", 12,12);
        System.out.println(encryption.CharToNumberArray());
    }
}
