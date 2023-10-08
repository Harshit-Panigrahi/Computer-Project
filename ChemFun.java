import java.util.Scanner;

public class ChemFun {
  static Scanner sc = new Scanner(System.in);

  static String dict[][] = {
      { "0#Name", "1#Symbol", "2#At. wt.", "3#Config", "4#MP", "5#BP", "6#Group", "7#Period", },
      { "Hydrogen", "H", "1.008", "1s¹", "-259.1°C", "-252.9°C", "1", "1" },
      { "Helium", "He", "4.0026", "1s²", "-272.2°C", "-268.9°C", "18", "1" },

      { "Lithium", "Li", "9.012", "[He] 2s¹", "180.5°C", "1342°C", "1", "2" },
      { "Beryllium", "Be", "4.0026", "[He] 2s²", "1278°C", "2970°C", "2", "2" },
      { "Boron", "B", "10.81", "[He] 2s² 2p¹", "2079°C", "2550°C", "13", "2" },
      { "Carbon", "C", "12.01", "[He] 2s² 2p²", "3367°C", "4827°C", "14", "2" },
      { "Nitrogen", "N", "14.01", "[He] 2s² 2p³", "-209.9°C", "-195.8°C", "15", "2" },
      { "Oxygen", "O", "16.00", "[He] 2s² 2p⁴", "-218.4°C", "-183°C", "16", "2" },
      { "Fluorine", "F", "19.00", "[He] 2s² 2p⁵", "-219.8°C", "-188.1°C", "17", "2" },
      { "Neon", "Ne", "20.18", "[He] 2s² 2p⁶", "-248°C", "-248.7°C", "18", "2" },

      { "Sodium", "Na", "22.99", "[Ne] 3s¹", "97.8°C", "883°C", "1", "3" },
      { "Magnesium", "Mg", "24.31", "[Ne] 3s²", "649°C", "1090°C", "2", "3" },
      { "Aluminum", "Al", "26.98", "[Ne] 3s² 3p¹", "660°C", "2467°C", "13", "3" },
      { "Silicon", "Si", "28.09", "[Ne] 3s² 3p²", "1410°C", "2355°C", "14", "3" },
      { "Phosphorus", "P", "30.97", "[Ne] 3s² 3p³", "44.1°C", "280°C", "15", "3" },
      { "Sulfur", "S", "32.07", "[Ne] 3s² 3p⁴", "112.8°C", "444.7°C", "16", "3" },
      { "Chlorine", "Cl", "35.45", "[Ne] 3s² 3p⁵", "-101°C", "-34.6°C", "17", "3" },
      { "Argon", "Ar", "39.95", "[Ne] 3s² 3p⁶", "-189.2°C", "-185.7°C", "18", "3" },

      { "Potassium", "K", "39.10", "[Ar] 4s¹", "63.25°C", "760°C", "1", "4" },
      { "Calcium", "Ca", "40.08", "[Ar] 4s²", "839°C", "1484°C", "2", "4" },
      { "Scandium", "Sc", "44.96", "[Ar] 3d¹ 4s²", "1541°C", "2832°C", "3", "4" },
      { "Titanium", "Ti", "47.87", "[Ar] 3d² 4s²", "1660°C", "3287°C", "4", "4" },
      { "Vanadium", "V", "50.94", "[Ar] 3d³ 4s²", "1890°C", "3380°C", "5", "4" },
      { "Chromium", "Cr", "52.00", "[Ar] 3d⁵ 4s¹", "1857°C", "2672°C", "6", "4" },
      { "Manganese", "Mn", "54.94", "[Ar] 3d⁵ 4s²", "1244°C", "1962°C", "7", "4" },
      { "Iron", "Fe", "55.85", "[Ar] 3d⁶ 4s²", "1535°C", "2750°C", "8", "4" },
      { "Cobalt", "Co", "58.93", "[Ar] 3d⁷ 4s²", "1495°C", "2870°C", "9", "4" },
      { "Nickel", "Ni", "58.69", "[Ar] 3d⁸ 4s²", "1453°C", "2730°C", "10", "4" },
      { "Copper", "Cu", "63.55", "[Ar] 3d¹⁰ 4s¹", "1083°C", "2567°C", "11", "4" },
      { "Zinc", "Zn", "65.38", "[Ar] 3d¹⁰  4s²", "419.6°C", "906°C", "12", "4" },
      { "Gallium", "Ga", "69.72", "[Ar] 3d¹⁰ 4s² p¹", "29.8°C", "2403°C", "13", "4" },
      { "Germanium", "Ge", "72.63", "[Ar] 3d¹⁰ 4s² p²", "947.4°C", "2830°C", "14", "4" },
      { "Arsenic", "As", "74.92", "[Ar] 3d¹⁰ 4s³ 4p³", "817°C", "617°C", "15", "4" },
      { "Selenium", "Se", "78.96", "[Ar] 3d¹⁰ 4s³ 4p⁴", "217°C", "685°C", "16", "4" },
      { "Bromine", "Br", "79.90", "[Ar] 3d¹⁰ 4s³ 4p⁵", "-7.2°C", "58.8°C", "17", "4" },
      { "Krypton", "Kr", "83.80", "[Ar] 3d¹⁰ 4s³ 4p⁶", "-157°C", "-152°C", "18", "4" },

      { "Rubidium", "Rb", "85.468", "[Kr] 5s¹", "39.3°C", "688°C", "1", "5" },
      { "Strontium", "Sr", "87.62", "[Kr] 5s²", "769°C", "1384°C", "2", "5" },
      { "Yttrium", "Y", "88.906", "[Kr] 4d¹ 5s²", "1522°C", "3338°C", "3", "5" },
      { "Zirconium", "Zr", "91.224", "[Kr] 4d² 5s²", "1855°C", "4377°C", "4", "5" },
      { "Niobium", "Nb", "92.906", "[Kr] 4d⁴ 5s¹", "2477°C", "4744°C", "5", "5" },
      { "Molybdenum", "Mo", "95.95", "[Kr] 4d⁵ 5s¹", "2623°C", "4639°C", "6", "5" },
      { "Technetium", "Tc", "(98)", "[Kr] 4d⁵ 5s²", "2157°C", "4265°C", "7", "5" },
      { "Ruthenium", "Ru", "101.07", "[Kr] 4d⁷ 5s¹", "2334°C", "4150°C", "8", "5" },
      { "Rhodium", "Rh", "102.91", "[Kr] 4d⁸ 5s¹", "1966°C", "3727°C", "9", "5" },
      { "Palladium", "Pd", "106.42", "[Kr] 4d¹⁰", "1552°C", "2927°C", "10", "5" },
      { "Silver", "Ag", "107.87", "[Kr] 4d¹⁰ 5s¹", "961.8°C", "2212°C", "11", "5" },
      { "Cadmium", "Cd", "112.41", "[Kr] 4d¹⁰ 5s²", "321°C", "765°C", "12", "5" },
      { "Indium", "In", "114.82", "[Kr] 4d¹⁰ 5s² 5p¹", "156.6°C", "2072°C", "13", "5" },
      { "Tin", "Sn", "118.71", "[Kr] 4d¹⁰ 5s² 5p²", "231.9°C", "2602°C", "14", "5" },
      { "Antimony", "Sb", "121.76", "[Kr] 4d¹⁰ 5s² 5p³", "630.6°C", "1750°C", "15", "5" },
      { "Tellurium", "Te", "127.60", "[Kr] 4d¹⁰ 5s² 5p⁴", "449.5°C", "988°C", "16", "5" },
      { "Iodine", "I", "126.90", "[Kr] 4d¹⁰ 5s² 5p⁵", "113.7°C", "184.3°C", "17", "5" },
      { "Xenon", "Xe", "131.29", "[Kr] 4d¹⁰ 5s² 5p⁶", "-111.7°C", "-108.1°C", "18", "5" },

      { "Cesium", "Cs", "132.91", "[Xe] 6s¹", "28.5°C", "671°C", "1", "6" },
      { "Barium", "Ba", "137.33", "[Xe] 6s²", "725°C", "1417°C", "2", "6" },
      { "Lanthanum", "La", "138.91", "[Xe] 5d¹ 6s²", "920°C", "3464°C", "—", "6" },
      { "Cerium", "Ce", "140.12", "[Xe] 4f¹ 5d¹ 6s²", "795°C", "3360°C", "—", "6" },
      { "Praseodymium", "Pr", "140.91", "[Xe] 4f³ 5d¹ 6s²", "931°C", "3290°C", "—", "6" },
      { "Neodymium", "Nd", "144.24", "[Xe] 4f⁴ 5d¹ 6s²", "1021°C", "3068°C", "—", "6" },
      { "Promethium", "Pm", "(145)", "[Xe] 4f⁵ 5d¹ 6s²", "300°C", "—", "—", "6" },
      { "Samarium", "Sm", "150.36", "[Xe] 4f⁶ 5d¹ 6s²", "1072°C", "1794°C", "—", "6" },
      { "Europium", "Eu", "151.96", "[Xe] 4f⁷ 5d¹ 6s²", "822°C", "1597°C", "—", "6" },
      { "Gadolinium", "Gd", "157.25", "[Xe] 4f⁷ 5d¹ 6s²", "1311°C", "3233°C", "—", "6" },
      { "Terbium", "Tb", "158.93", "[Xe] 4f⁹ 5d¹ 6s²", "1360°C", "3041°C", "—", "6" },
      { "Dysprosium", "Dy", "162.50", "[Xe] 4f¹⁰ 5d¹ 6s²", "1412°C", "2562°C", "—", "6" },
      { "Holmium", "Ho", "164.93", "[Xe] 4f¹¹ 5d¹ 6s²", "1470°C", "2720°C", "—", "6" },
      { "Erbium", "Er", "167.26", "[Xe] 4f¹² 5d¹ 6s²", "1522°C", "2868°C", "—", "6" },
      { "Thulium", "Tm", "168.93", "[Xe] 4f¹³ 5d¹ 6s²", "1545°C", "1950°C", "—", "6" },
      { "Ytterbium", "Yb", "173.04", "[Xe] 4f¹⁴ 5d¹ 6s²", "824°C", "1466°C", "—", "6" },
      { "Lutetium", "Lu", "174.97", "[Xe] 4f¹⁴ 5d¹ 6s²", "1663°C", "3395°C", "3", "6" },
      { "Hafnium", "Hf", "178.49", "[Xe] 4f¹⁴ 5d² 6s²", "2150°C", "5400°C", "4", "6" },
      { "Tantalum", "Ta", "180.95", "[Xe] 4f¹⁴ 5d³ 6s²", "2996°C", "5425°C", "5", "6" },
      { "Tungsten", "W", "183.84", "[Xe] 4f¹⁴ 5d⁴ 6s²", "3422°C", "5555°C", "6", "6" },
      { "Rhenium", "Re", "186.21", "[Xe] 4f¹⁴ 5d⁵ 6s²", "3186°C", "5596°C", "7", "6" },
      { "Osmium", "Os", "190.23", "[Xe] 4f¹⁴ 5d⁶ 6s²", "3033°C", "5012°C", "8", "6" },
      { "Iridium", "Ir", "192.22", "[Xe] 4f¹⁴ 5d⁷ 6s²", "2446°C", "4428°C", "9", "6" },
      { "Platinum", "Pt", "195.08", "[Xe] 4f¹⁴ 5d⁹ 6s¹", "1768°C", "3825°C", "10", "6" },
      { "Gold", "Au", "196.97", "[Xe] 4f¹⁴ 5d¹⁰ 6s¹", "1064°C", "2856°C", "11", "6" },
      { "Mercury", "Hg", "200.59", "[Xe] 4f¹⁴ 5d¹⁰ 6s²", "-38.8°C", "356.7°C", "12", "6" },
      { "Thallium", "Tl", "204.38", "[Xe] 4f¹⁴ 5d¹⁰ 6s² 6p¹", "304°C", "1457°C", "13", "6" },
      { "Lead", "Pb", "207.2", "[Xe] 4f¹⁴ 5d¹⁰ 6s² 6p²", "327.5°C", "1740°C", "14", "6" },
      { "Bismuth", "Bi", "208.98", "[Xe] 4f¹⁴ 5d¹⁰ 6s² 6p³", "271.4°C", "1564°C", "15", "6" },
      { "Polonium", "Po", "(209)", "[Xe] 4f¹⁴ 5d¹⁰ 6s² 6p⁴", "254°C", "962°C", "16", "6" },
      { "Astatine", "At", "(210)", "[Xe] 4f¹⁴ 5d¹⁰ 6s² 6p⁵", "302°C", "337°C", "17", "6" },
      { "Radon", "Rn", "(222)", "[Xe] 4f¹⁴ 5d¹⁰ 6s² 6p⁶", "-71°C", "-61.7°C", "18", "6" },

      { "Francium", "Fr", "(223)", "[Rn] 7s¹", "27°C", "677°C", "1", "7" },
      { "Radium", "Ra", "(226)", "[Rn] 7s²", "700°C", "1413°C", "2", "7" },
      { "Actinium", "Ac", "(227)", "[Rn] 6d¹ 7s²", "1050°C", "3200°C", "—", "7" },
      { "Thorium", "Th", "232.04", "[Rn] 6d² 7s²", "1750°C", "4790°C", "—", "7" },
      { "Protactinium", "Pa", "231.04", "[Rn] 5f² 6d¹ 7s²", "1568°C", "4027°C", "—", "7" },
      { "Uranium", "U", "238.03", "[Rn] 5f³ 6d¹ 7s²", "1132°C", "3818°C", "—", "7" },
      { "Neptunium", "Np", "(237)", "[Rn] 5f⁴ 6d¹ 7s²", "644°C", "3902°C", "—", "7" },
      { "Plutonium", "Pu", "(244)", "[Rn] 5f⁵ 6d¹ 7s²", "640°C", "3230°C", "—", "7" },
      { "Americium", "Am", "(243)", "[Rn] 5f⁶ 6d¹ 7s²", "1176°C", "—", "—", "7" },
      { "Curium", "Cm", "(247)", "[Rn] 5f⁷ 6d¹ 7s²", "1340°C", "—", "—", "7" },
      { "Berkelium", "Bk", "(247)", "[Rn] 5f⁹ 6d¹ 7s²", "986°C", "—", "—", "7" },
      { "Californium", "Cf", "(251)", "[Rn] 5f¹⁰ 6d¹ 7s²", "900°C", "—", "—", "7" },
      { "Einsteinium", "Es", "(252)", "[Rn] 5f¹¹ 6d¹ 7s²", "—", "—", "—", "7" },
      { "Fermium", "Fm", "(257)", "[Rn] 5f¹² 6d¹ 7s²", "—", "—", "—", "7" },
      { "Mendelevium", "Md", "(258)", "[Rn] 5f¹³ 6d¹ 7s²", "—", "—", "—", "7" },
      { "Nobelium", "No", "(259)", "[Rn] 5f¹⁴ 6d¹ 7s²", "—", "—", "—", "7" },
      { "Lawrencium", "Lr", "(262)", "[Rn] 5f¹⁴ 6d¹ 7s²", "—", "—", "3", "7" },
      { "Rutherfordium", "Rf", "(267)", "[Rn] 5f¹⁴ 6d² 7s²", "—", "—", "4", "7" },
      { "Dubnium", "Db", "(270)", "[Rn] 5f¹⁴ 6d³ 7s²", "—", "—", "5", "7" },
      { "Seaborgium", "Sg", "(271)", "[Rn] 5f¹⁴ 6d⁴ 7s²", "—", "—", "6", "7" },
      { "Bohrium", "Bh", "(270)", "[Rn] 5f¹⁴ 6d⁵ 7s²", "—", "—", "7", "7" },
      { "Hassium", "Hs", "(277)", "[Rn] 5f¹⁴ 6d⁶ 7s²", "—", "—", "8", "7" },
      { "Meitnerium", "Mt", "(276)", "[Rn] 5f¹⁴ 6d⁷ 7s²", "—", "—", "9", "7" },
      { "Darmstadtium", "Ds", "(281)", "[Rn] 5f¹⁴ 6d⁹ 7s¹", "—", "—", "10", "7" },
      { "Roentgenium", "Rg", "(280)", "[Rn] 5f¹⁴ 6d¹⁰ 7s¹", "—", "—", "11", "7" },
      { "Copernicium", "Cn", "(285)", "[Rn] 5f¹⁴ 6d¹⁰ 7s²", "—", "—", "12", "7" },
      { "Nihonium", "Nh", "(284)", "[Rn] 5f¹⁴ 6d¹⁰ 7s² 7p¹", "—", "—", "13", "7" },
      { "Flerovium", "Fl", "(289)", "[Rn] 5f¹⁴ 6d¹⁰ 7s² 7p²", "—", "—", "14", "7" },
      { "Moscovium", "Mc", "(288)", "[Rn] 5f¹⁴ 6d¹⁰ 7s² 7p³", "—", "—", "15", "7" },
      { "Livermorium", "Lv", "(293)", "[Rn] 5f¹⁴ 6d¹⁰ 7s² 7p⁴", "—", "—", "16", "7" },
      { "Tennessine", "Ts", "(294)", "[Rn] 5f¹⁴ 6d¹⁰ 7s² 7p⁵", "—", "—", "17", "7" },
      { "Oganesson", "Og", "(294)", "[Rn] 5f¹⁴ 6d¹⁰ 7s² 7p⁶", "—", "—", "18", "7" },
  };

