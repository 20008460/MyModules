package sg.edu.rp.c346.id20008460.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailsActivity extends AppCompatActivity {

    TextView tvAns;
    Button btnBck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_details);

        Intent intentReceive = getIntent();
        String moduleSelected =  intentReceive.getStringExtra("code"); // case sensitive
        String moduleName =  intentReceive.getStringExtra("name");
        Integer moduleYear =  intentReceive.getIntExtra("year", 0); // case sensitive
        Integer moduleSem =  intentReceive.getIntExtra("sem", 0 );
        Integer moduleCredit =  intentReceive.getIntExtra("modCredit" , 0); // case sensitive
        String moduleVenue =  intentReceive.getStringExtra("venue");

        tvAns = findViewById(R.id.textView);
        btnBck = findViewById(R.id.btnBack);

        if (moduleSelected.equalsIgnoreCase("C346")) {
            tvAns.setText("Module Code : " + moduleSelected + "\n" + "Module Name : " + moduleName +
            "\n" + "Year : " + moduleYear + "\n" + "Academic Year : " + moduleSem + "\n" + "Module Credit : " + moduleCredit + "\n" + "Venue : " + moduleVenue);

        } else if (moduleSelected.equalsIgnoreCase("C328")) {
            tvAns.setText("Module Code : " + moduleSelected + "\n" + "Module Name : " + moduleName +
                    "\n" + "Year : " + moduleYear + "\n" + "Academic Year : " + moduleSem + "\n" + "Module Credit : " + moduleCredit + "\n" + "Venue : " + moduleVenue);

        } else if (moduleSelected.equalsIgnoreCase("C203")) {
            tvAns.setText("Module Code : " + moduleSelected + "\n" + "Module Name : " + moduleName +
                    "\n" + "Year : " + moduleYear + "\n" + "Academic Year : " + moduleSem + "\n" + "Module Credit : " + moduleCredit + "\n" + "Venue : " + moduleVenue);

        } else if (moduleSelected.equalsIgnoreCase("C228")) {
            tvAns.setText("Module Code : " + moduleSelected + "\n" + "Module Name : " + moduleName +
                    "\n" + "Year : " + moduleYear + "\n" + "Academic Year : " + moduleSem + "\n" + "Module Credit : " + moduleCredit + "\n" + "Venue : " + moduleVenue);

        } else if (moduleSelected.equalsIgnoreCase("C331")) {
            tvAns.setText("Module Code : " + moduleSelected + "\n" + "Module Name : " + moduleName +
                    "\n" + "Year : " + moduleYear + "\n" + "Academic Year : " + moduleSem + "\n" + "Module Credit : " + moduleCredit + "\n" + "Venue : " + moduleVenue);

        } else if (moduleSelected.equalsIgnoreCase("C328")) {
            tvAns.setText("Module Code : " + moduleSelected + "\n" + "Module Name : " + moduleName +
                    "\n" + "Year : " + moduleYear + "\n" + "Academic Year : " + moduleSem + "\n" + "Module Credit : " + moduleCredit + "\n" + "Venue : " + moduleVenue);
        }

        btnBck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentBack = new Intent(ModuleDetailsActivity.this, MainActivity.class);
                startActivity(intentBack);
            }
        });

    }
}