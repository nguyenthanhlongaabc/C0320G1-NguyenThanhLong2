package exception;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class BirthdayException {
    Scanner input = new Scanner(System.in);
    public String checkBirthdayCustomer(){
        String regex = "^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$";
        while (true){
            String check = input.nextLine();
            if (check.matches(regex)){
                LocalDate date = LocalDate.now();
                String temp;
                temp = check.substring(6,10);
                if (Integer.parseInt(temp)>1900 && date.getYear() - Integer.parseInt(temp) >=18 ){
                    return check;
                }else {
                    System.out.println("Wrong format. The birth year is greater than 1900 and smaller than the current year of 18");
                }
            }else {
                System.out.println("Wrong format. The birth year is greater than 1900 and smaller than the current year of 18");
            }
        }
    }
}
