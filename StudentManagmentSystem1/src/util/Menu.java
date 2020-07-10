 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import bean.Config;
import service.menu.MenuAddStudentService;
import service.menu.MenuAddTeacherService;
import service.menu.MenuLoginService;
import service.menu.MenuRegisterService;
import service.menu.MenuShowStudentService;
import service.menu.MenuShowTeacherService;
import service.inter.Process;
import service.menu.ExitSystem;

/**
 *
 * @author Hp
 */
public enum Menu {
    LOGIN(1, "Login", new MenuLoginService()),
    REGISTER(2, "Register", new MenuRegisterService()),
    EXIT_SYSTEM(3,"Exit System", new ExitSystem()),
    ADD_TEACHER(4, "Add Teacher", new MenuAddTeacherService()),
    ADD_STUDENT(5, "Add Student", new MenuAddStudentService()),
    SHOW_ALL_TEACHER(6, "Show All Teacher", new MenuShowTeacherService()),
    SHOW_ALL_STUDENT(7, "Show All Student", new MenuShowStudentService()),
    UNKNOWN;
    private String label;
    private Process service;
    private int number;

    Menu() {
    }

    Menu(int number, String label, Process service) {
        this.label = label;
        this.service = service;
        this.number = number;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return number + "." + label;
    }

    public void process() {
        service.process();
        MenuUtil.showMenu();
    }

    public int getNumber() {
        return this.number;
    }

    public static Menu find(int number) {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if (menus[i].getNumber() == number) {
                return menus[i];
            }
        }
        return Menu.UNKNOWN;
    }

    public static void showAllMenu() {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if (menus[i] != UNKNOWN) {
                if(menus[i]==LOGIN||menus[i]==REGISTER||menus[i] ==  EXIT_SYSTEM){
                      if(!Config.loggedIn){
                    System.out.println(menus[i]);
                    }
                }else if(Config.loggedIn){
                    System.out.println(menus[i]);
                    }
                
                
            }
        }
    }
}
