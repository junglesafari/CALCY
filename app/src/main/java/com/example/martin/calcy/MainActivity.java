package com.example.martin.calcy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView result;
    String lastresult;
    String v1="";
    String v2="";
    String ans;
    char operator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        result=findViewById( R.id.result );
        //this.setTheme( R.style.greenTheme );
    }

    public void onclick(View view){

        int id=view.getId();

        switch (id){
            case R.id.one:
                if(v1.equals( "" )){
                    result.setText( "1" );
                    v1="1";

                }else {v1=v1+ "1";
                    result.setText(v1 );
                }
                break;
            case R.id.two:
                if(v1.equals( "" )){
                      v1="2";
                    result.setText( "2" );
                }else {v1=v1+"2";
                    result.setText( v1);

                }
                break;
            case R.id.three:
                if(v1.equals( "" )){v1="3";
                    result.setText( "3" );
                }else {v1=v1+ "3";
                    result.setText(v1);
                }
                break;
            case R.id.four:
                if(v1.equals( "" )){
                   v1="4";
                    result.setText(  "4");
                }else {v1=v1+ "4";
                    result.setText( v1);
                }
                break;
            case R.id.five:
                if(v1.equals( "" )){v1="5";
                    result.setText( "5" );
                }else {
                    v1=v1+ "5";
                    result.setText( v1 );
                }
                break;
            case R.id.six:
                if(v1.equals( "" )){v1="6";
                    result.setText( "6" );
                }else {v1=v1+ "6";
                    result.setText( v1);
                }
                break;
            case R.id.seven:
                if(v1.equals( "" )){
                    v1="7";
                    result.setText( "7" );
                }else {v1=v1+ "7";
                    result.setText( v1);
                }
                break;
            case R.id.eight:
                if(v1.equals( "" )){
                    v1="8";
                    result.setText( "8" );
                }else {
                    v1=v1+ "8";
                    result.setText( v1 );
                }
                break;
            case R.id.nine:
                if(v1.equals( "" )){
                    v1="9";
                    result.setText( "9" );
                }else {v1=v1+ "9";
                    result.setText( v1);
                }
                break;
            case R.id.zero:
                if(v1.equals( "" )){
                    v1="0";
                    result.setText( "0" );
                }else {v1=v1+ "0";
                    result.setText( v1 );
                }
                break;
            case R.id.delete:
                v1="";
                v2="";
                result.setText( "" );
                break;
            case R.id.equal:
                if(v1.equals( "" )){result.setText( v2 );}
                else { compute( v1,v2,operator );}
                break;
            case R.id.plus:

                if(!v1.equals( "" )&&!v2.equals( "" )){
                compute(v1,v2,operator);
                    result.setText( v2+"+" );
                }
                else if(v1.equals( "" )&&!v2.equals( "" )){

                    result.setText( "+" );

                }else
                    { result.setText( "+" );
                    v2=v1;
                    v1="";
                }operator='+';

                break;
            case R.id.minus:
                if(!v1.equals( "" )&&!v2.equals( "" )){
                    compute(v1,v2,operator);
                    result.setText( v2+"-" );
                }
                else if(v1.equals( "" )&&!v2.equals( "" )){

                    result.setText( "-" );

                }else
                { result.setText( "-" );
                    v2=v1;
                    v1="";
                }operator='-';
                break;
            case R.id.divide:
                if(!v1.equals( "" )&&!v2.equals( "" )){
                    compute(v1,v2,operator);
                    result.setText( v2+"/" );
                }
                else if(v1.equals( "" )&&!v2.equals( "" )){

                    result.setText( "/" );

                }else
                { result.setText( "/" );
                    v2=v1;
                    v1="";
                }operator='/';
                break;
            case R.id.multiply:
                if(!v1.equals( "" )&&!v2.equals( "" )){
                    compute(v1,v2,operator);
                    result.setText( v2+"*" );
                }
                else if(v1.equals( "" )&&!v2.equals( "" )){

                    result.setText( "*" );

                }else
                { result.setText( "*" );
                    v2=v1;
                    v1="";
                }operator='*';
                break;
        }

    }
public void compute(String v1,String  v2,char operator){
        Double v=Double.parseDouble( v1 );
    Double u=Double.parseDouble( v2);
        double ans1;
        switch (operator){
            case '+':
                 ans1=v+u;
                ans=ans1+"";
                this.v2=ans;
                this.v1="";
                this.operator='a';
                break;
            case '-':
                 ans1=u-v;
                ans=ans1+"";
                this.v2=ans;
                this.v1="";
                this.operator='a';
                break;
            case '*':
                if(v==0.0||u==0.0){
                    this.v1="";
                    this.v2="";
                    this.ans="";
                    result.setText( "0.0" );
                }else {
                ans1=v*u;
                ans=ans1+"";
                this.v2=ans;
                this.v1="";
                this.operator='a';}
                break;
            case '/':
                if(u==0){result.setText( "invalid entry" );
                this.v1="";
                this.v2="";
                this.ans="";}else {
                 ans1=(double)u/v;
                ans=ans1+"";
                this.v2=ans;
                this.v1="";
                this.operator='a';}
                break;
        }

        result.setText( ans );
}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate( R.menu.main_menu,menu );
        return super.onCreateOptionsMenu( menu );
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {



        return super.onOptionsItemSelected( item );
    }

}