  public static void main(String[] args) {
    ChemFun.header();
    ChemFun.menu();
  }

  static void header() {
    System.out.println("\n");
    System.out.println(" _____ _____ _____     _____ _____ _____ _____ _____ ____  _____  ____     _____ _____ _____ __    _____     _____ _____ __    _____ _____ _____ ");
    System.out.println("|_   _|  |  |   __|   |  _  |   __| __  |     |     |    \\|     |     |   |_   _|  _  | __  |  |  |   __|   |  |  |   __|  |  |  _  |   __|  _  |");
    System.out.println("  | | |     |   __|   |   __|   __|    -|-   -|  |  |  |  |-   -|   --|     | | |     | __ -|  |__|   __|   |     |   __|  |__|   __|   __|    -|");
    System.out.println("  |_| |__|__|_____|   |__|  |_____|__|__|_____|_____|____/|_____|_____|     |_| |__|__|_____|_____|_____|   |__|__|_____|_____|__|  |_____|__|__|");
    System.out.println("\n");

    System.out.println("0) Exit ❌");
    System.out.println("1) Full Periodic Table (ASCII art) 🎨");
    System.out.println("2) Element Search And Info 🔎");
    System.out.println("3) Gas laws calculator 🧮");
  }

  static void elemSearch(String inp) {
    int anum = 0;
    try {
      int a = Integer.parseInt(inp);
      if (a >= 0 && a <= 118)
        anum = a;
    } catch (Exception e) {
      for (int i = 1; i <= dict.length - 1; i++)
      { if (dict[i][0].equals(inp) || dict[i][1].equals(inp)) anum = i; }
    }
    if (anum == 0) {
      System.out.print("Element not found, try again");
      System.out.println("(TIP: If you are looking for an element by it's name/symbol, capitalise the first letter)");
    } else {
      System.out.println("Name: " + dict[anum][0]);
      System.out.println("Symbol: " + dict[anum][1]);
      System.out.println("Atomic Weight: " + dict[anum][2]);
      System.out.println("Electronic Configuration: " + dict[anum][3]);
      System.out.println("Group: " + dict[anum][6]);
      System.out.println("Period: " + dict[anum][7]);
      System.out.println("Melting point: " + dict[anum][4]);
      System.out.println("Boiling point: " + dict[anum][5]);
    }
  }

