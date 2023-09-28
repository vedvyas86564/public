public class CountElementsInSortedArray {

    // Function to find the leftmost occurrence of the target in the sorted array using binary search
    private static int findLeftmostOccurrence(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
            {
                result = mid;
                right = mid - 1; // Continue searching in the left half for the leftmost occurrence
            }
            //if array mid is less than target, we search only right side
            else if (arr[mid] < target)
            {
                left = mid + 1;
            }
            //if array mid is greater than target, we search only left
            else
            {
                right = mid - 1;
            }
        }
        //returns index number where target was found
        return result;
    }

    // Function to count the occurrences of the target in the sorted array
    public static int countOccurrencesInSortedArray(int[] arr, int target) {
        int leftmostOccurrence = findLeftmostOccurrence(arr, target);

        // if target is not in array
        if (leftmostOccurrence == -1) {
            return 0;
        }

        // Find the rightmost occurrence of the target
        int rightmostOccurrence = leftmostOccurrence;
        while (rightmostOccurrence < arr.length && arr[rightmostOccurrence] == target) {
            rightmostOccurrence++;
        }

        // Calculate the count of the target in the array
        return rightmostOccurrence - leftmostOccurrence;
    }

    public static void main(String[] args) {
        int[] sortedArr = { 2, 2, 2, 2, 5, 8, 10, 12, 15, 22, 25 };
        int target = 1;
        int result = countOccurrencesInSortedArray(sortedArr, target);
        System.out.println("Total number of " + target + "'s in the sorted array: " + result);
    }
}