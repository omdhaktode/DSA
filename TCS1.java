public class TCS1 {
    public static void kad_algo(int[] arr, int key) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            int curr = 0; // Reset for each new starting index `i`
            for (int j = i; j < arr.length; j++) { // Start `j` at `i` to include single-element subarrays
                curr += arr[j]; // Add `arr[j]` to the current sum
                if (curr == key) {
                    i++;
                    j++;
                    System.out.println("["+i+","+j+"]");
                    found = true;
                    return;
                    // Remove `break` if you want all possible subarrays
                }
            }
        }
        if (!found) {
            System.out.println("-1");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,4};
        int key = 0;
        kad_algo(arr, key);
    }
}