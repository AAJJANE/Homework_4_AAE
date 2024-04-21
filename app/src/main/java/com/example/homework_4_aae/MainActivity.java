package com.example.homework_4_aae;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // поля
    private EditText inputId, place1, time, time1, price1;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // привязка разметки к полям
        inputId = findViewById(R.id.inputId);
        place1 = findViewById(R.id.inputPLace);
        time = findViewById(R.id.inputTime);
        time1 = findViewById(R.id.inputTime1);
        price1 = findViewById(R.id.inputPrice);
        button = findViewById(R.id.button);

        // обработка нажатия кнопки
        button.setOnClickListener(listener);
    }

    // создание слушателя
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            // считывание введённых данных
            int ID = Integer.parseInt(inputId.getText().toString());
            int place = Integer.parseInt(place1.getText().toString());
            String time = MainActivity.this.time.getText().toString();
            String time1 = MainActivity.this.time1.getText().toString();
            int price = Integer.parseInt(price1.getText().toString());

            Ticket ticket = new Ticket(ID, place, time, time1, price);

            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);

            intent.putExtra(Ticket.class.getSimpleName(), ticket);

            startActivity(intent);
        }
    };
}