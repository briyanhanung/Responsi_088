package com.example.responsi_088.model

import com.example.responsi_088.R

object XiaomiData {
    object SmartphoneData {
        private val smartphoneName= arrayOf(
            "Xiaomi Redmi 2",
            "Xiaomi Redmi 5",
            "Xiaomi Redmi 5 pro",
            "Xiaomi Redmi 6A",
            "Xiaomi Redmi 6 pro",
            "Xiaomi note 5",
            "Xiaomi note 5 pro",
            "Xiaomi redmi 8",
            "Xiaomi redmi note 8",
            "Xiaomi pocophone F1"
        )
        private val detail = arrayOf(
            "Produk Xiaomi Pertama",
            "Produk Xiaomi Kedua",
            "Produk Xiaomi Ketiga",
            "Produk Xiaomi Keempat",
            "Produk Xiaomi Kelima",
            "Produk Xiaomi Keenam",
            "Produk Xiaomi Ketujuh",
            "Produk Xiaomi Kedelapan",
            "Produk Xiaomi Kesembilan",
            "Produk Xiaomi Kesepuluh"

        )
        private val smartphonePoster= intArrayOf(
            R.drawable.poco,
            R.drawable.poco,
            R.drawable.poco,
            R.drawable.poco,
            R.drawable.poco,
            R.drawable.poco,
            R.drawable.poco,
            R.drawable.poco,
            R.drawable.poco,
            R.drawable.poco
        )
        val listSmartphone: ArrayList<Xiaomi>
            get() {
                val list = arrayListOf<Xiaomi>()
                for (position in smartphoneName.indices) {
                    val smartphone = Xiaomi()
                    smartphone.name = smartphoneName[position]
                    smartphone.detail = detail[position]
                    smartphone.poster = smartphonePoster[position]
                    list.add(smartphone)
                }
                return list
            }
    }
}