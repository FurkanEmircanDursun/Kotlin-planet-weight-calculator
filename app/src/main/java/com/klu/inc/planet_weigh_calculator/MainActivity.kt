package com.klu.inc.planet_weigh_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

View


    }

    fun mercury(view: View){
        if(weighText.text.toString()!=""){
            var earthWeigh=weighText.text.toString().toFloat()

            earthWeigh = earthWeigh*(37)/(98)




            result.text="your weight in mercury ${earthWeigh.toString()}"}
        }




    fun venus(view: View){

        if(weighText.text.toString()!="") {
            var earthWeigh = weighText.text.toString().toFloat()

            earthWeigh = earthWeigh * (88) / (98)


            result.text = "your weight in venus ${earthWeigh.toString()}"

        }
    }
    fun moon(view: View){
        if(weighText.text.toString()!="") {

            var earthWeigh = weighText.text.toString().toFloat()

            earthWeigh = earthWeigh * (16) / (98)


            result.text = "your weight in moon ${earthWeigh.toString()}"
        }

    }
    fun mars(view: View){

        if(weighText.text.toString()!="") {
            var earthWeigh = weighText.text.toString().toFloat()

            earthWeigh = earthWeigh * (37) / (98)


            result.text = "your weight in mars ${earthWeigh.toString()}"

        }
    }
    fun jupiter(view: View){
        if(weighText.text.toString()!=""){
        var earthWeigh=weighText.text.toString().toFloat()

        earthWeigh = earthWeigh*(247)/(98)


        result.text="your weight in jupiter ${earthWeigh.toString()}"}


    }
}