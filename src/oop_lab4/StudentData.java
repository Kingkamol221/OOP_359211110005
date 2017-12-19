package oop_lab4;
//สร้าง Method สำหรับรับค่าข้อมูลข่าวสาร
//1.ชื่อ-สกุล
//2.ที่อยู่
//3.รหัสนักศึกษา
//4.สาขาและมหาวิทยาลัย
//5.email

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentData {
    public static BufferedReader reader= new BufferedReader(
            new InputStreamReader(System.in));
    public static String getname() throws IOException{
        System.out.println("Enter your name");
        return reader.readLine();
    }//getname
    public static String getaddress() throws IOException{
        System.out.println("Enter your address");
        return reader.readLine();
    }//getaddress
    public static String getid() throws IOException{
        System.out.println("Enter your id");
        return reader.readLine();
    }//getid
    public static String getfaculty() throws IOException{
        System.out.println("Enter your faculty");
        return reader.readLine();
    }//getfaculty
    public static String getaemail() throws IOException{
        System.out.println("Enter your email");
        return reader.readLine();
    }//getemail

    public static void  main (String[] args) throws IOException{
    String name = getname();
    String address =   getaddress();
    String id = getid();
    String faculty = getfaculty();
    String email = getaemail();
    System.out.println(name+"\n"+address+"\n"+id+"\n"+faculty+"\n"+email);
    System.out.println(getname()+"\n"+getaddress());

    }
}

