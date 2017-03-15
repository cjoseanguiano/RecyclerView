package com.devix.recyclerview;
/*
 *Created by Carlos Anguiano on 14/03/17.
 *For more info contact : c.joseanguiano@gmail.com
 */

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

class CubeAdapter extends RecyclerView.Adapter<CubeAdapter.CubeViewHolder> {
    /*  public CubeAdapter(List<Cube> cubeList) {
      }*/
    private List<Cube> cubeList;

    public static class CubeViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageView;
        public TextView nombre;

        public CubeViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.imageOne);
            nombre = (TextView) itemView.findViewById(R.id.txtNombreOne);
        }
    }

    public CubeAdapter(List<Cube> cubeList) {
        this.cubeList = cubeList;
    }

    @Override
    public CubeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cube_card, parent, false);
        return new CubeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CubeViewHolder holder, int position) {
        holder.imageView.setImageResource(cubeList.get(position).getImagen());
        holder.nombre.setText(cubeList.get(position).getNombre());
    }

    @Override
    public int getItemCount() {
        return cubeList.size();
    }
}
