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

