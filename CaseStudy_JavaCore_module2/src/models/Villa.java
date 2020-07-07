package models;

public class Villa extends Service {
    private String roomStandard; //Tiêu chuẩn phòng;
    private String convenientDescription; //mô tả tiện nghi khác;
    private double areaPool; //Diện tích hồ bơi;
    private int numberOfFloors; //Số tầng;

    public Villa() {
    }

    public Villa(String id, String nameService, double areaUse, double rentalCosts, int maxNumberOfPeople, String typeRent, String roomStandard, String convenientDescription, double areaPool, int numberOfFloors) {
        super(id, nameService, areaUse, rentalCosts, maxNumberOfPeople, typeRent);
        this.roomStandard = roomStandard;
        this.convenientDescription = convenientDescription;
        this.areaPool = areaPool;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getConvenientDescription() {
        return convenientDescription;
    }

    public void setConvenientDescription(String convenientDescription) {
        this.convenientDescription = convenientDescription;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public void showInfor(){
        System.out.println("Id : " + getId() + "\n" +
                "Name service : " + getNameService() + "\n" +
                "Area use : " + getAreaUse() + "\n" +
                "Rental costs : " + getRentalCosts() + "\n" +
                "Max number of people : " + getMaxNumberOfPeople() + "\n" +
                "Type rent : " + getTypeRent() + "\n" +
                "Room standard : " + getRoomStandard() + "\n" +
                "Convenient description : " + getConvenientDescription() + "\n" +
                "Area Pool : " + getAreaPool() + "\n" +
                "Number of Floors : " + getNumberOfFloors());
    }
}

