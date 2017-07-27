/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.keertikeya;

import java.awt.Color;

/**
 *
 * @author Keertikeya
 */
public class AdminMain extends javax.swing.JFrame {

    /**
     * Creates new form AdminMain
     */
    public AdminMain(String adminName) {
        
        initComponents();
        nameLabel.setText(adminName);
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        WelcomePanel = new javax.swing.JPanel();
        Close = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        AddTeam = new javax.swing.JLabel();
        AddPlayer = new javax.swing.JLabel();
        AddVenue = new javax.swing.JLabel();
        AddOfficials = new javax.swing.JLabel();
        AddTeamSupport = new javax.swing.JLabel();
        AddMatch = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        UpdateTeam = new javax.swing.JLabel();
        UpdatePlayer = new javax.swing.JLabel();
        UpdateTeamSupport = new javax.swing.JLabel();
        UpdateOfficials = new javax.swing.JLabel();
        UpdateAdmin = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        DeleteTeam = new javax.swing.JLabel();
        DeletePlayer = new javax.swing.JLabel();
        DeleteVenue = new javax.swing.JLabel();
        DeleteTeamSupport = new javax.swing.JLabel();
        DeleteOfficials = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrator Page");
        setUndecorated(true);
        setResizable(false);

        WelcomePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Close.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Close.setForeground(new java.awt.Color(255, 0, 0));
        Close.setText("CLOSE");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("WELCOME");

        nameLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout WelcomePanelLayout = new javax.swing.GroupLayout(WelcomePanel);
        WelcomePanel.setLayout(WelcomePanelLayout);
        WelcomePanelLayout.setHorizontalGroup(
            WelcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WelcomePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Close)
                .addContainerGap())
        );
        WelcomePanelLayout.setVerticalGroup(
            WelcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WelcomePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(WelcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WelcomePanelLayout.createSequentialGroup()
                        .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14))
                    .addGroup(WelcomePanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(WelcomePanelLayout.createSequentialGroup()
                        .addComponent(Close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ADD", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        AddTeam.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AddTeam.setText("Team");
        AddTeam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddTeamMouseClicked(evt);
            }
        });

        AddPlayer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AddPlayer.setText("Player");
        AddPlayer.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                AddPlayerMouseDragged(evt);
            }
        });
        AddPlayer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddPlayerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddPlayerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddPlayerMouseExited(evt);
            }
        });

        AddVenue.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AddVenue.setText("Venue");
        AddVenue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddVenueMouseClicked(evt);
            }
        });

        AddOfficials.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AddOfficials.setText("Officials");
        AddOfficials.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddOfficialsMouseClicked(evt);
            }
        });

        AddTeamSupport.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AddTeamSupport.setText("Team Support");
        AddTeamSupport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddTeamSupportMouseClicked(evt);
            }
        });

        AddMatch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AddMatch.setText("Match Details");
        AddMatch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddMatchMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("New Admin");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(AddTeam)
                        .addGap(82, 82, 82))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddPlayer)
                            .addComponent(AddVenue))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddTeamSupport)
                            .addComponent(AddOfficials))
                        .addGap(77, 77, 77)
                        .addComponent(jLabel4))
                    .addComponent(AddMatch))
                .addGap(49, 49, 49))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddTeam)
                    .addComponent(AddTeamSupport)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddPlayer)
                    .addComponent(AddOfficials))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddVenue)
                    .addComponent(AddMatch))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "UPDATE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        UpdateTeam.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        UpdateTeam.setText("Team");
        UpdateTeam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateTeamMouseClicked(evt);
            }
        });

        UpdatePlayer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        UpdatePlayer.setText("Player");
        UpdatePlayer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdatePlayerMouseClicked(evt);
            }
        });

        UpdateTeamSupport.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        UpdateTeamSupport.setText("Team Support");
        UpdateTeamSupport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateTeamSupportMouseClicked(evt);
            }
        });

        UpdateOfficials.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        UpdateOfficials.setText("Officials");
        UpdateOfficials.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateOfficialsMouseClicked(evt);
            }
        });

        UpdateAdmin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        UpdateAdmin.setText("Account");
        UpdateAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateAdminMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UpdateTeam)
                    .addComponent(UpdatePlayer)
                    .addComponent(UpdateTeamSupport))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UpdateOfficials)
                    .addComponent(UpdateAdmin))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateTeam)
                    .addComponent(UpdateOfficials))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdatePlayer)
                    .addComponent(UpdateAdmin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(UpdateTeamSupport))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DELETE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        DeleteTeam.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        DeleteTeam.setText("Team");
        DeleteTeam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteTeamMouseClicked(evt);
            }
        });

        DeletePlayer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        DeletePlayer.setText("Player");
        DeletePlayer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeletePlayerMouseClicked(evt);
            }
        });

        DeleteVenue.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        DeleteVenue.setText("Venue");
        DeleteVenue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteVenueMouseClicked(evt);
            }
        });

        DeleteTeamSupport.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        DeleteTeamSupport.setText("Team Support");
        DeleteTeamSupport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteTeamSupportMouseClicked(evt);
            }
        });

        DeleteOfficials.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        DeleteOfficials.setText("Officials");
        DeleteOfficials.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteOfficialsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DeleteTeam)
                    .addComponent(DeletePlayer)
                    .addComponent(DeleteVenue))
                .addGap(74, 74, 74)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DeleteOfficials)
                    .addComponent(DeleteTeamSupport))
                .addGap(169, 169, 169))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeleteTeam)
                    .addComponent(DeleteTeamSupport))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeletePlayer)
                    .addComponent(DeleteOfficials))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DeleteVenue))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(WelcomePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(WelcomePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(558, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_CloseActionPerformed

    private void AddTeamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddTeamMouseClicked
        // TODO add your handling code here:
        AddTeam at = new AddTeam();
        at.setVisible(true);
    }//GEN-LAST:event_AddTeamMouseClicked

    private void AddPlayerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddPlayerMouseClicked
        // TODO add your handling code here:
        AddPLayer ap = new AddPLayer();
        ap.setVisible(true);
    }//GEN-LAST:event_AddPlayerMouseClicked

    private void AddPlayerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddPlayerMouseEntered
        // TODO add your handling code here:
        AddPlayer.setForeground(Color.red);
    }//GEN-LAST:event_AddPlayerMouseEntered

    private void AddPlayerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddPlayerMouseExited
        // TODO add your handling code here:
        AddPlayer.setForeground(Color.black);
    }//GEN-LAST:event_AddPlayerMouseExited

    private void AddPlayerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddPlayerMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_AddPlayerMouseDragged

    private void AddVenueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddVenueMouseClicked
        // TODO add your handling code here:
        AddVenue av = new AddVenue();
        av.setVisible(true);
    }//GEN-LAST:event_AddVenueMouseClicked

    private void AddTeamSupportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddTeamSupportMouseClicked
        // TODO add your handling code here:
        AddTeamSupport ats = new AddTeamSupport();
        ats.setVisible(true);
    }//GEN-LAST:event_AddTeamSupportMouseClicked

    private void AddOfficialsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddOfficialsMouseClicked
        // TODO add your handling code here:
        AddOfficial ao = new AddOfficial();
        ao.setVisible(true);
    }//GEN-LAST:event_AddOfficialsMouseClicked

    private void AddMatchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMatchMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        AddMatch am = new AddMatch();
        am.setVisible(true);
    }//GEN-LAST:event_AddMatchMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        AddAdmin aa = new AddAdmin();
        aa.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void UpdateTeamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateTeamMouseClicked
        // TODO add your handling code here:
        UpdateTeam ut = new UpdateTeam();
        ut.setVisible(true);
    }//GEN-LAST:event_UpdateTeamMouseClicked

    private void UpdatePlayerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdatePlayerMouseClicked
        // TODO add your handling code here:
        UpdatePlayer up = new UpdatePlayer();
        up.setVisible(true);
    }//GEN-LAST:event_UpdatePlayerMouseClicked

    private void UpdateTeamSupportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateTeamSupportMouseClicked
        // TODO add your handling code here:
        UpdateTeamSupport uts = new UpdateTeamSupport();
        uts.setVisible(true);
    }//GEN-LAST:event_UpdateTeamSupportMouseClicked

    private void UpdateOfficialsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateOfficialsMouseClicked
        // TODO add your handling code here:
        UpdateOfficials uo = new UpdateOfficials();
        uo.setVisible(true);
    }//GEN-LAST:event_UpdateOfficialsMouseClicked

    private void UpdateAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateAdminMouseClicked
        // TODO add your handling code here:
        UpdateAdminAccount uaa = new UpdateAdminAccount();
        uaa.setVisible(true);
    }//GEN-LAST:event_UpdateAdminMouseClicked

    private void DeleteTeamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteTeamMouseClicked
        // TODO add your handling code here:
        DeleteTeam dt = new DeleteTeam();
        dt.setVisible(true);
    }//GEN-LAST:event_DeleteTeamMouseClicked

    private void DeletePlayerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeletePlayerMouseClicked
        // TODO add your handling code here:
        DeletePlayer dp = new DeletePlayer();
        dp.setVisible(true);
    }//GEN-LAST:event_DeletePlayerMouseClicked

    private void DeleteVenueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteVenueMouseClicked
        // TODO add your handling code here:
        DeleteVenue dv = new DeleteVenue();
        dv.setVisible(true);
    }//GEN-LAST:event_DeleteVenueMouseClicked

    private void DeleteTeamSupportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteTeamSupportMouseClicked
        // TODO add your handling code here:
        DeleteTeamSupport dts = new DeleteTeamSupport();
        dts.setVisible(true);
    }//GEN-LAST:event_DeleteTeamSupportMouseClicked

    private void DeleteOfficialsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteOfficialsMouseClicked
        // TODO add your handling code here:
        DeleteOfficial doff = new DeleteOfficial();
        doff.setVisible(true);
    }//GEN-LAST:event_DeleteOfficialsMouseClicked

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
            java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMain("Admin").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddMatch;
    private javax.swing.JLabel AddOfficials;
    private javax.swing.JLabel AddPlayer;
    private javax.swing.JLabel AddTeam;
    private javax.swing.JLabel AddTeamSupport;
    private javax.swing.JLabel AddVenue;
    private javax.swing.JButton Close;
    private javax.swing.JLabel DeleteOfficials;
    private javax.swing.JLabel DeletePlayer;
    private javax.swing.JLabel DeleteTeam;
    private javax.swing.JLabel DeleteTeamSupport;
    private javax.swing.JLabel DeleteVenue;
    private javax.swing.JLabel UpdateAdmin;
    private javax.swing.JLabel UpdateOfficials;
    private javax.swing.JLabel UpdatePlayer;
    private javax.swing.JLabel UpdateTeam;
    private javax.swing.JLabel UpdateTeamSupport;
    private javax.swing.JPanel WelcomePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel nameLabel;
    // End of variables declaration//GEN-END:variables
}