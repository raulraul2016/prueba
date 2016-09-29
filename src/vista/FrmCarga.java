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
import modelo.TipoHerramienta;

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

public class FrmCarga extends javax.swing.JInternalFrame {

    ArrayList<Herramienta> herramienta;
    ArrayList<TipoHerramienta> detalleHerramientas;
    //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:ii:ss");
    //SimpleDateFormat sdf;
    //    DafaultTableModel modelo = new DefaultTableModel();
    DatosCarga dc;
    DatoPersonal dp;
    Herramienta her;
    Taller tal;
    JCheckBox jckb1, jckb2, jckb3, jckb4;
    ButtonGroup buttonGroup;
    DefaultTableModel modelo;
    PreparedStatement stmt;
    ResultSet rs;
    ResultSetMetaData rsm;
    Integer bandera = 0;
    DefaultListModel listaHerramienta, tipoHerramienta;

    ///////////////////////////////////////////////////
    public FrmCarga() {
        initComponents();

        //sdf = new SimpleDateFormat("dd - MM - yyyy");
        dc = new DatosCarga();
        dp = new DatoPersonal();
        her = new Herramienta();
        tal = new Taller();
        listaHerramienta = new DefaultListModel();;
        tipoHerramienta = new DefaultListModel();
        modelo = new DefaultTableModel();
        herramienta = new ArrayList<>();
        detalleHerramientas = new ArrayList<>();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgTipoHerram = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
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
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jlId = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
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
        jlTipoHerramientas = new javax.swing.JList();
        jbRudimentaria = new javax.swing.JButton();
        jbManuales = new javax.swing.JButton();
        JbElectricas = new javax.swing.JButton();
        jbMaquinarias = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jlTipoHerramientas1 = new javax.swing.JList();
        jButton7 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jPanel9 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox();
        jPanel10 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox();
        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jTextField3 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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

        jLabel10.setText("Fecha carga");

        jLabel11.setText("Lugar carga");

        jlId.setText("id");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                .addComponent(jtfDomicilio)))))
                .addContainerGap(357, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel10)
                        .addComponent(jdcFechaCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jtfLugarCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlId)
                .addGap(29, 29, 29)
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
                                .addComponent(jdcFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(321, 321, 321))
        );

        jTabbedPane1.addTab("Datos Carga", jPanel1);

        jButton4.setText("Agregar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel12.setText("Herramienta que utiliza");

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
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel14.setText("Donde realiza su producción");

        jLabel15.setText("Estado de taller");

        jLabel16.setText("Descripcion (taller)");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
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

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipos Herramientas"));

        jlTipoHerramientas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane3.setViewportView(jlTipoHerramientas);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbRudimentaria.setText("Rudimentarias");
        jbRudimentaria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbRudimentariaMouseClicked(evt);
            }
        });
        jbRudimentaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRudimentariaActionPerformed(evt);
            }
        });

        jbManuales.setText("Manuales");
        jbManuales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbManualesActionPerformed(evt);
            }
        });

        JbElectricas.setText("Electricas");

        jbMaquinarias.setText("Maquinarias");

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Herramientas Cargadas"));

        jlTipoHerramientas1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane4.setViewportView(jlTipoHerramientas1);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jButton7.setText(">>");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jbMaquinarias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JbElectricas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbRudimentaria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbManuales, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(139, 139, 139))
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
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(182, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Taller Herramientas", jPanel2);

        jButton8.setText("Agregar");

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Materia Prima"));

        jLabel13.setText("¿Que tipo de Materia Prima");

        jLabel17.setText("¿Como la Adquiere?");

        jLabel18.setText("Lugar de Procedencia");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.Alignment.LEADING, 0, 189, Short.MAX_VALUE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(9, 9, 9)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel18)
                .addGap(26, 26, 26)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Trueque"));

        jLabel19.setText("¿Trueca su Producto?");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel20.setText("¿Con quien lo hace?");

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20)
                    .addComponent(jComboBox5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Ventas"));

        jLabel21.setText("¿Cual es el periodo de mayor ventas?");

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jRadioButton1.setText("jRadioButton1");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox6, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton1)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Productos"));

        jLabel22.setText("Nombre:");

        jTextField1.setText("jTextField1");

        jLabel23.setText("Descripción:");

        jTextField2.setText("jTextField2");

        jLabel24.setText("Precio:");

        jTextField3.setText("jTextField3");

        jLabel25.setText("Cantidad:");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField2)
                    .addComponent(jTextField3))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton8))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)))
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Materia Prima-Venta-Producto-Trueque", jPanel7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1032, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 43, Short.MAX_VALUE))
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

        int anioNac = jdcFechaNac.getCalendar().get(Calendar.YEAR);
        int mesNac = jdcFechaNac.getCalendar().get(Calendar.MONTH);
        int diaNac = jdcFechaNac.getCalendar().get(Calendar.DAY_OF_MONTH);
        String fechaNac = anioNac + "-" + mesNac + "-" + diaNac;
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

        int año = jdcFechaCarga.getCalendar().get(Calendar.YEAR);
        int mes = jdcFechaCarga.getCalendar().get(Calendar.MONTH);
        int dia = jdcFechaCarga.getCalendar().get(Calendar.DAY_OF_MONTH);

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
        her.getdHerramienta();
        //her.setTipoHerramienta(tipoHerremienta);
