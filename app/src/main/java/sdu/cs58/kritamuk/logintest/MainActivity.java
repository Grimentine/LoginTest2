package sdu.cs58.kritamuk.logintest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //1. Exploit ประกาศตัวแปลบน JAVA
    TextView nameTextView;
    String getNameString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ผูกตัวแปลJava กับ Element บนหน้า UI
        nameTextView = findViewById(R.id.txvName);

        //รับต่า nameString จากหน้า Login
        getNameString = getIntent().getStringExtra("nameString");
        nameTextView.setText("Welcome" + getNameString);

    } // end onCreate
} //end Class
