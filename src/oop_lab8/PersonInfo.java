package oop_lab8;

public class PersonInfo {
    public static void main (String[] args){
        Student student = new Student(
                 "1249900364241",
                 "Kingkamol Janmanit",
                 "fermale",
                 22,
                 "359211110005",
                "IS Management Technology");
        System.out.println(student.toString());

        System.out.println(student.getName());
    }

    {
        Employee employee = new Employee(
                "25535544",
                "pojatkan",
                "30000");
        System.out.println(employee.toString());
        System.out.println(employee.getEmployeeID());




    }


}
