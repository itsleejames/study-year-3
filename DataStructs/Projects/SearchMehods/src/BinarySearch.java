public class BinarySearch {

    public static void main(String[] args) {

        BinarySearch ob = new BinarySearch();
        int arr[] = {2, 3, 4, 10, 40};
        int n = arr.length;
        int key  = 10;
        int result = ob.binarySearch(arr,key);
        if (result == 1)
            System.out.println("Element Is not present in array");
        else
            System.out.println("Element is present at " + " index " + result);

    }

    int binarySearch(int arr[], int key){
        int left = 0, right = arr.length -1;
        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (arr[middle] == key)
                return middle;

            if (arr[middle] < key)
                left = middle + 1;

            else right = middle -1;

        }
        return -1;
    }

}
