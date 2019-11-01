package com.example.responsi_088

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.responsi_088.adapter.ListSmartphoneAdapter
import com.example.responsi_088.model.Xiaomi
import com.example.responsi_088.model.XiaomiData
import kotlinx.android.synthetic.main.activity_home.*

class Home : AppCompatActivity() {
    private lateinit var rvSmartphone: RecyclerView
    private var list: ArrayList<Xiaomi> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        rvSmartphone= findViewById(R.id.rv_smartphone)
        rvSmartphone.setHasFixedSize(true)
        list.addAll(XiaomiData.SmartphoneData.listSmartphone)
        showSmartphoneList()

        val tampung_lagi_nama : String? = intent.getStringExtra("Nama")
        val tampung_lagi_username : String? = intent.getStringExtra("Username")
        val tampung_lagi_password : String? = intent.getStringExtra("Password")

        tv_personal.setOnClickListener(){
            intent = Intent(this, Detail::class.java)
            intent.putExtra("Nama", tampung_lagi_nama.toString())
            intent.putExtra("Username", tampung_lagi_username.toString())
            intent.putExtra("Password", tampung_lagi_password.toString())
            startActivity(intent)
        }
    }
    private fun showSmartphoneList() {
        rvSmartphone.layoutManager = LinearLayoutManager(this)
        val listSmartphoneAdapter = ListSmartphoneAdapter(list)
        rvSmartphone.adapter = listSmartphoneAdapter
    }



}
