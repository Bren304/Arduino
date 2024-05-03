package biblioteca;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Libros extends Elementos{
    
    Connection con = Conexion.establecerConexion();
    
    String editorial;
    int numeroPaginas;
    
    PreparedStatement ps;
    ResultSet rs;
    
    public void Mostrar(){
        System.out.println(titulo + categoria + stock + editorial + numeroPaginas + tematica + estado);
    }

    @Override
    public void crearElementos(){
        
        try {
            ps = con.prepareStatement("INSERT INTO informacion (titulo, id_categoria, stock, editorial, num_paginas, tematica, estado) VALUES (?,?,?,?,?,?,?)");
            
            ps.setString(1, titulo);
            ps.setInt(2, categoria);
            ps.setInt(3, stock);
            ps.setString(4, editorial);
            ps.setInt(5, numeroPaginas);
            ps.setString(6, tematica);
            ps.setInt(7, estado);
            
            int r = ps.executeUpdate();
            
            if (r > 0) {
                JOptionPane.showMessageDialog(null, "Libro creadoe en la base de datos");
            } else {
                JOptionPane.showMessageDialog(null, "Algo a ocurrido, revise las entradas");
            }            
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    @Override
    public void consultarElementos(){
        try {
            ps = con.prepareStatement("SELECT * FROM informacion WHERE titulo = ?");
            
            ps.setString(1, titulo);
            
            rs = ps.executeQuery();
            if (rs.next()) {
                titulo = rs.getString("titulo");
                categoria = rs.getInt("id_categoria");
                stock = rs.getInt("stock");
                editorial = rs.getString("editorial");
                numeroPaginas = rs.getInt("num_paginas");
                tematica = rs.getString("tematica");
                estado = rs.getInt("estado");
                id = rs.getInt("id");
            } else {
                JOptionPane.showMessageDialog(null, "Ningún libro con ese nombre");
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    @Override
    public void editarElementos(){
        try {
            ps = con.prepareStatement("UPDATE informacion SET titulo = ?, stock = ?, editorial = ?, num_paginas = ?, tematica = ? WHERE id = ?");
            
            ps.setString(1, titulo);
            ps.setInt(2, stock);
            ps.setString(3, editorial);
            ps.setInt(4, numeroPaginas);
            ps.setString(5, tematica);
            ps.setInt(6, id);
            
            ps.executeUpdate();
            
            int r = ps.executeUpdate();
            if (r > 0) {
                JOptionPane.showMessageDialog(null, "Elemento editado");
            } else {
                JOptionPane.showMessageDialog(null, "Algo a ocurrido, revise las entradas");
            }            
            
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    @Override
    public void desactivarElementos(){    
        try {
            ps = con.prepareStatement("UPDATE informacion SET estado = ? WHERE titulo = ?");
            
            ps.setInt(1, 0);
            
            int r = ps.executeUpdate();
            
            if (r > 0) {
                JOptionPane.showMessageDialog(null, "Elemento desactivado");
            } else {
                JOptionPane.showMessageDialog(null, "Algo a ocurrido, revise las entradas");
            }            
        } catch (Exception e) {
        }
    }   
}
