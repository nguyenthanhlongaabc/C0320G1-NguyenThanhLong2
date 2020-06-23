package com.example.demoproduct.repository;

import java.util.List;

public interface Repository<T> {
    List<T> getAll(); //Phương thức Hiển thị danh sách sản phẩm
    T getById(int id); //Phương thức hiển thị một sản phẩm thông qua id
    void deleteById(int id); //phương thức xóa sản phẩm thông qua id
    void save(T t);// phương thức chỉnh sửa sản phẩm;
    void update(int id, T t); // phương thức thêm mới sản phẩm
}
