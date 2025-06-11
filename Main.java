class Main {
  public static void main(String[] args) {
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    String op = args[2];
    
    switch(op) {
      case "+":
        System.out.println(a + b);
        break;
      case "-":
        System.out.println(a - b);
        break;
      case "*":
        System.out.println(a * b);
        break;
      case "/":
        if (b != 0) {
          System.out.println(a / b);
        } else {
          System.out.println("Division par zéro interdite");
          System.exit(-1);
        }
        break;
      default:
        System.out.println("Opérateur non reconnu");
        System.exit(-1);
    }
  }
}
