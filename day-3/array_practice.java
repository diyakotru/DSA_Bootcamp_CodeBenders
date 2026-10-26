// 2 sum prb 
// brute force 
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int[] res=new int[2]; //{0,0}
//         //o(n^2)
//         int n =nums.length;
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 if(nums[i]+nums[j]==target){
//                     res[0]=i;
//                     res[1]=j;
//                     return res;
//                 }
//             }
//         }
//         return res;
//     }
// }
// optimal soln 
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         // tc: o(n) 
//         // sc: o(n)
//         int n =nums.length;
//         // x+y=target
//         // target-y=x (pair condition satisfy kr raha hai )
//         // ele (x) ----> pos 
//         HashMap<Integer,Integer> map=new HashMap<>();
//         for(int y=0;y<n;y++){
//             int val=target-nums[y];
//             if(map.containsKey(val)){
//                 return new int[]{map.get(val),y};
//             }
//             map.put(nums[y],y);
//         }
//         return new int[]{-1,-1};
        

//     }
// }

// buy and sell stock 
// class Solution {
//     public int maxProfit(int[] prices) {
//         // max profit 
//         // stock -> but and dusra sell 
//         // [7,1,5,3,6,4]
//         // p=5 sp=6 cp=1

//         int profit=0;
//         int taken =prices[0]; //cp
//         for(int i: prices){
//             taken=Math.min(taken,i);
//             profit=Math.max(profit,i-taken);
//         }
//         return profit;
//     }
// }

// 3. contains duplicate 
// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         // hashmap (ele -> freq)
//         // [1,2,3,1]
//         // [[ 1-> 2 ][2->1 ][3->1]]
//         // o(n) tc and sc o(n)
//         HashMap<Integer,Integer> map=new HashMap<>();
//         for(int i: nums){
//             if(map.containsKey(i)){
//                 map.put(i,map.get(i)+1);
//             }else{
//                 map.put(i,1);
//             }
//         }
//         for(int i: map.keySet()){
//             int val=map.get(i);
//             if(val>=2)return true;
//         }
//         return false;



//     }
// }

// 4. product of arr except self 
// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int n=nums.length;
//         int[] prefix=new int[n];
//         int[] sufix=new int[n];
//         prefix[0]=1;
//         sufix[n-1]=1;
//         for(int i=1;i<n;i++){
//             prefix[i]=prefix[i-1]*nums[i-1];
//         }
//         for(int i=n-2;i>=0;i--){
//             sufix[i]=sufix[i+1]*nums[i+1];
//         }

//         int[] res=new int[n];
//         for(int i=0;i<n;i++){
//             res[i]=sufix[i]*prefix[i];
//         }
//         return res;

//     }
// }
