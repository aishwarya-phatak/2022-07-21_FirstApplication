package com.bitcode.firstapplication;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class LoginActivity extends Activity implements View.OnClickListener {
    private TextView txtWelcomeMessage;
    private EditText edtUsername, edtPassword;
    private Button btnSignIn;

    private ImageView imageNature;

    private int currentIndex = 0;
    private int [] imagesOfNature = {R.drawable.nature_image1,R.drawable.nature_image2,R.drawable.nature_image3};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        initializeViews();
        imageNature.setImageResource(imagesOfNature[currentIndex]);
        initListeners();
    }

    private void initializeViews(){
        txtWelcomeMessage = findViewById(R.id.txtWelcomeMessage);
        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);
        btnSignIn = findViewById(R.id.btnSignIn);
        imageNature = findViewById(R.id.imageNature);
    }

    private void initListeners(){
        txtWelcomeMessage.setOnClickListener(this);
        btnSignIn.setOnClickListener(this);

        imageNature.setOnClickListener(new ImageClickListener());
    }

    class ImageClickListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            currentIndex = ++currentIndex % imagesOfNature.length;
            imageNature.setImageResource(imagesOfNature[currentIndex]);
        }
    }

    @Override
    public void onClick(View view) {
        if(view==txtWelcomeMessage){
            txtWelcomeMessage.setText("");
        }
        else{
            if ((edtUsername.getText().toString().equals("bitcode")) && edtPassword.getText().toString().equals("bitcode")){
                txtWelcomeMessage.setText("Welcome"+ edtUsername.getText().toString());
            }else {
                txtWelcomeMessage.setText("Login Failed!");
            }
        }

       /*
        Resources resources = getResources();
        int tealColorRes = resources.getColor(R.color.teal_200);
        txtWelcomeMessage.setBackgroundColor(Color.BLUE);
       */
    }
}
