package com.example.practica_pruebas_isaac;

import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.espresso.Espresso;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;

public class OperacionesExpresso {
    @Rule
    public ActivityScenarioRule<MainActivity> mainActivityActivityTestRule = new ActivityScenarioRule<MainActivity>(MainActivity.class);

    @Test
    public void CaF1(){
        Espresso.onView(withId(R.id.editTextOperador)).perform(clearText());
        Espresso.onView(withId(R.id.textViewResultado)).perform(clearText());
        Espresso.onView(withId(R.id.editTextOperador)).perform(typeText("0"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.buttonF)).perform(click());
        Espresso.onView(withId(R.id.textViewResultado)).check(matches(withText("32")));
    }
    @Test
    public void CaF2(){
        Espresso.onView(withId(R.id.editTextOperador)).perform(clearText());
        Espresso.onView(withId(R.id.textViewResultado)).perform(clearText());
        Espresso.onView(withId(R.id.editTextOperador)).perform(typeText("100"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.buttonF)).perform(click());
        Espresso.onView(withId(R.id.textViewResultado)).check(matches(withText("212")));
    }
    @Test
    public void CaF3(){
        Espresso.onView(withId(R.id.editTextOperador)).perform(clearText());
        Espresso.onView(withId(R.id.textViewResultado)).perform(clearText());
        Espresso.onView(withId(R.id.editTextOperador)).perform(typeText("20"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.buttonF)).perform(click());
        Espresso.onView(withId(R.id.textViewResultado)).check(matches(withText("68")));
    }
    @Test
    public void CaF4(){
        Espresso.onView(withId(R.id.editTextOperador)).perform(clearText());
        Espresso.onView(withId(R.id.textViewResultado)).perform(clearText());
        Espresso.onView(withId(R.id.editTextOperador)).perform(typeText("-100"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.buttonF)).perform(click());
        Espresso.onView(withId(R.id.textViewResultado)).check(matches(withText("-14.8")));
    }
    @Test
    public void CaF5(){
        Espresso.onView(withId(R.id.editTextOperador)).perform(clearText());
        Espresso.onView(withId(R.id.textViewResultado)).perform(clearText());
        Espresso.onView(withId(R.id.editTextOperador)).perform(typeText("8"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.buttonF)).perform(click());
        Espresso.onView(withId(R.id.textViewResultado)).check(matches(withText("46.8")));
    }
    @Test
    public void CaF6(){
        Espresso.onView(withId(R.id.editTextOperador)).perform(clearText());
        Espresso.onView(withId(R.id.textViewResultado)).perform(clearText());
        Espresso.onView(withId(R.id.editTextOperador)).perform(typeText("8"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.buttonF)).perform(click());
        Espresso.onView(withId(R.id.textViewResultado)).check(matches(withText("100")));
    }

    @Test
    public void FaC1(){
        Espresso.onView(withId(R.id.editTextOperador)).perform(clearText());
        Espresso.onView(withId(R.id.textViewResultado)).perform(clearText());
        Espresso.onView(withId(R.id.editTextOperador)).perform(typeText("32"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.buttonC)).perform(click());
        Espresso.onView(withId(R.id.textViewResultado)).check(matches(withText("0")));
    }
    @Test
    public void FaC2(){
        Espresso.onView(withId(R.id.editTextOperador)).perform(clearText());
        Espresso.onView(withId(R.id.textViewResultado)).perform(clearText());
        Espresso.onView(withId(R.id.editTextOperador)).perform(typeText("212"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.buttonC)).perform(click());
        Espresso.onView(withId(R.id.textViewResultado)).check(matches(withText("100")));
    }
    @Test
    public void FaC3(){
        Espresso.onView(withId(R.id.editTextOperador)).perform(clearText());
        Espresso.onView(withId(R.id.textViewResultado)).perform(clearText());
        Espresso.onView(withId(R.id.editTextOperador)).perform(typeText("68"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.buttonC)).perform(click());
        Espresso.onView(withId(R.id.textViewResultado)).check(matches(withText("20")));
    }
    @Test
    public void FaC4(){
        Espresso.onView(withId(R.id.editTextOperador)).perform(clearText());
        Espresso.onView(withId(R.id.textViewResultado)).perform(clearText());
        Espresso.onView(withId(R.id.editTextOperador)).perform(typeText("-148"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.buttonC)).perform(click());
        Espresso.onView(withId(R.id.textViewResultado)).check(matches(withText("-100.0")));
    }
    @Test
    public void FaC5(){
        Espresso.onView(withId(R.id.editTextOperador)).perform(clearText());
        Espresso.onView(withId(R.id.textViewResultado)).perform(clearText());
        Espresso.onView(withId(R.id.editTextOperador)).perform(typeText("46.4"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.buttonC)).perform(click());
        Espresso.onView(withId(R.id.textViewResultado)).check(matches(withText("8.0")));
    }
    @Test
    public void FaC6(){
        Espresso.onView(withId(R.id.editTextOperador)).perform(clearText());
        Espresso.onView(withId(R.id.textViewResultado)).perform(clearText());
        Espresso.onView(withId(R.id.editTextOperador)).perform(typeText("15"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.buttonC)).perform(click());
        Espresso.onView(withId(R.id.textViewResultado)).check(matches(withText("0.0")));
    }

