package com.example.demovalidatingforminput.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class User {

    @Size(min = 2, max = 30, message = "tên nằm trong khoảng từ 2-30 kí tự")
    private String name;

    @Min(value = 18, message = "tuổi phải lớn hơn 18")
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
