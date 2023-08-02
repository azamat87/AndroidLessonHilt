package kz.azamat.androidlessonhilt

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Qualifier
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
interface DataModule {

    @Binds
    fun bindDataRepository(repositoryImpl: DataRepositoryImpl): DataRepository

//    @Binds
//    @CloudRepo
//    fun bindCloudRepository(repositoryImpl: CloudRepositoryImpl): DataRepository

}

//@Module
//@InstallIn(ActivityComponent::class)
//object DataModule {
//
//    @Provides
//    fun provideDataRepository(): DataRepository {
//        return DataRepositoryImpl()
//    }
//
//    @Provides
//    fun provideDataRepository(repositoryImpl: DataRepositoryImpl): DataRepository {
//        return repositoryImpl
//    }
//}

//@Qualifier
//annotation class CloudRepo