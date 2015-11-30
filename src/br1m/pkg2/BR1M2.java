/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br1m.pkg2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 *
 * @author hakase
 */
class cuba extends JFrame implements ActionListener {
    JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9, label10, label11, label12, label13, label14, label15;
    JTextField teks1, teks2, teks3, teks4, teks5, teks6, teks7, teks8, teks9, teks10, teks11, teks12;
    JButton butang;
    JPanel panel, panel2;
    final JComboBox statusCombo, statusNegeri;
    
    cuba(String tajuk) {
        super(tajuk);
        setVisible(true);
        setSize(650, 750);
        setLayout(null);
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon("br1m.png").getImage());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // menu bar
        JMenuBar menubar = new JMenuBar();
        JMenu file = new JMenu("Fail");
        file.setMnemonic(KeyEvent.VK_F);
        JMenuItem eMenuItem = new JMenuItem("Keluar", new ImageIcon("hakase-z.png"));
        eMenuItem.setMnemonic(KeyEvent.VK_E);
        eMenuItem.setToolTipText("Keluar aplikasi");
        eMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });
        JMenuItem eMenuItem2 = new JMenuItem("Tentang kami", new ImageIcon("hakase-wee.jpg"));
        eMenuItem2.setMnemonic(KeyEvent.VK_A);
        eMenuItem2.setToolTipText("Tentang kami");
        eMenuItem2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                JLabel V, L, M1, M2, M3, M4, M5;
                JFrame F1 = new JFrame();
                F1.setTitle("Tentang kami");
                F1.setVisible(true);
                F1.setSize(400, 200);
                F1.setResizable(false);
                F1.setIconImage(new ImageIcon("hakase-wee.jpg").getImage());
                F1.setLocationRelativeTo(null);
                F1.setLayout(null);
                int y = 5;
                L = new JLabel();   L.setText("Pembangun: ");   L.setBounds(10, y, 250, 30);
                M1 = new JLabel();  M1.setText("Muhammad Aliff Muazzam bin Jaafar");   M1.setBounds(100, y+20, 500, 30);
                M2 = new JLabel();  M2.setText("- muhammadaliffmuazzam@gmail.com"); M2.setBounds(100, y+40, 500 ,30);
                M3 = new JLabel();  M3.setText("Idea: ");   M3.setBounds(10, y+60, 250, 30);
                M4 = new JLabel();  M4.setText("Pali"); M4.setBounds(100, y+80, 500, 30);
                M5 = new JLabel();  M5.setText("- "); M5.setBounds(100, y+100, 500, 30);
                V = new JLabel();    V.setText("Versi:   1.0v"); V.setBounds(10, y+140, 250, 30);
                F1.add(V);  F1.add(L);  F1.add(M1); F1.add(M2); F1.add(M3); F1.add(M4); F1.add(M5);
            }
        });
        file.add(eMenuItem2);
        file.add(eMenuItem);
        menubar.add(file);
        setJMenuBar(menubar);
        
        // combobox
        panel = new JPanel();
        final DefaultComboBoxModel statusKahwin = new DefaultComboBoxModel();
        statusKahwin.addElement("");
        statusKahwin.addElement("Bujang");
        statusKahwin.addElement("Berkahwin");
        statusKahwin.addElement("Bercerai");
        
        statusCombo = new JComboBox(statusKahwin); 
        statusCombo.setSelectedIndex(0);
        JScrollPane statusListScrollPane = new JScrollPane(statusCombo);
        statusListScrollPane.setSize(300, 30);
        
        panel2 = new JPanel();
        final DefaultComboBoxModel negeri = new DefaultComboBoxModel();
        negeri.addElement("");
        negeri.addElement("Sarawak");
        negeri.addElement("Sabah");
        negeri.addElement("Pahang");
        negeri.addElement("Perak");     
        negeri.addElement("Johor");
        negeri.addElement("Kelantan");
        negeri.addElement("Terengganu");
        negeri.addElement("Kedah");
        negeri.addElement("Selangor");
        negeri.addElement("Negeri Sembilan");
        negeri.addElement("Melaka");     
        negeri.addElement("Pulau Pinang");
        negeri.addElement("Perlis");
        negeri.addElement("Kuala Lumpur");
        
        statusNegeri = new JComboBox(negeri);
        statusNegeri.setSelectedIndex(0);
        JScrollPane statusListScrollPane2 = new JScrollPane(statusNegeri);
        statusListScrollPane2.setSize(300, 30);
        
        // start giving value. assigning..
        label1 = new JLabel(tajuk);
        label1.setForeground(Color.blue);
        
        label2 = new JLabel("Nama: ");  teks1 = new JTextField();
        label3 = new JLabel("No. MyKad: "); teks2 = new JTextField();
        label5 = new JLabel("Tarikh Lahir: ");  teks3 = new JTextField();
        label4 = new JLabel("Status Perkahwinan: ");
        label6 = new JLabel("No. Telefon Bimbit: ");    teks4 = new JTextField();
        label7 = new JLabel("No. Telefon Rumah: "); teks5 = new JTextField();
        label8 = new JLabel("Pekerjaan: "); teks6 = new JTextField();
        label9 = new JLabel("Nama Bank: "); teks7 = new JTextField();
        label10 = new JLabel("No. Akaun Bank: ");   teks8 = new JTextField();
        label11 = new JLabel("Alamat Email: "); teks9 = new JTextField();
        label12 = new JLabel("Alamat surat menyurat (terkini): ");    teks10 = new JTextField();
        label13 = new JLabel("Poskod: ");   teks11 = new JTextField();
        label14 = new JLabel("Bandar/Daerah: ");    teks12 = new JTextField();
        label15 = new JLabel("Negeri: ");
        butang = new JButton("Hantar");
        
        // size and position
        int nombor = 60;
        
        label1.setBounds(50, nombor-40, 400, 30);
        
        teks1.setBounds(300, nombor, 300, 30);  label2.setBounds(50, nombor, 400, 30);
        teks3.setBounds(300, nombor+40, 300, 30); label5.setBounds(50, nombor+40, 400, 30);
        teks2.setBounds(300, nombor+80, 300, 30); label3.setBounds(50, nombor+80, 400, 30);
        statusListScrollPane.setBounds(300, nombor+120, 300, 30);  label4.setBounds(50, nombor+120, 400, 30);
        teks4.setBounds(300, nombor+160, 300, 30); label6.setBounds(50, nombor+160, 400, 30);
        teks5.setBounds(300, nombor+200, 300, 30); label7.setBounds(50, nombor+200, 400, 30);
        teks6.setBounds(300, nombor+240, 300, 30); label8.setBounds(50, nombor+240, 400, 30);
        teks7.setBounds(300, nombor+280, 300, 30); label9.setBounds(50, nombor+280, 400, 30);
        teks8.setBounds(300, nombor+320, 300, 30); label10.setBounds(50, nombor+320, 300, 30);
        teks9.setBounds(300, nombor+360, 300, 30); label11.setBounds(50, nombor+360, 300, 30);
        teks10.setBounds(300, nombor+400, 300, 30);    label12.setBounds(50, nombor+400, 300, 30);
        teks11.setBounds(300, nombor+440, 300, 30);    label13.setBounds(50, nombor+440, 300, 30);
        teks12.setBounds(300, nombor+480, 300, 30);    label14.setBounds(50, nombor+480, 300, 30);
        statusListScrollPane2.setBounds(300, nombor+520, 300, 30); label15.setBounds(50, nombor+520, 300, 30);
        butang.setBounds(250, nombor+570, 100, 30);
        
        add(label1);
        
        add(label2);    add(teks1);
        add(label3);    add(teks2);
        add(label5);    add(teks3);
        add(label4);    add(statusListScrollPane);
        add(label6);    add(teks4);
        add(label7);    add(teks5);
        add(label8);    add(teks6);
        add(label9);    add(teks7);
        add(label10);   add(teks8);
        add(label11);   add(teks9);
        add(label12);   add(teks10);
        add(label13);   add(teks11);
        add(label14);   add(teks12);
        add(label15);    add(statusListScrollPane2);
        add(butang);    butang.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent se) {
        cubaHantar();
    }

