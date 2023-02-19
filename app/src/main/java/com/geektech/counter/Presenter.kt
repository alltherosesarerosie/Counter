package com.geektech.counter

class Presenter {
    private val model = Model()
    private lateinit var counterView: CounterView
    private var count = 0

    fun increment() {
        model.increment()
        count = model.count
        counterView.showCurrentCounter(count)
        newFun()
    }

    fun decrement() {
        count = model.count
        model.decrement()
        counterView.showCurrentCounter(count)
        newFun()
    }

    private fun newFun() {
        when (count) {
            10 -> {
                counterView.showNewToast()
            }
            15 -> {
                counterView.setTextColor()
            }
            else -> counterView.setDefaultColor()
        }
    }

    fun fillCounterView(counterView: CounterView) {
        this.counterView = counterView
    }
}