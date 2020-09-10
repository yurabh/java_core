package lesson_116;

public class JsonTest {
    public static void main(String[] args) {
        JsonSerializer jsonSerializer = new JsonSerializer();
        Car car = new Car("bmw", "germany", 2011);

        try {
            String jSoN = jsonSerializer.serialize(car);
            System.out.println(jSoN);
        } catch (JsonSerializeException e) {
            e.printStackTrace();
        }
    }
}
