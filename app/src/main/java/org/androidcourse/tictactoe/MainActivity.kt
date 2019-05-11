package org.androidcourse.tictactoe

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val VALUE_X = 1
    private val VALUE_O = 2
    private val NO_VALUE = 0
    private var field1Value = NO_VALUE
    private var field2Value = NO_VALUE
    private var field3Value = NO_VALUE
    private var field4Value = NO_VALUE
    private var field5Value = NO_VALUE
    private var field6Value = NO_VALUE
    private var field7Value = NO_VALUE
    private var field8Value = NO_VALUE
    private var field9Value = NO_VALUE


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setClickListener()
    }


    fun setClickListener() {
        field1.setOnClickListener {
            if (field1Value == NO_VALUE) {
                field1.setBackgroundResource(R.drawable.x)
                field1Value = VALUE_X
                doMove()
            }
        }
        field2.setOnClickListener {
            if (field2Value == NO_VALUE) {
                field2.setBackgroundResource(R.drawable.x)
                field2Value = VALUE_X
                doMove()
            }
        }
        field3.setOnClickListener {
            if (field3Value == NO_VALUE) {
                field3.setBackgroundResource(R.drawable.x)
                field3Value = VALUE_X
                doMove()
            }
        }
        field4.setOnClickListener {
            if (field4Value == NO_VALUE) {
                field4.setBackgroundResource(R.drawable.x)
                field4Value = VALUE_X
                doMove()
            }
        }
        field5.setOnClickListener {
            if (field5Value == NO_VALUE) {
                field5.setBackgroundResource(R.drawable.x)
                field5Value = VALUE_X
                doMove()
            }
        }
        field6.setOnClickListener {
            if (field6Value == NO_VALUE) {
                field6.setBackgroundResource(R.drawable.x)
                field6Value = VALUE_X
                doMove()
            }
        }
        field7.setOnClickListener {
            if (field7Value == NO_VALUE) {
                field7.setBackgroundResource(R.drawable.x)
                field7Value = VALUE_X
                doMove()
            }
        }
        field8.setOnClickListener {
            if (field8Value == NO_VALUE) {
                field8.setBackgroundResource(R.drawable.x)
                field8Value = VALUE_X
                doMove()
            }
        }
        field9.setOnClickListener {
            if (field9Value == NO_VALUE) {
                field9.setBackgroundResource(R.drawable.x)
                field9Value = VALUE_X
                doMove()
            }
        }
    }

    fun doMove() {
        //try to win if 2 in row
        tryWin@ for (i in 1..9){
            when(i){
                1->{if(field1Value==NO_VALUE){
                    if((field2Value==VALUE_O&&field3Value==VALUE_O)||(field4Value==VALUE_O&&field7Value==VALUE_O)||(field5Value==VALUE_O&&field9Value==VALUE_O)){
                        field1.setBackgroundResource(R.drawable.o)
                        field1Value=VALUE_O
                        break@tryWin
                    }
                }}
                2->{if(field2Value==NO_VALUE){
                    if((field1Value==VALUE_O&&field3Value==VALUE_O)||(field5Value==VALUE_O&&field8Value==VALUE_O)){
                        field2.setBackgroundResource(R.drawable.o)
                        field2Value= VALUE_O
                        break@tryWin
                    }
                }}
                3->{if(field3Value==NO_VALUE){
                    if((field1Value==VALUE_O&&field2Value==VALUE_O)||(field5Value==VALUE_O&&field7Value==VALUE_O)||(field6Value==VALUE_O&&field9Value==VALUE_O)){
                        field3.setBackgroundResource(R.drawable.o)
                        field3Value=VALUE_O
                        break@tryWin
                    }
                }}
                4->{if(field4Value==NO_VALUE){
                    if((field1Value==VALUE_O&&field7Value==VALUE_O)||(field5Value==VALUE_O&&field6Value==VALUE_O)){
                        field4.setBackgroundResource(R.drawable.o)
                        field4Value=VALUE_O
                        break@tryWin
                    }
                }}
                5->{if(field5Value==NO_VALUE){
                    if((field1Value==VALUE_O&&field9Value==VALUE_O)||(field2Value==VALUE_O&&field8Value==VALUE_O)||(field3Value==VALUE_O&&field7Value==VALUE_O)||(field4Value==VALUE_O&&field6Value==VALUE_O)){
                        field5.setBackgroundResource(R.drawable.o)
                        field5Value=VALUE_O
                        break@tryWin
                    }
                }}
                6->{if(field6Value==NO_VALUE){
                    if((field3Value==VALUE_O&&field9Value==VALUE_O)||(field4Value==VALUE_O&&field5Value==VALUE_O)){
                        field6.setBackgroundResource(R.drawable.o)
                        field6Value=VALUE_O
                        break@tryWin
                    }
                }}
                7->{if(field7Value==NO_VALUE){
                    if((field1Value==VALUE_O&&field4Value==VALUE_O)||(field3Value==VALUE_O&&field5Value==VALUE_O)||(field8Value==VALUE_O&&field9Value==VALUE_O)){
                        field7.setBackgroundResource(R.drawable.o)
                        field7Value=VALUE_O
                        break@tryWin
                    }
                }}
                8->{if(field8Value==NO_VALUE){
                    if((field2Value==VALUE_O&&field5Value==VALUE_O)||(field7Value==VALUE_O&&field9Value==VALUE_O)){
                        field8.setBackgroundResource(R.drawable.o)
                        field8Value=VALUE_O
                        break@tryWin
                    }
                }}
                9->{if(field9Value==NO_VALUE){
                    if((field1Value==VALUE_O&&field5Value==VALUE_O)||(field3Value==VALUE_O&&field6Value==VALUE_O)||(field7Value==VALUE_O&&field8Value==VALUE_O)){
                        field9.setBackgroundResource(R.drawable.o)
                        field9Value=VALUE_O
                        break@tryWin
                    }
                }}
            }
        }
        tryStop@ for (i in 1..9){
            when(i){
                1->{if(field1Value==NO_VALUE){
                    if((field2Value==VALUE_X&&field3Value==VALUE_X)||(field4Value==VALUE_X&&field7Value==VALUE_X)||(field5Value==VALUE_X&&field9Value==VALUE_X)){
                        field1.setBackgroundResource(R.drawable.o)
                        field1Value=VALUE_O
                        break@tryStop
                    }
                }}
                2->{if(field2Value==NO_VALUE){
                    if((field1Value==VALUE_X&&field3Value==VALUE_X)||(field5Value==VALUE_X&&field8Value==VALUE_X)){
                        field2.setBackgroundResource(R.drawable.o)
                        field2Value= VALUE_O
                        break@tryStop
                    }
                }}
                3->{if(field3Value==NO_VALUE){
                    if((field1Value==VALUE_X&&field2Value==VALUE_X)||(field5Value==VALUE_X&&field7Value==VALUE_X)||(field6Value==VALUE_X&&field9Value==VALUE_X)){
                        field3.setBackgroundResource(R.drawable.o)
                        field3Value=VALUE_O
                        break@tryStop
                    }
                }}
                4->{if(field4Value==NO_VALUE){
                    if((field1Value==VALUE_X&&field7Value==VALUE_X)||(field5Value==VALUE_X&&field6Value==VALUE_X)){
                        field4.setBackgroundResource(R.drawable.o)
                        field4Value=VALUE_O
                        break@tryStop
                    }
                }}
                5->{if(field5Value==NO_VALUE){
                    if((field1Value==VALUE_X&&field9Value==VALUE_X)||(field2Value==VALUE_X&&field8Value==VALUE_X)||(field3Value==VALUE_X&&field7Value==VALUE_X)||(field4Value==VALUE_X&&field6Value==VALUE_X)){
                        field5.setBackgroundResource(R.drawable.o)
                        field5Value=VALUE_O
                        break@tryStop
                    }
                }}
                6->{if(field6Value==NO_VALUE){
                    if((field3Value==VALUE_X&&field9Value==VALUE_X)||(field4Value==VALUE_X&&field5Value==VALUE_X)){
                        field6.setBackgroundResource(R.drawable.o)
                        field6Value=VALUE_O
                        break@tryStop
                    }
                }}
                7->{if(field7Value==NO_VALUE){
                    if((field1Value==VALUE_X&&field4Value==VALUE_X)||(field3Value==VALUE_X&&field5Value==VALUE_X)||(field8Value==VALUE_X&&field9Value==VALUE_X)){
                        field7.setBackgroundResource(R.drawable.o)
                        field7Value=VALUE_O
                        break@tryStop
                    }
                }}
                8->{if(field8Value==NO_VALUE){
                    if((field2Value==VALUE_X&&field5Value==VALUE_X)||(field7Value==VALUE_X&&field9Value==VALUE_X)){
                        field8.setBackgroundResource(R.drawable.o)
                        field8Value=VALUE_O
                        break@tryStop
                    }
                }}
                9->{if(field9Value==NO_VALUE){
                    if((field1Value==VALUE_X&&field5Value==VALUE_X)||(field3Value==VALUE_X&&field6Value==VALUE_X)||(field7Value==VALUE_X&&field8Value==VALUE_X)){
                        field9.setBackgroundResource(R.drawable.o)
                        field9Value=VALUE_O
                        break@tryStop
                    }
                }}
            }
        }
        //stop enemy from win


        // take middle square
        if (field5Value == NO_VALUE) {
            field5.setBackgroundResource(R.drawable.o)
        }

        //strategic
        //random god square

    }

    fun checkWin() {

    }
}
