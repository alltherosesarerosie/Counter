package com.geektech.counter

interface CounterView {
    fun showCurrentCounter(count: Int)

    fun showNewToast()

    fun setTextColor()

    fun setDefaultColor()
}