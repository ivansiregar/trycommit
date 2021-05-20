package com.example.p414_dagger

import dagger.Component

@Component
interface CarComponent {

    fun getCar() : Car
}