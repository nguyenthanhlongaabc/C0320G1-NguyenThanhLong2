package commons;

import models.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class EmployeeCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String fileNameEmployee = "src/data/Employee.csv";
    private static final String FILE_HEADER_EMPLOYEE = "idEmployee, nameEmployee, age, address";
    public static void writeEmployeeToFileCSV(ArrayList<Employee> ListEmployee){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileNameEmployee);
            fileWriter.append(FILE_HEADER_EMPLOYEE);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Employee employee: ListEmployee){
                fileWriter.append(employee.getIdEmployee());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(employee.getNameEmployee());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(employee.getAge()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(employee.getAddress());
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

    public static ArrayList<Employee> getFileCSVToListEmployee(){
        BufferedReader br = null;
        ArrayList<Employee> listEmployee = new ArrayList<>();

        try {
            String line;
            br = new BufferedReader(new FileReader(fileNameEmployee));

            while ((line = br.readLine())!=null){
                String[] splitData = line.split(",");
                if (splitData[0].equals("idEmployee")){
                    continue;
                }
                Employee customer = new Employee();
                customer.setIdEmployee(splitData[0]);
                customer.setNameEmployee(splitData[1]);
                customer.setAge(Integer.parseInt(splitData[2]));
                customer.setAddress(splitData[3]);
                listEmployee.add(customer);
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
        return listEmployee;
    }
}
