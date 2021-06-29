package vozeletronicacartoescredito;

import java.awt.Font;
import static java.lang.Math.ceil;
import static java.lang.Math.pow;
import static java.lang.Math.round;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Apresentacao extends javax.swing.JFrame {
    
    final String PathAudios; 
    ExecutaSom play = null;
    
    public Apresentacao() {
        this.PathAudios = "C:\\VozEletronicaCartoesCredito\\Sons\\";
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelImagemFundo1 = new vozeletronicacartoescredito.PainelImagemFundo();
        outlineLabel2 = new vozeletronicacartoescredito.OutlineLabel();
        Imagem = new javax.swing.JLabel();
        outlineLabel4 = new vozeletronicacartoescredito.OutlineLabel();
        ValorFatura = new javax.swing.JFormattedTextField();
        outlineLabel1 = new vozeletronicacartoescredito.OutlineLabel();
        Limite = new javax.swing.JFormattedTextField();
        outlineLabel5 = new vozeletronicacartoescredito.OutlineLabel();
        Disponivel = new javax.swing.JFormattedTextField();
        options = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        options1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Spongeboy Me Bob", 0, 18)); // NOI18N
        setType(java.awt.Window.Type.UTILITY);

        painelImagemFundo1.setBackground(new java.awt.Color(204, 255, 0));
        painelImagemFundo1.setImg(new ImageIcon("src/imagens/wallpaper.png"));

        outlineLabel2.setText("Simulador de Voz Eletronica para Operadora de Cartoes de Credito");
        outlineLabel2.setFont(new java.awt.Font("Spongeboy Me Bob", 0, 24)); // NOI18N

        Imagem.setIcon(new javax.swing.ImageIcon("C:\\VozEletronicaCartoesCredito\\cartão-de-crédito-azul.png")); // NOI18N
        Imagem.setText("Imagem");

        outlineLabel4.setText("Valor da Fatura");
        outlineLabel4.setFont(new java.awt.Font("Spongeboy Me Bob", 0, 18)); // NOI18N

        ValorFatura.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));
        ValorFatura.setText("536,45");
        ValorFatura.setFont(new java.awt.Font("Spongeboy Me Bob", 0, 14)); // NOI18N

        outlineLabel1.setText("Limite do Cartoes");
        outlineLabel1.setFont(new java.awt.Font("Spongeboy Me Bob", 0, 18)); // NOI18N

        Limite.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));
        Limite.setText("995,90");
        Limite.setFont(new java.awt.Font("Spongeboy Me Bob", 0, 14)); // NOI18N

        outlineLabel5.setText("Disponivel para Compras");
        outlineLabel5.setFont(new java.awt.Font("Spongeboy Me Bob", 0, 18)); // NOI18N

        Disponivel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));
        Disponivel.setText("423,55");
        Disponivel.setFont(new java.awt.Font("Spongeboy Me Bob", 0, 14)); // NOI18N
        Disponivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisponivelActionPerformed(evt);
            }
        });

        options.setFont(new java.awt.Font("Spongeboy Me Bob", 0, 18)); // NOI18N
        options.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Valor da Fatura", "Limite do Cartao", "Disponivel para Compras" }));
        options.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionsActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Spongeboy Me Bob", 0, 18)); // NOI18N
        jButton1.setText("Ouvir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Spongeboy Me Bob", 0, 18)); // NOI18N
        jButton2.setText("Musica");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        options1.setFont(new java.awt.Font("Spongeboy Me Bob", 0, 18)); // NOI18N
        options1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bob Esponja", "All Stars", "Autotune Roach", "Somebody That I Used To Know" }));
        options1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                options1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelImagemFundo1Layout = new javax.swing.GroupLayout(painelImagemFundo1);
        painelImagemFundo1.setLayout(painelImagemFundo1Layout);
        painelImagemFundo1Layout.setHorizontalGroup(
            painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelImagemFundo1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelImagemFundo1Layout.createSequentialGroup()
                        .addComponent(outlineLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelImagemFundo1Layout.createSequentialGroup()
                        .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(outlineLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(outlineLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Limite, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ValorFatura, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(Disponivel, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(outlineLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelImagemFundo1Layout.createSequentialGroup()
                                .addComponent(options, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelImagemFundo1Layout.createSequentialGroup()
                                .addComponent(options1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))
                            .addComponent(Imagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(91, 91, 91))))
        );
        painelImagemFundo1Layout.setVerticalGroup(
            painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelImagemFundo1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(outlineLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelImagemFundo1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(options))
                        .addGap(18, 18, 18)
                        .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(options1))
                        .addGap(42, 42, 42)
                        .addComponent(Imagem)
                        .addGap(56, 56, 56))
                    .addGroup(painelImagemFundo1Layout.createSequentialGroup()
                        .addComponent(outlineLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(ValorFatura, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(outlineLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Limite, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(outlineLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Disponivel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelImagemFundo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelImagemFundo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public JLabel mensagensDeAviso(String mensagem){
        JLabel label = new JLabel(mensagem);
        label.setFont(new Font("Spongeboy Me Bob", 1, 13));
        return label;
    }
    
    //Função que converte a parte fracionária da string em long
    long converteCentavo(String moeda){
        return moeda.charAt(1) - 48 + (moeda.charAt(0) - 48)*10;
    }
    
    /////////////////////////////////////////////////////////
    //Função que converte a real da string em long
    long converteReal(String moeda){
        long result = 0; //Variaval para armazenar o resultado
        int size = moeda.length(),i,k = 0;//Tamanho da string, variavel usada para ocultamento de entidade em bloco aninhado
        i = size - 1;
        while (i >= 0) {
            if(moeda.charAt(i) != '.'){//Condição para ignorar os '.' da string
                long mult = (long)pow(10,k); // Ocultamento da entidade size
                k++;
                result += (moeda.charAt(i)-48)*mult;
            }
            i--;
        }
        return result; //Retorno do resultado
    }
    
    /////////////////////////////////////////////////////////
    /*Função que converte a string e moeda, criando um vetor
    e armazenando os reais em uma parte, e os centavos em outra*/
    long[] converteMoeda(String moeda){
        long valor[] = new long[2]; //Vetor para armazenar o resultado
        String[] parts = moeda.split(",");//Dividindo a string em reais e centavos
        valor[0] = converteReal(parts[0]);//Armazendo os reais na primeira posicao
        valor[1] = converteCentavo(parts[1]);//Armazenando os centavos na segunda posicao
        return valor; //retorno do vetor
    }
    
    /////////////////////////////////////////////////////////
    int ObtemInteiro(double num){
    return (int)(num);
    }
    /////////////////////////////////////////////////////////////
    int ObtemDecimais(double num){
        float parte_decimal = (float)(num - ObtemInteiro(num)); 
        float parte_centavos = parte_decimal*100-parte_decimal;
        System.out.println(parte_centavos);
        return (int)(ceil(parte_centavos));
    }
    
    /////////////////////////////////////////////////////////////
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        /* Local onde devem estar os arquivos de aúdio .wav */
        
        long[] moeda;
        /*Converte para long os reais e os centavos a 
        string contidade no campo selecionado*/
        if(options.getSelectedIndex()==0) {
            String text = ValorFatura.getText();
            if(text.length() > 26){
                JOptionPane.showMessageDialog(null,mensagensDeAviso("Dados invalidos!."),"Dados não suportados",JOptionPane.ERROR_MESSAGE);
                ValorFatura.setText("");
                return;
            }
            moeda = converteMoeda(text);
        }   
        
        else if(options.getSelectedIndex() == 1) {
            String text = Limite.getText();
            if(text.length() > 26){
                JOptionPane.showMessageDialog(null,mensagensDeAviso("Dados invalidos!."),"Dados não suportados",JOptionPane.ERROR_MESSAGE);
                Limite.setText("");
                return;
            }
            moeda = converteMoeda(Limite.getText());
            
        }   
        
        else {
            String text = Disponivel.getText();
            if(text.length() > 26){
                JOptionPane.showMessageDialog(null,mensagensDeAviso("Dados invalidos!."),"Dados não suportados",JOptionPane.ERROR_MESSAGE);
                Disponivel.setText("");
                return;
            }
            moeda = converteMoeda(Disponivel.getText());
        }
 
        
        try {
            /* As cinco linhas a seguir tem o propósito de obter:
            a parte inteira, decimal e tamanho da variável valor do tipo double */
            long time;
            int played = 0;
            ExecutaSom toca = new ExecutaSom();
            AudioValores play = new AudioValores(); // Define o objeto da Classe AudioValores
            
            //Toca os audios se o valor em reais for maior que 0
            if(moeda[0] > 0){
                //Condições de utilização do plural
                if(moeda[0] == 1) play.audio_Centena(moeda[0],PathAudios,"Real");
                else play.audio_Centena(moeda[0],PathAudios,"Reais");
                played++;
            }
            
            if (moeda[1]>0){
                //Condições de utilização da conjunção "e"
                if(played>0) {
                    time = toca.executaSom(PathAudios + "ETeste.wav",false,-5.0f);
                    Thread.sleep(time - 200);
                }
                //Condições de utilização do plural
                if(moeda[1] == 1) play.audio_Centena(moeda[1],PathAudios,"Centavo");
                else play.audio_Centena(moeda[1],PathAudios,"Centavos");
            }
            
           
        } catch (Exception ex) {
            Logger.getLogger(Apresentacao.class.getName()).log(Level.SEVERE, null, ex);
        }                           
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (play != null) play.StopAudio();
        try {            
            String NomeMusica = ""; //Nome da Música
            switch (options1.getSelectedIndex()) {
                case 0:
                    NomeMusica="Spongebob";
                    break;
                case 1:
                    NomeMusica = "allStar";
                    break;
                case 2:
                    NomeMusica = "autotuneRoach";
                    break;
                case 3:
                    NomeMusica = "SomebodyThatIUsedToKnow";
                    break;
                default:
                    break;
            }
            play = new ExecutaSom();
            long duration = play.executaSom(PathAudios+NomeMusica+".wav",true,-10.0f);
        } catch (Exception ex) {
            Logger.getLogger(Apresentacao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void optionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionsActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_optionsActionPerformed

    private void DisponivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisponivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DisponivelActionPerformed

    private void options1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_options1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_options1ActionPerformed

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
            java.util.logging.Logger.getLogger(Apresentacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Apresentacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Apresentacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Apresentacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Apresentacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField Disponivel;
    private javax.swing.JLabel Imagem;
    private javax.swing.JFormattedTextField Limite;
    private javax.swing.JFormattedTextField ValorFatura;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> options;
    private javax.swing.JComboBox<String> options1;
    private vozeletronicacartoescredito.OutlineLabel outlineLabel1;
    private vozeletronicacartoescredito.OutlineLabel outlineLabel2;
    private vozeletronicacartoescredito.OutlineLabel outlineLabel4;
    private vozeletronicacartoescredito.OutlineLabel outlineLabel5;
    private vozeletronicacartoescredito.PainelImagemFundo painelImagemFundo1;
    // End of variables declaration//GEN-END:variables
}
