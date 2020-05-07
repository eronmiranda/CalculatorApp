package ca.nait.dmit2504.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText mNum1EditText;
    private EditText mNum2EditText;
    private TextView mResultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNum1EditText = findViewById(R.id.first_number_edit_text);
        mNum2EditText = findViewById(R.id.second_number_edit_text);
        mResultTextView = findViewById(R.id.result_text_view);
    }
    public void add_click(View v) {
        String num1Text = mNum1EditText.getText().toString();
        String num2Text = mNum2EditText.getText().toString();

        double num1 = Double.parseDouble(num1Text);
        double num2 = Double.parseDouble(num2Text);

        double result = num1 + num2;
        mResultTextView.setText(result + "");
    }
    public void subtract_click(View v){
        String num1Text = mNum1EditText.getText().toString();
        String num2Text = mNum2EditText.getText().toString();

        double num1 = Double.parseDouble(num1Text);
        double num2 = Double.parseDouble(num2Text);

        double result = num1 - num2;
        mResultTextView.setText(result + "");
    }
    public void multiply_click(View v){
        String num1Text = mNum1EditText.getText().toString();
        String num2Text = mNum2EditText.getText().toString();

        double num1 = Double.parseDouble(num1Text);
        double num2 = Double.parseDouble(num2Text);

        double result = num1 * num2;
        mResultTextView.setText(result + "");
    }
    public void divide_click(View v){
        String num1Text = mNum1EditText.getText().toString();
        String num2Text = mNum2EditText.getText().toString();

        double num1 = Double.parseDouble(num1Text);
        double num2 = Double.parseDouble(num2Text);

        double result = num1 / num2;
        mResultTextView.setText(result + "");
    }
}
