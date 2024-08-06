package com.example.final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class Educational_Background extends AppCompatActivity {

    byte[] byteArray;
    String firstname, lastname, email, gender, phone, height, weight, civilStatus, pagibigNo, philHealthNo, tinNo,
            gsisNo, fullNameEmergency, contactEmergency, relationship, elemSchool, elemBasicEdu, secondSchool, secondBasicEdu,
            vocationalSchool, vocationalBasicEdu, collegeSchool, collegeBasicEdu, graduateSchool, graduateBasicEdu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_educational_background);
        setTitle("Educational Background");

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

        CheckBox chkElem = findViewById(R.id.chkElementary);
        CheckBox chkSecond = findViewById(R.id.chkSecondary);
        CheckBox chkCollege = findViewById(R.id.chkCollege);
        CheckBox chkGraduate = findViewById(R.id.chkGraduate);

        EditText edtElemSchool = findViewById(R.id.edtElemSchool);
        EditText edtElemBasicEdu = findViewById(R.id.edtElemBasicEdu);
        EditText edtSecondSchool = findViewById(R.id.edtSecondSchool);
        EditText edtSecondBasicEdu = findViewById(R.id.edtSecondBasicEdu);
        EditText edtVocationalSchool = findViewById(R.id.edtVocationalSchool);
        EditText edtVocationalBasicEdu = findViewById(R.id.edtVocationalBasicEdu);
        EditText edtCollegeSchool = findViewById(R.id.edtCollegeSchool);
        EditText edtCollegeBasicEdu = findViewById(R.id.edtCollegeBasicEdu);
        EditText edtGraduateSchool = findViewById(R.id.edtGraduateSchool);
        EditText edtGraduateBasicEdu = findViewById(R.id.edtGraduateBasicEdu);

        chkElem.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                edtElemSchool.setEnabled(isChecked);
                edtElemBasicEdu.setEnabled(isChecked);
            }
        });

        chkSecond.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                edtSecondSchool.setEnabled(isChecked);
                edtSecondBasicEdu.setEnabled(isChecked);
                edtVocationalSchool.setEnabled(isChecked);
                edtVocationalBasicEdu.setEnabled(isChecked);
            }
        });

        chkCollege.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                edtCollegeSchool.setEnabled(isChecked);
                edtCollegeBasicEdu.setEnabled(isChecked);
            }
        });

        chkGraduate.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                edtGraduateSchool.setEnabled(isChecked);
                edtGraduateBasicEdu.setEnabled(isChecked);
            }
        });


    }

    public void submitEduc(View v) {

        EditText edtElemSchool = findViewById(R.id.edtElemSchool);
        EditText edtElemBasicEdu = findViewById(R.id.edtElemBasicEdu);
        EditText edtSecondSchool = findViewById(R.id.edtSecondSchool);
        EditText edtSecondBasicEdu = findViewById(R.id.edtSecondBasicEdu);
        EditText edtVocationalSchool = findViewById(R.id.edtVocationalSchool);
        EditText edtVocationalBasicEdu = findViewById(R.id.edtVocationalBasicEdu);
        EditText edtCollegeSchool = findViewById(R.id.edtCollegeSchool);
        EditText edtCollegeBasicEdu = findViewById(R.id.edtCollegeBasicEdu);
        EditText edtGraduateSchool = findViewById(R.id.edtGraduateSchool);
        EditText edtGraduateBasicEdu = findViewById(R.id.edtGraduateBasicEdu);

        CheckBox chkElem = findViewById(R.id.chkElementary);
        CheckBox chkSecond = findViewById(R.id.chkSecondary);
        CheckBox chkCollege = findViewById(R.id.chkCollege);
        CheckBox chkGraduate = findViewById(R.id.chkGraduate);

        if (chkElem.isChecked()) {
            if (edtElemSchool.length() == 0 || edtElemBasicEdu.length() == 0) {
                Toast.makeText(this, "fill-in all necessary information", Toast.LENGTH_SHORT).show();
            }
        }
        if (chkSecond.isChecked()) {
            if (edtSecondSchool.length() == 0 || edtSecondBasicEdu.length() == 0) {
                Toast.makeText(this, "fill-in all necessary information", Toast.LENGTH_SHORT).show();
            }
            if (edtVocationalSchool.length() == 0 || edtVocationalBasicEdu.length() == 0) {
                Toast.makeText(this, "fill-in all necessary information", Toast.LENGTH_SHORT).show();
            }
        }if (chkCollege.isChecked()) {
            if (edtCollegeSchool.length() == 0 || edtCollegeBasicEdu.length() == 0) {
                Toast.makeText(this, "fill-in all necessary information", Toast.LENGTH_SHORT).show();
            }
        }
        if (chkGraduate.isChecked()) {
            if (edtGraduateSchool.length() == 0 || edtGraduateBasicEdu.length() == 0) {
                Toast.makeText(this, "fill-in all necessary information", Toast.LENGTH_SHORT).show();
            }
        }
        if ((chkElem.isChecked() && !(edtElemSchool.length() == 0) && !(edtElemBasicEdu.length() == 0)) &&
                (chkSecond.isChecked() && !(edtSecondSchool.length() == 0) && !(edtSecondBasicEdu.length() == 0)) &&
                (!(edtVocationalSchool.length() == 0) && !(edtVocationalBasicEdu.length() == 0)) ||
                (chkCollege.isChecked() && !(edtCollegeSchool.length() == 0) && !(edtCollegeBasicEdu.length() == 0))||
                (chkGraduate.isChecked() && !(edtGraduateSchool.length() == 0) && !(edtGraduateBasicEdu.length() == 0))) {

            elemSchool = edtElemSchool.getText().toString();
            elemBasicEdu = edtElemBasicEdu.getText().toString();
            secondSchool = edtSecondSchool.getText().toString();
            secondBasicEdu = edtSecondBasicEdu.getText().toString();
            vocationalSchool = edtVocationalSchool.getText().toString();
            vocationalBasicEdu = edtVocationalBasicEdu.getText().toString();
            collegeSchool = edtCollegeSchool.getText().toString();
            collegeBasicEdu = edtCollegeBasicEdu.getText().toString();
            graduateSchool = edtGraduateSchool.getText().toString();
            graduateBasicEdu = edtGraduateBasicEdu.getText().toString();

            Intent i = new Intent(this, Criminal_Background.class);
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
            startActivity(i);


        }





        }
    }
