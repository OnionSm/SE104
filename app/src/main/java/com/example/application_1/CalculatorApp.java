package com.example.application_1;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class CalculatorApp extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calculator_app);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        EditText edt1 = (EditText)findViewById(R.id.edtext1);
        Button button3_5 = (Button)findViewById(R.id.button3_5);
        Button button5 = (Button)findViewById(R.id.button5);
        Button button6 = (Button)findViewById(R.id.button6);
        Button button7 = (Button)findViewById(R.id.button7);
        Button button8 = (Button)findViewById(R.id.button8);
        Button button9 = (Button)findViewById(R.id.button9);
        Button button10 = (Button)findViewById(R.id.button10);
        Button button11 = (Button)findViewById(R.id.button11);
        Button button12 = (Button)findViewById(R.id.button12);
        Button button13 = (Button)findViewById(R.id.button13);
        Button button14 = (Button)findViewById(R.id.button14);
        Button button15 = (Button)findViewById(R.id.button15);
        Button button16 = (Button)findViewById(R.id.button16);
        Button button17 = (Button)findViewById(R.id.button17);
        Button button18 = (Button)findViewById(R.id.button18);
        Button button19 = (Button)findViewById(R.id.button19);
        Button button20 = (Button)findViewById(R.id.button20);
        Button button21 = (Button)findViewById(R.id.button21);
        Button button22 = (Button)findViewById(R.id.button22);
        Button button23 = (Button)findViewById(R.id.button23);


        button3_5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                edt1.setText(edt1.getText()+"7");
            }
        });
        button5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                edt1.setText(edt1.getText()+"8");
            }
        });
        button6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                edt1.setText(edt1.getText()+"9");
            }
        });
        button7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String txt = edt1.getText().toString();
                if (txt.length()!=0)
                {
                    txt = txt.substring(0, txt.length() - 1);
                }
                button7.setText(txt);
            }
        });
        button8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                edt1.setText("");
            }
        });
        button9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                edt1.setText(edt1.getText()+"4");
            }
        });
        button10.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                edt1.setText(edt1.getText()+"5");
            }
        });
        button11.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                edt1.setText(edt1.getText()+"6");
            }
        })
        ;
        button12.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                edt1.setText(edt1.getText()+"*");
            }
        });
        button13.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                edt1.setText(edt1.getText()+"/");
            }
        });
        button14.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                edt1.setText(edt1.getText()+"1");
            }
        });
        button15.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                edt1.setText(edt1.getText()+"2");
            }
        });
        button16.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                edt1.setText(edt1.getText()+"3");
            }
        });
        button17.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                edt1.setText(edt1.getText()+"+");
            }
        });
        button18.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                edt1.setText(edt1.getText()+"-");
            }
        });
        button19.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                edt1.setText(edt1.getText()+"0");
            }
        });
        button20.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                edt1.setText(edt1.getText()+".");
            }
        });
        button21.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                edt1.setText(edt1.getText()+"7");
            }
        });
        button22.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                edt1.setText(edt1.getText()+"");
            }
        });
        button23.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String txt = edt1.getText().toString();
                String[] words = txt.split("\\+|-|\\*|/");
                if (words.length != 2)
                {
                    // Xử lý trường hợp không hợp lệ
                    return;
                }

                float num1 = Float.parseFloat(words[0]);
                float num2 = Float.parseFloat(words[1]);

                if (txt.contains("*"))
                {
                    edt1.setText(String.valueOf(num1 * num2));
                } else if (txt.contains("/")) {
                    if (num2 == 0)
                    {
                        // Xử lý trường hợp chia cho 0
                    }
                    else
                    {
                        edt1.setText(String.valueOf(num1 / num2));
                    }
                }
                else if (txt.contains("+"))
                {
                    edt1.setText(String.valueOf(num1 + num2));
                }
                else if (txt.contains("-"))
                {
                    edt1.setText(String.valueOf(num1 - num2));
                }
            }
        });
    }
}