package DesignPatterns.Structuraldesignpattern.Adaptor;

public class Main {
    public static void mainclass(){
        Car innova=new Innovaclass();
        System.out.println("Innova Name: " + innova.getname());
        System.out.println("Innova Model: " + innova.getmodel());
        System.out.println("Innova Price: " + innova.getprice());
        Foreigncar car=new Foreigncar();
        Foreignclassadaptor foreigncar=new Foreignclassadaptor(car);
        System.out.println("Innova Name: " + foreigncar.getname());
        System.out.println("Innova Model: " + foreigncar.getmodel());
        System.out.println("Innova Price: " + foreigncar.getprice());
    }
}
