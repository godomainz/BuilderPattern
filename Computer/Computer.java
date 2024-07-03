package Computer;

public class Computer {

    // required parameteres
    private String RAM;
    private String HDD;
    private String CPU;

    // optional parameters
    private boolean isGraphicCardEnabled;
    private boolean isBlueToothEnabled;

    private Computer(Builder builder) {
        this.HDD = builder.HDD;
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.isBlueToothEnabled = builder.isBlueToothEnabled;
        this.isGraphicCardEnabled = builder.isGraphicCardEnabled;
    }

    public String getRAM() {
        return RAM;
    }

    public String getHDD() {
        return HDD;
    }

    public String getCPU() {
        return CPU;
    }

    public boolean isGraphicCardEnabled() {
        return isGraphicCardEnabled;
    }

    public boolean isBlueToothEnabled() {
        return isBlueToothEnabled;
    }

    public  static  class Builder{
        // required parameteres
        private String RAM;
        private String HDD;
        private String CPU;

        // optional parameters
        private boolean isGraphicCardEnabled;
        private boolean isBlueToothEnabled;

        public Builder(String ram, String hdd, String cpu){
            this.RAM = ram;
            this.HDD = hdd;
            this.CPU = cpu;
        }

        public Builder setGraphicCardEnabled(boolean graphicCardEnabled) {
            isGraphicCardEnabled = graphicCardEnabled;
            return this;
        }

        public Builder setBlueToothEnabled(boolean blueToothEnabled) {
            isBlueToothEnabled = blueToothEnabled;
            return this;
        }
        public Computer buiild(){
            return new Computer(this);
        }
    }
}
