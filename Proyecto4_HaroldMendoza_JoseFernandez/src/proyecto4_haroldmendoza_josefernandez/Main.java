package proyecto4_haroldmendoza_josefernandez;

import java.io.File;
import java.util.Scanner;
import org.graphstream.graph.Edge;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.ui.view.Viewer;

public class Main extends javax.swing.JFrame {

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

                        caracteristicas = linea.split(",");
                        nombre = caracteristicas[0];
                        edad = Integer.parseInt(caracteristicas[1]);
                        ciudad = caracteristicas[2];
                        estadoCivil = caracteristicas[3];
                        salario = Double.parseDouble(caracteristicas[4]);

                        Relationship relacion = null;

                        Persona persona = new Persona(nombre, edad, ciudad, estadoCivil, salario);

                        personas.Insert(persona, contador);
                        personas.FixCapacity();

                        for (int i = 5; i < caracteristicas.length - 1; i += 2) {
                            int nivel = 0;
                            String name = "";
                            name = caracteristicas[i];
                            nivel = Integer.parseInt(caracteristicas[i+1]);
                            relacion = new Relationship(name, nivel);
                            personas.Get(personas.size() - 1).setRelatedPeople(relacion);
                        }//Fin del for

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

        for (int i = 0; i < personas.size(); i++) {
            System.out.println(personas.Get(i).getNombre());
            for (Relationship temp : personas.Get(i).relatedPeople) {
                System.out.println(temp.toString());
            }
        }
        CrearMapaGlobal();

    }//Fin del metodo llenar lista

    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Proyecto 4: GLOBAL SURVEILLANCE SYSTEM");
        this.LlenarLista();
    }//Fin del main

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        b_grafoPrincipal = new javax.swing.JButton();
        b_informacion = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        b_relatives = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

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

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        b_relatives.setFont(new java.awt.Font("OCR A Extended", 0, 13)); // NOI18N
        b_relatives.setText("Relatives");

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
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    VSArrayList personas;
    
    Graph MapaGlobal = new SingleGraph("Global Map Routes");
    
    void CrearMapaGlobal(){
        for (int i = 0; i < personas.size(); i++) {
            Node a=null;
            
      
            try {
                if(MapaGlobal.getNode(personas.Get(i).getNombre())==null){
                    MapaGlobal.addNode(personas.Get(i).getNombre()); //se agrega la persona al grafo
                    a = MapaGlobal.getNode(personas.Get(i).getNombre());
                    a.addAttribute("ui.label", personas.Get(i).getNombre());
                }else{
                    a = MapaGlobal.getNode(personas.Get(i).getNombre());
                }
                for (Relationship temp: personas.Get(i).getRelatedPeople()) {
                    Node b;
                    if(MapaGlobal.getNode(temp.getName())==null){
                        MapaGlobal.addNode(temp.getName()); //se agrega la ciudad de amigo al grafo
                        b = MapaGlobal.getNode(temp.getName());
                        b.addAttribute("ui.label", temp.getName());
                    }else{
                        b = MapaGlobal.getNode(temp.getName());
                    }
                    if(MapaGlobal.getEdge(a.getId()+b.getId())==null){ // se agregan los edges 
                        MapaGlobal.addEdge(a.getId()+b.getId(), a, b).addAttribute("Relacion", temp.getNivelRelacion());
                        MapaGlobal.getEdge(a.getId()+b.getId()).addAttribute("ui.label","Nivel de Relacion: "+ Integer.toString(temp.getNivelRelacion()));
                    }//fin if edges      
                }//fin for
                /*
                if(MapaGlobal.getEdge(node_Salida.getId()+node_Entrada.getId())==null){ // se agregan los edges 
                    MapaGlobal.addEdge(node_Salida.getId()+node_Entrada.getId(), node_Salida, node_Entrada, true).addAttribute("Distancia", temp.getDistancia());
                    MapaGlobal.getEdge(node_Salida.getId()+node_Entrada.getId()).addAttribute("Costo", temp.getCosto());
                    MapaGlobal.getEdge(node_Salida.getId()+node_Entrada.getId()).addAttribute("ui.label","DISTANCE: "+ Double.toString(temp.getDistancia())+
                            " PRICE: "+ Double.toString(temp.getCosto())+" AIRLINE: "+ temp.getAerolinea());
                } 
                */
            } catch (Exception e) {
            }
            
        }
        
        
        
        
    }
    


}//Fin de la clase
