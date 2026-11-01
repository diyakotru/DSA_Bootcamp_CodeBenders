//  Character arrays and strings
// stacks and queues practice 

// class Solution {
//     public int[] dailyTemperatures(int[] temp) {
//         // [73,74,75,71,69,72,76,73]
//         // [1,1,4,2,1,1,0,0]
//         int n=temp.length;
//         int[] res=new int[n]; 
//         Stack<Integer>stack=new Stack<>();
//         int i=n-1;
//         while(i>=0){
//             while(!stack.isEmpty()&&temp[stack.peek()]<=temp[i]){
//                 stack.pop();
//             }
//             if(!stack.isEmpty()){
//                 res[i]=stack.peek()-i;
//             }
//             stack.push(i);
//             i--;

//         }

//         return res;

//     }
// }

// class Solution {
//     public boolean isValid(String s) {
//         int n=s.length();
//         Stack<Character> stack=new Stack();
//         int i=0;
//         while(i<n){
//             char ch=s.charAt(i);
//             if(ch=='('||ch=='{'||ch=='['){
//                 stack.push(ch);
//             }
//             else if (ch==')'){
//                 if(stack.isEmpty())return false;
//                 if(stack.peek()=='(')stack.pop();
//                 else{
//                     return false;
//                 }
//             }
//             else if (ch==']'){
//                 if(stack.isEmpty())return false;
//                 if(stack.peek()=='[')stack.pop();
//                 else{
//                     return false;
//                 }
//             }
//             else if (ch=='}'){
//                 if(stack.isEmpty())return false;
//                 if(stack.peek()=='{')stack.pop();
//                 else{
//                     return false;
//                 }
//             }
//             i++;
//         }

//         if(stack.isEmpty())return true;
//         return false;


//     }
// }


// class MinStack {
//     Stack<Integer> stack1;
//     Stack<Integer> minStack;

//     public MinStack() {
//         stack1=new Stack();
//         minStack=new Stack();
//     }
    
//     public void push(int value) {
//         stack1.push(value);
//         if(minStack.isEmpty()||value<=minStack.peek()){
//             minStack.push(value);
//         }
//         return;
//     }
    
//     public void pop() {
//         int val=stack1.pop();
//         if(val==minStack.peek()){
//             minStack.pop();
//         }


//     }
    
//     public int top() {
//         return stack1.peek();
//     }
    
//     public int getMin() {
//         return minStack.peek();
//     }
// }

// /**
//  * Your MinStack object will be instantiated and called as such:
//  * MinStack obj = new MinStack();
//  * obj.push(value);
//  * obj.pop();
//  * int param_3 = obj.top();
//  * int param_4 = obj.getMin();
//  */


// class Solution {
//     public int evalRPN(String[] tokens) {
//         int n=tokens.length;
//         Stack<Integer> stack=new Stack<>();

//         int i=0;
//         while(i<n){
//             String ch=tokens[i];
//             if(ch.equals("+")||ch.equals("-")||ch.equals("*")||ch.equals("/")){
//                 int a=stack.pop();
//                 int b=stack.pop();
//                 if(ch.equals("+")){
//                     stack.push(a+b);
//                 }
//                 else if (ch.equals("-")){
//                     stack.push(b-a);
//                 }
//                 else if (ch.equals("*")){
//                     stack.push(b*a);
//                 }
//                 else if (ch.equals("/")){
//                     stack.push(b/a);
//                 }
//             }else{
//                 stack.push(Integer.parseInt(ch));
//             }
//             i++;
           

//         }

//         return stack.pop();

//     }
// }


// class Solution {
//     public boolean isAnagram(String s, String t) {
//         int n=s.length();
//         int m=t.length();
//         if(n!=m)return false;
//         int[] freq1=new int[26];
//         int[] freq2=new int [26];

//         for(char ch: s.toCharArray()){
//             freq1[ch-'a']++;
//         }
//         for(char ch: t.toCharArray()){
//             freq2[ch-'a']++;
//         }
//         // if(freq2.equals(freq1))return true;
//         for(int i=0;i<26;i++){
//             if(freq1[i]!=freq2[i])return false;
//         }

//         return true;
        
//     }
// }

// class Solution {
//     public int[] topKFrequent(int[] nums, int k) {
//         // hashmap -> no, freq 
//         // pq -> max freq , k loop -> top k elements konse hai 

//         int n =nums.length;
//         HashMap<Integer,Integer> map=new HashMap<>();
//         for(int i : nums){
//             if(map.containsKey(i)){
//                 map.put(i, map.get(i)+1);
//             }else{
//                 map.put(i,1);
//             }
//         }
//         // int[] -> 2 len [number , freq ]
//         PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->b[1]-a[1]);
//         for(int i : map.keySet()){
//             int val=map.get(i);
//             pq.offer(new int[]{i,val});
//         }
//         int[] ans=new int[k];
//         int ind=0;
//         while(!pq.isEmpty()&&k>0){
//             k--;
//             int[] arr=pq.poll();
//             ans[ind++]=arr[0];
//         }
//         return ans;



//     }
// }


// class Solution {
//     public int longestConsecutive(int[] nums) {
//         // set -> unique values store 
//         // [1,2,3,1,1,1,1,2,2,2,2,2] [1,2,3]
//         Set<Integer> set =new HashSet<>();
//         for(int i: nums){
//             set.add(i);
//         }

//         int max=0;
//         for(int i: set){
//             if(!set.contains(i-1)){
//                 int cnt=1;
//                 while(set.contains(i+1)){
//                     cnt++;
//                     i=i+1;
//                 }
//                 max=Math.max(max,cnt);
//             }
//         }
//         return max;



//     }
// }


// i=7
// sout(i++)-> print 7  i=8

// i=i+1
// sout(i)-> 8

// class Solution {
//     public boolean isPalindrome(String s) {
//         // cleaning of string
//         StringBuilder sb=new StringBuilder();
//         int i=0;
//         int n =s.length();
//         while(i<n){
//             char ch=s.charAt(i);
//             if(Character.isLetter(ch)||Character.isDigit(ch))sb.append(Character.toLowerCase(ch));
//             i++;
//         }

//         // palindrome checking -> stack , 2 pointer , reverse use 
//         String og=sb.toString();
//         String rev=sb.reverse().toString();
//         return og.equals(rev);
//     }
// }