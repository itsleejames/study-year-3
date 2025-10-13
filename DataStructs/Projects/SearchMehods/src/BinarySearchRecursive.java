public class BinarySearchRecursive {

    public static void main(String[] args) {
        BinarySearchRecursive ob = new BinarySearchRecursive();
        int arr[] = {2, 3, 4, 10, 40};
        int n = arr.length;
        int key = 10;
        int result = ob.binarySearch(arr, 0, n - 1, key);

        if (result == -1)
            System.out.println("Element is not in the array");
        else
            System.out.println("Element is present at index " + result);
    }

    int binarySearch(int arr[], int left, int right, int key) {
        if (right >= left) {
            int middle = left + (right - left) / 2;

            if (arr[middle] == key)
                return middle;

            if (arr[middle] > key)
                return binarySearch(arr, left, middle - 1, key);

            return binarySearch(arr, middle + 1, right, key);
        }

        return -1; // element not found
    }
}
