

public class median {

	public static void main(String[] args) {
		int [] a={1,2,3,7,9,10};
		int [] b={4,5,6,8};
		System.out.println(findMedianSortedArrays(a, b));
	}
	 public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
	        int num1=nums1.length;
	        int num2=nums2.length;
	        if(num1==0 && num2==0)
	        	return 0;
	        
	        int middle=num1+num2;
	        int l=0,m=0;
	        int [] newArr=new int[middle];
	        int no1,no2;
	        if(num1==0)
	        	no1=Integer.MAX_VALUE;
	        else
	        	no1=nums1[0];
	        if(num2==0)
	        	no2=Integer.MAX_VALUE;
	        else
	        	no2=nums2[0];
	        
	        
	        for(int i=0; i<middle;i++)
	        {
	            if(l==nums1.length){
	                while(m!=nums2.length){
	                    no2=nums2[m++];
	                    newArr[i]=no2;
	                    i++;
	                }
	                break;
	            }else if(m==nums2.length){
	                while(l!=nums1.length){
	                    no1=nums1[l++];
	                    newArr[i]=no1;
	                    i++;
	                }
	                break;
	            }else if(nums1[l]<=nums2[m]){
	               no1=nums1[l++];
	               newArr[i]=no1; 
	            }else{
	                no2=nums2[m++];
	                newArr[i]=no2;
	            }
	        }
	        if(newArr.length==1)
	        	return newArr[0];
	        if(middle%2==0){
	            return ((double)newArr[middle/2-1]+newArr[(middle/2)])/2;
	        }else{
	            return newArr[middle/2];
	        }
	    }
}
