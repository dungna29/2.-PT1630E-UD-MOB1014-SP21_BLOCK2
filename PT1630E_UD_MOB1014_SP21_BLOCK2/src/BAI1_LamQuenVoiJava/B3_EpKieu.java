/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI1_LamQuenVoiJava;

/**
 *
 * @author Dungna29
 */
public class B3_EpKieu {

    /*
        1. Ép kiểu từ String về Số
        2. Ép kiểu giữa các các số với nhau
     */
    public static void main(String[] args) {
        //1. Ép kiểu từ String về Số
        String year = "2020";
        int year2 = 1;
        //Không thể thực hiện phép toán vì year là kiểu chuỗi
        System.out.println("Năm hiện nay là: String + Int " + year + year2);
        //Giải quyết vấn đề bằng cách ép kiểu String về số
        //Integer.parseInt(<String>): Ép kiểu String về số nguyên
        System.out.println("Năm hiện nay là: " + (Integer.parseInt(year) + year2));
        
        
        //Ngoài ra còn rất nhiều cách ép các kiểu dữ liệu khác từ String về số
        //Double.parseDouble(<String>)
        //Float.parseFloat(<String>)
        //Byte.parseByte(<String>)
        
        
        
        //2. Ép kiểu giữa các các số với nhau
        int a = 5;
        double b = 9.4;
        //b = a; //ép kiểu tự động
        //a = b; Gây lỗi vì kiểu in bé hơn kiểu double
        a = (int) b; //ép kiểu tường minh phần thập phân sẽ bị bỏ
    }
}
