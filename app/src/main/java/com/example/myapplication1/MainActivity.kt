package com.example.myapplication1

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lateinit var listView: ListView //lateinit cho phép khai báo một biến và hoãn việc khởi tạo nó cho đến khi nó được gán giá trị.(giá trị nó đc gán vào list vew)
        val MonHoc = arrayOf( "Công nghệ Phần mềm", "Web", "Di động", "Giao diện", "Mạng máy tính", "Hệ điều hành")

        listView = findViewById(R.id.listView)
        val Mon = ArrayAdapter(this, android.R.layout.simple_list_item_1, MonHoc) // gọi hiển thị
        listView.adapter = Mon

        listView.onItemClickListener =
            AdapterView.OnItemClickListener { parent, view, position, id ->
                val selectedItem = parent.getItemAtPosition(position) as String
                Toast.makeText(applicationContext, selectedItem, Toast.LENGTH_SHORT).show()
            }
    }
}
