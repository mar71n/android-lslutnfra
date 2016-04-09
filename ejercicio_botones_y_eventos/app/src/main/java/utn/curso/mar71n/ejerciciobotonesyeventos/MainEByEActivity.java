package utn.curso.mar71n.ejerciciobotonesyeventos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainEByEActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_eby_e);

        EditText etxt = (EditText) findViewById(R.id.editTextMsg);
        TextView tvmsg = (TextView) findViewById(R.id.tVmensaje);
        ListenerBotones lBotones = new ListenerBotones(tvmsg,etxt);
        Button btmandar = (Button)findViewById(R.id.bMandar);
        btmandar.setOnClickListener(lBotones);
    }
}
