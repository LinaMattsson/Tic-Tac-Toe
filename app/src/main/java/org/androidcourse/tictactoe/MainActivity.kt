package org.androidcourse.tictactoe

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random


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
                        return
                    }
                }}
                2->{if(field2Value==NO_VALUE){
                    if((field1Value==VALUE_O&&field3Value==VALUE_O)||(field5Value==VALUE_O&&field8Value==VALUE_O)){
                        field2.setBackgroundResource(R.drawable.o)
                        field2Value= VALUE_O
                        return
                    }
                }}
                3->{if(field3Value==NO_VALUE){
                    if((field1Value==VALUE_O&&field2Value==VALUE_O)||(field5Value==VALUE_O&&field7Value==VALUE_O)||(field6Value==VALUE_O&&field9Value==VALUE_O)){
                        field3.setBackgroundResource(R.drawable.o)
                        field3Value=VALUE_O
                        return
                    }
                }}
                4->{if(field4Value==NO_VALUE){
                    if((field1Value==VALUE_O&&field7Value==VALUE_O)||(field5Value==VALUE_O&&field6Value==VALUE_O)){
                        field4.setBackgroundResource(R.drawable.o)
                        field4Value=VALUE_O
                        return
                    }
                }}
                5->{if(field5Value==NO_VALUE){
                    if((field1Value==VALUE_O&&field9Value==VALUE_O)||(field2Value==VALUE_O&&field8Value==VALUE_O)||(field3Value==VALUE_O&&field7Value==VALUE_O)||(field4Value==VALUE_O&&field6Value==VALUE_O)){
                        field5.setBackgroundResource(R.drawable.o)
                        field5Value=VALUE_O
                        return
                    }
                }}
                6->{if(field6Value==NO_VALUE){
                    if((field3Value==VALUE_O&&field9Value==VALUE_O)||(field4Value==VALUE_O&&field5Value==VALUE_O)){
                        field6.setBackgroundResource(R.drawable.o)
                        field6Value=VALUE_O
                        return
                    }
                }}
                7->{if(field7Value==NO_VALUE){
                    if((field1Value==VALUE_O&&field4Value==VALUE_O)||(field3Value==VALUE_O&&field5Value==VALUE_O)||(field8Value==VALUE_O&&field9Value==VALUE_O)){
                        field7.setBackgroundResource(R.drawable.o)
                        field7Value=VALUE_O
                        return
                    }
                }}
                8->{if(field8Value==NO_VALUE){
                    if((field2Value==VALUE_O&&field5Value==VALUE_O)||(field7Value==VALUE_O&&field9Value==VALUE_O)){
                        field8.setBackgroundResource(R.drawable.o)
                        field8Value=VALUE_O
                        return
                    }
                }}
                9->{if(field9Value==NO_VALUE){
                    if((field1Value==VALUE_O&&field5Value==VALUE_O)||(field3Value==VALUE_O&&field6Value==VALUE_O)||(field7Value==VALUE_O&&field8Value==VALUE_O)){
                        field9.setBackgroundResource(R.drawable.o)
                        field9Value=VALUE_O
                        return
                    }
                }}
            }
        }
        //try to stop enemy from winning
        tryStop@ for (i in 1..9){
            when(i){
                1->{if(field1Value==NO_VALUE){
                    if((field2Value==VALUE_X&&field3Value==VALUE_X)||(field4Value==VALUE_X&&field7Value==VALUE_X)||(field5Value==VALUE_X&&field9Value==VALUE_X)){
                        field1.setBackgroundResource(R.drawable.o)
                        field1Value=VALUE_O
                        return
                    }
                }}
                2->{if(field2Value==NO_VALUE){
                    if((field1Value==VALUE_X&&field3Value==VALUE_X)||(field5Value==VALUE_X&&field8Value==VALUE_X)){
                        field2.setBackgroundResource(R.drawable.o)
                        field2Value= VALUE_O
                        return
                    }
                }}
                3->{if(field3Value==NO_VALUE){
                    if((field1Value==VALUE_X&&field2Value==VALUE_X)||(field5Value==VALUE_X&&field7Value==VALUE_X)||(field6Value==VALUE_X&&field9Value==VALUE_X)){
                        field3.setBackgroundResource(R.drawable.o)
                        field3Value=VALUE_O
                        return
                    }
                }}
                4->{if(field4Value==NO_VALUE){
                    if((field1Value==VALUE_X&&field7Value==VALUE_X)||(field5Value==VALUE_X&&field6Value==VALUE_X)){
                        field4.setBackgroundResource(R.drawable.o)
                        field4Value=VALUE_O
                        return
                    }
                }}
                5->{if(field5Value==NO_VALUE){
                    if((field1Value==VALUE_X&&field9Value==VALUE_X)||(field2Value==VALUE_X&&field8Value==VALUE_X)||(field3Value==VALUE_X&&field7Value==VALUE_X)||(field4Value==VALUE_X&&field6Value==VALUE_X)){
                        field5.setBackgroundResource(R.drawable.o)
                        field5Value=VALUE_O
                        return
                    }
                }}
                6->{if(field6Value==NO_VALUE){
                    if((field3Value==VALUE_X&&field9Value==VALUE_X)||(field4Value==VALUE_X&&field5Value==VALUE_X)){
                        field6.setBackgroundResource(R.drawable.o)
                        field6Value=VALUE_O
                        return
                    }
                }}
                7->{if(field7Value==NO_VALUE){
                    if((field1Value==VALUE_X&&field4Value==VALUE_X)||(field3Value==VALUE_X&&field5Value==VALUE_X)||(field8Value==VALUE_X&&field9Value==VALUE_X)){
                        field7.setBackgroundResource(R.drawable.o)
                        field7Value=VALUE_O
                        return
                    }
                }}
                8->{if(field8Value==NO_VALUE){
                    if((field2Value==VALUE_X&&field5Value==VALUE_X)||(field7Value==VALUE_X&&field9Value==VALUE_X)){
                        field8.setBackgroundResource(R.drawable.o)
                        field8Value=VALUE_O
                        return
                    }
                }}
                9->{if(field9Value==NO_VALUE){
                    if((field1Value==VALUE_X&&field5Value==VALUE_X)||(field3Value==VALUE_X&&field6Value==VALUE_X)||(field7Value==VALUE_X&&field8Value==VALUE_X)){
                        field9.setBackgroundResource(R.drawable.o)
                        field9Value=VALUE_O
                        return
                    }
                }}
            }
        }
        // take middle square
        if (field5Value == NO_VALUE) {
            field5.setBackgroundResource(R.drawable.o)
            field5Value=VALUE_O
            return
        }
        //strategic
        if(field1Value==NO_VALUE||field3Value==NO_VALUE||field7Value==NO_VALUE||field9Value==NO_VALUE){
            var random = Random.nextInt()
            tryCorner@ for(i in 1..4) {
                when(random%4){
                    1->{if(field1Value==NO_VALUE){
                        field1.setBackgroundResource(R.drawable.o)
                        field1Value==VALUE_O
                        return
                    }}
                    2->{if(field3Value==NO_VALUE){
                        field3.setBackgroundResource(R.drawable.o)
                        field3Value==VALUE_O
                        return
                    }}
                    3->{if(field7Value==NO_VALUE){
                        field7.setBackgroundResource(R.drawable.o)
                        field7Value==VALUE_O
                        return
                    }}
                    4->{if(field9Value==NO_VALUE){
                        field9.setBackgroundResource(R.drawable.o)
                        field9Value==VALUE_O
                        return
                    }}
                }
                random++
            }
        }
        //random god square in middle of side
        if(field2Value==NO_VALUE||field4Value==NO_VALUE||field6Value==NO_VALUE||field8Value==NO_VALUE){
            var random = Random.nextInt()
            trySide@ for(i in 1..4) {
                when(random%4){
                    1->{if(field2Value==NO_VALUE){
                        field2.setBackgroundResource(R.drawable.o)
                        field2Value==VALUE_O
                        return
                    }}
                    2->{if(field4Value==NO_VALUE){
                        field4.setBackgroundResource(R.drawable.o)
                        field4Value==VALUE_O
                        return
                    }}
                    3->{if(field6Value==NO_VALUE){
                        field6.setBackgroundResource(R.drawable.o)
                        field6Value==VALUE_O
                        return
                    }}
                    4->{if(field8Value==NO_VALUE){
                        field8.setBackgroundResource(R.drawable.o)
                        field8Value==VALUE_O
                        return
                    }}
                }
                random++
            }
        }
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Game over")
            builder.setMessage("No winner")
            //builder.setPositiveButton("OK", DialogInterface.OnClickListener(function = x))

//            builder.setPositiveButton(android.R.string.yes) { dialog, which ->
//                Toast.makeText(applicationContext,
//                    android.R.string.yes, Toast.LENGTH_SHORT).show()
//            }
//
//            builder.setNegativeButton(android.R.string.no) { dialog, which ->
//                Toast.makeText(applicationContext,
//                    android.R.string.no, Toast.LENGTH_SHORT).show()
//            }
//
//            builder.setNeutralButton("Maybe") { dialog, which ->
//                Toast.makeText(applicationContext,
//                    "Maybe", Toast.LENGTH_SHORT).show()
//            }
            builder.show()
            //game end
        }



    fun checkWin() {

    }
}
