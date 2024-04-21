package com.example.homework_4_aae;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    // поля
    private TextView output;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        output = findViewById(R.id.output);
        button = findViewById(R.id.button);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            Ticket tick = (Ticket) bundle.getSerializable(Ticket.class.getSimpleName());
            output.setText("ID пользователя: " + tick.getID() + "\n"
                    +"Номер места в автобусе: " + tick.getPlace() + "\n"
                    + "Время отправления автобуса: " + tick.getTime() + "\n"
                    + "Время прибытия автобуса: " + tick.getTime1() + "\n"
                    + "Цена билета: " + Math.round(tick.getPrice()) + " монет");
        }

        button.setOnClickListener(listener);
    }

    // создание слушателя
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        }
    };
}