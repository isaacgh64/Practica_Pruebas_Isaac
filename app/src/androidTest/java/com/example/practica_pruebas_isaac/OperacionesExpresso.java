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

/**
 * Clase donde realizamos las diferentes pruebas con Expresso para comprobar que con el entorno
 * gráfico funciona bien
 */
public class OperacionesExpresso {
    @Rule
    public ActivityScenarioRule<MainActivity> mainActivityActivityTestRule = new ActivityScenarioRule<MainActivity>(MainActivity.class);

    /**
     * Métodos donde comprobamos los pasos de Grados a Farengeing para comprobar que todo está correcto
     */
    @Test
    public void CaF1(){
        Espresso.onView(withId(R.id.editTextOperador)).perform(clearText());
        Espresso.onView(withId(R.id.editTextOperador)).perform(typeText("0"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.buttonF)).perform(click());
        Espresso.onView(withId(R.id.textViewResultado)).check(matches(withText("32.0")));
    }
    @Test
    public void CaF2(){
        Espresso.onView(withId(R.id.editTextOperador)).perform(clearText());
        Espresso.onView(withId(R.id.editTextOperador)).perform(typeText("100"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.buttonF)).perform(click());
        Espresso.onView(withId(R.id.textViewResultado)).check(matches(withText("212.0")));
    }
    @Test
    public void CaF3(){
        Espresso.onView(withId(R.id.editTextOperador)).perform(clearText());
        Espresso.onView(withId(R.id.editTextOperador)).perform(typeText("20"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.buttonF)).perform(click());
        Espresso.onView(withId(R.id.textViewResultado)).check(matches(withText("68.0")));
    }
    @Test
    public void CaF4(){
        Espresso.onView(withId(R.id.editTextOperador)).perform(clearText());
        Espresso.onView(withId(R.id.editTextOperador)).perform(typeText("-100"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.buttonF)).perform(click());
        Espresso.onView(withId(R.id.textViewResultado)).check(matches(withText("-148.0")));
    }
    @Test
    public void CaF5(){
        Espresso.onView(withId(R.id.editTextOperador)).perform(clearText());
        Espresso.onView(withId(R.id.editTextOperador)).perform(typeText("8"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.buttonF)).perform(click());
        Espresso.onView(withId(R.id.textViewResultado)).check(matches(withText("46.4")));
    }
    @Test
    public void CaF6(){
        Espresso.onView(withId(R.id.editTextOperador)).perform(clearText());
        Espresso.onView(withId(R.id.editTextOperador)).perform(typeText("patata"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.buttonF)).perform(click());
        Espresso.onView(withId(R.id.textViewResultado)).check(matches(withText("error")));
    }

    /**
     * Métodos donde comprobamos los pasos de Farengeing a Grados para comprobar que todo está correcto
     */
    @Test
    public void FaC1(){
        Espresso.onView(withId(R.id.editTextOperador)).perform(clearText());
        Espresso.onView(withId(R.id.editTextOperador)).perform(typeText("32"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.buttonC)).perform(click());
        Espresso.onView(withId(R.id.textViewResultado)).check(matches(withText("0.0")));
    }
    @Test
    public void FaC2(){
        Espresso.onView(withId(R.id.editTextOperador)).perform(clearText());
        Espresso.onView(withId(R.id.editTextOperador)).perform(typeText("212"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.buttonC)).perform(click());
        Espresso.onView(withId(R.id.textViewResultado)).check(matches(withText("100.0")));
    }
    @Test
    public void FaC3(){
        Espresso.onView(withId(R.id.editTextOperador)).perform(clearText());
        Espresso.onView(withId(R.id.editTextOperador)).perform(typeText("68"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.buttonC)).perform(click());
        Espresso.onView(withId(R.id.textViewResultado)).check(matches(withText("20.0")));
    }
    @Test
    public void FaC4(){
        Espresso.onView(withId(R.id.editTextOperador)).perform(clearText());
        Espresso.onView(withId(R.id.editTextOperador)).perform(typeText("-148"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.buttonC)).perform(click());
        Espresso.onView(withId(R.id.textViewResultado)).check(matches(withText("-100.0")));
    }
    @Test
    public void FaC5(){
        Espresso.onView(withId(R.id.editTextOperador)).perform(clearText());
        Espresso.onView(withId(R.id.editTextOperador)).perform(typeText("46.4"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.buttonC)).perform(click());
        Espresso.onView(withId(R.id.textViewResultado)).check(matches(withText("8.0")));
    }
    @Test
    public void FaC6(){
        Espresso.onView(withId(R.id.editTextOperador)).perform(clearText());
        Espresso.onView(withId(R.id.editTextOperador)).perform(typeText("cebolla"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.buttonC)).perform(click());
        Espresso.onView(withId(R.id.textViewResultado)).check(matches(withText("error")));
    }

