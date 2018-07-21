package com.example.admin.mobtopc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private TextWatcher textwatcher = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button b1, notepad_btn, chrome_btn, vlc_btn, shutdown_btn, restart_btn, gedit_btn, vlcubu_btn, firefox_btn, poweroff_btn, restUbu_btn, forward_btn, backward_btn;
        final ToggleButton platform_selector = findViewById(R.id.toggleButton);
        final LinearLayout u_lay, w_lay;
        final EditText edittext;

        edittext = findViewById(R.id.editText);

        u_lay = findViewById(R.id.ubu_layout);
        w_lay = findViewById(R.id.windows_layout);



        platform_selector.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(platform_selector.isChecked() == true){
                    w_lay.setVisibility(View.VISIBLE);
                    u_lay.setVisibility(View.GONE);
                }
                else if(platform_selector.isChecked() == false){
                    w_lay.setVisibility(View.GONE);
                    u_lay.setVisibility(View.VISIBLE);
                }
            }
        });

        b1 = (Button)findViewById(R.id.button);
        notepad_btn = findViewById(R.id.button2);
        chrome_btn = findViewById(R.id.button3);
        vlc_btn = findViewById(R.id.button4);
        restart_btn = findViewById(R.id.button5);
        shutdown_btn = findViewById(R.id.button6);
        gedit_btn = findViewById(R.id.button11);
        vlcubu_btn = findViewById(R.id.button12);
        firefox_btn = findViewById(R.id.button9);
        poweroff_btn = findViewById(R.id.button13);
        restUbu_btn = findViewById(R.id.button14);
        forward_btn = findViewById(R.id.button16);
        backward_btn = findViewById(R.id.button17);

       final MessegeSender msend = new MessegeSender();
        gedit_btn.setOnClickListener(new View.OnClickListener() {
            final MessegeSender msend = new MessegeSender();
            @Override
            public void onClick(View view) {
                new MessegeSender().execute(gedit_btn.getText().toString());
                //msend.execute(gedit_btn.getText().toString());
            }
        });

        firefox_btn.setOnClickListener(new View.OnClickListener() {
            final MessegeSender msend = new MessegeSender();
            @Override
            public void onClick(View view) {
                new MessegeSender().execute(firefox_btn.getText().toString());
                //msend.execute(firefox_btn.getText().toString());
            }
        });

        vlcubu_btn.setOnClickListener(new View.OnClickListener() {
            final MessegeSender msend = new MessegeSender();
            @Override
            public void onClick(View view) {
                new MessegeSender().execute(vlcubu_btn.getText().toString());
                //msend.execute(vlcubu_btn.getText().toString());
            }
        });

        poweroff_btn.setOnClickListener(new View.OnClickListener() {
            final MessegeSender msend = new MessegeSender();
            @Override
            public void onClick(View view) {
                new MessegeSender().execute(poweroff_btn.getText().toString());
                //msend.execute(poweroff_btn.getText().toString());
            }
        });

        restUbu_btn.setOnClickListener(new View.OnClickListener() {
            final MessegeSender msend = new MessegeSender();
            @Override
            public void onClick(View view) {
                new MessegeSender().execute(restUbu_btn.getText().toString());
                //msend.execute(restUbu_btn.getText().toString());
            }
        });

        notepad_btn.setOnClickListener(new View.OnClickListener() {
            final MessegeSender msend = new MessegeSender();
            @Override
            public void onClick(View view) {
                new MessegeSender().execute(notepad_btn.getText().toString());
                //msend.execute(notepad_btn.getText().toString());
            }
        });

        chrome_btn.setOnClickListener(new View.OnClickListener() {
            final MessegeSender msend = new MessegeSender();
            @Override
            public void onClick(View view) {
                new MessegeSender().execute(chrome_btn.getText().toString());
                //msend.execute(chrome_btn.getText().toString());
            }
        });

        vlc_btn.setOnClickListener(new View.OnClickListener() {
            final MessegeSender msend = new MessegeSender();
            @Override
            public void onClick(View view) {
                new MessegeSender().execute(vlc_btn.getText().toString());
           //     msend.execute(vlc_btn.getText().toString());
            }
        });

        restart_btn.setOnClickListener(new View.OnClickListener() {
            final MessegeSender msend = new MessegeSender();
            @Override
            public void onClick(View view) {
                new MessegeSender().execute(restart_btn.getText().toString());
                //msend.execute(restart_btn.getText().toString());
            }
        });

        shutdown_btn.setOnClickListener(new View.OnClickListener() {
            final MessegeSender msend = new MessegeSender();
            @Override
            public void onClick(View view) {
                new MessegeSender().execute(shutdown_btn.getText().toString());
                //msend.execute(shutdown_btn.getText().toString());
            }
        });

        forward_btn.setOnClickListener(new View.OnClickListener() {
            final MessegeSender msend = new MessegeSender();
            @Override
            public void onClick(View view) {
                new MessegeSender().execute(forward_btn.getText().toString());
             //   msend.execute(forward_btn.getText().toString());

            }
        });

        backward_btn.setOnClickListener(new View.OnClickListener() {
            final MessegeSender msend = new MessegeSender();
            @Override
            public void onClick(View view) {
                new MessegeSender().execute(backward_btn.getText().toString());
               // msend.execute(backward_btn.getText().toString());
            }
        });

        textwatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String ddd;
                ddd = edittext.getText().toString();
                new MessegeSender().execute(ddd.substring(ddd.length() - 1));
                   //new MessegeSender().execute(ddd);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };
        edittext.addTextChangedListener(textwatcher);


       // below key listener is used to detect only erase key on keyboard
        edittext.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if(keyCode == KeyEvent.KEYCODE_DEL) {
                    new MessegeSender().execute("\b");
                }
                return false;
            }
        });
       // msend.execute(e1.getText().toString());
    }


}
