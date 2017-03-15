package proyecto4_haroldmendoza_josefernandez;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import org.graphstream.algorithm.Dijkstra;
import org.graphstream.graph.Edge;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.Path;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.ui.view.View;
import org.graphstream.ui.view.Viewer;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Proyecto 4: GLOBAL SURVEILLANCE SYSTEM");
        this.LlenarLista();
    }//Fin del main

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_information = new javax.swing.JDialog();
        panel_Information = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        tf_name = new javax.swing.JTextField();
        tf_age = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        tf_city = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        tf_status = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        tf_salary = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        tf_calls = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        tf_ResearchMotive = new javax.swing.JTextField();
        jdialog_Agregar = new javax.swing.JDialog();
        panel_Agregar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista_OpcionContacto = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista_AmigosAAgregar = new javax.swing.JList<>();
        btn_PasarAmigo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf_NombrePersona = new javax.swing.JTextField();
        btn_ComenzarSeguimiento = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tf_EdadPersona = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tf_CiudadPersona = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tf_EstadoCPersona = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tf_SalarioPersona = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cb_ResearchMotive = new javax.swing.JComboBox<>();
        jd_Connections = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        cb_Persona1 = new javax.swing.JComboBox<>();
        cb_Persona2 = new javax.swing.JComboBox<>();
        btn_viewConnections = new javax.swing.JButton();
        PanelPrincipal = new javax.swing.JPanel();
        label_Principal = new javax.swing.JLabel();
        b_grafoPrincipal = new javax.swing.JButton();
        b_informacion = new javax.swing.JButton();
        cb_Lista = new javax.swing.JComboBox<>();
        b_connections = new javax.swing.JButton();
        btn_Exit = new javax.swing.JButton();
        label_Imagen = new javax.swing.JLabel();
        btn_Agregar = new javax.swing.JButton();

        panel_Information.setBackground(new java.awt.Color(0, 102, 102));

        jLabel24.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Personal Information");

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/rsz_1489297719_icon-ios7-contact-outline.png"))); // NOI18N

        jLabel26.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Name:");

        tf_name.setEditable(false);
        tf_name.setFont(new java.awt.Font("OCR A Extended", 0, 13)); // NOI18N

        tf_age.setEditable(false);
        tf_age.setFont(new java.awt.Font("OCR A Extended", 0, 13)); // NOI18N

        jLabel27.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Age:");

        tf_city.setEditable(false);
        tf_city.setFont(new java.awt.Font("OCR A Extended", 0, 13)); // NOI18N

        jLabel28.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("City:");

        tf_status.setEditable(false);
        tf_status.setFont(new java.awt.Font("OCR A Extended", 0, 13)); // NOI18N

        jLabel29.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Civil Status:");

        tf_salary.setEditable(false);
        tf_salary.setFont(new java.awt.Font("OCR A Extended", 0, 13)); // NOI18N

        jLabel30.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Salary:");

        jLabel31.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Total Amount of Calls:");

        tf_calls.setEditable(false);
        tf_calls.setFont(new java.awt.Font("OCR A Extended", 0, 13)); // NOI18N

        jLabel32.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Research Motive:");

        tf_ResearchMotive.setEditable(false);
        tf_ResearchMotive.setFont(new java.awt.Font("OCR A Extended", 0, 13)); // NOI18N

        javax.swing.GroupLayout panel_InformationLayout = new javax.swing.GroupLayout(panel_Information);
        panel_Information.setLayout(panel_InformationLayout);
        panel_InformationLayout.setHorizontalGroup(
            panel_InformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_InformationLayout.createSequentialGroup()
                .addGroup(panel_InformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_InformationLayout.createSequentialGroup()
                        .addGroup(panel_InformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel_InformationLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel24))
                            .addGroup(panel_InformationLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel26)
                                .addGap(18, 18, 18)
                                .addComponent(tf_name, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                            .addGroup(panel_InformationLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(panel_InformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel28))
                                .addGap(18, 18, 18)
                                .addGroup(panel_InformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_city)
                                    .addComponent(tf_age))))
                        .addGroup(panel_InformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_InformationLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel25))
                            .addGroup(panel_InformationLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(panel_InformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel29))
                                .addGap(18, 18, 18)
                                .addGroup(panel_InformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_status, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                    .addComponent(tf_salary)))))
                    .addGroup(panel_InformationLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel32)
                        .addGap(33, 33, 33)
                        .addGroup(panel_InformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_InformationLayout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_calls, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tf_ResearchMotive, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        panel_InformationLayout.setVerticalGroup(
            panel_InformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_InformationLayout.createSequentialGroup()
                .addGroup(panel_InformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_InformationLayout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_InformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(tf_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_InformationLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel24)
                        .addGap(29, 29, 29)
                        .addGroup(panel_InformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(panel_InformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(tf_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30)
                            .addComponent(tf_salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(panel_InformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(tf_city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31)
                            .addComponent(tf_calls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(panel_InformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_ResearchMotive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_informationLayout = new javax.swing.GroupLayout(jd_information.getContentPane());
        jd_information.getContentPane().setLayout(jd_informationLayout);
        jd_informationLayout.setHorizontalGroup(
            jd_informationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Information, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_informationLayout.setVerticalGroup(
            jd_informationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Information, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panel_Agregar.setBackground(new java.awt.Color(0, 102, 102));

        lista_OpcionContacto.setFont(new java.awt.Font("OCR A Extended", 0, 13)); // NOI18N
        jScrollPane1.setViewportView(lista_OpcionContacto);

        lista_AmigosAAgregar.setFont(new java.awt.Font("OCR A Extended", 0, 13)); // NOI18N
        jScrollPane2.setViewportView(lista_AmigosAAgregar);

        btn_PasarAmigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/rsz_flecha.png"))); // NOI18N
        btn_PasarAmigo.setBorderPainted(false);
        btn_PasarAmigo.setContentAreaFilled(false);
        btn_PasarAmigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_PasarAmigoMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Current Contacts");

        jLabel3.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Related Contacts");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/rsz_1489297719_icon-ios7-contact-outline.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("OCR A Extended", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Name");

        tf_NombrePersona.setFont(new java.awt.Font("OCR A Extended", 0, 13)); // NOI18N

        btn_ComenzarSeguimiento.setFont(new java.awt.Font("OCR A Extended", 0, 13)); // NOI18N
        btn_ComenzarSeguimiento.setText("Process Information");
        btn_ComenzarSeguimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ComenzarSeguimientoMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("OCR A Extended", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Age");

        tf_EdadPersona.setFont(new java.awt.Font("OCR A Extended", 0, 13)); // NOI18N

        jLabel7.setFont(new java.awt.Font("OCR A Extended", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("City");

        tf_CiudadPersona.setFont(new java.awt.Font("OCR A Extended", 0, 13)); // NOI18N

        jLabel8.setFont(new java.awt.Font("OCR A Extended", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Civil Status");

        tf_EstadoCPersona.setFont(new java.awt.Font("OCR A Extended", 0, 13)); // NOI18N

        jLabel9.setFont(new java.awt.Font("OCR A Extended", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Salary");

        tf_SalarioPersona.setFont(new java.awt.Font("OCR A Extended", 0, 13)); // NOI18N

        jLabel10.setFont(new java.awt.Font("OCR A Extended", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Research Motive");

        cb_ResearchMotive.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cb_ResearchMotive.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_ResearchMotiveItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout panel_AgregarLayout = new javax.swing.GroupLayout(panel_Agregar);
        panel_Agregar.setLayout(panel_AgregarLayout);
        panel_AgregarLayout.setHorizontalGroup(
            panel_AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_AgregarLayout.createSequentialGroup()
                .addGroup(panel_AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_AgregarLayout.createSequentialGroup()
                        .addGroup(panel_AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_AgregarLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2))
                            .addGroup(panel_AgregarLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panel_AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_AgregarLayout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jLabel3))
                            .addGroup(panel_AgregarLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_PasarAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panel_AgregarLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(btn_ComenzarSeguimiento)))
                .addGroup(panel_AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_AgregarLayout.createSequentialGroup()
                        .addGroup(panel_AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_AgregarLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel8))
                            .addGroup(panel_AgregarLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(panel_AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_EdadPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_NombrePersona, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_CiudadPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_EstadoCPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_SalarioPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel_AgregarLayout.createSequentialGroup()
                        .addGroup(panel_AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_AgregarLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(panel_AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(panel_AgregarLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel5)
                                        .addGap(109, 109, 109)
                                        .addGroup(panel_AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cb_ResearchMotive, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(panel_AgregarLayout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(jLabel7))
                            .addGroup(panel_AgregarLayout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jLabel6)))
                        .addContainerGap(39, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_AgregarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(302, 302, 302))
        );
        panel_AgregarLayout.setVerticalGroup(
            panel_AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_AgregarLayout.createSequentialGroup()
                .addGroup(panel_AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_AgregarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10))
                        .addGroup(panel_AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel_AgregarLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(btn_PasarAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_AgregarLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(panel_AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tf_NombrePersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cb_ResearchMotive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_EdadPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_CiudadPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8))
                    .addGroup(panel_AgregarLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(panel_AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(2, 2, 2)
                .addComponent(tf_EstadoCPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGap(12, 12, 12)
                .addGroup(panel_AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_ComenzarSeguimiento)
                    .addComponent(tf_SalarioPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jdialog_AgregarLayout = new javax.swing.GroupLayout(jdialog_Agregar.getContentPane());
        jdialog_Agregar.getContentPane().setLayout(jdialog_AgregarLayout);
        jdialog_AgregarLayout.setHorizontalGroup(
            jdialog_AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jdialog_AgregarLayout.setVerticalGroup(
            jdialog_AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        cb_Persona1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        cb_Persona2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        btn_viewConnections.setText("View Connections");
        btn_viewConnections.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_viewConnectionsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(cb_Persona1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(cb_Persona2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(btn_viewConnections, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_Persona1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_Persona2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btn_viewConnections)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_ConnectionsLayout = new javax.swing.GroupLayout(jd_Connections.getContentPane());
        jd_Connections.getContentPane().setLayout(jd_ConnectionsLayout);
        jd_ConnectionsLayout.setHorizontalGroup(
            jd_ConnectionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_ConnectionsLayout.setVerticalGroup(
            jd_ConnectionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelPrincipal.setBackground(new java.awt.Color(0, 102, 102));

        label_Principal.setFont(new java.awt.Font("OCR A Extended", 0, 24)); // NOI18N
        label_Principal.setForeground(new java.awt.Color(255, 255, 255));
        label_Principal.setText("GLOBAL SURVEILLANCE SYSTEM");

        b_grafoPrincipal.setFont(new java.awt.Font("OCR A Extended", 0, 13)); // NOI18N
        b_grafoPrincipal.setText("GLOBAL MAP");
        b_grafoPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_grafoPrincipalActionPerformed(evt);
            }
        });

        b_informacion.setFont(new java.awt.Font("OCR A Extended", 0, 13)); // NOI18N
        b_informacion.setText("INFORMATION");
        b_informacion.setEnabled(false);
        b_informacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_informacionActionPerformed(evt);
            }
        });

        cb_Lista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cb_Lista.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_ListaItemStateChanged(evt);
            }
        });

        b_connections.setFont(new java.awt.Font("OCR A Extended", 0, 13)); // NOI18N
        b_connections.setText("CONNECTIONS");
        b_connections.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_connectionsActionPerformed(evt);
            }
        });

        btn_Exit.setFont(new java.awt.Font("OCR A Extended", 0, 13)); // NOI18N
        btn_Exit.setText("EXIT");
        btn_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExitActionPerformed(evt);
            }
        });

        label_Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/rsz_NSA.png"))); // NOI18N

        btn_Agregar.setFont(new java.awt.Font("OCR A Extended", 0, 13)); // NOI18N
        btn_Agregar.setText("NEW CONTACT");
        btn_Agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_AgregarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalLayout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addComponent(label_Principal)
                .addGap(127, 127, 127))
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_Imagen)
                            .addComponent(b_grafoPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(cb_Lista, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(b_connections, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b_informacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_Exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(label_Principal)
                .addGap(27, 27, 27)
                .addComponent(label_Imagen)
                .addGap(39, 39, 39)
                .addComponent(b_grafoPrincipal)
                .addGap(49, 49, 49)
                .addComponent(btn_Agregar)
                .addGap(32, 32, 32)
                .addComponent(cb_Lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(b_informacion)
                .addGap(29, 29, 29)
                .addComponent(b_connections)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(btn_Exit)
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_ExitActionPerformed

    private void b_grafoPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_grafoPrincipalActionPerformed
        Viewer viewer = MapaGlobal.display(); //display el grafo
        View view = viewer.getDefaultView();
        view.getCamera().setViewCenter(2, 3, 2);
        view.getCamera().setViewPercent(0.5);
        
        viewer.setCloseFramePolicy(Viewer.CloseFramePolicy.HIDE_ONLY);
        
    }//GEN-LAST:event_b_grafoPrincipalActionPerformed

    private void cb_ListaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_ListaItemStateChanged
        if (evt.getStateChange() == 2) {
            String Cadenapersona = (String) cb_Lista.getSelectedItem();
            if (cb_Lista.getSelectedIndex() != 0) {//verificar que no sea el espacio vacio
                SelectedPerson = MapaGlobal.getNode(Cadenapersona);
                b_informacion.setEnabled(true);
                b_connections.setEnabled(true);
            } else { //si se escogee el espacio en blanco, se bloquean los botones
                SelectedPerson = null;
                b_informacion.setEnabled(false);
                b_connections.setEnabled(false);
            }//Fin del if else
        }//Fin del if item
    }//GEN-LAST:event_cb_ListaItemStateChanged

    private void b_informacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_informacionActionPerformed
        Persona infoPersona = null;
        for (int i = 0; i < personas.size(); i++) {
            if (personas.Get(i).getNombre().equals(SelectedPerson.toString())) {
                infoPersona = personas.Get(i);
                break;
            }//Fin del if
        }//Fin del for
        int sumCalls = 0;
        for (Relationship temp : infoPersona.getRelatedPeople()) {
            sumCalls += temp.getCantidadLlamadas();
        }//Fin del for

        /*
          Se guarda la informacion del usuario en los text fields para
         visualizar
         */
        cb_Lista.setSelectedIndex(0);
        tf_name.setText(infoPersona.getNombre());
        tf_age.setText(Integer.toString(infoPersona.getEdad()));
        tf_city.setText(infoPersona.getCiudad());
        tf_status.setText(infoPersona.getEstadoCivil());
        tf_salary.setText(Double.toString(infoPersona.getSalario()));
        tf_calls.setText(Integer.toString(sumCalls));
        tf_ResearchMotive.setText(infoPersona.getResearchMotive());

        /*
          se manda a llamar al jdialog de informacion
         */
        this.jd_information.setModal(true); // cuando las subventas se muestre, bloqueara el frame principal
        this.jd_information.pack(); //Redimensiona la ventana dependiendo de los controles que tenga en el frame
        this.jd_information.setLocationRelativeTo(this);
        this.jd_information.setVisible(true);
    }//GEN-LAST:event_b_informacionActionPerformed

    private void btn_AgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AgregarMouseClicked
        DefaultListModel modelo = new DefaultListModel();
        /*Se crea un arraylist de tipo string en el cual se van a guardar
        los nombres de todas las personas en el archivo de texto.*/
        ArrayList<String> listadePersonas = new ArrayList();
        for (int i = 0; i < personas.size(); i++) {
            listadePersonas.add(personas.Get(i).getNombre());
        }//Fin del for que llena listadePersonas
        /*Se utiliza la clase Collections de Java para poder ordenar
        alfabeticamente la lista de nombres.*/
        Collections.sort(listadePersonas);
        for (int i = 0; i < listadePersonas.size(); i++) {
            modelo.add(i, listadePersonas.get(i));
        }//Fin del for
        llenarComboBoxMotivos();
        lista_OpcionContacto.setModel(modelo);
        this.jdialog_Agregar.setModal(true);
        this.jdialog_Agregar.pack();
        this.jdialog_Agregar.setLocationRelativeTo(this);
        this.jdialog_Agregar.setVisible(true);
    }//GEN-LAST:event_btn_AgregarMouseClicked

    private void btn_PasarAmigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PasarAmigoMouseClicked
        if (lista_OpcionContacto.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this.jdialog_Agregar, "No ha seleccionado a una persona.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            String nombre = lista_OpcionContacto.getSelectedValue();
            /*Se crea un modelo global para usar con las jlist. Es global ya que cada vez que el usuario
            agregue a una persona a la lista, el modelo de esta va cambiando. Asi que, si el modelo no es
            global, en el jList solamente habria un elemento.*/
            modeloJD.addElement(nombre);
            lista_AmigosAAgregar.setModel(modeloJD);
            DefaultListModel model = (DefaultListModel) lista_OpcionContacto.getModel();
            //Se remueve a la persona seleccionada de la lista, para no tener contactos duplicados.
            model.remove(lista_OpcionContacto.getSelectedIndex());
            lista_OpcionContacto.setModel(model);
        }//Fin del if else
    }//GEN-LAST:event_btn_PasarAmigoMouseClicked

    private void btn_ComenzarSeguimientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ComenzarSeguimientoMouseClicked
        if ((motivo == "") || (tf_NombrePersona.getText().equals("")) || (lista_AmigosAAgregar.getModel().getSize() == 0) || (tf_CiudadPersona.getText().equals(""))
                || (Integer.parseInt(tf_EdadPersona.getText()) <= 0) || (tf_EstadoCPersona.getText().equals("")) || (Integer.parseInt(tf_SalarioPersona.getText()) <= 0)) {
            JOptionPane.showMessageDialog(this.jdialog_Agregar, "No esta completa la informacion de la persona.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            ArrayList<String> nombres = new ArrayList();
            ArrayList<Integer> cantidadllamadas = new ArrayList();
            /*Se consiguen los nombres de las personas que son contactos de la nueva persona que se acaba
            de crear, para luego poder utilizarlos al momento de escribir en el archivo*/
            for (int i = 0; i < lista_AmigosAAgregar.getModel().getSize(); i++) {
                nombres.add(lista_AmigosAAgregar.getModel().getElementAt(i));
            }//Fin del for
            for (int i = 0; i < nombres.size(); i++) {
                boolean verificarInt = false;
                do {
                    try {
                        int numeroLlamadas = Integer.parseInt(JOptionPane.showInputDialog(this.jdialog_Agregar, "Ingrese la cantidad de llamadas "
                                + "realizadas con " + nombres.get(i), "Numero de llamadas", JOptionPane.INFORMATION_MESSAGE));
                        cantidadllamadas.add(numeroLlamadas);
                        verificarInt = true;
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this.jdialog_Agregar, "No ingreso un numero entero", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                } while (verificarInt == false);

            }//Fin del for
            String textoArchivo = tf_NombrePersona.getText() + "," + tf_EdadPersona.getText() + ","
                    + tf_CiudadPersona.getText() + "," + tf_EstadoCPersona.getText() + ","
                    + tf_SalarioPersona.getText() + "," + motivo;
            for (int i = 0; i < nombres.size(); i++) {
                textoArchivo += "," + nombres.get(i) + "," + cantidadllamadas.get(i);
            }//Fin del for
            File archivo = null;
            FileWriter fileWriter = null;
            BufferedWriter bufferedWriter = null;
            try {
                archivo = new File("./Personas.txt");
                fileWriter = new FileWriter(archivo, true); //el booleano significa append, agregar o no
                bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(textoArchivo);
                bufferedWriter.newLine();
                //pasar a rom
                bufferedWriter.flush(); //vacía de ram a rom
            } catch (Exception e) {
            }//Fin del try catch
            try {
                bufferedWriter.close(); //primero se cierra el buffered
                fileWriter.close();
            } catch (Exception e) {
            }//Fin del trycatch

            /**
             * Se limpia el VSArrayList de personas para volver a reset it con
             * el nuevo contacto
             */
            personas.Clear();
            LlenarLista();

            JOptionPane.showMessageDialog(this.jdialog_Agregar, "Persona agregada exitosamente.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            /*Se limpian todos los elementos del jdialog*/
            cb_ResearchMotive.setSelectedIndex(0);
            this.jdialog_Agregar.dispose();
            DefaultListModel listModel = (DefaultListModel) lista_AmigosAAgregar.getModel();
            listModel.removeAllElements();
            tf_NombrePersona.setText("");
            tf_EdadPersona.setText("");
            tf_CiudadPersona.setText("");
            tf_EstadoCPersona.setText("");
            tf_SalarioPersona.setText("");
        }//Fin del if else
    }//GEN-LAST:event_btn_ComenzarSeguimientoMouseClicked

    private void b_connectionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_connectionsActionPerformed
        llenarComboBoxesPersonas();
        this.jd_Connections.setModal(true);
        this.jd_Connections.pack();
        this.jd_Connections.setLocationRelativeTo(this);
        this.jd_Connections.setVisible(true);
    }//GEN-LAST:event_b_connectionsActionPerformed

    private void cb_ResearchMotiveItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_ResearchMotiveItemStateChanged
        if (evt.getStateChange() == 2) {
            motivo = "";
            String cadenaMotivo = (String) cb_ResearchMotive.getSelectedItem();
            if (cb_ResearchMotive.getSelectedIndex() != 0) {//verificar que no sea el espacio vacio
                motivo = cadenaMotivo;
            } else { //si se escogee el espacio en blanco, se bloquean los botones
                motivo = "";
            }//Fin del if else
        }//Fin del if item
    }//GEN-LAST:event_cb_ResearchMotiveItemStateChanged

    private void btn_viewConnectionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_viewConnectionsMouseClicked
        if (cb_Persona1.getSelectedIndex() == cb_Persona2.getSelectedIndex()) {
            JOptionPane.showMessageDialog(this.jd_Connections, "No puede seleccionar la misma persona.", "Hmm...", JOptionPane.ERROR_MESSAGE);
        } else {
            /*Se crea el grafo secundario para mostrar la ruta mas barata.*/
            Graph graphSecundario = new SingleGraph("Relationship");

            //Se crea Dijkstra teniendo como base la distancia.
            Dijkstra dijkstra = new Dijkstra(Dijkstra.Element.EDGE, null, "Relacion");
            dijkstra.init(MapaGlobal);

            Node persona1 = MapaGlobal.getNode(cb_Persona1.getSelectedItem().toString());
            Node persona2 = MapaGlobal.getNode(cb_Persona2.getSelectedItem().toString());
            dijkstra.setSource(persona1);
            dijkstra.compute();
            Path camino = dijkstra.getPath(persona2);

            graphSecundario.setStrict(false);
            graphSecundario.setAutoCreate(false);

            for (Edge edge : camino.getEdgePath()) {
                /*Se crean dos nodos, los que estan en ambos opuestos de las aristas,
            los cuales van cambiando mediante la ruta sigue.*/
                Node person1 = edge.getNode1();
                Node person2 = edge.getOpposite(person1);

                /*Se crea la arista que une los dos nodos creados. Luego se le
            agregan los atributos y se muestra el grafo.*/
                graphSecundario.addNode(person1.getId()).addAttribute("ui.label", person1.getId());
                graphSecundario.addNode(person2.getId()).addAttribute("ui.label", person2.getId());
                graphSecundario.addEdge(person2.getId() + person1.getId(), person2.getId(), person1.getId()).addAttribute("ui.label", edge.getAttribute("Relacion").toString());;
            }//Fin del for

            this.jd_Connections.dispose();
            cb_Persona1.setSelectedIndex(0);
            cb_Persona2.setSelectedIndex(0);
            Viewer viewer = graphSecundario.display();
            viewer.setCloseFramePolicy(Viewer.CloseFramePolicy.HIDE_ONLY);
        }//Fin del else if  1
    }//GEN-LAST:event_btn_viewConnectionsMouseClicked

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    DefaultListModel modeloJD = new DefaultListModel();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JButton b_connections;
    private javax.swing.JButton b_grafoPrincipal;
    private javax.swing.JButton b_informacion;
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_ComenzarSeguimiento;
    private javax.swing.JButton btn_Exit;
    private javax.swing.JButton btn_PasarAmigo;
    private javax.swing.JButton btn_viewConnections;
    private javax.swing.JComboBox<String> cb_Lista;
    private javax.swing.JComboBox<String> cb_Persona1;
    private javax.swing.JComboBox<String> cb_Persona2;
    private javax.swing.JComboBox<String> cb_ResearchMotive;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JDialog jd_Connections;
    private javax.swing.JDialog jd_information;
    private javax.swing.JDialog jdialog_Agregar;
    private javax.swing.JLabel label_Imagen;
    private javax.swing.JLabel label_Principal;
    private javax.swing.JList<String> lista_AmigosAAgregar;
    private javax.swing.JList<String> lista_OpcionContacto;
    private javax.swing.JPanel panel_Agregar;
    private javax.swing.JPanel panel_Information;
    private javax.swing.JTextField tf_CiudadPersona;
    private javax.swing.JTextField tf_EdadPersona;
    private javax.swing.JTextField tf_EstadoCPersona;
    private javax.swing.JTextField tf_NombrePersona;
    private javax.swing.JTextField tf_ResearchMotive;
    private javax.swing.JTextField tf_SalarioPersona;
    private javax.swing.JTextField tf_age;
    private javax.swing.JTextField tf_calls;
    private javax.swing.JTextField tf_city;
    private javax.swing.JTextField tf_name;
    private javax.swing.JTextField tf_salary;
    private javax.swing.JTextField tf_status;
    // End of variables declaration//GEN-END:variables

    VSArrayList personas;
    Graph MapaGlobal = new SingleGraph("Global Map Routes");
    Node SelectedPerson;
    String motivo = "";

    void llenarComboBoxPrincipal() {
        /*Se crea un arraylist de tipo string en el cual se van a guardar
        los nombres de todas las personas en el archivo de texto.*/
        ArrayList<String> listadePersonas = new ArrayList();
        for (int i = 0; i < personas.size(); i++) {
            listadePersonas.add(personas.Get(i).getNombre());
        }//Fin del for que llena listadePersonas
        /*Se utiliza la clase Collections de Java para poder ordenar
        alfabeticamente la lista de nombres.*/
        Collections.sort(listadePersonas);
        for (int i = 0; i < listadePersonas.size(); i++) {
            cb_Lista.addItem(listadePersonas.get(i));
        }//Fin del for
    }//Fin del metodo llenar comboBox

    void llenarComboBoxesPersonas() {
        /*Se crea un arraylist de tipo string en el cual se van a guardar
        los nombres de todas las personas en el archivo de texto.*/
        ArrayList<String> listadePersonas = new ArrayList();
        for (int i = 0; i < personas.size(); i++) {
            listadePersonas.add(personas.Get(i).getNombre());
        }//Fin del for que llena listadePersonas
        /*Se utiliza la clase Collections de Java para poder ordenar
        alfabeticamente la lista de nombres.*/
        Collections.sort(listadePersonas);
        for (int i = 0; i < listadePersonas.size(); i++) {
            cb_Persona1.addItem(listadePersonas.get(i));
            cb_Persona2.addItem(listadePersonas.get(i));
        }//Fin del for
    }//Fin del metodo

    void llenarComboBoxMotivos() {
        /*Se crea un arraylist de tipo string en el cual se van a guardar
        los motivos de seguimiento de todas las personas en el archivo de texto.*/
        ArrayList<String> listadeMotivos = new ArrayList();
        for (int i = 0; i < personas.size(); i++) {
            listadeMotivos.add(personas.Get(i).getResearchMotive());
        }//Fin del for que llena listadePersonas
        /*Se crea un set el cual nos quita todos los elementos 
        dupilicados en la lista.*/
        Set<String> citySet = new HashSet<String>(listadeMotivos);
        listadeMotivos.clear();
        listadeMotivos.addAll(citySet);
        /*Se utiliza la clase Collections de Java para poder ordenar
        alfabeticamente la lista de nombres.*/
        Collections.sort(listadeMotivos);
        for (int i = 0; i < listadeMotivos.size(); i++) {
            cb_ResearchMotive.addItem(listadeMotivos.get(i));
        }//Fin del for
    }//Fin del metodo llenar comboBox

    public void LlenarLista() {
        personas = new VSArrayList(0, 1);
        File archivo = null;
        Scanner scannerArchivo = null;
        archivo = new File("./Personas.txt");
        String linea = "", nombre = "", ciudad = "", estadoCivil = "", researchMotive = "";
        int edad = 0;
        double salario = 0;
        String[] caracteristicas = null;
        int contador = 0;
        try {
            //Aseguramos que el scanner comienze a leer el archivo que contiene las personas.
            scannerArchivo = new Scanner(archivo);
            //Se lleva a cabo el for hasta que ya no haya mas texto en el archivo.
            while (scannerArchivo.hasNextLine()) {
                try {
                    //Se le asigna la linea de texto actual a la variable linea.
                    linea = scannerArchivo.nextLine();
                    if (linea.contains(",")) {
                        /*Se hace un split de la linea de texto para poder guardar todas las caracteristicas
                        de la persona dentro de una variable Persona.*/
                        caracteristicas = linea.split(",");
                        nombre = caracteristicas[0];
                        edad = Integer.parseInt(caracteristicas[1]);
                        ciudad = caracteristicas[2];
                        estadoCivil = caracteristicas[3];
                        salario = Double.parseDouble(caracteristicas[4]);
                        researchMotive = caracteristicas[5];

                        //Se crea a una persona nueva
                        Persona persona = new Persona(nombre, edad, ciudad, estadoCivil, salario, researchMotive);
                        //Se agrega a la persona a la lista de personas
                        personas.Insert(persona, contador);

                        /*El for comienza en seis ya que los amigos de la persona comienzan a paratir
                        de la posicion numero cinco en el arreglo llamado caracteristicas.*/
                        for (int i = 6; i < caracteristicas.length - 1; i += 2) {
                            int nivel = 0;
                            String name = "";
                            name = caracteristicas[i];
                            nivel = Integer.parseInt(caracteristicas[i + 1]);
                            Relationship relacion = new Relationship(name, nivel);
                            personas.Get(personas.size() - 1).setRelatedPeople(relacion);
                        }//Fin del for
                        /*El contador es utilizado para manegar la posicion de insercion en la lista de personas*/
                        contador++;
                    }//Fin del if
                } catch (Exception e) {
                    System.out.println("Error");
                }//Fin del try catch
            }//Fin del while
        } catch (Exception e) {
            System.out.println("Hubo un error al leer el archivo.");
        }//Fin del try catch
        try {
            scannerArchivo.close();
        } catch (Exception e) {

        }//Fin del trycatch

        /*
        for (int i = 0; i < personas.size(); i++) {
            System.out.println(personas.Get(i).getNombre());
            for (Relationship temp : personas.Get(i).relatedPeople) {
                System.out.println(temp.toString());
            }//Fin del for
        }//Fin del for
         */
        CrearMapaGlobal(); //se crea el grafo
        llenarComboBoxPrincipal();//se llena el cb_Lista

    }//Fin del metodo llenar lista

    void CrearMapaGlobal() {
        for (int i = 0; i < personas.size(); i++) {
            Node nodoPersona = null;

            try {

                if (MapaGlobal.getNode(personas.Get(i).getNombre()) == null) {
                    MapaGlobal.addNode(personas.Get(i).getNombre()); //se agrega la persona al grafo
                    nodoPersona = MapaGlobal.getNode(personas.Get(i).getNombre());
                    nodoPersona.addAttribute("ui.label", personas.Get(i).getNombre());
                } else {
                    nodoPersona = MapaGlobal.getNode(personas.Get(i).getNombre());
                }//Fin del if node

                for (Relationship temp : personas.Get(i).getRelatedPeople()) {
                    Node nodoPersona2;
                    if (MapaGlobal.getNode(temp.getName()) == null) {
                        MapaGlobal.addNode(temp.getName()); //se agrega la ciudad de amigo al grafo
                        nodoPersona2 = MapaGlobal.getNode(temp.getName());
                        nodoPersona2.addAttribute("ui.label", temp.getName());
                    } else {
                        nodoPersona2 = MapaGlobal.getNode(temp.getName());
                    }//Fin del if node
                    if (MapaGlobal.getEdge(nodoPersona.getId() + nodoPersona2.getId()) == null) { // se agregan los edges 
                        MapaGlobal.addEdge(nodoPersona.getId() + nodoPersona2.getId(), nodoPersona, nodoPersona2).addAttribute("Relacion", temp.getNivelRelacion());
                        //MapaGlobal.getEdge(nodoPersona.getId() + nodoPersona2.getId()).addAttribute("ui.label", "Nivel de Relacion: " + Integer.toString(temp.getNivelRelacion()));
                    }//fin if edges      
                }//fin for
                
                //MapaGlobal.addAttribute("ui.stylesheet", "graph { fill-color: rgb(0,0,0); }");
                MapaGlobal.addAttribute("ui.quality");
                MapaGlobal.addAttribute("ui.antialias");
                for (Node temp : MapaGlobal.getEachNode()) {
                    temp.addAttribute("ui.style", "fill-color: rgb(107,142,35);size:10px,10px;text-color: rgb(0,0,0);");
 
                }
                for (Edge edge : MapaGlobal.getEachEdge()) {
                    edge.addAttribute("ui.style", "fill-color: rgb(47,79,79); text-color:  rgb(211,211,211);");
                
                }
                
                

            } catch (Exception e) {
            }//Fin del try catch
        }//Fin del for
    }//Fin del metodo crear mapa global

}//Fin de la clase
