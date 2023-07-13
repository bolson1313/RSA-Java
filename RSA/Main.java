package Additional.RSA;

public class Main {
    public static void main(String[] args) {
//        PublicKeyGenerator publicKey = new PublicKeyGenerator();
//        PrivateKeyGenerator privateKey = new PrivateKeyGenerator();
//        System.out.println("Klucz publiczny: "+publicKey+ "\nKlucz prywatny: "+privateKey);
        Encryption encryption = new Encryption("abc d", 5,65); //klucz prywatny d=29, n=65
        System.out.println("przed zamiana");
        System.out.println(encryption.CharToNumberArray());
        System.out.println("po zamianie");
        System.out.println(encryption.Encrypt());
    }
}
