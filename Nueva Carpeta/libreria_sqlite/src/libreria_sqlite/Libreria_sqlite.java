/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria_sqlite;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author rober
 */
public class Libreria_sqlite {
Connection con;
public String URL="jdbc:sqlite:C:/textos/db_estudiante.db";

    public void abrir(){
        try{
              con=DriverManager.getConnection(URL);
           //   JOptionPane.showMessageDialog(null, "Conectado");
          }catch(Exception x){
              System.out.println("Error"+x.getMessage().toString());
          }
    }
    
    public void Seleccionar(String sql, JTable tabla){
           ResultSet rs=null;
      DefaultTableModel model=(DefaultTableModel)tabla.getModel();
      
       model.setRowCount(0);
        PreparedStatement st;
        try {
            st = con.prepareStatement(sql);
            rs=st.executeQuery();
            
            while(rs.next()){
            Object d[]=new Object[tabla.getColumnCount()];
            for(int i=0;i<tabla.getColumnCount();i++){
                d[i]=rs.getString(i+1);
            }            
                model.addRow(d);                
            }                            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage().toString());
        }               
     }
    public void acoin(String sql){
     
        try{
            PreparedStatement st=con.prepareStatement(sql);
        st.execute();
        }catch(Exception x){
            
        }
    }
    
    public void cerrar(){
          try{
            con.close();
        }catch(Exception x){
            System.out.println("Error"+x.getMessage().toString());
        }
    }


}