    @Test
    public void maKms1(){
        Espresso.onView(withId(R.id.editTextOperador)).perform(clearText());
        Espresso.onView(withId(R.id.textViewResultado)).perform(clearText());
        Espresso.onView(withId(R.id.editTextOperador)).perform(typeText("1"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.buttonKms)).perform(click());
        Espresso.onView(withId(R.id.textViewResultado)).check(matches(withText("1.60934")));
    }
    @Test
    public void maKms2(){
        Espresso.onView(withId(R.id.editTextOperador)).perform(clearText());
        Espresso.onView(withId(R.id.textViewResultado)).perform(clearText());
        Espresso.onView(withId(R.id.editTextOperador)).perform(typeText("100"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.buttonKms)).perform(click());
        Espresso.onView(withId(R.id.textViewResultado)).check(matches(withText("160.934")));
    }
    @Test
    public void maKms3(){
        Espresso.onView(withId(R.id.editTextOperador)).perform(clearText());
        Espresso.onView(withId(R.id.textViewResultado)).perform(clearText());
        Espresso.onView(withId(R.id.editTextOperador)).perform(typeText("20"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.buttonKms)).perform(click());
        Espresso.onView(withId(R.id.textViewResultado)).check(matches(withText("32.1869")));
    }
    @Test
    public void maKms4(){
        Espresso.onView(withId(R.id.editTextOperador)).perform(clearText());
        Espresso.onView(withId(R.id.textViewResultado)).perform(clearText());
        Espresso.onView(withId(R.id.editTextOperador)).perform(typeText("-100"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.buttonKms)).perform(click());
        Espresso.onView(withId(R.id.textViewResultado)).check(matches(withText("-160.934")));
    }
    @Test
    public void maKms5(){
        Espresso.onView(withId(R.id.editTextOperador)).perform(clearText());
        Espresso.onView(withId(R.id.textViewResultado)).perform(clearText());
        Espresso.onView(withId(R.id.editTextOperador)).perform(typeText("8"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.buttonKms)).perform(click());
        Espresso.onView(withId(R.id.textViewResultado)).check(matches(withText("12.8748")));
    }
    @Test
    public void maKms6(){
        Espresso.onView(withId(R.id.editTextOperador)).perform(clearText());
        Espresso.onView(withId(R.id.textViewResultado)).perform(clearText());
        Espresso.onView(withId(R.id.editTextOperador)).perform(typeText("-100"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.buttonKms)).perform(click());
        Espresso.onView(withId(R.id.textViewResultado)).check(matches(withText("1000")));
    }

    @Test
    public void kmsaM1(){
        Espresso.onView(withId(R.id.editTextOperador)).perform(clearText());
        Espresso.onView(withId(R.id.textViewResultado)).perform(clearText());
        Espresso.onView(withId(R.id.editTextOperador)).perform(typeText("1.60934"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.buttonMillas)).perform(click());
        Espresso.onView(withId(R.id.textViewResultado)).check(matches(withText("1.0")));
    }
    @Test
    public void kmsaM2(){
        Espresso.onView(withId(R.id.editTextOperador)).perform(clearText());
        Espresso.onView(withId(R.id.textViewResultado)).perform(clearText());
        Espresso.onView(withId(R.id.editTextOperador)).perform(typeText("160.934"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.buttonMillas)).perform(click());
        Espresso.onView(withId(R.id.textViewResultado)).check(matches(withText("100")));
    }
    @Test
    public void kmsaM3(){
        Espresso.onView(withId(R.id.editTextOperador)).perform(clearText());
        Espresso.onView(withId(R.id.textViewResultado)).perform(clearText());
        Espresso.onView(withId(R.id.editTextOperador)).perform(typeText("32.1869"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.buttonMillas)).perform(click());
        Espresso.onView(withId(R.id.textViewResultado)).check(matches(withText("20")));
    }
    @Test
    public void kmsaM4(){
        Espresso.onView(withId(R.id.editTextOperador)).perform(clearText());
        Espresso.onView(withId(R.id.textViewResultado)).perform(clearText());
        Espresso.onView(withId(R.id.editTextOperador)).perform(typeText("-160.934"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.buttonMillas)).perform(click());
        Espresso.onView(withId(R.id.textViewResultado)).check(matches(withText("-100")));
    }
    @Test
    public void kmsaM5(){
        Espresso.onView(withId(R.id.editTextOperador)).perform(clearText());
        Espresso.onView(withId(R.id.textViewResultado)).perform(clearText());
        Espresso.onView(withId(R.id.editTextOperador)).perform(typeText("12.8748"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.buttonMillas)).perform(click());
        Espresso.onView(withId(R.id.textViewResultado)).check(matches(withText("8")));
    }
    @Test
    public void kmsaM6(){
        Espresso.onView(withId(R.id.editTextOperador)).perform(clearText());
        Espresso.onView(withId(R.id.textViewResultado)).perform(clearText());
        Espresso.onView(withId(R.id.editTextOperador)).perform(typeText("100"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.buttonMillas)).perform(click());
        Espresso.onView(withId(R.id.textViewResultado)).check(matches(withText("200")));
    }


}
