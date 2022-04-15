package ru.tensor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            val employee = Employee(
                "Иванов",
                "Иван",
                "Иванович",
                "Android разработчик",
                "Работник месяца",
                "mail@mail.com"
            )
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container, EmployeeProfileFragment.newInstance(employee))
                .commit()
        }
    }
}