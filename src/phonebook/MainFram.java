/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook;

/**
 *
 * @author M.K
 */
public class MainFram extends javax.swing.JFrame {

    /**
     * Creates new form MainFram
     */
    public MainFram() {
        initComponents();
        btnExit.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnAddContact = new javax.swing.JLabel();
        btnFindContact = new javax.swing.JLabel();
        add_Contact_lbl = new javax.swing.JLabel();
        find_Contact_lbl = new javax.swing.JLabel();
        btnDeleteContact = new javax.swing.JLabel();
        delete_Contact_lbl = new javax.swing.JLabel();
        btnAllContact = new javax.swing.JLabel();
        all_Contact_lbl = new javax.swing.JLabel();
        btnExit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bg_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 423));
        setMinimumSize(new java.awt.Dimension(600, 423));

        jPanel2.setLayout(null);

        btnAddContact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-add-book-100.png"))); // NOI18N
        btnAddContact.setToolTipText("Add");
        btnAddContact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddContactMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddContactMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddContactMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAddContactMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAddContactMouseReleased(evt);
            }
        });
        jPanel2.add(btnAddContact);
        btnAddContact.setBounds(90, 220, 100, 100);

        btnFindContact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-find-user-male-80.png"))); // NOI18N
        btnFindContact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFindContactMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFindContactMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFindContactMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnFindContactMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnFindContactMouseReleased(evt);
            }
        });
        jPanel2.add(btnFindContact);
        btnFindContact.setBounds(120, 330, 80, 80);

        add_Contact_lbl.setFont(new java.awt.Font("Arial Unicode MS", 0, 20)); // NOI18N
        add_Contact_lbl.setForeground(new java.awt.Color(0, 0, 0));
        add_Contact_lbl.setText("Find Contact");
        add_Contact_lbl.setToolTipText("");
        jPanel2.add(add_Contact_lbl);
        add_Contact_lbl.setBounds(210, 350, 120, 30);

        find_Contact_lbl.setFont(new java.awt.Font("Arial Unicode MS", 0, 20)); // NOI18N
        find_Contact_lbl.setForeground(new java.awt.Color(0, 0, 0));
        find_Contact_lbl.setText("Delete Contact");
        jPanel2.add(find_Contact_lbl);
        find_Contact_lbl.setBounds(390, 150, 140, 30);

        btnDeleteContact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-delete-bin-100.png"))); // NOI18N
        btnDeleteContact.setToolTipText("");
        btnDeleteContact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteContactMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteContactMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteContactMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDeleteContactMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnDeleteContactMouseReleased(evt);
            }
        });
        jPanel2.add(btnDeleteContact);
        btnDeleteContact.setBounds(400, 20, 100, 100);

        delete_Contact_lbl.setFont(new java.awt.Font("Arial Unicode MS", 0, 20)); // NOI18N
        delete_Contact_lbl.setForeground(new java.awt.Color(0, 0, 0));
        delete_Contact_lbl.setText("Add Contact");
        jPanel2.add(delete_Contact_lbl);
        delete_Contact_lbl.setBounds(200, 250, 120, 30);

        btnAllContact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-contacts-100.png"))); // NOI18N
        btnAllContact.setToolTipText("");
        btnAllContact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAllContactMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAllContactMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAllContactMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAllContactMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAllContactMouseReleased(evt);
            }
        });
        jPanel2.add(btnAllContact);
        btnAllContact.setBounds(80, 110, 100, 100);

        all_Contact_lbl.setFont(new java.awt.Font("Arial Unicode MS", 0, 20)); // NOI18N
        all_Contact_lbl.setForeground(new java.awt.Color(0, 0, 0));
        all_Contact_lbl.setText("All Contact");
        jPanel2.add(all_Contact_lbl);
        all_Contact_lbl.setBounds(190, 160, 140, 30);

        btnExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-close-window-48.png"))); // NOI18N
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnExitMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnExitMouseReleased(evt);
            }
        });
        jPanel2.add(btnExit);
        btnExit.setBounds(540, 20, 40, 40);

        jLabel1.setFont(new java.awt.Font("Arial Unicode MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome");
        jLabel1.setMaximumSize(new java.awt.Dimension(386, 34));
        jLabel1.setMinimumSize(new java.awt.Dimension(386, 34));
        jLabel1.setPreferredSize(new java.awt.Dimension(386, 34));
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 30, 600, 50);

        bg_wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/firstPage_image.jpg"))); // NOI18N
        bg_wallpaper.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(bg_wallpaper);
        bg_wallpaper.setBounds(0, 0, 600, 423);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddContactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddContactMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnAddContactMouseClicked

    private void btnAddContactMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddContactMousePressed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_btnAddContactMousePressed

    private void btnAddContactMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddContactMouseReleased
        // TODO add your handling code here:
        btnAddContact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-add-book-100.png")));
        new NewContact().setVisible(true);
        new MainFram().setVisible(false);
    }//GEN-LAST:event_btnAddContactMouseReleased

    private void btnAddContactMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddContactMouseExited
        // TODO add your handling code here:
        btnAddContact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-add-book-100.png")));
    }//GEN-LAST:event_btnAddContactMouseExited

    private void btnAddContactMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddContactMouseEntered
        // TODO add your handling code here:
        btnAddContact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-add-book-100 (3).png")));
    }//GEN-LAST:event_btnAddContactMouseEntered

    private void btnFindContactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFindContactMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFindContactMouseClicked

    private void btnFindContactMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFindContactMouseEntered
        // TODO add your handling code here:
        btnFindContact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-find-user-male-80 (2).png")));
    }//GEN-LAST:event_btnFindContactMouseEntered

    private void btnFindContactMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFindContactMouseExited
        // TODO add your handling code here:
        btnFindContact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-find-user-male-80.png")));
    }//GEN-LAST:event_btnFindContactMouseExited

    private void btnFindContactMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFindContactMousePressed
        // TODO add your handling code here:
        btnFindContact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-find-user-male-80 (1).png")));
        
    }//GEN-LAST:event_btnFindContactMousePressed

    private void btnFindContactMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFindContactMouseReleased
        // TODO add your handling code here:
        btnFindContact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-find-user-male-80.png")));
        new FindContact().setVisible(true);
        new MainFram().setVisible(false);
    }//GEN-LAST:event_btnFindContactMouseReleased

    private void btnDeleteContactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteContactMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteContactMouseClicked

    private void btnDeleteContactMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteContactMouseEntered
        // TODO add your handling code here:
        btnDeleteContact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-delete-bin-100 (2).png")));
    }//GEN-LAST:event_btnDeleteContactMouseEntered

    private void btnDeleteContactMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteContactMouseExited
        // TODO add your handling code here:
        btnDeleteContact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-delete-bin-100.png")));
    }//GEN-LAST:event_btnDeleteContactMouseExited

    private void btnDeleteContactMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteContactMousePressed
        // TODO add your handling code here:
        btnDeleteContact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-delete-bin-100 (1).png")));
        
    }//GEN-LAST:event_btnDeleteContactMousePressed

    private void btnDeleteContactMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteContactMouseReleased
        // TODO add your handling code here:
        btnDeleteContact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-delete-bin-100.png")));
        new DeleteContact().setVisible(true);
        new MainFram().setVisible(false);
    }//GEN-LAST:event_btnDeleteContactMouseReleased

    private void btnAllContactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAllContactMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAllContactMouseClicked

    private void btnAllContactMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAllContactMouseEntered
        // TODO add your handling code here:
        btnAllContact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-contacts-100 (1).png")));
    }//GEN-LAST:event_btnAllContactMouseEntered

    private void btnAllContactMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAllContactMouseExited
        // TODO add your handling code here:
        btnAllContact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-contacts-100.png")));
    }//GEN-LAST:event_btnAllContactMouseExited

    private void btnAllContactMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAllContactMousePressed
        // TODO add your handling code here:
        btnAllContact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-contacts-100 (2).png")));
        
    }//GEN-LAST:event_btnAllContactMousePressed

    private void btnAllContactMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAllContactMouseReleased
        // TODO add your handling code here:
        btnAllContact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-contacts-100.png")));
        new AllContacts().setVisible(true);
        new MainFram().setVisible(false);
    }//GEN-LAST:event_btnAllContactMouseReleased

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMousePressed
        // TODO add your handling code here:
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-close-window-48 (1).png")));
        
        
    }//GEN-LAST:event_btnExitMousePressed

    private void btnExitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseReleased
        // TODO add your handling code here:
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-close-window-48.png")));
       this.dispose();
    }//GEN-LAST:event_btnExitMouseReleased

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
            java.util.logging.Logger.getLogger(MainFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add_Contact_lbl;
    private javax.swing.JLabel all_Contact_lbl;
    private javax.swing.JLabel bg_wallpaper;
    private javax.swing.JLabel btnAddContact;
    private javax.swing.JLabel btnAllContact;
    private javax.swing.JLabel btnDeleteContact;
    private javax.swing.JLabel btnExit;
    private javax.swing.JLabel btnFindContact;
    private javax.swing.JLabel delete_Contact_lbl;
    private javax.swing.JLabel find_Contact_lbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
