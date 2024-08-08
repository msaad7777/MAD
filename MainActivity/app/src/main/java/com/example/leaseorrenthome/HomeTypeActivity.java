package com.example.leaseorrenthome;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.appcompat.app.AppCompatActivity;

public class HomeTypeActivity extends AppCompatActivity {

    private RadioGroup homeTypeRadioGroup;
    private RadioButton radioApartment, radioDetachedHome, radioSemiDetachedHome, radioCondominium, radioTownhouse;
    private Button continueButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_type);

        homeTypeRadioGroup = findViewById(R.id.homeTypeRadioGroup);
        radioApartment = findViewById(R.id.radio_apartment);
        radioDetachedHome = findViewById(R.id.radio_detached_home);
        radioSemiDetachedHome = findViewById(R.id.radio_semi_detached_home);
        radioCondominium = findViewById(R.id.radio_condominium);
        radioTownhouse = findViewById(R.id.radio_townhouse);
        continueButton = findViewById(R.id.continueButton);

        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = homeTypeRadioGroup.getCheckedRadioButtonId();
                Intent intent = null;

                if (selectedId == radioApartment.getId()) {
                    intent = new Intent(HomeTypeActivity.this, ApartmentActivity.class);
                } else if (selectedId == radioDetachedHome.getId()) {
                    intent = new Intent(HomeTypeActivity.this, DetachedHomeActivity.class);
                } else if (selectedId == radioSemiDetachedHome.getId()) {
                    intent = new Intent(HomeTypeActivity.this, SemiDetachedHomeActivity.class);
                } else if (selectedId == radioCondominium.getId()) {
                    intent = new Intent(HomeTypeActivity.this, CondominiumActivity.class);
                } else if (selectedId == radioTownhouse.getId()) {
                    intent = new Intent(HomeTypeActivity.this, TownhouseActivity.class);
                }

                if (intent != null) {
                    startActivity(intent);
                }
            }
        });
    }
}
