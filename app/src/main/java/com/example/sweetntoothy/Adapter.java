package com.example.sweetntoothy;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.itemViewHolder>{

    private final Model[] models;
    private final onClickInterface onclickinterface;

    public Adapter(Model[] models, onClickInterface onclickinterface) {
        this.models = models;
        this.onclickinterface = onclickinterface;
    }

    @NonNull
    public itemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item_layout, parent, false);

        return new itemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.itemViewHolder holder, int position) {
        holder.bind(models[position]);
    }

    @Override
    public int getItemCount() {
        return models.length;
    }

    class itemViewHolder extends RecyclerView.ViewHolder {

        TextView name, description, price;
        

        public itemViewHolder(View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.food_name);
            description = itemView.findViewById(R.id.food_description);
            price = itemView.findViewById(R.id.food_price);

        }

        public void bind(Model model){
            this.name.setText(model.name);
            this.description.setText(model.description);
            this.price.setText(String.valueOf("£" + model.price));

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION && onclickinterface != null){
                        onclickinterface.passdata(model);
                    }
                }
            });
        }
    }

}
