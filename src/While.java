public class While {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int i = 0;

        while(i < 5) {
            System.out.println(numbers[i++]);
        }
    }
}
