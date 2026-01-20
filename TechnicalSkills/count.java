//Given an array count number of elements having at least one element greater than itself.
// eg: [5 -7 0 3 1 6]
// Observation: For every maximum element there won't be element greater than itself.
// Pseudocode:
// Step 1: Iterate and find the maximum element from the array.
// Step 2: Iterate and get the number of elements that are not equal to maximum.
// Step 3: Increment the count.

// Code:
class count {
    public static void main(String[] args) {
        int a[] = { 5, -7, 0, 3, 1, 6 };
        int max = a[0];
        for (int i = 0; i < 6; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        int c = 0;
        for (int i = 0; i < 6; i++) {
            if (a[i] < max) {
                c++;
            }
        }
        System.out.println(c);

    }
}
