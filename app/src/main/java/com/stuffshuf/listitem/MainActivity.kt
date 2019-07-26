package com.stuffshuf.listitem

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.list_item_color.*
import kotlinx.android.synthetic.main.list_item_color.view.*

class MainActivity : AppCompatActivity() {


    val colors = arrayOf(
        "red", "green", "blue",
        "cyan", "magenta", "yellow",
        "black", "white", "grey",
        "purple", "orange", "brown",
        "teal", "aqua", "indigo",
        "pink", "turquoise", "seagreen"

    )

   val language = arrayOf<String>(
        "C",
        "C++",
        "JAVA",
        "JAVA",
        "JAVA",
        "C",
        "NODE JS",
        "JAVA",
        "C++",
        "JAVA",
        "JAVA",
        "JAVA",
        "Paython",
        "NODE JS",
        "JAVA",
        "JAVA",
        "JAVA"
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val customAdapter=CustomAdapter(this, colors, language)
        lvColors.adapter=customAdapter
    }

        class CustomAdapter(val context: Context, val cls:Array<String>, val lang:Array<String>): BaseAdapter() {


            override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

                val li=context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
                val textView= li.inflate(R.layout.list_item_color,parent, false)

                val textClr= cls[position]
                val textLang= lang[position]


                textView.tv.text=textClr
                textView.tv1.text=textLang
                return textView


            }

            override fun getItem(position: Int): Any? {
                return null
            }

            override fun getItemId(position: Int): Long {
                return 0
            }

            override fun getCount(): Int {
                return cls.size
            }

        }
    }

