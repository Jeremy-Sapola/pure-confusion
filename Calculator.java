/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sapola.firstproject;

import java.awt.Dimension;

/**
 *
 * @author 25sapolaj
 */
public class Calculator extends javax.swing.JFrame {

    /**
     * Creates new form SoupLabels2
     */
    public Calculator() {
        initComponents();
        this.setMinimumSize(new Dimension(417, 370));
    }

    static int value1;
    static int value2;
    static String operator;


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnEqual = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        textResult = new javax.swing.JTextField();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnPlusMinus = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnMultiplication = new javax.swing.JButton();
        btnMinus = new javax.swing.JButton();
        btnPlus = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BlueCalc");
        setBackground(new java.awt.Color(51, 76, 124));
        getContentPane().setLayout(null);

        btnEqual.setBackground(new java.awt.Color(6, 26, 50));
        btnEqual.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        btnEqual.setForeground(new java.awt.Color(136, 183, 241));
        btnEqual.setText("=");
        btnEqual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEqualMouseClicked(evt);
            }
        });
        btnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualActionPerformed(evt);
            }
        });
        getContentPane().add(btnEqual);
        btnEqual.setBounds(260, 240, 60, 50);

        exitButton.setBackground(new java.awt.Color(6, 26, 50));
        exitButton.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        exitButton.setForeground(new java.awt.Color(136, 183, 241));
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(exitButton);
        exitButton.setBounds(310, 0, 90, 40);

        btnDivision.setBackground(new java.awt.Color(6, 26, 50));
        btnDivision.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        btnDivision.setForeground(new java.awt.Color(136, 183, 241));
        btnDivision.setText("/");
        btnDivision.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDivisionMouseClicked(evt);
            }
        });
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });
        getContentPane().add(btnDivision);
        btnDivision.setBounds(260, 190, 60, 50);

        textResult.setBackground(new java.awt.Color(6, 26, 50));
        textResult.setForeground(new java.awt.Color(136, 183, 241));
        textResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textResultActionPerformed(evt);
            }
        });
        getContentPane().add(textResult);
        textResult.setBounds(10, 4, 300, 30);

        btn1.setBackground(new java.awt.Color(6, 26, 50));
        btn1.setForeground(new java.awt.Color(136, 183, 241));
        btn1.setText("1");
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn1MouseClicked(evt);
            }
        });
        getContentPane().add(btn1);
        btn1.setBounds(20, 40, 80, 70);

        btn2.setBackground(new java.awt.Color(6, 26, 50));
        btn2.setForeground(new java.awt.Color(136, 183, 241));
        btn2.setText("2");
        btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn2MouseClicked(evt);
            }
        });
        getContentPane().add(btn2);
        btn2.setBounds(100, 40, 80, 70);

        btn3.setBackground(new java.awt.Color(6, 26, 50));
        btn3.setForeground(new java.awt.Color(136, 183, 241));
        btn3.setText("3");
        btn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn3MouseClicked(evt);
            }
        });
        getContentPane().add(btn3);
        btn3.setBounds(180, 40, 80, 70);

        btn4.setBackground(new java.awt.Color(6, 26, 50));
        btn4.setForeground(new java.awt.Color(136, 183, 241));
        btn4.setText("4");
        btn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn4MouseClicked(evt);
            }
        });
        getContentPane().add(btn4);
        btn4.setBounds(20, 110, 80, 70);

        btn5.setBackground(new java.awt.Color(6, 26, 50));
        btn5.setForeground(new java.awt.Color(136, 183, 241));
        btn5.setText("5");
        btn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn5MouseClicked(evt);
            }
        });
        getContentPane().add(btn5);
        btn5.setBounds(100, 110, 80, 70);

        btn6.setBackground(new java.awt.Color(6, 26, 50));
        btn6.setForeground(new java.awt.Color(136, 183, 241));
        btn6.setText("6");
        btn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn6MouseClicked(evt);
            }
        });
        getContentPane().add(btn6);
        btn6.setBounds(180, 110, 80, 70);

        btn7.setBackground(new java.awt.Color(6, 26, 50));
        btn7.setForeground(new java.awt.Color(136, 183, 241));
        btn7.setText("7");
        btn7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn7MouseClicked(evt);
            }
        });
        getContentPane().add(btn7);
        btn7.setBounds(20, 180, 80, 70);

        btn8.setBackground(new java.awt.Color(6, 26, 50));
        btn8.setForeground(new java.awt.Color(136, 183, 241));
        btn8.setText("8");
        btn8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn8MouseClicked(evt);
            }
        });
        getContentPane().add(btn8);
        btn8.setBounds(100, 180, 80, 70);

        btn9.setBackground(new java.awt.Color(6, 26, 50));
        btn9.setForeground(new java.awt.Color(136, 183, 241));
        btn9.setText("9");
        btn9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn9MouseClicked(evt);
            }
        });
        getContentPane().add(btn9);
        btn9.setBounds(180, 180, 80, 70);

        btn0.setBackground(new java.awt.Color(6, 26, 50));
        btn0.setForeground(new java.awt.Color(136, 183, 241));
        btn0.setText("0");
        btn0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn0MouseClicked(evt);
            }
        });
        getContentPane().add(btn0);
        btn0.setBounds(20, 250, 80, 40);

        btnPlusMinus.setBackground(new java.awt.Color(6, 26, 50));
        btnPlusMinus.setForeground(new java.awt.Color(136, 183, 241));
        btnPlusMinus.setText("+/-");
        getContentPane().add(btnPlusMinus);
        btnPlusMinus.setBounds(100, 250, 80, 40);

        btnClear.setBackground(new java.awt.Color(6, 26, 50));
        btnClear.setForeground(new java.awt.Color(136, 183, 241));
        btnClear.setText("CE");
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
        });
        getContentPane().add(btnClear);
        btnClear.setBounds(180, 250, 80, 40);

        btnMultiplication.setBackground(new java.awt.Color(6, 26, 50));
        btnMultiplication.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        btnMultiplication.setForeground(new java.awt.Color(136, 183, 241));
        btnMultiplication.setText("x");
        btnMultiplication.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMultiplicationMouseClicked(evt);
            }
        });
        btnMultiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicationActionPerformed(evt);
            }
        });
        getContentPane().add(btnMultiplication);
        btnMultiplication.setBounds(260, 140, 60, 50);

        btnMinus.setBackground(new java.awt.Color(6, 26, 50));
        btnMinus.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        btnMinus.setForeground(new java.awt.Color(136, 183, 241));
        btnMinus.setText("-");
        btnMinus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinusMouseClicked(evt);
            }
        });
        btnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusActionPerformed(evt);
            }
        });
        getContentPane().add(btnMinus);
        btnMinus.setBounds(260, 90, 60, 50);

        btnPlus.setBackground(new java.awt.Color(6, 26, 50));
        btnPlus.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        btnPlus.setForeground(new java.awt.Color(136, 183, 241));
        btnPlus.setText("+");
        btnPlus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPlusMouseClicked(evt);
            }
        });
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlus);
        btnPlus.setBounds(260, 40, 60, 50);

        jPanel2.setBackground(new java.awt.Color(6, 26, 50));
        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 40, 300, 250);

        jPanel1.setBackground(new java.awt.Color(51, 76, 124));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 470, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEqualActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDivisionActionPerformed

    private void btnMultiplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMultiplicationActionPerformed

    private void btnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMinusActionPerformed

    private void btnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPlusActionPerformed

    private void btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseClicked
        if (textResult.getText().isEmpty()) {
            textResult.setText(btn1.getText());
            value1 = 1;
        } else {
            textResult.setText(textResult.getText() + " " + btn1.getText());
            value2 = 1;
        }

    }//GEN-LAST:event_btn1MouseClicked

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

    }

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

    }

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

    }

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

    }

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

    }

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

    }

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

    }

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

    }

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

    }

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

    }
    private void textResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textResultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textResultActionPerformed

    private void btn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseClicked
        if (textResult.getText().isEmpty()) {
            textResult.setText(btn2.getText());
            value1 = 2;
        } else {
            textResult.setText(textResult.getText() + " " + btn2.getText());
            value2 = 2;
        }
    }//GEN-LAST:event_btn2MouseClicked

    private void btn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3MouseClicked
        if (textResult.getText().isEmpty()) {
            textResult.setText(btn3.getText());
            value1 = 3;
        } else {
            textResult.setText(textResult.getText() + " " + btn3.getText());
            value2 = 3;
        }
    }//GEN-LAST:event_btn3MouseClicked

    private void btn4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4MouseClicked
        if (textResult.getText().isEmpty()) {
            textResult.setText(btn4.getText());
            value1 = 4;
        } else {
            textResult.setText(textResult.getText() + " " + btn4.getText());
            value2 = 4;
        }
    }//GEN-LAST:event_btn4MouseClicked

    private void btn5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5MouseClicked
        if (textResult.getText().isEmpty()) {
            textResult.setText(btn5.getText());
            value1 = 5;
        } else {
            textResult.setText(textResult.getText() + " " + btn5.getText());
            value2 = 5;
        }
    }//GEN-LAST:event_btn5MouseClicked

    private void btn6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn6MouseClicked
        if (textResult.getText().isEmpty()) {
            textResult.setText(btn6.getText());
            value1 = 6;
        } else {
            textResult.setText(textResult.getText() + " " + btn6.getText());
            value2 = 6;
        }
    }//GEN-LAST:event_btn6MouseClicked

    private void btn7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn7MouseClicked
        if (textResult.getText().isEmpty()) {
            textResult.setText(btn7.getText());
            value1 = 7;
        } else {
            textResult.setText(textResult.getText() + " " + btn7.getText());
            value2 = 7;
        }
    }//GEN-LAST:event_btn7MouseClicked

    private void btn8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn8MouseClicked
        if (textResult.getText().isEmpty()) {
            textResult.setText(btn8.getText());
            value1 = 8;
        } else {
            textResult.setText(textResult.getText() + " " + btn8.getText());
            value2 = 8;
        }
    }//GEN-LAST:event_btn8MouseClicked

    private void btn9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn9MouseClicked
        if (textResult.getText().isEmpty()) {
            textResult.setText(btn9.getText());
            value1 = 9;
        } else {
            textResult.setText(textResult.getText() + " " + btn9.getText());
            value2 = 9;
        }
    }//GEN-LAST:event_btn9MouseClicked

    private void btn0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn0MouseClicked
        if (textResult.getText().isEmpty()) {
            textResult.setText(btn0.getText());
            value1 = 0;
        } else {
            textResult.setText(textResult.getText() + " " + btn0.getText());
            value2 = 0;
        }
    }//GEN-LAST:event_btn0MouseClicked

    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
        textResult.setText("");
    }//GEN-LAST:event_btnClearMouseClicked

    private void btnPlusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlusMouseClicked
        if (!(textResult.getText().isEmpty())) {
            operator = "plus";
            textResult.setText(textResult.getText() + "+");
        }
    }//GEN-LAST:event_btnPlusMouseClicked

    private void btnMinusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinusMouseClicked
        if (!(textResult.getText().isEmpty())) {
            operator = "minus";
            textResult.setText(textResult.getText() + "-");
        }
    }//GEN-LAST:event_btnMinusMouseClicked

    private void btnMultiplicationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMultiplicationMouseClicked
        if (!(textResult.getText().isEmpty())) {
            operator = "multiplication";
            textResult.setText(textResult.getText() + "*");
        }
    }//GEN-LAST:event_btnMultiplicationMouseClicked

    private void btnDivisionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDivisionMouseClicked
        if (!(textResult.getText().isEmpty())) {
            operator = "division";
            textResult.setText(textResult.getText() + "/");
        }
    }//GEN-LAST:event_btnDivisionMouseClicked

    private void btnEqualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEqualMouseClicked
        double answer = 0;
        if("plus".equals(operator))
            answer = value1 + value2;
        else if("minus".equals(operator))
            answer = value1 - value2;
        else if("multiplication".equals(operator))
            answer = value1 * value2;
        else if(operator=="division")
            answer = value1 / value2;
        
        String Result = Double.toString(answer);
        textResult.setText(Result);
    }//GEN-LAST:event_btnEqualMouseClicked

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Calculator().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnEqual;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnMultiplication;
    private javax.swing.JButton btnPlus;
    private javax.swing.JButton btnPlusMinus;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField textResult;
    // End of variables declaration//GEN-END:variables
}
