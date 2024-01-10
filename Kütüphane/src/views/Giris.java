package views;
import Models.IKullanici;
import Patterns.KullaniciFactory;
import Patterns.KullaniciIDGetirme;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import service.PersonelIslemleri;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gamze
 */
public class Giris extends javax.swing.JFrame {
    PersonelIslemleri personel=new PersonelIslemleri();
    KullaniciIDGetirme kullanici = KullaniciIDGetirme.getKullanici();
    

    /**
     * Creates new form Giris
     */
    public Giris() {
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

        jPanel2 = new javax.swing.JPanel();
        buttonKayıt = new javax.swing.JButton();
        buttonGiriş = new javax.swing.JButton();
        comboUnvan = new javax.swing.JComboBox<>();
        txParola = new javax.swing.JPasswordField();
        txKullanıcıAdi = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 51));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(246, 231, 215,150));
        jPanel2.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.setMaximumSize(new java.awt.Dimension(500, 200));

        buttonKayıt.setBackground(new java.awt.Color(0, 102, 102));
        buttonKayıt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonKayıt.setText("Kayıt Ol");
        buttonKayıt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKayıtActionPerformed(evt);
            }
        });

        buttonGiriş.setBackground(new java.awt.Color(255, 0, 0));
        buttonGiriş.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonGiriş.setText("Giriş Yap");
        buttonGiriş.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGirişActionPerformed(evt);
            }
        });

        comboUnvan.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        comboUnvan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Personel", "Öğrenci", "Akademisyen" }));
        comboUnvan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.black, null, null));
        comboUnvan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboUnvanActionPerformed(evt);
            }
        });

        txParola.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.black, null, null));

        txKullanıcıAdi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.black, null, null));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel1.setText("Kullanıcı Adı:");

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel2.setText("Parola:");

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel3.setText("Unvan:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboUnvan, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(buttonGiriş)
                                        .addGap(66, 66, 66)
                                        .addComponent(buttonKayıt)
                                        .addGap(36, 36, 36))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(53, 53, 53)
                                        .addComponent(txKullanıcıAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(txParola, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(58, 58, 58))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txKullanıcıAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txParola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboUnvan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(58, 58, 58)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonKayıt)
                    .addComponent(buttonGiriş))
                .addGap(214, 214, 214))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(130, 210, 380, 218);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/7 Essentials Each Library Should Have.jpg"))); // NOI18N
        jLabel5.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 700, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboUnvanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboUnvanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboUnvanActionPerformed

    private void buttonGirişActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGirişActionPerformed
        
        String kullanic_adi=txKullanıcıAdi.getText();
        String parola=new String(txParola.getPassword());
        String unvan= (String)comboUnvan.getSelectedItem();         
        KullaniciFactory factory = new KullaniciFactory();
        IKullanici kullaniciModel = factory.kullaniciOlustur(unvan);
        int girisSonucu = kullaniciModel.giris(kullanic_adi,parola);
        if( girisSonucu > 0){
            JOptionPane.showMessageDialog(this, "Giriş Başarılı");
            kullanici.setId(girisSonucu);
            kullanici.setUnvan(unvan);
            
            if(unvan.equals("Personel")){
                PersonelEkrani personelEkrani = new PersonelEkrani();
                personelEkrani.setVisible(true);
                this.dispose();
            }else if (unvan.equals("Öğrenci")){
                ÖğrenciEkrani ogEkrani = new ÖğrenciEkrani();
                ogEkrani.setVisible(true);
                this.dispose();
                
            }else if (unvan.equals("Akademisyen")){
                AkademisyenEkranı akademisyenEkranı=new AkademisyenEkranı();
                akademisyenEkranı.setVisible(true);
                this.dispose();
            }
        }else {
            JOptionPane.showMessageDialog(this, "Giriş Başarısız");
           
        }
    }//GEN-LAST:event_buttonGirişActionPerformed

    private void buttonKayıtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKayıtActionPerformed
        KayıtOl kayıtOl=new KayıtOl();
        setVisible(false);
        kayıtOl.setVisible(true);
    }//GEN-LAST:event_buttonKayıtActionPerformed

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
            java.util.logging.Logger.getLogger(Giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Giris().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonGiriş;
    private javax.swing.JButton buttonKayıt;
    private javax.swing.JComboBox<String> comboUnvan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txKullanıcıAdi;
    private javax.swing.JPasswordField txParola;
    // End of variables declaration//GEN-END:variables

    class unvan {

        public unvan() {
        }
    }
}
