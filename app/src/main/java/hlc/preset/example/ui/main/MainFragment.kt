package hlc.preset.example.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import hlc.preset.example.base.BaseDaggerFragment
import hlc.preset.example.databinding.FragmentMainBinding

class MainFragment : BaseDaggerFragment(){

    override val viewModel by viewModels<MainFragmentViewModel> { viewModelFactory }

    val activityViewModel by activityViewModels<MainViewModel> { viewModelFactory }

    override lateinit var binding : FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater, null, false).apply {
            this.viewModel = this@MainFragment.viewModel
        }

        init()
        return binding.root
    }

    private fun init() {

    }
}