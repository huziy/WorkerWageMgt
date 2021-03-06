/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Wage;
import Business.WageCatalog;
import Business.Worker;
import Business.WorkerDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hu.ziy
 */
public class wageJPanel extends javax.swing.JPanel {

    /**
     * Creates new form wageJPanel
     */
    Worker worker;
    JPanel userProcessContainer;

    public wageJPanel(JPanel upc, Worker w) {
        initComponents();
        this.worker = w;
        this.userProcessContainer = upc;
        workerName.setText(worker.getWorkerName());
        basicComboBox.addItem("1800");
        basicComboBox.addItem("1900");
        basicComboBox.addItem("2000");
        basicComboBox.addItem("2100");
        basicComboBox.addItem("2200");
        basicComboBox.addItem("2300");
        basicComboBox.addItem("2400");
        full.addItem("0");
        full.addItem("300");
        full.addItem("100");
        ageComboBox.addItem("0");
        ageComboBox.addItem("30");
        ageComboBox.addItem("50");

        perform.setText(String.valueOf(worker.getWageCatolog().addWage().getPerformance()));

        //refreshTable();
    }

    public void refreshTable() {
        //perform.setText(Double.toString(worker.getWageCatolog().addWage().getPerformance()));
        DefaultTableModel model = (DefaultTableModel) wageCatalog.getModel();

        model.setRowCount(0);
        for (Wage wage : worker.getWageCatolog().getWageCatalog()) {
            Object row[] = new Object[10];
            row[0] = wage.getBasic();
            row[1] = wage.getPerformance();
            row[2] = wage.getFull();
            row[3] = wage.getAge();
            row[4] = wage.getPunishment();
            row[5] = wage.getNight();
            row[6] = wage.getLiving();
            row[7] = wage.getRecommand();
            row[8] = (double) row[0] + (double) row[1] + (double) row[2] + (double) row[3] + (double) row[4] + (double) row[5] * 10 + (double) row[6] + (double) row[7];
            row[9] = wage.getDate();

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        wageCatalog = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        punish = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        night = new javax.swing.JTextField();
        live = new javax.swing.JTextField();
        rec = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        basicComboBox = new javax.swing.JComboBox();
        ageComboBox = new javax.swing.JComboBox<>();
        perform = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        workerName = new javax.swing.JLabel();
        full = new javax.swing.JComboBox<>();

        wageCatalog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "基本工资", "绩效工资", "全勤奖金", "工龄工资", "罚款", "夜班费", "生活费", "带人奖金", "合计", "日期"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(wageCatalog);

        btnBack.setText("<<后退");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setText("基本工资");

        jLabel2.setText("绩效工资");

        jLabel3.setText("全勤奖金");

        jLabel4.setText("生活费");

        jLabel5.setText("夜班费");

        jLabel6.setText("罚款");

        jLabel7.setText("工龄工资");

        live.setText("30");

        jLabel8.setText("带人奖金");

        jButton1.setText("确认");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        basicComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                basicComboBoxActionPerformed(evt);
            }
        });

        ageComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageComboBoxActionPerformed(evt);
            }
        });

        perform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                performActionPerformed(evt);
            }
        });

        jLabel9.setText("日期");

        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });

        workerName.setFont(new java.awt.Font("方正兰亭超细黑简体", 1, 18)); // NOI18N
        workerName.setForeground(new java.awt.Color(51, 0, 51));

        full.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ageComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(perform, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(basicComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(full, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(punish, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(night, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(live, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rec, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(date, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(workerName, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(workerName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(punish, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(basicComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(night, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(perform, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(live, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(full, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(ageComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(28, 28, 28)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addGap(187, 187, 187))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void performActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_performActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_performActionPerformed

    private void basicComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basicComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_basicComboBoxActionPerformed

    private void ageComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageComboBoxActionPerformed

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Wage wage = worker.getWageCatolog().addWage();
        if (ageComboBox.getSelectedItem().equals("0")) {
            wage.setAge(0);
        }
        if (ageComboBox.getSelectedItem().equals("30")) {
            wage.setAge(30);
        }
        if (ageComboBox.getSelectedItem().equals("50")) {
            wage.setAge(50);
        }
        if (full.getSelectedItem().equals("0")) {
            wage.setFull(0);
        }
        if (full.getSelectedItem().equals("100")) {
            wage.setFull(100);
        }
        if (full.getSelectedItem().equals("300")) {
            wage.setFull(300);
        }
         if (basicComboBox.getSelectedItem().equals("1800")) {
            wage.setFull(1800);
        }
          if (basicComboBox.getSelectedItem().equals("1900")) {
            wage.setFull(1900);
        }
           if (basicComboBox.getSelectedItem().equals("2000")) {
            wage.setFull(2000);
        }
            if (basicComboBox.getSelectedItem().equals("2100")) {
            wage.setFull(2100);
        }
             if (basicComboBox.getSelectedItem().equals("2200")) {
            wage.setFull(2200);
        } if (basicComboBox.getSelectedItem().equals("2300")) {
            wage.setFull(2300);
        }
         if (basicComboBox.getSelectedItem().equals("2400")) {
            wage.setFull(2400);
        }
         wage.setPunishment(Double.valueOf(punish.getText()));
         wage.setNight(Double.valueOf(night.getText()));
         wage.setLiving(Double.valueOf(live.getText()));
         wage.setRecommand(Double.valueOf(rec.getText()));
         wage.setDate(date.getText());

        refreshTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void fullActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ageComboBox;
    private javax.swing.JComboBox basicComboBox;
    private javax.swing.JButton btnBack;
    private javax.swing.JTextField date;
    private javax.swing.JComboBox<String> full;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField live;
    private javax.swing.JTextField night;
    private javax.swing.JTextField perform;
    private javax.swing.JTextField punish;
    private javax.swing.JTextField rec;
    private javax.swing.JTable wageCatalog;
    private javax.swing.JLabel workerName;
    // End of variables declaration//GEN-END:variables
}
