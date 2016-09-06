
package vista;
import controlador.ControladorDatoPersonal;
import controlador.ControladorDatosCarga;
import static controlador.ControladorEspecialidad.conexion;
import controlador.ControladorHerramienta;
import controlador.ControladorTaller;



import modelo.DatoPersonal;
import modelo.DatosCarga;
import modelo.Herramienta;
import modelo.Taller;
import modelo.DetalleHerramienta;

import java.sql.Date;
import java.util.Calendar;
import javax.swing.table.DefaultTableModel;
import javax.swing.JCheckBox;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;




public class AbmDatos extends javax.swing.JInternalFrame {
    
    ArrayList <Herramienta> herramienta = new ArrayList<>();
    ArrayList<DetalleHerramienta> detalleHerramientas=new ArrayList<>();
    //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:ii:ss");
    //SimpleDateFormat sdf;
    //    DafaultTableModel modelo = new DefaultTableModel();
    DatosCarga dc;
    DatoPersonal dp;
    Herramienta her;
    Taller tal;
    JCheckBox jckb1, jckb2, jckb3, jckb4;
    ButtonGroup buttonGroup;
    DefaultTableModel modelo = new DefaultTableModel();
    PreparedStatement stmt;
    ResultSet rs;
    ResultSetMetaData rsm;
    Integer bandera = 0;
    DefaultListModel listaHerramienta;

    ///////////////////////////////////////////////////
    public AbmDatos() {
        initComponents();
        
        //sdf = new SimpleDateFormat("dd - MM - yyyy");
        
        dc = new DatosCarga();
        dp = new DatoPersonal();
        her= new Herramienta();
        tal= new Taller();
  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgTipoHerram = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jdcFechaCarga = new com.toedter.calendar.JDateChooser();
        jtfLugarCarga = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtfApellidoNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfDomicilio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfLugarNac = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfTelefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfEdad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtfEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtfDni = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jdcFechaNac = new com.toedter.calendar.JDateChooser();
        jcbEstadoCivil = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbCargaDato = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jlId = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbHerramientaTaller = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jcbLugarProduccion = new javax.swing.JComboBox();
        jcbEstadoTaller = new javax.swing.JComboBox();
        jtfDescripTaller = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList();
        jScrollPane6 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList();
        jbRudimentaria = new javax.swing.JButton();
        jbManuales = new javax.swing.JButton();
        JbElectricas = new javax.swing.JButton();
        jbMaquinarias = new javax.swing.JButton();

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Modificar");

        jButton3.setText("Eliminar");

        jLabel1.setText("Apellido y Nombre");

        jLabel2.setText("Domicilio");

        jLabel3.setText("Lugar Nacimiento");

        jLabel4.setText("Teléfono");

        jLabel5.setText("Fecha Nacimiento");

        jLabel6.setText("Edad");

        jLabel7.setText("Dni");

        jLabel8.setText("Email");

        jLabel9.setText("Estado Civil");

        jcbEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Soltero", "Casado", "Divorciado", "Viudo", "Convive" }));

        jtbCargaDato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtbCargaDato);

        jLabel10.setText("Fecha carga");

        jLabel11.setText("Lugar carga");

