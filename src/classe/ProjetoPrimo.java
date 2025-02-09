
package classe;

import java.awt.Color;

public class ProjetoPrimo extends javax.swing.JFrame {

    public ProjetoPrimo() {
        initComponents();
        // inicializando o numero 1
        
        int numero1 = Integer.parseInt(controleNumero.getValue().toString());
        
        if(numero1 == 1){
            lblMensagem.setText("NÃO É PRIMO");
            lblMensagem.setForeground(Color.green);
        }
       
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        controleNumero = new javax.swing.JSpinner();
        lblMensagem = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Escolha um numero para saber se ele é primo");

        controleNumero.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        controleNumero.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10000, 1));
        controleNumero.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                controleNumeroStateChanged(evt);
            }
        });

        lblMensagem.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        lblMensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel3.setText("Projeto Primo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(controleNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addComponent(controleNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(lblMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void controleNumeroStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_controleNumeroStateChanged
                                
        // pegar valor
        
        int numero = Integer.parseInt(controleNumero.getValue().toString());
        
        int contDiv = 0;
        int contador = 1;
        
        // calculo e saida
        
        do{
            if(numero % contador == 0){
                contDiv++;
            }
            contador++;
        }while(contador <= numero);
        
        if(contDiv < 3){
            lblMensagem.setText("É PRIMO");
            lblMensagem.setForeground(Color.blue);
        }else{
            lblMensagem.setText("NÃO É PRIMO");
            lblMensagem.setForeground(Color.red);
        }
        
        
        
        
    }//GEN-LAST:event_controleNumeroStateChanged

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjetoPrimo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner controleNumero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblMensagem;
    // End of variables declaration//GEN-END:variables
}
