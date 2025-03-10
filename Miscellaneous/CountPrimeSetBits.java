public class CountPrimeSetBits {
    public static void main(String[] args) {
        System.out.println(countPrimeSetBits(10,15));
    }
    public static int countPrimeSetBits(int left, int right){
        int count = 0;
        for (; left <= right; left++) {
            if ((left & left - 1) == 0) {
                continue;
            }
            else if(!((left & left - 1) == 0)) {
                System.out.println(left);
                count++;
            }
        }
        return count;
    }
}
