package com.biodata;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class biodata {

    private JPanel panelutama;
    private JLabel namaMhs;
    private JLabel judul;
    private JTextField inptnpm;
    private JButton proses;
    private JTextField inptnama;
    private JLabel npm;
    private JLabel jurusan;
    private JLabel alamat;
    private JTextField inptjurusan;
    private JTextField inptalamat;
    private JTextArea hasil;
    private JButton reset;

    public biodata() {
        proses.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //Mengambil data Inputan
                inptnpm.setText(inptnpm.getText());
                inptnama.setText(inptnama.getText());
                inptjurusan.setText(inptjurusan.getText());
                inptalamat.setText(inptalamat.getText());

                //Menampilkan hasil ke textarea
                hasil.setText("NPM\t = " + inptnpm.getText()
                             +"\n Nama Mahasiswa\t = " + inptnama.getText()
                             +"\n Jurusan\t = " + inptjurusan.getText()
                             +"\n Alamat\t = " + inptalamat.getText());

                inptnpm.setEnabled(false);
                inptnama.setEnabled(false);
                inptjurusan.setEnabled(false);
                inptalamat.setEnabled(false);


            }
        });
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                inptnpm.setText(inptnpm.getText());
                inptnama.setText(inptnama.getText());
                inptjurusan.setText(inptjurusan.getText());
                inptalamat.setText(inptalamat.getText());

                //Menampilkan hasil ke textarea
                hasil.setText("");

                inptnpm.setEnabled(true);
                inptnama.setEnabled(true);
                inptjurusan.setEnabled(true);
                inptalamat.setEnabled(true);

            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public static void main(String[] args) {
        JFrame elton = new JFrame("biodata");
        elton.setContentPane(new biodata() .panelutama);
        elton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        elton.pack();
        elton.setVisible(true);
    }
}
