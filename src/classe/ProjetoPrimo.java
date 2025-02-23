
package classe;

import java.awt.Color;

public class ProjetoPrimo extends javax.swing.JFrame {
    // funcao calcula primo
    static String calculaPrimo(int numeroParametro){
        int numero = numeroParametro;
        // caso para o numero 1
        if(numero == 1){
            return "NÃO É PRIMO";
        }
        
        // 
        if(numero < 2){
            return "NÃO É PRIMO";
        }
        // otimização para valores muito grandes
        int contDiv = 0;
        for (int i = 1; i * i <= numero; i++) {
            if (numero % i == 0) {
                contDiv++;
                // Se i * i == numero, conta apenas uma vez; caso contrário, conta ambos (i e numero/i)
                if (i != numero / i) {
                    contDiv++;
                }
            }
        }
        
        if(contDiv == 2){
            return "É PRIMO";
        }else{
            return "NÃO É PRIMO";
        }
        
      
        
    }

    public ProjetoPrimo() {
        initComponents();
        
        // Inicializar com o número 1 (não primo, em vermelho)
        int numero1 = Integer.parseInt(controleNumero.getValue().toString());
        String resultado = calculaPrimo(numero1);
        lblMensagem.setText(resultado);
        lblMensagem.setForeground(resultado.equals("É PRIMO") ? Color.BLUE : Color.RED);
   
       
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        controleNumero = new javax.swing.JSpinner();
        lblMensagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora de Primo");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Escolha um numero para saber se ele é primo");

        controleNumero.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        controleNumero.setModel(new javax.swing.SpinnerNumberModel(1, 1, 1000000000, 1));
        controleNumero.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                controleNumeroStateChanged(evt);
            }
        });

        lblMensagem.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        lblMensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(controleNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(83, 83, 83)
                .addComponent(controleNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(lblMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void controleNumeroStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_controleNumeroStateChanged
        // pegando o valor        
        
        int numero = Integer.parseInt(controleNumero.getValue().toString());
        
        String resultado = calculaPrimo(numero);
        
        lblMensagem.setText(resultado);
        lblMensagem.setForeground(resultado.equals("É PRIMO")?Color.BLUE:Color.RED);
//        
//        
//      
//        
//                      
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
    private javax.swing.JLabel lblMensagem;
    // End of variables declaration//GEN-END:variables
}