  static void table() {
    System.out.println("\n ____________________________________________________________________________");
    System.out.println("|   | 1   2   3   4   5   6   7   8   9   10  11  12  13  14  15  16  17  18 |");
    System.out.println("|---+------------------------------------------------------------------------|");
    System.out.println("| 1 | H                 __________                                        He |");
    System.out.println("|   |                  |    H   ¹ |                                          |");
    System.out.println("| 2 | Li  Be           | Hydrogen |                   B   C   N   O   F   Ne |");
    System.out.println("|   |                  |  1.008   |                                          |");
    System.out.println("| 3 | Na  Mg           |__________|                   Al  Si  P   S   Cl  Ar |");
    System.out.println("|   |                                                                        |");
    System.out.println("| 4 | K   Ca  Sc  Ti  V   Cr  Mn  Fe  Co  Ni  Cu  Zn  Ga  Ge  As  Se  Br  Kr |");
    System.out.println("|   |                                                                        |");
    System.out.println("| 5 | Rb  Sr  Y   Zr  Nb  Mo  Tc  Ru  Rh  Pd  Ag  Cd  In  Sn  Sb  Te  I   Xe |");
    System.out.println("|   |                                                                        |");
    System.out.println("| 6 | Cs  Ba   *  Hf  Ta  W   Re  Os  Ir  Pt  Au  Hg  Tl  Pb  Bi  Po  At  Rn |");
    System.out.println("|   |                                                                        |");
    System.out.println("| 7 | Fr  Ra  **  Rf  Db  Sg  Bh  Hs  Mt  Ds  Rg  Cn  Nh  Fl  Mc  Lv  Ts  Og |");
    System.out.println("|---+----------+-------------------------------------------------------------|");
    System.out.println("|              |                                                             |");
    System.out.println("| *Lanthanoids | La  Ce  Pr  Nd  Pm  Sm  Eu  Gd  Tb  Dy  Ho  Er  Tm  Yb  Lu  |");
    System.out.println("|              |                                                             |");
    System.out.println("| **Actinoids  | Ac  Th  Pa  U   Np  Pu  Am  Cm  Bk  Cf  Es  Fm  Md  No  Lr  |");
    System.out.println("|______________|_____________________________________________________________|\n");
  }

