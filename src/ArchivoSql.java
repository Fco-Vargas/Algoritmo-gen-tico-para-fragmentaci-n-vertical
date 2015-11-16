
import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author Vargas
 */
public class ArchivoSql {
    private File archivoSql;
    private FileWriter fileWriter;
    private PrintWriter printWriter;
    private FileReader fileReader;
    private BufferedReader bufferReader;
    
    private String linea = "";
    private boolean nuevaLinea = true;
    private boolean buscarFinSentencia = false;
    private boolean buscarNombre = true;
    private boolean buscarAtributos = false;
    private String nombreTabla = "";
    private String atributos = "";
    private String extras = "";
    private String sentenciaTabla = "";
    
    private ArrayList<String> vectorSentenciaTabla = null;
    
    public boolean AgregarArchivo(File archivoSql) {
        if (archivoSql.exists()) {
            this.archivoSql = archivoSql;
            return true;
        }
        return false;
    }
    
    private boolean inicializarLectura() {
        try {
            fileReader = new FileReader(archivoSql);
            bufferReader = new BufferedReader(fileReader);
            return true;
        } catch (FileNotFoundException ex) {
            return false;
        }
    }
    
    public boolean leerArchivo() {    
        vectorSentenciaTabla = new ArrayList();
        if (inicializarLectura()) {
            try {
                while((linea = bufferReader.readLine()) != null) {
                    linea = linea.toLowerCase();  
                    formarSentenciaTabla();
                }
                return true;
            } catch (IOException ex) {
                ex.getMessage();
            }
        }
        return false;
    }
    
    private void formarSentenciaTabla() {
        if (linea.contains("create")) {
            if (linea.contains("table")) {
                crearSentenciaTabla(linea.indexOf("table") + 5);
            }             
        } else if (!nuevaLinea) {
            crearSentenciaTabla(0);
        }
        
    }
    
    private void crearSentenciaTabla(int inicio) {
        if (linea.contains(";")) {
            if (linea.indexOf(";") > 0) {
                sentenciaTabla += linea.substring(inicio,linea.indexOf(";"));
            }                   
            nuevaLinea = true;                
            vectorSentenciaTabla.add(sentenciaTabla);
            sentenciaTabla = "";
            if (linea.indexOf(";") + 1 < linea.length()) {
                linea = linea.substring(linea.indexOf(";") + 1);                      
                formarSentenciaTabla();
            }
        } else {
            sentenciaTabla += linea.substring(inicio);
            nuevaLinea = false;
        }
    }
    
    public boolean obtenerInformacionSentencia() {
        if (vectorSentenciaTabla.size() <= 0) {
            return false;
        }
        for (String sentenciaSql : vectorSentenciaTabla) {
            obtenerNombreTabla(sentenciaSql);
            obtenerAtributoTabla(sentenciaSql);
            obtenerExtrasTabla(sentenciaSql);
        }
        return true;
    } 
    
    private void obtenerNombreTabla(String sentenciaSql) {
        
    }
    
    private void obtenerAtributoTabla(String sentenciaSql) {
       
    }
    
    private void obtenerExtrasTabla(String sentenciaSql) {
        
    }
}
