public class Array_place_Negative_Elements_at_end {
    public static void main(String[] args) {
        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6 };
        int[] ans = new int[arr.length];
        int index = 0;
        //storing the positive Elements in the beginning of ans array
        for(int i : arr)
            if(i >= 0){
                ans[index] = i;
                index++;
            }
        //storing the negative Elements at the end of ans array
        for(int i : arr){
            if(i < 0){
                ans[index] = i;
                index++;
            }
        }
        //printing the ans array
        for(int i : ans)
            System.out.print(i + " ");
    }
}
