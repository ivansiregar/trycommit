package com.example.p414_dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //USING DRAGGER, NO MORE OBJECT INSTANTIATION (BOILER PLATE OVOIDING)
        var component: CarComponent = DaggerCarComponent.create()

        car = component.getCar()
        car.drive()


        /*
        //INSTANTIATE OBJECTS COMPONENT OF CAR
        val block       = Block()
        val cylinder    = Cylinder()
        val spark       = Spark()
        val tires       = Tires()
        val rims        = Rims()

        //INSTANTIATE ENGINE AND WHEEL
        val engine      = Engines(block,cylinder,spark)
        val wheels      = Wheels(tires,rims)

        //INSTANTIATE CAR
        val car         = Car(engine,wheels)
        car.drive()
        */
    }
}


