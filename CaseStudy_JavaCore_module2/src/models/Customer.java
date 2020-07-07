package models;

public class Customer {
    private String idCus;
    private String nameCustomer;
    private String birthday;
    private String gender; //Giới tính khách hàng
    private String cmnd;
    private String phoneNumber;
    private String email;
    private String typeCustomer;
    private String address;
    private Service service;

    public Customer(){
    }

    public Customer(String idCus, String nameCustomer, String birthday, String gender, String cmnd, String phoneNumber, String email, String typeCustomer, String address, Service service) {
        this.idCus = idCus;
        this.nameCustomer = nameCustomer;
        this.birthday = birthday;
        this.gender = gender;
        this.cmnd = cmnd;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.typeCustomer = typeCustomer;
        this.address = address;
        this.service = service;
    }

    public Customer(String idCus, String nameCustomer, String birthday, String gender, String cmnd, String phoneNumber, String email, String typeCustomer, String address) {
        this.idCus = idCus;
        this.nameCustomer = nameCustomer;
        this.birthday = birthday;
        this.gender = gender;
        this.cmnd = cmnd;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public String getIdCus() {
        return idCus;
    }

    public void setIdCus(String idCus) {
        this.idCus = idCus;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public String showInfor(){
        return "IdCus: " + this.idCus + "\n" +
                "Name Customer: " + this.nameCustomer + "\n" +
                "Birthday: " + this.birthday + "\n" +
                "Gender: " + this.gender + "\n" +
                "Cmnd: " + this.cmnd + "\n" +
                "Phone number: " + this.phoneNumber +"\n" +
                "Email: " + this.email + "\n" +
                "Type customer: " + this.typeCustomer + "\n" +
                "Address: " + this.address + "\n";
    }
}
