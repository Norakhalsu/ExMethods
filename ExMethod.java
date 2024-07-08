import java.util.Scanner;

public class ExMethod {


    /*1 - Write a Java method to find the smallest number among three numbers.
Test Data:Input the first number: 25
Input the Second number: 37
Input the third number: 29
Expected Output:
The smallest value is  25  */

  /*       public static int smallest( int n1 , int n2 , int n3){
             if (n1 < n2 && n1 < n3){
             return  n1; }

             else if (n2<n1 && n2 < n3){
                 return n2;

             } return n3;  }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter frist number : ");
        int num1 = scanner.nextInt();
        System.out.println(" enter second number ");
        int num2 =scanner.nextInt();
        System.out.println("enter third number ");
        int num3 = scanner.nextInt();
         System.out.println( "The smallest value is " + smallest(num1,num2,num3) );
         }   */








 /*2-Write a Java method that check if the entered number is negative or positive or zero */

  /*  public static void check(int number) {
        if (number > 0) {
            System.out.println(" the number is positive ");
        } else if (number < 0) {
            System.out.println(" the number is nigative ");
        } else System.out.println(" th enumber is zero "); }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your number to check if  P,N,Z  : ");
        int num1 = scanner.nextInt();
        check(num1);
    }  */





    /*3 - Write a Java method to check whether a string is a valid password.
 Password rules:
 A password must have at least eight characters.
 A password consists of only letters and digits.
 A password must contain at least two digits
 Expected Output:
 1. A password must have at least eight characters.
 2. A password consists of only letters and digits.
 3. A password must contain at least two digits
 Input a password (You are agreeing to the above Terms and Conditions.):
 abcd1234
 Password is valid: abcd1234   */


     /*   public static boolean Checkpass(String password) {
            if (password.length() < 8) {
                return false; }
            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);
                if (!Character.isLetterOrDigit(c)) {
                    return false; }
            } int digitCount = 0;
            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);
                if (Character.isDigit(c)) {
                    digitCount++; } }

            if (digitCount < 2) {
                return false;
            }
                  return true; }


        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enetr your password : ");
            String pass=scanner.nextLine();

            if (Checkpass(pass)) {
            System.out.println("Password  valid: " + pass);
            } else {
                System.out.println("Password  invalid.");
            }}  */




}



