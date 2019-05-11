package org.androidcourse.tictactoe

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var field1IsFree = true
    private var field2IsFree = true
    private var field3IsFree = true
    private var field4IsFree = true
    private var field5IsFree = true
    private var field6IsFree = true
    private var field7IsFree = true
    private var field8IsFree = true
    private var field9IsFree = true


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setClickListener()
    }

//    override fun onCreateView(name: String?, context: Context?, attrs: AttributeSet?): View? {
//
//
//
//
//
//        return super.onCreateView(name, context, attrs)
//    }

    fun setClickListener(){
        field1.setOnClickListener { if(field1IsFree) {field1.setBackgroundResource(R.drawable.x)
            println("hej")
        field1IsFree = false
        doMove()}}
        field2.setOnClickListener { if(field2IsFree) {field2.setBackgroundResource(R.drawable.x)
        field2IsFree = false
        doMove()}}
        field3.setOnClickListener { if(field3IsFree) {field3.setBackgroundResource(R.drawable.x)
        field3IsFree = false
        doMove()}}
        field4.setOnClickListener { if(field4IsFree) {field4.setBackgroundResource(R.drawable.x)
        field4IsFree = false
        doMove()}}
        field5.setOnClickListener { if(field5IsFree) {field5.setBackgroundResource(R.drawable.x)
        field5IsFree = false
        doMove()}}
        field6.setOnClickListener { if(field6IsFree) {field6.setBackgroundResource(R.drawable.x)
        field6IsFree = false
        doMove()}}
        field7.setOnClickListener { if(field7IsFree) {field7.setBackgroundResource(R.drawable.x)
        field7IsFree = false
        doMove()}}
        field8.setOnClickListener { if(field8IsFree) {field8.setBackgroundResource(R.drawable.x)
        field8IsFree = false
        doMove()}}
        field9.setOnClickListener { if(field9IsFree) {field9.setBackgroundResource(R.drawable.x)
        field9IsFree = false
        doMove()}}
    }
    fun doMove(){

    }
}
