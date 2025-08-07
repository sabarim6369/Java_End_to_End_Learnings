package DesignPatterns.Creationaldesignpattern.Factorialdesignpattern;

public class Factory {
    public static Ticket getticket(String type){
        if(type.equalsIgnoreCase("movie")){
            return new Movieticker();
        }
        else if (type.equalsIgnoreCase("bus")) {
            return new Busticket();
        } else if (type.equalsIgnoreCase("train")) {
            return new Traineticker();
        } else {
         throw new IllegalArgumentException("ff");
        }
    }
}
