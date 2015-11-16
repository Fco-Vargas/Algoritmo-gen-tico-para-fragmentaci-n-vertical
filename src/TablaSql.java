

/**
 *
 * @author Vargas
 */
public class TablaSql {

    private String nombre = "";
    private String atributos = "";
    private String extras = "";

    public TablaSql(String nombre, String atributos, String extras) {
        setNombre(nombre);
        setAtributos(atributos);
        setExtras(extras);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAtributos() {
        return atributos;
    }

    public void setAtributos(String atributos) {
        this.atributos = atributos;
    }

    public String getExtras() {
        return extras;
    }

    public void setExtras(String extras) {
        this.extras = extras;
    }

}
