public class Array_print_Positive_Elements {
    public static void main(String[] args) {
        int[] arr = {2, 6, -5, -1, 0, 4, -9};
        for(int i : arr){
            if(i >= 0)
                System.out.print(i + " ");
        }
    }
}
