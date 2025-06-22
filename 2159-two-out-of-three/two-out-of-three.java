class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> res = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                res.add(nums2[i]);
            }
            set2.add(nums2[i]);
        }
        for(int i=0;i<nums3.length;i++){
            if(set.contains(nums3[i]) || set2.contains(nums3[i])){
                res.add(nums3[i]);
            }
        }
        for(int set1 : res){
            list.add(set1);
        }
        return list;
    }
}