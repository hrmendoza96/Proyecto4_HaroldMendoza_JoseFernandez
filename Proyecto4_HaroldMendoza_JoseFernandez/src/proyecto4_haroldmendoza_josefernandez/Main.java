package proyecto4_haroldmendoza_josefernandez;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import org.graphstream.graph.Edge;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;
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
        jPanel5 = new javax.swing.JPanel();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        b_grafoPrincipal = new javax.swing.JButton();
        b_informacion = new javax.swing.JButton();
        cb_Lista = new javax.swing.JComboBox<>();
        b_relatives = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));

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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel24))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel26)
                        .addGap(18, 18, 18)
                        .addComponent(tf_name, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_city)
                            .addComponent(tf_age))))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel25))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel30)
                            .addComponent(jLabel29))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_status, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(tf_salary)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_calls, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(tf_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel24)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(tf_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30)
                            .addComponent(tf_salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(tf_city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31)
                            .addComponent(tf_calls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_informationLayout = new javax.swing.GroupLayout(jd_information.getContentPane());
        jd_information.getContentPane().setLayout(jd_informationLayout);
        jd_informationLayout.setHorizontalGroup(
            jd_informationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_informationLayout.setVerticalGroup(
            jd_informationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("OCR A Extended", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GLOBAL SURVEILLANCE SYSTEM");

        b_grafoPrincipal.setFont(new java.awt.Font("OCR A Extended", 0, 13)); // NOI18N
        b_grafoPrincipal.setText("GLOBAL MAP");
        b_grafoPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_grafoPrincipalActionPerformed(evt);
            }
        });

        b_informacion.setFont(new java.awt.Font("OCR A Extended", 0, 13)); // NOI18N
        b_informacion.setText("Information");
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

        b_relatives.setFont(new java.awt.Font("OCR A Extended", 0, 13)); // NOI18N
        b_relatives.setText("Relatives");
        b_relatives.setEnabled(false);

        jButton4.setFont(new java.awt.Font("OCR A Extended", 0, 13)); // NOI18N
        jButton4.setText("EXIT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/rsz_NSA.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(b_informacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b_relatives, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(b_grafoPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(127, 127, 127))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(cb_Lista, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(184, 184, 184))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(39, 39, 39)
                .addComponent(b_grafoPrincipal)
                .addGap(52, 52, 52)
                .addComponent(cb_Lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(b_informacion)
                .addGap(75, 75, 75)
                .addComponent(b_relatives)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void b_grafoPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_grafoPrincipalActionPerformed
        // TODO add your handling code here:
        Viewer viewer = MapaGlobal.display(); //display el grafo
        viewer.setCloseFramePolicy(Viewer.CloseFramePolicy.HIDE_ONLY);
    }//GEN-LAST:event_b_grafoPrincipalActionPerformed

    private void cb_ListaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_ListaItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == 2) {
            String s = (String) cb_Lista.getSelectedItem();
            if (cb_Lista.getSelectedIndex() != 0) {//verificar que no sea el espacio vacio
                SelectedPerson = MapaGlobal.getNode(s);
                b_informacion.setEnabled(true);
                b_relatives.setEnabled(true);
            } else { //si se escogee el espacio en blanco, se bloquean los botones
                SelectedPerson = null;
                b_informacion.setEnabled(false);
                b_relatives.setEnabled(false);
            }
        }
    }//GEN-LAST:event_cb_ListaItemStateChanged

    private void b_informacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_informacionActionPerformed
        // TODO add your handling code here:
        Persona infoPersona = null;
        for (int i = 0; i < personas.size(); i++) {
            if(personas.Get(i).getNombre().equals(SelectedPerson.toString())){ 
                infoPersona = personas.Get(i);
                break;
            }
        }
        int sumCalls = 0;
        for (Relationship temp : infoPersona.getRelatedPeople()) {
            sumCalls+=temp.getCantidadLlamadas();
        }
        
        /**
         * Se guarda la informacion del usuario en los text fields para visualizar
         */
        tf_name.setText(infoPersona.getNombre());
        tf_age.setText(Integer.toString(infoPersona.getEdad()));
        tf_city.setText(infoPersona.getCiudad());
        tf_status.setText(infoPersona.getEstadoCivil());
        tf_salary.setText(Double.toString(infoPersona.getSalario()));
        tf_calls.setText(Integer.toString(sumCalls));
        
        /**
         * se manda a llamar al jdialog de informacion
         */
        this.jd_information.setModal(true); // cuando las subventas se muestre, bloqueara el frame principal
        this.jd_information.pack(); //Redimensiona la ventana dependiendo de los controles que tenga en el frame
        this.jd_information.setLocationRelativeTo(this);
        this.jd_information.setVisible(true);
    }//GEN-LAST:event_b_informacionActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_grafoPrincipal;
    private javax.swing.JButton b_informacion;
    private javax.swing.JButton b_relatives;
    private javax.swing.JComboBox<String> cb_Lista;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JDialog jd_information;
    private javax.swing.JTextField tf_age;
    private javax.swing.JTextField tf_calls;
    private javax.swing.JTextField tf_city;
    private javax.swing.JTextField tf_ciudad;
    private javax.swing.JTextField tf_ciudad1;
    private javax.swing.JTextField tf_ciudad2;
    private javax.swing.JTextField tf_edad;
    private javax.swing.JTextField tf_edad1;
    private javax.swing.JTextField tf_edad2;
    private javax.swing.JTextField tf_estado;
    private javax.swing.JTextField tf_estado1;
    private javax.swing.JTextField tf_estado2;
    private javax.swing.JTextField tf_name;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_nombre1;
    private javax.swing.JTextField tf_nombre2;
    private javax.swing.JTextField tf_salario;
    private javax.swing.JTextField tf_salario1;
    private javax.swing.JTextField tf_salario2;
    private javax.swing.JTextField tf_salary;
    private javax.swing.JTextField tf_status;
    // End of variables declaration//GEN-END:variables

    VSArrayList personas;

    Graph MapaGlobal = new SingleGraph("Global Map Routes");

    Node SelectedPerson;

    void llenarComboBox() {
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

    public void LlenarLista() {
        personas = new VSArrayList(0, 1);
        File archivo = null;
        Scanner scannerArchivo = null;
        archivo = new File("./Personas.txt");
        String linea = "", nombre = "", ciudad = "", estadoCivil = "";
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

                        //Se crea a una persona nueva
                        Persona persona = new Persona(nombre, edad, ciudad, estadoCivil, salario);
                        //Se agrega a la persona a la lista de personas
                        personas.Insert(persona, contador);

                        /*El for comienza en cinco ya que los amigos de la persona comienzan a paratir
                        de la posicion numero cinco en el arreglo llamado caracteristicas.*/
                        for (int i = 5; i < caracteristicas.length - 1; i += 2) {
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
        llenarComboBox();//se llena el cb_Lista

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
                        MapaGlobal.addEdge(nodoPersona.getId() + nodoPersona2.getId(), nodoPersona, nodoPersona2).addAttribute("Relacion", temp.getCantidadLlamadas());
                        MapaGlobal.getEdge(nodoPersona.getId() + nodoPersona2.getId()).addAttribute("ui.label", "Nivel de Relacion: " + Integer.toString(temp.getCantidadLlamadas()));
                    }//fin if edges      
                }//fin for

            } catch (Exception e) {
            }//Fin del try catch
        }//Fin del for
    }//Fin del metodo crear mapa global

}//Fin de la clase
