package Controlador;

import BD.Conexion;
import Modelo.Marca;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

public class ControladorMarca {
    
    public boolean agregar(Marca marca)
    {
        try{
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();

            String sql = "INSERT INTO MARCA (NOMBRE, HABILITADO) VALUES (?,?)";
            PreparedStatement st;

            st = cx.prepareStatement(sql);
            st.setString(1, marca.getNombre());
            st.setBoolean(2, marca.isHabilitado());
            
            st.executeUpdate();
            st.close(); // cierra declaración
            cx.close(); // cierra conexión a la BDD
            return true;
        } catch (SQLException ex)
        {
            System.out.println("Error: " + ex.getMessage());
        }
        return false;
    }
    public boolean actualizar(Marca marca)
    {
        try{
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();

            String sql = "UPDATE MARCA SET NOMBRE = ?, HABILITADO = ? WHERE ID = ?";
            PreparedStatement st;

            st = cx.prepareStatement(sql);
            st.setString(1, marca.getNombre());
            st.setBoolean(2, marca.isHabilitado());
            st.setInt(3, marca.getId());
            
            st.executeUpdate();
            st.close(); // cierra declaración
            cx.close(); // cierra conexión a la BDD
            return true;
        } catch (SQLException ex)
        {
            System.out.println("Error: " + ex.getMessage());
        }
        return false;
    }
    public boolean eliminar(int id)
    {
        try{
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();

            String sql = "DELETE FROM MARCA WHERE ID = ?";
            PreparedStatement st;

            st = cx.prepareStatement(sql);
            st.setInt(1, id);
            
            st.executeUpdate();
            st.close(); // cierra declaración
            cx.close(); // cierra conexión a la BDD
            return true;
        } catch (SQLException ex)
        {
            System.out.println("Error: " + ex.getMessage());
        }
        return false;
    }
    public Marca buscarPorId(int id)
    {
        try{
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();

            String sql = "SELECT ID, NOMBRE, HABILITADO FROM MARCA WHERE ID=?";
            PreparedStatement st;

            st = cx.prepareStatement(sql);
            st.setInt(1, id);
            
            ResultSet rs = st.executeQuery();
            
            if(rs.next())
            {
                Marca marca = new Marca();
                marca.setId(rs.getInt("ID"));
                marca.setNombre(rs.getString("NOMBRE"));
                marca.setHabilitado(rs.getBoolean("HABILITADO"));
                return marca;
            }
            st.close(); // cierra declaración
            cx.close(); // cierra conexión a la BDD
            return null;
        } catch (SQLException ex)
        {
            System.out.println("Error: " + ex.getMessage());
        }
        return null;
    }
    public ArrayList<Marca> buscarTodos()
    {
        ArrayList<Marca> listado = new ArrayList<Marca>();
        try{
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();

            String sql = "SELECT ID, NOMBRE, HABILITADO FROM MARCA";
            PreparedStatement st;

            st = cx.prepareStatement(sql);           
            ResultSet rs = st.executeQuery();
            
            while(rs.next())
            {
                Marca marca = new Marca();
                marca.setId(rs.getInt("ID"));
                marca.setNombre(rs.getString("NOMBRE"));
                marca.setHabilitado(rs.getBoolean("HABILITADO"));
                listado.add(marca);
            }
            st.close(); // cierra declaración
            cx.close(); // cierra conexión a la BDD
        } catch (SQLException ex)
        {
            System.out.println("Error: " + ex.getMessage());
        }
        return listado;
    }
    
    public javax.swing.DefaultComboBoxModel llenarCombo()
    {
        // EL COMBO MOSTRARÁ LO QUE DEVUELVE EL METODO TOSTRING() DE MARCA
        //
        Vector listado = new Vector();
        listado.add(new Marca(0, "Seleccionar", true));
        try
        {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "SELECT ID, NOMBRE, HABILITADO FROM MARCA WHERE HABILITADO = 1 ORDER BY NOMBRE";
            PreparedStatement st;
            st = cx.prepareStatement(sql);
         
            ResultSet rs = st.executeQuery();
            
            while(rs.next())
            {
                Marca marca = new Marca();
                marca.setId(rs.getInt("ID") );
                marca.setNombre(rs.getString("NOMBRE"));
                marca.setHabilitado(rs.getBoolean("HABILITADO"));
                listado.add(marca);
            }
            st.close();
            cx.close();
        }
        catch(SQLException ex)
        {
            System.out.println("Error: " + ex.getMessage());
        }
        return new javax.swing.DefaultComboBoxModel(listado);
    }
}
