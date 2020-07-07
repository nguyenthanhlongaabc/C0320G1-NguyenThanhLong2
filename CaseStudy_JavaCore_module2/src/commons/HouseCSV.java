package commons;

import models.House;
import models.Villa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class HouseCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String fileNameHouse = "src/data/Room.csv";
    private static final String FILE_HEADER_HOUSE = "id, nameService, areaUse, rentalCosts, maxNumberOfPeople, typeRent, roomStandard, convenientDescription, numberOfFloors";

    public static void writeHouseToFileCSV(ArrayList<House> ListHouse){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileNameHouse);
            fileWriter.append(FILE_HEADER_HOUSE);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (House house: ListHouse){
                fileWriter.append(house.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getNameService());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house.getAreaUse()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house.getRentalCosts()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house.getMaxNumberOfPeople()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getTypeRent());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getRoomStandard());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getConvenientDescription());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house.getNumberOfFloors()));
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
    public static ArrayList<House> getFileCSVToListHouse(){
        BufferedReader br = null;
        ArrayList<House> listHouse = new ArrayList<>();

        try {
            String line;
            br = new BufferedReader(new FileReader(fileNameHouse));

            while ((line = br.readLine())!=null){
                String[] splitData = line.split(",");
                if (splitData[0].equals("id")){
                    continue;
                }
                House house = new House();
                house.setId(splitData[0]);
                house.setNameService(splitData[1]);
                house.setAreaUse(Double.parseDouble(splitData[2]));
                house.setRentalCosts(Double.parseDouble(splitData[3]));
                house.setMaxNumberOfPeople(Integer.parseInt(splitData[4]));
                house.setTypeRent(splitData[5]);
                house.setRoomStandard(splitData[6]);
                house.setConvenientDescription(splitData[7]);
                house.setNumberOfFloors(Integer.parseInt(splitData[8]));
                listHouse.add(house);
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
        return listHouse;
    }
}
