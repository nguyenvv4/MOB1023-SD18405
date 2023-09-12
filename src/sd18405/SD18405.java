/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sd18405;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nguyenvv
 */
public class SD18405 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        QuanLySinhVien quanLySinhVien = new QuanLySinhVien();
        Scanner sc = new Scanner(System.in);
        String check = "";
        while (true) {
            quanLySinhVien.nhap();
            System.out.println("Ban muon nhap tiep: ");
            check = sc.nextLine();
            if (check.equals("no")) {
                break;
            }
        }
        ArrayList<SinhVien> list = quanLySinhVien.xuatSinhVien();
//        list.forEach(x -> System.out.println(x.toString()));
        for (SinhVien sinhVien : list) {
            System.out.println(sinhVien.toString());
        }
    }

}
