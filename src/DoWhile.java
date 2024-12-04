public class DoWhile {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int i = 0;

        do {
            System.out.println(numbers[i++]);
        }while (i < 5);
    }
}
