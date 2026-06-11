public class TestSingleton {

    public static void main(String[] args) {

        Logger obj1 = Logger.getInstance();
        obj1.log("First call");

        Logger obj2 = Logger.getInstance();
        obj2.log("Second call");

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());

        System.out.println(obj1 == obj2);
    }
}