public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.forEach(System.out::println);
        int poppedValue = stack.pop();
        System.out.println("Deleted: " + poppedValue);
        System.out.println("Is empty: " + stack.isEmpty());
        stack.clear();
        System.out.println("is empty after clear: " + stack.isEmpty());
    }
}
