package utn.curso.mar71n.tpijuegomemoria.tablero;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import utn.curso.mar71n.tpijuegomemoria.R;
import utn.curso.mar71n.tpijuegomemoria.tablero.entidades.OnFichaClick;

public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    ImageView img;
    int position;
    private OnFichaClick listener;


    public MyViewHolder(View itemView, OnFichaClick listener) {  // recibir listener
        super(itemView);
        this.listener = listener;
        img = (ImageView) itemView.findViewById(R.id.icon);

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // llamar a metodo de listener, pasando la posicion

        listener.clickEnFicha(position);
    }

    public void setPosition(int position){
        this.position = position;
    }
}
