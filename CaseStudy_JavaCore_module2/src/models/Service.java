package models;

public abstract class Service {
    private String id;
    private String nameService;
    private double areaUse;
    private double rentalCosts;  //chi phí thuê;
    private int maxNumberOfPeople; //Số lượng người tối đa;
    private String typeRent; //Kiểu thuê;

    public Service(){
    }

    public Service(String id, String nameService, double areaUse, double rentalCosts, int maxNumberOfPeople, String typeRent){
        this.id = id;
        this.nameService = nameService;
        this.areaUse = areaUse;
        this.rentalCosts = rentalCosts;
        this.maxNumberOfPeople = maxNumberOfPeople;
        this.typeRent = typeRent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getAreaUse() {
        return areaUse;
    }

    public void setAreaUse(double areaUse) {
        this.areaUse = areaUse;
    }

    public double getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(double rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getMaxNumberOfPeople() {
        return maxNumberOfPeople;
    }

    public void setMaxNumberOfPeople(int maxNumberOfPeople) {
        this.maxNumberOfPeople = maxNumberOfPeople;
    }

    public String getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(String typeRent) {
        this.typeRent = typeRent;
    }

    public abstract void showInfor();
}
