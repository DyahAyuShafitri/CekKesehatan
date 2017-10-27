/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cekkesehatan;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

/**
 *
 * @author Dyah Ayu Shafitri
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private RadioButton rdlaki;
    @FXML
    private ToggleGroup pilihan;
    @FXML
    private RadioButton rdpr;
    @FXML
    private JFXTextField nama;
    @FXML
    private JFXTextField bb;
    @FXML
    private JFXTextField tb;
    @FXML
    private JFXTextField ideal;
    @FXML
    private JFXTextArea hasil;
    @FXML
    private JFXTextArea saran;
    @FXML
    private JFXButton proses;
    @FXML
    private JFXButton reset;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Proses(ActionEvent event) {
       
        String Nama = nama.getText();
        int BeratBadan = Integer.parseInt(bb.getText());
        int TinggiBadan = Integer.parseInt(tb.getText());
        String JenisKelamin;
        int ideals = TinggiBadan - 105;
        int idealp = TinggiBadan - 110;
         String Saran= saran.getText();
        if (rdlaki.isSelected()){
            JenisKelamin="Laki-Laki";
            if (ideals == BeratBadan){
                ideal.setText(" "+ideals);
                Saran="\n ok sipp";
            }
            else if (ideals > BeratBadan){
                ideal.setText(" "+ideals);
                Saran="\n makan yang sedikit";
            }
            else if (ideals < BeratBadan){
                ideal.setText(" "+ideals);
                Saran="\n makan yang banyak";
            }
        }
        else if (rdpr.isSelected()){
            JenisKelamin="Perempuan";
            if (idealp == BeratBadan){
                ideal.setText(" "+idealp);
                Saran="\n ok sipp";
            }
            else if (idealp > BeratBadan){
                ideal.setText(" "+idealp);
                Saran="\n makan yang sedikit";
            }
            else if (idealp < BeratBadan){
                ideal.setText(" "+idealp);
                Saran="\n makan yang banyak";
            }        
        }
        else{
            JenisKelamin="Uknown";
        }
         hasil.setText("Nama : "+Nama+"\n Berat Badan : "+BeratBadan+"\n Tinggi Badan : "+TinggiBadan+"\n Jenis Kelamin : "+JenisKelamin+"");
         saran.setText(" "+Saran);
    }
        
      
    @FXML
    private void Reset(ActionEvent event) {
         hasil.setText(" ");
        nama.setText(" ");
        bb.setText(" ");
        tb.setText(" ");
        ideal.setText(" ");
        rdlaki.setSelected(false);
       rdpr.setSelected(false);
       hasil.setText(" ");
       saran.setText(" ");
    }
    
}
