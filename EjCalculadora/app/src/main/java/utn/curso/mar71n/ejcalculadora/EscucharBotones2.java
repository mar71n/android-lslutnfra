package utn.curso.mar71n.ejcalculadora;

import android.view.View;
import android.widget.TextView;

/**
 * Created by Usuario on 16/4/2016.
 */
public class EscucharBotones2 implements View.OnClickListener {
    TextView txtdisplay;
    TextView txtcalculado;
    int[] lidbotones;
    Calculadorita2 calcu;
    boolean calculando = true;
    public EscucharBotones2(TextView display, TextView calculadora, int[] lidBotones) {
        txtdisplay  = display;
        txtcalculado = calculadora;
        lidbotones = lidBotones;
        calcu = new Calculadorita2();
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == lidbotones[0] && calculando){
            txtdisplay.setText(txtdisplay.getText()+"0");
        }
        if(v.getId() == lidbotones[1] && calculando){
            txtdisplay.setText(txtdisplay.getText()+"1");
        }
        if(v.getId() == lidbotones[2] && calculando){
            txtdisplay.setText(txtdisplay.getText()+"2");
        }
        if(v.getId() == lidbotones[3] && calculando){
            txtdisplay.setText(txtdisplay.getText()+"3");
        }
        if(v.getId() == lidbotones[4] && calculando){
            txtdisplay.setText(txtdisplay.getText()+"4");
        }
        if(v.getId() == lidbotones[5] && calculando){
            txtdisplay.setText(txtdisplay.getText()+"5");
        }
        if(v.getId() == lidbotones[6] && calculando){
            txtdisplay.setText(txtdisplay.getText()+"6");
        }
        if(v.getId() == lidbotones[7] && calculando){
            txtdisplay.setText(txtdisplay.getText()+"7");
        }
        if(v.getId() == lidbotones[8] && calculando){
            txtdisplay.setText(txtdisplay.getText()+"8");
        }
        if(v.getId() == lidbotones[9] && calculando){
            txtdisplay.setText(txtdisplay.getText()+"9");
        }
        if(v.getId() == lidbotones[10] && calculando){// +
            //calcu.ingresar(txtdisplay.getText().toString());
            calcu.ingresar(txtdisplay.getText().toString(), "+");
            txtdisplay.setText("0");
            txtcalculado.setText(calcu.toString());
        }
        if(v.getId() == lidbotones[11] && calculando){// -
            //calcu.ingresar(txtdisplay.getText().toString());
            calcu.ingresar(txtdisplay.getText().toString(),"-");
            txtdisplay.setText("0");
            txtcalculado.setText(calcu.toString());
        }
        if(v.getId() == lidbotones[12] && calculando){// *
            //calcu.ingresar(txtdisplay.getText().toString());
            calcu.ingresar(txtdisplay.getText().toString(),"*");
            txtdisplay.setText("0");
            txtcalculado.setText(calcu.toString());
        }
        if(v.getId() == lidbotones[13] && calculando){// /
            //calcu.ingresar(txtdisplay.getText().toString());
            calcu.ingresar(txtdisplay.getText().toString(),"/");
            txtdisplay.setText("0");
            txtcalculado.setText(calcu.toString());
        }
        if(v.getId() == lidbotones[14] && calculando){// =
            calcu.ingresar(txtdisplay.getText().toString(),"=");
            calculando = false;
            txtdisplay.setText("0");
            txtcalculado.setText(calcu.toString());
            //txtcalculado.setText(" ");
        }
        if(v.getId() == lidbotones[15]){// C
            calcu.limpiar();
            //calcu.espero = "a";
            txtdisplay.setText("0");
            calculando = true;
        }
        txtcalculado.setText(calcu.toString());
    }
}
