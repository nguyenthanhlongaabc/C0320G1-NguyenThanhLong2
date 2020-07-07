package commons;

import models.Customer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class BookingCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String fileNameBooking = "src/data/Booking.csv";
//    private static final String FILE_HEADER_BOOKING = "idCus, nameCustomer, birthday, gender, cmnd, phoneNumber, email, typeCustomer, address, id, nameService, areaUse, rentalCosts, maxNumberOfPeople, typeRent ";
    public static void writeBookingToFileCSV(ArrayList<Customer> ListBooking){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileNameBooking,true);
//            fileWriter.append(FILE_HEADER_BOOKING);
//            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Customer customer: ListBooking){
                fileWriter.append(customer.getIdCus());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getNameCustomer());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getBirthday());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getGender());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getCmnd());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getPhoneNumber());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getEmail());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getTypeCustomer());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getAddress());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getService().getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getService().getNameService());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(customer.getService().getAreaUse()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(customer.getService().getRentalCosts()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(customer.getService().getMaxNumberOfPeople()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getService().getTypeRent());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }

        }catch (Exception e){
            System.out.println("Error in CsvFileWriter !!!");
        }finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            }catch (Exception e){
                System.out.println("Error when flush or close");
            }
        }
    }

    public static ArrayList<Customer> getFileCSVToListBooking(){
        BufferedReader br = null;
        ArrayList<Customer> listBooking = new ArrayList<>();

        try {
            String line;
            br = new BufferedReader(new FileReader(fileNameBooking));

            while ((line = br.readLine())!=null){
                String[] splitData = line.split(",");
                if (splitData[0].equals("idCus")){
                    continue;
                }
                Customer customer = new Customer();
                customer.setIdCus(splitData[0]);
                customer.setNameCustomer(splitData[1]);
                customer.setBirthday(splitData[2]);
                customer.setGender(splitData[3]);
                customer.setCmnd(splitData[4]);
                customer.setPhoneNumber(splitData[5]);
                customer.setEmail(splitData[6]);
                customer.setTypeCustomer(splitData[7]);
                customer.setAddress(splitData[8]);
                customer.getService().setId(splitData[9]);
                customer.getService().setNameService(splitData[10]);
                customer.getService().setAreaUse(Double.parseDouble(splitData[11]));
                customer.getService().setRentalCosts(Double.parseDouble(splitData[12]));
                customer.getService().setMaxNumberOfPeople(Integer.parseInt(splitData[13]));
                customer.getService().setTypeRent(splitData[14]);
                listBooking.add(customer);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            try {
                br.close();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        return listBooking;
    }
}
