/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import javax.sound.sampled.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.util.TimerTask;
import java.util.concurrent.ScheduledFuture;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

/**
 *
 * @author Sachintha 18
 */
public class mine extends javax.swing.JFrame {

    private Clip clip;
    long totalTimeMillisecond;
    long sessiontime;
    long second = 0, minute = 0, hours = 0, days = 0;

    String second_string;
    String minutes_string;
    String hourse_string;

    String inputminute_string;
    String inputsecond_string;
    String inputdate_string;
    String totalTime;

    Timer timer;
    Timer dateTimer;

    int counter = 1;

    /**
     * Creates new form mine
     */
    public mine() {

        initComponents();
        setIconImage();
        //jframe.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

//
//        jLabel6.setHorizontalAlignment(SwingConstants.CENTER);
//        jLabel6.setVerticalAlignment(SwingConstants.CENTER);
//        JFrame.getContentPane().add(jLabel6, BorderLayout.CENTER);
        sessiontime = 4 * 60;
        totalTimeMillisecond = sessiontime * 1000;
        second = (totalTimeMillisecond / 1000) % 60;
        minute = (totalTimeMillisecond / 60000) % 60;
        hours = (totalTimeMillisecond / 360000);

        second_string = String.format("%02d", second);
        minutes_string = String.format("%02d", minute);
        hourse_string = String.format("%02d", hours);

        jLabel3.setText(minutes_string + " : " + second_string);

    }

