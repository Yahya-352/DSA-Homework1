

//we should have a stack of characters...
// we add to it the character and loop through the string to check if there
//is the opposing character
//if it is there then we have to remove(pop) the opening
// bracket.. if reached the end and stack
//is not empty ..then return false (because no corresponding bracket)

class Excercise2 {
    public static boolean isValid(String s) {
        SingleArrayStack st = new SingleArrayStack(s.length());

        for(int i = 0;i <= s.length() -1 ;i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                st.push(s.charAt(i));
            }else{
                if(st.isEmpty()){
                    return false;
                }
                if(s.charAt(i) == ')' && st.top() == '('){
                    st.pop();
                }else if(s.charAt(i) == '}' && st.top() == '{'){
                    st.pop();
                }else if(s.charAt(i) == ']' && st.top() == '['){
                    st.pop();
                }else{
                    return false;
                }
            }
        }
        if(st.isEmpty()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "()[]{}";
        String str1 = "([)]";
        String str2 = "([)]";
        String str3 = "([])";
        System.out.println(isValid(str));
        System.out.println(isValid(str1));
        System.out.println(isValid(str2));
        System.out.println(isValid(str3));


    }
}