    /**
     * Métodos donde comprobamos los pasos de Millas a Kilómetros para comprobar que todo está correcto
     */
    @Test
    public void maKms1(){
        Espresso.onView(withId(R.id.editTextOperador)).perform(clearText());
        Espresso.onView(withId(R.id.editTextOperador)).perform(typeText("1.60934"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.buttonKms)).perform(click());
        Espresso.onView(withId(R.id.textViewResultado)).check(matches(withText("1.0")));
    }
    @Test
    public void maKms2(){
        Espresso.onView(withId(R.id.editTextOperador)).perform(clearText());
        Espresso.onView(withId(R.id.editTextOperador)).perform(typeText("160.934"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.buttonKms)).perform(click());
        Espresso.onView(withId(R.id.textViewResultado)).check(matches(withText("100.0")));
    }
    @Test
    public void maKms3(){
        Espresso.onView(withId(R.id.editTextOperador)).perform(clearText());
        Espresso.onView(withId(R.id.editTextOperador)).perform(typeText("32.1869"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.buttonKms)).perform(click());
        Espresso.onView(withId(R.id.textViewResultado)).check(matches(withText("20.000062137273666")));
    }
    @Test
    public void maKms4(){
        Espresso.onView(withId(R.id.editTextOperador)).perform(clearText());
        Espresso.onView(withId(R.id.editTextOperador)).perform(typeText("-160.934"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.buttonKms)).perform(click());
        Espresso.onView(withId(R.id.textViewResultado)).check(matches(withText("-100.0")));
    }
    @Test
    public void maKms5(){
        Espresso.onView(withId(R.id.editTextOperador)).perform(clearText());
        Espresso.onView(withId(R.id.editTextOperador)).perform(typeText("12.8748"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.buttonKms)).perform(click());
        Espresso.onView(withId(R.id.textViewResultado)).check(matches(withText("8.000049709818933")));
    }
    @Test
    public void maKms6(){
        Espresso.onView(withId(R.id.editTextOperador)).perform(clearText());
        Espresso.onView(withId(R.id.editTextOperador)).perform(typeText("adios"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.buttonKms)).perform(click());
        Espresso.onView(withId(R.id.textViewResultado)).check(matches(withText("error")));
    }

    /**
     * Métodos donde comprobamos los pasos de Kilómetros a Millas para comprobar que todo está correcto
     */
    @Test
    public void kmsaM1(){
        Espresso.onView(withId(R.id.editTextOperador)).perform(clearText());
        Espresso.onView(withId(R.id.editTextOperador)).perform(typeText("1"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.buttonMillas)).perform(click());
        Espresso.onView(withId(R.id.textViewResultado)).check(matches(withText("1.60934")));
    }
    @Test
    public void kmsaM2(){
        Espresso.onView(withId(R.id.editTextOperador)).perform(clearText());
        Espresso.onView(withId(R.id.editTextOperador)).perform(typeText("100.0"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.buttonMillas)).perform(click());
        Espresso.onView(withId(R.id.textViewResultado)).check(matches(withText("160.934")));
    }
    @Test
    public void kmsaM3(){
        Espresso.onView(withId(R.id.editTextOperador)).perform(clearText());
        Espresso.onView(withId(R.id.editTextOperador)).perform(typeText("20"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.buttonMillas)).perform(click());
        Espresso.onView(withId(R.id.textViewResultado)).check(matches(withText("32.1868")));
    }
    @Test
    public void kmsaM4(){
        Espresso.onView(withId(R.id.editTextOperador)).perform(clearText());
        Espresso.onView(withId(R.id.editTextOperador)).perform(typeText("-100"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.buttonMillas)).perform(click());
        Espresso.onView(withId(R.id.textViewResultado)).check(matches(withText("-160.934")));
    }
    @Test
    public void kmsaM5(){
        Espresso.onView(withId(R.id.editTextOperador)).perform(clearText());
        Espresso.onView(withId(R.id.editTextOperador)).perform(typeText("8"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.buttonMillas)).perform(click());
        Espresso.onView(withId(R.id.textViewResultado)).check(matches(withText("12.87472")));
    }
    @Test
    public void kmsaM6(){
        Espresso.onView(withId(R.id.editTextOperador)).perform(clearText());
        Espresso.onView(withId(R.id.editTextOperador)).perform(typeText("si"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.buttonMillas)).perform(click());
        Espresso.onView(withId(R.id.textViewResultado)).check(matches(withText("error")));
    }


}
