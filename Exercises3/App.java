// Array implementation of Stack
public class App {
    public static void main(String[] args) {
  
      // Create new Stack Object
      Stack Nikeshoes_stack = new Stack(5);
  
      // Insert new elements into the stack
      Nikeshoes_stack.push("Blue shoes");
      Nikeshoes_stack.push("Red shoes");
      Nikeshoes_stack.push("Yellow shoes");
      Nikeshoes_stack.push("Green Shoes");
  
      // Show the size of the stack
      System.out.println("The size of the stack is: " + Nikeshoes_stack.size());
  
      // Show top element in the stack
      System.out.println("The top of the stack is: " + Nikeshoes_stack.peek());
  
      // Remove top element in the stack
      Nikeshoes_stack.pop();
  
      System.out.println("After pop");
  
      // Show all elements in Stack
      Nikeshoes_stack.printStack();
  
      // Show top element in the stack
      System.out.println("The top of the stack is: " + Nikeshoes_stack.peek());
    }
  }
