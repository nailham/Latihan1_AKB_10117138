package com.example.latihan1
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1.setOnClickListener {
            val intent = Intent(this, kode::class.java)
            startActivity(intent)
        }
    }
}
/*
Pengerjaan Tanggal : 05-04-2020
Deskripsi pengerjaan : mengerjakan layout activity_biodata,kode,main,dan ok
mengerjakan class yang terdiri dari biodata,kode,main_activity dan ok
menambahkan values string dan drawable custom_button,comtum_ beserta coding
Nim :10117138
Nama :IlhamNurjaman
Kelas :IF4/AKB
*/
