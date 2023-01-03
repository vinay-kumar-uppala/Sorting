import java.util.*;
public class bubblesort
{
 public static void main(String[] args)
 {
	int[] arr={7,8,9,4,5,3,2,1};
	arr=bubblesort(arr);
	System.out.println(Arrays.toString(arr));
 }
 static int[] bubblesort(int[] arr)
 {
     int temp;
     for(int i=0;i<arr.length-1;i++)
     {
         for(int j=0;j<arr.length-1-i;j++)
         {
             if(arr[j]>arr[j+1])
             {
                 temp=arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=temp;
             }
         }
     }
     return arr;
 }
}