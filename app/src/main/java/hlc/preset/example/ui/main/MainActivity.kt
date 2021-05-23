package hlc.preset.example.ui.main

import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import hlc.preset.example.R
import hlc.preset.example.base.BaseActivity
import hlc.preset.example.databinding.ActivityMainBinding
import javax.inject.Inject

class MainActivity @Inject constructor() : BaseActivity() {

    // 透用過 ViewModel Map 來綁定 View 和 ViewModel
    override val viewModel by viewModels<MainViewModel> { viewModelFactory }

    // 不透過 Inject 方式提供 ViewModel
//    private lateinit var NormalviewModel: FunctionNameMainActivityViewModel

    // Binding 格式 ＝ xml 的 class 名稱加上 Binding
    override lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        binding.tvText.text = "hlc flow"

    }
}