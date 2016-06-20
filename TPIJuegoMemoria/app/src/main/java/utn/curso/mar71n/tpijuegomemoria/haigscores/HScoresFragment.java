package utn.curso.mar71n.tpijuegomemoria.haigscores;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import utn.curso.mar71n.tpijuegomemoria.R;

/**
 * Created by android on 31/05/16.
 */
public class HScoresFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle
            savedInstanceState) {

        // Creamos la View para este fragment y la devolvemos
        ViewGroup rootView = (ViewGroup)
                inflater.inflate(R.layout.layout_hscores,
                        container, false);

        // Cargamos la View con contenido, seteamos listeners, etc.
        //...
        Log.d("fragmet HS","PASO!!!");

        HScoresDBHelper hsdbHelper = new HScoresDBHelper(this.getActivity());
        ArrayList<HaighScores> haighScores = hsdbHelper.getAll();

        for(HaighScores hs : haighScores){
            Log.d("HS", "id : " + hs.getId() + " tiempo : " + hs.getTiempo() + " nombre : " + hs.getNombre());
        }

        return rootView;
    }
}