package best.hyun.oneweek.src.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import best.hyun.oneweek.R
import best.hyun.oneweek.databinding.ActivityReviewWriteBinding

class ReviewWriteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityReviewWriteBinding = DataBindingUtil.setContentView(this, R.layout.activity_review_write)

        binding.btnReviewWriteSave.setOnClickListener {
            finish()
        }

        binding.btnReviewWriteCancel.setOnClickListener {
            finish()
        }
    }
}