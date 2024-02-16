package com.example.writecode.Activity;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.writecode.R;
import com.google.firebase.Firebase;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.auth.FirebaseAuth;

public class BaseActivity extends AppCompatActivity {
    FirebaseAuth mAuth;
    FirebaseDatabase database;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        database=FirebaseDatabase.getInstance();
        getWindow().setStatusBarColor(getResources().getColor(R.color.white));
    }

}
