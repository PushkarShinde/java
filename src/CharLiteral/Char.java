package CharLiteral;

public class Char {
    public static void main(String[] args) {
        char a=97;
        char b=49;
        System.out.println(a); // a
        System.out.println(b); // 1
        // But this notorious harkat is only possible for range (0 - 65535), because char values are possible only till that unicode.
    }
}
