package Controlador;

import BD.Conexion;
import Modelo.Marca;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

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
        return true;
    }
    public boolean eliminar(int marca)
    {
        return true;
    }
    public ArrayList<Marca> buscarTodos()
    {
        return null;
    }
    public Marca buscarPorId(int id)
    {
        return null;
    }
}
