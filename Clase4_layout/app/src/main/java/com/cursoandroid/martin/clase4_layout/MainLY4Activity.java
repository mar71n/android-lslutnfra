package com.cursoandroid.martin.clase4_layout;

import android.content.pm.LabeledIntent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainLY4Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.otrolayout);

        List<String> lista = new ArrayList<>();
        Log.d("activity", "tamannio:" + lista.size());
        lista.add("opcion 1");
        lista.add("opcion 2");
        lista.add("opcion 3");
        lista.add("opcion 4");
        lista.add("opcion 5");
        Log.d("activity", "tamannio:" + lista.size());
        lista.remove(1);
        Log.d("activity", "tamannio:" + lista.size());

        for (String a:lista) {
            Log.d("activity",a);
        }

        Spinner spinner = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item, lista);
        // lo agrega a lista ya que la pasa por referencia
        adapter.add("agregado x adapter");
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Log.d("activity spiner : ", String.valueOf(position));
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
