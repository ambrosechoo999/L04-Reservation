package sg.edu.rp.c346.id20008189.l04_reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnSubmit;
    Button btnReset;
    TextView tvShow;
    DatePicker dp;
    TimePicker tp;
    EditText etName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tp= findViewById(R.id.tp);
        btnSubmit=findViewById(R.id.setRes);
        btnReset=findViewById(R.id.btnReset);
        dp=findViewById(R.id.dp);
        tvShow=findViewById(R.id.tvShow);
        etName=findViewById(R.id.etName);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Reservation has been set!",Toast.LENGTH_LONG).show();
                String date ="Reservation for "+dp.getDayOfMonth() + "/"+(dp.getMonth()+1)+"/"+dp.getYear() +" "+"\n"+ " "+ tp.getCurrentHour()+":"+tp.getCurrentMinute();

                tvShow.setText(date);
            }

        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Reservation has been reset!",Toast.LENGTH_LONG).show();
                tvShow.setText("");
            }
        });

    }
}