import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;
/**
 *
 * @author Raveltis
 */
public class JFrame extends javax.swing.JFrame {

    Queue<Object> antrian = new LinkedList<>();
    int nomor = 0;
    int agoreng = 0,abakar = 0,atepung = 0,ageprek = 0,anasi= 0,bgoreng = 0,bbakar = 0,btepung = 0,bgeprek = 0,bnasi= 0,cgoreng =0 , cbakar = 0, ctepung = 0, cgeprek = 0, cnasi = 0, ctotal = 0;
    
    public JFrame() {
        initComponents();
    }

private static void pesan_kosong(){
   JOptionPane.showMessageDialog(null, "Jumlah Belum Dimasukkan","Warning", JOptionPane.WARNING_MESSAGE);
}
private static void pesan_karakter(){
   JOptionPane.showMessageDialog(null, "Format Jumlah Makanan Harus Angka","Warning", JOptionPane.WARNING_MESSAGE);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jMenu3 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dftantrian = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        goreng = new javax.swing.JCheckBox();
        bakar = new javax.swing.JCheckBox();
        tepung = new javax.swing.JCheckBox();
        geprek = new javax.swing.JCheckBox();
        nasi = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jlhgoreng = new javax.swing.JTextField();
        jlhbakar = new javax.swing.JTextField();
        jlhtepung = new javax.swing.JTextField();
        jlhgeprek = new javax.swing.JTextField();
        jlhnasi = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        hgoreng = new javax.swing.JLabel();
        hbakar = new javax.swing.JLabel();
        htepung = new javax.swing.JLabel();
        hgeprek = new javax.swing.JLabel();
        hnasi = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        htot = new javax.swing.JButton();
        prosesantrian = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        ambilantrian = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jlhantrian = new javax.swing.JLabel();
        ssdasadsdadsa = new javax.swing.JPanel();
        totantrian = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        panggilantrian = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        resethitungan = new javax.swing.JButton();

        jMenu3.setText("jMenu3");

        jMenu1.setText("jMenu1");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 255, 128));
        jPanel1.setForeground(new java.awt.Color(0, 255, 128));

        jLabel1.setText("Daftar Antrian");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setName("dftantrian"); // NOI18N

        dftantrian.setColumns(20);
        dftantrian.setRows(5);
        jScrollPane1.setViewportView(dftantrian);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        jLabel2.setFont(new java.awt.Font("SansSerif", 3, 36)); // NOI18N
        jLabel2.setText("WARUNG AYAM PAK BEJO");

        goreng.setText("Ayam Goreng");
        goreng.setName("goreng"); // NOI18N
        goreng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gorengActionPerformed(evt);
            }
        });

        bakar.setText("Ayam Bakar");
        bakar.setName("bakar"); // NOI18N
        bakar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bakarActionPerformed(evt);
            }
        });

        tepung.setText("Goreng Tepung");
        tepung.setName("tepung"); // NOI18N
        tepung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tepungActionPerformed(evt);
            }
        });

        geprek.setText("Geprek");
        geprek.setName("geprek"); // NOI18N
        geprek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geprekActionPerformed(evt);
            }
        });

        nasi.setText("Nasi");
        nasi.setName("nasi"); // NOI18N
        nasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nasiActionPerformed(evt);
            }
        });

        jLabel3.setText("Rp.10.000,00");

        jLabel4.setText("Rp.13.000,00");

        jLabel5.setText("Rp.12.000,00");

        jLabel6.setText("Rp.12.000,00");

        jLabel7.setText("Rp.5.000,00");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("List ayam");

        jLabel9.setText("Tambahan");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Harga");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Jumlah");

        jlhgoreng.setEditable(false);
        jlhgoreng.setName("jlhgoreng"); // NOI18N
        jlhgoreng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlhgorengActionPerformed(evt);
            }
        });

        jlhbakar.setEditable(false);
        jlhbakar.setName("jlhbakar"); // NOI18N

        jlhtepung.setEditable(false);
        jlhtepung.setName("jlhtepung"); // NOI18N

        jlhgeprek.setEditable(false);
        jlhgeprek.setName("jlhgeprek"); // NOI18N

        jlhnasi.setEditable(false);
        jlhnasi.setName("jlhnasi"); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Total Harga");

        hgoreng.setText("Rp.0,-");
        hgoreng.setName("hgoreng"); // NOI18N

        hbakar.setText("Rp.0,-");
        hbakar.setName("hbakar"); // NOI18N

        htepung.setText("Rp.0,-");
        htepung.setName("htepung"); // NOI18N

        hgeprek.setText("Rp.0,-");
        hgeprek.setName("hgeprek"); // NOI18N

        hnasi.setText("Rp.0,-");
        hnasi.setName("hnasi"); // NOI18N

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Total yang mesti dibayar :");

        total.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        total.setText("Rp.0,-");
        total.setToolTipText("");
        total.setName("harga"); // NOI18N

        htot.setBackground(new java.awt.Color(102, 178, 255));
        htot.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        htot.setText("Hitung Total Tanpa Antri");
        htot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                htotActionPerformed(evt);
            }
        });

        prosesantrian.setBackground(new java.awt.Color(102, 178, 255));
        prosesantrian.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        prosesantrian.setText("Proses Antrian");
        prosesantrian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prosesantrianActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(102, 178, 255));
        reset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        ambilantrian.setBackground(new java.awt.Color(102, 178, 255));
        ambilantrian.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ambilantrian.setText("Ambil Antrian");
        ambilantrian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ambilantrianActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(153, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setForeground(new java.awt.Color(255, 153, 153));

        jlhantrian.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlhantrian.setText("0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jlhantrian)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jlhantrian)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ssdasadsdadsa.setBackground(new java.awt.Color(153, 255, 204));
        ssdasadsdadsa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ssdasadsdadsa.setForeground(new java.awt.Color(255, 153, 153));

        totantrian.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        totantrian.setText("0");

        javax.swing.GroupLayout ssdasadsdadsaLayout = new javax.swing.GroupLayout(ssdasadsdadsa);
        ssdasadsdadsa.setLayout(ssdasadsdadsaLayout);
        ssdasadsdadsaLayout.setHorizontalGroup(
            ssdasadsdadsaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ssdasadsdadsaLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(totantrian)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        ssdasadsdadsaLayout.setVerticalGroup(
            ssdasadsdadsaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ssdasadsdadsaLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(totantrian)
                .addGap(53, 53, 53))
        );

        jLabel13.setText("Jumlah Antrian");

        jLabel14.setText("Total Antrian");

        jPanel5.setBackground(new java.awt.Color(153, 255, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        panggilantrian.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        panggilantrian.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panggilantrian.setText("-----");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(panggilantrian, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(panggilantrian)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jLabel15.setText("Panggilan Nomor Antrian");

        resethitungan.setBackground(new java.awt.Color(102, 178, 255));
        resethitungan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        resethitungan.setText("Reset menu");
        resethitungan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resethitunganActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(nasi, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(goreng, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bakar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tepung, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                    .addComponent(geprek, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(48, 48, 48)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addComponent(jlhgoreng)
                            .addComponent(jlhbakar)
                            .addComponent(jlhtepung)
                            .addComponent(jlhgeprek)
                            .addComponent(jlhnasi))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hgeprek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(hgoreng, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(htepung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(hbakar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(hnasi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(81, 81, 81)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ssdasadsdadsa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(99, 99, 99))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(htot)
                        .addGap(18, 18, 18)
                        .addComponent(ambilantrian, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(resethitungan, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(prosesantrian, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(658, 658, 658)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(211, 211, 211))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(161, 161, 161))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(goreng)
                            .addComponent(jLabel3)
                            .addComponent(jlhgoreng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hgoreng))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bakar)
                            .addComponent(jLabel4)
                            .addComponent(jlhbakar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hbakar))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tepung)
                            .addComponent(jLabel5)
                            .addComponent(jlhtepung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(htepung))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(geprek)
                            .addComponent(jLabel6)
                            .addComponent(jlhgeprek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hgeprek))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel15)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ssdasadsdadsa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel13)
                                .addComponent(jLabel14)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nasi)
                    .addComponent(jlhnasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(hnasi))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(total)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(htot, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prosesantrian, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ambilantrian, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resethitungan, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlhgorengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlhgorengActionPerformed

    }//GEN-LAST:event_jlhgorengActionPerformed

    private void gorengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gorengActionPerformed
       if (goreng.isSelected()== true){
           jlhgoreng.setEditable(true);
           jlhgoreng.requestFocus();
       }
      else {
           jlhgoreng.setEditable(false);
           jlhgoreng.setText("");
           hgoreng.setText("Rp.0,-");
       }
    }//GEN-LAST:event_gorengActionPerformed

    private void htotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_htotActionPerformed
    if(goreng.isSelected()==false&&bakar.isSelected()==false&&tepung.isSelected()==false&&geprek.isSelected()==false&&nasi.isSelected()==false){
    JOptionPane.showMessageDialog(null,"Makanan Belum Dipesan","Warning",JOptionPane.WARNING_MESSAGE);}
    else {
       if (goreng.isSelected()==true){
          if (jlhgoreng.getText().length()==0){
              pesan_kosong();
              jlhgoreng.requestFocus();
          }
          else if (jlhgoreng.getText().matches("[1-9]")){
              agoreng    = Integer.parseInt(jlhgoreng.getText());
              bgoreng    = 10000;
              cgoreng = agoreng * bgoreng;
              hgoreng.setText("Rp. "+cgoreng+",-");
          }
          else {
              pesan_karakter();
              jlhgoreng.requestFocus();
          }
       }
       if (bakar.isSelected()==true){
          if (jlhbakar.getText().length()==0){
              pesan_kosong();
              jlhbakar.requestFocus();
          }
          else if (jlhbakar.getText().matches("[1-9]")){
              abakar    = Integer.parseInt(jlhbakar.getText());
              bbakar    = 13000;
              cbakar = abakar * bbakar;
              hbakar.setText("Rp. "+cbakar+",-");
          }
          else {
              pesan_karakter();
              jlhbakar.requestFocus();
          }
       }
       if (tepung.isSelected()==true){
          if (jlhtepung.getText().length()==0){
              pesan_kosong();
              jlhtepung.requestFocus();
          }
          else if (jlhtepung.getText().matches("[1-9]")){
              atepung    = Integer.parseInt(jlhtepung.getText());
              btepung    = 12000;
              ctepung = atepung * btepung;
              htepung.setText("Rp. "+ctepung+",-");
          }
          else {
              pesan_karakter();
              jlhtepung.requestFocus();
          }
       }
       if (geprek.isSelected()==true){
          if (jlhgeprek.getText().length()==0){
              pesan_kosong();
              jlhgeprek.requestFocus();
          }
          else if (jlhgeprek.getText().matches("[1-9]")){
              ageprek    = Integer.parseInt(jlhgeprek.getText());
              bgeprek    = 12000;
              cgeprek = ageprek * bgeprek;
              hgeprek.setText("Rp. "+cgeprek+",-");
          }
          else {
              pesan_karakter();
              jlhgeprek.requestFocus();
          }
       }
       if (nasi.isSelected()==true){
          if (jlhnasi.getText().length()==0){
              pesan_kosong();
              jlhnasi.requestFocus();
          }
          else if (jlhnasi.getText().matches("[1-9]")){
              anasi    = Integer.parseInt(jlhnasi.getText());
              bnasi    = 5000;
              cnasi = anasi * bnasi;
              hnasi.setText("Rp. "+cnasi+",-");
          }
          else {
              pesan_karakter();
              jlhnasi.requestFocus();
          }
       }
    
    }//GEN-LAST:event_htotActionPerformed
    ctotal =cgoreng + cbakar + ctepung + cgeprek + cnasi;
    total.setText("Rp."+ctotal+",-");
    }
    private void bakarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bakarActionPerformed
       if (bakar.isSelected()== true){
           jlhbakar.setEditable(true);
           jlhbakar.requestFocus();
       }
      else {
           jlhbakar.setEditable(false);
           jlhbakar.setText("");
           hbakar.setText("Rp.0,-");
       }
    }//GEN-LAST:event_bakarActionPerformed

    private void tepungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tepungActionPerformed
       if (tepung.isSelected()== true){
           jlhtepung.setEditable(true);
           jlhtepung.requestFocus();
       }
      else {
           jlhtepung.setEditable(false);
           jlhtepung.setText("");
           htepung.setText("Rp.0,-");
       }
    }//GEN-LAST:event_tepungActionPerformed

    private void geprekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geprekActionPerformed
         if (geprek.isSelected()== true){
           jlhgeprek.setEditable(true);
           jlhgeprek.requestFocus();
       }
      else {
           jlhgeprek.setEditable(false);
           jlhgeprek.setText("");
           hgeprek.setText("Rp.0,-");
       }
    }//GEN-LAST:event_geprekActionPerformed

    private void nasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nasiActionPerformed
       if (nasi.isSelected()== true){
           jlhnasi.setEditable(true);
           jlhnasi.requestFocus();
       }
      else {
           jlhnasi.setEditable(false);
           jlhnasi.setText("");
           hnasi.setText("Rp.0,-");
       }
    }//GEN-LAST:event_nasiActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
