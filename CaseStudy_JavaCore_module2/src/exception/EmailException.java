package exception;

import java.util.Scanner;

public class EmailException {
    Scanner input = new Scanner(System.in);
    public String checkEmailCustomer() {
        String regex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        while (true) {
            String check = input.nextLine();
            if (check.matches(regex)){
                return check;
            }else {
                System.out.println("Wrong format. Email format is abc@abc.abc !!");
            }
        }
    }
}
