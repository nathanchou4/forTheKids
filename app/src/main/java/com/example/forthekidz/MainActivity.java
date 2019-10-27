package com.example.forthekidz;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.google.blockly.model.Block;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    Dialog myDialog;
    BlockService blockService = new BlockService();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDialog = new Dialog(this);
//        System.out.println("HELLO HELLO HELLO");
        System.out.println(blockService.getBlockDefinitionsJsonPaths().get(0));
    }

    @OnClick(R.id.testButton)
    public void showModal(View v) {
        myDialog.setContentView(R.layout.test_modal);
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }

    @OnClick(R.id.closeModalButton)
    public void closeModal(View v) {
        myDialog.dismiss();
    }
}
