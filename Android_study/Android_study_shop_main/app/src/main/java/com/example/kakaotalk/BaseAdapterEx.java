package com.example.kakaotalk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class BaseAdapterEx extends BaseAdapter {
    Context   mContext = null;
    ArrayList<Students> mData = null;
    LayoutInflater mLayoutInflater = null;

    public BaseAdapterEx(Context context, ArrayList<Students>data)
    {
        mContext = context;
        mData = data;
        mLayoutInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount()
    {
        return  mData.size();
    }

    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    class ViewHolder
    {
        TextView mNameTv;
        TextView mNumberTv;
        TextView mDepartmentTv;

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemLayout = convertView;
        ViewHolder viewHolder;
        if(itemLayout == null)
        {
            itemLayout = mLayoutInflater.inflate(
                    R.layout.list_view_item_layout,null);
            viewHolder = new ViewHolder();
            viewHolder.mNameTv = itemLayout.findViewById(R.id.name_text);
            viewHolder.mNumberTv = itemLayout.findViewById(R.id.number_text);
            viewHolder.mDepartmentTv = itemLayout.findViewById(R.id.department_text);

            itemLayout.setTag(viewHolder);
        }
        else
        {
            viewHolder = (ViewHolder)itemLayout.getTag();
        }
        viewHolder.mNameTv.setText(mData.get(position).mName);
        viewHolder.mNumberTv.setText(mData.get(position).mNumber);
        viewHolder.mDepartmentTv.setText(mData.get(position).mDepartment);

        return itemLayout;
    }
    public  void  add(int index,Students addData)
    {
        mData.add(index, addData);
        notifyDataSetChanged();
    }
    public void delete(int index)
    {
        mData.remove(index);
        notifyDataSetChanged();
    }
    public  void clear()
    {
        mData.clear();
        notifyDataSetChanged();
    }
}
