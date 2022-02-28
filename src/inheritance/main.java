package inheritance;

import arithmetic.ChildSubtraction;
import arithmetic.ChildSum;

public class main {

    public static void main(String[] args) {

        ChildSum childSum = new ChildSum();//Instance Object
        childSum.getValues(); //Inherit FatherClass
        childSum.sum(); //Inherit ChildSum
        childSum.showResult(); //Inherit FatherClass

        System.out.println("\n");

        ChildSubtraction childSubtraction = new ChildSubtraction();
        childSubtraction.getValues();
        childSubtraction.subtraction();
        childSubtraction.showResult();

    }
}
