package com.example.winner.yueshijia.fragment.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.winner.yueshijia.R;


/**
 * @author ling
 * @version 1.0
 *          2016/11/8 14:56
 */
public class BackDialogFragment extends DialogFragment implements View.OnClickListener {


    private TextView mTvDialogTitle;
    private Button mBtDialogEnter;
    private Button mBtDialogCancel;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.dialog_action_exit, null);
        mTvDialogTitle = (TextView) view.findViewById(R.id.tv_dialog_title);
        mTvDialogTitle.setText("你确定要退出吗?");
        mBtDialogEnter = (Button) view.findViewById(R.id.bt_dialog_enter);
        mBtDialogEnter.setOnClickListener(this);
        mBtDialogEnter.setText("确定");
        mBtDialogCancel = (Button) view.findViewById(R.id.bt_dialog_cancel);
        mBtDialogCancel.setText("取消");
        mBtDialogCancel.setOnClickListener(this);
        builder.setView(view);
        return builder.create();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_dialog_enter:
                System.exit(0);
                break;
            case R.id.bt_dialog_cancel:
                dismiss();
                break;
        }

    }

}