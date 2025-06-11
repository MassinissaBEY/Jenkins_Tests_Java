class Main {
  public static void main(String[] args) {
    if (args[(args.length - 1)].equals("+")) {
      System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
    } else if (args[(args.length - 1)].equals("-")) {
      System.out.println(Integer.parseInt(args[0]) - Integer.parseInt(args[1]));
    } else if (args[(args.length - 1)].equals("*")) {
      System.out.println(Integer.parseInt(args[0]) * Integer.parseInt(args[1]));
    } else if (args[(args.length - 1)].equals("/")) {
      if (Integer.parseInt(args[1]) != 0) { 
        System.out.println(Integer.parseInt(args[0]) / Integer.parseInt(args[1]));
      } else {
        System.out.println("Division par zéro interdite");
      }
    } else {
      System.exit(-1);
    }
  }
}
