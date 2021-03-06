package hlc.preset.example.domain

import android.util.Log
import hlc.preset.example.data.repository.FruitInteractor
import javax.inject.Inject

private const val TAG = "AppleUseCase"

//實作 UseCase 的商業邏輯
class AppleUseCase @Inject constructor(
    val fruit: FruitInteractor
){
    fun doSometing(): String{
        Log.i(TAG, "doSometing: count: " + fruit.getCount() )
        return fruit.getCount().toString()+" apples"
    }
}