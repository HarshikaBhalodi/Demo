import java.util.*;

public class P1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of first array:");
        int m = sc.nextInt();
        int [] arr1 = new int[m];
        System.out.print("Enter array Elements:");
        for(int i = 0; i < m; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter Size of second array:");
        int n = sc.nextInt();
        int [] arr2 = new int[n];
        System.out.print("Enter array Elements:");
        for(int i = 0; i < n; i++){
            arr2[i] = sc.nextInt();
        }

        int [] merged = new int[m+n];
        int i=0,j=0,index=0;
        while(i < m && j < n){
            if(arr1[i] < arr2[j]){
                merged[index++] = arr1[i++];
            }
            else{
                merged[index++] = arr2[j++];
            }
        }
        while(i < m){
            merged[index++] = arr1[i++];
        }
        while(j < n){
            merged[index++] = arr2[j++];
        }
        System.out.println("Enter k-th position");
        int k = sc.nextInt();

        if(k > merged.length){
            System.out.println("Invalid position");
        }
        else{
            System.out.println("Element at position " + k + " is " + merged[k-1]);
        }
    }
}