public boolean checkIntConnection()
    {
        boolean status = false; Socket sock = new Socket(); InetSocketAddress address = new InetSocketAddress("www.google.com", 80);
        try {   sock.connect(address, 3000); if(sock.isConnected())   {   status=true;    } }
        catch(Exception e)  {   }
        finally {   try {   sock.close();   }   catch(Exception e)  {   }   }
        return status;
    }
    
    public void cubaHantar(){
        JFrame F1 = new JFrame();
        JLabel  L0, L1;
        String STR1 = teks1.getText();
        String STR2 = statusNegeri.getSelectedItem().toString();
        boolean internetStatus = checkIntConnection();
        
        int nomb = 50;
        JLabel L, L_nama, L_BD, L_IC, L_SK, L_HP, L_R, L_P, L_nama_ak, L_no_ak, L_email, L_surat, L_poskod, L_bandar, L_negeri;
        String nama = teks1.getText().toUpperCase();  String BD = teks3.getText();    String IC = teks2.getText();    String SK = statusCombo.getSelectedItem().toString().toUpperCase();
        String HP = teks4.getText();    String R = teks5.getText(); String P = teks6.getText().toUpperCase(); String AB = teks7.getText().toUpperCase();
        String NAB = teks8.getText();   String E = teks9.getText().toUpperCase(); String S = teks10.getText().toUpperCase();    String Pos = teks11.getText();
        String B = teks12.getText().toUpperCase();    String N = statusNegeri.getSelectedItem().toString().toUpperCase();
        
        if (nama.trim().isEmpty() ||
                BD.trim().isEmpty() ||
                IC.trim().isEmpty() ||
                SK.trim().isEmpty() ||
                HP.trim().isEmpty() ||
                R.trim().isEmpty() ||
                P.trim().isEmpty() ||
                AB.trim().isEmpty() ||
                NAB.trim().isEmpty() ||
                E.trim().isEmpty() ||
                S.trim().isEmpty() ||
                Pos.trim().isEmpty() ||
                B.trim().isEmpty() ||
                N.trim().isEmpty()
                ) {
            F1.setTitle("RALAT");
            F1.setVisible(true);
            F1.setBounds(200, 200, 280, 80);
            F1.setLayout(null);
            L = new JLabel();
            L.setBounds(10, 10, 250, 30);
            L.setText("SILA ISI SEMUA TEMPAT KOSONG !");
            L.setForeground(Color.red);
            F1.add(L);
        }
        else {
            if (internetStatus == true) {
                F1.setTitle("Permohonan BR1M berjaya dihantar !");   
                F1.setVisible(true);
                F1.setSize(500, 600);
                F1.setLayout(null);
                
                L = new JLabel();   L.setText("Permohonan BR1M berjaya dihantar !"); L.setBounds(60, nomb-30, 800, 30); L.setForeground(Color.GREEN); L.setFont(new Font("Arial", Font.BOLD, 20));
                L_nama = new JLabel("Nama: ");  L_nama.setText("Nama: " +nama);  L_nama.setBounds(60, nomb, 400, 30);
                L_BD = new JLabel("Tarikh Lahir: ");    L_BD.setText("Tarikh Lahir: " +BD); L_BD.setBounds(60, nomb+30, 400, 30);
                L_IC = new JLabel("No. MyKad: ");   L_IC.setText("No. MyKad: " +IC); L_IC.setBounds(60, nomb+60, 400, 30);
                L_SK = new JLabel("Status Perkahwinan: ");  L_SK.setText("Status Perkahwinan: " +SK);   L_SK.setBounds(60, nomb+90, 400, 30);
                L_HP = new JLabel("No. Telefon Bimbit: ");  L_HP.setText("No. Telefon Bimbit: " +HP);   L_HP.setBounds(60, nomb+120, 400, 30);
                L_R = new JLabel("No. Telefon Rumah: ");    L_R.setText("No. Telefon Rumah: " +R);  L_R.setBounds(60, nomb+150, 400, 30);
                L_P = new JLabel("Pekerjaan: ");    L_P.setText("Pekerjaan: " +P);  L_P.setBounds(60, nomb+180, 400, 30);
                L_nama_ak = new JLabel("Nama Bank: ");  L_nama_ak.setText("Nama Bank: " +AB);   L_nama_ak.setBounds(60, nomb+210, 400, 30);
                L_no_ak = new JLabel("No. Akaun Bank: ");   L_no_ak.setText("No. Akaun Bank: " +NAB);   L_no_ak.setBounds(60, nomb+240, 400, 30);
                L_email = new JLabel("Alamat Email: "); L_email.setText("Alamat Email: " +E); L_email.setBounds(60, nomb+270, 400, 30);
                L_surat = new JLabel("Alamat surat menyurat (terkini): " +S);  L_surat.setText("Alamat surat menyurat (terkini): " +Pos);  L_surat.setBounds(60, nomb+300, 400, 30);
                L_poskod = new JLabel("Poskod: ");  L_poskod.setText("Poskod: " +Pos); L_poskod.setBounds(60, nomb+330, 400, 30);
                L_bandar = new JLabel("Bandar/Daerah: ");   L_bandar.setText("Bandar/Daerah: " +B);    L_bandar.setBounds(60, nomb+360, 400, 30);
                L_negeri = new JLabel("Negeri: ");  L_negeri.setText("Negeri: " +N);
                
                F1.add(L);
                F1.add(L_nama); F1.add(L_BD);   F1.add(L_IC);   F1.add(L_SK);   F1.add(L_HP);
                F1.add(L_R);    F1.add(L_P);    F1.add(L_nama_ak);  F1.add(L_no_ak);    F1.add(L_email);
                F1.add(L_surat);    F1.add(L_poskod);   F1.add(L_bandar);   F1.add(L_negeri);
            }
            else {
                F1.setTitle("RALAT");
                F1.setVisible(true);
                F1.setBounds(200, 200, 450, 80);
                F1.setLayout(null);
                F1.setResizable(false);
                L = new JLabel();
                L.setBounds(10, 10, 450, 30);
                L.setText("SILA PASTIKAN ANDA MEMPUNYAI SAMBUNGAN INTERNET");
                L.setForeground(Color.red);
                F1.add(L);
            }
        }
    }
}

public class BR1M2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new cuba("Aplikasi Atas Talian BR1M");
    }
    
}
