import java.util.Scanner;

public class ChemFun {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("\nEnter atomic number: ");
    int inp = sc.nextInt();

    String dict[][] = {
      { "Hydrogen", "H", "1", "1" },
      { "Helium", "He", "4", "2" },
      { "Lithium", "Li", "6", "2, 1" }, //and so on

    };

    switch(inp) {
      case 1:
        System.out.println("\nElement: Hydrogen");
        System.out.println("Symbol: H");
        System.out.println("Atomic weight: 1");
        System.out.println("Electronic config: 1");
        break;
      case 2:
        System.out.println("\nElement: Helium");
        System.out.println("Symbol: He");
        System.out.println("Atomic weight: 4");
        System.out.println("Electronic config: 2");
        break;
    }
  }
}
