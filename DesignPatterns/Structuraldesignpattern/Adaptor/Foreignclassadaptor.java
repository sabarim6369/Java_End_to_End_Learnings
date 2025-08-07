package DesignPatterns.Structuraldesignpattern.Adaptor;

public class Foreignclassadaptor implements Car {
    private Foreigncar foreigncar;

    public Foreignclassadaptor(Foreigncar foreigncar) {
        this.foreigncar = foreigncar;
    }

    @Override
    public String getmodel() {
        // adapting foreigncar's model name
        return foreigncar.getForeignmodelname();
    }

    @Override
    public String getname() {
        // adapter provides foreign car name
        return foreigncar.getForeignmodelname();
    }

    @Override
    public String getprice() {
        // adapting foreigncar price
        return foreigncar.getforiegnmodelprice();
    }

    // Optionally expose accelerate method if needed
    public String drive() {
        return foreigncar.accelerate();
    }
}
