package com.blogspot.arifrohmadi.hurufhijaiyah.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.blogspot.arifrohmadi.hurufhijaiyah.About;
import com.blogspot.arifrohmadi.hurufhijaiyah.Detail;
import com.blogspot.arifrohmadi.hurufhijaiyah.MainActivity;
import com.blogspot.arifrohmadi.hurufhijaiyah.R;
import com.blogspot.arifrohmadi.hurufhijaiyah.model.Huruf;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListHurufAdapter extends RecyclerView.Adapter<ListHurufAdapter.ListViewHolder> {
    private ArrayList<Huruf> listHuruf;
    public ListHurufAdapter(ArrayList<Huruf> list) {
        this.listHuruf = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_huruf,viewGroup,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Huruf huruf = listHuruf.get(position);
        Glide.with(holder.itemView.getContext())
                .load(huruf.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);
        holder.tvName.setText(huruf.getName());
        holder.tvDetail.setText(huruf.getDetail());
    }

    @Override
    public int getItemCount() {
        return listHuruf.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;
        Button btnDetail;
        private Context context;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            context = itemView.getContext();

            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
            btnDetail = itemView.findViewById(R.id.btn_set_detail);

            btnDetail.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, Detail.class);
                    switch (getAdapterPosition()){
                        case 0:
                            intent.putExtra("photo",listHuruf.get(0).getPhoto());
                            intent.putExtra("name",listHuruf.get(0).getName());
                            intent.putExtra("makhraj",listHuruf.get(0).getDetail());
                            intent.putExtra("sifat",listHuruf.get(0).getSifat());
                            intent.putExtra("photo_makhraj",listHuruf.get(0).getPhoto_makhraj());
                            break;
                        case 1:
                            intent.putExtra("photo",listHuruf.get(1).getPhoto());
                            intent.putExtra("name",listHuruf.get(1).getName());
                            intent.putExtra("makhraj",listHuruf.get(1).getDetail());
                            intent.putExtra("sifat",listHuruf.get(1).getSifat());
                            intent.putExtra("photo_makhraj",listHuruf.get(1).getPhoto_makhraj());
                            break;
                        case 2:
                            intent.putExtra("photo",listHuruf.get(2).getPhoto());
                            intent.putExtra("name",listHuruf.get(2).getName());
                            intent.putExtra("makhraj",listHuruf.get(2).getDetail());
                            intent.putExtra("sifat",listHuruf.get(2).getSifat());
                            intent.putExtra("photo_makhraj",listHuruf.get(2).getPhoto_makhraj());
                            break;
                        case 3:
                            intent.putExtra("photo",listHuruf.get(3).getPhoto());
                            intent.putExtra("name",listHuruf.get(3).getName());
                            intent.putExtra("makhraj",listHuruf.get(3).getDetail());
                            intent.putExtra("sifat",listHuruf.get(3).getSifat());
                            intent.putExtra("photo_makhraj",listHuruf.get(3).getPhoto_makhraj());
                            break;
                        case 4:
                            intent.putExtra("photo",listHuruf.get(4).getPhoto());
                            intent.putExtra("name",listHuruf.get(4).getName());
                            intent.putExtra("makhraj",listHuruf.get(4).getDetail());
                            intent.putExtra("sifat",listHuruf.get(4).getSifat());
                            intent.putExtra("photo_makhraj",listHuruf.get(4).getPhoto_makhraj());
                            break;
                        case 5:
                            intent.putExtra("photo",listHuruf.get(5).getPhoto());
                            intent.putExtra("name",listHuruf.get(5).getName());
                            intent.putExtra("makhraj",listHuruf.get(5).getDetail());
                            intent.putExtra("sifat",listHuruf.get(5).getSifat());
                            intent.putExtra("photo_makhraj",listHuruf.get(5).getPhoto_makhraj());
                            break;
                        case 6:
                            intent.putExtra("photo",listHuruf.get(6).getPhoto());
                            intent.putExtra("name",listHuruf.get(6).getName());
                            intent.putExtra("makhraj",listHuruf.get(6).getDetail());
                            intent.putExtra("sifat",listHuruf.get(6).getSifat());
                            intent.putExtra("photo_makhraj",listHuruf.get(6).getPhoto_makhraj());
                            break;
                        case 7:
                            intent.putExtra("photo",listHuruf.get(7).getPhoto());
                            intent.putExtra("name",listHuruf.get(7).getName());
                            intent.putExtra("makhraj",listHuruf.get(7).getDetail());
                            intent.putExtra("sifat",listHuruf.get(7).getSifat());
                            intent.putExtra("photo_makhraj",listHuruf.get(7).getPhoto_makhraj());
                            break;
                        case 8:
                            intent.putExtra("photo",listHuruf.get(8).getPhoto());
                            intent.putExtra("name",listHuruf.get(8).getName());
                            intent.putExtra("makhraj",listHuruf.get(8).getDetail());
                            intent.putExtra("sifat",listHuruf.get(8).getSifat());
                            intent.putExtra("photo_makhraj",listHuruf.get(8).getPhoto_makhraj());
                            break;
                        case 9:
                            intent.putExtra("photo",listHuruf.get(9).getPhoto());
                            intent.putExtra("name",listHuruf.get(9).getName());
                            intent.putExtra("makhraj",listHuruf.get(9).getDetail());
                            intent.putExtra("sifat",listHuruf.get(9).getSifat());
                            intent.putExtra("photo_makhraj",listHuruf.get(9).getPhoto_makhraj());
                            break;
                        case 10:
                            intent.putExtra("photo",listHuruf.get(10).getPhoto());
                            intent.putExtra("name",listHuruf.get(10).getName());
                            intent.putExtra("makhraj",listHuruf.get(10).getDetail());
                            intent.putExtra("sifat",listHuruf.get(10).getSifat());
                            intent.putExtra("photo_makhraj",listHuruf.get(10).getPhoto_makhraj());
                            break;
                        case 11:
                            intent.putExtra("photo",listHuruf.get(11).getPhoto());
                            intent.putExtra("name",listHuruf.get(11).getName());
                            intent.putExtra("makhraj",listHuruf.get(11).getDetail());
                            intent.putExtra("sifat",listHuruf.get(11).getSifat());
                            intent.putExtra("photo_makhraj",listHuruf.get(11).getPhoto_makhraj());
                            break;
                        case 12:
                            intent.putExtra("photo",listHuruf.get(12).getPhoto());
                            intent.putExtra("name",listHuruf.get(12).getName());
                            intent.putExtra("makhraj",listHuruf.get(12).getDetail());
                            intent.putExtra("sifat",listHuruf.get(12).getSifat());
                            intent.putExtra("photo_makhraj",listHuruf.get(12).getPhoto_makhraj());
                            break;
                        case 13:
                            intent.putExtra("photo",listHuruf.get(13).getPhoto());
                            intent.putExtra("name",listHuruf.get(13).getName());
                            intent.putExtra("makhraj",listHuruf.get(13).getDetail());
                            intent.putExtra("sifat",listHuruf.get(13).getSifat());
                            intent.putExtra("photo_makhraj",listHuruf.get(13).getPhoto_makhraj());
                            break;
                        case 14:
                            intent.putExtra("photo",listHuruf.get(14).getPhoto());
                            intent.putExtra("name",listHuruf.get(14).getName());
                            intent.putExtra("makhraj",listHuruf.get(14).getDetail());
                            intent.putExtra("sifat",listHuruf.get(14).getSifat());
                            intent.putExtra("photo_makhraj",listHuruf.get(14).getPhoto_makhraj());
                            break;
                            case 15:
                            intent.putExtra("photo",listHuruf.get(15).getPhoto());
                            intent.putExtra("name",listHuruf.get(15).getName());
                            intent.putExtra("makhraj",listHuruf.get(15).getDetail());
                            intent.putExtra("sifat",listHuruf.get(15).getSifat());
                                intent.putExtra("photo_makhraj",listHuruf.get(15).getPhoto_makhraj());
                            break;
                        case 16:
                            intent.putExtra("photo",listHuruf.get(16).getPhoto());
                            intent.putExtra("name",listHuruf.get(16).getName());
                            intent.putExtra("makhraj",listHuruf.get(16).getDetail());
                            intent.putExtra("sifat",listHuruf.get(16).getSifat());
                            intent.putExtra("photo_makhraj",listHuruf.get(16).getPhoto_makhraj());
                            break;
                        case 17:
                            intent.putExtra("photo",listHuruf.get(17).getPhoto());
                            intent.putExtra("name",listHuruf.get(17).getName());
                            intent.putExtra("makhraj",listHuruf.get(17).getDetail());
                            intent.putExtra("sifat",listHuruf.get(17).getSifat());
                            intent.putExtra("photo_makhraj",listHuruf.get(17).getPhoto_makhraj());
                            break;
                        case 18:
                            intent.putExtra("photo",listHuruf.get(18).getPhoto());
                            intent.putExtra("name",listHuruf.get(18).getName());
                            intent.putExtra("makhraj",listHuruf.get(18).getDetail());
                            intent.putExtra("sifat",listHuruf.get(18).getSifat());
                            intent.putExtra("photo_makhraj",listHuruf.get(18).getPhoto_makhraj());
                            break;
                        case 19:
                            intent.putExtra("photo",listHuruf.get(19).getPhoto());
                            intent.putExtra("name",listHuruf.get(19).getName());
                            intent.putExtra("makhraj",listHuruf.get(19).getDetail());
                            intent.putExtra("sifat",listHuruf.get(19).getSifat());
                            intent.putExtra("photo_makhraj",listHuruf.get(19).getPhoto_makhraj());
                            break;
                        case 20:
                            intent.putExtra("photo",listHuruf.get(20).getPhoto());
                            intent.putExtra("name",listHuruf.get(20).getName());
                            intent.putExtra("makhraj",listHuruf.get(20).getDetail());
                            intent.putExtra("sifat",listHuruf.get(20).getSifat());
                            intent.putExtra("photo_makhraj",listHuruf.get(20).getPhoto_makhraj());
                            break;
                        case 21:
                            intent.putExtra("photo",listHuruf.get(21).getPhoto());
                            intent.putExtra("name",listHuruf.get(21).getName());
                            intent.putExtra("makhraj",listHuruf.get(21).getDetail());
                            intent.putExtra("sifat",listHuruf.get(21).getSifat());
                            intent.putExtra("photo_makhraj",listHuruf.get(21).getPhoto_makhraj());
                            break;
                        case 22:
                            intent.putExtra("photo",listHuruf.get(22).getPhoto());
                            intent.putExtra("name",listHuruf.get(22).getName());
                            intent.putExtra("makhraj",listHuruf.get(22).getDetail());
                            intent.putExtra("sifat",listHuruf.get(22).getSifat());
                            intent.putExtra("photo_makhraj",listHuruf.get(22).getPhoto_makhraj());
                            break;
                        case 23:
                            intent.putExtra("photo",listHuruf.get(23).getPhoto());
                            intent.putExtra("name",listHuruf.get(23).getName());
                            intent.putExtra("makhraj",listHuruf.get(23).getDetail());
                            intent.putExtra("sifat",listHuruf.get(23).getSifat());
                            intent.putExtra("photo_makhraj",listHuruf.get(23).getPhoto_makhraj());
                            break;
                        case 24:
                            intent.putExtra("photo",listHuruf.get(24).getPhoto());
                            intent.putExtra("name",listHuruf.get(24).getName());
                            intent.putExtra("makhraj",listHuruf.get(24).getDetail());
                            intent.putExtra("sifat",listHuruf.get(24).getSifat());
                            intent.putExtra("photo_makhraj",listHuruf.get(24).getPhoto_makhraj());
                            break;
                        case 25:
                            intent.putExtra("photo",listHuruf.get(25).getPhoto());
                            intent.putExtra("name",listHuruf.get(25).getName());
                            intent.putExtra("makhraj",listHuruf.get(25).getDetail());
                            intent.putExtra("sifat",listHuruf.get(25).getSifat());
                            intent.putExtra("photo_makhraj",listHuruf.get(25).getPhoto_makhraj());
                            break;
                        case 26:
                            intent.putExtra("photo",listHuruf.get(26).getPhoto());
                            intent.putExtra("name",listHuruf.get(26).getName());
                            intent.putExtra("makhraj",listHuruf.get(26).getDetail());
                            intent.putExtra("sifat",listHuruf.get(26).getSifat());
                            intent.putExtra("photo_makhraj",listHuruf.get(26).getPhoto_makhraj());
                            break;
                        case 27:
                            intent.putExtra("photo",listHuruf.get(27).getPhoto());
                            intent.putExtra("name",listHuruf.get(27).getName());
                            intent.putExtra("makhraj",listHuruf.get(27).getDetail());
                            intent.putExtra("sifat",listHuruf.get(27).getSifat());
                            intent.putExtra("photo_makhraj",listHuruf.get(27).getPhoto_makhraj());
                            break;
                    }
                    context.startActivity(intent);

                }
            });
        }

    }
}
