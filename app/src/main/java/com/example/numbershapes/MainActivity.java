package com.example.numbershapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static java.lang.Math.floor;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    class number
    {

        int num;



        public boolean triangular()
        {
            int x = 1;
            int tnum = 1;

            while (tnum<num) {
                x++;
                tnum = tnum + x;
                if (tnum == num) {
                    return true;
                }
            }
            return false;
        }

        public boolean square()
        {
            double x = Math.sqrt(num);
            double y = floor(Math.sqrt(num));
            if(x-y == 0)
            {
                return true;
            }
            else
                return false;
        }

    }



public void check(View view)
{


    EditText editText = (EditText) findViewById(R.id.enternum);
    number num1 = new number();
num1.num= Integer.parseInt(editText.getText().toString());


    String message = "";
    if(num1.square() && num1.triangular())
    {
        message = "the enterd number is both";
    }
    else if(num1.square())
    {
        message = "the entered number is a square number";

    }
    else if(num1.triangular())
    {
        message = "the entered number is a triangular number";

    }
    else
        {
            message = "none!! failed all the cases";

    }


    System.out.println(message);

    Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    

}






}