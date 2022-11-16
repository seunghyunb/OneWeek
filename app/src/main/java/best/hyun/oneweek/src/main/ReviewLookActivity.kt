package best.hyun.oneweek.src.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import best.hyun.oneweek.R
import best.hyun.oneweek.databinding.ActivityReviewLookBinding

class ReviewLookActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityReviewLookBinding = DataBindingUtil.setContentView(this, R.layout.activity_review_look)
    }
}