/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.menu;

import bean.Config;
import bean.Student;
import service.menu.inter.MenuShowStudentServiceInter;

/**
 *
 * @author Hp
 */
public class MenuShowStudentService implements MenuShowStudentServiceInter {

    @Override
    public void processLogic() {
        Student[] allStudent = Config.instance().getStudents();
        for (int i = 0; i < allStudent.length; i++) {
            System.out.println(allStudent[i]);

        }
    }

}
