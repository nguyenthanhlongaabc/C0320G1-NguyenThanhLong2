package controllers;

import commons.*;
import exception.*;
import models.*;
import sort.NameCustomerComparator;
import validation.CheckInput;

import java.util.*;

public class MainController {
    Scanner input = new Scanner(System.in);
    CheckInput checkInput = new CheckInput();

    public void displayMainMenu() {
        int choice;
        System.out.println("Main menu");
        System.out.println("1. Add new Service");
        System.out.println("2. Show Services");
        System.out.println("3. Add new customer");
        System.out.println("4. Show information of customer");
        System.out.println("5. Add new booking");
        System.out.println("6. Show information of employee");
        System.out.println("7. Add booking Cinema 4D");
        System.out.println("8. Find employee file");
        System.out.println("9. Exit");
        System.out.println();
        System.out.println("Enter your choice: ");
        choice = Integer.parseInt(input.nextLine());
        switch (choice) {
            case 1: {
                addNewServices();
                break;
            }
            case 2: {
                showServices();
                break;
            }
            case 3: {
                addNewCustomer();
                break;
            }
            case 4: {
                showInformationCustomers();
                break;
            }
            case 5: {
                addNewBooking();
                break;
            }
            case 6: {
                showInformationEmployee();
                break;
            }
            case 7: {
                addBookingCinema();
                break;
            }
            case 8: {
                findEmployeeFile();
                break;
            }
            case 9: {
                System.exit(0);
            }
            default: {
                displayMainMenu();
            }
        }
    }

    private void addNewServices() {
        int choice;
        System.out.println("Menu add new service");
        System.out.println("1. Add new Villa");
        System.out.println("2. Add new House");
        System.out.println("3. Add new Room");
        System.out.println("4. Back to menu");
        System.out.println("5. Exit");
        System.out.println();
        System.out.println("Input your choice: ");
        choice = Integer.parseInt(input.nextLine());
        switch (choice) {
            case 1: {
                addListVillaService();
                break;
            }
            case 2: {
                addListHouseService();
                break;
            }
            case 3: {
                addListRoomService();
                break;
            }
            case 4: {
                displayMainMenu();
                break;
            }
            case 5: {
                System.exit(0);
            }
        }
    }

    private void showServices() {
        int choice;
        System.out.println("Menu show service");
        System.out.println("1. Show all Villa");
        System.out.println("2. Show all House");
        System.out.println("3. Show all Room");
        System.out.println("4. Show All Name Villa Not Duplicate");
        System.out.println("5. Show All Name House Not Duplicate");
        System.out.println("6. Show All Name Room Not Duplicate");
        System.out.println("7. Back to memu");
        System.out.println("8. Exit");
        System.out.println();
        System.out.println("Input your choice: ");
        choice = Integer.parseInt(input.nextLine());
        switch (choice) {
            case 1: {
                showVillaService();
                break;
            }
            case 2: {
                showHouseService();
                break;
            }
            case 3: {
                showRoomService();
                break;
            }
            case 4: {
                showAllNameVillaNotDuplicate();
                break;
            }
            case 5: {
                showAllNameHouseNotDuplicate();
                break;
            }
            case 6: {
                showAllNameRoomNotDuplicate();
                break;
            }
            case 7: {
                displayMainMenu();
                break;
            }
            case 8: {
                System.exit(0);
            }
        }
    }

