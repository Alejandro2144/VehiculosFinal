import java.util.ArrayList;
public class Vehiculo{
    
    // fields
    public static Vehiculo[] vehiculos = new Vehiculo[10];
    public static int tamano = 10;
    public static int posAnadir = 0;
    private int modelo;
    private String marca;
    private double valorComercial;
    private String color;
    
    // constructors
    public Vehiculo(){
        this.vehiculos[this.posAnadir] = this;
        this.posAnadir ++;
    }
    
    public Vehiculo(int mo, String ma, double va){
        this(mo, ma, va, "verde");
    }
    
    public Vehiculo(int mo, String ma, double va, String co){
        this.modelo = mo;
        this.marca = ma;
        this.valorComercial = va;
        this.color = co;
        this.vehiculos[this.posAnadir] = this;
        this.posAnadir ++;
    }
    
    // methods
    public int getModelo(){
        return this.modelo;
    }
    
    public void setModelo (int mo){
        this.modelo = mo;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public void setMarca (String ma){
        this.marca = ma;
    }
    
    public double getValorComercial(){
        return this.valorComercial;
    }
    
    public void setValorComercial (double va){
        this.valorComercial = va;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public void setColor (String co){
        this.color = co;
    }

    public String toString(){
        String info = String.valueOf(this.modelo) + "," + this.marca + "," + String.valueOf(this.valorComercial) + "," + this.color;
        return info;
    }
    
    public static String toStringVehiculos(){
      String infototal = "";
      for(Vehiculo v: vehiculos){
          if(v != null){
          infototal += "[" + v + "]";
        }
      }
      return infototal;
    }
    
    public static int cantidadVehiculos(){
        return posAnadir;
    }
    
    public static ArrayList<Vehiculo> metodo4(){
        ArrayList<Vehiculo> resultado = new ArrayList<Vehiculo>();
        for(int i = 0; i < posAnadir; i++){
            if(vehiculos[i].getColor().equals("verde")){
                resultado.add(vehiculos[i]);
            }
        }
        return resultado;
    }
}