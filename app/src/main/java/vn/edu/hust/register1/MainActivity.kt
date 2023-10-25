package vn.edu.hust.register1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import vn.edu.hust.register1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.register.setOnClickListener({
            if (binding.firstNameBox.text.isEmpty()) {
                Toast.makeText(this, "Error! Enter your First Name..", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (binding.lastNameBox.text.isEmpty()) {
                Toast.makeText(this, "Error! Enter your Last Name..", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (binding.gender.checkedRadioButtonId == -1) {
                Toast.makeText(this, "Error! Choose your gender..", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (binding.birthday.text.isEmpty()) {
                Toast.makeText(this, "Error! Enter your birthday..", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (binding.address.text.isEmpty()) {
                Toast.makeText(this, "Error! Enter your Address..", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (binding.checkBox.isChecked == false) {
                Toast.makeText(this, "Confirm agree Terms of Use..", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            Toast.makeText(this, "Successful!", Toast.LENGTH_SHORT)
        })
    }
}