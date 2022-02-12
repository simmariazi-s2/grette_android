package com.simmariazi.myapplication.model


interface Buildable<T> {
    fun build(): T
}