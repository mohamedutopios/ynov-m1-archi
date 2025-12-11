package org.example.creation.builder;

public class Computer {

    // obligatoires
    private String processor;
    private String ram;

    //optionnelles
    private int storage;
    private boolean isCardGraphicsEnabled;
    private boolean isBluetoothEnabled;


    public Computer() {}

    public Computer(ComputerBuilder builder) {
        this.processor = builder.processor;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.isCardGraphicsEnabled = builder.isCardGraphicsEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }


    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public boolean isCardGraphicsEnabled() {
        return isCardGraphicsEnabled;
    }

    public void setCardGraphicsEnabled(boolean cardGraphicsEnabled) {
        isCardGraphicsEnabled = cardGraphicsEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    public void setBluetoothEnabled(boolean bluetoothEnabled) {
        isBluetoothEnabled = bluetoothEnabled;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", storage=" + storage +
                ", isCardGraphicsEnabled=" + isCardGraphicsEnabled +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                '}';
    }

    public static class  ComputerBuilder {
        // obligatoires
        private String processor;
        private String ram;

        //optionnelles
        private int storage;
        private boolean isCardGraphicsEnabled;
        private boolean isBluetoothEnabled;

        public ComputerBuilder(String processor, String ram) {}

        public ComputerBuilder storage(int storage) {
            this.storage = storage;
            return this;
        }

        public ComputerBuilder isCardGraphicsEnabled(boolean isCardGraphicsEnabled) {
            this.isCardGraphicsEnabled = isCardGraphicsEnabled;
            return this;
        }

        public ComputerBuilder isBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }

    }

}
