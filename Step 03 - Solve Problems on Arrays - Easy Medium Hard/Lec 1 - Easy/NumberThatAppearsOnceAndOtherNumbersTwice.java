public class NumberThatAppearsOnceAndOtherNumbersTwice {

    public static void main(String[] args) {
        int[] arr = { 0, 0, 1, 1, 2 };
        System.out.println(singleNumber(arr));

    }

    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int i : nums) {
            result = result ^ i;
        }
        return result;
    }
}
