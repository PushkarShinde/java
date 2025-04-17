package Enums;

import java.sql.SQLOutput;

public class Basic {
    // Enums cannot extend any clases but they can implement interfaces
    enum Week implements A{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

        @Override
        public void hello() {
            System.out.println("Hello Pushkar, I am Enum!");
        }

        // these are enum constants
        // Each constant in an enum is implicitly public, static and final
        // since it's final we can't create child enums, NO INHERITANCE
        // type is 'Week'

        Week(){
            System.out.println("Constructor called for "+this);
        }
    }

    public static void main(String[] args) {
        Week week=Week.Thursday;
        System.out.println("------------------------------");
        for(Week day: Week.values()){
            System.out.println(day);
        }
        System.out.println("------------------------------");
        System.out.println(week);
        System.out.println(week.ordinal()); // position of the enum declaration (0 based)
        System.out.println("------------------------------");
        week.hello();
    }
}
