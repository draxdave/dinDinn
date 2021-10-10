# DinDinn
This is a demonstration of how to have parallel jobs in lists. We are using RxJava here.

### Scenario
We have a restaurant app that fetches orders from an end-point and displays it to the Chef(Supervisor).
He/She decides then weather accept the order or not. Every order has an expiration count-down timer and
will be dismissed if not accepted.

### Technologies
`Arcitecture`: MVVM
`Database`: Room
`DI`: Dagger2
`Thread system`: RxJava
`Network`: Retrofit
`Other`: KotlinDsl, DataBinding, LiveData, CustomView, Jetpack Nav,..

### Notes
* Mock data is fetched throughout an Interceptor. It returns a list of orders with a 5 min expiration period.
* Single Source of Truth design model is implemented (Orders are stored in the DB > Repos fetch DB) 
* Thread management is done via [CountdownRunnerView.kt] which is lifecycleAware to keep is resource friendly.
* View states are handled in such way to consume lowest possible resources.
* Kotlin DSL is used for Gradle scripts.
* The whole process would be quite simpler and cleaner if we could use Kotlin Coroutines!

That's it. Thanks for reading.

Feel free to Fork it. Any contributions are welcomed! :)