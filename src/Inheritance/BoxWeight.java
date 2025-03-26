package Inheritance;

import java.lang.reflect.Constructor;

public class BoxWeight extends Box{
    double weight;
    public BoxWeight(){
        this.weight=-1;
    }

    /**
     * The super() keyword here is referring the same process as:
     * Box newBox=new BoxWeight();
     */
    BoxWeight(BoxWeight other){
        super(other);
        weight=other.weight;
    }
    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); // what is this?
//      Calling the parent class constructor, and is used to initialise the members from the parent class.
        this.weight = weight;
    }
}
