package model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.whatsapp_191071.R;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class call_recycleradapter extends RecyclerView.Adapter<call_recycleradapter.ViewHolder> {

    Context context;
    List<call_class> call_list=new ArrayList<>();

    public call_recycleradapter(Context context, List<call_class> call_list) {
        this.context = context;
        this.call_list = call_list;
    }

    @NonNull
    @Override
    public call_recycleradapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.call_view, parent, false);
        ViewHolder v=new ViewHolder(view);
        return v;
    }

    @Override
    public void onBindViewHolder(@NonNull call_recycleradapter.ViewHolder holder, int position) {
        holder.tv_name.setText(call_list.get(position).getName());
        holder.tv_time.setText(call_list.get(position).getTime());
        holder.Iv_pic.setImageResource(call_list.get(position).getPic());
        holder.Iv_icon.setImageResource(call_list.get(position).getIcon());
    }

    @Override
    public int getItemCount() {
        return call_list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv_name,tv_time;
        ImageView Iv_icon,Iv_pic;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_name=itemView.findViewById(R.id.tv_name_call);
            tv_time=itemView.findViewById(R.id.Tv_time_call);
            Iv_icon=itemView.findViewById(R.id.iv_icon_call);
            Iv_pic=itemView.findViewById(R.id.Iv_pic_call);
        }
    }
}
