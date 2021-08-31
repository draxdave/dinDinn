# dinDinn (Will be removed soon)
## Sample project for the interview at DinDinn

### Technologies
`Arcitecture`: MVVM
`Database`: Room
`DI`: Dagger2
`Thread system`: RxJava
`Network`: Retrofit
`Other`: KotlinDsl, DataBinding, LiveData, CustomView, Jetpack Nav,..

### Notes
* Mock data is fetched throughout an Interceptor. It returns a list of orders with a 5 min expiration period.
* Single source of truth is implemented(Orders are stored in DB > Repos fetch DB) 
* Thread management is done via [CountdownRunnerView.kt] which is lifecycleAware.
* View states are handled in such way to consume lowest possible resources.
* Kotlin DSL is used for Gradle scripts.
* The whole process would be quite simpler and cleaner if we could use Kotlin Coroutines.

That's it. Thanks for reading.

Yeah! the same line to fire a conflict.