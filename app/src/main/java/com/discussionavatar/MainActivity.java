package com.discussionavatar;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.discussionavatarview.DiscussionAvatarListener;
import com.discussionavatarview.DiscussionAvatarView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private final ArrayList<String> mDatas = new ArrayList<>();
    private DiscussionAvatarView mDiscussAva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDiscussAva = findViewById(R.id.daview);
        Button mBtAdd = findViewById(R.id.bt_add);
        Button mBtAdd2 = findViewById(R.id.bt_add2);
        Button mBtReset = findViewById(R.id.bt_reset);
        Button mBtMaxCount = findViewById(R.id.bt_max_count);

        initTestDatas();

        mBtReset.setOnClickListener(v -> mDiscussAva.initDatas(mDatas));

        mBtAdd.setOnClickListener(v -> {
            String url = "https://b-ssl.duitang.com/uploads/item/201807/11/20180711091152_FakCJ.thumb.700_0.jpeg";
            mDiscussAva.addData(url, new DiscussionAvatarListener() {
                @Override
                public void onAnimationStart() {

                }

                @Override
                public void onAnimationEnd() {

                }
            });
        });

        mBtAdd2.setOnClickListener(v -> {
            String url = "https://b-ssl.duitang.com/uploads/item/201902/10/20190210103053_fQA8f.thumb.700_0.jpeg";
            mDiscussAva.addData(url);
        });

        mBtMaxCount.setOnClickListener(v -> mDiscussAva.setMaxCount(4));

    }

    private void initTestDatas() {
        mDatas.add("https://b-ssl.duitang.com/uploads/item/201811/04/20181104223950_vygmz.thumb.700_0.jpeg");
        mDatas.add("https://b-ssl.duitang.com/uploads/item/201807/11/20180711091152_FakCJ.thumb.700_0.jpeg");
        mDatas.add("https://b-ssl.duitang.com/uploads/item/201811/04/20181104223952_zfhli.thumb.700_0.jpeg");
        mDatas.add("https://b-ssl.duitang.com/uploads/item/201810/30/20181030153225_mixve.thumb.700_0.jpg");
        mDatas.add("https://b-ssl.duitang.com/uploads/item/201807/08/20180708095827_SYPL3.thumb.700_0.jpeg");
        mDatas.add("https://b-ssl.duitang.com/uploads/item/201811/01/20181101093301_u2NKu.thumb.700_0.jpeg");
        mDiscussAva.initDatas(mDatas);
    }

}
