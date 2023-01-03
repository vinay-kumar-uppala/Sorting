import java.util.*;
public class mergesort

{
	public static void main(String[] args) {
		int[] inputarr={9,8,7,6,5,4,3,2,1,0};
		inputarr=mergesort(inputarr);
		System.out.println(Arrays.toString(inputarr));
	}
	static int[] mergesort(int[] inputarr)
	{
	    if(inputarr.length==1)
	    {
	        return inputarr;
	    }
	    else{
	        int mid=inputarr.length/2;
	        int[] left=new int[mid];
	        int[] right=new int[inputarr.length-mid];
	        for(int i=0;i<mid;i++)
	        {
	            left[i]=inputarr[i];
	        }
	        for(int j=mid;j<inputarr.length;j++)
	        {
	            right[j-mid]=inputarr[j];
	        }
	        mergesort(left);
	        mergesort(right);
	        return merge(inputarr,left,right);
	    }
	}
	static int[] merge(int[] inputarr, int[] left, int[] right )
	{
	    int i=0,j=0,k=0;
	    while(i<left.length && j<right.length)
	    {
	         if(left[i]<=right[j])
	       {
	           inputarr[k]=left[i];
	           i++;
	       }
	       else{
	           inputarr[k]=right[j];
	           j++;
	       }
	         k++;
	    }
	    while(i<left.length)
	    {
	        inputarr[k]=left[i];
	        i++;
	        k++;
	    }
	    while(j<right.length)
	    {
	        inputarr[k]=right[j];
	        j++;
	        k++;
	    }
	    return inputarr;
	    }
	
}
