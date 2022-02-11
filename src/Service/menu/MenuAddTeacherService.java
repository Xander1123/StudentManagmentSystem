/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.menu;

import Service.menu.inter.MenuAddTeacherServiceInter;
import bean.Config;
import bean.Teacher;
import java.util.Scanner;

/**
 *
 * @author Standard Computer's
 */
public class MenuAddTeacherService implements MenuAddTeacherServiceInter{
    
    
    public void process(){
         System.out.println("enter name");
    Scanner sc=new Scanner(System.in);
     String name=sc.nextLine();
     
     
      System.out.println("enter surname");
     Scanner sc2=new Scanner(System.in);
     String surname=sc2.nextLine();
     
     Teacher s=new Teacher ();
     
     s.setName(name);
     s.setSurname(surname);
     
     
Config.instance().appendTeacher(s);
        System.out.println("Teacher added");
}
}