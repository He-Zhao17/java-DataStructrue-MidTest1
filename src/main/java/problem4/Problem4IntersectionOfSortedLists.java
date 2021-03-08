package problem4;

// Problem 4 (5 pts):
// Write a function that takes two SORTED arrays without duplicates and
// returns an array of all the elements that occur in both arrays.
// For instance, if we pass the following two sorted arrays to the method:
//        int[] arr1= {2, 10, 12, 34, 90};
//        int[] arr2 = {4, 6, 8, 10, 11, 12, 14, 20, 26, 30, 34, 48, 50};
//        then the method should return: {10, 12, 34}

// Note: your method should be general and work for any two sorted arrays of integers.
// It is required that it runs in linear time: Theta(n1+n2), where n1 and n2
// are the sizes of the two lists and takes advantages of the fact that the input lists are sorted.
// Hint: you can modify the merge helper method to solve this problem.

// The solution to this problem must be submitted to github.
public class Problem4IntersectionOfSortedLists {

    public static int[] intersectionOfSortedArrays(int[] arr1, int[] arr2) {
        // FILL IN CODE
        int[] res = new int[arr1.length]; // you can compute the actual number of common elements as you go,
        // and later return the array of the correct length using copyOf method in class Arrays


        return res;
    }

}
