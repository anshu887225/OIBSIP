 public static void main(String[] args) {
    int a, b, ch;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number");
    a = sc.nextInt();
    System.out.println("Enter the second number");
    b = sc.nextInt();
    System.out.println("Enter choice ->1 ,add;2->substract;3-> multiply; 4->divide");
    ch = sc.nextInt();

    if (ch == 1)
      System.out.println("a+b:" + (a + b));
    else if (ch == 2)
      System.out.println("a-b:" + (a - b));
    else if (ch == 3)
      System.out.println("a*b:" + (a * b));
    else if (ch == 4)
      System.out.println("a/b:" + (a / b));
    else
      System.out.println("no is invalid");

  }
}
