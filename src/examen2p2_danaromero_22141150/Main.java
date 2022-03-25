/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_danaromero_22141150;

import java.awt.Color;
import static java.awt.MouseInfo.getPointerInfo;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Dana Romero
 */
public class Main extends javax.swing.JFrame {

    DefaultMutableTreeNode raiz;
    DefaultTreeModel model;
    ArrayList <Planeta> planetasDefault;
    ArrayList <Planeta> listaPlanetas;
    ArrayList <Cientifico> cientificos;
    //private static final long serialVersionUID = 1L;
    
    public Main() {
        listaPlanetas = new ArrayList <>();
        try {
            UIManager.setLookAndFeel(new MetalLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        cientificos = new ArrayList<>();
        planetasDefault = new ArrayList<>();
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        planetasDefault();
        cargarCientificos();
        llenarComboBox();
        model = (DefaultTreeModel)tree_planetas.getModel();
        raiz = new DefaultMutableTreeNode("Planetas"); 
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu = new javax.swing.JPopupMenu();
        Planeta1 = new javax.swing.JMenuItem();
        Planeta2 = new javax.swing.JMenuItem();
        pb_colision = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        tree_planetas = new javax.swing.JTree();
        tf_planeta1 = new javax.swing.JTextField();
        tf_planeta2 = new javax.swing.JTextField();
        cb_cientificos = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cb_publicos = new javax.swing.JCheckBox();
        tf_nombreCientifico = new javax.swing.JTextField();
        btn_addCientifico = new javax.swing.JButton();
        btn_colisionar = new javax.swing.JButton();

        popupMenu.setMinimumSize(new java.awt.Dimension(80, 50));

        Planeta1.setText("Paneta 1");
        Planeta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Planeta1ActionPerformed(evt);
            }
        });
        popupMenu.add(Planeta1);

        Planeta2.setText("Planeta 2");
        Planeta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Planeta2ActionPerformed(evt);
            }
        });
        popupMenu.add(Planeta2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        tree_planetas.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        tree_planetas.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                tree_planetasValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(tree_planetas);

        tf_planeta1.setEditable(false);

        tf_planeta2.setEditable(false);

        cb_cientificos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cb_cientificosMouseClicked(evt);
            }
        });

        jLabel1.setText("Científicos");

        jLabel2.setText("Nombre");

        cb_publicos.setText("Públicos");
        cb_publicos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_publicosItemStateChanged(evt);
            }
        });

        btn_addCientifico.setText("Añadir Científico");
        btn_addCientifico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addCientificoActionPerformed(evt);
            }
        });

        btn_colisionar.setText("Colisionar");
        btn_colisionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_colisionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pb_colision, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_planeta1)
                            .addComponent(tf_planeta2)
                            .addComponent(cb_cientificos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(tf_nombreCientifico)
                            .addComponent(btn_addCientifico, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                        .addGap(34, 34, 34)
                        .addComponent(btn_colisionar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(cb_publicos)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(pb_colision, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tf_planeta1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_planeta2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(btn_colisionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_cientificos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_nombreCientifico, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btn_addCientifico, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(cb_publicos)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb_publicosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_publicosItemStateChanged
        if(cb_publicos.isSelected()){
            clearTree();
            llenarJTreeDefault();
        }else{
            clearTree();
        }
    }//GEN-LAST:event_cb_publicosItemStateChanged

    private void btn_addCientificoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addCientificoActionPerformed
        if(!tf_nombreCientifico.getText().equals("")){
            
            cientificos.add(new Cientifico(tf_nombreCientifico.getText()));
            llenarComboBox();
            tf_nombreCientifico.setText("");
            guardarCientifico();
        }
    }//GEN-LAST:event_btn_addCientificoActionPerformed
String selectedPlaneta="";
    private void tree_planetasValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_tree_planetasValueChanged
        
        popupMenu.setVisible(true);
        popupMenu.setLocation(getPointerInfo().getLocation());
        String planeta = tree_planetas.getSelectionPath().toString();
        selectedPlaneta=planeta.replace("[Planetas, ", "").replace("]","");
        
    }//GEN-LAST:event_tree_planetasValueChanged

    private void Planeta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Planeta1ActionPerformed
       tf_planeta1.setText(selectedPlaneta);
       popupMenu.setVisible(false);
        
    }//GEN-LAST:event_Planeta1ActionPerformed

    private void Planeta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Planeta2ActionPerformed
        tf_planeta2.setText(selectedPlaneta);
        popupMenu.setVisible(false);
    }//GEN-LAST:event_Planeta2ActionPerformed
Cientifico cientificoSeleccionado;
    private void cb_cientificosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb_cientificosMouseClicked
       if(cb_cientificos.getSelectedItem()!=null){
        cientificoSeleccionado = buscarCientifico(String.valueOf(cb_cientificos.getSelectedItem()));
       llenarJTreeCient(cientificoSeleccionado);
        }

    }//GEN-LAST:event_cb_cientificosMouseClicked
