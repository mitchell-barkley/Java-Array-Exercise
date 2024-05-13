public class Array extends CreateRandomArray {

    public Array(int[] array) {
        this.array = array;
    }

    public void printArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public int sumArray() {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public double averageArray() {
        return (double) sumArray() / array.length;
    }

    public int maxArray() {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public int minArray() {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public String multipleInstancesValues() {
        String values = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    values += " " + array[i] + " " + array[j];
                    break;
                }
            }
        }
        return values;
    }

    public String multipleInstancesIndexes() {
        String indexes = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    indexes += " " + i + " " + j;
                    break;
                }
            }
        }
        return indexes;
    }

    public String findValue(int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return ("The value " + value + " is at index " + i + ".");
            }
        }
        return ("The value " + value + " is not in the array.");
    }

    public String deleteValue(int value) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                count++;
            }
        }
        if (count == 0) {
            return ("The value " + value + " is not in the array.");
        }
        int[] newArray = new int[array.length - count];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != value) {
                newArray[j] = array[i];
                j++;
            }
        }
        array = newArray;
        return ("The value " + value + " has been deleted.");
    }

    public String insertValue(int value, int index) {
        if (index < 0 || index > array.length) {
            return ("The index is out of bounds.");
        }
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        newArray[index] = value;
        for (int i = index + 1; i < newArray.length; i++) {
            newArray[i] = array[i - 1];
        }
        array = newArray;
        return ("The value " + value + " has been inserted at index " + index + ".");
    }

    public String toString() {
        String arrayString = "";
        for (int i = 0; i < array.length; i++) {
            arrayString += array[i] + " ";
        }
        return arrayString;
    }
}