package clases;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class Clases{
    private String driver="com.mysql.jdbc.Driver";
    private String cadena="jdbc:mysql://localhost/sist_fact";
    private String usuario="root";
    private String clave="";
    private Connection conn;
    public PreparedStatement sentence;
    public ResultSet data;

    //la conexion se maneja con constructores
    public Clases(){
        try{
            Class.forName(driver);
            conn=DriverManager.getConnection(cadena,usuario,clave);
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "Error en el driver", "ERROR", 0);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en la conexión", "ERROR", 0);
        }
    }

    public void registrar_cliente(int codigo, String apellidos, String nombres, String ruc) {
        try{
            CallableStatement registrar=conn.prepareCall("CALL registrar_clientes(?,?,?,?)");
            registrar.setInt(1, codigo); //se vincula cada parametro con el campo de la tabla
            registrar.setString(2, apellidos);
            registrar.setString(3, nombres);
            registrar.setString(4, ruc);       
            registrar.execute(); //ejecuta la sentencia
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error durante el registro", "ERROR", 0);
        }
    }

    public void insertar_producto(int codigo, String descripcion, double precio) {
        try{
            CallableStatement insertar=conn.prepareCall("CALL insertar_productos(?,?,?)");
            insertar.setInt(1, codigo); //se vincula cada parametro con el campo de la tabla
            insertar.setString(2, descripcion);
            insertar.setDouble(3, precio);
            insertar.execute();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error durante el registro", "ERROR", 0);
        }
    }

    public ResultSet buscar_codigo_cliente(int cod) {
        ResultSet data=null;
        try{
            Statement sen=conn.createStatement();
            data=sen.executeQuery("CALL busqueda_codigo_cliente("+cod+")"); //se llama al procedimiento
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error durante la búsqueda", "ERROR", 0);
        }
        return data;
    }

    public ResultSet buscar_ruc_cliente(String ruc) {
        ResultSet data=null;
        try{
            Statement sen=conn.createStatement();
            data=sen.executeQuery("CALL busqueda_ruc_cliente("+ruc+")"); //se llama al procedimiento
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error durante la búsqueda", "ERROR", 0);
        }
        return data;
    }

    public ResultSet buscar_codigo_producto(int code) {
        ResultSet data=null;
        try{
            Statement sen=conn.createStatement();
            data=sen.executeQuery("CALL busqueda_codigo_producto("+code+")"); 
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error durante la búsqueda", "ERROR", 0);
        }
        return data;
    }

    public ResultSet buscar_precio_producto(double precio) {
        ResultSet data=null;
        try{
            Statement sen=conn.createStatement();
            data=sen.executeQuery("CALL busqueda_precio_producto("+precio+")"); 
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error durante la búsqueda", "ERROR", 0);
        }
        return data;
    }
    
    public void actualizar_cliente(String apell, String nom, String ruc, int cod) {
        try{
            CallableStatement actualizar=conn.prepareCall("CALL actualizar_cliente(?,?,?,?)");
            actualizar.setString(1, apell); //se vincula cada parametro con el campo de la tabla
            actualizar.setString(2, nom);
            actualizar.setString(3, ruc);
            actualizar.setInt(4, cod);
            actualizar.execute();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al actualizar cliente", "ERROR", 0);
        }
    }
    
    public void actualizar_producto(String desc, double prc, int cod) {
        try{
            CallableStatement actualizar=conn.prepareCall("CALL actualizar_producto(?,?,?)");
            actualizar.setString(1, desc); 
            actualizar.setDouble(2, prc);
            actualizar.setInt(3, cod);
            actualizar.execute();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al actualizar producto", "ERROR", 0);
        }
    }
    
    public void eliminar_cliente(int cod) {
        try{
            CallableStatement eliminar=conn.prepareCall("CALL eliminar_cliente(?)");
            eliminar.setInt(1, cod);
            eliminar.execute();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al eliminar cliente", "ERROR", 0);
        }
    }
    
    public void eliminar_producto(int cod) {
        try{
            CallableStatement eliminar=conn.prepareCall("CALL eliminar_producto(?)");
            eliminar.setInt(1, cod);
            eliminar.execute();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al eliminar producto", "ERROR", 0);
        }
    }

    public ResultSet consultar_clientes() {
        ResultSet data=null;
        try{
            Statement sen=conn.createStatement();
            data=sen.executeQuery("CALL mostrar_clientes");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error durante la consulta", "ERROR", 0);
        }
        return data;
    }
    
   public ResultSet consultar_productos() {
        ResultSet data=null;
        try{
            Statement sen=conn.createStatement();
            data=sen.executeQuery("CALL mostrar_productos");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error durante la consulta", "ERROR", 0);
        }
        return data;
    }
    
   public void insertar_factura(int num, String fecha, int idCliente){
       try{
            CallableStatement insertar_b=conn.prepareCall("CALL registrar_factura(?,?,?)");
            insertar_b.setInt(1, num); //se vincula cada parametro con el campo de la tabla
            insertar_b.setString(2, fecha);
            insertar_b.setInt(3, idCliente);
            insertar_b.execute();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error durante el registro de la boleta", "ERROR", 0);
        }
   }
   
   public void insertar_detalle_factura(int cant, double precio, int idProducto, int factura_numero, double subtotal){
       try{
            CallableStatement insertar_d=conn.prepareCall("CALL registrar_detalle_factura(?,?,?,?,?)");
            insertar_d.setInt(1, cant); //se vincula cada parametro con el campo de la tabla
            insertar_d.setDouble(2, precio);
            insertar_d.setInt(3, idProducto);
            insertar_d.setInt(4, factura_numero);
            insertar_d.setDouble(5, subtotal);
            insertar_d.execute();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error durante el registro del detalle de boleta (clases)", "ERROR", 0);
        }
   }
   
   public void insertar_detalle_factura2(double impuesto, double total, int cod){
       try{
            CallableStatement insertar_d=conn.prepareCall("CALL registrar_factura2(?,?,?)");
            insertar_d.setDouble(1, impuesto);
            insertar_d.setDouble(2, total);
            insertar_d.setInt(3, cod);
            insertar_d.execute();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error durante el registro del detalle de boleta 2", "ERROR", 0);
        }
   }
   
   public ResultSet obtener_precio(int cod){
        ResultSet precio=null;
        try{
            Statement sen=conn.createStatement();
            precio=sen.executeQuery("CALL obtener_precio("+cod+")"); //se llama al procedimiento
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al obtener el precio (clases)", "ERROR", 0);
        }
        return precio;
   }
   
   public double obtener_precio2(int cod) throws SQLException{
	ResultSet rs = obtener_precio(cod);
	double precio = 0.0;
	while (rs.next()) {
		precio = rs.getDouble(1);
	}
	return precio;
}
   
   public ResultSet consultar_detalle(int num) {
        ResultSet data=null;
        try{
            Statement sen=conn.createStatement();
            data=sen.executeQuery("CALL mostrar_detalle("+num+")");
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error durante la consulta de detalles", "ERROR", 0);
        }
        return data;
    }
   
   public void eliminar_producto_detalle(int num, int cod) {
        try{
            CallableStatement eliminar=conn.prepareCall("CALL eliminar_producto_detalle(?,?)");
            eliminar.setInt(1, num);
            eliminar.setInt(2, cod);
            eliminar.execute();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al eliminar producto del detalle", "ERROR", 0);
        }
    }
   
   
    public void EjecutarReporte_productos(){
        JasperReport jr; 
        JasperPrint jprint; 
        String ruta;
        try{
            Class.forName(driver);
            conn=DriverManager.getConnection(cadena,usuario,clave);
            ruta="/reportes/Reporte_Productos.jasper"; 
            jr=(JasperReport)JRLoader.loadObject(getClass().getResource(ruta)); 
            jprint=JasperFillManager.fillReport(jr, null, conn); 
            JasperViewer jv=new JasperViewer(jprint); 
            jv.setTitle("Reporte de productos");
            jv.setVisible(true); //formulario no modal
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "Error en el driver");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en la conexion");
        }catch(JRException e){
            JOptionPane.showMessageDialog(null, "Error al generar reporte");
        }
    }
   
    public void EjecutarReporte_productos_cod(int codigo){
        JasperReport jr; //se declara una variable tipo Jasper (identificar al reporte)
        JasperPrint jprint; //imprimir el reporte
        String ruta;
        try{
            Class.forName(driver);
            conn=DriverManager.getConnection(cadena,usuario,clave);
            ruta="/reportes/Reporte_bsqProducto_código.jasper"; //define la ubicacion del reporte
            jr=(JasperReport)JRLoader.loadObject(getClass().getResource(ruta)); //carga la variable ruta y la carga como clase
            
            Map parametro=new HashMap();//se crea un map para los parametros
            parametro.clear(); //limpia el parametro
            parametro.put("codigo", codigo);
            
            jprint=JasperFillManager.fillReport(jr, parametro, conn); //que es lo que se va aimprimir como reporte
            JasperViewer jv=new JasperViewer(jprint); //genera un visor
            jv.setTitle("Reporte de productos previa búsqueda por código");
            jv.setVisible(true); //formulario no modal
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "Error en el driver");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en la conexion");
        }catch(JRException e){
            JOptionPane.showMessageDialog(null, "Error al genera reporte");
        }
    }
   
    public void EjecutarReporte_clientes(){
        JasperReport jr; 
        JasperPrint jprint; 
        String ruta;
        try{
            Class.forName(driver);
            conn=DriverManager.getConnection(cadena,usuario,clave);
            ruta="/reportes/Reporte_clientes.jasper"; 
            jr=(JasperReport)JRLoader.loadObject(getClass().getResource(ruta)); 
            jprint=JasperFillManager.fillReport(jr, null, conn); 
            JasperViewer jv=new JasperViewer(jprint); 
            jv.setTitle("Reporte de clientes");
            jv.setVisible(true); 
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "Error en el driver");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en la conexion");
        }catch(JRException e){
            JOptionPane.showMessageDialog(null, "Error al generar reporte");
        }
    }
   
    public void EjecutarReporte_clientes_cod(int codigo){
        JasperReport jr; //se declara una variable tipo Jasper (identificar al reporte)
        JasperPrint jprint; //imprimir el reporte
        String ruta;
        try{
            Class.forName(driver);
            conn=DriverManager.getConnection(cadena,usuario,clave);
            ruta="/reportes/Reporte_bsqCliente_código.jasper"; //define la ubicacion del reporte
            jr=(JasperReport)JRLoader.loadObject(getClass().getResource(ruta)); //carga la variable ruta y la carga como clase
            
            Map parametro=new HashMap();//se crea un map para los parametros
            parametro.clear(); //limpia el parametro
            parametro.put("Código_Cliente", codigo);
            
            jprint=JasperFillManager.fillReport(jr, parametro, conn); //que es lo que se va aimprimir como reporte
            JasperViewer jv=new JasperViewer(jprint); //genera un visor
            jv.setTitle("Reporte de clientes previa búsqueda por código");
            jv.setVisible(true); //formulario no modal
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "Error en el driver");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en la conexion");
        }catch(JRException e){
            JOptionPane.showMessageDialog(null, "Error al genera reporte");
        }
    }
    
    public void EjecutarReporte_clientes_ruc(String ruc){
        JasperReport jr; //se declara una variable tipo Jasper (identificar al reporte)
        JasperPrint jprint; //imprimir el reporte
        String ruta;
        try{
            Class.forName(driver);
            conn=DriverManager.getConnection(cadena,usuario,clave);
            ruta="/reportes/Reporte_bsqCliente_Ruc.jasper"; //define la ubicacion del reporte
            jr=(JasperReport)JRLoader.loadObject(getClass().getResource(ruta)); //carga la variable ruta y la carga como clase
            
            Map parametro=new HashMap();//se crea un map para los parametros
            parametro.clear(); //limpia el parametro
            parametro.put("Ruc_Cliente", ruc);
            
            jprint=JasperFillManager.fillReport(jr, parametro, conn); //que es lo que se va aimprimir como reporte
            JasperViewer jv=new JasperViewer(jprint); //genera un visor
            jv.setTitle("Reporte de clientes previa búsqueda por R.U.C");
            jv.setVisible(true); //formulario no modal
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "Error en el driver");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en la conexion");
        }catch(JRException e){
            JOptionPane.showMessageDialog(null, "Error al genera reporte");
        }
    }
   
    public void EjecutarReporte_facturas(){
        JasperReport jr; 
        JasperPrint jprint; 
        String ruta;
        try{
            Class.forName(driver);
            conn=DriverManager.getConnection(cadena,usuario,clave);
            ruta="/reportes/Reporte_Factura.jasper"; 
            jr=(JasperReport)JRLoader.loadObject(getClass().getResource(ruta)); 
            jprint=JasperFillManager.fillReport(jr, null, conn); 
            JasperViewer jv=new JasperViewer(jprint); 
            jv.setTitle("Reporte de facturas");
            jv.setVisible(true); 
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "Error en el driver");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en la conexion");
        }catch(JRException e){
            JOptionPane.showMessageDialog(null, "Error al generar reporte");
        }
    }
    
    public void EjecutarReporte_facturas_num(int numero){
        JasperReport jr; //se declara una variable tipo Jasper (identificar al reporte)
        JasperPrint jprint; //imprimir el reporte
        String ruta;
        try{
            Class.forName(driver);
            conn=DriverManager.getConnection(cadena,usuario,clave);
            ruta="/reportes/Reporte_bsqFactura_número.jasper"; //define la ubicacion del reporte
            jr=(JasperReport)JRLoader.loadObject(getClass().getResource(ruta)); //carga la variable ruta y la carga como clase
            
            Map parametro=new HashMap();//se crea un map para los parametros
            parametro.clear(); //limpia el parametro
            parametro.put("Factura_Número", numero);
            
            jprint=JasperFillManager.fillReport(jr, parametro, conn); //que es lo que se va aimprimir como reporte
            JasperViewer jv=new JasperViewer(jprint); //genera un visor
            jv.setTitle("Reporte de facturas previa búsqueda por número");
            jv.setVisible(true); //formulario no modal
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "Error en el driver");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en la conexion");
        }catch(JRException e){
            JOptionPane.showMessageDialog(null, "Error al genera reporte");
        }
    }
    
    public void EjecutarReporte_facturas_fecha(String fecha){
        JasperReport jr; //se declara una variable tipo Jasper (identificar al reporte)
        JasperPrint jprint; //imprimir el reporte
        String ruta;
        try{
            Class.forName(driver);
            conn=DriverManager.getConnection(cadena,usuario,clave);
            ruta="/reportes/Reporte_facturas_fecha.jasper"; //define la ubicacion del reporte
            jr=(JasperReport)JRLoader.loadObject(getClass().getResource(ruta)); //carga la variable ruta y la carga como clase
            
            Map parametro=new HashMap();//se crea un map para los parametros
            parametro.clear(); //limpia el parametro
            parametro.put("fecha",fecha);
            
            jprint=JasperFillManager.fillReport(jr, parametro, conn); //que es lo que se va aimprimir como reporte
            JasperViewer jv=new JasperViewer(jprint); //genera un visor
            jv.setTitle("Reporte de facturas previa búsqueda por fecha");
            jv.setVisible(true); //formulario no modal
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "Error en el driver");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en la conexion");
        }catch(JRException e){
            JOptionPane.showMessageDialog(null, "Error al genera reporte");
        }
    }
    
    public void EjecutarReporte_facturas_id(int id){
        JasperReport jr; //se declara una variable tipo Jasper (identificar al reporte)
        JasperPrint jprint; //imprimir el reporte
        String ruta;
        try{
            Class.forName(driver);
            conn=DriverManager.getConnection(cadena,usuario,clave);
            ruta="/reportes/Reporte_facturas_id.jasper"; //define la ubicacion del reporte
            jr=(JasperReport)JRLoader.loadObject(getClass().getResource(ruta)); //carga la variable ruta y la carga como clase
            
            Map parametro=new HashMap();//se crea un map para los parametros
            parametro.clear(); //limpia el parametro
            parametro.put("id",id);
            
            jprint=JasperFillManager.fillReport(jr, parametro, conn); //que es lo que se va aimprimir como reporte
            JasperViewer jv=new JasperViewer(jprint); //genera un visor
            jv.setTitle("Reporte de facturas previa búsqueda por I.D de cliente");
            jv.setVisible(true); //formulario no moda
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "Error en el driver");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en la conexion");
        }catch(JRException e){
            JOptionPane.showMessageDialog(null, "Error al genera reporte");
        }
    }

}
