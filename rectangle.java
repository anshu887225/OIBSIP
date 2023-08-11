public class Main {
  public static void main(String[] args) throws IOException {
    int len, br, area, Parameter;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number");
    len = sc.nextInt();
    System.out.println("Enter second number");
    br = sc.nextInt();
    area = len * br;
    Parameter = 2 * (len + br);
    System.out.println("area" + area);
    System.out.println("parameters:" + Parameter);

  }
}
