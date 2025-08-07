package DesignPatterns.Work;

public class Computer {
    private String cpu;
    private String Ram;
    private String graphiccard;
    private Computer(Builder builder){
        this.cpu=builder.cpu;
        this.graphiccard=builder.graphiccard;
        this.Ram=builder.Ram;

    }
    public static class Builder{
        private String cpu;
        private String Ram;
        private String graphiccard;
       public Builder setcpu(String cpu){
           this.cpu=cpu;
           return this;
        }

        public Builder setGraphiccard(String graphiccard) {
            this.graphiccard = graphiccard;
            return this;
        }

        public Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setRam(String ram) {
            Ram = ram;
            return this;
        }
        public Computer build(){
           return new Computer(this);
        }
    }
}
