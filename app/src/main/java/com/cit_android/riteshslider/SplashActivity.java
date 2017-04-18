package com.cit_android.riteshslider;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by cit_android on 18/4/17.
 */

public class SplashActivity extends AppCompatActivity {

    @BindView(R.id.rl_btn_activate_now)
    RelativeLayout RL_btn_activate_now;

    @BindView(R.id.rl_activation)
    RelativeLayout RL_activation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ButterKnife.bind(this);


        Appconstant.sh = getSharedPreferences(Appconstant.MyPREFERENCES, Context.MODE_PRIVATE);

        // here initializing the shared preference
        Appconstant.sh = getSharedPreferences("myprefe", 0);
        Appconstant.editor = Appconstant.sh.edit();

        // check here if user is login or not
        Appconstant.str_login_test = Appconstant.sh.getString("loginTest", null);

        if (getIntent().getBooleanExtra("EXIT", false)) {
            finish();
            return;
        }

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                /* if user login test is true on oncreate then redirect the user to result page */

                if (Appconstant.str_login_test != null
                        && !Appconstant.str_login_test.toString().trim().equals("")) {

                    RL_activation.setVisibility(View.GONE);
                    Log.e("Activatin found :", "Go to Main Screen");
                    Intent Gomainscreen = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(Gomainscreen);
                    finish();


                } else {
                    Log.e("Activatin Not found :", "Click For Activate");
                    RL_activation.setVisibility(View.VISIBLE);

                }
            }

        }, 2000);


        RL_btn_activate_now.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Appconstant.editor.putString("loginTest", "true");
                Appconstant.editor.commit();

                Intent Gomainscreen = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(Gomainscreen);
                finish();
            }
        });


    }
}
