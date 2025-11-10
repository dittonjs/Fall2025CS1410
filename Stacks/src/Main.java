public class Main {

    public static void main(String[] args) {
//        String validText = "({}{}{(()()()[])})";
//        String validText = "((((((((";
//        String validText = "}}";
        String validText = "";
        Stack<Character> stack = new Stack<>();
        boolean isValid = true;
        try {
            for (char c: validText.toCharArray()) {
                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                } else if (
                        (c == ')' && stack.pop() != '(') ||
                        (c == '}' && stack.pop() != '{') ||
                        (c == ']' && stack.pop() != '[')
                ) {
                    isValid = false;
                }
            }
            if (!stack.isEmpty()) {
                isValid = false;
            }
        } catch (Stack.StackEmptyException e) {
            isValid = false;
        }

        System.out.println(isValid);
    }
}