    private void addListVillaService() {
        ArrayList<Villa> listVilla = VillaCSV.getFileCSVToListVilla();
        Villa villa = new Villa();
        System.out.println("Enter id: ");
        villa.setId(checkInput.checkVillaId());
        System.out.println("Enter name Villa: ");
        villa.setNameService(checkInput.checkNameService());
        System.out.println("Enter area use: ");
        villa.setAreaUse(checkInput.checkAreaUse());
        System.out.println("Enter rental costs: ");
        villa.setRentalCosts(checkInput.checkRentalCosts());
        System.out.println("Enter max number of people: ");
        villa.setMaxNumberOfPeople(checkInput.checkMaxNumberOfPeope());
        System.out.println("Enter type rent: ");
        villa.setTypeRent(checkInput.checkTypeRent());
        System.out.println("Enter room standard: ");
        villa.setRoomStandard(checkInput.checkRoomStandard());
        System.out.println("Enter convenient description: ");
        villa.setConvenientDescription(input.nextLine());
        System.out.println("Enter area Pool: ");
        villa.setAreaPool(checkInput.checkAreaPool());
        System.out.println("Enter number of floors: ");
        villa.setNumberOfFloors(checkInput.checkNumberOfFloors());
        listVilla.add(villa);
        VillaCSV.writeVillaToFileCSV(listVilla);
        System.out.println("Add new Villa complete !!");
        addNewServices();
    }

    private void addListHouseService() {
        ArrayList<House> listHouse = HouseCSV.getFileCSVToListHouse();
        House house = new House();
        System.out.println("Enter id: ");
        house.setId(checkInput.checkHouseId());
        System.out.println("Enter name House: ");
        house.setNameService(checkInput.checkNameService());
        System.out.println("Enter area use: ");
        house.setAreaUse(checkInput.checkAreaUse());
        System.out.println("Enter rental costs: ");
        house.setRentalCosts(checkInput.checkRentalCosts());
        System.out.println("Enter max number of people: ");
        house.setMaxNumberOfPeople(checkInput.checkMaxNumberOfPeope());
        System.out.println("Enter type rent: ");
        house.setTypeRent(checkInput.checkTypeRent());
        System.out.println("Enter room standard: ");
        house.setRoomStandard(checkInput.checkRoomStandard());
        System.out.println("Enter convenient description: ");
        house.setConvenientDescription(input.nextLine());
        System.out.println("Enter number of floors: ");
        house.setNumberOfFloors(checkInput.checkNumberOfFloors());
        listHouse.add(house);
        HouseCSV.writeHouseToFileCSV(listHouse);
        System.out.println("Add new house complete !!");
        addNewServices();
    }

    private void addListRoomService() {
        ArrayList<Room> listRoom = RoomCSV.getFileCSVToListRoom();
        Room room = new Room();
        System.out.println("Enter id: ");
        room.setId(checkInput.checkRoomId());
        System.out.println("Enter name Room: ");
        room.setNameService(checkInput.checkNameService());
        System.out.println("Enter area use: ");
        room.setAreaUse(checkInput.checkAreaUse());
        System.out.println("Enter rental costs: ");
        room.setRentalCosts(checkInput.checkRentalCosts());
        System.out.println("Enter max number of people: ");
        room.setMaxNumberOfPeople(checkInput.checkMaxNumberOfPeope());
        System.out.println("Enter type rent: ");
        room.setTypeRent(input.nextLine());
        System.out.println("Enter free service");
        room.setFreeService(input.nextLine());
        listRoom.add(room);
        RoomCSV.writeRoomToFileCSV(listRoom);
        System.out.println("Add new room complete !!");
        addNewServices();

    }

    private void showVillaService() {
        ArrayList<Villa> listVilla = VillaCSV.getFileCSVToListVilla();
        for (Villa villa : listVilla) {
            System.out.println("Information Villa");
            villa.showInfor();
            System.out.println("-----------------------");
        }
        showServices();
    }

    private void showHouseService() {
        ArrayList<House> listHouse = HouseCSV.getFileCSVToListHouse();
        for (House house : listHouse) {
            System.out.println("Information House");
            house.showInfor();
            System.out.println("-----------------------");
        }
        showServices();
    }

    private void showRoomService() {
        ArrayList<Room> listRoom = RoomCSV.getFileCSVToListRoom();
        for (Room room : listRoom) {
            System.out.println("Information Room");
            room.showInfor();
            System.out.println("-----------------------");
        }
        showServices();
    }

    private void showAllNameVillaNotDuplicate() {
        ArrayList<Villa> listVilla = VillaCSV.getFileCSVToListVilla();
        TreeSet<String> listNameVilla = new TreeSet<String>();
        for (Villa villa : listVilla) {
            listNameVilla.add(villa.getNameService());
        }
        System.out.println("Villa name list: ");
        System.out.println(listNameVilla);
        showServices();
    }

