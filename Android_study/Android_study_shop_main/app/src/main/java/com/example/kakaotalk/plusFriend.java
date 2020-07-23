package com.example.kakaotalk;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class plusFriend extends Activity {
    ArrayList<Students> mData = null;
    ListView mListerView = null;
    BaseAdapterEx mAdapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourthminer);

        mData = new ArrayList<Students>();
        for (int i = 0; i < 100; i++) {
            Students students = new Students();
            students.mName = "친구" + i;
            students.mNumber = " 95000" + i;
            students.mDepartment = "공통분야" + i;

            mData.add(students);
        }
        mAdapter = new BaseAdapterEx(this, mData);
        mListerView = (ListView) findViewById(R.id.list_view);
        mListerView.setAdapter(mAdapter);

        Button btnDelAll = findViewById(R.id.all_del_btn);
        btnDelAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("DEBUG", "CLEAR ALL");
                mAdapter.clear();
            }
        });
        Button btnAdd = findViewById(R.id.add_btn);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("DEBUG","ADD");
                EditText nameEt = (EditText) findViewById(R.id.name_edit);
                EditText numberEt = (EditText) findViewById(R.id.number_edit);
                EditText departmentEt = (EditText) findViewById(R.id.department_edit);

                Students addData = new Students();

                addData.mName = nameEt.getText().toString();
                addData.mNumber = numberEt.getText().toString();
                addData.mDepartment = departmentEt.getText().toString();

                mAdapter.add(0,addData);
            }
        });
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.add_btn:
            {
                EditText nameEt = (EditText) findViewById(R.id.name_edit);
                EditText numberEt = (EditText) findViewById(R.id.number_edit);
                EditText departmentEt = (EditText) findViewById(R.id.department_edit);

                Students addData = new Students();

                addData.mName = nameEt.getText().toString();
                addData.mNumber = numberEt.getText().toString();
                addData.mDepartment = departmentEt.getText().toString();

                mAdapter.add(0,addData);
                break;
            }
            case  R.id.del_btn:
            {
                EditText delItmeIndexEt = (EditText) findViewById(R.id.del_item_index_edit);
                Integer index = Integer.parseInt(delItmeIndexEt.getText().toString());
                mAdapter.delete(index);
                break;
            }
            case R.id.all_del_btn:
            {
                Log.d("DEBUG", "onClick clear");
                mAdapter.clear();
                break;
            }
        }
    }
}

