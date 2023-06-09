/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mvcgrafik.view;

/**
 *
 * @author lukas
 */
public class FensterView extends javax.swing.JFrame {

    /**
     * @return the fcOpenSave
     */
    public javax.swing.JFileChooser getFcOpenSave() {
        return fcOpenSave;
    }


  /**
   * @return the btn_add
   */
  public javax.swing.JButton getBtn_add()
  {
    return btn_add;
  }

  /**
   * @return the btn_open
   */
  public javax.swing.JButton getBtn_open()
  {
    return btn_open;
  }

  /**
   * @return the btn_save
   */
  public javax.swing.JButton getBtn_save()
  {
    return btn_save;
  }

  /**
   * @return the ccPencilColor
   */
  public javax.swing.JColorChooser getCcPencilColor()
  {
    return ccPencilColor;
  }

  /**
   * @return the menuNewFile
   */
  public javax.swing.JMenuItem getMenuNewFile()
  {
    return menuNewFile;
  }

  /**
   * @return the menuOpen
   */
  public javax.swing.JMenuItem getMenuOpen()
  {
    return menuOpen;
  }

  /**
   * @return the menuPencilColor
   */
  public javax.swing.JMenuItem getMenuPencilColor()
  {
    return menuPencilColor;
  }

  /**
   * @return the menuPencilSize
   */
  public javax.swing.JMenuItem getMenuPencilSize()
  {
    return menuPencilSize;
  }

  /**
   * @return the menuPrint
   */
  public javax.swing.JMenuItem getMenuPrint()
  {
    return menuPrint;
  }

  /**
   * @return the menuSave
   */
  public javax.swing.JMenuItem getMenuSave()
  {
    return menuSave;
  }

  /**
   * @return the mnuFile
   */
  public javax.swing.JMenu getMnuFile()
  {
    return mnuFile;
  }

  /**
   * @return the spinSize
   */
  public javax.swing.JSpinner getSpinSize()
  {
    return spinSize;
  }

    /**
     * Creates new form FensterView
     */
    public FensterView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ccPencilColor = new javax.swing.JColorChooser();
        fcOpenSave = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btn_open = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        jToolBar2 = new javax.swing.JToolBar();
        lblPenSize = new javax.swing.JLabel();
        spinSize = new javax.swing.JSpinner();
        jMenuBar = new javax.swing.JMenuBar();
        mnuFile = new javax.swing.JMenu();
        menuNewFile = new javax.swing.JMenuItem();
        menuOpen = new javax.swing.JMenuItem();
        menuSave = new javax.swing.JMenuItem();
        menuPrint = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuPencilColor = new javax.swing.JMenuItem();
        menuPencilSize = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.PAGE_AXIS));
        getContentPane().add(jPanel1, java.awt.BorderLayout.SOUTH);

        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        jToolBar1.setRollover(true);

        btn_open.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mvcgrafik/view/icons/Open16.gif"))); // NOI18N
        btn_open.setToolTipText("Öffnen");
        btn_open.setFocusable(false);
        btn_open.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_open.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btn_open);

        btn_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mvcgrafik/view/icons/Save16.gif"))); // NOI18N
        btn_save.setToolTipText("Speichern");
        btn_save.setFocusable(false);
        btn_save.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_save.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_save);

        btn_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mvcgrafik/view/icons/Add16.gif"))); // NOI18N
        btn_add.setToolTipText("Hinzufügen");
        btn_add.setFocusable(false);
        btn_add.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_add.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btn_add);

        jPanel2.add(jToolBar1);

        jToolBar2.setRollover(true);

        lblPenSize.setText("Size");
        jToolBar2.add(lblPenSize);

        spinSize.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jToolBar2.add(spinSize);

        jPanel2.add(jToolBar2);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        mnuFile.setMnemonic('F');
        mnuFile.setText("File");

        menuNewFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuNewFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mvcgrafik/view/icons/Add16.gif"))); // NOI18N
        menuNewFile.setText("New File");
        menuNewFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNewFileActionPerformed(evt);
            }
        });
        mnuFile.add(menuNewFile);

        menuOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mvcgrafik/view/icons/Open16.gif"))); // NOI18N
        menuOpen.setText("Open");
        mnuFile.add(menuOpen);

        menuSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mvcgrafik/view/icons/Save16.gif"))); // NOI18N
        menuSave.setText("Save");
        menuSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSaveActionPerformed(evt);
            }
        });
        mnuFile.add(menuSave);

        menuPrint.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuPrint.setText("Print");
        mnuFile.add(menuPrint);

        jMenuBar.add(mnuFile);

        jMenu3.setMnemonic('P');
        jMenu3.setText("Pencil");

        menuPencilColor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        menuPencilColor.setText("Color");
        jMenu3.add(menuPencilColor);

        menuPencilSize.setText("Thickness");
        jMenu3.add(menuPencilSize);

        jMenuBar.add(jMenu3);

        setJMenuBar(jMenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuSaveActionPerformed

    private void menuNewFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNewFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuNewFileActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_saveActionPerformed

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
            java.util.logging.Logger.getLogger(FensterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FensterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FensterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FensterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FensterView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_open;
    private javax.swing.JButton btn_save;
    private javax.swing.JColorChooser ccPencilColor;
    private javax.swing.JFileChooser fcOpenSave;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JLabel lblPenSize;
    private javax.swing.JMenuItem menuNewFile;
    private javax.swing.JMenuItem menuOpen;
    private javax.swing.JMenuItem menuPencilColor;
    private javax.swing.JMenuItem menuPencilSize;
    private javax.swing.JMenuItem menuPrint;
    private javax.swing.JMenuItem menuSave;
    private javax.swing.JMenu mnuFile;
    private javax.swing.JSpinner spinSize;
    // End of variables declaration//GEN-END:variables
}
