package com.example.jjhomeoclinic;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.example.jjhomeoclinic.R;

public class MainActivity extends AppCompatActivity {
    Button btnDoctorInfo, btnServices, btnAppointments, btnContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDoctorInfo = findViewById(R.id.btnDoctorInfo);
        btnServices = findViewById(R.id.btnServices);
        btnAppointments = findViewById(R.id.btnAppointments);
        btnContact = findViewById(R.id.btnContact);

        btnDoctorInfo.setOnClickListener(v -> startActivity(new Intent(this, DoctorInfoActivity.class)));
        btnServices.setOnClickListener(v -> startActivity(new Intent(this, ServicesActivity.class)));
        btnAppointments.setOnClickListener(v -> startActivity(new Intent(this, AppointmentActivity.class)));
        btnContact.setOnClickListener(v -> {
            String whatsappUrl = "https://wa.me/919123456789";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(whatsappUrl));
            startActivity(intent);
        });
    }
}
