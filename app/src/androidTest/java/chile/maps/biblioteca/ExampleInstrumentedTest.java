package chile.maps.biblioteca;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;


@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void AppContext() {

        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();

        assertEquals("chile.maps.biblioteca", appContext.getPackageName());
    }
}
