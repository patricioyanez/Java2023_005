
import java.sql.Date;


public class GiftCard {
    private long codigo;
    private int clave;
    private int monto;
    private Date Vigencia;
    private Trabajador trabajador;

    public GiftCard() {
        this.codigo = 0;
        this.clave = 0;
        this.monto = 0;
        this.Vigencia = null;
        this.trabajador = null;
    }
    
    public GiftCard(long codigo, int clave, int monto, Date Vigencia, Trabajador trabajador) {
        this.codigo = codigo;
        this.clave = clave;
        this.monto = monto;
        this.Vigencia = Vigencia;
        this.trabajador = trabajador;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public Date getVigencia() {
        return Vigencia;
    }

    public void setVigencia(Date Vigencia) {
        this.Vigencia = Vigencia;
    }

    public String imprimir() {
        return  "\nCodigo   = " + codigo + 
                "\nClave    = " + clave + 
                "\nMonto    = " + monto + 
                "\nVigencia = " + Vigencia + 
                "\n**** Trabajador ***\n" + trabajador.imprimir() ;
    }
    
    public boolean validarClave()
    {
        String claveRut = this.trabajador.
                                getRut().
                                replace(".", "").
                                substring(0, 4);
        int claveNumerica = Integer.parseInt(claveRut);
        
        if(claveNumerica == clave)
            return true;
        else
            return false;
        
//        return claveNumerica == clave;
    }
    
}
