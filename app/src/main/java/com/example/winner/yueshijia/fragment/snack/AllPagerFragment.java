package com.example.winner.yueshijia.fragment.snack;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;


import com.example.winner.yueshijia.R;
import com.example.winner.yueshijia.adpter.snacksAdapter;
import com.example.winner.yueshijia.base.BaseFragment;
import com.example.winner.yueshijia.beans.snacksBean;
import com.example.winner.yueshijia.conf.IDiyMessage;
import com.example.winner.yueshijia.control.snacksControl;

import java.util.ArrayList;
import java.util.List;

import me.maxwin.view.XListView;


/**
 * @author 梁光文
 * @time 2016/11/8  15:03
 * @desc ${TODD}
 */
public class AllPagerFragment extends BaseFragment<snacksBean> implements AdapterView.OnItemClickListener {
    private int index = 1;
    private snacksControl mControl;
    private ArrayList<snacksBean.snacks.snackslist> datas;
    private XListView all_pager_lv;
  //  private ArrayList<snacksBean> mBean;
    private snacksAdapter adpter;


    @Override
    public void handlerMessage(int action, snacksBean sBean, boolean isFirst) {
      //  EventBus.getDefault().post("over");
        if (sBean.getCode()==200){
            List<snacksBean.snacks.snackslist> goods_list = sBean.getDatas().getGoods_list();
            if (isFirst){
                datas.clear();
                datas.addAll(goods_list);
                //XListView加载数据
                adpter = new snacksAdapter(getContext(),datas);
                all_pager_lv.setAdapter(adpter);
                all_pager_lv.stopRefresh();
            }
            else {
                datas.addAll(goods_list);
                all_pager_lv.stopLoadMore();
            }
            all_pager_lv.setPullLoadEnable(sBean.isHasmore()?true:false);
        }
    }

    @Override
    protected View initFragmentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_all_pager,container,false);
        View head = LayoutInflater.from(getActivity()).inflate(R.layout.item_goods_list_big, null);
        this.all_pager_lv = (XListView)view.findViewById(R.id.all_pager_lv);
        all_pager_lv.addFooterView(head);
        all_pager_lv.setOnItemClickListener(this);
        //all_pager_lv.addHeaderView(head);
        return view;
    }

    @Override
    protected void initControl() {
         mControl=new snacksControl(getActivity());
         mControl.setHandleMessageListener(this);
    }

    @Override
    protected void initData() {
        datas = new ArrayList<>();
        mControl.doGet(IDiyMessage.SNACKS_ACTION,getIndex(),true);
        mControl.doGet(IDiyMessage.WINE_ACTION,getIndex(),true);
//        //XListView加载数据
//       adpter = new snacksAdapter(getContext(),datas);
//       all_pager_lv.setAdapter(adpter);
    }

    @Override
    protected void initEvent() {
        all_pager_lv.setXListViewListener(new XListView.IXListViewListener() {
            @Override
            public void onRefresh() {
                index=1;
                mControl.doGet(IDiyMessage.SNACKS_ACTION,getIndex(),true);
                mControl.doGet(IDiyMessage.WINE_ACTION,getIndex(),true);
            }
            @Override
            public void onLoadMore() {
                //加载更多
                mControl.doGet(IDiyMessage.SNACKS_ACTION,getIndex(),true);
                mControl.doGet(IDiyMessage.WINE_ACTION,getIndex(),true);
            }
        });
    }
    public int getIndex() {
        return index++;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
/*        XListView listView = (XListView) parent;
        Object itemAtPosition = listView.getItemAtPosition(position);*/

    }
}
