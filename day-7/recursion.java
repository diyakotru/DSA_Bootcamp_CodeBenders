// Day 6 & 7: Recursion
// Basic Ques (Fibonacci, factorial, sum of array)
// Generate Subsequence
// Coin toss
// Merge sort
// Quick sort 
// backtracking 
// N Queens
// Rat In A Maze


// recursion -> choices 
// syntax 
// main(){
//     // yeh humara main functn hai 
// }
// 1. base case -> kaha recursion terminate 
// 2. recursive statement -> function calling itself 

// import java.util.ArrayList;
// import java.util.List;

// public class recursion {
    
//     class Solution {
//     List<List<Integer>>res;
//     public List<List<Integer>> subsets(int[] nums) {
//     
//         res=new ArrayList<>();
//         int i=0;
//         List<Integer> sublist=new ArrayList<>();
//         helper(i,sublist,nums);
//         return res;


//     }

//     private void helper(int i , List<Integer> sublist , int[] nums){
//         int n=nums.length;
//         // base case 
//         if(i>=n){
//             res.add(new ArrayList<>(sublist));
//             return;
//         }

//         // take 
//         sublist.add(nums[i]);
//         helper(i+1,sublist,nums);
//         sublist.remove(sublist.size()-1);
//         // not take 
//         helper(i+1,sublist,nums);
//         return;
//     }
// }
// }


// class Solution {
//     List<List<Integer>>res;
//     public List<List<Integer>> combinationSum(int[] nums, int target) {
//         res=new ArrayList<>();
//         int i=0;
//         int sum=0;
//         List<Integer> sublist=new ArrayList<>();
//         helper(i,sublist,nums,sum,target);
//         return res;
//     }
//     private void helper(int i , List<Integer> sublist , int[] nums,int sum,int target){
//         int n=nums.length;
       
//         // base case 
//         if(sum==target){
//             res.add(new ArrayList<>(sublist));
//             return;
//         }
//         if(i>=n||sum>target)return;

//         // take 
//         sum+=nums[i];
//         if(sum<=target){
//             sublist.add(nums[i]);
//             helper(i,sublist,nums,sum,target);
//             sublist.remove(sublist.size()-1);
//         }
//         sum-=nums[i];
//         helper(i+1,sublist,nums,sum,target);
//         return;
//     }
// }


// class Solution {
//     Set<List<Integer>>set=new HashSet<>();
//     List<List<Integer>>res;
//     public List<List<Integer>> combinationSum2(int[] nums, int target) {
//         Arrays.sort(nums);
      
//         int i=0;
//         int sum=0;
//         List<Integer> sublist=new ArrayList<>();
//         helper(i,sublist,nums,sum,target);
//         res=new ArrayList<>(set);
//         return res;
//     }
//     private void helper(int i , List<Integer> sublist , int[] nums,int sum,int target){
//         int n=nums.length;
       
//         // base case 
//         if(sum==target){
//             set.add(new ArrayList<>(sublist));
//             return;
//         }
//         if(i>=n||sum>target)return;

//         // take 
//         sum+=nums[i];
//         if(sum<=target){
//             sublist.add(nums[i]);
//             helper(i+1,sublist,nums,sum,target);
//             sublist.remove(sublist.size()-1);
//         }
//         sum-=nums[i];
//         helper(i+1,sublist,nums,sum,target);
//         return;
    
//     }
// }


// class Solution {
//     List<List<Integer>>list;
//     public List<List<Integer>> subsetsWithDup(int[] nums) {
//         list=new ArrayList<>();
//         Arrays.sort(nums);
//         helper(0,nums,new ArrayList<>());
//         return list;
//     }
//     private void helper(int i , int[] nums, List<Integer> sublist){
//         if(i>=nums.length){
//             list.add(new ArrayList<>(sublist));
//             return;
//         }

//         //take 
//         sublist.add(nums[i]);
//         helper(i+1,nums,sublist);
//         sublist.remove(sublist.size()-1);
//         //nottake 
//         int j=i;
//         while(j<nums.length&&nums[j]==nums[i])j++;
//         helper(j,nums,sublist);
//         return;


//     }
// }