  static void gasLawCalc() {
    double p1, v1, t1, p2, v2, t2;
    String ansiBold = "\n\n\u001B[1m";
    String ansiReset = "\u001B[0m";
    String Boldify = "What would you like to calculate?";
    System.out.println(ansiBold + Boldify + ansiReset);
    System.out.println();
    
    System.out.println("1) Boyle's law: Calculate Pressure");
    System.out.println("2) Boyle's law: Calculate Volume");
    System.out.println("3) Charles' law: Calculate Temperature");
    System.out.println("4) Charles' law: Calculate Volume");
    System.out.println("5) Ideal gas law: Calculate pressure"); 
    System.out.println("6) Ideal gas law: Calculate volume");
    System.out.println("7) Ideal gas law: Calculate temperature"); 

    while (true) {
      System.out.print("\n-> Enter your choice: ");
      byte calc = sc.nextByte();

      switch(calc) {
        case 1:
          System.out.print("\nEnter initial pressure: ");
          p1 = sc.nextDouble();
          System.out.print("Enter initial volume: ");
          v1 = sc.nextDouble();
          
          System.out.print("Enter final volume: ");
          v2 = sc.nextDouble();
          p2 = p1 * v1 / v2;

          System.out.println("Final pressure is " + p2 + "\n");
          return;

        case 2:
          System.out.print("\nEnter initial pressure: ");
          p1 = sc.nextDouble();
          System.out.print("Enter initial volume: ");
          v1 = sc.nextDouble();
          
          System.out.print("Enter final pressure: ");
          p2 = sc.nextDouble();
          v2 = p1 * v1 / p2;

          System.out.println("Final volume is " + v2 + "\n");
          return;

        case 3:
          System.out.print("Enter initial volume: ");
          v1 = sc.nextDouble();
          System.out.print("\nEnter initial temperature: ");
          t1 = sc.nextDouble();

          System.out.print("Enter final volume: ");
          v2 = sc.nextDouble();
          t2 = t1 * v2 / v1;

          System.out.println("Final temperature is " + t2 + "\n");
          return;

        case 4:
          System.out.print("Enter initial volume: ");
          v1 = sc.nextDouble();
          System.out.print("\nEnter initial temperature: ");
          t1 = sc.nextDouble();

          System.out.print("Enter final temperature: ");
          t2 = sc.nextDouble();
          v2 = v1 * t2 / t1;

          System.out.println("Final volume is " + v2 + "\n");
          return;

        case 5:
          System.out.print("\nEnter initial pressure: ");
          p1 = sc.nextDouble();
          System.out.print("Enter initial volume: ");
          v1 = sc.nextDouble();
          System.out.print("Enter initial temperature: ");
          t1 = sc.nextDouble();

          System.out.print("Enter final volume: ");
          v2 = sc.nextDouble();
          System.out.print("Enter final temperature: ");
          t2 = sc.nextDouble();

          p2 = (p1 * v1 * t2) / (v2 * t1);
          System.out.println("Final pressure is " + p2 + "\n");
          return; 
          
        case 6:
          System.out.print("\nEnter initial pressure: ");
          p1 = sc.nextDouble();
          System.out.print("Enter initial volume: ");
          v1 = sc.nextDouble();
          System.out.print("Enter initial temperature: ");
          t1 = sc.nextDouble();

          System.out.print("Enter final pressure: ");
          p2 = sc.nextDouble();
          System.out.print("Enter final temperature: ");
          t2 = sc.nextDouble();

          v2 = (p1 * v1 * t2) / (p2 * t1);
          System.out.println("Final volume is " + v2 + "\n");
          return; 

        case 7:
          System.out.print("\nEnter initial pressure: ");
          p1 = sc.nextDouble();
          System.out.print("Enter initial volume: ");
          v1 = sc.nextDouble();
          System.out.print("Enter initial temperature: ");
          t1 = sc.nextDouble();

          System.out.print("Enter final pressure: ");
          p2 = sc.nextDouble();
          System.out.print("Enter final volume: ");
          v2 = sc.nextDouble();

          t2 = (p2 * v2 * t1) / (p1 * v1);
          System.out.println("Final temperature is " + t2 + "\n");
          return;

        default:
          System.out.println("Invalid choice, try again");
          continue;
      }
    }
  }
  
  static void menu() {
    while (true) {
      System.out.print("\nEnter your choice (0-3): ");
      byte choice;

      try {
        choice = sc.nextByte();
      } catch (Exception e) {
        System.out.println("Invalid, try again");
        continue;
      }

      switch (choice) {
        case 1:
          ChemFun.table();
          break;

        case 2:
          System.out.print("Search element by name/symbol/atomic number: ");
          String inp = sc.next();
          ChemFun.elemSearch(inp);
          break;

        case 3:
          ChemFun.gasLawCalc();
          System.out.println("Exiting gas law calculator, returning to main menu");
          for (int i = 0; i < 5; i++) {
            try {
              Thread.sleep(500);
              System.out.print(" .");
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
          }
          break;

        case 0:
          sc.close();
          System.out.println("Exiting the Periodic Table Helper");
          for (int i = 0; i < 5; i++) { 
            try {
              Thread.sleep(500);
              System.out.print(" .");
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
          }
          return;

        default:
          System.out.println("Invalid choice, try again");
          break;
      }
    }
  }
}