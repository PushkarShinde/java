import java.util.Scanner;

public class DigitalLock2 {
    byte firstSecurityKey;
    byte secondSecurityKey;
    byte thirdSecurityKey;

    byte firstEnteredKey;
    byte secondEnteredKey;

    boolean firstKeyEntered;
    boolean secondKeyEntered;

    public DigitalLock2(short key)
    {
        thirdSecurityKey=(byte)(key%10);
        key= (short) (key/10);
        secondSecurityKey=(byte)(key%10);
        key= (short) (key/10);
        firstSecurityKey=(byte)(key%10);
    }

    boolean open(byte b)
    {
        if(!firstKeyEntered)
        {
            firstEnteredKey=b;
            firstKeyEntered=true;
            return false;
        }

        if(!secondKeyEntered)
        {
            secondEnteredKey=b;
            secondKeyEntered=true;
            return false;
        }

        if(firstSecurityKey==firstEnteredKey && secondEnteredKey==secondSecurityKey && b==thirdSecurityKey)
        {
            System.out.println("lock opened");
            return true;
        }
        else
        {
            firstEnteredKey=secondEnteredKey;
            secondEnteredKey=b;
        }

        return false;
    }

    public static void main(String[] args) {
        short key;
        System.out.println("Entered key:");
        Scanner sc=new Scanner(System.in);
        key=sc.nextShort();
        DigitalLock2 lock=new DigitalLock2(key);

        System.out.println("Enter pin:");
        byte b=sc.nextByte();
        while(!lock.open(b))
        {
            b=sc.nextByte();
        }
    }
}