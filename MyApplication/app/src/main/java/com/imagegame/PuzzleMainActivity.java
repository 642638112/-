package com.imagegame;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.GridView;

import java.util.List;

public class PuzzleMainActivity extends Activity {
    private GridView mianGridView;
    private  int [] mResPicId;
    private List<Bitmap> mPicList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intview();
    }

    private void intview() {

    }




}
