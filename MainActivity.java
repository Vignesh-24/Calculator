package com.example.calculator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button one,two,three,four,five,zero,six,seven,eight,nine,equal,clr,plus,minus,div,mul;
    EditText ans;
    int count=0;
    public static String num="";
    public static String num1="";
    public static  String num2="";
    String op="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ans=(EditText)findViewById(R.id.ans);
        (one=(Button)findViewById(R.id.one)).setOnClickListener(this);
        (two=(Button)findViewById(R.id.two)).setOnClickListener(this);
        (three=(Button)findViewById(R.id.three)).setOnClickListener(this); (four=(Button)findViewById(R.id.four)).setOnClickListener(this);
        (five=(Button)findViewById(R.id.five)).setOnClickListener(this);
        (six=(Button)findViewById(R.id.six)).setOnClickListener(this); (zero=(Button)findViewById(R.id.zero)).setOnClickListener(this);
        (seven=(Button)findViewById(R.id.seven)).setOnClickListener(this);
        (eight=(Button)findViewById(R.id.eight)).setOnClickListener(this); (nine=(Button)findViewById(R.id.nine)).setOnClickListener(this);
        (equal=(Button)findViewById(R.id.equal)).setOnClickListener(this);
        (clr=(Button)findViewById(R.id.clr)).setOnClickListener(this); (div=(Button)findViewById(R.id.div)).setOnClickListener(this);
        (mul=(Button)findViewById(R.id.mul)).setOnClickListener(this);
        (plus=(Button)findViewById(R.id.plus)).setOnClickListener(this); (minus=(Button)findViewById(R.id.minus)).setOnClickListener(this);
    }
    public void onClick(View v)
    {
        switch (v.getId()){
            case R.id.one : num=num+"1";ans.setText(num);break;
            case R.id.two : num=num+"2";ans.setText(num);break;
            case R.id.three : num=num+"3";ans.setText(num);break;
            case R.id.four : num=num+"4";ans.setText(num);break;
            case R.id.five : num=num+"5";ans.setText(num);break;
            case R.id.six : num=num+"6";ans.setText(num);break;
            case R.id.seven : num=num+"7";ans.setText(num);break;
            case R.id.eight : num=num+"8";ans.setText(num);break;
            case R.id.nine : num=num+"9";ans.setText(num);break;
            case R.id.zero : num=num+"0";ans.setText(num);break;
            case R.id.plus :if(count == 0){
                num1=num;
                num="";
                op="plus";
                count=1;
                ans.setText(num1+" + ");
            }else{
                num1=String.valueOf(calculate(op));
                ans.setText(num1+" + ");
                op="plus";
                num="";
            }
                break;
            case R.id.minus :if(count == 0) {
                num1 = num;
                num = "";
                op="minus";
                count=1;
                ans.setText(num1+" - ");
            }
            else
            {
                num1=String.valueOf(calculate(op));
                ans.setText(num1+" - ");
                op="minus";
                num="";

            }
                break;
            case R.id.mul :if(count == 0) {
                num1 = num;
                num = "";
                op="mul";
                count=1;
                ans.setText(num1+" * ");
            }else{
               num1=String.valueOf(calculate(op));
               ans.setText(num1+" * ");
                op="mul";
                num="";
            }
            break;
            case R.id.div :if(count == 0) {
                num1 = num;
                num = "";
                op="div";
                count=1;
                ans.setText(num1+" / ");
            }else
            {
                num1=String.valueOf(calculate(op));
                ans.setText(num1+" / ");
                op="div";
                num="";
            }
            break;
            case R.id.clr : ans.setText("");num="";num1="";count=0;op="";break;
            case R.id.equal: num1=String.valueOf(calculate(op));ans.setText(num1);num=num1;count=0;
                   break;
        }
    }
    public static float calculate(String opr)
    {
        float res=0;
        if(opr == "plus")
        {
            res=Float.parseFloat(MainActivity.num1) + Float.parseFloat(num);
        }
        else if(opr == "minus")
        {
            res=Float.parseFloat(MainActivity.num1) - Float.parseFloat(num);
        }
        else if(opr == "mul")
        {
            res=Float.parseFloat(MainActivity.num1) * Float.parseFloat(num);
        }
        else
        {
            res=Float.parseFloat(MainActivity.num1) / Float.parseFloat(num);
        }
        return res;
    }
}
