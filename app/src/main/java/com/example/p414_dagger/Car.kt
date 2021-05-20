package com.example.p414_dagger

import android.util.Log
import javax.inject.Inject


class Car {

    private val TAG = "MYTAG"

    private var engine : Engine
    private var wheels : Wheels

    @Inject
    constructor(engine: Engine, wheels: Wheels) {
        this.engine = engine
        this.wheels = wheels
    }

    public fun drive() {
        Log.d(TAG, "I am driving ....")
    }

}