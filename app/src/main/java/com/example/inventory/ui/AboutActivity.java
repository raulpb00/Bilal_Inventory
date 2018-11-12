package com.example.inventory.ui;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.danielstone.materialaboutlibrary.MaterialAboutActivity;
import com.danielstone.materialaboutlibrary.items.MaterialAboutActionItem;
import com.danielstone.materialaboutlibrary.items.MaterialAboutTitleItem;
import com.danielstone.materialaboutlibrary.model.MaterialAboutCard;
import com.danielstone.materialaboutlibrary.model.MaterialAboutList;
import com.example.inventory.R;

public class AboutActivity extends MaterialAboutActivity {

    @NonNull
    @Override
    protected MaterialAboutList getMaterialAboutList(@NonNull Context context) {
//        MaterialAboutCard cardInfo = new MaterialAboutCard.Builder()
//                .addItem(new MaterialAboutTitleItem.Builder()
//                .text("Inventory")
//                .icon(R.mipmap.ic_launcher)
//                .build());
//        MaterialAboutCard cardVersion = new MaterialAboutCard.Builder()
//                .addItem(new MaterialAboutActionItem.Builder()
//                .text("Version")
//                .subText("1.0.0")
//                .icon(R.mipmap.ic_launcher)
//                .build());
//        MaterialAboutList list =
//        return new MaterialAboutList.Builder().addCard(cardInfo).addCard(cardVersion);
        return null;
    }

    @Nullable
    @Override
    protected CharSequence getActivityTitle() {
        return getString(R.string.mal_title_about);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }
}
