package com.example.writecode.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.example.writecode.Activity.MainActivity;
import com.example.writecode.R;
import com.example.writecode.databinding.ActivityIntroBinding;

public class IntroActivity extends BaseActivity {
    ActivityIntroBinding binding;
    private EditText editTextDecimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        editTextDecimal = findViewById(R.id.editTextNumberDecimal);
        Button button = findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextDecimal.getText().toString().isEmpty()) {
                    Toast.makeText(IntroActivity.this, "Preencha o campo antes de continuar", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(IntroActivity.this, MainActivity.class);
                    startActivity(intent);

                }
            }
        });
    }
}
