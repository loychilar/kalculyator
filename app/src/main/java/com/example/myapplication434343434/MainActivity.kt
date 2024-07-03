package com.example.myapplication434343434


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication434343434.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var birinchison = ""
    private var ikkinchison = ""
    private var uchinchi = ""
    private var tortinchi = ""
    private var amal = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            if (amal == "") {
                birinchison += "1"
                binding.b.text = birinchison
            } else if (amal == "+" || amal == "-" || amal == "×" || amal == "÷") {
                ikkinchison += "1"
                binding.b.text = ikkinchison

            }
        }

        binding.btn2.setOnClickListener {
            if (amal == "") {
                birinchison += "2"
                binding.b.text = birinchison
            } else if (amal == "-" || amal == "+" || amal == "×" || amal == "÷") {
                ikkinchison += "2"
                binding.b.text = ikkinchison
            }
        }

        binding.btn3.setOnClickListener {
            if (amal == "") {
                birinchison += "3"
                binding.b.text = birinchison
            } else if (amal == "-" || amal == "+" || amal == "×" || amal == "÷") {
                ikkinchison += "3"
                binding.b.text = ikkinchison
            }
        }

        binding.btn4.setOnClickListener {
            if (amal == "") {
                birinchison += "4"
                binding.b.text = birinchison
            } else if (amal == "-" || amal == "+" || amal == "×" || amal == "÷") {
                ikkinchison += "4"
                binding.b.text = ikkinchison
            }
        }

        binding.btn5.setOnClickListener {
            if (amal == "") {
                birinchison += "5"
                binding.b.text = birinchison
            } else if (amal == "-" || amal == "+" || amal == "×" || amal == "÷") {
                ikkinchison += "5"
                binding.b.text = ikkinchison
            }
        }

        binding.btn6.setOnClickListener {
            if (amal == "") {
                birinchison += "6"
                binding.b.text = birinchison
            } else if (amal == "-" || amal == "+" || amal == "×" || amal == "÷") {
                ikkinchison += "6"
                binding.b.text = ikkinchison
            }
        }

        binding.btn7.setOnClickListener {
            if (amal == "") {
                birinchison += "7"
                binding.b.text = birinchison
            } else if (amal == "-" || amal == "+" || amal == "×" || amal == "÷") {
                ikkinchison += "7"
                binding.b.text = ikkinchison
            }
        }

        binding.btn8.setOnClickListener {
            if (amal == "") {
                birinchison += "8"
                binding.b.text = birinchison
            } else if (amal == "-" || amal == "+" || amal == "×" || amal == "÷") {
                ikkinchison += "8"
                binding.b.text = ikkinchison
            }
        }

        binding.btn9.setOnClickListener {
            if (amal == "") {
                birinchison += "9"
                binding.b.text = birinchison
            } else if (amal == "-" || amal == "+" || amal == "×" || amal == "÷") {
                ikkinchison += "9"
                binding.b.text = ikkinchison
            }
        }

        binding.btn0.setOnClickListener {
            if (amal == "") {
                birinchison += "0"
                binding.b.text = birinchison
            } else if (amal == "-" || amal == "+" || amal == "×" || amal == "÷") {
                ikkinchison += "0"
                binding.b.text = ikkinchison
            }
        }

        binding.btnAC.setOnClickListener {
            binding.b.text = ""
            birinchison = ""
            ikkinchison = ""
            uchinchi = ""
            tortinchi = ""
            amal = ""
            amal = ""
        }

        binding.btnqoshish.setOnClickListener {
            binding.b.text = ""
            amal = "+"

        }

        binding.btnminus.setOnClickListener {
            binding.b.text = ""
            amal = "-"

        }

        binding.btnkopaytirish.setOnClickListener {
            binding.b.text = ""
            amal = "×"

        }

        binding.btnbolish.setOnClickListener {
            binding.b.text = ""
            amal = "÷"

        }

        binding.btnteng.setOnClickListener {
            if (amal == "+") {
                binding.b.text = "${birinchison.toInt() + ikkinchison.toInt() + uchinchi.toInt() + tortinchi.toInt()}"
            } else if (amal == "-") {
                binding.b.text = "${birinchison.toInt() - ikkinchison.toInt()}"
            } else if (amal == "×") {
                binding.b.text = "${birinchison.toInt() * ikkinchison.toInt()}"
            } else if (amal == "÷") {
                binding.b.text = "${birinchison.toInt() / ikkinchison.toInt()}"
            }
        }


    }
}
