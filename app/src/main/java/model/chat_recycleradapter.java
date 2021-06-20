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


public class chat_recycleradapter extends RecyclerView.Adapter<chat_recycleradapter.ViewHolder> {

    Context context;
    List<chat_class> chatlist;

    public chat_recycleradapter(Context context, List<chat_class> chatlist) {
        this.context = context;
        this.chatlist = chatlist;
    }

    @NonNull
    @Override
    public chat_recycleradapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.chat_view, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull chat_recycleradapter.ViewHolder holder, int position) {
        holder.tv_name.setText(chatlist.get(position).getName());
        holder.tv_msg.setText(chatlist.get(position).getMessage());
        holder.iv_pic.setImageResource(chatlist.get(position).getPic());
        holder.tv_time.setText(chatlist.get(position).getTime());
    }

    @Override
    public int getItemCount() {
        return chatlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tv_name,tv_msg,tv_time;
        ImageView iv_pic;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_name=itemView.findViewById(R.id.Tv_name);
            tv_msg=itemView.findViewById(R.id.Tv_msg);
            tv_time=itemView.findViewById(R.id.Tv_time);
            iv_pic=itemView.findViewById(R.id.pic_iv);

        }
    }
}
