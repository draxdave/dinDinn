package ir.drax.dindinn.ui

import ir.drax.dindinn.ExampleInstrumentedTest
import ir.drax.dindinn.ui.orders.OrdersFragmentTest
import org.junit.runner.RunWith
import org.junit.runners.Suite

@RunWith(Suite::class)
@Suite.SuiteClasses(

    MainActivityTest::class,
    OrdersFragmentTest::class,
    ExampleInstrumentedTest::class

)
class UiTestSuite