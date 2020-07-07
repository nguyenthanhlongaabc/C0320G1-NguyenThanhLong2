package exception;

import java.util.Scanner;

public class CmndException {
    Scanner input = new Scanner(System.in);
    public String checkCmndCustomer(){
        String regex = "^[0-9]{9}$";
        while (true){
            String check = input.nextLine();
            if (check.matches(regex)){
                return check;
            }else {
                System.out.println("Wrong format. Cmnd must be 9 digits in format XXXXXXXXX ");
            }
        }
    }
}
