package sorting;
public class BubbleSortExample {

    // Function to perform Bubble Sort
    public static void bubbleSortInt(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
    
    public static void bubbleSortString(String arr[]) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j].compareTo(arr[j+1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }

    // Helper method to print the array
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    
    // Handle the string
    public static void printArray(String arr[]) {
        for (String str : arr)
            System.out.print(str + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        // Example array to sort
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original array:");
        printArray(arr);

        // Sorting the array using bubble sort
        bubbleSortInt(arr);

        System.out.println("Sorted array:");
        printArray(arr);
        
     // Example array of Strings to sort
        String arrString[] = {"banana", "apple", "orange", "mango", "lemon", "peach", "cherry"};
        System.out.println("Original array:");
        printArray(arrString);

        // Sorting the array using bubble sort
        bubbleSortString(arrString);

        System.out.println("Sorted array:");
        printArray(arrString);
    }
    
}




