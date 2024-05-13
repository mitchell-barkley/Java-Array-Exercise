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

        try (Scanner value = new Scanner(System.in)) {
            System.out.println("Array Manipulation:");
            System.out.println();
            System.out.println("1. Search for a value in the array.");
            System.out.println("2. Delete a value from the array.");
            System.out.println("3. Insert a value into the array.");
            System.out.println("4. Exit.");
            System.out.println();
            System.out.print("Enter a number to choose an option: ");
            int option = value.nextInt();
            System.out.println();

            switch (option) {
                case 1:
                    try (Scanner value1 = new Scanner(System.in)) {
                        System.out.print("Enter a value to search for: ");
                        int searchValue = value1.nextInt();
                        System.out.println(arr.findValue(searchValue));
                        value1.close();
                    } catch (Exception e) {
                        System.out.println("Invalid value.");
                    }
                    break;
                case 2:
                    try (Scanner value1 = new Scanner(System.in)) {
                        System.out.print("Enter a value to delete: ");
                        int removeValue = value1.nextInt();
                        System.out.println(arr.deleteValue(removeValue));
                        value1.close();
                    } catch (Exception e) {
                        System.out.println("Invalid value.");
                    }
                    break;
                case 3:
                    try (Scanner value1 = new Scanner(System.in)) {
                        System.out.print("Enter a value to insert: ");
                        int insertValue = value1.nextInt();
                        try (Scanner index1 = new Scanner(System.in)) {
                            System.out.print("Enter an index to insert the value: ");
                            int insertIndex = index1.nextInt();
                            System.out.println(arr.insertValue(insertValue, insertIndex));
                        } catch (Exception e) {
                            System.out.println("Invalid index.");
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid value.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
            System.out.println();
            System.out.println("The new array is: ");
            arr.printArray();
            System.out.println();
        
        } catch (Exception e) {
            System.out.println("Invalid option.");
        }
    }
}
