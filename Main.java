// class Main {
//   public static void main(String[] args) {
//     if (args[(args.length - 1)].equals("+")) {
//       System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
//     } else if (args[(args.length - 1)].equals("-")) {
//       System.out.println(Integer.parseInt(args[0]) - Integer.parseInt(args[1]));
//     } else if (args[(args.length - 1)].equals("*")) {
//       System.out.println(Integer.parseInt(args[0]) * Integer.parseInt(args[1]));
//     } else if (args[(args.length - 1)].equals("/")) {
//       if (Integer.parseInt(args[1]) != 0) { 
//         System.out.println(Integer.parseInt(args[0]) / Integer.parseInt(args[1]));
//       } else {
//         System.out.println("Division par zéro interdite");
//       }
//     } else {
//       System.exit(-1);
//     }
//   }
// }


class Main {
  public static void main(String[] args) {
    if (args.length != 3) {
      System.err.println("Erreur : Il faut 3 arguments : <int1> <int2> <op>");
      System.exit(1);
    }

    int a = 0, b = 0;
    try {
      a = Integer.parseInt(args[0]);
      b = Integer.parseInt(args[1]);
    } catch (NumberFormatException e) {
      System.err.println("Erreur : Les deux premiers arguments doivent être des entiers valides");
      System.exit(1);
    }

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
        if (b == 0) {
          System.out.println("Division par zéro interdite");
        } else {
          System.out.println(a / b);
        }
        break;
      default:
        System.err.println("Erreur : Opérateur non reconnu");
        System.exit(1);
    }
  }
}
