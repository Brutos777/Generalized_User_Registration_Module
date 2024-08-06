package com.example.final_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Criminal_Background extends AppCompatActivity {

    byte [] byteArray;
    String firstname, lastname, email, gender, phone, height, weight, civilStatus, pagibigNo, philHealthNo, tinNo,
            gsisNo, fullNameEmergency, contactEmergency, relationship, elemSchool, elemBasicEdu, secondSchool, secondBasicEdu,
            vocationalSchool, vocationalBasicEdu, collegeSchool, collegeBasicEdu, graduateSchool, graduateBasicEdu, crimQues1,
            crimQues2, crimQues3, crimQues4A, crimQues4B, crimQues4C;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criminal_background);
        setTitle("Criminal Background");

        Bundle i = getIntent().getExtras();
        byteArray = i.getByteArray("IMAGEARRAY");

        Intent intent = getIntent();
        firstname = intent.getStringExtra("FIRSTNAME");
        lastname = intent.getStringExtra("LASTNAME");
        email = intent.getStringExtra("EMAIL");
        gender = intent.getStringExtra("GENDER");
        phone = intent.getStringExtra("PHONE");
        height = intent.getStringExtra("HEIGHT");
        weight = intent.getStringExtra("WEIGHT");
        civilStatus = intent.getStringExtra("CIVILSTATUS");
        pagibigNo = intent.getStringExtra("PAGIBIGNO");
        philHealthNo = intent.getStringExtra("PHILHEALTHNO");
        tinNo = intent.getStringExtra("TINNO");
        gsisNo = intent.getStringExtra("GSISNO");
        fullNameEmergency = intent.getStringExtra("FULLNAMEEMERGENCY");
        contactEmergency = intent.getStringExtra("CONTACTEMERGENCY");
        relationship = intent.getStringExtra("RELATIONSHIP");
        elemSchool = intent.getStringExtra("ELEMSCHOOLNAME");
        elemBasicEdu = intent.getStringExtra("ELEMBASICEDU");
        secondSchool = intent.getStringExtra("SECONDSCHOOLNAME");
        secondBasicEdu = intent.getStringExtra("SECONDBASICEDU");
        vocationalSchool = intent.getStringExtra("VOCATIONALSCHOOLNAME");
        vocationalBasicEdu = intent.getStringExtra("VOCATIONALBASICEDU");
        collegeSchool = intent.getStringExtra("COLLEGESCHOOLNAME");
        collegeBasicEdu = intent.getStringExtra("COLLEGEBASICEDU");
        graduateSchool = intent.getStringExtra("GRADUATESCHOOLNAME");
        graduateBasicEdu = intent.getStringExtra("GRADUATEBASICEDU");

        RadioGroup rgCrimQues1 = findViewById(R.id.rgCrimQues1);
        RadioGroup rgCrimQues2 = findViewById(R.id.rgCrimQues2);
        RadioGroup rgCrimQues3 = findViewById(R.id.rgCrimQues3);
        RadioGroup rgCrimQues4A = findViewById(R.id.rgCrimQues4A);
        RadioGroup rgCrimQues4B = findViewById(R.id.rgCrimQues4B);
        RadioGroup rgCrimQues4C = findViewById(R.id.rgCrimQues4C);

        EditText edtCrimQues1 = findViewById(R.id.edtCrimQues1);
        EditText edtCrimQues2 = findViewById(R.id.edtCrimQues2);
        EditText edtCrimQues3 = findViewById(R.id.edtCrimQues3);
        EditText edtCrimQues4A = findViewById(R.id.edtCrimQues4A);
        EditText edtCrimQues4B = findViewById(R.id.edtCrimQues4B);
        EditText edtCrimQues4C = findViewById(R.id.edtCrimQues4C);


        rgCrimQues1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i){
                    case R.id.rbYesQues1:
                        edtCrimQues1.setEnabled(true);
                        break;
                    case R.id.rbNoQues1:
                        edtCrimQues1.setEnabled(false);
                        break;
                }
            }
        });

        rgCrimQues2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i){
                    case R.id.rbYesQues2:
                        edtCrimQues2.setEnabled(true);
                        break;
                    case R.id.rbNoQues2:
                        edtCrimQues2.setEnabled(false);
                        break;
                }
            }
        });

        rgCrimQues3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i){
                    case R.id.rbYesQues3:
                        edtCrimQues3.setEnabled(true);
                        break;
                    case R.id.rbNoQues3:
                        edtCrimQues3.setEnabled(false);
                        break;
                }
            }
        });

        rgCrimQues4A.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i){
                    case R.id.rbYesQues4A:
                        edtCrimQues4A.setEnabled(true);
                        break;
                    case R.id.rbNoQues4A:
                        edtCrimQues4A.setEnabled(false);
                        break;
                }
            }
        });

        rgCrimQues4B.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i){
                    case R.id.rbYesQues4B:
                        edtCrimQues4B.setEnabled(true);
                        break;
                    case R.id.rbNoQues4B:
                        edtCrimQues4B.setEnabled(false);
                        break;
                }
            }
        });

        rgCrimQues4C.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i){
                    case R.id.rbYesQues4C:
                        edtCrimQues4C.setEnabled(true);
                        break;
                    case R.id.rbNoQues4C:
                        edtCrimQues4C.setEnabled(false);
                        break;
                }
            }
        });

    }

    public void submitCrim(View v){

        EditText edtCrimQues1 = findViewById(R.id.edtCrimQues1);
        EditText edtCrimQues2 = findViewById(R.id.edtCrimQues2);
        EditText edtCrimQues3 = findViewById(R.id.edtCrimQues3);
        EditText edtCrimQues4A = findViewById(R.id.edtCrimQues4A);
        EditText edtCrimQues4B = findViewById(R.id.edtCrimQues4B);
        EditText edtCrimQues4C = findViewById(R.id.edtCrimQues4C);

        RadioGroup rgCrimQues1 = findViewById(R.id.rgCrimQues1);
        RadioGroup rgCrimQues2 = findViewById(R.id.rgCrimQues2);
        RadioGroup rgCrimQues3 = findViewById(R.id.rgCrimQues3);
        RadioGroup rgCrimQues4A = findViewById(R.id.rgCrimQues4A);
        RadioGroup rgCrimQues4B = findViewById(R.id.rgCrimQues4B);
        RadioGroup rgCrimQues4C = findViewById(R.id.rgCrimQues4C);

        if(rgCrimQues1.getCheckedRadioButtonId() == -1){
            Toast.makeText(this,"fill-in all necessary information", Toast.LENGTH_SHORT).show();
        } else if (rgCrimQues1.getCheckedRadioButtonId() == R.id.rbYesQues1 && edtCrimQues1.length() == 0){
            Toast.makeText(this,"fill-in the details", Toast.LENGTH_SHORT).show();
        } else if(rgCrimQues2.getCheckedRadioButtonId() == -1){
            Toast.makeText(this,"fill-in all necessary information", Toast.LENGTH_SHORT).show();
        } else if (rgCrimQues2.getCheckedRadioButtonId() == R.id.rbYesQues2 && edtCrimQues2.length() == 0){
            Toast.makeText(this,"fill-in the details", Toast.LENGTH_SHORT).show();
        } else if(rgCrimQues3.getCheckedRadioButtonId() == -1){
            Toast.makeText(this,"fill-in all necessary information", Toast.LENGTH_SHORT).show();
        } else if (rgCrimQues3.getCheckedRadioButtonId() == R.id.rbYesQues3 && edtCrimQues3.length() == 0){
            Toast.makeText(this,"fill-in the details", Toast.LENGTH_SHORT).show();
        } else if(rgCrimQues4A.getCheckedRadioButtonId() == -1){
            Toast.makeText(this,"fill-in all necessary information", Toast.LENGTH_SHORT).show();
        } else if (rgCrimQues4A.getCheckedRadioButtonId() == R.id.rbYesQues4A && edtCrimQues4A.length() == 0){
            Toast.makeText(this,"fill-in the details", Toast.LENGTH_SHORT).show();
        } else if(rgCrimQues4B.getCheckedRadioButtonId() == -1){
            Toast.makeText(this,"fill-in all necessary information", Toast.LENGTH_SHORT).show();
        } else if (rgCrimQues4B.getCheckedRadioButtonId() == R.id.rbYesQues4B && edtCrimQues4B.length() == 0){
            Toast.makeText(this,"fill-in the details", Toast.LENGTH_SHORT).show();
        } else if(rgCrimQues4C.getCheckedRadioButtonId() == -1){
            Toast.makeText(this,"fill-in all necessary information", Toast.LENGTH_SHORT).show();
        } else if (rgCrimQues4C.getCheckedRadioButtonId() == R.id.rbYesQues4C && edtCrimQues4C.length() == 0){
            Toast.makeText(this,"fill-in the details", Toast.LENGTH_SHORT).show();
        } else if ((!(rgCrimQues1.getCheckedRadioButtonId() == -1) && !(edtCrimQues1.length() == 0)) ||
                (!(rgCrimQues2.getCheckedRadioButtonId() == -1) && !(edtCrimQues2.length() == 0)) ||
                (!(rgCrimQues3.getCheckedRadioButtonId() == -1) && !(edtCrimQues3.length() == 0)) ||
                (!(rgCrimQues4A.getCheckedRadioButtonId() == -1) && !(edtCrimQues4A.length() == 0)) ||
                (!(rgCrimQues4B.getCheckedRadioButtonId() == -1) && !(edtCrimQues4B.length() == 0)) ||
                (!(rgCrimQues4C.getCheckedRadioButtonId() == -1) && !(edtCrimQues4C.length() == 0))) {

            crimQues1 = edtCrimQues1.getText().toString();
            crimQues2 = edtCrimQues2.getText().toString();
            crimQues3 = edtCrimQues3.getText().toString();
            crimQues4A = edtCrimQues4A.getText().toString();
            crimQues4B = edtCrimQues4B.getText().toString();
            crimQues4C = edtCrimQues4C.getText().toString();

            NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
            builder.setContentTitle("Information processed!");
            builder.setContentText("Press to view results");
            builder.setSmallIcon(R.drawable.baseline_waving_hand_24);
            builder.setAutoCancel(true);

            Intent i = new Intent(this, Report_Activity.class);
            i.putExtra("IMAGEARRAY", byteArray);
            i.putExtra("FIRSTNAME", firstname);
            i.putExtra("LASTNAME", lastname);
            i.putExtra("EMAIL", email);
            i.putExtra("GENDER", gender);
            i.putExtra("PHONE", phone);
            i.putExtra("HEIGHT", height);
            i.putExtra("WEIGHT", weight);
            i.putExtra("CIVILSTATUS", civilStatus);
            i.putExtra("PAGIBIGNO", pagibigNo);
            i.putExtra("PHILHEALTHNO", philHealthNo);
            i.putExtra("TINNO", tinNo);
            i.putExtra("GSISNO", gsisNo);
            i.putExtra("FULLNAMEEMERGENCY", fullNameEmergency);
            i.putExtra("CONTACTEMERGENCY", contactEmergency);
            i.putExtra("RELATIONSHIP", relationship);
            i.putExtra("ELEMSCHOOLNAME", elemSchool);
            i.putExtra("ELEMBASICEDU", elemBasicEdu);
            i.putExtra("SECONDSCHOOLNAME", secondSchool);
            i.putExtra("SECONDBASICEDU", secondBasicEdu);
            i.putExtra("VOCATIONALSCHOOLNAME", vocationalSchool);
            i.putExtra("VOCATIONALBASICEDU", vocationalBasicEdu);
            i.putExtra("COLLEGESCHOOLNAME", collegeSchool);
            i.putExtra("COLLEGEBASICEDU", collegeBasicEdu);
            i.putExtra("GRADUATESCHOOLNAME", graduateSchool);
            i.putExtra("GRADUATEBASICEDU", graduateBasicEdu);
            i.putExtra("CRIMQUES1", crimQues1);
            i.putExtra("CRIMQUES2", crimQues2);
            i.putExtra("CRIMQUES3", crimQues3);
            i.putExtra("CRIMQUES4A", crimQues4A);
            i.putExtra("CRIMQUES4B", crimQues4B);
            i.putExtra("CRIMQUES4C", crimQues4C);

            PendingIntent pi = PendingIntent.getActivity(this, 0, i, PendingIntent.FLAG_UPDATE_CURRENT);
            builder.setContentIntent(pi);

            NotificationManager notifMan = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
            notifMan.notify(0, builder.build());
        }

    }
}
