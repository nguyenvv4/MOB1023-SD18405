/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd18405.nhanvien;

import java.util.ArrayList;

/**
 *
 * @author nguyenvv
 */
public class QuanLyNhanVien {

    ArrayList<NhanVien> listNhanVien = new ArrayList<>();

    ArrayList<NhanVien> getListNhanVien() {
        listNhanVien.add(new NhanVien("NV1", "Nguyen Van A", "Nam", "SD1234"));
        listNhanVien.add(new NhanVien("NV2", "Nguyen Van A", "Nam", "SD1234"));
        listNhanVien.add(new NhanVien("NV3", "Nguyen Van A", "Nam", "SD1234"));
        return listNhanVien;
    }
}