    private void showAllNameHouseNotDuplicate() {
        ArrayList<House> listHouse = HouseCSV.getFileCSVToListHouse();
        TreeSet<String> listNameHouse = new TreeSet<String>();
        for (House house : listHouse) {
            listNameHouse.add(house.getNameService());
        }
        System.out.println("House name list: ");
        System.out.println(listNameHouse);
        showServices();
    }

    private void showAllNameRoomNotDuplicate() {
        ArrayList<Room> listRoom = RoomCSV.getFileCSVToListRoom();
        TreeSet<String> listNameRoom = new TreeSet<String>();
        for (Room room : listRoom) {
            listNameRoom.add(room.getNameService());
        }
        System.out.println("Room name list: ");
        System.out.println(listNameRoom);
        showServices();
    }

    private void addNewCustomer() {
        ArrayList<Customer> listCustomer = CustomerCSV.getFileCSVToListCustomer();
        Customer customer = new Customer();
        NameException nameException = new NameException();
        EmailException emailException = new EmailException();
        GenderException genderException = new GenderException();
        CmndException cmndException = new CmndException();
        BirthdayException birthdayException = new BirthdayException();
        System.out.println("Enter id: ");
        customer.setIdCus(input.nextLine());
        System.out.println("Enter name customer: ");
        customer.setNameCustomer(nameException.checkNameCustomer());
        System.out.println("Enter birthday: ");
        customer.setBirthday(birthdayException.checkBirthdayCustomer());
        System.out.println("Enter gender: ");
        customer.setGender(genderException.checkGenderCustomer());
        System.out.println("Enter cmnd: ");
        customer.setCmnd(cmndException.checkCmndCustomer());
        System.out.println("Enter phone number: ");
        customer.setPhoneNumber(input.nextLine());
        System.out.println("Enter email: ");
        customer.setEmail(emailException.checkEmailCustomer());
        System.out.println("Enter type customer: ");
        customer.setTypeCustomer(input.nextLine());
        System.out.println("Enter address: ");
        customer.setAddress(input.nextLine());
        listCustomer.add(customer);
        CustomerCSV.writeCustomerToFileCSV(listCustomer);
        System.out.println("Add new Customer complete !!");
        displayMainMenu();
    }

    private void showInformationCustomers() {
        ArrayList<Customer> listCustomer = new ArrayList<>();
        listCustomer = CustomerCSV.getFileCSVToListCustomer();
        Collections.sort(listCustomer, new NameCustomerComparator());//Sắp xếp các thuộc tính của đối tượng trong collection
        for (Customer customer : listCustomer) {
            System.out.println("Information Customer");
            System.out.println(customer.showInfor());
            System.out.println("------------------------");
        }
    }

