package com.example.peter.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static java.lang.System.exit;

public class MainActivity extends AppCompatActivity {
    private Button one,two,three,four,five,six,seven,eight,nine,add,sub,mul,div,clr,equal,zero;
  private  TextView t1,t2;
   private double val1=Double.NaN;
   private double val2;
   private char op;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        setUIviews();
        labe:
        one.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2.setText(t2.getText().toString()+"1"  );
            }
        } );
        two.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2.setText( t2.getText().toString()+"2" );
            }
        } );
        three.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2.setText( t2.getText().toString()+"3" );
            }
        } );
        four.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2.setText( t2.getText().toString()+"4" );
            }
        } );
        five.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2.setText( t2.getText().toString()+"5" );
            }
        } );
        six.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2.setText( t2.getText().toString()+"6" );
            }
        } );
        seven.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2.setText( t2.getText().toString()+"7" );
            }
        } );
        eight.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2.setText( t2.getText().toString()+"8" );
            }
        } );
        nine.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2.setText( t2.getText().toString()+"9" );
            }
        } );
        zero.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2.setText( t2.getText().toString()+"0" );
            }
        } );
        add.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (!t2.getText().toString().equals( "" )) {
                    op = '+';
                    compute();
                    t1.setText( String.valueOf( val1 ) + " + " );
                    t2.setText( null );
                }
            }

        } );
        sub.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!t2.getText().toString().equals( "" )){
                compute();
                op='-';
                t1.setText( String.valueOf( val1 )+" - " );
                t2.setText( null );
            }}
        } );
        mul.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!t2.getText().toString().equals( "" )){
                    compute();

                op='*';
                t1.setText( String.valueOf( val1 )+" * " );
                t2.setText( null );
            }}
        } );
        div.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!t2.getText().toString().equals( "" )) {
                    compute();
                    op = '/';
                    t1.setText( String.valueOf( val1 ) + " / " );
                    t2.setText( null );
                }
            }
        } );
        equal.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!t2.getText().toString().equals( "" )) {
                    compute();
                    op = '=';
                    t1.setText( t1.getText().toString() + String.valueOf( val2 ) + "=" + String.valueOf( val1 ) );
                    t2.setText( null );
                }
            }
        } );
        clr.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(t2.getText().length()>0)
                {
                    CharSequence n=t2.getText().toString();
                    t2.setText(n.subSequence( 0,n.length()-1 ));
                }
                else {
                    val1 = Double.NaN;
                    val2 = Double.NaN;

                    t1.setText( null );
                    t2.setText( null );
                }
            }
        } );
    }
    private void setUIviews()
    {
        one=(Button)  findViewById( R.id.bt1 );
        two= findViewById( R.id.bt2 );
        three= findViewById( R.id.bt4 );
        four=findViewById( R.id.button5 );
        five=findViewById( R.id.bt5 );
        six=findViewById( R.id.bt6 );
        seven=findViewById( R.id.bt7);
        eight=findViewById( R.id.bt8 );
        nine=findViewById( R.id.bt9 );
        zero=findViewById( R.id.bt0 );
        add=findViewById( R.id.add );
        sub=findViewById( R.id.sub );
        mul=findViewById( R.id.mul );
        div=findViewById( R.id.div );
        clr=findViewById( R.id.br );
        equal=findViewById( R.id.equal );
        t1=findViewById( R.id.txt1 );
        t2=findViewById( R.id.txt2 );
    }
    private void compute(){
        if(!Double.isNaN( val1 ))
        {
            val2=Double.parseDouble( t2.getText().toString() );
            switch(op)
            {
                case '+':
                    val1=val1+val2;
                    break;
                case '-':val1=val1-val2;
                    break;
                case '*':
                    val1=val1*val2;
                    break;
                case '/' :val1=val1/val2;
                    break;
                case '=':
                    break;
            }
        }
        else
        {
            val1=Double.parseDouble( t2.getText().toString());
        }
    }
}
