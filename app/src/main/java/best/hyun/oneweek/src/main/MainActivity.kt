package best.hyun.oneweek.src.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import best.hyun.oneweek.R
import best.hyun.oneweek.databinding.ActivityMainBinding
import best.hyun.oneweek.util.MainViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding:ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        binding.viewmodel = viewModel
        binding.lifecycleOwner = this
    }
}