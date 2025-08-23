class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0;

        boolean[] isComposite = new boolean[n]; // false = prime, true = not prime
        int count = 0;

        for (int i = 2; i < n; i++) {
            if (!isComposite[i]) {
                count++; // found a prime
                // mark multiples of i
                if ((long) i * i < n) { // avoid overflow
                    for (int j = i * i; j < n; j += i) {
                        isComposite[j] = true;
                    }
                }
            }
        }
        return count;
    }
}
