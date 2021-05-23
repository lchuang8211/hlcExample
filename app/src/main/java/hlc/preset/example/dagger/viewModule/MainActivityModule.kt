package hlc.preset.example.dagger.viewModule

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap
import hlc.preset.example.dagger.ViewModelBuilder
import hlc.preset.example.dagger.ViewModelKey
import hlc.preset.example.ui.MainActivity
import hlc.preset.example.ui.MainViewModel

@Module
abstract class MainActivityModule {

    // 將 ViewModelFactory 注入指定 Activity 當中，實現初始化
    @ContributesAndroidInjector(modules = [ViewModelBuilder::class])
    internal abstract fun MainActivity(): MainActivity

    // 將
    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    internal abstract fun bindViewModel(viewModel: MainViewModel): ViewModel

}