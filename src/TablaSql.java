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
    
    public String[] getAtributosAsArray() {
        String[] atributosAsArray = getAtributos().split(",");
        String propiedadAtributo = "";
        String[] propiedadAtributoAsArray;
        for (int i = 0; i < atributosAsArray.length; i++) {
            if (atributosAsArray[i].trim().startsWith("primary") || atributosAsArray[i].trim().startsWith("foreign") || 
                    atributosAsArray[i].trim().startsWith("index") || atributosAsArray[i].trim().startsWith("key") || 
                    atributosAsArray[i].trim().startsWith("unique")) {
                propiedadAtributo += i + " ";       
            }            
        }        
        if (propiedadAtributo.length() > 0) {
            propiedadAtributoAsArray = propiedadAtributo.trim().split(" ");
            String tmp = "";
            boolean concatenar = true;
            for (int i = 0; i < atributosAsArray.length; i++) {
                for (int j = 0; j < propiedadAtributoAsArray.length; j++) {
                    if (i == Integer.valueOf(propiedadAtributoAsArray[j])) {
                        concatenar = false;
                        break;
                    }                   
                }
                if (concatenar) {
                    tmp += atributosAsArray[i] + ",";
                }
                concatenar = true;
            }
            atributosAsArray = tmp.substring(0, tmp.lastIndexOf(",")).split(",");
        }
        return atributosAsArray;
    }
}
