package commons;

import models.Customer;
import models.Villa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class CustomerCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String fileNameCustomer = "src/data/Customer.csv";
    private static final String FILE_HEADER_CUSTOMER = "idCus, nameCustomer, birthday, gender, cmnd, phoneNumber, email, typeCustomer, address";
    public static void writeCustomerToFileCSV(ArrayList<Customer> ListCustomer){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileNameCustomer);
            fileWriter.append(FILE_HEADER_CUSTOMER);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Customer customer: ListCustomer){
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

    public static ArrayList<Customer> getFileCSVToListCustomer(){
        BufferedReader br = null;
        ArrayList<Customer> listCustomer = new ArrayList<>();

        try {
            String line;
            br = new BufferedReader(new FileReader(fileNameCustomer));

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
                listCustomer.add(customer);
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
        return listCustomer;
    }
}
