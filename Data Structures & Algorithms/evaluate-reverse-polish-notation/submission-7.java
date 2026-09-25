class Solution {
    public int evalRPN(String[] tokens) {
        int ans = 0;
        Stack<Integer> temp = new Stack<>();
        for (int i = 0; i < tokens.length; i++){
            String curr = tokens[i];
            switch(curr){
                case "+":
                    temp.push(temp.pop() + temp.pop());
                    break;
                case "-":
                    int temp2 = temp.pop();
                    int temp3 = temp.pop();
                    temp.push(temp3-temp2);
                    break;
                case "*":
                    temp.push(temp.pop() * temp.pop());
                    break;
                case "/":
                    int temp4 = temp.pop();
                    int temp5 = temp.pop();
                    temp.push(temp5 / temp4);
                    break;
                default:
                    temp.push(Integer.parseInt(curr));
                    break;
            }
        }
        return temp.pop();
    }
}
