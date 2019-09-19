package com.hongx.hxmvp2.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.hongx.hxmvp2.R;
import com.hongx.hxmvp2.bean.DuanziData;
import com.hongx.hxmvp2.bean.Girl;

import java.util.List;

/**
 * @author: fuchenming
 * @create: 2019-09-19 14:04
 */
public class DuanziAdapter  extends BaseAdapter {

    private LayoutInflater inflater;
    private List<DuanziData> duanziList;

    private Context context;

    public DuanziAdapter(Context context, List<DuanziData> duanziList) {
        inflater = LayoutInflater.from(context);
        this.duanziList = duanziList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return duanziList.size();
    }

    @Override
    public Object getItem(int position) {
        return duanziList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = inflater.inflate(R.layout.duanzi_item, null);

        DuanziData duanzi = duanziList.get(position);


        TextView tv_like = (TextView) view.findViewById(R.id.tv_text);
        ImageView imgv_img =  view.findViewById(R.id.imgv_img);
        tv_like.setText("内容"+duanzi.getText());
        Glide.with(context).load(duanzi.getProfile_image()).into(imgv_img);
//        Glide.with(context).load("https://www.baidu.com/img/bd_logo1.png").into(imgv_img);


        return view;
    }

}
