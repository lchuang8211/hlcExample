package hlc.preset.example.dagger

import hlc.preset.example.data.repository.FruitInteractor
import hlc.preset.example.data.repository.FruitRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

// 存放所有 Repository
@Module
object RepositoryModule {

    @JvmStatic
    @Singleton
    @Provides
    fun provideFruitRepository(): FruitInteractor {
        return FruitRepository()
    }

    /**
     *  other Repository function
     * */

}