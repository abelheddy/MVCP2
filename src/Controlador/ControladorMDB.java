/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.FrmUsuarios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import pkgModelo.pkgModelo.MDB;

/**
 *
 * @author lizz-
 */
public class ControladorMDB implements ActionListener {
    private FrmUsuarios _view;
    private MDB _model;

   /* @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/
    public ControladorMDB(FrmUsuarios _view, MDB _model) {
        this._view = _view;
        this._model = _model;
        this._view.BtnAltas.addActionListener(this);//se obtiene el control sobre el botón alta del formulario
        this._view.BtnEliminar.addActionListener(this);//se obtiene el control de botón eliminar
    }
    @Override
    //En este método se ΗatrapaΗ la interacción del usuario
    public void actionPerformed(ActionEvent e) {
        String leyenda = "";//esta variable servirá para atrapar los errores sql

        if (e.getSource() == _view.BtnAltas) { //Si el botón presionado fue el de alta

            leyenda = _model.registrarAlta("TbUsuarios", " null, ' " + _view.TxtNombre.getText() + " ',' " + _view.TxtUsuario.getText() + " ', " + _view.TxtContra.getText());
            //Se puede usar una variable o el control, lo ideal es que se pudiera llamar una función de
            // validación aquí sobre los datos obteindos de las cajas de texto
            JOptionPane.showMessageDialog(null, leyenda);//Se manda mensaje con elresultado de la
            //consulta de inserción
            limpiar();//se limpian las cajas de texto
            //agregar otros botones si se necesitan implementar
        }
    }

    public void iniciar() {
        _view.setTitle("MVC_Visual");
    }
    public void limpiar() {
        _view.TxtNombre.setText(null);
        _view.TxtUsuario.setText(null);

        _view.TxtContra.setText(null);
    }
}
