class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int x=nums1.length;
        int y=nums2.length;

        int [] merge= new int[x+y];
        int k=0;
        for(int i=0; i<x; i++){
            merge[k] = nums1[i];
            k++;
        }
        for(int i=0; i<y; i++){
            merge[k]=nums2[i];
            k++;
        }
        Arrays.sort(merge);
        int size=merge.length;
        if(size%2 == 1)
            return (double) merge[size/2];
        else{
            int mid1=merge[size/2 -1];
            int mid2=merge[size/2];
            return ((double)mid1+(double)mid2)/2.0;
        }
    }
}