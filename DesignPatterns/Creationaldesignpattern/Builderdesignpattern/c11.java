package DesignPatterns.Creationaldesignpattern.Builderdesignpattern;

public class c11 {
    private String cpu;
    private String ram;
    private String graphicscard;
    private String memory;
    private String storage;
   private c11(Builder builder){
        this.cpu=builder.cpu;
        this.ram=builder.ram;
        this.graphicscard=builder.graphicscard;
        this.memory=builder.memory;
        this.storage=builder.storage;
    }
    public static class Builder{
        private String cpu;
        private String ram;
        private String graphicscard;
        private String memory;
        private String storage;
        public Builder setcpu(String cpu){
            this.cpu=cpu;
            return this;
        }
        public Builder setram(String ram){
            this.ram=ram;
            return this;
        }
        public Builder setgraphicscard(String card){
            this.graphicscard=card;
            return this;
        }

        public void setRam(String ram) {
            this.ram = ram;
        }

        public void setStorage(String storage) {
            this.storage = storage;
        }

        public void setGraphicscard(String graphicscard) {
            this.graphicscard = graphicscard;
        }

        public void setMemory(String memory) {
            this.memory = memory;
        }

        public void setCpu(String cpu) {
            this.cpu = cpu;
        }
    }
}
