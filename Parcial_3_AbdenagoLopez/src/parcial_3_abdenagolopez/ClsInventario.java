
package parcial_3_abdenagolopez;

import java.util.ArrayList;


public class ClsInventario {
    
    
static ArrayList<String> Codigo  = new ArrayList<>();
static ArrayList<Boolean> Activo  = new ArrayList<>();
static ArrayList<String> Tipo  = new ArrayList<>();
static ArrayList<String> Descripcion  = new ArrayList<>();
static ArrayList<Integer> Cantidad  = new ArrayList<>();
static ArrayList<Integer> Precio  = new ArrayList<>();
static int SiActivo, NoActivo;

    public static int getSiActivo() {
        return SiActivo;
    }

    public static void setSiActivo(int SiActivo) {
        ClsInventario.SiActivo = SiActivo;
    }

    public static int getNoActivo() {
        return NoActivo;
    }

    public static void setNoActivo(int NoActivo) {
        ClsInventario.NoActivo = NoActivo;
    }

    
  

  
  public void Agregar(String codigo, Boolean activo, String tipo, String descripcion, int cantidad, int precio )
    { 
        Codigo.add(codigo);
        Activo.add(activo);
        Tipo.add(tipo);
        Descripcion.add(descripcion);
        Cantidad.add(cantidad);
        Precio.add(precio);
        ClsInventario.Tipo = Tipo;
        
    }

    void setSiActivo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setNoActivo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void Agregar(String text, boolean tieneactivo, String text0, int parseInt, int parseInt0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  
}
