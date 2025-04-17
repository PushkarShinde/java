package ExceptionHandling;

public class ExceptionExample {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try{
//            int c=a/b;
//            divide(a,b); // Exception 1
//            throw new Exception("Just a fun GIBBERISH exception"); // Exception 2
            String name="Pushkar";
            if(name.equals("Pushkar")){
                throw new MyCustomException("Pushkar is a handsome boy. :)");
            }
        }catch(MyCustomException e){
            System.out.println("Exception caused: "+e.getMessage());
            System.out.println("Cause: " + e.getCause()); // chained exception
        }catch(ArithmeticException e){
            /*"Exception" bas ye bhi likh dega () me toh chalega because afterall it is the superclass of these different exceptions*/
            System.out.println("Exception caused: "+e.getMessage());
        }catch(Exception e){
            System.out.println("Exception caused: "+e.getMessage());
        }finally{
            System.out.println("I am a good Human Being.");
            // this will always run regardless
        }

    }
    public static int divide(int a, int b) throws ArithmeticException{
        if(b==0) throw new ArithmeticException("Are pagal hai kya, RAM gussa ho gaya ab, jaa!");
        return a/b;
    }
}
