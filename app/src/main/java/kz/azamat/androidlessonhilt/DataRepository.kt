package kz.azamat.androidlessonhilt

import javax.inject.Inject
import javax.inject.Singleton

interface DataRepository {

    fun getData(): String {
        return "Data $this"
    }

    fun increment()
}

@Singleton
class DataRepositoryImpl @Inject constructor(): DataRepository {

    private var count = 0

    override fun getData(): String {

        return "Data $this = count $count"
    }

    override fun increment() {
        count++
    }
}


//class CloudRepositoryImpl @Inject constructor(): DataRepository {
//
//    override fun getData(): String {
//        return "Cloud Data $this"
//    }
//}
