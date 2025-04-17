package ExceptionHandling;

import java.beans.PropertyEditorSupport;

public class ErrorExample {
    public static void main(String[] args) {
        try{
            recursiveMethod();
        }catch(StackOverflowError e){
            System.out.println("Caught an error: "+e.getMessage());
        }
    }

    public static void recursiveMethod(){
        recursiveMethod(); // infinte recursion!!
    }
}
