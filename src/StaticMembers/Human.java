package StaticMembers;

public class Human {
    String name;
    int age;
    int salary;
    boolean married;
    static long population=0;

    public Human(String name, int age , int salary, boolean married){
        this.name=name;
        this.age=age;
        this.salary=salary;
        this.married=married;
        Human.population++;
    }
}
