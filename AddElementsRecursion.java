import java.util.Stack;

public class AddElementsRecursion {
    public static void main(String[] args) {
        //addElements();
        //multiplyEleven();
        //findIslands();
        //ReverseArray();
        //findUpperLetter();
        //FibonacciSequence();

        //using polymorphism we can have the user only acess certain methods
        //bob.add and bob.subtract won't work
    /*Stack<Integer> stack1 = new Stack<Integer>();
    stack1.push(1);
    stack1.push(2);
    stack1.push(3);
    stack1.push(4);

    Stack<Integer> stack2 = new Stack<Integer>();
    for(int i = 0; i < stack1.size()+3; i++) {
        stack2.push(stack1.pop());
    }*/
        //System.out.println(stack2);

        int[] a = {13, 12, 45, 23, 34};
        Stack<Node2> stack = new Stack<>();
        for (int i = 0; i < a.length; i++) {
            int element = a[i];
            int min = element;
            if (!stack.isEmpty()) {
                min = findMinimum(stack.peek(), element);
            }
            Node2<Integer> ved = new Node2<>(element, min);
            stack.push(ved);
        }
        System.out.println(stack);
        System.out.println("Min: "+stack.peek().getMin());

        FixedStack[] ved = new FixedStack[3];
        for (int i = 0; i < ved.length; i++) {
            ved[i] = new FixedStack(5);
        }
        for (int i = 0; i <5 ; i++) {
            ved[0].push(i);
        }
        System.out.println(ved[0]);
        MyStack bob = new MyStack(5);
        for (int i = 0; i < 15; i++) {
            bob.insert(i);
        }
        System.out.println(bob);
    }

    private static int findMinimum(Node2<Integer> node, int element) {
        if(node.getMin() < element) {
            return node.getMin();
        }
        return element;
    }


    //recursion is reducing the problem by one, recursion should have start and end parameters when working with arrays
    /*private static void addElements() {
        int a[] = {11, 12, 31, 14, 51};
        int start = 0;
        int end = a.length - 1;
        int result = sum(a, start, end);
        System.out.println(result);
    }

     */
    public boolean checkIfPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    private static void FibonacciSequence() {
        int n = 5;
        System.out.println(Fibonacci(n));
    }

    private static int Fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int oneBack = Fibonacci(n - 1);
        int twoBack = Fibonacci(n - 2);
        return oneBack + twoBack;
    }

    private static void multiplyEleven() {
        int a[] = {1, 2, 3, 4, 5};
        int start = 0;
        int end = a.length - 1;
        multiply(a, start, end);
        printArray(a, start, end);
    }

    private static void findIslands() {
        int a[][] = {{0, 1, 0},
                {1, 0, 1},
                {0, 1, 0}
        };
        int rowStart = 0;
        int colStart = 0;
        int colEnd = a[0].length - 1;
        int rowEnd = a.length - 1;
        int res = island(a, rowStart, colStart, rowEnd, colEnd);
        System.out.println(res);
    }

    private static int island(int[][] a, int rowStart, int colStart, int rowEnd, int colEnd) {
        int ele = a[rowStart][colStart];
        if (ele == 1) {
            result++;
        }
        if (colStart == colEnd) {
            return 0;
        }
        int remainingColums = island(a, rowStart, colStart + 1, rowEnd, colEnd);
        result = remainingColums + ele;
        if (rowStart == rowEnd) {
            return 0;
        }
        int remainingRows = island(a, rowStart + 1, 0, rowEnd, colEnd);
        result = result + remainingRows;
        return result;
    }

    private static int result = 0;

    private static void ReverseArray() {
        int[] a = {1, 2, 3, 4, 5};
        int start = 0;
        int end = a.length - 1;
        reverse(a, start, end);
        printArray(a, start, end);
    }

    private static void findUpperLetter() {
        String s = "abCdEf";
        char[] chars = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        findUpper(chars, start, end);

    }

    private static void findUpper(char[] chars, int start, int end) {
        int ele = chars[start];
        if (Character.toUpperCase(ele) == ele) {
            System.out.println(start);
            return;
        }
        if (start == end) {
            return;
        }
        findUpper(chars, start + 1, end);
    }

    private static void reverse(int[] a, int start, int end) {
        int i = 0;
        int ele = a[start];
        a[start] = a[end];
        a[end] = ele;
        if (start >= end) {
            return;
        }
        reverse(a, start + 1, end - 1);
    }

    private static void multiply(int[] a, int start, int end) {
        int ele = a[start];
        a[start] = ele * 11;
        if (start == end) {
            return;
        }
        multiply(a, start + 1, end);
    }

    private static void printArray(int[] a, int start, int end) {
        int ele = a[start];
        System.out.println(ele);
        if (start == end) {
            return;
        }
        printArray(a, start + 1, end);
    }

    private static int sum(int[] a, int start, int end) {
        if (a.length == 0) {
            return 0;
        }
        if (start == end) {
            return a[start];
        }
        int mid = (end + start) / 2;
        int midEle = a[mid];

        int finalResult = midEle;

        if (mid > start) {
            int left = sum(a, start, mid - 1);
            finalResult += left;
        }
        if ((mid + 1) < end) {
            int right = sum(a, mid + 1, end);
            finalResult += right;
        }
        return finalResult;


    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

}

