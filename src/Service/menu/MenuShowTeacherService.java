/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.menu;

import Service.menu.inter.MenuShowTeacherServiceInter;
import bean.Config;
import bean.Student;
import bean.Teacher;

/**
 *
 * @author Standard Computer's
 */
public class MenuShowTeacherService implements MenuShowTeacherServiceInter{
     @Override
     public void process() {
        Teacher[] all = Config.instance().getTeachers();
        for (int i = 0; i < all.length;i++) {
            System.out.println(all[i]);
            
        }
    }
    
}
