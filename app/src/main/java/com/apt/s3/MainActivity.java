package com.apt.s3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btLogin;
    EditText editName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btLogin = findViewById(R.id.btLogin);
        btLogin.setOnClickListener(this);
        editName = findViewById(R.id.editNameUsb);
        Intent intent = getIntent();
        String usbEditName = getIntent().getStringExtra("usbNameEdit");
        editName.setText(usbEditName);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btLogin:
                goToHome();
                break;
                default: break;
        }
    }

    public void goToHome() {
        Intent intent = new Intent(this, HomeActivity.class);
        intent.putExtra("usb", editName.getText().toString());
        startActivity(intent);
    }
}
