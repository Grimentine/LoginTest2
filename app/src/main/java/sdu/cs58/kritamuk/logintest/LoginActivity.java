package sdu.cs58.kritamuk.logintest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    //1. Explicit ประกาศตัวแปรยน java
    EditText nameEditText,usernameEditText, passwordEditText;
    Button loginButton;
    String nameString, userString, passString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //2. Initial view ผูกตัวแปรบน java ให้รู้จักกับ element บน xml
        nameEditText = findViewById(R.id.txtName);
        usernameEditText = findViewById(R.id.txtUsername);
        passwordEditText = findViewById(R.id.txtPassword);
        loginButton = findViewById(R.id.btnLogin);
        //3. เมื่อ User ทำการคลิกปุ่ม Login
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nameString = nameEditText.getText().toString().trim();
                //Toast.makeText(getApplicationContext(),"Hello " + nameString,Toast.LENGTH_SHORT).show();

                userString = usernameEditText.getText().toString() .trim();
                passString = passwordEditText.getText() .toString() .trim();

                //ตรวจสอบช่องว่าง or ค่าว่าง
                if ((nameString.length()==0)||(userString.length()==0)||(passString.length()==0)) {
                    Toast.makeText(getApplicationContext(), "กรุณาใส่ข้อมูลให้ครบทุกช่อง", Toast.LENGTH_SHORT).show();
                }

                //ตรวจสอบการ Login ผ่านคำสั่ง if & else
                if ((userString.equals("admin"))&& (passString.equals("1234"))) {
                    Toast.makeText(getApplicationContext(), "Login Success", Toast.LENGTH_SHORT).show();

                    //ส่งผู้ใช้ไปยังหน้าหลัก
                    Intent mainIntent = new Intent(LoginActivity.this, MainActivity.class);
                    mainIntent.putExtra("nameString", nameString);
                    startActivity(mainIntent);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Login Fail", Toast.LENGTH_SHORT).show();
                }
            }
        }); // end onClicklistener

    } //end method onCreate
} // end class
