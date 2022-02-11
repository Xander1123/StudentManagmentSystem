/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.menu;

import Service.menu.inter.MenuRegisterServiceInter;
import Service.menu.inter.MenuService;

/**
 *
 * @author Standard Computer's
 */
public class MenuRegisterService implements MenuRegisterServiceInter {


    @Override
    public void process() {
        System.out.println("Register");
    }
    
}
