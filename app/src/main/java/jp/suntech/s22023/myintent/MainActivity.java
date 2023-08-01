package jp.suntech.s22023.myintent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editTextName;
    private EditText editTextAddress;
    private TextView textViewGreeting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.editTextName);
        editTextAddress = findViewById(R.id.editTextAddress);
        textViewGreeting = findViewById(R.id.textViewGreeting);

        Button buttonDisplay = findViewById(R.id.buttonDisplay);
        buttonDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayGreeting();
            }
        });

        Button buttonClearName = findViewById(R.id.buttonClearName);
        buttonClearName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearName();
            }
        });

        Button buttonClearAddress = findViewById(R.id.buttonClearAddress);
        buttonClearAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearAddress();
            }
        });
    }

    private void displayGreeting() {
        String name = editTextName.getText().toString();
        String address = editTextAddress.getText().toString();
        String greeting = name + "さんにお住いの" + address + "、こんにちは！";
        textViewGreeting.setText(greeting);
    }

    private void clearName() {
        editTextName.setText("");
    }

    private void clearAddress() {
        editTextAddress.setText("");
    }
}