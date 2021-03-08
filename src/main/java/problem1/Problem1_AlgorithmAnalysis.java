package problem1;

// (4 pt) Give Theta of the running time (as a function of n) of the following code snippets:
// (a)
// Your answer:
// Justification:

// (b)
// Your answer:
// Justification:

// You may submit the answer to this question either via Github or
// write down your solution on paper, take a photo at the end of the exam and upload to Canvas.
public class Problem1_AlgorithmAnalysis {

    // (a) (2 pt) Give Theta of the running time of printDup function
    public static void printDup(int[] arr) {
        int n = arr.length;
        int[] dup = new int[arr.length];
        int k = 0;
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                dup[k] = arr[i];
                k++;
            }
        }
        for (int m = 0; m < k; m++) {
            System.out.println(dup[m]);
        }
    }

    // (b) (2 pt)
    // Give Theta of the running time of compute(n) function
    public static int compute(int n) {
        int sum = 0;
        int i = 1;
        while (i <= n*n)  { // note that i goes to n^2
            int j = 1;
            while (j <= n*n) { // note that j goes to n^2
                sum +=  i + j*j;
                j = j * 4; // note that j is multiplied by 4
            }
            i = i + 2;
        }
        return sum;
    }

}