int distancia =0;
Planeta planeta1;
Planeta planeta2;
    private void btn_colisionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_colisionarActionPerformed
       planeta1 =  buscarPlaneta(tf_planeta1.getText());
       planeta2 =  buscarPlaneta(tf_planeta2.getText());
       double distanciaD = Math.sqrt(Math.pow((planeta1.cX-planeta2.cX),2)+Math.pow((planeta1.cY-planeta2.cY),2));
        distancia = (int) distanciaD;
        hilo hilo = new hilo();
            hilo.start();
    }//GEN-LAST:event_btn_colisionarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    
     private void guardarCientifico(){
        try{
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("./cientificos.dr"));
            for (Cientifico c : cientificos)
                os.writeObject(c);
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
     
     private void cargarCientificos(){
        try{
            ObjectInputStream os = new ObjectInputStream(new FileInputStream("./cientificos.dr"));
            Cientifico cientifico;
             while((cientifico = (Cientifico)os.readObject())!= null ){
                 cientificos.add(cientifico);
             }
             
                
        }catch(Exception ex){

            System.out.println(ex);
        }
    }
    
    public void llenarJTreeDefault(){

        for (Planeta planeta: planetasDefault){
            DefaultMutableTreeNode hijo = new DefaultMutableTreeNode(planeta.nombre);
            raiz.add(hijo);
        }

        
        model.setRoot(raiz);
        }
    
    public void llenarJTreeCient(Cientifico cient){
        for(Planeta p: cient.listaPlanetas){
            DefaultMutableTreeNode hijo = new DefaultMutableTreeNode(p.nombre);
            raiz.add(hijo);
        }
        model.setRoot(raiz);
    }
    
    public void clearTree(){
        raiz.removeAllChildren();
        model.reload();
     }
    
    public void llenarComboBox(){
        cb_cientificos.removeAllItems();
         for (Cientifico c: cientificos){
            cb_cientificos.addItem(c.nombreCientifico);
        }
    }

    public Cientifico buscarCientifico(String nombre){
        for(Cientifico c: cientificos){
            if(c.nombreCientifico.equals(nombre)){
                return c;
            }
        }
        return null;
    }
    
    //Buscar Planeta
    public Planeta buscarPlaneta(String nombre){
        for(Planeta p: listaPlanetas){
            if(p.nombre.equals(nombre)){
                return p;
            }
        }
        return null;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Planeta1;
    private javax.swing.JMenuItem Planeta2;
    private javax.swing.JButton btn_addCientifico;
    private javax.swing.JButton btn_colisionar;
    private javax.swing.JComboBox<String> cb_cientificos;
    private javax.swing.JCheckBox cb_publicos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JProgressBar pb_colision;
    private javax.swing.JPopupMenu popupMenu;
    private javax.swing.JTextField tf_nombreCientifico;
    private javax.swing.JTextField tf_planeta1;
    private javax.swing.JTextField tf_planeta2;
    private javax.swing.JTree tree_planetas;
    // End of variables declaration//GEN-END:variables

     public void planetasDefault(){
         planetasDefault.add( new Terrestre(5000,13000,"Mercurio",400,300) );
         planetasDefault.add( new Terrestre(100000,15000,"Venus",640,260) );
         planetasDefault.add( new Terrestre(140000,17000,"Tierra",760,570) );
         planetasDefault.add( new Terrestre(140000,17000,"Tierra",760,570) );
         planetasDefault.add( new Gaseoso(400000,40000,"Jupiter",340,310) );
         planetasDefault.add( new Gaseoso(300000,30000,"Saturno",560,450) );
         planetasDefault.add( new Gaseoso(200000,20000,"Urano",670,690) );
         planetasDefault.add( new Gaseoso(200000,20000,"Neptuno",840,900) );
         planetasDefault.add ( new Gaseoso(100000,150000, "Planeta Vegetta",900,850));
         listaPlanetas.add( new Terrestre(5000,13000,"Mercurio",400,300) );
         listaPlanetas.add( new Terrestre(100000,15000,"Venus",640,260) );
         listaPlanetas.add( new Terrestre(140000,17000,"Tierra",760,570) );
         listaPlanetas.add( new Terrestre(140000,17000,"Tierra",760,570) );
         listaPlanetas.add( new Gaseoso(400000,40000,"Jupiter",340,310) );
         listaPlanetas.add( new Gaseoso(300000,30000,"Saturno",560,450) );
         listaPlanetas.add( new Gaseoso(200000,20000,"Urano",670,690) );
         listaPlanetas.add( new Gaseoso(200000,20000,"Neptuno",840,900) );
         listaPlanetas.add ( new Gaseoso(100000,150000, "Planeta Vegetta",900,850));
     }
         
         class hilo extends Thread{
        
        public void run(){
            
            pb_colision.setVisible(true);
            pb_colision.setMaximum(distancia);
           // while(true){
                    try{
                        for(int i=0; i<=distancia;i++){
                        pb_colision.setValue(i);
                        Thread.sleep(5);
                        }

                        Planeta planetaNuevo = planeta1.colision(planeta2);
                        if ( planetaNuevo!=null ){
                            listaPlanetas.add(planetaNuevo);
                            cientificoSeleccionado.listaPlanetas.add(planetaNuevo);
                        }
                        
                    }catch(InterruptedException e){
                        e.printStackTrace();

                    }
            
            

                            

              
            
            
        }
     
         }
}
