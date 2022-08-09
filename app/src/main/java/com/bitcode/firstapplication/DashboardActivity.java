package com.bitcode.firstapplication;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public class DashboardActivity extends Activity {

    boolean isPasswordProtected,isScreenSizeSmall;
    int one;
    float view_height;
    int []oddNumbers;
    int tealColour;
    String []studentNames;
    TypedArray colours;
    TypedArray icons;
    TextView txtWelcomeMessage;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_activity);

        txtWelcomeMessage = findViewById(R.id.txtWelcomeMessage);

        //txtWelcomeMessage.setText("Welcome To Android");

        Resources resources = getResources();
        one = resources.getInteger(R.integer.one);
        Log.e("tag","one"+one);

        oddNumbers = resources.getIntArray(R.array.odd_numbers);
        studentNames = resources.getStringArray(R.array.student_names);
        tealColour = resources.getColor(R.color.teal_200);
        isPasswordProtected = resources.getBoolean(R.bool.isPasswordProtected);
        isScreenSizeSmall = resources.getBoolean(R.bool.screen_size);
        view_height = resources.getDimension(R.dimen.view_height);

        //TypedArray of colors
        colours = resources.obtainTypedArray(R.array.colors);

        //colours.getColor(0,0);

        //edtUsername.setTextColor(colorPurple);

        //TypedArray of icons
        icons = resources.obtainTypedArray(R.array.icons);
        //icons.getDrawable(0);

        Configuration configuration = resources.getConfiguration();
        //configuration.locale.getDisplayCountry();
        //configuration.locale.getDisplayLanguage();
        //int colorMode = configuration.colorMode;
        //float fontScale = configuration.fontScale;
    }
}
