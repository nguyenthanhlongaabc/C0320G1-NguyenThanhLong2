package commons;

import models.House;
import models.Room;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class RoomCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String fileNameRoom = "src/data/House.csv";
    private static final String FILE_HEADER_ROOM = "id, nameService, areaUse, rentalCosts, maxNumberOfPeople, typeRent, freeService";

    public static void writeRoomToFileCSV(ArrayList<Room> ListRoom){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileNameRoom);
            fileWriter.append(FILE_HEADER_ROOM);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Room room: ListRoom){
                fileWriter.append(room.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(room.getNameService());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(room.getAreaUse()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(room.getRentalCosts()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(room.getMaxNumberOfPeople()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(room.getTypeRent());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(room.getFreeService());
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
    public static ArrayList<Room> getFileCSVToListRoom(){
        BufferedReader br = null;
        ArrayList<Room> listRoom = new ArrayList<>();

        try {
            String line;
            br = new BufferedReader(new FileReader(fileNameRoom));

            while ((line = br.readLine())!=null){
                String[] splitData = line.split(",");
                if (splitData[0].equals("id")){
                    continue;
                }
                Room room = new Room();
                room.setId(splitData[0]);
                room.setNameService(splitData[1]);
                room.setAreaUse(Double.parseDouble(splitData[2]));
                room.setRentalCosts(Double.parseDouble(splitData[3]));
                room.setMaxNumberOfPeople(Integer.parseInt(splitData[4]));
                room.setTypeRent(splitData[5]);
                room.setFreeService(splitData[6]);
                listRoom.add(room);
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
        return listRoom;
    }
}
