package gyakoroltato;

import static java.lang.Math.round;
import java.util.Random;

public class gyakoroltat extends javax.swing.JFrame {
    
    Random szam = new Random();
    int szam1 = 0;
    int szam2 = 0;
    int eredmeny = 0;
    
    public gyakoroltat() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        spValasz = new javax.swing.JSpinner();
        lblEredmeny = new javax.swing.JLabel();
        lblFeladat = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnBefejez = new javax.swing.JButton();
        btnUj = new javax.swing.JButton();
        btnEllenorzes = new javax.swing.JButton();
        btnMegoldas = new javax.swing.JButton();
        lblMuvelet = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuFeladatok = new javax.swing.JMenu();
        mnuOsszeadas = new javax.swing.JMenuItem();
        mnuKivonas = new javax.swing.JMenuItem();
        mnuSzorzas = new javax.swing.JMenuItem();
        mnuOsztas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        spValasz.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        spValasz.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblEredmeny.setText("jó / rossz");

        lblFeladat.setText("Feladat");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFeladat, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spValasz, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(lblEredmeny)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spValasz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEredmeny)
                    .addComponent(lblFeladat))
                .addContainerGap())
        );

        btnBefejez.setText("Befejezés");

        btnUj.setText("Új");

        btnEllenorzes.setText("Ellenőrzés");
        btnEllenorzes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEllenorzesActionPerformed(evt);
            }
        });

        btnMegoldas.setText("Megoldás");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUj)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEllenorzes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMegoldas))
                    .addComponent(btnBefejez))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBefejez, btnEllenorzes, btnMegoldas, btnUj});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUj)
                    .addComponent(btnEllenorzes)
                    .addComponent(btnMegoldas))
                .addGap(34, 34, 34)
                .addComponent(btnBefejez)
                .addContainerGap())
        );

        lblMuvelet.setText("Müvelet");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(lblMuvelet)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMuvelet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mnuFeladatok.setText("Feladatok");

        mnuOsszeadas.setText("Összeadas");
        mnuOsszeadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuOsszeadasActionPerformed(evt);
            }
        });
        mnuFeladatok.add(mnuOsszeadas);

        mnuKivonas.setText("Kivonas");
        mnuKivonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuKivonasActionPerformed(evt);
            }
        });
        mnuFeladatok.add(mnuKivonas);

        mnuSzorzas.setText("Szorzás");
        mnuSzorzas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSzorzasActionPerformed(evt);
            }
        });
        mnuFeladatok.add(mnuSzorzas);

        mnuOsztas.setText("Osztás");
        mnuFeladatok.add(mnuOsztas);

        jMenuBar1.add(mnuFeladatok);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnuOsszeadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuOsszeadasActionPerformed
        lblMuvelet.setText("Összeadás:");
        szam1 = round(szam.nextInt(50));
        szam2 = round(szam.nextInt(50));
        lblFeladat.setText("Mennyi: "+ szam1 + "+" + szam2 + "=");
        eredmeny = szam1+szam2;
    }//GEN-LAST:event_mnuOsszeadasActionPerformed

    private void btnEllenorzesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEllenorzesActionPerformed
        if(eredmeny == (int)spValasz.getValue()){
            lblEredmeny.setText("Jó válasz!");
        } else {
            lblEredmeny.setText("Rossz válasz!");
        }
    }//GEN-LAST:event_btnEllenorzesActionPerformed

    private void mnuSzorzasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSzorzasActionPerformed
      lblMuvelet.setText("Szorzás:");
        szam1 = round(szam.nextInt(10)+1);
        szam2 = round(szam.nextInt(10)+1);
        lblFeladat.setText("Mennyi: "+ szam1 + "*" + szam2 + "=");
        eredmeny = szam1*szam2;
    }//GEN-LAST:event_mnuSzorzasActionPerformed

    private void mnuKivonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuKivonasActionPerformed
        // 
    }//GEN-LAST:event_mnuKivonasActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gyakoroltat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBefejez;
    private javax.swing.JButton btnEllenorzes;
    private javax.swing.JButton btnMegoldas;
    private javax.swing.JButton btnUj;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblEredmeny;
    private javax.swing.JLabel lblFeladat;
    private javax.swing.JLabel lblMuvelet;
    private javax.swing.JMenu mnuFeladatok;
    private javax.swing.JMenuItem mnuKivonas;
    private javax.swing.JMenuItem mnuOsszeadas;
    private javax.swing.JMenuItem mnuOsztas;
    private javax.swing.JMenuItem mnuSzorzas;
    private javax.swing.JSpinner spValasz;
    // End of variables declaration//GEN-END:variables

   
}
