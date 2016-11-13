package com.example.winner.yueshijia.activity;

import android.view.View;
import android.widget.ListView;

import com.example.winner.yueshijia.R;
import com.example.winner.yueshijia.adpter.GoodsCommentAdapter;
import com.example.winner.yueshijia.base.BaseActivity;
import com.example.winner.yueshijia.beans.shopBeans.ShopCommentBean;
import com.example.winner.yueshijia.conf.IDiyMessage;
import com.example.winner.yueshijia.control.GoodsCommentController;

import java.util.List;

import static com.example.winner.yueshijia.R.id.ib_back;

/**
 * @author VKEY
 * @since 2016/11/13 0:05
 */

public class ShopDetailCommentActivity extends BaseActivity<ShopCommentBean> implements View.OnClickListener {

    private String mGoods_id;
    private ListView mLv_comment;

    @Override
    protected void initView() {
        setContentView(R.layout.activity_shop_comment);
        findViewById(ib_back).setOnClickListener(this);
        mLv_comment = (ListView) findViewById(R.id.lv_comment);
    }

    @Override
    protected void initData() {
        super.initData();
        mGoods_id = getIntent().getStringExtra(GoodsDetailsActivity.INTENT_KEY);
        if (mGoods_id == null) {
            finish();
        }
        mControl.doGet(IDiyMessage.GOODS_DETAIL_COMMENT_ACTION, Integer.parseInt(mGoods_id), true, 0);
    }

    @Override
    protected void initControl() {
        super.initControl();
        mControl = new GoodsCommentController(this);
        mControl.setHandleMessageListener(this);
    }

    @Override
    public void handlerMessage(int action, ShopCommentBean shopCommentBean, boolean isFirst) {
        switch (action) {
            case IDiyMessage.GOODS_DETAIL_COMMENT_ACTION:
                if (shopCommentBean.getCode() == 200) {
                    ShopCommentBean.DatasBean datas = shopCommentBean.getDatas();
                    List<ShopCommentBean.DatasBean.GoodsEvalListBean> goods_eval_list = datas.getGoods_eval_list();
                    GoodsCommentAdapter adapter = new GoodsCommentAdapter(goods_eval_list, this);
                    mLv_comment.setAdapter(adapter);
                }
                break;
        }
    }

    @Override
    public void onClick(View v) {
        finish();
    }
}
