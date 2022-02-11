/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.menu;

import Service.menu.inter.MenuShowStundetsServiceInter;
import bean.Config;
import bean.Student;

/**
 *
 * @author Standard Computer's
 */
public class MenuShowStudentService implements MenuShowStundetsServiceInter {

    @Override
    public void process() {
        Student[] allStudent = Config.instance().getStudents();
        for (int i = 0; i < allStudent.length;i++) {
            System.out.println(allStudent[i]);
            
        }
    }

}
