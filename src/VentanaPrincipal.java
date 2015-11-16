
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Vargas
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    private File archivoSeleccionado;
    
    public VentanaPrincipal() {
        initComponents();
    }
    
    private void abrirArchivo() {
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("archivos sql", "sql");
        elegirArchivo.setFileFilter(filtro);
        elegirArchivo.setAcceptAllFileFilterUsed(false);
        int returnVal = elegirArchivo.showOpenDialog(this);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
           archivoSeleccionado = elegirArchivo.getSelectedFile();
           lblNombreArchivo.setText(archivoSeleccionado.getName());
        }
    }
    
    private void leerArchivo() {
        ArchivoSql archivoSql = new ArchivoSql();
        if (!archivoSql.AgregarArchivo(archivoSeleccionado)) {
            JOptionPane.showMessageDialog(null, "Es probable que el archivo seleccionado no exista.");
            return;
        }
        if (archivoSql.leerArchivo()) {
            JOptionPane.showMessageDialog(null, "El archivo fue leido exitosamente");
        } else {
            JOptionPane.showMessageDialog(null, "El archivo no puedo ser leido");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        elegirArchivo = new javax.swing.JFileChooser();
        panelRaiz = new javax.swing.JPanel();
        lblPoblacion = new javax.swing.JLabel();
        lblCruzamiento = new javax.swing.JLabel();
        lblMutacion = new javax.swing.JLabel();
        lblGeneraciones = new javax.swing.JLabel();
        lblC = new javax.swing.JLabel();
        campoPoblacion = new javax.swing.JTextField();
        campoCruzamiento = new javax.swing.JTextField();
        campoMutacion = new javax.swing.JTextField();
        campoGeneraciones = new javax.swing.JTextField();
        labelCValor = new javax.swing.JLabel();
        panelAbrirArchivo = new javax.swing.JPanel();
        btnAbrirArchivo = new javax.swing.JButton();
        lblNombreArchivo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnEjecutar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        elegirArchivo.setDialogTitle("Abrir archivo .sql");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de fragmentación");
        setResizable(false);

        panelRaiz.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.darkGray), "Fragmentación vertical aplicando el algoritmo genético", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 18), new java.awt.Color(0, 9, 118))); // NOI18N

        lblPoblacion.setText("Tamaño de población :");

        lblCruzamiento.setText("Probabilidad de cruzamiento :");

        lblMutacion.setText("Probabilidad de mutación :");

        lblGeneraciones.setText("No. generaciones a ejecutarse : ");

        lblC.setText("C :");

        campoPoblacion.setToolTipText("");

        campoCruzamiento.setToolTipText("");

        campoMutacion.setToolTipText("");

        labelCValor.setText("65,000");

        panelAbrirArchivo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Elegir BD a fragmentar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 14))); // NOI18N

        btnAbrirArchivo.setText("Abrir archivo");
        btnAbrirArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirArchivoActionPerformed(evt);
            }
        });

        lblNombreArchivo.setText("ejemploArchivo.sql");

        javax.swing.GroupLayout panelAbrirArchivoLayout = new javax.swing.GroupLayout(panelAbrirArchivo);
        panelAbrirArchivo.setLayout(panelAbrirArchivoLayout);
        panelAbrirArchivoLayout.setHorizontalGroup(
            panelAbrirArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAbrirArchivoLayout.createSequentialGroup()
                .addGroup(panelAbrirArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAbrirArchivoLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(btnAbrirArchivo))
                    .addGroup(panelAbrirArchivoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblNombreArchivo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAbrirArchivoLayout.setVerticalGroup(
            panelAbrirArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAbrirArchivoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNombreArchivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(btnAbrirArchivo)
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Opciones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 14))); // NOI18N

        btnEjecutar.setText("Ejecutar Algoritmo");
        btnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEjecutar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(btnEjecutar)
                .addGap(69, 69, 69)
                .addComponent(btnSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelRaizLayout = new javax.swing.GroupLayout(panelRaiz);
        panelRaiz.setLayout(panelRaizLayout);
        panelRaizLayout.setHorizontalGroup(
            panelRaizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRaizLayout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(panelRaizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelAbrirArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelRaizLayout.createSequentialGroup()
                        .addGroup(panelRaizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPoblacion)
                            .addComponent(lblCruzamiento)
                            .addComponent(lblMutacion)
                            .addComponent(lblGeneraciones)
                            .addComponent(lblC))
                        .addGroup(panelRaizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRaizLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(labelCValor))
                            .addGroup(panelRaizLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelRaizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campoPoblacion)
                                    .addComponent(campoCruzamiento)
                                    .addComponent(campoGeneraciones)
                                    .addComponent(campoMutacion, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(39, 39, 39)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        panelRaizLayout.setVerticalGroup(
            panelRaizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRaizLayout.createSequentialGroup()
                .addGroup(panelRaizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRaizLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(panelRaizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPoblacion)
                            .addComponent(campoPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelRaizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCruzamiento)
                            .addComponent(campoCruzamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelRaizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMutacion)
                            .addComponent(campoMutacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(panelRaizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGeneraciones)
                            .addComponent(campoGeneraciones))
                        .addGap(18, 18, 18)
                        .addGroup(panelRaizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblC)
                            .addComponent(labelCValor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelAbrirArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelRaizLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRaiz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbrirArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirArchivoActionPerformed
        abrirArchivo();
    }//GEN-LAST:event_btnAbrirArchivoActionPerformed

    private void btnEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarActionPerformed
        leerArchivo();
    }//GEN-LAST:event_btnEjecutarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    public static void main(String args[]) {
      new VentanaPrincipal().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrirArchivo;
    private javax.swing.JButton btnEjecutar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JTextField campoCruzamiento;
    private javax.swing.JTextField campoGeneraciones;
    private javax.swing.JTextField campoMutacion;
    private javax.swing.JTextField campoPoblacion;
    private javax.swing.JFileChooser elegirArchivo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCValor;
    private javax.swing.JLabel lblC;
    private javax.swing.JLabel lblCruzamiento;
    private javax.swing.JLabel lblGeneraciones;
    private javax.swing.JLabel lblMutacion;
    private javax.swing.JLabel lblNombreArchivo;
    private javax.swing.JLabel lblPoblacion;
    private javax.swing.JPanel panelAbrirArchivo;
    private javax.swing.JPanel panelRaiz;
    // End of variables declaration//GEN-END:variables
}
