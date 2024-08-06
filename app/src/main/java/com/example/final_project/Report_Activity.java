package com.example.final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Report_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);
        setTitle("Report");

        ImageView imgViewReport = findViewById(R.id.imgViewReport);
        TextView txtPersonalName = findViewById(R.id.txtPersonalName);
        TextView txtEmail = findViewById(R.id.txtEmail);
        TextView txtGender = findViewById(R.id.txtGender);
        TextView txtPhone = findViewById(R.id.txtPhone);
        TextView txtHeight = findViewById(R.id.txtHeight);
        TextView txtWeight = findViewById(R.id.txtWeight);
        TextView txtCivilStatus = findViewById(R.id.txtCivilStatus);
        TextView txtPagibig = findViewById(R.id.txtPagibig);
        TextView txtPhilhealth = findViewById(R.id.txtPhilhealth);
        TextView txtTinNo = findViewById(R.id.txtTinNo);
        TextView txtGSISNo = findViewById(R.id.txtGSISNo);
        TextView txtEmergencyName = findViewById(R.id.txtEmergencyName);
        TextView txtEmergencyPhone = findViewById(R.id.txtEmergencyPhone);
        TextView txtRelationship = findViewById(R.id.txtRelationship);
        TextView txtElemSchoolName = findViewById(R.id.txtElemSchoolName);
        TextView txtElemBasicEdu = findViewById(R.id.txtElemBasicEdu);
        TextView txtSecondSchoolName = findViewById(R.id.txtSecondSchoolName);
        TextView txtSecondBasicEdu = findViewById(R.id.txtSecondBasicEdu);
        TextView txtVocationalSchoolName = findViewById(R.id.txtVocationalSchoolName);
        TextView txtVocationalBasicEdu = findViewById(R.id.txtVocationalBasicEdu);
        TextView txtCollegeSchoolName = findViewById(R.id.txtCollegeSchoolName);
        TextView txtCollegeBasicEdu = findViewById(R.id.txtCollegeBasicEdu);
        TextView txtGraduteSchoolName = findViewById(R.id.txtGraduteSchoolName);
        TextView txtGraduateBasicEdu = findViewById(R.id.txtGraduateBasicEdu);
        TextView txtCrimQues1 = findViewById(R.id.txtCrimQues1);
        TextView txtCrimQues2 = findViewById(R.id.txtCrimQues2);
        TextView txtCrimQues3 = findViewById(R.id.txtCrimQues3);
        TextView txtCrimQues4A = findViewById(R.id.txtCrimQues4A);
        TextView txtCrimQues4B = findViewById(R.id.txtCrimQues4B);
        TextView txtCrimQues4C = findViewById(R.id.txtCrimQues4C);

        Bundle i = getIntent().getExtras();
        byte [] byteArray = i.getByteArray("IMAGEARRAY");
        Bitmap photo = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);

        Intent intent = getIntent();
        String firstname = intent.getStringExtra("FIRSTNAME");
        String lastname = intent.getStringExtra("LASTNAME");
        String email = intent.getStringExtra("EMAIL");
        String gender = intent.getStringExtra("GENDER");
        String phone = intent.getStringExtra("PHONE");
        String height = intent.getStringExtra("HEIGHT");
        String weight = intent.getStringExtra("WEIGHT");
        String civilStatus = intent.getStringExtra("CIVILSTATUS");
        String pagibigNo = intent.getStringExtra("PAGIBIGNO");
        String philHealthNo = intent.getStringExtra("PHILHEALTHNO");
        String tinNo = intent.getStringExtra("TINNO");
        String gsisNo = intent.getStringExtra("GSISNO");
        String fullNameEmergency = intent.getStringExtra("FULLNAMEEMERGENCY");
        String contactEmergency = intent.getStringExtra("CONTACTEMERGENCY");
        String relationship = intent.getStringExtra("RELATIONSHIP");
        String elemSchoolName = intent.getStringExtra("ELEMSCHOOLNAME");
        String elemBasicEdu = intent.getStringExtra("ELEMBASICEDU");
        String secondSchoolName = intent.getStringExtra("SECONDSCHOOLNAME");
        String secondBasicEdu = intent.getStringExtra("SECONDBASICEDU");
        String vocationalSchoolName = intent.getStringExtra("VOCATIONALSCHOOLNAME");
        String vocationalBasicEdu = intent.getStringExtra("VOCATIONALBASICEDU");
        String collegeSchoolName = intent.getStringExtra("COLLEGESCHOOLNAME");
        String collegeBasicEdu = intent.getStringExtra("COLLEGEBASICEDU");
        String graduateSchoolName = intent.getStringExtra("GRADUATESCHOOLNAME");
        String graduateBasicEdu = intent.getStringExtra("GRADUATEBASICEDU");
        String crimQues1 = intent.getStringExtra("CRIMQUES1");
        String crimQues2 = intent.getStringExtra("CRIMQUES2");
        String crimQues3 = intent.getStringExtra("CRIMQUES3");
        String crimQues4A = intent.getStringExtra("CRIMQUES4A");
        String crimQues4B = intent.getStringExtra("CRIMQUES4B");
        String crimQues4C = intent.getStringExtra("CRIMQUES4C");

        if (pagibigNo.equals("")){
            pagibigNo = "N/A";
        }
        if (philHealthNo.equals("")){
            philHealthNo = "N/A";
        }
        if (tinNo.equals("")){
            tinNo = "N/A";
        }
        if (gsisNo.equals("")){
            gsisNo = "N/A";
        }
        if (elemSchoolName.equals("")){
            elemSchoolName = "N/A";
        }
        if (elemBasicEdu.equals("")){
            elemBasicEdu = "N/A";
        }
        if (secondSchoolName.equals("")){
            secondSchoolName = "N/A";
        }
        if (secondBasicEdu.equals("")){
            secondBasicEdu = "N/A";
        }
        if (vocationalSchoolName.equals("")){
            vocationalSchoolName = "N/A";
        }
        if (vocationalBasicEdu.equals("")){
            vocationalBasicEdu = "N/A";
        }
        if (collegeSchoolName.equals("")){
            collegeSchoolName = "N/A";
        }
        if (collegeBasicEdu.equals("")){
            collegeBasicEdu = "N/A";
        }
        if (graduateSchoolName.equals("")){
            graduateSchoolName = "N/A";
        }
        if (graduateBasicEdu.equals("")){
            graduateBasicEdu = "N/A";
        }
        if (crimQues1.equals("")){
            crimQues1 = "No";
        }
        if (crimQues2.equals("")){
            crimQues2 = "No";
        }
        if (crimQues3.equals("")){
            crimQues3 = "No";
        }
        if (crimQues4A.equals("")){
            crimQues4A = "No";
        }
        if (crimQues4B.equals("")){
            crimQues4B = "No";
        }
        if (crimQues4C.equals("")){
            crimQues4C = "No";
        }


        imgViewReport.setImageBitmap(photo);
        txtPersonalName.setText("Name: " + firstname + " " + lastname);
        txtEmail.setText("Email: "+ email);
        txtGender.setText("Gender: " + gender);
        txtPhone.setText("Phone Number: " + phone);
        txtHeight.setText("Height: " + height + " m");
        txtWeight.setText("Weight: " + weight + " kg");
        txtCivilStatus.setText("Civil Status: " + civilStatus);
        txtPagibig.setText("Pagibig No.: " + pagibigNo);
        txtPhilhealth.setText("Philhealth No.: " + philHealthNo);
        txtTinNo.setText("TIN No.: " + tinNo);
        txtGSISNo.setText("GSIS No.: " + gsisNo);
        txtEmergencyName.setText("Name: " + fullNameEmergency);
        txtEmergencyPhone.setText("Contact: " + contactEmergency);
        txtRelationship.setText("Relationship: " + relationship);
        txtElemSchoolName.setText("School Name: " + elemSchoolName);
        txtElemBasicEdu.setText("Basic Education: " + elemBasicEdu);
        txtSecondSchoolName.setText("School Name: " + secondSchoolName);
        txtSecondBasicEdu.setText("Basic Education: " + secondBasicEdu);
        txtVocationalSchoolName.setText("School Name: " + vocationalSchoolName);
        txtVocationalBasicEdu.setText("Basic Education: " + vocationalBasicEdu);
        txtCollegeSchoolName.setText("School Name: " + collegeSchoolName);
        txtCollegeBasicEdu.setText("Basic Education: " + collegeBasicEdu);
        txtGraduteSchoolName.setText("School Name: " + graduateSchoolName);
        txtGraduateBasicEdu.setText("Basic Education: " + graduateBasicEdu);
        txtCrimQues1.setText("Details: " + crimQues1);
        txtCrimQues2.setText("Details: " + crimQues2);
        txtCrimQues3.setText("Details: " + crimQues3);
        txtCrimQues4A.setText("Details: " + crimQues4A);
        txtCrimQues4B.setText("Details: " + crimQues4B);
        txtCrimQues4C.setText("Details: " + crimQues4C);
    }

    public void returnToTitle(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}