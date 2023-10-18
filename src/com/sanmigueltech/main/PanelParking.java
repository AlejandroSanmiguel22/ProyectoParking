package com.sanmigueltech.main;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.extras.FlatAnimatedLafChange;
import com.sanmigueltech.form.Form1;
import com.sanmigueltech.menu.EventMenu;
import com.sanmigueltech.menu.MainForm;
import com.sanmigueltech.menu.MenuItem;
import com.sanmigueltech.model.ModelUser;
import java.awt.Component;
import java.awt.EventQueue;
import javax.swing.JFrame;


public class PanelParking extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    
    private ModelUser currentUser;

    public PanelParking(ModelUser user) {
        this();
        this.currentUser = user;
        // Si necesitas hacer algo específico con el usuario, aquí es un buen lugar.
    }

    public PanelParking() {
        initComponents();
         setIconImage(getToolkit().getDefaultToolkit().getImage(getClass().getResource("/com/sanmigueltech/icon/logoParking.png")));
         
        menu.addEventMenuSelected(new EventMenu() {
            @Override
            public void mainMenuSelected(MainForm mainForm, int index, MenuItem menuItem) {
            }

            @Override
            public void subMenuSelected(MainForm mainForm, int index, int subMenuIndex, Component menuItem) {

            }
        });
        menu.setSelectedIndex(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        subMenu = new com.sanmigueltech.menu.SubMenuPanel();
        menu = new com.sanmigueltech.menu.Menu();
        lbLogo = new javax.swing.JLabel();
        mainMenuItem1 = new com.sanmigueltech.menu.MenuItem();
        mainMenuItem3 = new com.sanmigueltech.menu.MenuItem();
        mainMenuItem2 = new com.sanmigueltech.menu.MenuItem();
        mainMenuItem4 = new com.sanmigueltech.menu.MenuItem();
        mainForm = new com.sanmigueltech.menu.MainForm();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        subMenu.setBorder(javax.swing.BorderFactory.createEmptyBorder(80, 1, 1, 1));
        subMenu.setForeground(new java.awt.Color(7, 40, 33));
        subMenu.setOpacity(1.0F);

        menu.setForeground(new java.awt.Color(7, 40, 33));
        menu.setMainForm(mainForm);
        menu.setOpacity(1.0F);
        menu.setSubMenuPanel(subMenu);

        lbLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sanmigueltech/icon/logoParking.png")));
        lbLogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbLogo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menu.add(lbLogo);

        mainMenuItem1.setBackground(new java.awt.Color(255, 45, 185));
        mainMenuItem1.setForeground(new java.awt.Color(75, 0, 243));
        mainMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sanmigueltech/icon/menu1.png")));
        mainMenuItem1.setMenuIcon(new javax.swing.AbstractListModel() {
            String[] strings = { "com/sanmigueltech/icon/s1_1.png", "com/sanmigueltech/icon/s1_2.png", "com/sanmigueltech/icon/s1_3.png", "com/sanmigueltech/icon/s1_4.png", "com/sanmigueltech/icon/s1_5.png", "com/sanmigueltech/icon/s1_6.png", "com/sanmigueltech/icon/s1_7.png" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        mainMenuItem1.setMenuModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Registro de entrada", "Registro de salida" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        mainMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenuItem1ActionPerformed(evt);
            }
        });
        menu.add(mainMenuItem1);

        mainMenuItem3.setBackground(new java.awt.Color(0, 217, 64));
        mainMenuItem3.setForeground(new java.awt.Color(74, 74, 74));
        mainMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sanmigueltech/icon/menu2.png")));
        mainMenuItem3.setMenuIcon(new javax.swing.AbstractListModel() {
            String[] strings = { "com/sanmigueltech/icon/s2_1.png", "com/sanmigueltech/icon/s2_2.png", "com/sanmigueltech/icon/s2_3.png", "com/sanmigueltech/icon/s2_4.png", "com/sanmigueltech/icon/s2_5.png" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        mainMenuItem3.setMenuModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Buscar usuarios", "Administración" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        menu.add(mainMenuItem3);

        mainMenuItem2.setBackground(new java.awt.Color(255, 0, 0));
        mainMenuItem2.setForeground(new java.awt.Color(241, 255, 0));
        mainMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sanmigueltech/icon/menu3.png")));
        mainMenuItem2.setMenuIcon(new javax.swing.AbstractListModel() {
            String[] strings = { "com/sanmigueltech/icon/s3_1.png" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        mainMenuItem2.setMenuModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Finanzas"};
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        menu.add(mainMenuItem2);

        mainMenuItem4.setBackground(new java.awt.Color(8, 191, 196));
        mainMenuItem4.setForeground(new java.awt.Color(3, 66, 178));
        mainMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sanmigueltech/icon/menu4.png")));
        mainMenuItem4.setMenuIcon(new javax.swing.AbstractListModel() {
            String[] strings = { "com/sanmigueltech/icon/s4_1.png" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        mainMenuItem4.setMenuModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Reportes" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        menu.add(mainMenuItem4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(subMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mainForm, javax.swing.GroupLayout.DEFAULT_SIZE, 1026, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(mainForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(menu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
                    .addComponent(subMenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mainMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mainMenuItem1ActionPerformed

    
    public static void main(ModelUser user) {
        FlatLaf.registerCustomDefaultsSource("com.sanmigueltech.style");
        FlatIntelliJLaf.setup();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                PanelParking mainFrame = new PanelParking();

                // Configura el JFrame para que se abra en pantalla completa
                mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                mainFrame.setVisible(true);

                PanelParking FrameMain = new PanelParking();

                // Establecer el tamaño específico para el JFrame
                FrameMain.setSize(1330, 1039);

                // Centrar el JFrame en la pantalla
                FrameMain.setLocationRelativeTo(null);

                // Bloquear el redimensionamiento de la ventana
                FrameMain.setResizable(false);

                FrameMain.setVisible(true);

            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbLogo;
    private com.sanmigueltech.menu.MainForm mainForm;
    private com.sanmigueltech.menu.MenuItem mainMenuItem1;
    private com.sanmigueltech.menu.MenuItem mainMenuItem2;
    private com.sanmigueltech.menu.MenuItem mainMenuItem3;
    private com.sanmigueltech.menu.MenuItem mainMenuItem4;
    private com.sanmigueltech.menu.Menu menu;
    private com.sanmigueltech.menu.SubMenuPanel subMenu;
    // End of variables declaration//GEN-END:variables
}
