import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        CreateRandomArray cra = new CreateRandomArray();
        Array arr = new Array(cra.array);
        System.out.println("The array is: ");
        arr.printArray();
        System.out.println("The sum of the array is: " + arr.sumArray());
        System.out.println("The average of the array is: " + arr.averageArray());
        System.out.println("The maximum value of the array is: " + arr.maxArray());
        System.out.println("The minimum value of the array is: " + arr.minArray());
        System.out.println("There are multiple instances of " + arr.multipleInstancesValues() + " in the array at indexes" + arr.multipleInstancesIndexes() + ".");
        System.out.println();
        try (Scanner value1 = new Scanner(System.in)) {
            System.out.print("Enter a value to search for: ");
            int searchValue = value1.nextInt();
            System.out.println(arr.findValue(searchValue));
        } catch (Exception e) {
            System.out.println("Invalid value.");
        }
        System.out.println();
        try (Scanner value2 = new Scanner(System.in)) {
            System.out.print("Enter a value to delete: ");
            int deleteValue = value2.nextInt();
            System.out.println(arr.deleteValue(deleteValue));
        } catch (Exception e) {
            System.out.println("Invalid value.");
        }
        System.out.println();
        try (Scanner value3 = new Scanner(System.in)) {
            System.out.print("Enter a value to insert: ");
            int insertValue3 = value3.nextInt();
            try (Scanner index = new Scanner(System.in)) {
                System.out.print("Enter an index to insert the value: ");
                int insertIndex3 = index.nextInt();
                System.out.println(arr.insertValue(insertValue3, insertIndex3));
            } catch (Exception e) {
                System.out.println("Invalid index.");
            }
        } catch (Exception e) {
            System.out.println("Invalid value.");
        }
        System.out.println();
        System.out.println("The new array is: ");
        arr.printArray();
    }
}
