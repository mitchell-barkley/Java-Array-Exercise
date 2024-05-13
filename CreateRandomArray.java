public class CreateRandomArray {
    int length = 20;
    int[] array = new int[length];
    public CreateRandomArray() {
        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }
}
