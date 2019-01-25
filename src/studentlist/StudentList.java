/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentlist;

/**
 *
 * @author shaim
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setId(1111);
        s1.setName("Shaimaa");
    
        Student s2 = new Student();
        s2.setId(2222);
        s2.setName("John");
        
        Student s3 = new Student("Smith", 3333);
        
        System.out.println("BEFORE s1 ==> Name: "+s1.getName() + " id: " + s1.getId());
        System.out.println("s2 ==> Name: "+s2.getName() + " id: " + s2.getId());
        System.out.println("s3 ==> Name: "+s3.getName() + " id: " + s3.getId());
        
        Student[] studentList = new Student[5];
        
        studentList[0] = s1;
        studentList[1] = s2;
        studentList[2] = s3;
        studentList[3] = new Student("XYZ", 4444);
        studentList[4] = new Student("GGG", 5555);
        
        s1.setName("ABC");
        s1 = new Student("DEF",9999);
        studentList[0] = new Student("LMN", 8888);
        for (int i=0; i<studentList.length; i++)
            System.out.println(i+" ==> Name: "+studentList[i].getName() + " id: " + studentList[i].getId());
            
         System.out.println("AFTER s1 ==> Name: "+s1.getName() + " id: " + s1.getId());   
    
    }
    
}
