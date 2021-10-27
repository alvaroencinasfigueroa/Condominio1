/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condominio.principal;

import condominio.vista.Registro;
import javax.swing.JFrame;
import javax.swing.UIManager;
/**
 *
 * @author Alvaro_Encinas_Figueroa 
 */
public class Principal {
    public static void main(String srg[]){
        //com.jtattoo.plaf.noire.NoireLookAndFeel
        //com.jtattoo.plaf.smart.SmartLookAndFeel
        //com.jtattoo.plaf.aluminium.AluminiumLookAndFeel
        //com.jtattoo.plaf.mint.MintLookAndFeel
        //com.jtattoo.plaf.acryl.AcrylLookAndFeel
        //com.jtattoo.plaf.aero.AeroLookAndFeel
        //com.jtattoo.plaf.bernstein.BernsteinLookAndFeel
        //com.jtattoo.plaf.fast.FastLookAndFeel
        //com.jtattoo.plaf.graphite.GraphiteLookAndFeel
        //com.jtattoo.plaf.hifi.HiFiLookAndFeel
        //com.jtattoo.plaf.luna.LunaLookAndFeel
        //com.jtattoo.plaf.texture.TextureLookAndFeel
        try{
            UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
        }catch(Exception e){
        }
        
        Registro registro = new Registro();
        registro.setVisible(true);
        registro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        registro.setLocationRelativeTo(null);
    }
    
}
