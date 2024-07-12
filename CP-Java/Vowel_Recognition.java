import java.util.Scanner;
public class Vowel_Recognition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int sum = 0, c = 0;
            String s = sc.next();
                for(int i = 0; i < s.length(); i++){
                    char ch = s.charAt(i);
                    if( ch == 'A' || ch == 'a' ||
                        ch == 'E' || ch == 'e' ||
                        ch == 'I' || ch == 'i' ||
                        ch == 'O' || ch == 'o' ||
                        ch == 'U' || ch == 'u') sum += ((s.length()-i) * (i+1));
                }
            System.out.println(sum);
            //            for(int i = 0; i < s.length(); i++){
                //                for(int j = i+1; j <= s.length(); j++){
                    //                    String sub = s.substring(i,j);
                //                    for(int k = 0; k < sub.length(); k++){
                    //                        char ch = sub.charAt(k);
                    //                        if( ch == 'A' || ch == 'a' ||
                    //                            ch == 'E' || ch == 'e' ||
                    //                            ch == 'I' || ch == 'i' ||
                    //                            ch == 'O' || ch == 'o' ||
                    //                            ch == 'U' || ch == 'u') c++;
                    //                    }
                    //                }
                    //            }
                    //            System.out.println(c);
        }
    }
}                    