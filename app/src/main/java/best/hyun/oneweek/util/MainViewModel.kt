package best.hyun.oneweek.util

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _likes = MutableLiveData(0)
    private val _likesState = MutableLiveData(false)

    private val _unlikes = MutableLiveData(0)
    private val _unlikesState = MutableLiveData(false)

    val likes: LiveData<Int> = _likes
    val likeState: LiveData<Boolean> = _likesState
    val unlikes: LiveData<Int> = _unlikes
    val unlikeState: LiveData<Boolean> = _unlikesState


    /**
     * 좋아요를 눌렀을 때 카운트를 변화 시킨다.
     */
    fun onLike() {
        onChangeLikes(_likes, _likesState, _unlikes, _unlikesState)
    }

    /**
     * 싫어요를 눌렀을 때 카운트를 변화 시킨다.
     */
    fun onUnLike() {
        onChangeLikes(_unlikes, _unlikesState, _likes, _likesState)
    }

    /**
     * 좋아요, 싫어요 상태 변화
     */
    private fun onChangeLikes(
        a: MutableLiveData<Int>, aState: MutableLiveData<Boolean>,
        b: MutableLiveData<Int>, bState: MutableLiveData<Boolean>
    ) {
        if (aState.value == true) { // 좋아요가 true 라면? 즉, 이미 좋아요가 눌린 상태
            // 좋아요가 눌린 상태에서 좋아요를 눌렀으니 좋아요 취소를 하는 경우
            // 좋아요가 눌려있으니 싫어요는 안눌려있다 즉, 좋아요만 변경하면 된다.
            a.value = (a.value ?: 0) - 1
            aState.value = false // 좋아요가 안눌린 상태로 변경
        } else { // 좋아요가 안눌려있는 상태
            // 싫어요가 눌린 상태일 수 있으니 체크
            if (bState.value == true) { // 싫어요가 true 라면? 즉, 이미 싫어요가 눌린 상태
                b.value = (b.value ?: 0) - 1
                bState.value = false // 싫어요가 안눌린 상태로 변경
            }
            a.value = (a.value ?: 0) + 1
            aState.value = true
        }
    }

}