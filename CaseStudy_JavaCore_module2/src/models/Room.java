package models;

public class Room extends Service {
    private String freeService;

    public Room() {
    }

    public Room(String id, String nameService, double areaUse, double rentalCosts, int maxNumberOfPeople, String typeRent, String freeService) {
        super(id, nameService, areaUse, rentalCosts, maxNumberOfPeople, typeRent);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public void showInfor(){
        System.out.println("Id : " + getId() + "\n" +
                "Name service : " + getNameService() + "\n" +
                "Area use : " + getAreaUse() + "\n" +
                "Rental costs : " + getRentalCosts() + "\n" +
                "Max number of people : " + getMaxNumberOfPeople() + "\n" +
                "Type rent : " + getTypeRent() + "\n" +
                "Free Service : " + getFreeService());
    }
}
