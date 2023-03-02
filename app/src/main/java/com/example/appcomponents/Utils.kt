package com.example.appcomponents

object Utils {
    fun useBinding(bindBody:()->Unit){bindBody()}
    fun dontUseBinding(someBody:()->Unit){someBody()}
}