/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mathematical.conversions;

import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

/**
 *
 * @author komal
 */
public class quiz extends javax.swing.JFrame {
    String[] questions = {"WHEN IS MATHEMATICS DAY CELEBRATED ?","WHO IS FOUNDER OF MATHEMATICS ?","WHEN IS PI DAY CELEBRATED ?","VALUE OF COS 360 ?","WHO DISCOVERED ZERO ?"};
    //the last item is correct answer
    //we will check the selected answer from user with last item
    String[][] options={{"MARCH 14","MAY 14","APRIL 22","DECEMBER 22","DECEMBER 22"},{"ARCHIMEDES","ARYABHATTA","EULER","BRAHMAGUPTA","ARCHIMEDES"},{"DECEMBER 22","JUNE 22","APRIL 14","MARCH 14","MARCH 14"},{"1/2","0","1","-1","1"},{"ARYABHATTA","ARCHIMEDES","SRINIVASA RAMANUJAN","BHASKARA","ARYABHATTA"}};
    int index=0,correct=0;
    
    ButtonGroup bg=new ButtonGroup();

    /**
     * Creates new form quiz
     */
    public quiz() {
        initComponents();
        
        bg.add(jRadioButton1);
        bg.add(jRadioButton2);
        bg.add(jRadioButton3);
        bg.add(jRadioButton4);
        
        next_qActionPerformed(null);
        
    }
    public void getSelectedOption(JRadioButton rbtn)
    {
        //get the selected value from radiobutton
        //increment the index
        //disable the radiobuttons
        //check if the user selected the right answer
        System.out.println(rbtn.getText());
        System.out.println(options[index][4]);
        if(rbtn.getText().equals(options[index][4]))
        {
            correct++;
        }
        index++;
        enableRButtons(false);
    }
    //enable /disable radiobuttons
    public void enableRButtons(boolean yes_or_no)
    {
        jRadioButton1.setEnabled(yes_or_no);
        jRadioButton2.setEnabled(yes_or_no);
        jRadioButton3.setEnabled(yes_or_no);
        jRadioButton4.setEnabled(yes_or_no);

    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        container = new javax.swing.JPanel();
        question = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        next_q = new javax.swing.JButton();
        close = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        container.setBackground(new java.awt.Color(204, 204, 204));
        container.setForeground(new java.awt.Color(255, 255, 255));

        question.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        question.setForeground(new java.awt.Color(0, 0, 255));
        question.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        question.setText("QUESTION HERE ???");

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(question, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(question, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jRadioButton1.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 204, 51));
        jRadioButton1.setText("jRadioButton1");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 204, 51));
        jRadioButton2.setText("jRadioButton2");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 204, 51));
        jRadioButton3.setText("jRadioButton3");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton4.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(255, 204, 51));
        jRadioButton4.setText("jRadioButton4");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        next_q.setBackground(new java.awt.Color(255, 153, 51));
        next_q.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        next_q.setForeground(new java.awt.Color(255, 255, 255));
        next_q.setText("NEXT");
        next_q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next_qActionPerformed(evt);
            }
        });

        close.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        close.setForeground(new java.awt.Color(255, 0, 51));
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("X");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\komal\\OneDrive\\Documents\\NetBeansProjects\\Mathematical conversions\\quiz time.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 338, Short.MAX_VALUE)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
                            .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(465, 465, 465)
                        .addComponent(next_q, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel1)))
                .addGap(61, 61, 61)
                .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(next_q, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1640, 940));

        pack();
    }// </editor-fold>                        

    private void next_qActionPerformed(java.awt.event.ActionEvent evt) {                                       
        
        if(next_q.getText().equals("RESTART THE QUIZ"))
        {
            //restart the quiz
            next_q.setText("NEXT");
            container.setBackground(new java.awt.Color(204, 204, 204));
            index=0;
            correct=0;
        }
        
        if(index==questions.length)
        {
            //display the user score
            question.setText("YOUR SCORE : " + correct + " / "+ questions.length);
            if(correct >=(float)questions.length/3)
            {
                container.setBackground(Color.green);
            }
            else
            {
                container.setBackground(Color.red);
            }
            next_q.setText("RESTART THE QUIZ");
        }
       
        else
        {
            //enable radio buttons
            enableRButtons(true);

            question.setText(questions[index]);
            jRadioButton1.setText(options[index][0]);
            jRadioButton2.setText(options[index][1]);
            jRadioButton3.setText(options[index][2]);
            jRadioButton4.setText(options[index][3]);

            if(index==questions.length-1)
            {
            next_q.setText("FINISH AND SEE THE RESULT");
        }
        }
        
            //clear the selection
            bg.clearSelection();
    }                                      

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        getSelectedOption(jRadioButton1);
    }                                             

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        getSelectedOption(jRadioButton2);
    }                                             

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        getSelectedOption(jRadioButton3);
    }                                             

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        getSelectedOption(jRadioButton4);
    }                                             

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {                                   
          if(evt.getSource()==close)
       {
           setVisible(false);
           new home().setVisible(true);
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new quiz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel close;
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JButton next_q;
    private javax.swing.JLabel question;
    // End of variables declaration                   
}