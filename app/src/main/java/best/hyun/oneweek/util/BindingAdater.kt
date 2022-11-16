package best.hyun.oneweek.util

import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import best.hyun.oneweek.R


@BindingAdapter("app:likeIcon")
fun likeIcon(view: ImageView, state: Boolean) {
    val drawable = when (state) {
        true -> ContextCompat.getDrawable(view.context, R.drawable.ic_thumb_up_selected)
        false -> ContextCompat.getDrawable(view.context, R.drawable.ic_thumb_up)
    }
    view.setImageDrawable(drawable)
}

@BindingAdapter("app:unlikeIcon")
fun unlikeIcon(view: ImageView, state: Boolean) {
    val drawable = when (state) {
        true -> ContextCompat.getDrawable(view.context, R.drawable.ic_thumb_down_selected)
        false -> ContextCompat.getDrawable(view.context, R.drawable.ic_thumb_down)
    }
    view.setImageDrawable(drawable)
}