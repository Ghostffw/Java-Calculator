import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Calculadora {

    String somaL = "";
    long soma = 0;
    String opera = "";
    long somaAnt = 0;
    long total = 0;

    @FXML
    private Button numero0;

    @FXML
    private Button numero1;

    @FXML
    private Button numero2;

    @FXML
    private Button numero3;

    @FXML
    private Label display;

    @FXML
    private Button numero8;

    @FXML
    private Button numero9;

    @FXML
    private Button numero4;

    @FXML
    private Button numero5;

    @FXML
    private Button numero6;

    @FXML
    private Button numero7;

    @FXML
    private Button mais;

    @FXML
    private Button igual;

    @FXML
    private Button menos;

    @FXML
    private Button multi;

    @FXML
    private Button divi;

    @FXML
    private Button clear;

    @FXML
    private Button raiz;

    @FXML
    private Label aviso;

    @FXML
    void N7(ActionEvent event) {
        display.setText(numero7.getText());
        somaL = somaL + display.getText();
        display.setText(somaL);
    }

    @FXML
    void N8(ActionEvent event) {
        display.setText(numero8.getText());
        somaL = somaL + display.getText();
        display.setText(somaL);
    }

    @FXML
    void N9(ActionEvent event) {
        display.setText(numero9.getText());
        somaL = somaL + display.getText();
        display.setText(somaL);
    }

    @FXML
    void N4(ActionEvent event) {
        display.setText(numero4.getText());
        somaL = somaL + display.getText();
        display.setText(somaL);
    }

    @FXML
    void N5(ActionEvent event) {
        display.setText(numero5.getText());
        somaL = somaL + display.getText();
        display.setText(somaL);
    }

    @FXML
    void N6(ActionEvent event) {
        display.setText(numero6.getText());
        somaL = somaL + display.getText();
        display.setText(somaL);
    }

    @FXML
    void N1(ActionEvent event) {
        display.setText(numero1.getText());
        somaL = somaL + display.getText();
        display.setText(somaL);
    }

    @FXML
    void N2(ActionEvent event) {
        display.setText(numero2.getText());
        somaL = somaL + display.getText();
        display.setText(somaL);
    }

    @FXML
    void N3(ActionEvent event) {
        display.setText(numero3.getText());
        somaL = somaL + display.getText();
        display.setText(somaL);
    }

    @FXML
    void N0(ActionEvent event) {
        display.setText(numero0.getText());
        somaL = somaL + display.getText();
        display.setText(somaL);
    }

    @FXML
    void M(ActionEvent event) {
        soma = Long.parseLong(somaL);
        display.setText("");
        somaL = "";
        opera = "+";

    }

    @FXML
    void S(ActionEvent event) {
        soma = Long.parseLong(somaL);
        display.setText("");
        somaL = "";
        opera = "-";
    }

    @FXML
    void Mu(ActionEvent event) {
        soma = Long.parseLong(somaL);
        display.setText("");
        somaL = "";
        opera = "x";
    }

    
    @FXML
    void D(ActionEvent event) {
        soma = Long.parseLong(somaL);
        display.setText("");
        somaL = "";
        opera = "/";
    }

    @FXML
    void C(ActionEvent event) {
        display.setText("");
        somaL = "";
    }

    @FXML
    void SB(ActionEvent event) {
        display.setText("\u221A");
        opera = "raiz";
    }

    @FXML
    void I(ActionEvent event) {
        if (opera == "+") {
            long soma2 = Long.parseLong(somaL);
            total = soma + soma2;
            somaL = Long.toString(total);
            display.setText(Long.toString(total));

        }
        if (opera == "-") {
            long soma2 = Long.parseLong(somaL);
            total = soma - soma2;
            somaL = Long.toString(total);
            display.setText(Long.toString(total));
        }
        if (opera == "x") {
            long soma2 = Long.parseLong(somaL);
            total = soma * soma2;
            somaL = Long.toString(total);
            display.setText(Long.toString(total));
        }
        if (opera == "/") {
            long soma2 = Long.parseLong(somaL);
            total = soma / soma2;
            somaL = Long.toString(total);
            display.setText(Long.toString(total));
        }
        if (opera == "raiz") {
            long soma2 = Long.parseLong(somaL);
            float raiz = (float) Math.sqrt(soma2);
            display.setText(Float.toString(raiz));
            somaL = "";
        }
    }
}
