package DesignPatterns.Creationaldesignpattern.Builderdesignpattern;

public class buildermain {
    public static void main(){
        Computer a=new Computer.Builder()
               .setCPU("123")
                .setGraphicsCard(true)
                .setRAM("123")
                .build();
        Computer b=new Computer.Builder().setCPU("234").setRAM("dd").build();
    }

}
