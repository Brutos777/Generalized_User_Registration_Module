package com.example.final_project;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;

public class MainActivity extends AppCompatActivity {

    Bitmap img;
    String gender, civilStatus, select, mother, father, brother, sister, wife, husband, others, relationship;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Personal Background");

        Spinner spinnerRelationship = findViewById(R.id.spinnerRelationship);
        RadioGroup rgGender = findViewById(R.id.rgGender);
        RadioGroup rgCivilStatus = findViewById(R.id.rgCivilStatus);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(MainActivity.this, R.array.relationship_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerRelationship.setAdapter(adapter);

        spinnerRelationship.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 1:
                        relationship = adapterView.getItemAtPosition(i).toString();
                        mother = relationship;
                        break;
                    case 2:
                        relationship = adapterView.getItemAtPosition(i).toString();
                        father = relationship;
                        break;
                    case 3:
                        relationship = adapterView.getItemAtPosition(i).toString();
                        brother = relationship;
                        break;
                    case 4:
                        relationship = adapterView.getItemAtPosition(i).toString();
                        sister = relationship;
                        break;
                    case 5:
                        relationship = adapterView.getItemAtPosition(i).toString();
                        wife = relationship;
                        break;
                    case 6:
                        relationship = adapterView.getItemAtPosition(i).toString();
                        husband = relationship;
                        break;
                    case 7:
                        relationship = adapterView.getItemAtPosition(i).toString();
                        others = relationship;
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        rgGender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i){
                    case R.id.rbMale:
                        gender = "Male";
                        break;
                    case R.id.rbFemale:
                        gender = "Female";
                        break;
                }
            }
        });

        rgCivilStatus.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i){
                    case R.id.rbSingle:
                        civilStatus = "Single";
                        break;
                    case R.id.rbMarried:
                        civilStatus = "Married";
                        break;
                    case R.id.rbSeparated:
                        civilStatus = "Separated";
                        break;
                    case R.id.rbWidowed:
                        civilStatus = "Widowed";
                        break;
                    case R.id.rbOthers:
                        civilStatus = "Others";
                        break;
                }
            }
        });

    }

    public void submit(View v){

        EditText edtFirstname = findViewById(R.id.edtFirstName);
        EditText edtLastname = findViewById(R.id.edtLastname);
        EditText edtEmail = findViewById(R.id.edtEmail);
        EditText edtPhone = findViewById(R.id.edtPhone);
        EditText edtHeight = findViewById(R.id.edtHeight);
        EditText edtWeight = findViewById(R.id.edtWeight);
        EditText edtPagibigNo = findViewById(R.id.edtPagibigNo);
        EditText edtPhilHealth = findViewById(R.id.edtPhilhealth);
        EditText edtTinNo = findViewById(R.id.edtTinNo);
        EditText edtGSISNo = findViewById(R.id.edtGSISNo);
        EditText edtFullNameEmergency = findViewById(R.id.edtFullNameEmergency);
        EditText edtContactEmergency = findViewById(R.id.edtContactEmergency);

        RadioGroup rgGender = findViewById(R.id.rgGender);
        RadioGroup rgCivilStatus = findViewById(R.id.rgCivilStatus);
        Spinner spinnerRelationship = findViewById(R.id.spinnerRelationship);


        if (edtFirstname.length() == 0 || edtLastname.length() == 0 || edtEmail.length() == 0 || rgGender.getCheckedRadioButtonId() == -1 ||
        edtPhone.length() == 0 || edtHeight.length() == 0 || edtWeight.length() == 0 || rgCivilStatus.getCheckedRadioButtonId() == -1 ||
        edtFullNameEmergency.length() == 0 || edtContactEmergency.length() == 0 || spinnerRelationship.getSelectedItemPosition() == 0){

            Toast.makeText(this, "fill-in all necessary information", Toast.LENGTH_SHORT).show();

            if (edtFirstname.length() == 0){
                edtFirstname.setError("Shouldn't be blank");
            } else if (edtLastname.length() == 0){
                edtLastname.setError("Shouldn't be blank");
            } else if (edtEmail.length() == 0){
                edtEmail.setError("Shouldn't be blank");
            } else if (rgGender.getCheckedRadioButtonId() == -1){
                Toast.makeText(this, "Please select a gender", Toast.LENGTH_SHORT).show();
            } else if (edtPhone.length() == 0){
                edtPhone.setError("Shouldn't be blank");
            } else if (edtHeight.length() == 0){
                edtHeight.setError("Shouldn't be blank");
            } else if (edtWeight.length() == 0){
                edtWeight.setError("Shouldn't be blank");
            } else if (rgCivilStatus.getCheckedRadioButtonId() == -1){
                Toast.makeText(this, "Please select a civil status", Toast.LENGTH_SHORT).show();
            } else if (edtFullNameEmergency.length() == 0){
                edtFullNameEmergency.setError("Shouldn't be blank");
            } else if (edtContactEmergency.length() == 0){
                edtContactEmergency.setError("Shouldn't be blank");
            } else if (spinnerRelationship.getSelectedItemPosition() == 0) {
                Toast.makeText(this, "Please select a relationship", Toast.LENGTH_SHORT).show();
            }

        } else {
            String firstname = edtFirstname.getText().toString();
            String lastname = edtLastname.getText().toString();
            String email = edtEmail.getText().toString();
            String phone = edtPhone.getText().toString();
            String height = edtHeight.getText().toString();
            String weight = edtWeight.getText().toString();
            String pagibigNo = edtPagibigNo.getText().toString();
            String philHealthNo = edtPhilHealth.getText().toString();
            String tinNo = edtTinNo.getText().toString();
            String gsisNo = edtGSISNo.getText().toString();
            String fullNameEmergency = edtFullNameEmergency.getText().toString();
            String contactEmergency = edtContactEmergency.getText().toString();

            if (img != null){
                ByteArrayOutputStream bytes = new ByteArrayOutputStream();
                img.compress(Bitmap.CompressFormat.JPEG, 100, bytes);
                byte[] photoByteArray = bytes.toByteArray();

                    Intent i = new Intent(this, Educational_Background.class);
                    i.putExtra("IMAGEARRAY", photoByteArray);
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
                    startActivity(i);

            } else {
                Toast.makeText(this,"Please take a photo", Toast.LENGTH_SHORT).show();
            }
        }

    }

    public void openCamera(View v){
        Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(cameraIntent, 22);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == RESULT_OK){
            ImageView imgViewPersonalBackground = findViewById(R.id.imgViewPersonalBackground);
            img = (Bitmap) data.getExtras().get("data");
            imgViewPersonalBackground.setImageBitmap(img);
        } else {
            Toast.makeText(this, "The process has been cancelled", Toast.LENGTH_SHORT).show();
        }

    }
}