        jlId.setText("id");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(273, 273, 273)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jlId)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jdcFechaCarga, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                    .addComponent(jtfLugarCarga)))
                            .addComponent(jLabel9)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(344, 344, 344)
                                .addComponent(jLabel8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtfDni, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jcbEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jdcFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel6))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jtfApellidoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel2))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jtfLugarNac, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel4))))
                                    .addComponent(jLabel1))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtfEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtfDomicilio))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 985, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(jtfLugarCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlId))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jdcFechaCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfApellidoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jtfDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfLugarNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jtfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jtfEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jdcFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
        );

        jTabbedPane1.addTab("Datos Carga", jPanel1);

        jButton4.setText("Agregar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Modificar");

        jButton6.setText("Eliminar");

        jLabel12.setText("Tipo de herramienta que utiliza");

        jtbHerramientaTaller.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jtbHerramientaTaller);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jcbLugarProduccion.setEditable(true);
        jcbLugarProduccion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Adentro de su casa", "En el patio de su casa", "En el taller", "En un centro vecinal" }));

        jcbEstadoTaller.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Excelente", "Bueno", "Regular", "Malo" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbLugarProduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbEstadoTaller, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDescripTaller, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jcbLugarProduccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbEstadoTaller, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfDescripTaller, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel14.setText("Donde realiza su producción");

        jLabel15.setText("Estado de taller");

        jLabel16.setText("Descripcion (taller)");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de Herramientas"));

        jList1.setBorder(javax.swing.BorderFactory.createTitledBorder("Rudimentaria"));
        jScrollPane3.setViewportView(jList1);

        jList2.setBorder(javax.swing.BorderFactory.createTitledBorder("Manuales"));
        jScrollPane4.setViewportView(jList2);

        jList3.setBorder(javax.swing.BorderFactory.createTitledBorder("Maquinarias"));
        jList3.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(jList3);

        jList4.setBorder(javax.swing.BorderFactory.createTitledBorder("Electricas"));
        jScrollPane6.setViewportView(jList4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 9, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbRudimentaria.setText("Rudimentarias");
        jbRudimentaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRudimentariaActionPerformed(evt);
            }
        });

        jbManuales.setText("Manuales");

        JbElectricas.setText("Electricas");

        jbMaquinarias.setText("Maquinarias");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 992, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(136, 136, 136)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jbMaquinarias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(JbElectricas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jbRudimentaria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jbManuales, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(130, 130, 130))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(13, 13, 13)
                                .addComponent(jbRudimentaria, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbManuales, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JbElectricas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(jbMaquinarias, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Taller Herramientas", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1017, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        //System.out.println("Se agrago correctamente el dato carga");
        //Datos Persona
        String apeNom = jtfApellidoNombre.getText();
        System.out.println(apeNom);
        String domicilio = jtfDomicilio.getText();
        System.out.println(domicilio);
        String lugarNac = jtfLugarNac.getText();
        System.out.println(lugarNac);
        String telef = jtfTelefono.getText();
        System.out.println(telef);      
        String email = jtfEmail.getText();
        System.out.println(email);
        String edad = jtfEdad.getText();
        System.out.println(edad);
        Integer dni = Integer.parseInt(jtfDni.getText());
        System.out.println(dni);
        String estadoCivil = jcbEstadoCivil.getSelectedItem().toString();
        System.out.println(estadoCivil);
        
        int anioNac=jdcFechaNac.getCalendar().get(Calendar.YEAR);
        int mesNac=jdcFechaNac.getCalendar().get(Calendar.MONTH);
        int diaNac=jdcFechaNac.getCalendar().get(Calendar.DAY_OF_MONTH);
        String fechaNac= anioNac +"-"+ mesNac +"-"+ diaNac;
        System.out.println(fechaNac);
        
        dp.setFechaNacimiento(fechaNac);
        dp.setApeNom(apeNom);
        dp.setLugNac(lugarNac);
        dp.setFechaNacimiento(fechaNac);
        dp.setDni(dni);
        dp.setEstaCivil(estadoCivil);
        dp.setDomicilio(domicilio);
        dp.setTel(telef);
        dp.setEdad(edad);
        dp.setEmail(email);
        
      
        ControladorDatosCarga cdc = new ControladorDatosCarga();
        
        int año=jdcFechaCarga.getCalendar().get(Calendar.YEAR);
        int mes=jdcFechaCarga.getCalendar().get(Calendar.MONTH);
        int dia=jdcFechaCarga.getCalendar().get(Calendar.DAY_OF_MONTH);
        
        String fecha = año + "-" + mes + "-" + dia;
        dc.setFecha_carga(fecha);
        
        System.out.println(fecha);
        String lCarga = jtfLugarCarga.getText();
        dc.setLugarCarga(lCarga);
        
        System.out.println(lCarga);
        
        ControladorDatoPersonal cdp = new ControladorDatoPersonal();
        //Controlador DatoPersona
        cdp.agregar(dp);
        System.out.println("Se agrego correctamente datos personales");
          
        Integer dniTmp = dni;
        Long dniTmp1 = dniTmp.longValue();
        dc.setId_personas(dniTmp1);
        //Controlador DatoCarga
        cdc.agregar(dc);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
//        String tipoHerremienta = jtfTipoHerramienta.getText();
        
//        String descripHerramienta= jtfDescripcionHerr.getText();

        her.setTipoHerramienta(null);
        //her.setTipoHerramienta(tipoHerremienta);
//        her.setDescripcion(descripHerramienta);
        
        
        ControladorTaller ct= new ControladorTaller();
        
        String lugarProduccion = jcbLugarProduccion.getSelectedItem().toString();
        String descripTaller = jtfDescripTaller.getText();
        String estadoTaller = jcbEstadoTaller.getSelectedItem().toString();
        
        tal.setLugarProduccion(lugarProduccion);
        tal.setDescripcion(descripTaller);
        //tal.setHerramienta(null);
        
                
        ControladorHerramienta ch= new ControladorHerramienta();
                
        ch.agregar(her);
        System.out.println("Se agrego correctamente datos Taller/Herramienta");
                
        //ct.agregar(tal);
        
        // dc.setId_personas(dni);
        //cdc.agregar(dc);
         ct.agregar(tal);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jbRudimentariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRudimentariaActionPerformed

        // TODO add your handling code here:Boton Rudimentaria
        bandera = 0;
        AbmDetalleHerramienta adh = new AbmDetalleHerramienta();
        adh.setTitle("Herramientas Rudimentarias");
        adh.setLocationRelativeTo(null);
        
        bandera = 1;
        if(bandera == 1){
            JOptionPane.showConfirmDialog(null, "Desea agregar una Herramienta Rudimentaria a la Lista");
            adh.setVisible(true);
            this.desktopIcon.add(adh);
            if(jbRudimentaria.isSelected()){
            
            // caraga elementos a jList
            listaHerramienta = new DefaultListModel();
            //listaHerramienta.setElementAt(evt, index);
        }
        else{
            
        }
                
        
        }
        
        
    }//GEN-LAST:event_jbRudimentariaActionPerformed

//    public static int diferenciaEnDias2(Date fechaMayor, Date fechaMenor) {
//    
//        long diferenciaEn_ms;
//        
//        //diferenciaEn_ms = (fechaMayor.getTime - fechaMenor.getTime());
//        diferenciaEn_ms = fechaMayor.getTime() - fechaMenor.getTime();
//                
//        long dias = (diferenciaEn_ms / (1000 * 60 * 60 * 24));
//        return (int) dias;
//        }
        
    public void nombreFila(){
         
        dp = new DatoPersonal(); 
        //cdp = new ControladorDatoPersonal();
        dc = new DatosCarga();
        //cdc = new ControladorDatosCarga();
        
        modelo.addColumn("Fecha Carga");
        modelo.addColumn("Lugar carga");
        modelo.addColumn("Apellido y Nombre");
        modelo.addColumn("Domicilio");
        modelo.addColumn("Lugar Nacimiento");
        modelo.addColumn("Telefono");
        modelo.addColumn("Fecha Nacimiento");
        modelo.addColumn("Edad");
        modelo.addColumn("Dni");
        modelo.addColumn("Email");
        modelo.addColumn("Estado Civil");
        
        jtbCargaDato.setModel(modelo);
        }
    
    private void cargaFilas() {
        
        try {
            
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/mercartenueva";
            conexion = DriverManager.getConnection(url,"postgres","camello");
            //JOptionPane.showConfirmDialog(null, "Conexión Exitosa");
            System.out.println("Conectado");
            
            String query = "SELECT fecha_carga, lugar_carga, id_personas, apellido_nombre, domicilio, lugar_nacimiento," +
                                "edad, dni, correo_electronico, estado_civil FROM datos_carga , personas " +
                                "WHERE datos_carga.id_personas = personas.id_persona";
            
            stmt = conexion.prepareStatement(query);
            
            rs = stmt.executeQuery();
            
            rsm = rs.getMetaData();
            
            while (rs.next()) {
                
                Object [] fila = new Object[rsm.getColumnCount()];
                
                fila[0] = rs.getString(2);
                fila[1] = rs.getString(3);
                fila[2] = rs.getString(4);
                fila[3] = rs.getString(5);
                fila[4] = rs.getString(6);
                fila[5] = rs.getString(7);
                fila[6] = rs.getString(8);
                fila[7] = rs.getString(9);
                fila[8] = rs.getString(10);
                fila[9] = rs.getString(11);
                fila[10] = rs.getString(12);
                
                modelo.addRow(fila);
                
            }    
            
            rs.close();
            
        } catch (SQLException error) {
            JOptionPane.showConfirmDialog(null, error);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AbmDatos.class.getName()).log(Level.SEVERE, null, ex);
        } 
       
    }
    private void actualizaTabla() {
        
        ResultSet r;
        DefaultTableModel mod;
        try {
            
            r = rs;
           // nombreFila();
            //generosControlador.cargaFilas();
            //nombreFila();
            cargaFilas();
            mod = new DefaultTableModel();
            String fila [] = new String[1];
             
            while(r.next()){
                
                fila[1] = r.getString("fecha_carga");
                fila[2] = r.getString("lugar_carga");
                fila[3] = r.getString("apellido_nombre");
                fila[4] = r.getString("domicilio");
                fila[5] = r.getString("lugar_nacimiento");
                fila[6] = r.getString("edad");
                fila[7] = r.getString("dni");
                fila[8] = r.getString("correo_electronico");
                fila[9] = r.getString("estado_civil");
                fila[10] = r.getString(10);
                fila[11] = r.getString(11);
                
                mod.addRow(fila);
                
            }
            
            jtbCargaDato.setModel(mod);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbElectricas;
    private javax.swing.ButtonGroup bgTipoHerram;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JList jList3;
    private javax.swing.JList jList4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbManuales;
    private javax.swing.JButton jbMaquinarias;
    private javax.swing.JButton jbRudimentaria;
    private javax.swing.JComboBox jcbEstadoCivil;
    private javax.swing.JComboBox jcbEstadoTaller;
    private javax.swing.JComboBox jcbLugarProduccion;
    private com.toedter.calendar.JDateChooser jdcFechaCarga;
    private com.toedter.calendar.JDateChooser jdcFechaNac;
    private javax.swing.JLabel jlId;
    private javax.swing.JTable jtbCargaDato;
    private javax.swing.JTable jtbHerramientaTaller;
    private javax.swing.JTextField jtfApellidoNombre;
    private javax.swing.JTextField jtfDescripTaller;
    private javax.swing.JTextField jtfDni;
    private javax.swing.JTextField jtfDomicilio;
    private javax.swing.JTextField jtfEdad;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfLugarCarga;
    private javax.swing.JTextField jtfLugarNac;
    private javax.swing.JTextField jtfTelefono;
    // End of variables declaration//GEN-END:variables

    
    
  
}