    Timer hoursTimer2 = new Timer(1000, new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            if (totalTimeMillisecond != 0) {
                totalTimeMillisecond = totalTimeMillisecond - 1000;
                second = (totalTimeMillisecond / 1000) % 60;
                minute = (totalTimeMillisecond / 60000) % 60;
                hours = (totalTimeMillisecond / 360000);

                second_string = String.format("%02d", second);
                minutes_string = String.format("%02d", minute);
                hourse_string = String.format("%02d", hours);
                totalTime = String.format("%03d", totalTimeMillisecond);
                jLabel3.setText(minutes_string + " : " + second_string);

                if (totalTime.equals("60000")) {
                    playSound("/miusic/Alarm.wav");
                }
                if (totalTime.equals("1000")) {
                    playSound("/miusic/Alarm.wav");

                }
                if (totalTime.equals("0000")) {
                    startClicked = true;
                    hoursTimer2.stop();
                }
            } else {
                stoptimerzero();
            }
        }

    });

    Timer hoursTimer = new Timer(1000, new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            if (totalTimeMillisecond != 0) {
                totalTimeMillisecond = totalTimeMillisecond - 1000;
                second = (totalTimeMillisecond / 1000) % 60;
                minute = (totalTimeMillisecond / 60000) % 60;
                hours = (totalTimeMillisecond / 360000);

                second_string = String.format("%02d", second);
                minutes_string = String.format("%02d", minute);
                hourse_string = String.format("%02d", hours);
                totalTime = String.format("%03d", totalTimeMillisecond);
                jLabel3.setText(minutes_string + " : " + second_string);

                if (totalTime.equals("30000")) {
                    playSound("/miusic/Alarm.wav");

                }
                if (totalTime.equals("1000")) {
                    playSound("/miusic/Alarm.wav");

                }
                if (totalTime.equals("0000")) {
                    startClicked = true;
                    hoursTimer2.start();
                }

            } else {
                stoptimerzero();
            }
        }

    });
    boolean startClicked = false;

    public void stoptimerzero() {
        hoursTimer.stop();
        totalTimeMillisecond = 0;
        second = 0;
        minute = 0;
        hours = 0;

        second_string = String.format("%02d", second);
        minutes_string = String.format("%02d", minute);
        hourse_string = String.format("%02d", hours);
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/play.png")));
        startClicked = false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));

        jLabel3.setBackground(new java.awt.Color(204, 102, 0));
        jLabel3.setFont(new java.awt.Font("MS UI Gothic", 1, 270)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setAlignmentX(20.0F);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 3)); // NOI18N
        jLabel4.setText("4");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/head.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/play.png"))); // NOI18N
        jButton1.setAlignmentX(20.0F);
        jButton1.setAlignmentY(30.0F);
        jButton1.setPreferredSize(new java.awt.Dimension(160, 70));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/stop.png"))); // NOI18N
        jButton5.setAlignmentX(20.0F);
        jButton5.setAlignmentY(30.0F);
        jButton5.setPreferredSize(new java.awt.Dimension(160, 70));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sound.png"))); // NOI18N
        jButton6.setAlignmentX(20.0F);
        jButton6.setAlignmentY(30.0F);
        jButton6.setPreferredSize(new java.awt.Dimension(160, 70));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jButton7.setText("4 Minute");
        jButton7.setAlignmentX(20.0F);
        jButton7.setAlignmentY(30.0F);
        jButton7.setPreferredSize(new java.awt.Dimension(160, 70));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7);

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton9.setText("5 Minute");
        jButton9.setAlignmentX(20.0F);
        jButton9.setAlignmentY(30.0F);
        jButton9.setMargin(new java.awt.Insets(2, 20, 2, 20));
        jButton9.setPreferredSize(new java.awt.Dimension(160, 70));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(59, 59, 59))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(232, 232, 232))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                .addGap(47, 47, 47)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        hoursTimer.stop();
        hoursTimer2.stop();
        startClicked = false;
        sessiontime = 4 * 60;
        totalTimeMillisecond = sessiontime * 1000;
        second = (totalTimeMillisecond / 1000) % 60;
        minute = (totalTimeMillisecond / 60000) % 60;
        hours = (totalTimeMillisecond / 360000);

        second_string = String.format("%02d", second);
        minutes_string = String.format("%02d", minute);
        hourse_string = String.format("%02d", hours);

        jLabel4.setText("4");
        jLabel3.setText(minutes_string + " : " + second_string);
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/play.png")));
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        startClicked = false;
        hoursTimer2.stop();
        hoursTimer.stop();
        sessiontime = 5 * 60;
        totalTimeMillisecond = sessiontime * 1000;
        second = (totalTimeMillisecond / 1000) % 60;
        minute = (totalTimeMillisecond / 60000) % 60;
        hours = (totalTimeMillisecond / 360000);

        second_string = String.format("%02d", second);
        minutes_string = String.format("%02d", minute);
        hourse_string = String.format("%02d", hours);

        jLabel4.setText("5");
        jLabel3.setText(minutes_string + " : " + second_string);
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/play.png")));
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        playSound("/miusic/Alarm.wav");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        hoursTimer2.stop();
        hoursTimer.stop();
        String alt = jLabel4.getText();
        if (alt == "4") {
            int min = Integer.parseInt(jLabel4.getText());

            sessiontime = min * 60;
            totalTimeMillisecond = sessiontime * 1000;
            second = (totalTimeMillisecond / 1000) % 60;
            minute = (totalTimeMillisecond / 60000) % 60;
            hours = (totalTimeMillisecond / 360000);

            second_string = String.format("%02d", second);
            minutes_string = String.format("%02d", minute);
            hourse_string = String.format("%02d", hours);

            jLabel3.setText(minutes_string + " : " + second_string);
            startClicked = false;
            hoursTimer2.stop();
            jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/play.png")));
        } else if (alt == "5") {
            int min = Integer.parseInt(jLabel4.getText());

            sessiontime = min * 60;
            totalTimeMillisecond = sessiontime * 1000;
            second = (totalTimeMillisecond / 1000) % 60;
            minute = (totalTimeMillisecond / 60000) % 60;
            hours = (totalTimeMillisecond / 360000);

            second_string = String.format("%02d", second);
            minutes_string = String.format("%02d", minute);
            hourse_string = String.format("%02d", hours);

            jLabel3.setText(minutes_string + " : " + second_string);
            startClicked = false;
            hoursTimer.stop();
            jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/play.png")));
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String alt = jLabel4.getText();
        if (alt == "4") {
            if (evt.getSource() == jButton1) {
                if (startClicked == false) {
                    playSound("/miusic/Alarm.wav");
                    jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pause.png")));
                    startClicked = true;
                    hoursTimer.start();

                } else {
                    jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/play.png")));
                    startClicked = false;
                    hoursTimer.stop();
                    //playSound("/miusic/Alarm.wav");
                }
            } else if (evt.getSource() == jButton5) {
                hoursTimer.stop();
                totalTimeMillisecond = 0;
                second = 0;
                minute = 0;
                hours = 0;

                second_string = String.format("%02d", second);
                minutes_string = String.format("%02d", minute);
                hourse_string = String.format("%02d", hours);

                jLabel3.setText(minutes_string + " : " + second_string);
                jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/play.png")));
                startClicked = false;
            }
        } else if (alt == "5") {
            if (evt.getSource() == jButton1) {
                if (startClicked == false) {
                    playSound("/miusic/Alarm.wav");
                    jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pause.png")));
                    startClicked = true;
                    hoursTimer2.start();

                } else {
                    jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/play.png")));
                    startClicked = false;
                    hoursTimer2.stop();
                    //playSound("/miusic/Alarm.wav");
                }
            } else if (evt.getSource() == jButton5) {

                hoursTimer2.stop();
                totalTimeMillisecond = 0;
                second = 0;
                minute = 0;
                hours = 0;

                second_string = String.format("%02d", second);
                minutes_string = String.format("%02d", minute);
                hourse_string = String.format("%02d", hours);

                jLabel3.setText(minutes_string + " : " + second_string);
                jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/play.png")));
                startClicked = false;
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void playSound(String filePath) {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(getClass().getResource(filePath));

            clip = AudioSystem.getClip();

            clip.open(audioInputStream);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

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
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/logoicon.png")));
    }
}