jlhgoreng.setEditable(false);
jlhbakar.setEditable(false);
jlhtepung.setEditable(false);
jlhgeprek.setEditable(false);
jlhnasi.setEditable(false);
jlhgoreng.setText("");
jlhbakar.setText("");
jlhtepung.setText("");
jlhgeprek.setText("");
jlhnasi.setText("");
goreng.setSelected(false);
bakar.setSelected(false);
tepung.setSelected(false);
geprek.setSelected(false);
nasi.setSelected(false);
hgoreng.setText("Rp.0,-");
hbakar.setText("Rp.0,-");
htepung.setText("Rp.0,-");
hgeprek.setText("Rp.0,-");
hnasi.setText("Rp.0,-");
total.setText("Rp.0,-");
dftantrian.setText("");
jlhantrian.setText("0");
totantrian.setText("0");
panggilantrian.setText("-----");
int agoreng = 0,abakar = 0,atepung = 0,ageprek = 0,anasi= 0,bgoreng = 0,bbakar = 0,btepung = 0,bgeprek = 0,bnasi= 0,cgoreng =0 , cbakar = 0, ctepung = 0, cgeprek = 0, cnasi = 0, ctotal = 0;
    }//GEN-LAST:event_resetActionPerformed

    private void ambilantrianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ambilantrianActionPerformed
    if(goreng.isSelected()==false&&bakar.isSelected()==false&&tepung.isSelected()==false&&geprek.isSelected()==false&&nasi.isSelected()==false){
    JOptionPane.showMessageDialog(null,"Makanan Belum Dipesan","Warning",JOptionPane.WARNING_MESSAGE);}
    else {
              nomor++;
              String antr = "Antrian "+nomor;
              antrian.add(antr);
              String cvt = String.valueOf(antrian.size());
              jlhantrian.setText(cvt);
              totantrian.setText(""+nomor);
              panggilantrian.setText(""+antrian.peek());
              dftantrian.append(antr+"\n");
       if (goreng.isSelected()==true){
          if (jlhgoreng.getText().length()==0){
              pesan_kosong();
              jlhgoreng.requestFocus();
          }
          else if (jlhgoreng.getText().matches("[1-9]")){
              agoreng    = Integer.parseInt(jlhgoreng.getText());
              bgoreng    = 10000;
              cgoreng = agoreng * bgoreng;
              hgoreng.setText("Rp. "+cgoreng+",-");
          }
          else {
              pesan_karakter();
              jlhgoreng.requestFocus();
          }
       }
       if (bakar.isSelected()==true){
          if (jlhbakar.getText().length()==0){
              pesan_kosong();
              jlhbakar.requestFocus();
          }
          else if (jlhbakar.getText().matches("[1-9]")){
              abakar    = Integer.parseInt(jlhbakar.getText());
              bbakar    = 13000;
              cbakar = abakar * bbakar;
              hbakar.setText("Rp. "+cbakar+",-");
              
          }
          else {
              pesan_karakter();
              jlhbakar.requestFocus();
          }
       }
       if (tepung.isSelected()==true){
          if (jlhtepung.getText().length()==0){
              pesan_kosong();
              jlhtepung.requestFocus();
          }
          else if (jlhtepung.getText().matches("[1-9]")){
              atepung    = Integer.parseInt(jlhtepung.getText());
              btepung    = 12000;
              ctepung = atepung * btepung;
              htepung.setText("Rp. "+ctepung+",-");
              
          }
          else {
              pesan_karakter();
              jlhtepung.requestFocus();
          }
       }
       if (geprek.isSelected()==true){
          if (jlhgeprek.getText().length()==0){
              pesan_kosong();
              jlhgeprek.requestFocus();
          }
          else if (jlhgeprek.getText().matches("[1-9]")){
              ageprek    = Integer.parseInt(jlhgeprek.getText());
              bgeprek    = 12000;
              cgeprek = ageprek * bgeprek;
              hgeprek.setText("Rp. "+cgeprek+",-");
             
          }
          else {
              pesan_karakter();
              jlhgeprek.requestFocus();
          }
       }
       if (nasi.isSelected()==true){
          if (jlhnasi.getText().length()==0){
              pesan_kosong();
              jlhnasi.requestFocus();
          }
          else if (jlhnasi.getText().matches("[1-9]")){
              anasi    = Integer.parseInt(jlhnasi.getText());
              bnasi    = 5000;
              cnasi = anasi * bnasi;
              hnasi.setText("Rp. "+cnasi+",-");
              
          }
          else {
              pesan_karakter();
              jlhnasi.requestFocus();
          }
       }
    }
    ctotal =cgoreng + cbakar + ctepung + cgeprek + cnasi;
    total.setText("Rp."+ctotal+",-");
    }//GEN-LAST:event_ambilantrianActionPerformed

    private void prosesantrianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prosesantrianActionPerformed
    if(antrian.isEmpty()){
            JOptionPane.showMessageDialog(this, "Ambil nomor antrian terlebih dahulu !");
            panggilantrian.setText("-----");
        }
    else{
        dftantrian.setText("");
        antrian.poll();
        antrian.forEach((Object element) -> { 
            dftantrian.append("" + element + "\n");
            panggilantrian.setText(""+antrian.peek());
        });
    }
    }//GEN-LAST:event_prosesantrianActionPerformed

    private void resethitunganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resethitunganActionPerformed
    jlhgoreng.setEditable(false);
