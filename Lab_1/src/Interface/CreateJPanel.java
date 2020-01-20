/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Business.Product;
import javax.swing.JOptionPane;
/**
 *
 * @author Swati
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    private Product product;
    public CreateJPanel(Product product) {
        initComponents();
        this.product=product;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CreateLabel = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        PriceLabel = new javax.swing.JLabel();
        AvailNumLabel = new javax.swing.JLabel();
        DescLabel = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        PriceTextField = new javax.swing.JTextField();
        AvailNUmTextField = new javax.swing.JTextField();
        DescTextField = new javax.swing.JTextField();
        CreateButton = new javax.swing.JButton();

        CreateLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        CreateLabel.setText("Create");

        NameLabel.setText("Name:");

        PriceLabel.setText("Price:");

        AvailNumLabel.setText("Availablity Number:");

        DescLabel.setText("Description:");

        PriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceTextFieldActionPerformed(evt);
            }
        });

        AvailNUmTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvailNUmTextFieldActionPerformed(evt);
            }
        });

        CreateButton.setText("Create");
        CreateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(CreateLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NameLabel)
                            .addComponent(PriceLabel)
                            .addComponent(AvailNumLabel)
                            .addComponent(DescLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NameTextField)
                            .addComponent(PriceTextField)
                            .addComponent(AvailNUmTextField)
                            .addComponent(DescTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(CreateButton)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(CreateLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameLabel)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PriceLabel)
                    .addComponent(PriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AvailNumLabel)
                    .addComponent(AvailNUmTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DescLabel)
                    .addComponent(DescTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CreateButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void PriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceTextFieldActionPerformed

    private void AvailNUmTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvailNUmTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AvailNUmTextFieldActionPerformed

    private void CreateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateButtonActionPerformed
        // TODO add your handling code here:
        product.setName(NameTextField.getText());
        product.setPrice(PriceTextField.getText());
        product.setAvailNum(AvailNUmTextField.getText());
        product.setDescription(DescTextField.getText());
        
        JOptionPane.showMessageDialog(null,"Created Product Successfully");
    }//GEN-LAST:event_CreateButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AvailNUmTextField;
    private javax.swing.JLabel AvailNumLabel;
    private javax.swing.JButton CreateButton;
    private javax.swing.JLabel CreateLabel;
    private javax.swing.JLabel DescLabel;
    private javax.swing.JTextField DescTextField;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JLabel PriceLabel;
    private javax.swing.JTextField PriceTextField;
    // End of variables declaration//GEN-END:variables
}
