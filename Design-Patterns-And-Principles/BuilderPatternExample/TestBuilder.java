public class TestBuilder {

    public static void main(String[] args) {

        Computer pc = new Computer.Builder()
                .setCPU("Intel i5")
                .setRAM("8GB")
                .setStorage("256GB SSD")
                .build();

        pc.showConfig();
    }
}