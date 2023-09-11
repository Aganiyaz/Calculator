import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      while (true) {
          System.out.println("Enter your number.Please, put 1 space between numbers and operators.");
          Scanner scan = new Scanner(System.in);
          String phrase = scan.nextLine();
          calc(phrase);
      }
    }


    private static void calc(String str) {
        String[] token = new String[3];
        String operator = getSeparator(str);

        token = str.split("[\\+\\-\\*\\/]");
        int num1;
        int num2;
        try {
            num1 = Integer.parseInt(token[0]);
            num2 = Integer.parseInt(token[1]);

            if (num1 > 10 || num1 < 1) {
                System.out.println("You entered invalid number");
            } else if (num2 > 10 || num2 < 1) {
                System.out.println("You entered invalid number");
            } else
                switch (operator) {
                    case "+":
                        System.out.println(num1 + num2);
                        break;
                    case "-":
                        System.out.println(num1 - num2);
                        break;
                    case "*":
                        System.out.println(num1 * num2);
                        break;
                    case "/":
                        System.out.println(num1 / num2);
                        break;
                }

        } catch (NumberFormatException e) {
            System.out.println("Incorrect format");
        } catch (ArithmeticException e) {
            System.out.println("Divided by zero");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of boundaries");
        }

    }

    private static String getSeparator(String str){
        String operator;

        if (str.contains("+")){
            operator = "+";

        } else if (str.contains("-")){
            operator = "-";

        } else if (str.contains("/")){
            operator = "/";

        } else if (str.contains("*")){
            operator = "*";

        } else {
            //данная операция вас не доступна
            throw new RuntimeException("No such operator......");
        }
        return operator;
    }

}


