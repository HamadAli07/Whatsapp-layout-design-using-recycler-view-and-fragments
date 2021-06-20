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

import java.util.List;

public class status_recycleradapter extends RecyclerView.Adapter<status_recycleradapter.ViewHolder> {

    Context context;
    List<status_class> Status_list;

    public status_recycleradapter(Context context, List<status_class> status_list) {
        this.context = context;
        Status_list = status_list;
    }

    @NonNull
    @Override
    public status_recycleradapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.status_view, parent, false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tv_name.setText(Status_list.get(position).getName());
        holder.tv_time.setText(Status_list.get(position).getTime());
        holder.iv_pic.setImageResource(Status_list.get(position).getPic());

    }

    @Override
    public int getItemCount() {
        return Status_list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv_name,tv_time;
        ImageView iv_pic;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_name=itemView.findViewById(R.id.status_name_tv);
            tv_time=itemView.findViewById(R.id.status_time_tv);
            iv_pic=itemView.findViewById(R.id.status_pic_iv);
        }
    }
}
