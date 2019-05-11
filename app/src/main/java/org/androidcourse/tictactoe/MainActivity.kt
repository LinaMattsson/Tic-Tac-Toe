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
        //take middle square
        if (field5Value == NO_VALUE) {
            field5.setBackgroundResource(R.drawable.o)
        }
        //try to win

        //stop enemy from win
        //strategic
        //random god square

    }

    fun checkWin() {

    }
}
