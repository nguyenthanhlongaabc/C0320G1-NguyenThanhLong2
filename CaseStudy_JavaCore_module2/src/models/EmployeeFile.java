package models;

public class EmployeeFile {
    private String name;
    private String description; //mô tả

    public EmployeeFile() {
    }

    public EmployeeFile(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
