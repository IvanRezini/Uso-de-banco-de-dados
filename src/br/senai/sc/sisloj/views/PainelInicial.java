/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.sisloj.views;

/**
 *
 * @author Aluno
 */
public class PainelInicial extends javax.swing.JPanel {

    /**
     * Creates new form PainelInicial
     */
    public PainelInicial() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelVersao = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        labelAutor = new javax.swing.JLabel();
        labelImagem = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));

        labelVersao.setText("Versao 1.0");

        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Sitema de controle Interno de lojas.");

        labelAutor.setText("Autor Rezini");

        labelImagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sc/sisloj/imj/images.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelAutor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelVersao, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(labelImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelImagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelVersao, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAutor)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelAutor;
    private javax.swing.JLabel labelImagem;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelVersao;
    // End of variables declaration//GEN-END:variables
}
