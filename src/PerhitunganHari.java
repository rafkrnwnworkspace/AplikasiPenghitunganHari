import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;
 
public class PerhitunganHari extends javax.swing.JFrame {

    public PerhitunganHari() {
        initComponents();
        setTitle("Aplikasi Perhitungan Hari");
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private String getNamaHariIndonesia(java.time.DayOfWeek dayOfWeek) {
        switch (dayOfWeek) {
            case MONDAY:
                return "Senin";
            case TUESDAY:
                return "Selasa";
            case WEDNESDAY:
                return "Rabu";
            case THURSDAY:
                return "Kamis";
            case FRIDAY:
                return "Jumat";
            case SATURDAY:
                return "Sabtu";
            case SUNDAY:
                return "Minggu";
            default:
                return "";
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmbBulan = new javax.swing.JComboBox<>();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        calendarAkhir = new com.toedter.calendar.JCalendar();
        jLabel3 = new javax.swing.JLabel();
        btnHitungHari = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        calendarAwal = new com.toedter.calendar.JCalendar();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(228, 232, 237));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Aplikasi Perhitungan Hari", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bahnschrift", 1, 18))); // NOI18N

        cmbBulan.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        cmbBulan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember", " " }));
        cmbBulan.setToolTipText("");
        cmbBulan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBulanActionPerformed(evt);
            }
        });

        jSpinner1.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jSpinner1.setName(""); // NOI18N
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel1.setText("Pilih Bulan ");

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel2.setText("Pilih Tahun");

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel3.setText("Pilih Tanggal Akhir");

        btnHitungHari.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        btnHitungHari.setText("Hitung");
        btnHitungHari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungHariActionPerformed(evt);
            }
        });

        btnHapus.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel11.setText("Pilih Tanggal Awal ");

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel5.setText("Jumlah Hari :");

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel6.setText("Hari Pertama :");

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel7.setText("Hari Terakhir :");

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel8.setText("Selisih Hari :");

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel9.setText("Tahun Kabisat :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnHitungHari, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                                .addComponent(jSpinner1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cmbBulan, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(calendarAwal, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(calendarAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbBulan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnHitungHari, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(btnHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(calendarAwal, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(calendarAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)))
                .addComponent(jLabel10)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // Mengatur ulang semua komponen ke nilai default
        cmbBulan.setSelectedIndex(0);
        jSpinner1.setValue(0);
        calendarAkhir.setDate(new java.util.Date());
        jLabel5.setText("Jumlah Hari : ");
        jLabel6.setText("Hari Pertama : ");
        jLabel7.setText("Hari Terakhir : ");
        jLabel8.setText("Selisih Hari : ");
        jLabel9.setText("Tahun Kabisat:");
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnHitungHariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungHariActionPerformed
        int tahun = (int) jSpinner1.getValue();
        if (String.valueOf(tahun).length() != 4) {
            JOptionPane.showMessageDialog(this, "Tahun harus terdiri dari 4 digit", "Input Tidak Valid", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int bulan = cmbBulan.getSelectedIndex() + 1;

        LocalDate date = LocalDate.of(tahun, bulan, 1);
        int daysInMonth = date.lengthOfMonth();
        boolean isLeapYear = date.isLeapYear();

        String hasil = "Jumlah Hari : " + daysInMonth;
        if (bulan == 2 && isLeapYear) {
            hasil += " (Tahun Kabisat)";
        }

        LocalDate firstDay = date.withDayOfMonth(1);
        LocalDate lastDay = date.withDayOfMonth(daysInMonth);
        jLabel5.setText("Jumlah Hari : " + daysInMonth);
        jLabel9.setText("Tahun Kabisat: " + (isLeapYear ? "Ya" : "Tidak"));

        LocalDate startDate = calendarAwal.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate endDate = calendarAkhir.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        jLabel8.setText("Selisih Hari : " + daysBetween);

        jLabel6.setText("Hari Pertama: " + getNamaHariIndonesia(firstDay.getDayOfWeek()));
        jLabel7.setText("Hari Terakhir: " + getNamaHariIndonesia(lastDay.getDayOfWeek()));
    }//GEN-LAST:event_btnHitungHariActionPerformed

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        int tahun = (int) jSpinner1.getValue();

        // Ambil tanggal saat ini dari calendarAwal dan perbarui tahun
        LocalDate currentLocalDate = calendarAwal.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate updatedLocalDate = LocalDate.of(tahun, currentLocalDate.getMonthValue(), currentLocalDate.getDayOfMonth());

        // Set tanggal yang diperbarui ke kedua kalender
        calendarAwal.setDate(java.util.Date.from(updatedLocalDate.atStartOfDay(ZoneId.systemDefault()).toInstant()));
        calendarAkhir.setDate(java.util.Date.from(updatedLocalDate.atStartOfDay(ZoneId.systemDefault()).toInstant()));
    }//GEN-LAST:event_jSpinner1StateChanged

    private void cmbBulanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBulanActionPerformed
        int tahun = (int) jSpinner1.getValue();
        int bulan = cmbBulan.getSelectedIndex() + 1; // Bulan dari JComboBox (1 untuk Januari, 12 untuk Desember)

        // Ambil hari saat ini dari calendarAwal
        LocalDate currentLocalDate = calendarAwal.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int hari = Math.min(currentLocalDate.getDayOfMonth(), LocalDate.of(tahun, bulan, 1).lengthOfMonth());

        // Buat tanggal baru dengan bulan dan tahun yang diperbarui
        LocalDate updatedLocalDate = LocalDate.of(tahun, bulan, hari);

        // Set tanggal yang diperbarui ke kedua kalender
        calendarAwal.setDate(java.util.Date.from(updatedLocalDate.atStartOfDay(ZoneId.systemDefault()).toInstant()));
        calendarAkhir.setDate(java.util.Date.from(updatedLocalDate.atStartOfDay(ZoneId.systemDefault()).toInstant()));
    }//GEN-LAST:event_cmbBulanActionPerformed

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
            java.util.logging.Logger.getLogger(PerhitunganHari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerhitunganHari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerhitunganHari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerhitunganHari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PerhitunganHari().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnHitungHari;
    private com.toedter.calendar.JCalendar calendarAkhir;
    private com.toedter.calendar.JCalendar calendarAwal;
    private javax.swing.JComboBox<String> cmbBulan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSpinner jSpinner1;
    // End of variables declaration//GEN-END:variables
}
