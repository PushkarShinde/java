package Variables.StaticVariables_Fields;

public class Fields {
    int srNo;
    String name;
    static int population=0; // static variables....aka. Fields
    // Whenever there is a variable that is supposed to be same for all objects, then it is recommended to be declared as static
    Fields(int srNo, String name){
        this.srNo=srNo;
        this.name=name;
        population++;
    }

    public static void main(String[] args) {
        Fields f1=new Fields(1,"Pushkar");
        Fields f2=new Fields(2,"Anuj");
        Fields f3=new Fields(3,"Alka");
        Fields f4=new Fields(4,"Kanchan");

        System.out.println(Fields.population);
    }
}

// Stored in METHOD AREA
