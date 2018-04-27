package com.example.user.demouicontrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class RadioButtenEx extends AppCompatActivity implements View.OnClickListener {
    RadioButton rdbn1,rdbn2,rdbn3;
    Button submit;
    TextView result;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radiobutten_ex);
        findView();
        setListeners();
    }
    void findView(){
        rdbn1=findViewById(R.id.rdbn1);
        rdbn2=findViewById(R.id.rdbn2);
        rdbn3=findViewById(R.id.rdbn3);
        submit=findViewById(R.id.submit);
        result=findViewById(R.id.result);
    }
    void setListeners(){submit.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (rdbn1.isChecked()) {
            result.setText("你選擇的結果是" + rdbn1.getText());
        }else if(rdbn2.isChecked()){
            result.setText("你選擇的結果是" + rdbn2.getText());
        }else if(rdbn3.isChecked()){
            result.setText("你選擇的結果是" + rdbn3.getText());
        }

    }
}
