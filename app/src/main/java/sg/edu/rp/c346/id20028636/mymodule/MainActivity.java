package sg.edu.rp.c346.id20028636.mymodule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1;
    TextView tv2;
    TextView tv3;
    ImageView im1;
    ImageView im2;
    ImageView im3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.textView1);
        tv2 = findViewById(R.id.textView2);
        tv3 = findViewById(R.id.textView2);
        im1 = findViewById(R.id.imageView1);
        im2 = findViewById(R.id.imageView2);
        im3 = findViewById(R.id.imageView3);

        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("ModuleName","Mobile App Development");
                intent.putExtra("ModuleCode","C346-3D-E62E-A");
                intent.putExtra("AcademicYear","2022");
                intent.putExtra("Semester","1");
                intent.putExtra("ModuleCredit",4);
                intent.putExtra("Venue","E62E");
                startActivity(intent);
            }
        });

        im2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("ModuleName","Web Appln Development in php");
                intent.putExtra("ModuleCode","C203-4D-W65H-A");
                intent.putExtra("AcademicYear","2022");
                intent.putExtra("Semester",1);
                intent.putExtra("ModuleCredit",4);
                intent.putExtra("Venue","W65H");
                startActivity(intent);
            }
        });

        im3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("ModuleName","UI/UX Design for Apps");
                intent.putExtra("ModuleCode","C218-1D-E66B-A");
                intent.putExtra("AcademicYear","2022");
                intent.putExtra("Semester",1);
                intent.putExtra("ModuleCredit",4);
                intent.putExtra("Venue","E66B");
                startActivity(intent);
            }
        });

        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("ModuleName","Mobile App Development");
                intent.putExtra("ModuleCode","C346-3D-E62E-A");
                intent.putExtra("AcademicYear","2022");
                intent.putExtra("Semester","1");
                intent.putExtra("ModuleCredit",4);
                intent.putExtra("Venue","E62E");
                startActivity(intent);
            }
        });

        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("ModuleName","Web Appln Development in php");
                intent.putExtra("ModuleCode","C203-4D-W65H-A");
                intent.putExtra("AcademicYear","2022");
                intent.putExtra("Semester",1);
                intent.putExtra("ModuleCredit",4);
                intent.putExtra("Venue","W65H");
                startActivity(intent);
            }
        });

        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("ModuleName","UI/UX Design for Apps");
                intent.putExtra("ModuleCode","C218-1D-E66B-A");
                intent.putExtra("AcademicYear","2022");
                intent.putExtra("Semester",1);
                intent.putExtra("ModuleCredit",4);
                intent.putExtra("Venue","E66B");
                startActivity(intent);
            }
        });
    }
}