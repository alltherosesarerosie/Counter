package com.geektech.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.geektech.counter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), CounterView {

    private val presenter = Presenter()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.fillCounterView(this)
        initClicker()
    }

    private fun initClicker() {
        with(binding) {
            incBtn.setOnClickListener {
                presenter.increment()
            }

            decBtn.setOnClickListener {
                presenter.decrement()
            }
        }
    }

    override fun showCurrentCounter(count: Int) {
        binding.resTv.text = count.toString()
    }

    override fun showNewToast() {
        Toast.makeText(applicationContext, "You hit 10!!!", Toast.LENGTH_SHORT).show()
    }

    override fun setTextColor() {
        binding.resTv.setTextColor(resources.getColor(R.color.green))
    }

    override fun setDefaultColor() {
        binding.resTv.setTextColor(resources.getColor(R.color.black))
    }

}