jlhbakar.setEditable(false);
jlhtepung.setEditable(false);
jlhgeprek.setEditable(false);
jlhnasi.setEditable(false);
jlhgoreng.setText("");
jlhbakar.setText("");
jlhtepung.setText("");
jlhgeprek.setText("");
jlhnasi.setText("");
goreng.setSelected(false);
bakar.setSelected(false);
tepung.setSelected(false);
geprek.setSelected(false);
nasi.setSelected(false);
hgoreng.setText("Rp.0,-");
hbakar.setText("Rp.0,-");
htepung.setText("Rp.0,-");
hgeprek.setText("Rp.0,-");
hnasi.setText("Rp.0,-");
total.setText("Rp.0,-");
int cgoreng =0 , cbakar = 0, ctepung = 0, cgeprek = 0, cnasi = 0, ctotal = 0;
    }//GEN-LAST:event_resethitunganActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ambilantrian;
    private javax.swing.JCheckBox bakar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextArea dftantrian;
    private javax.swing.JCheckBox geprek;
    private javax.swing.JCheckBox goreng;
    private javax.swing.JLabel hbakar;
    private javax.swing.JLabel hgeprek;
    private javax.swing.JLabel hgoreng;
    private javax.swing.JLabel hnasi;
    private javax.swing.JLabel htepung;
    private javax.swing.JButton htot;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlhantrian;
    private javax.swing.JTextField jlhbakar;
    private javax.swing.JTextField jlhgeprek;
    private javax.swing.JTextField jlhgoreng;
    private javax.swing.JTextField jlhnasi;
    private javax.swing.JTextField jlhtepung;
    private javax.swing.JCheckBox nasi;
    private javax.swing.JLabel panggilantrian;
    private javax.swing.JButton prosesantrian;
    private javax.swing.JButton reset;
    private javax.swing.JButton resethitungan;
    private javax.swing.JPanel ssdasadsdadsa;
    private javax.swing.JCheckBox tepung;
    private javax.swing.JLabel total;
    private javax.swing.JLabel totantrian;
    // End of variables declaration//GEN-END:variables
}
