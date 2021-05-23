package hlc.preset.example.dagger

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import hlc.preset.example.base.HLCApplication
import hlc.preset.example.dagger.viewModule.MainActivityModule
import hlc.preset.example.dagger.viewModule.MainFragmentModule
import javax.inject.Singleton


// Component 提供所要使用的 Module 給 APP 使用
// Singleton 避免建立多個實體 僅能一次 (上下層一至)
@Singleton
@Component(
    modules = [
        ApplicationModule::class,
        RoomDataBaseModule::class,
        RepositoryModule::class,
        AndroidSupportInjectionModule::class,
        //
        MainActivityModule::class,
        MainFragmentModule::class
    ]
)
interface ApplicationComponent : AndroidInjector<HLCApplication> {

    @Component.Factory
    interface Factory {

        fun create(@BindsInstance applicationContext: Context): ApplicationComponent

    }


}