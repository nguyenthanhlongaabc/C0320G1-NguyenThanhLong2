package exception;

import java.util.Scanner;

public class GenderException {
    Scanner input = new Scanner(System.in);
    public String checkGenderCustomer(){
        String regex = "^Male|Female|Unknow$";
        while (true){
            String check = input.nextLine();
            if (check.matches(regex)){
                return check;
            }else {
                System.out.println("Wrong format. Include gender (Male, Female, Unknow)");
            }
        }

    }
}
