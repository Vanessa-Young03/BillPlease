package sg.edu.rp.c346.id22038532.billplease;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {


    EditText amountInput;
    EditText discountInput;
    EditText noofpax_input;
    TextView endingdiply, endingdiply2;
    Button submit;
    Button reset;
    RadioButton cash,paynow,Nosvs,gst;



    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amountInput = findViewById(R.id.amtdisplay);
        discountInput = findViewById(R.id.discountdisplay);
        noofpax_input = findViewById(R.id.numofpax);
        submit = findViewById(R.id.submit);
        reset = findViewById(R.id.reset);
        cash = findViewById(R.id.cash);
        paynow = findViewById(R.id.paynow);
        Nosvs = findViewById(R.id.NoSVS);
        gst = findViewById(R.id.GST);
        endingdiply = findViewById(R.id.endingdisplay);
        endingdiply2 = findViewById(R.id.endingdisplay2);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (paynow.isChecked())
                {
                    if (gst.isChecked())
                    {
                        float inputpaymentamount = Float.parseFloat((amountInput.getText().toString()));
                        float gstfloat = Float.parseFloat(String.valueOf(discountInput));
                        float paymentamount = (float) ((inputpaymentamount * 1.07) * gstfloat);
                        float noofpax = Float.parseFloat(String.valueOf(noofpax_input));
                        float eachpayment = (paymentamount / noofpax);
                        endingdiply.setText("Total Bill: " + paymentamount);
                        endingdiply2.setText("Each Pays:" + eachpayment + " via PayNow to 1234 5678");

                    }
                    else
                    {
                        float inputpaymentamount = Float.parseFloat((amountInput.getText().toString()));
                        float gstfloat = Float.parseFloat(String.valueOf(discountInput));
                        float paymentamount = (float) ((inputpaymentamount * 1.10) * gstfloat);
                        float noofpax = Float.parseFloat(String.valueOf(noofpax_input));
                        float eachpayment = (paymentamount / noofpax);
                        endingdiply.setText("Total Bill: " + paymentamount);
                        endingdiply2.setText("Each Pays:" + eachpayment + " via PayNow to 1234 5678");
                    }
                }
                else
                {
                    if (gst.isChecked())
                    {
                        float inputpaymentamount = Float.parseFloat((amountInput.getText().toString()));
                        float gstfloat = Float.parseFloat(String.valueOf(discountInput));
                        float paymentamount = (float) ((inputpaymentamount * 1.07) * gstfloat);
                        float noofpax = Float.parseFloat(String.valueOf(noofpax_input));
                        float eachpayment = (paymentamount / noofpax);
                        endingdiply.setText("Total Bill: " + paymentamount);
                        endingdiply2.setText("Each Pays:" + eachpayment + " in cash");
                    }
                    else
                    {
                        float inputpaymentamount = Float.parseFloat((amountInput.getText().toString()));
                        float gstfloat = Float.parseFloat(String.valueOf(discountInput));
                        float paymentamount = (float) ((inputpaymentamount * 1.10) * gstfloat);
                        float noofpax = Float.parseFloat(String.valueOf(noofpax_input));
                        float eachpayment = (paymentamount / noofpax);
                        endingdiply.setText("Total Bill: " + paymentamount);
                        endingdiply2.setText("Each Pays:" + eachpayment + " in cash");
                    }
                }
            }
        });

    }
}