package com.example.smd_assignment_03_19l0995

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room
import com.example.smd_assignment_03_19l0995.model.Restaurants

class MainActivity : AppCompatActivity() {

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
        title = "RESTAURANTS"

        //supportActionBar?.hide()
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        layoutManager = LinearLayoutManager(this)

        val lis = mutableListOf<Restaurants>()

//        lis.add(Restaurants())
//        lis.add(Restaurants())
//        lis.add(Restaurants())

        val db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "temp.db"
        ).build()

        val resDao = db.userDao()
        val users: List<Restaurants> = resDao.getAll

        recyclerView.adapter = RecyclerAdapter(lis)
        recyclerView.layoutManager = layoutManager
    }
}