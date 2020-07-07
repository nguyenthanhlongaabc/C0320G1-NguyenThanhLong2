package validation;

import java.util.Scanner;

public class CheckInput {
    Scanner input = new Scanner(System.in);

    public String checkVillaId() {
        String regex = "^SVVL-[0-9]{4}$";
        while (true) {
            String villaId = input.nextLine();
            if (villaId.matches(regex)) {
                return villaId;
            } else {
                System.out.println("Villa ID format: SVVL-YYYY, Y is 0-9");
            }
        }
    }

    public String checkHouseId() {
        String regex = "^SVHO-[0-9]{4}$";
        while (true) {
            String houseId = input.nextLine();
            if (houseId.matches(regex)) {
                return houseId;
            } else {
                System.out.println("House ID format: SVHO-YYYY, Y is 0-9");
            }
        }
    }

    public String checkRoomId() {
        String regex = "^SVRO-[0-9]{4}$";
        while (true) {
            String roomId = input.nextLine();
            if (roomId.matches(regex)) {
                return roomId;
            } else {
                System.out.println("Room ID format: SVRO-YYYY, Y is 0-9");
            }
        }
    }

    public String checkNameService() {
        String regex = "^[A-Z][a-z]{1,}$";
        while (true) {
            String checkName = input.nextLine();
            if (checkName.matches(regex)) {
                return checkName;
            } else {
                System.out.println("Wrong format. Please enter again !!");
            }
        }
    }

    public double checkAreaUse() {
        while (true) {
            double checkAreaUse = Double.parseDouble(input.nextLine());
            if (checkAreaUse > 30) {
                return checkAreaUse;
            } else {
                System.out.println("The area used is greater than 30 !!");
            }
        }
    }

    public double checkAreaPool() {
        while (true) {
            double checkAreaPool = Double.parseDouble(input.nextLine());
            if (checkAreaPool > 30) {
                return checkAreaPool;
            } else {
                System.out.println("The area pool is greater than 30 !!");
            }
        }
    }

    public double checkRentalCosts() {
        while (true) {
            double checkRentaCosts = Double.parseDouble(input.nextLine());
            if (checkRentaCosts > 0) {
                return checkRentaCosts;
            } else {
                System.out.println("Rental cost is greater than 0 !!");
            }
        }
    }

    public int checkMaxNumberOfPeope() {
        while (true) {
            int check = Integer.parseInt(input.nextLine());
            if (check > 0 && check < 20) {
                return check;
            } else {
                System.out.println("Maximum number of people is greater than 0 and less than 20 ");
            }
        }
    }

    public int checkNumberOfFloors() {
        while (true) {
            try {
                int check = Integer.parseInt(input.nextLine());
                if (check > 0) {
                    return check;
                } else {
                    System.out.println("The number of floors must be greater than 0");
                }
            } catch (Exception e) {
                System.out.println("Wrong format. Please enter again !!");
            }
        }
    }

    public String checkTypeRent(){
        String regex = "^[A-Z][a-z]{1,}$";
        while (true){
            try {
                String check = input.nextLine();
                if (check.matches(regex)){
                    return check;
                }else {
                    System.out.println("Wrong format !!");
                }
            }catch (Exception e){
                System.out.println("Wrong format. Please enter again !!");
            }
        }
    }

    public String checkRoomStandard(){
        String regex = "^[A-Z][a-z]{1,}$";
        while (true){
            try {
                String check = input.nextLine();
                if (check.matches(regex)){
                    return check;
                }else {
                    System.out.println("Wrong format !!");
                }
            }catch (Exception e){
                System.out.println("Wrong format. Please enter again !!");
            }
        }
    }
}
