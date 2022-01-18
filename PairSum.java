import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class amazon {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int n = 6;
        int a[] = {1,9,7,8,5,2};
        Arrays.sort(a);
        int i, j,flag=0;
        for(i=0,j=n-1; i<j ;) {
            if(a[i]+a[j]==sum){
                System.out.println("Got it");
                flag=1;
                break;
            }
            else if(a[i]+a[j]<sum)
                i++;
            else {
                j--;
            }
        }
        if(flag==0)
            System.out.println("No pair found");
        sc.close();
        
    }
    
}
