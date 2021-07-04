package com.myself.example.android.xiququxi.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import com.myself.example.android.xiququxi.R;
import com.myself.example.android.xiququxi.adapter.ExercisesListItemAdapter;
import com.myself.example.android.xiququxi.bean.ExercisesBean;

public class ExercisesFragment extends Fragment {

    private ListView lvList;//来源fragment_exercises
    private ExercisesListItemAdapter adapter; //适配器
    private List<ExercisesBean> ebl; //列表集合

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_exercises, null);
    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initData();
        lvList = view.findViewById(R.id.lv_list);
        adapter = new ExercisesListItemAdapter(getActivity());
        adapter.setData(ebl);
        lvList.setAdapter(adapter);
    }

    private void initData(){
        ebl = new ArrayList<ExercisesBean>();
        for (int i=0;i<10;i++){
            ExercisesBean bean = new ExercisesBean();
            bean.id=(i+1);
            switch (i){
                case 0:
                    bean.title="京剧";
                    bean.content="共计5题";
                    bean.background=(R.drawable.exercises_bg_1);
                    break;
                case 1:
                    bean.title="豫剧";
                    bean.content="共计5题";
                    bean.background=(R.drawable.exercises_bg_2);
                    break;
                case 2:
                    bean.title="评剧";
                    bean.content="共计5题";
                    bean.background=(R.drawable.exercises_bg_3);
                    break;
                case 3:
                    bean.title="越剧";
                    bean.content="共计5题";
                    bean.background=(R.drawable.exercises_bg_4);
                    break;
                case 4:
                    bean.title="昆曲";
                    bean.content="共计5题";
                    bean.background=(R.drawable.exercises_bg_1);
                    break;
                case 5:
                    bean.title="河南曲剧";
                    bean.content="共计5题";
                    bean.background=(R.drawable.exercises_bg_2);
                    break;
                case 6:
                    bean.title="黄梅戏";
                    bean.content="共计5题";
                    bean.background=(R.drawable.exercises_bg_3);
                    break;
                case 7:
                    bean.title="吕剧";
                    bean.content="共计5题";
                    bean.background=(R.drawable.exercises_bg_4);
                    break;
                case 8:
                    bean.title="越调";
                    bean.content="共计5题";
                    bean.background=(R.drawable.exercises_bg_1);
                    break;
                case 9:
                    bean.title="沪剧";
                    bean.content="共计5题";
                    bean.background=(R.drawable.exercises_bg_2);
                    break;
                default:
                    break;
            }
            ebl.add(bean);
        }
    }
}
