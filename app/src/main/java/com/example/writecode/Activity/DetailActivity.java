package com.example.writecode.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.bumptech.glide.Glide;
import com.example.writecode.Domain.Foods;
import com.example.writecode.R;
import com.example.writecode.Helper.ManagementCart;
import com.example.writecode.databinding.ActivityDetailBinding;

public class DetailActivity extends BaseActivity {
    ActivityDetailBinding binding;
private Foods object;
private int num=1;
private ManagementCart managementCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getWindow().setStatusBarColor(getResources().getColor(R.color.white));
        getIntentExtra();
        setVariable();

    }

    private void setVariable() {
        managementCart=new ManagementCart(this);
        binding.backBtn.setOnClickListener(v -> finish());

        Glide.with(DetailActivity.this)
                .load(object.getImagePath())
                .into(binding.pic);
        binding.priceTxt.setText("R$"+object.getPrice());
        binding.titleTxt.setText(object.getTitle());
        binding.descriptionTxt.setText(object.getDescription());
        binding.rateTxt.setText(object.getStar() + "Rating");
        binding.ratingBar.setRating((float)object.getStar());
        binding.totalTxt.setText((num * object.getPrice()+ "R$"));
        binding.plusBtn.setOnClickListener(v -> {
            num=num+1;
            binding.numberTxt.setText(num+"");
            binding.totalTxt.setText("R$"+num*object.getPrice());
        });
        binding.minusBtn.setOnClickListener(v -> {
            if(num>1){
                num=num-1;
                binding.numberTxt.setText(num+"");
                binding.totalTxt.setText("R$"+(num*object.getPrice()));
            }

        });
        binding.addBtn.setOnClickListener(v -> {
            object.setNumberInCart(num);
            managementCart.insertFood(object);
        });
    }

    private void getIntentExtra() {
        object= (Foods) getIntent().getSerializableExtra("object");

    }
}