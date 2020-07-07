package exception;

import java.util.Scanner;

public class NameException {
    Scanner input = new Scanner(System.in);
    public String checkNameCustomer() {
        String regex = "^((\\p{Lu})(\\p{Ll}*))( (\\p{Lu})(\\p{Ll}*))*$";
        while (true) {
            String check = input.nextLine();
            if (check.matches(regex)){
                return check;
            }else {
                System.out.println("Wrong format !!");
            }
        }
    }
}
