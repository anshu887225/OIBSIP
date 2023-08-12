public class Main {
  public static void main(String[] args) {
    int a, b, ch;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number");
    a = sc.nextInt();
    System.out.println("Enter the second number");
    b = sc.nextInt();
    System.out.println("Enter choice ->1 ,add;2->substract;3-> multiply; 4->divide");
    ch = sc.nextInt();
    switch (ch) {
      case 1:
        System.out.println("addition:" + a + b);
        break;
      case 2:
        System.out.println("Subtraction:" + (a - b));
        break;
      case 3:
        System.out.println("Multiplication:" + a * b);
        break;
      case 4:
        System.out.println("division:" + a / b);
        break;
      default:
        System.out.println("invalid");

    }
  }
}
