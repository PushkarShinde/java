class hello{
    public static void main(String a[]){
        System.out.println("Namaste Duniya!");

        // Creating and initializing custom character
        char c = 'G';

        // Integer data type is generally used for numeric values
        int i = 89;

        // use byte and short if memory is a constraint
        byte b = 4;

        // this will give error as number is larger than byte range
        // byte b1 = 7888888955;

        short s = 56;

        // this will give error as number is larger than short range
        // short s1 = 87878787878;

        // by default fraction value is double in java
        double d = 4.355453532;

        // for float use 'f' as suffix as standard
        float f = 4.7333434f;

        // need to hold big range of numbers then we need this data type
        long l = 12121;

        System.out.println("char: " + c);
        System.out.println("integer: " + i);
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("long: " + l);

        // literals
        int dec= 100; //100
        int bin= 0b101; //5
        int oct= 0746; //486
        int hex= 0x34F; //847
        System.out.println("Decimal number: "+dec);
        System.out.println("Binary number: "+bin);
        System.out.println("Octal number: "+oct);
        System.out.println("Hexadecimal number: "+hex);

        // escape sequence for unicode
        char letter='\u0041';
        System.out.println(letter);

        // narrowing type casting
        int in=100000;
        short sh=(short)in;
        byte by= (byte)in;
        System.out.println(sh);
        System.out.println(by);

        //increment, decrement
        int num=100;
        num++;
        System.out.println(num++);
        System.out.println(++num);

        // New switch case, old one is still valid and it is same is that in C and C++
        int day=4;
        switch(day){ // using (->) operator will have no need for break; statement
            case 1,2,3,4 -> System.out.println("Work days!");
            case 6,7 -> System.out.println("Weekend");
        }

        // // speed test
//     int itr=0;
//     while(true){
//         System.out.println("Hi "+ itr);
//         itr++;
//     }

    }
}
 