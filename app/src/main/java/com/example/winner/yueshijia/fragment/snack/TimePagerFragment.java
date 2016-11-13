package com.example.winner.yueshijia.fragment.snack;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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
public class TimePagerFragment extends BaseFragment<snacksBean> {

/*    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_price_pager, container, false);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();

    }*/
    private int index = 1;
    private snacksControl mControl;
    private ArrayList<snacksBean.snacks.snackslist> datas;
    private XListView time_pager_lv;
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
                time_pager_lv.setAdapter(adpter);
                time_pager_lv.stopRefresh();
            }
            else {
                datas.addAll(goods_list);
                time_pager_lv.stopLoadMore();
            }
            time_pager_lv.setPullLoadEnable(sBean.isHasmore()?true:false);
        }
    }

    @Override
    protected View initFragmentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_time_pager,container,false);
        View head = LayoutInflater.from(getActivity()).inflate(R.layout.item_goodlist, null);
        this.time_pager_lv = (XListView)view.findViewById(R.id.time_pager_lv);
        time_pager_lv.addFooterView(head);
       // time_pager_lv.addHeaderView(head);
        return view;

    }

    @Override
    protected void initControl() {
        mControl=new snacksControl(getActivity());
        mControl.setHandleMessageListener(this);
    }

    @Override
    protected void initEvent() {
        time_pager_lv.setXListViewListener(new XListView.IXListViewListener() {
            @Override
            public void onRefresh() {
                index=1;
                mControl.doGet(IDiyMessage.SNACKS_ACTION,getIndex(),true);
            }
            @Override
            public void onLoadMore() {
                //加载更多
                mControl.doGet(IDiyMessage.SNACKS_ACTION,getIndex(),true);
            }
        });
    }

    @Override
    protected void initData() {
        datas = new ArrayList<>();
        mControl.doGet(IDiyMessage.SNACKS_ACTION,getIndex(),true);
    }
    public int getIndex() {
        return index++;
    }
}
