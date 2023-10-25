public class Mystery<T> {
    private T data;

    public Mystery(T data) {
        this.data = data;
    }

    public <U> U convert(Class<U> clazz) {
        return clazz.cast(data);
    }

    public static void main(String[] args) {
        Mystery<String> m = new Mystery<>("Hello");

        // This will throw a ClassCastException, which is caught and handled.
        try {
            Integer num = m.convert(Integer.class);
            System.out.println(num);
        } catch (ClassCastException e) {
            System.out.println("Failed to convert data.");
        }
    }
}
