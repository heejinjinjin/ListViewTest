package kr.ac.kopo.listviewtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var imgv : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var list = findViewById<ListView>(R.id.list)
        imgv = findViewById<ImageView>(R.id.imgv)

        var items = arrayOf("바나나", "메론", "딸기", "포도", "키위", "귤", "사과", "배")
        var imgRes = arrayOf(R.drawable.banana, R.drawable.apple, R.drawable.kiwi, R.drawable.rbf, R.drawable.melon, R.drawable.pear, R.drawable.straw)


        var adaqter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items)
        list.adapter = adaqter

        list.setOnItemClickListener { parent, view, position, id ->
            imgv.setImageResource(imgRes[position])
            Toast.makeText(applicationContext, items[position] + "는 정말 달콤해요~", Toast.LENGTH_SHORT).show()
        }
    }
}