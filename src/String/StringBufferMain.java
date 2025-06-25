package String;

public class StringBufferMain {
    public static void main(String[] args) {
        StringBuffer str=new StringBuffer("Pushkar");
        str.append(1);
        System.out.println(str);
        str.insert(0,'T');
        System.out.println(str);
        System.out.println(str.length());
        // Thread safe......
    }
}
// StringBuilder is not thread safe
