package generics;

public class main {
    public static void main(String[] args) {

        //Imprimiendo un entero
        Printer<Integer> printer = new Printer<>(900);
        printer.print();

        //Imprimiendo un string
        Printer<String> printer2 = new Printer<>("Fabian");
        printer2.print();

        Person person = new Person(1, "Fabian", "Ramirez");

        //imprimiendo una persona
        var printer3 = new Printer<Person>(person);
        printer3.print();

        //usando el metodo toString
        System.out.println("toString => " + person.toString());

    }
}
