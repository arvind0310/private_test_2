package com.example.lib_private

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.toasty.ToasterTest

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.btnToast)
//        Toaster.simpleToast(this, "hii i am toaster library") // cant access method using direct Class, will have to create companion object.
        val toasterObj = ToasterTest()
        button.setOnClickListener {
            toasterObj.privateToastLong(this, "hii i am private toaster library")
        }
    }
}
