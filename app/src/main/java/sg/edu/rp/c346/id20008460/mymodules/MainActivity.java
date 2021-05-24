package sg.edu.rp.c346.id20008460.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView C346 , C328 , C203 , C228 , C331;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        C346 = findViewById(R.id.c346);
        C328 = findViewById(R.id.c328);
        C203 = findViewById(R.id.c203);
        C228 = findViewById(R.id.c228);
        C331 = findViewById(R.id.c331);


        //C346
        C346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCode = new Intent(MainActivity.this, ModuleDetailsActivity.class);
                intentCode.putExtra("code","C346");
                intentCode.putExtra("name","Android Programming");
                intentCode.putExtra("year",2021);
                intentCode.putExtra("sem",1);
                intentCode.putExtra("modCredit",4);
                intentCode.putExtra("venue","E62E");

                startActivity(intentCode);

            }
        });

        //C328
        C328.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCode = new Intent(MainActivity.this, ModuleDetailsActivity.class);
                intentCode.putExtra("code","C328");
                intentCode.putExtra("name","Intelligent Network");
                intentCode.putExtra("year",2021);
                intentCode.putExtra("sem",1);
                intentCode.putExtra("modCredit",4);
                intentCode.putExtra("venue","E62C");
                startActivity(intentCode);
            }
        });

        //C203
        C203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCode = new Intent(MainActivity.this, ModuleDetailsActivity.class);
                intentCode.putExtra("code","C203");
                intentCode.putExtra("name","Web Application in PHP");
                intentCode.putExtra("year",2021);
                intentCode.putExtra("sem",1);
                intentCode.putExtra("modCredit",4);
                intentCode.putExtra("venue","W67L");
                startActivity(intentCode);
            }
        });

        //C228
        C228.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCode = new Intent(MainActivity.this, ModuleDetailsActivity.class);
                intentCode.putExtra("code","C228");
                intentCode.putExtra("name","Operating System Security");
                intentCode.putExtra("year",2021);
                intentCode.putExtra("sem",1);
                intentCode.putExtra("modCredit",4);
                intentCode.putExtra("venue","E62L");
                startActivity(intentCode);
            }
        });

        //C331
        C331.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCode = new Intent(MainActivity.this, ModuleDetailsActivity.class);
                intentCode.putExtra("code","C331");
                intentCode.putExtra("name","Digital Security and Forensic");
                intentCode.putExtra("year",2021);
                intentCode.putExtra("sem",1);
                intentCode.putExtra("modCredit",4);
                intentCode.putExtra("venue","W61J");
                startActivity(intentCode);
            }
        });




    }
}