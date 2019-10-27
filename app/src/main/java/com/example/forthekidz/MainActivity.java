package com.example.forthekidz;

import androidx.appcompat.app.AppCompatActivity;
<<<<<<< HEAD
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    Dialog dialog;
=======

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
>>>>>>> 45a7aeb4a1eed0afe223b5ce20eeaae85175dd26

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
<<<<<<< HEAD
        dialog = new Dialog(this);
=======
        myDialog = new Dialog(this);
//        System.out.println("HELLO HELLO HELLO");
        System.out.println(blockService.getBlockDefinitionsJsonPaths().get(0));
>>>>>>> 45a7aeb4a1eed0afe223b5ce20eeaae85175dd26
    }

    @OnClick(R.id.testButton)
    public void showModal(View v) {
        myDialog.setContentView(R.layout.test_modal);
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }

<<<<<<< HEAD
    @OnClick(R.id.testButton)
    public void showModal(View v) {
        DialogFragment newFragment = ModalFragment.newInstance();
        newFragment.setShowsDialog(true);
        newFragment.show(getSupportFragmentManager(), "dialog");
=======
    @OnClick(R.id.closeModalButton)
    public void closeModal(View v) {
        myDialog.dismiss();
    }

    @OnClick(R.id.runButton)
    public void runGame() {
        blockService.getCodeGenerationCallback();
>>>>>>> 45a7aeb4a1eed0afe223b5ce20eeaae85175dd26
    }


}
