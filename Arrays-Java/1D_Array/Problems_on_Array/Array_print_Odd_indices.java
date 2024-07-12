public class Array_print_Odd_indices {
    public static void main(String[] args) {
        String[] arr = {"ab", "bc", "cd", "de", "ef", "fg", "gh"};
        for(int i = 0; i < arr.length; i++){
            if(i % 2 == 1)
                System.out.print(arr[i] + " ");
        }
    }
}