    private void addNewBooking() {
        ArrayList<Customer> listCustomer = new ArrayList<>();
        listCustomer = CustomerCSV.getFileCSVToListCustomer();
        Collections.sort(listCustomer, new NameCustomerComparator());
        for (int i = 0; i < listCustomer.size(); i++) {
            System.out.println("------------------------------");
            System.out.println((i + 1) + ". " + listCustomer.get(i).showInfor());
        }
        int choiceCustomer;
        while (true) {
            System.out.print("Enter your choice: ");
            choiceCustomer = Integer.parseInt(input.nextLine());
            if (choiceCustomer >= 1 && choiceCustomer <= listCustomer.size()) {
                System.out.println("Size of list Customer: " + listCustomer.size() + ", choice: " + choiceCustomer);
                break;
            }else {
                System.out.println("Error. Please enter again !!");
            }
        }
        Customer customer = listCustomer.get(choiceCustomer -1);
        System.out.println("1. Booking Villa");
        System.out.println("2. Booking House");
        System.out.println("3. Booking Room");
        System.out.println();
        System.out.println("Enter your choice: ");
        int choiceBooking;
        while (true){
            choiceBooking = Integer.parseInt(input.nextLine());
            if (choiceBooking >= 1 && choiceBooking <= 3){
                break;
            }else {
                System.out.println("Error. Please enter again !!");
            }
        }
        switch (choiceBooking){
            case 1: {
                ArrayList<Villa> listVilla = VillaCSV.getFileCSVToListVilla();
                for (int i = 0; i < listVilla.size(); i++) {
                    System.out.println("----------------------------");
                    System.out.println("No" + (i + 1));
                    listVilla.get(i).showInfor();
                }
                System.out.println();
                System.out.println("Enter choice booking Villa: ");
                int choiceVilla = Integer.parseInt(input.nextLine());
                Villa villa = listVilla.get(choiceVilla - 1);
                customer.setService(villa);
                break;
            }
            case 2: {
                ArrayList<House> listHouse = HouseCSV.getFileCSVToListHouse();
                for (int i = 0; i < listHouse.size(); i++) {
                    System.out.println("----------------------------");
                    System.out.println("No" + (i + 1));
                    listHouse.get(i).showInfor();
                }
                System.out.println();
                System.out.println("Enter choice booking House: ");
                int choiceHouse = Integer.parseInt(input.nextLine());
                House house = listHouse.get(choiceHouse - 1);
                customer.setService(house);
                break;
            }
            case 3: {
                ArrayList<Room> listRoom = RoomCSV.getFileCSVToListRoom();
                for (int i = 0; i < listRoom.size(); i++) {
                    System.out.println("----------------------------");
                    System.out.println("No" + (i + 1));
                    listRoom.get(i).showInfor();
                }
                System.out.println();
                System.out.println("Enter choice booking Room: ");
                int choiceRoom = Integer.parseInt(input.nextLine());
                Room room = listRoom.get(choiceRoom - 1);
                customer.setService(room);
                break;
            }
            default: {
                displayMainMenu();
            }
        }
        ArrayList<Customer> listBooking = BookingCSV.getFileCSVToListBooking();
        listBooking.add(customer);
        BookingCSV.writeBookingToFileCSV(listBooking);
        displayMainMenu();
    }

    private void showInformationEmployee() {
        ArrayList<Employee> listEmployee = EmployeeCSV.getFileCSVToListEmployee();
        Map<String, Employee> employeeMap = new HashMap<>();
        for (Employee employee : listEmployee) {
            employeeMap.put(employee.getIdEmployee(), employee);
        }
        for (Employee employee : employeeMap.values()){
            System.out.println(employee);
            System.out.println("------------------------");
        }
    }

    private void addBookingCinema(){
        int size = 5;
        System.out.println("Furama has all 5 tickets");
        Queue<String> queue = new ArrayDeque<>();
        for (int i = 0; i < size; i++){
            System.out.println("Enter name " + (i+1) + ":");
            String name = input.nextLine();
            queue.add(name);
        }
        System.out.println("Tickets are out !!. Seat list: ");
        System.out.println(queue);
        displayMainMenu();
    }

    private void findEmployeeFile(){
        Stack<EmployeeFile> employeeFiles = new Stack<EmployeeFile>();
        employeeFiles.push(new EmployeeFile("Long","18 years old"));
        employeeFiles.push(new EmployeeFile("An","19 years old"));
        employeeFiles.push(new EmployeeFile("Bach","20 years old"));
        employeeFiles.push(new EmployeeFile("Toan","21 years old"));

        System.out.println();
        System.out.print("Enter employee's name: ");
        String name = input.nextLine();
        boolean found = false;
        while (!employeeFiles.isEmpty()) {
            EmployeeFile employeeFile = employeeFiles.pop();
            System.out.println("Pop file of " + employeeFile.getName());
            if (employeeFile.getName().equals(name)) {
                System.out.println("Found!");
                System.out.println("Description: " + employeeFile.getDescription());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Can't find employee " + name);
        }
        displayMainMenu();
    }

    public static void main(String[] args) {
        MainController mainController = new MainController();
        mainController.displayMainMenu();
    }

}
