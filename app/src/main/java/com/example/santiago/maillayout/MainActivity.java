package com.example.santiago.maillayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText eTo, eSubject, eMessage;
    Button bSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eTo = (EditText) findViewById(R.id.eTo);
        eSubject = (EditText) findViewById(R.id.eSubject);
        eMessage = (EditText) findViewById(R.id.eMessage);
        bSend = (Button) findViewById(R.id.bSend);

        bSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1, num2, total;
                num1 = Integer.parseInt(eTo.getText().toString());
                num2 = Integer.parseInt(eSubject.getText().toString());
                total = num1 + num2;
                eMessage.setText(String.valueOf(total));

            }
        });

    }
}
