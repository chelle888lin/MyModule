package sg.edu.rp.c346.id20028636.mymodule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvResult;
    TextView tvModule;
    Button btnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvResult = findViewById(R.id.textView2);
        tvModule = findViewById(R.id.textView1);
        btnHome = findViewById(R.id.button);

        Intent intent = getIntent();
        String results = String.format("Module Name: %s\nModule Code: %s"
                ,intent.getStringExtra("ModuleName"),
                intent.getStringExtra("ModuleCode"));
        tvModule.setText(results);

        Intent intent = getIntent();
        String result = String.format("Module Name: %s\nModule Code: %s\nAcademic Year: %s\nSemester: %s\nModule Credit: %s\nVenue: %s"
                ,intent.getStringExtra("ModuleName"),
                intent.getStringExtra("ModuleCode"),
                intent.getStringExtra("AcademicYear"),
                intent.getIntExtra("Semester",0),
                intent.getIntExtra("ModuleCredit",0),
                intent.getStringExtra("Venue"));
        tvResult.setText(result);

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}