package uninorte.semana5;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Laboratorio on 13/03/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.myViewHolder>{

    private ArrayList<Fichas> list;
    private LayoutInflater inflater;
    private Context context;

    public RecyclerAdapter(Context context, ArrayList<Fichas> data){
        this.list = data;
        inflater = LayoutInflater.from(context);
        this.context= context;
    }


    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.row,parent,false);
        myViewHolder holder = new myViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(myViewHolder holder, int position) {
        Fichas temp = list.get(position);
        holder.tvTitulo.setText(temp.getTitulo());
    }

    @Override
    public int getItemCount() {
        return 0;
    }



    @Override
    class myViewHolder extends RecyclerView.ViewHolder{


        private TextView tvTitulo;
        private TextView tvFecha;
        private Button btn;

        public myViewHolder(View itemView) {
            super(itemView);

            tvTitulo= (TextView) itemView.findViewById(R.id.tvTitulo);
            tvFecha= (TextView) itemView.findViewById(R.id.tvTitulo);
            btn= (Button) itemView.findViewById(R.id.button);




        }
    }
}
