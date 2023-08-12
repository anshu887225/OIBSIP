 public static void main(String[] args) {

    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the value of n");
    n = sc.nextInt();

    int i = 1;
    while (i <= n) {
      System.out.println("natural number" + " " + i);
      i = i + 1;
    }

  }
}


// sum of n natural number
int n, add = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the value of n");
    n = sc.nextInt();

    int i = 1;
    while (i <= n) {
      add = add + i;
      System.out.println(" sum of natural number" + " " + add);
      i = i + 1;
    }


output
 1
 3
 6
 10
