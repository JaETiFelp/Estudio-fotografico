
package Presentacion;

import Datos.CargoLaboral;
import Negocio.Msj;
import Negocio.NCargoLaboral;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

public class FCargoLaboral extends javax.swing.JDialog implements INF412{

    private final CargoLaboral cargoLaboral;
    
    public FCargoLaboral(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        Init.setImagenLogo(Fondo);
        cargoLaboral=new CargoLaboral();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pmTabla = new javax.swing.JPopupMenu();
        miBuscar = new javax.swing.JMenuItem();
        miActualizarTabla = new javax.swing.JMenuItem();
        s1 = new javax.swing.JPopupMenu.Separator();
        mirbNombre = new javax.swing.JRadioButtonMenuItem();
        mirbId = new javax.swing.JRadioButtonMenuItem();
        bgTE = new javax.swing.ButtonGroup();
        bgOrden = new javax.swing.ButtonGroup();
        Fondo = new jcMousePanel.jcMousePanel();
        lb1 = new javax.swing.JLabel();
        spDatos = new javax.swing.JScrollPane();
        tDatos = new JTableDX.JTableDX();
        btNuevo = new javax.swing.JButton();
        btAgregar = new javax.swing.JButton();
        btModificar = new javax.swing.JButton();
        tfDescripcion = new JAbcFieldWPO.JAbcFieldWPO();

        miBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        miBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/buscar.png"))); // NOI18N
        miBuscar.setText("Buscar");
        pmTabla.add(miBuscar);

        miActualizarTabla.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        miActualizarTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/actualizar.png"))); // NOI18N
        miActualizarTabla.setText("Actualizar la tabla");
        miActualizarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miActualizarTablaActionPerformed(evt);
            }
        });
        pmTabla.add(miActualizarTabla);
        pmTabla.add(s1);

        bgOrden.add(mirbNombre);
        mirbNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mirbNombre.setSelected(true);
        mirbNombre.setText("Ordenar por nombre");
        pmTabla.add(mirbNombre);

        bgOrden.add(mirbId);
        mirbId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mirbId.setText("Ordenar por Id");
        pmTabla.add(mirbId);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tipo de cargos en la empresa");

        Fondo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Fondo.setModo(4);
        Fondo.setTransparencia(1.0F);
        Fondo.setVisibleLogo(false);

        lb1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb1.setText("Descripcion:");

        spDatos.setComponentPopupMenu(pmTabla);

        tDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Descripcion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tDatos.setComponentPopupMenu(pmTabla);
        spDatos.setViewportView(tDatos);

        btNuevo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/nuevo.png"))); // NOI18N
        btNuevo.setText("Nuevo");
        btNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevoActionPerformed(evt);
            }
        });

        btAgregar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/agregar.png"))); // NOI18N
        btAgregar.setText("Agregar");
        btAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarActionPerformed(evt);
            }
        });

        btModificar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/actualizar.png"))); // NOI18N
        btModificar.setText("Modificar");
        btModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarActionPerformed(evt);
            }
        });

        tfDescripcion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfDescripcion.setMaxLength(49);
        tfDescripcion.setMessageText("Dato Obligatorio");
        tfDescripcion.setModo(((byte)1));
        tfDescripcion.setOptionalText(false);
        tfDescripcion.setTipo(((byte)2));

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addComponent(lb1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(spDatos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(tfDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btNuevo)
                .addGap(18, 18, 18)
                .addComponent(btAgregar)
                .addGap(18, 18, 18)
                .addComponent(btModificar)
                .addGap(94, 94, 94))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(spDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btModificar)
                    .addComponent(btAgregar)
                    .addComponent(btNuevo))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoActionPerformed
        clear();
    }//GEN-LAST:event_btNuevoActionPerformed

    private void btAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarActionPerformed
        cargoLaboral.setNombre(tfDescripcion.getText());
        NCargoLaboral.agregar(cargoLaboral);
    }//GEN-LAST:event_btAgregarActionPerformed

    private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed
        if(tDatos.getSelectedRow()>-1){
            cargoLaboral.setNombre(tfDescripcion.getText());
            cargoLaboral.setId((Short)tDatos.getValueAt(tDatos.getSelectedRow(),0));
            NCargoLaboral.modificar(cargoLaboral);            
        }else{
            Msj.showW("Seleccione una fila de la tabla!!!", "Cargo Laboral");
        }
    }//GEN-LAST:event_btModificarActionPerformed

    private void miActualizarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miActualizarTablaActionPerformed
        if(mirbNombre.isSelected()){
            tDatos.updateTabla(CargoLaboral.getArray2DN());
        }else{
            tDatos.updateTabla(CargoLaboral.getArray2DI());
        }        
    }//GEN-LAST:event_miActualizarTablaActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FCargoLaboral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                FCargoLaboral dialog = new FCargoLaboral(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private jcMousePanel.jcMousePanel Fondo;
    private javax.swing.ButtonGroup bgOrden;
    private javax.swing.ButtonGroup bgTE;
    private javax.swing.JButton btAgregar;
    private javax.swing.JButton btModificar;
    private javax.swing.JButton btNuevo;
    private javax.swing.JLabel lb1;
    private javax.swing.JMenuItem miActualizarTabla;
    private javax.swing.JMenuItem miBuscar;
    private javax.swing.JRadioButtonMenuItem mirbId;
    private javax.swing.JRadioButtonMenuItem mirbNombre;
    private javax.swing.JPopupMenu pmTabla;
    private javax.swing.JPopupMenu.Separator s1;
    private javax.swing.JScrollPane spDatos;
    private JTableDX.JTableDX tDatos;
    private JAbcFieldWPO.JAbcFieldWPO tfDescripcion;
    // End of variables declaration//GEN-END:variables

    @Override
    public void clear() {
        tfDescripcion.clear();
    }
    
    @Override
    public void setVisible(boolean b) {
        if(b){
            clear();
            
        }
        super.setVisible(b);
    }      

    @Override
    public void activarPrivilegios(String privilegios){
        btAgregar.setEnabled(privilegios.charAt(1)=='V');
        btModificar.setEnabled(privilegios.charAt(2)=='V');
    }

    @Override
    public void repaintAll(Color colorFondo,float transparencia,Color colorFuente,Font font){
        Fondo.setBackground(colorFondo);
        Fondo.setTransparencia(transparencia);
        Component c[]=Fondo.getComponents();
        for (Component ci : c) {
            ci.setForeground(colorFuente);
            ci.setFont(font);
        }
        pmTabla.setFont(font);
        pmTabla.setBackground(colorFondo);
        pmTabla.setForeground(colorFuente);        
    }    
}
