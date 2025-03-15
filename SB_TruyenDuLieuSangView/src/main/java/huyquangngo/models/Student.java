package huyquangngo.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
    private String Mssv;
    private String hoTen;
    private boolean gioiTinh;
    private int namSinh;

    public Student(String mssv, String hoTen, boolean gioiTinh, int namSinh) {
        Mssv = mssv;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.namSinh = namSinh;
    }
}

