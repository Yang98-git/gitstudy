public class Sorted {
    public static void main(String[] args) {
        int[] input = {1,3,5,6};
        System.out.println(isSorted(input));
    }

    public static boolean isSorted(int[] input){
        return helper(input, 0, input.length - 1);
    }

    public static boolean helper(int[] input, int start, int end){
        if (start == end){
            return true;
        }
        int mid =  (start + end) / 2;
        return helper(input, start, mid) && helper(input, mid+1, end);
    }
}
