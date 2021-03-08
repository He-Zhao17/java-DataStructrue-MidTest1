package problem2;

// Problem 2:  (4pt) Consider the following recursive function rec1(n)
// (a) (1.5pt) Give a recurrence relation for this function (give both base and
// recursive cases). Note: before making recursive calls, we execute nested loops.
// Your answer:

// (b) (2.5pt) Solve the recurrence relation to get Theta of the running time using Masters Theorem.
// Explain your answer (state which case applies; if case 1 or case 3, give a specific epsilon etc.)
// Your answer:

// Note: three cases of the Master theorem are listed on the last page of the pdf of the exam.

// You may submit the answer to this question either via Github or
// write down your solution on paper, take a photo at the end of the exam and upload to Canvas.
public class Problem2MasterTheorem {

    public static int rec1(int n) {
        int sum = 0;
        if (n <= 1)
            return 1;
        else {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    sum++;
                }
            }
            return rec1(n/3) + rec1(n/3) + rec1(n/3) + sum;
        }
    }




}
