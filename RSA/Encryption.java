package Additional.RSA;

import java.util.ArrayList;

public class Encryption {
    private String message;
    private int e, n;
    private final char[] characters = {' ','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    public Encryption(String message, int e, int n) {
        this.message = message;
        this.e = e;
        this.n = n;
    }

    public ArrayList<Integer> CharToNumberArray(){
        ArrayList<Integer> CharNumbers = new ArrayList<>();
        for(int i = 0; i < message.length(); i++){
            switch (message.charAt(i)) {
                case 'a' -> CharNumbers.add(1);
                case 'b' -> CharNumbers.add(2);
                case 'c' -> CharNumbers.add(3);
                case 'd' -> CharNumbers.add(4);
                case 'e' -> CharNumbers.add(5);
                case 'f' -> CharNumbers.add(6);
                case 'g' -> CharNumbers.add(7);
                case 'h' -> CharNumbers.add(8);
                case 'i' -> CharNumbers.add(9);
                case 'j' -> CharNumbers.add(10);
                case 'k' -> CharNumbers.add(11);
                case 'l' -> CharNumbers.add(12);
                case 'm' -> CharNumbers.add(13);
                case 'n' -> CharNumbers.add(14);
                case 'o' -> CharNumbers.add(15);
                case 'p' -> CharNumbers.add(16);
                case 'q' -> CharNumbers.add(17);
                case 'r' -> CharNumbers.add(18);
                case 's' -> CharNumbers.add(19);
                case 't' -> CharNumbers.add(20);
                case 'u' -> CharNumbers.add(21);
                case 'v' -> CharNumbers.add(22);
                case 'w' -> CharNumbers.add(23);
                case 'x' -> CharNumbers.add(24);
                case 'y' -> CharNumbers.add(25);
                case 'z' -> CharNumbers.add(26);
                case ' ' -> CharNumbers.add(27);
            }
        }
        return CharNumbers;
    }

    public ArrayList<Integer> Encrypt(){
        ArrayList<Integer> Message = CharToNumberArray();
        ArrayList<Integer> EncrypdetMessage = new ArrayList<>();
        int c;
        for(int element:  Message){
            if(element!=27) {
                EncrypdetMessage.add((int)Math.pow(element, e) % n);
            } else {
                EncrypdetMessage.add(0);
            }
        }
        return EncrypdetMessage;
    }

}
