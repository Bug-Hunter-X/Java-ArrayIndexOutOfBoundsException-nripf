public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[5] = 10; // ArrayIndexOutOfBoundsException
        System.out.println("Value at index 5:" + arr[5]);
    }
}