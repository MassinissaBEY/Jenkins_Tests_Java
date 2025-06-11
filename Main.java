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
    try {
      // Vérification de la présence suffisante d'arguments
      if (args.length < 3) {
        System.out.println("Erreur : Il manque des arguments. Syntaxe : java Main <int1> <int2> <op>");
        System.exit(-1);
      }

      // Parsing des deux premiers arguments
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);
      String op = args[args.length - 1];

      if (op.equals("+")) {
        System.out.println(a + b);
      } else if (op.equals("-")) {
        System.out.println(a - b);
      } else if (op.equals("*")) {
        System.out.println(a * b);
      } else if (op.equals("/")) {
        if (b != 0) {
          System.out.println(a / b);
        } else {
          System.out.println("Division par zéro interdite");
        }
      } else {
        System.out.println("Erreur : Opérateur non reconnu");
        System.exit(-1);
      }
    } catch (NumberFormatException e) {
      System.out.println("Erreur : Les deux premiers arguments doivent être des entiers valides");
      System.exit(-1);
    }
  }
}
