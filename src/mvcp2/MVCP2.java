/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mvcp2;

import Controlador.ControladorMDB;
import Vista.FrmUsuarios;
import pkgModelo.pkgModelo.MDB;

/**
 *
 * @author lizz-
 */
public class MVCP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MDB objModelo=new MDB();
        
        FrmUsuarios objVista=new FrmUsuarios();
        ControladorMDB objController;
        objController = new ControladorMDB(objVista,objModelo);
        objController.iniciar();
        objVista.setVisible(true);
    }
    
}
