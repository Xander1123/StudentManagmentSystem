/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.menu;

import Service.menu.inter.MenuAddStudentServiceInter;
import bean.Config;
import bean.Student;
import java.util.Scanner;

/**
 *
 * @author Standard Computer's
 */
public class MenuAddStudentsService implements MenuAddStudentServiceInter{

    @Override
    public void process() {
     Scanner sc=new Scanner(System.in);
        System.out.println("enter name");
     String name=sc.nextLine();
     
     
      System.out.println("enter surname");
     Scanner sc2=new Scanner(System.in);
     String surname=sc2.nextLine();
     
     Student s=new Student();
     
     s.setName(name);
     s.setSurname(surname);
     
     
Config.instance().appendStudent(s);
     
     System.out.println("Student added");
     
    
    }
    
}
