package playground.kotlin

import com.google.common.truth.Truth.assertThat
import com.google.testing.junit.testparameterinjector.TestParameter
import com.google.testing.junit.testparameterinjector.TestParameterInjector
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(TestParameterInjector::class)
class AppTest {
    @Test
    fun `app has a greeting`() {
        val classUnderTest = App()

        assertThat(classUnderTest.greeting).isNotNull()
    }

    @Test
    fun `app greets greetee`(@TestParameter("Alice", "Charlie", "Bob") greetee: String) {
        val app = App(greetee = greetee)

        assertThat(app.greeting).isEqualTo("Hello $greetee!")
    }
}
