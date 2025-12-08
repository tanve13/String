public class HammingWeight {

    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(11));    // 3  (1011)
        System.out.println(hammingWeight(128));   // 1  (10000000)
        System.out.println(hammingWeight(0));     // 0
    }
}
