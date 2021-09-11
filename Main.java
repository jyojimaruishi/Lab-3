import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Enter a number: ");
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    int goal = 0;
      if (num < 0){
        while (num < goal){
          num ++;
          System.out.println(num);
        }
        System.out.println("Blast off!");
      }

      else if (num > 0){
        while (num > goal){
          num --;
          System.out.println(num);
        }
        System.out.println("Blast off!");
      }

      else if (num == 0){
        System.out.println("Blast off!");
      }
    }

  }