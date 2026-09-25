class Solution {
    public boolean isValid(String s) {
        Stack<Character> temp = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            char current = s.charAt(i);
            switch (current){
                case '(':
                    temp.push(current);
                    break;
                case '[':
                    temp.push(current);
                    break;
                case '{':
                    temp.push(current);
                    break;
                case ')':
                    if (!temp.isEmpty() && temp.peek() == '('){temp.pop(); break;}
                    else{return false;}
                case ']':
                    if (!temp.isEmpty() && temp.peek() == '['){temp.pop(); break;}
                    else{return false;}
                case '}':
                    if (!temp.isEmpty() && temp.peek() == '{'){temp.pop(); break;}
                    else{return false;}
                default:
                    return false;
            }
        }
        return (temp.isEmpty());
    }
}
