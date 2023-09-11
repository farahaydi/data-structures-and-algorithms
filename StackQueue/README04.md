# Code Challenge: Class 13
The BracketValidator class checks for balanced brackets in a string using a stack-based algorithm. It iterates through characters, handling opening and closing brackets, ensuring they match. If mismatches or unmatched brackets occur, it returns false. After processing, if no unmatched opening brackets remain, it returns true. The class also includes a main method with test cases for demonstration.

## Whiteboard Process
[cc13](./Screenshot%20(469).png)

## Approach & Efficiency
Approach & Efficiency
In the BracketValidator class, I implemented an efficient algorithm using a stack data structure. This approach has a time complexity of O(n), where n is the length of the input string. The algorithm iterates through each character in the string once, performing constant-time operations for each character.

The space complexity is also O(n) because in the worst case, all opening brackets may be pushed onto the stack before any closing brackets are encountered. This results in the stack having a maximum of n/2 elements, where n is the length of the input string.

## Solution

```
 public static boolean validateBrackets(String input) {
        charStack stack = new charStack();

        for (char c : input.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((c == ')' && top != '(') ||
                        (c == ']' && top != '[') ||
                        (c == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
```

- call the method ->validateBrackets
- it's take a String arg -> validateBrackets("()")
-the return value for this method is boolean so to see the result you can print it        
  - System.out.println(validateBrackets("{}"));

