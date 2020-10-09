import java.util.Scanner;//Scanner
class Main {
  public static void main(String[] args) {
    System.out.println("★ Welcome to this Website ★\n");// Welcome

    Scanner hello = new Scanner(System.in);//Scanner command for Welcome.
    System.out.println("How are you doing today? (Good or Bad?)\n");//Print command for welcome.
    hello.next();
       
    
    Scanner today = new Scanner(System.in);
    System.out.println("\n★  Today we will try to help you with your grades! ★\n"); // Welcome Stuff
  
//All the question starts here.

    Scanner scan = new Scanner(System.in);
    System.out.println("First Name?\n");
    String name = scan.next();

    System.out.println ("\nWelcome " + name + "!");

    Scanner grade = new Scanner(System.in);
    System.out.println("\nWhat is your GPA ?\n");
    grade.next();

    Scanner gpa = new Scanner(System.in);
    double n = gpa.nextDouble();
    System.out.println(n);

    if(n >= 4.0 || n < 3.5) {
      System.out.println("\nGreat Start!\n");
    }else if(n >= 3.0 || n < 2.5) {
      System.out.println("Almost there gotta try harder!\n");
    }else {

    }
    


  }
}