package com.example.lishuo.calculator;

import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calc extends Activity implements View.OnClickListener {
    Button one, two, three, four, five, six, seven, eight, nine, zero, add, sub, mul, div, cancel, equal;
    EditText disp;
    int op1;
    int op2;
    String optr;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);
        one=(Button)findViewById(R.id.button1);
        two = (Button) findViewById(R.id.button2);
        three = (Button) findViewById(R.id.button3);
        four = (Button) findViewById(R.id.button4);
        five= (Button) findViewById(R.id.button5);
        six = (Button) findViewById(R.id.button6);
        seven = (Button) findViewById(R.id.button7);
        eight = (Button) findViewById(R.id.button8);
        nine = (Button) findViewById(R.id.button9);
        zero = (Button) findViewById(R.id.button0);
        add = (Button) findViewById(R.id.buttonPlus);
        mul = (Button) findViewById(R.id.buttonTime);
        div  = (Button) findViewById(R.id.buttonDivide);
        sub  = (Button) findViewById(R.id.buttonMinus);
        cancel = (Button) findViewById(R.id.buttonClear);
        equal = (Button) findViewById(R.id.buttonResult);
        disp = (EditText) findViewById(R.id.display);
        try{
            one.setOnClickListener(this);
            two.setOnClickListener(this);
            three.setOnClickListener(this);
            four.setOnClickListener(this);
            five.setOnClickListener(this);
            six.setOnClickListener(this);
            seven.setOnClickListener(this);
            eight.setOnClickListener(this);
            nine.setOnClickListener(this);
            zero.setOnClickListener(this);
            cancel.setOnClickListener(this);
            add.setOnClickListener(this);
            sub.setOnClickListener(this);
            mul.setOnClickListener(this);
            div.setOnClickListener(this);
            equal.setOnClickListener(this);
        }
        catch(Exception e){}
    }
    public void operationFunction(){
        if(optr.equals("+")){
            op2 = Integer.parseInt(disp.getText().toString());
            disp.setText("");
            op1 = op1 + op2;
            disp.setText("Result : " + Integer.toString(op1));
        } else if(optr.equals("-")){
            op2 = Integer.parseInt(disp.getText().toString());
            disp.setText("");
            op1 = op1 - op2;
            disp.setText("Result : " + Integer.toString(op1));
        } else if(optr.equals("*")){
            op2 = Integer.parseInt(disp.getText().toString());
            disp.setText("");
            op1 = op1 * op2; disp.setText("Result : " + Integer.toString(op1));
        } else if(optr.equals("/")){
            op2 = Integer.parseInt(disp.getText().toString());
            disp.setText(""); op1 = op1 / op2;
            disp.setText("Result : " + Integer.toString(op1));
        }
    }
    @Override
    public void onClick(View v){
        Editable str =  disp.getText();
        switch(v.getId()){
            case R.id.button0:
                System.out.println("0 is pressed");
                if(op2 != 0){
                    op2 = 0;
                    disp.setText("");
                }
                str = str.append(zero.getText());
                disp.setText(str);
                break;
            case R.id.button1:
                System.out.println("1 is pressed");
                if(op2 != 0){
                    op2 = 0; disp.setText("");
                }
                str = str.append(one.getText());
                disp.setText(str);
                break;
            case R.id.button2:
                System.out.println("2 is pressed");
                if(op2 != 0){
                    op2 = 0; disp.setText("");
                }
                str = str.append(two.getText());
                disp.setText(str);
                break;
            case R.id.button3:
                if(op2 != 0){
                    op2 = 0; disp.setText("");
                }
                str = str.append(three.getText());
                disp.setText(str);
                break;
            case R.id.button4:
                if(op2 != 0){
                    op2 = 0; disp.setText("");
                }
                str = str.append(four.getText());
                disp.setText(str);
                break;
            case R.id.button5:
                if(op2 != 0){
                    op2 = 0; disp.setText("");
                }
                str = str.append(five.getText());
                disp.setText(str);
                break;
            case R.id.button6:
                if(op2 != 0){
                    op2 = 0; disp.setText("");
                }
                str = str.append(six.getText());
                disp.setText(str);
                break;
            case R.id.button7:
                if(op2 != 0){
                    op2 = 0; disp.setText("");
                }
                str = str.append(seven.getText());
                disp.setText(str);
                break;
            case R.id.button8:
                if(op2 != 0){
                    op2 = 0; disp.setText("");
                }
                str = str.append(eight.getText());
                disp.setText(str);
                break;
            case R.id.button9:
                if(op2 != 0){
                    op2 = 0; disp.setText("");
                }
                str = str.append(nine.getText());
                disp.setText(str);
                break;
            case R.id.buttonPlus:
                System.out.println("+ is pressed");
                optr = "+";
                if(op1 == 0){
                    op1 = Integer.parseInt(disp.getText().toString());
                    disp.setText("");
                } else if(op2 != 0){
                    op2 = 0; disp.setText("");
                } else{
                    op2 = Integer.parseInt(disp.getText().toString());
                    disp.setText("");
                    op1 = op1 + op2;
                    disp.setText("Result : " + Integer.toString(op1));
                }
                break;
            case R.id.buttonMinus:
                optr = "-";
                System.out.println("- is pressed");
                if(op1 == 0){
                    op1 = Integer.parseInt(disp.getText().toString());
                    disp.setText("");
                } else if(op2 != 0){
                    op2 = 0; disp.setText("");
                } else{
                    op2 = Integer.parseInt(disp.getText().toString());
                    disp.setText("");
                    op1 = op1 - op2;
                    disp.setText("Result : " + Integer.toString(op1));
                }
                break;
            case R.id.buttonTime:
                optr = "*";
                System.out.println("* is pressed");
                if(op1 == 0){
                    op1 = Integer.parseInt(disp.getText().toString());
                    disp.setText("");
                } else if(op2 != 0){
                    op2 = 0;
                    disp.setText("");
                } else{
                    op2 = Integer.parseInt(disp.getText().toString());
                    disp.setText("");
                    op1 = op1*op2;
                    disp.setText("Result : " + Integer.toString(op1));
                }
                break;
            case R.id.buttonDivide:
                System.out.println("/ is pressed");
                optr = "/";
                if(op1 == 0){
                    op1 = Integer.parseInt(disp.getText().toString()); disp.setText("");
                } else if(op2 != 0){
                    op2 = 0; disp.setText("");
                } else{
                    op2 = Integer.parseInt(disp.getText().toString());
                    disp.setText("");
                    op1 = op1/op2;
                    disp.setText("Result : " + Integer.toString(op1));
                }
                break;
            case R.id.buttonClear:
                System.out.println("clear is pressed");
                op1 = 0;
                op2 = 0;
                disp.setText("");
                disp.setHint("Perform Operation :)");
                break;
            case R.id.buttonResult:
                if(!optr.equals(null)){
                    System.out.println("!optr.equals(null)");
                    if(op2 != 0){
                        if(optr.equals("+")){
                            disp.setText(""); /*op1 = op1 + op2;*/
                            disp.setText("Result : " + Integer.toString(op1));
                        } else if(optr.equals("-")){
                            disp.setText("");/* op1 = op1 - op2;*/
                            disp.setText("Result : " + Integer.toString(op1));
                        } else if(optr.equals("*")){
                            disp.setText("");/* op1 = op1 * op2;*/
                            disp.setText("Result : " + Integer.toString(op1));
                        } else if(optr.equals("/")){
                            disp.setText("");/* op1 = op1 / op2;*/
                            disp.setText("Result : " + Integer.toString(op1)); }
                    } else{
                        System.out.println("operationFunction()");
                        operationFunction(); }
                } break;
        }

    }
}