//        her.setDescripcion(descripHerramienta);

        ControladorTaller ct = new ControladorTaller();

        String lugarProduccion = jcbLugarProduccion.getSelectedItem().toString();
        String descripTaller = jtfDescripTaller.getText();
        String estadoTaller = jcbEstadoTaller.getSelectedItem().toString();

        tal.setLugarProduccion(lugarProduccion);
        tal.setDescripcion(descripTaller);
        //tal.setHerramienta(null);

        ControladorHerramienta ch = new ControladorHerramienta();

        ch.agregar(her);
        System.out.println("Se agrego correctamente datos Taller/Herramienta");

        //ct.agregar(tal);
        // dc.setId_personas(dni);
        //cdc.agregar(dc);
        ct.agregar(tal);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jbRudimentariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRudimentariaActionPerformed

        // Boton Rudimentaria
        if(tipoHerramienta.getSize()>0 ){
            tipoHerramienta.add(tipoHerramienta.getSize(), jbRudimentaria.getText());
        }else{
            tipoHerramienta.add(0, jbRudimentaria.getName());
        }
                
        jlTipoHerramientas.setModel(tipoHerramienta);

        //hacer metodo de ventana emergente!!!   
        int resp = JOptionPane.showConfirmDialog(null, "Desea agregar una Herramienta Rudimentaria a la Lista?");
        if (JOptionPane.OK_OPTION == resp) {
            //cambiar AbmDetalleHerramienta por FrmDetalleHerramienta
            
            AbmDetalleHerramienta adh = new AbmDetalleHerramienta();
            adh.setTitle("Herramientas Rudimentarias");
            adh.setLocationRelativeTo(null);
            adh.setVisible(true);
            this.desktopIcon.add(adh);
            System.out.println("Se agrego una herramienta Rudimentaria");
        } else {

            JOptionPane.showMessageDialog(null, "Seleccione otro tipo de Herramienta si lo necesita");
        }


    }//GEN-LAST:event_jbRudimentariaActionPerformed
    //}
    private void jbRudimentariaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbRudimentariaMouseClicked

        
    }//GEN-LAST:event_jbRudimentariaMouseClicked

    private void jbManualesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbManualesActionPerformed

        // Boton Manuales
        bandera = 0;
        AbmDetalleHerramienta adh = new AbmDetalleHerramienta();
        adh.setTitle("Herramientas Manuales");
        adh.setLocationRelativeTo(null);
        bandera = 1;
        if (bandera == 1) {
            JOptionPane.showConfirmDialog(null, "Desea agregar una Herramienta Manuales a la Lista");
            adh.setVisible(true);
            this.desktopIcon.add(adh);
            if (jbRudimentaria.isSelected()) {

                // caraga elementos a jList
                listaHerramienta = new DefaultListModel();
    }//GEN-LAST:event_jbManualesActionPerformed
        }
    }
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

    public void nombreFila() {

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

    }

    private void cargaFilas() {

        try {

            String query = "SELECT fecha_carga, lugar_carga, id_personas, apellido_nombre, domicilio, lugar_nacimiento,"
                    + "edad, dni, correo_electronico, estado_civil FROM datos_carga , personas "
                    + "WHERE datos_carga.id_personas = personas.id_persona";

            stmt = conexion.getConexion().prepareStatement(query);

            rs = stmt.executeQuery();

            rsm = rs.getMetaData();

            while (rs.next()) {

                Object[] fila = new Object[rsm.getColumnCount()];

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
            String fila[] = new String[1];

            while (r.next()) {

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

        } catch (Exception e) {
            System.out.println(e);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbElectricas;
    private javax.swing.ButtonGroup bgTipoHerram;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton jbManuales;
    private javax.swing.JButton jbMaquinarias;
    private javax.swing.JButton jbRudimentaria;
    private javax.swing.JComboBox jcbEstadoCivil;
    private javax.swing.JComboBox jcbEstadoTaller;
    private javax.swing.JComboBox jcbLugarProduccion;
    private com.toedter.calendar.JDateChooser jdcFechaCarga;
    private com.toedter.calendar.JDateChooser jdcFechaNac;
    private javax.swing.JLabel jlId;
    private javax.swing.JList jlTipoHerramientas;
    private javax.swing.JList jlTipoHerramientas1;
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
