/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discotics;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

/**
 *
 * @author Michael Liondy
 */
public class FXMLDocumentController implements Initializable {

    private Label label;
    @FXML
    private ComboBox<Integer> pilihCombo;
    @FXML
    private Label lblKomp1;
    @FXML
    private Label lblKomp2;
    @FXML
    private Label lblKomp3;
    @FXML
    private Label lblKomp4;
    @FXML
    private Label lblKomp5;
    @FXML
    private Label lblKomp6;
    @FXML
    private ComboBox<String> jamCombo1;
    @FXML
    private ComboBox<String> menitCombo1;
    @FXML
    private ComboBox<String> jamCombo2;
    @FXML
    private ComboBox<String> menitCombo2;
    @FXML
    private ComboBox<String> jamCombo3;
    @FXML
    private ComboBox<String> menitCombo3;
    @FXML
    private ComboBox<String> jamCombo4;
    @FXML
    private ComboBox<String> menitCombo4;
    @FXML
    private ComboBox<String> jamCombo5;
    @FXML
    private ComboBox<String> menitCombo5;
    @FXML
    private ComboBox<String> jamCombo6;
    @FXML
    private ComboBox<String> menitCombo6;
    @FXML
    private Label lblOutput1;
    @FXML
    private Label lblOutput2;
    @FXML
    private Label lblOutput3;
    @FXML
    private Label lblOutput4;
    @FXML
    private Label lblOutput5;
    @FXML
    private Label lblOutput6;
    int[] color;
    int jam1;
    int menit1;
    int jam2;
    int menit2;
    int jam3;
    int menit3;
    int jam4;
    int menit4;
    int jam5;
    int menit5;
    int jam6;
    int menit6;
    @FXML
    private Button btnSubmit;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        pilihCombo.getItems().addAll(1, 2, 3, 4, 5, 6);
        lblKomp1.setText("");
        lblKomp2.setText("");
        lblKomp3.setText("");
        lblKomp4.setText("");
        lblKomp5.setText("");
        lblKomp6.setText("");
        jamCombo1.getItems().addAll("07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17");
        menitCombo1.getItems().addAll("00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59");
        jamCombo2.getItems().addAll("07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17");
        menitCombo2.getItems().addAll("00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59");
        jamCombo3.getItems().addAll("07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17");
        menitCombo3.getItems().addAll("00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59");
        jamCombo4.getItems().addAll("07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17");
        menitCombo4.getItems().addAll("00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59");
        jamCombo5.getItems().addAll("07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17");
        menitCombo5.getItems().addAll("00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59");
        jamCombo6.getItems().addAll("07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17");
        menitCombo6.getItems().addAll("00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59");
        jamCombo1.setVisible(false);
        menitCombo1.setVisible(false);
        jamCombo2.setVisible(false);
        menitCombo2.setVisible(false);
        jamCombo3.setVisible(false);
        menitCombo3.setVisible(false);
        jamCombo4.setVisible(false);
        menitCombo4.setVisible(false);
        jamCombo5.setVisible(false);
        menitCombo5.setVisible(false);
        jamCombo6.setVisible(false);
        menitCombo6.setVisible(false);
        lblOutput1.setText("");
        lblOutput2.setText("");
        lblOutput3.setText("");
        lblOutput4.setText("");
        lblOutput5.setText("");
        lblOutput6.setText("");
        lblOutput1.setVisible(false);
        lblOutput2.setVisible(false);
        lblOutput3.setVisible(false);
        lblOutput4.setVisible(false);
        lblOutput5.setVisible(false);
        lblOutput6.setVisible(false);
    }

    @FXML
    private void process(ActionEvent event) {
        int value = pilihCombo.getValue();
        switch (value) {
            case 1:
                lblKomp1.setText("Komputer 1 : ");
                lblKomp2.setText("");
                lblKomp3.setText("");
                lblKomp4.setText("");
                lblKomp5.setText("");
                lblKomp6.setText("");
                jamCombo1.setVisible(true);
                menitCombo1.setVisible(true);
                jamCombo2.setVisible(false);
                menitCombo2.setVisible(false);
                jamCombo3.setVisible(false);
                menitCombo3.setVisible(false);
                jamCombo4.setVisible(false);
                menitCombo4.setVisible(false);
                jamCombo5.setVisible(false);
                menitCombo5.setVisible(false);
                jamCombo6.setVisible(false);
                menitCombo6.setVisible(false);
                lblOutput1.setVisible(true);
                lblOutput2.setVisible(false);
                lblOutput3.setVisible(false);
                lblOutput4.setVisible(false);
                lblOutput5.setVisible(false);
                lblOutput6.setVisible(false);
                this.jam2 = -1;
                this.menit2 = -1;
                this.jam3 = -1;
                this.menit3 = -1;
                this.jam4 = -1;
                this.menit4 = -1;
                this.jam5 = -1;
                this.menit5 = -1;
                this.jam6 = -1;
                this.menit6 = -1;
                break;
            case 2:
                lblKomp1.setText("Komputer 1 : ");
                lblKomp2.setText("Komputer 2 : ");
                lblKomp3.setText("");
                lblKomp4.setText("");
                lblKomp5.setText("");
                lblKomp6.setText("");
                jamCombo1.setVisible(true);
                menitCombo1.setVisible(true);
                jamCombo2.setVisible(true);
                menitCombo2.setVisible(true);
                jamCombo3.setVisible(false);
                menitCombo3.setVisible(false);
                jamCombo4.setVisible(false);
                menitCombo4.setVisible(false);
                jamCombo5.setVisible(false);
                menitCombo5.setVisible(false);
                jamCombo6.setVisible(false);
                menitCombo6.setVisible(false);
                lblOutput1.setVisible(true);
                lblOutput2.setVisible(true);
                lblOutput3.setVisible(false);
                lblOutput4.setVisible(false);
                lblOutput5.setVisible(false);
                lblOutput6.setVisible(false);
                this.jam3 = -1;
                this.menit3 = -1;
                this.jam4 = -1;
                this.menit4 = -1;
                this.jam5 = -1;
                this.menit5 = -1;
                this.jam6 = -1;
                this.menit6 = -1;
                break;
            case 3:
                lblKomp1.setText("Komputer 1 : ");
                lblKomp2.setText("Komputer 2 : ");
                lblKomp3.setText("Komputer 3 : ");
                lblKomp4.setText("");
                lblKomp5.setText("");
                lblKomp6.setText("");
                jamCombo1.setVisible(true);
                menitCombo1.setVisible(true);
                jamCombo2.setVisible(true);
                menitCombo2.setVisible(true);
                jamCombo3.setVisible(true);
                menitCombo3.setVisible(true);
                jamCombo4.setVisible(false);
                menitCombo4.setVisible(false);
                jamCombo5.setVisible(false);
                menitCombo5.setVisible(false);
                jamCombo6.setVisible(false);
                menitCombo6.setVisible(false);
                lblOutput1.setVisible(true);
                lblOutput2.setVisible(true);
                lblOutput3.setVisible(true);
                lblOutput4.setVisible(false);
                lblOutput5.setVisible(false);
                lblOutput6.setVisible(false);
                this.jam4 = -1;
                this.menit4 = -1;
                this.jam5 = -1;
                this.menit5 = -1;
                this.jam6 = -1;
                this.menit6 = -1;
                break;
            case 4:
                lblKomp1.setText("Komputer 1 : ");
                lblKomp2.setText("Komputer 2 : ");
                lblKomp3.setText("Komputer 3 : ");
                lblKomp4.setText("Komputer 4 : ");
                lblKomp5.setText("");
                lblKomp6.setText("");
                jamCombo1.setVisible(true);
                menitCombo1.setVisible(true);
                jamCombo2.setVisible(true);
                menitCombo2.setVisible(true);
                jamCombo3.setVisible(true);
                menitCombo3.setVisible(true);
                jamCombo4.setVisible(true);
                menitCombo4.setVisible(true);
                jamCombo5.setVisible(false);
                menitCombo5.setVisible(false);
                jamCombo6.setVisible(false);
                menitCombo6.setVisible(false);
                lblOutput1.setVisible(true);
                lblOutput2.setVisible(true);
                lblOutput3.setVisible(true);
                lblOutput4.setVisible(true);
                lblOutput5.setVisible(false);
                lblOutput6.setVisible(false);
                this.jam5 = -1;
                this.menit5 = -1;
                this.jam6 = -1;
                this.menit6 = -1;
                break;
            case 5:
                lblKomp1.setText("Komputer 1 : ");
                lblKomp2.setText("Komputer 2 : ");
                lblKomp3.setText("Komputer 3 : ");
                lblKomp4.setText("Komputer 4 : ");
                lblKomp5.setText("Komputer 5 : ");
                lblKomp6.setText("");
                jamCombo1.setVisible(true);
                menitCombo1.setVisible(true);
                jamCombo2.setVisible(true);
                menitCombo2.setVisible(true);
                jamCombo3.setVisible(true);
                menitCombo3.setVisible(true);
                jamCombo4.setVisible(true);
                menitCombo4.setVisible(true);
                jamCombo5.setVisible(true);
                menitCombo5.setVisible(true);
                jamCombo6.setVisible(false);
                menitCombo6.setVisible(false);
                lblOutput1.setVisible(true);
                lblOutput2.setVisible(true);
                lblOutput3.setVisible(true);
                lblOutput4.setVisible(true);
                lblOutput5.setVisible(true);
                lblOutput6.setVisible(false);
                this.jam6 = -1;
                this.menit6 = -1;
                break;
            case 6:
                lblKomp1.setText("Komputer 1 : ");
                lblKomp2.setText("Komputer 2 : ");
                lblKomp3.setText("Komputer 3 : ");
                lblKomp4.setText("Komputer 4 : ");
                lblKomp5.setText("Komputer 5 : ");
                lblKomp6.setText("Komputer 6 : ");
                jamCombo1.setVisible(true);
                menitCombo1.setVisible(true);
                jamCombo2.setVisible(true);
                menitCombo2.setVisible(true);
                jamCombo3.setVisible(true);
                menitCombo3.setVisible(true);
                jamCombo4.setVisible(true);
                menitCombo4.setVisible(true);
                jamCombo5.setVisible(true);
                menitCombo5.setVisible(true);
                jamCombo6.setVisible(true);
                menitCombo6.setVisible(true);
                lblOutput1.setVisible(true);
                lblOutput2.setVisible(true);
                lblOutput3.setVisible(true);
                lblOutput4.setVisible(true);
                lblOutput5.setVisible(true);
                lblOutput6.setVisible(true);
                break;
            default:
                break;
        }
    }

    @FXML
    private void prosesJam1(ActionEvent event) {
        String jam1 = jamCombo1.getValue();
        int jamm1;
        if (jam1.charAt(0) == '0') {
            jamm1 = jam1.charAt(1) - '0';
        } else {
            jamm1 = ((jam1.charAt(0) - '0') * 10) + (jam1.charAt(1) - '0');
        }
        this.jam1 = jamm1;
    }

    @FXML
    private void prosesMenit1(ActionEvent event) {
        String menit1 = menitCombo1.getValue();
        int mennit1 = 0;
        if (menit1.charAt(0) == '0') {
            mennit1 = menit1.charAt(1) - '0';
        } else {
            mennit1 = ((menit1.charAt(0) - '0') * 10) + (menit1.charAt(1) - '0');
        }
        this.menit1 = mennit1;
    }

    @FXML
    private void prosesJam2(ActionEvent event) {
        String jam2 = jamCombo2.getValue();
        int jamm2 = 0;
        if (jam2.charAt(0) == '0') {
            jamm2 = jam2.charAt(1) - '0';
        } else {
            jamm2 = ((jam2.charAt(0) - '0') * 10) + (jam2.charAt(1) - '0');
        }
        this.jam2 = jamm2;
    }

    @FXML
    private void prosesMenit2(ActionEvent event) {
        String menit2 = menitCombo2.getValue();
        int mennit2 = 0;
        if (menit2.charAt(0) == '0') {
            mennit2 = menit2.charAt(1) - '0';
        } else {
            mennit2 = ((menit2.charAt(0) - '0') * 10) + (menit2.charAt(1) - '0');
        }
        this.menit2 = mennit2;
    }

    @FXML
    private void prosesJam3(ActionEvent event) {
        String jam3 = jamCombo3.getValue();
        int jamm3 = 0;
        if (jam3.charAt(0) == '0') {
            jamm3 = jam3.charAt(1) - '0';
        } else {
            jamm3 = ((jam3.charAt(0) - '0') * 10) + (jam3.charAt(1) - '0');
        }
        this.jam3 = jamm3;
    }

    @FXML
    private void prosesMenit3(ActionEvent event) {
        String menit3 = menitCombo3.getValue();
        int mennit3 = 0;
        if (menit3.charAt(0) == '0') {
            mennit3 = menit3.charAt(1) - '0';
        } else {
            mennit3 = ((menit3.charAt(0) - '0') * 10) + (menit3.charAt(1) - '0');
        }
        this.menit3 = mennit3;
    }

    @FXML
    private void prosesJam4(ActionEvent event) {
        String jam4 = jamCombo4.getValue();
        int jamm4 = 0;
        if (jam4.charAt(0) == '0') {
            jamm4 = jam4.charAt(1) - '0';
        } else {
            jamm4 = ((jam4.charAt(0) - '0') * 10) + (jam4.charAt(1) - '0');
        }
        this.jam4 = jamm4;
    }

    @FXML
    private void prosesMenit4(ActionEvent event) {
        String menit4 = menitCombo4.getValue();
        int mennit4 = 0;
        if (menit4.charAt(0) == '0') {
            mennit4 = menit4.charAt(1) - '0';
        } else {
            mennit4 = ((menit4.charAt(0) - '0') * 10) + (menit4.charAt(1) - '0');
        }
        this.menit4 = mennit4;
    }

    @FXML
    private void prosesJam5(ActionEvent event) {
        String jam5 = jamCombo5.getValue();
        int jamm5 = 0;
        if (jam5.charAt(0) == '0') {
            jamm5 = jam5.charAt(1) - '0';
        } else {
            jamm5 = ((jam5.charAt(0) - '0') * 10) + (jam5.charAt(1) - '0');
        }
        this.jam5 = jamm5;
    }

    @FXML
    private void prosesMenit5(ActionEvent event) {
        String menit5 = menitCombo5.getValue();
        int mennit5 = 0;
        if (menit5.charAt(0) == '0') {
            mennit5 = menit5.charAt(1) - '0';
        } else {
            mennit5 = ((menit5.charAt(0) - '0') * 10) + (menit5.charAt(1) - '0');
        }
        this.menit5 = mennit5;
    }

    @FXML
    private void prosesJam6(ActionEvent event) {
        String jam6 = jamCombo6.getValue();
        int jamm6 = 0;
        if (jam6.charAt(0) == '0') {
            jamm6 = jam6.charAt(1) - '0';
        } else {
            jamm6 = ((jam6.charAt(0) - '0') * 10) + (jam6.charAt(1) - '0');
        }
        this.jam6 = jamm6;
    }

    @FXML
    private void prosesMenit6(ActionEvent event) {
        String menit6 = menitCombo6.getValue();
        int mennit6 = 0;
        if (menit6.charAt(0) == '0') {
            mennit6 = menit6.charAt(1) - '0';
        } else {
            mennit6 = ((menit6.charAt(0) - '0') * 10) + (menit6.charAt(1) - '0');
        }
        this.menit6 = mennit6;
    }

    @FXML
    private void submit(ActionEvent event) {
        int start1 = this.jam1 * 60 + this.menit1;
        int start2 = this.jam2 * 60 + this.menit2;
        int start3 = this.jam3 * 60 + this.menit3;
        int start4 = this.jam4 * 60 + this.menit4;
        int start5 = this.jam5 * 60 + this.menit5;
        int start6 = this.jam6 * 60 + this.menit6;
        int end1 = start1 + 10;
        int end2 = start2 + 10;
        int end3 = start3 + 10;
        int end4 = start4 + 10;
        int end5 = start5 + 10;
        int end6 = start6 + 10;
        Computer c1 = new Computer(start1, end1);
        Computer c2 = new Computer(start2, end2);
        Computer c3 = new Computer(start3, end3);
        Computer c4 = new Computer(start4, end4);
        Computer c5 = new Computer(start5, end5);
        Computer c6 = new Computer(start6, end6);
        Graph g = new Graph(this.pilihCombo.getValue());
        Computer[] array = new Computer[this.pilihCombo.getValue()];
        this.color = new int[this.pilihCombo.getValue()];
        switch (this.pilihCombo.getValue()) {
            case 1:
                array[0] = c1;
                break;
            case 2:
                array[0] = c1;
                array[1] = c2;
                break;
            case 3:
                array[0] = c1;
                array[1] = c2;
                array[2] = c3;
                break;
            case 4:
                array[0] = c1;
                array[1] = c2;
                array[2] = c3;
                array[3] = c4;
                break;
            case 5:
                array[0] = c1;
                array[1] = c2;
                array[2] = c3;
                array[3] = c4;
                array[4] = c5;
                break;
            default:
                array[0] = c1;
                array[1] = c2;
                array[2] = c3;
                array[3] = c4;
                array[4] = c5;
                array[5] = c6;
                break;
        }
        for (int i = 0; i < this.pilihCombo.getValue() - 1; i++) {
            for (int j = i + 1; j < this.pilihCombo.getValue(); j++) {
                if (array[j].getStart() >= array[i].getStart()) {
                    if (array[j].getStart() < array[i].getEnd()) {
                        g.addEdge(i, j);
                    }
                } else {
                    if ((array[j].getEnd() > array[i].getStart()) && (array[j].getEnd() < array[i].getEnd())) {
                        g.addEdge(i, j);
                    }
                }
            }
        }
        g.greedyColoring();
        this.color = g.getHasil();
        switch (this.pilihCombo.getValue()) {
            case 1:
                lblOutput1.setText("Komputer 1 di printer " + (char) (this.color[0] + 65));
                lblOutput2.setText("");
                lblOutput3.setText("");
                lblOutput4.setText("");
                lblOutput5.setText("");
                lblOutput6.setText("");
                break;
            case 2:
                lblOutput1.setText("Komputer 1 di printer " + (char) (this.color[0] + 65));
                lblOutput2.setText("Komputer 2 di printer " + (char) (this.color[1] + 65));
                lblOutput3.setText("");
                lblOutput4.setText("");
                lblOutput5.setText("");
                lblOutput6.setText("");
                break;
            case 3:
                lblOutput1.setText("Komputer 1 di printer " + (char) (this.color[0] + 65));
                lblOutput2.setText("Komputer 2 di printer " + (char) (this.color[1] + 65));
                lblOutput3.setText("Komputer 3 di printer " + (char) (this.color[2] + 65));
                lblOutput4.setText("");
                lblOutput5.setText("");
                lblOutput6.setText("");
                break;
            case 4:
                lblOutput1.setText("Komputer 1 di printer " + (char) (this.color[0] + 65));
                lblOutput2.setText("Komputer 2 di printer " + (char) (this.color[1] + 65));
                lblOutput3.setText("Komputer 3 di printer " + (char) (this.color[2] + 65));
                lblOutput4.setText("Komputer 4 di printer " + (char) (this.color[3] + 65));
                lblOutput5.setText("");
                lblOutput6.setText("");
                break;
            case 5:
                lblOutput1.setText("Komputer 1 di printer " + (char) (this.color[0] + 65));
                lblOutput2.setText("Komputer 2 di printer " + (char) (this.color[1] + 65));
                lblOutput3.setText("Komputer 3 di printer " + (char) (this.color[2] + 65));
                lblOutput4.setText("Komputer 4 di printer " + (char) (this.color[3] + 65));
                lblOutput5.setText("Komputer 5 di printer " + (char) (this.color[4] + 65));
                lblOutput6.setText("");
                break;
            default:
                lblOutput1.setText("Komputer 1 di printer " + (char) (this.color[0] + 65));
                lblOutput2.setText("Komputer 2 di printer " + (char) (this.color[1] + 65));
                lblOutput3.setText("Komputer 3 di printer " + (char) (this.color[2] + 65));
                lblOutput4.setText("Komputer 4 di printer " + (char) (this.color[3] + 65));
                lblOutput5.setText("Komputer 5 di printer " + (char) (this.color[4] + 65));
                lblOutput6.setText("Komputer 6 di printer " + (char) (this.color[5] + 65));
                break;
        }
    }

    @FXML
    private void close(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void about(ActionEvent event) throws IOException {
        Discotics.rootPane.getChildren().removeAll(FrmAboutController.documentPane);
        Discotics.rootPane.getChildren().addAll(Discotics.aboutPane);
    }
}

class Computer {

    private int start;
    private int end;

    public Computer(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return this.start;
    }

    public int getEnd() {
        return this.end;
    }
}

class Graph {

    private int vertex;
    private LinkedList<Integer> adj[];
    private int[] hasil;

    public Graph(int vertex) {
        this.vertex = vertex;
        adj = new LinkedList[vertex];
        for (int i = 0; i < vertex; ++i) {
            adj[i] = new LinkedList();
        }
        hasil = new int[vertex];
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
    }

    public void greedyColoring() {
        int result[] = new int[vertex];
        Arrays.fill(result, -1);
        result[0] = 0;
        boolean available[] = new boolean[vertex];
        Arrays.fill(available, true);
        for (int i = 1; i < vertex; i++) {
            Iterator<Integer> it = adj[i].iterator();
            while (it.hasNext()) {
                int j = it.next();
                if (result[j] != -1) {
                    available[result[j]] = false;
                }
            }
            int color;
            for (color = 0; color < vertex; color++) {
                if (available[color]) {
                    break;
                }
            }
            result[i] = color;
            Arrays.fill(available, true);
        }
        System.arraycopy(result, 0, hasil, 0, vertex);
    }

    public int[] getHasil() {
        return this.hasil;
    }
}
