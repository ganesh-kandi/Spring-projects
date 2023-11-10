package leetcodeProblems;

import java.util.*;
public class Main {

	public static void main(String[] args) {

	}
	public int[] twoSum(int[] nums, int target) {
        int i=0;
        int j=0;
        for(i=0;i<nums.length;i++){
            for(j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                    
                }
                
            } 
        }
        return new int[]{i,j};
    }
	public List<List<Integer>> threeSum(int[] nums) {
        Integer i=0;
        Integer j=0;
        Integer k=0;
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> list1=new ArrayList<>();
        for(i=0;i<nums.length;i++){
            for(j=i+1;j<nums.length;j++){
                for(k=j+1;k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                    	list1.add(i);
                    	list1.add(j);
                    	list1.add(k);
                    	list.add(list1);
                    	for(int l=1;l<list.size();l++) {
                    	if(list.get(l)==list.get(l+1)) {
                    		list.remove(l);
                    	}
                    	}
                        return list;
                }
                }
                
                
            } 
        }
        return list;
    }

}
