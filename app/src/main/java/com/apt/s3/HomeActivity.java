package com.apt.s3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnHome;
    TextView tvHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btnHome = findViewById(R.id.idHome);
        btnHome.setOnClickListener(this);

        Intent intent = getIntent();
        String data = intent.getStringExtra("usb");
        tvHome = findViewById(R.id.nameUsb);
        tvHome.setText(data);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.idHome:
                goToMain();
                break;
                default: break;
        }
    }

    private void goToMain() {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("usbNameEdit", tvHome.getText().toString());
        startActivity(intent);
    }


}
