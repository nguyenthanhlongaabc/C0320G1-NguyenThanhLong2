package commons;

import models.Villa;

import javax.rmi.CORBA.StubDelegate;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class VillaCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String fileNameVilla = "src/data/Villa.csv";
    private static final String FILE_HEADER_VILLA = "id, nameService, areaUse, rentalCosts, maxNumberOfPeople, typeRent, roomStandard, convenientDescription, areaPool, numberOfFloors";

    public static void writeVillaToFileCSV(ArrayList<Villa>ListVilla){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileNameVilla);
            fileWriter.append(FILE_HEADER_VILLA);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Villa villa: ListVilla){
                fileWriter.append(villa.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getNameService());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getAreaUse()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getRentalCosts()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getMaxNumberOfPeople()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getTypeRent());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getRoomStandard());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getConvenientDescription());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getAreaPool()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getNumberOfFloors()));
                fileWriter.append(NEW_LINE_SEPARATOR);
            }

        }catch (Exception e){
            System.out.println("Error in CsvFileWriter !!!");
        }finally {
            try {
                fileWriter.flush(); //Lưu lại
                fileWriter.close();
            }catch (Exception e){
                System.out.println("Error when flush or close");
            }
        }
    }

    public static ArrayList<Villa> getFileCSVToListVilla(){
        BufferedReader br = null;
        ArrayList<Villa> listVilla = new ArrayList<>();

        try {
            String line;
            br = new BufferedReader(new FileReader(fileNameVilla));

            while ((line = br.readLine())!=null){
                String[] splitData = line.split(",");
                if (splitData[0].equals("id")){
                    continue;
                }
                Villa villa = new Villa();
                villa.setId(splitData[0]);
                villa.setNameService(splitData[1]);
                villa.setAreaUse(Double.parseDouble(splitData[2]));
                villa.setRentalCosts(Double.parseDouble(splitData[3]));
                villa.setMaxNumberOfPeople(Integer.parseInt(splitData[4]));
                villa.setTypeRent(splitData[5]);
                villa.setRoomStandard(splitData[6]);
                villa.setConvenientDescription(splitData[7]);
                villa.setAreaPool(Double.parseDouble(splitData[8]));
                villa.setNumberOfFloors(Integer.parseInt(splitData[9]));
                listVilla.add(villa);
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
        return listVilla;
    }
}
