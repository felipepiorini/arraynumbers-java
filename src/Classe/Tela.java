package Classe;

// @author Felipe Piorini
import javax.swing.JOptionPane;

public class Tela extends javax.swing.JFrame {

    private ArrayNumbers conj; //declaraçao do objeto

    public Tela() {
        initComponents();
        setLocationRelativeTo(null);
        conj = new ArrayNumbers();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDigiteUmNumero = new javax.swing.JLabel();
        jNumero = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jResultado = new javax.swing.JTextArea();
        jAdicionar = new javax.swing.JButton();
        jEncerrar = new javax.swing.JButton();
        jGera = new javax.swing.JButton();
        jSoma = new javax.swing.JButton();
        jInverte = new javax.swing.JButton();
        jOrdene = new javax.swing.JButton();
        jBusca = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Adicionar um numero em um Array");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jDigiteUmNumero.setText("Numero:");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));

        jResultado.setColumns(20);
        jResultado.setRows(5);
        jResultado.setTabSize(2);
        jScrollPane1.setViewportView(jResultado);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jAdicionar.setText("Adicionar");
        jAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAdicionarActionPerformed(evt);
            }
        });

        jEncerrar.setText("Encerrar");
        jEncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEncerrarActionPerformed(evt);
            }
        });

        jGera.setText("Gera");
        jGera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGeraActionPerformed(evt);
            }
        });

        jSoma.setText("Soma");
        jSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSomaActionPerformed(evt);
            }
        });

        jInverte.setText("Inverte");
        jInverte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInverteActionPerformed(evt);
            }
        });

        jOrdene.setText("Ordena");

        jBusca.setText("Busca iguais");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jDigiteUmNumero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSoma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jOrdene, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jGera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jInverte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBusca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jEncerrar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDigiteUmNumero)
                    .addComponent(jNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jGera, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSoma, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jInverte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jOrdene, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jEncerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jAdicionar, jBusca, jEncerrar, jGera, jInverte, jOrdene, jSoma});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jEncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEncerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jEncerrarActionPerformed

    private void jAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAdicionarActionPerformed
        if (jNumero.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Será necessario preencher um numero", "Aviso", JOptionPane.ERROR_MESSAGE);
            jNumero.requestFocusInWindow();
            return;
    }//GEN-LAST:event_jAdicionarActionPerformed

        int num = Integer.parseInt(jNumero.getText());
        int retorno = conj.add(num);
        if (retorno == 0) {
            JOptionPane.showMessageDialog(null, "OverFlow", "Aviso", 0);
        }

        jNumero.setText("");
        jNumero.requestFocusInWindow();
        jResultado.setText(conj.toString());
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jNumero.setText("");
        jNumero.requestFocusInWindow();
    }//GEN-LAST:event_formWindowOpened

    private void jGeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGeraActionPerformed
       
        conj.geraVetor();//armazenou o vetor no conj
        jResultado.setText(conj.toString());//exibi o toString com os numeros aleatorios
        
        
    }//GEN-LAST:event_jGeraActionPerformed

    private void jSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSomaActionPerformed
       
        jResultado.setText(conj.toString()+"\nA soma dos elementos é = "+conj.somaVetor());
    }//GEN-LAST:event_jSomaActionPerformed

    private void jInverteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInverteActionPerformed
        
        conj.inverterVetor();
        jResultado.setText(conj.toString());
    }//GEN-LAST:event_jInverteActionPerformed

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
            java.util.logging.Logger.getLogger(Tela.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAdicionar;
    private javax.swing.JButton jBusca;
    private javax.swing.JLabel jDigiteUmNumero;
    private javax.swing.JButton jEncerrar;
    private javax.swing.JButton jGera;
    private javax.swing.JButton jInverte;
    private javax.swing.JTextField jNumero;
    private javax.swing.JButton jOrdene;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea jResultado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jSoma;
    // End of variables declaration//GEN-END:variables
}
