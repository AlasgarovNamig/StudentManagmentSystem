/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.menu;

import service.menu.inter.ExitSystemInter;

/**
 *
 * @author Hp
 */
public class ExitSystem implements ExitSystemInter {

    @Override
    public void processLogic() {
        System.out.println("Sistemden Cixdiniz");
       System.exit(0);
    }
    
}
