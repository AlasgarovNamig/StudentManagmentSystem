/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.menu;

import bean.Config;
import java.util.Scanner;
import service.menu.inter.MenuLoginServiceInter;

/**
 *
 * @author Hp
 */
public class MenuLoginService implements MenuLoginServiceInter {

    @Override
    public void processLogic() {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("username:");
        String username = sc.nextLine();
        
         Scanner sc2 = new Scanner(System.in);
        System.out.println("password:");
        String password = sc2.nextLine();
        
        if(!(username.equals("user")&&password.equals("11111"))){
            throw  new  IllegalArgumentException("user or password is invalid:");
        }
        Config.setLoggedIn(true);
    }
    
}
