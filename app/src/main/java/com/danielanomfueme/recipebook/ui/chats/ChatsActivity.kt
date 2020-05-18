package com.danielanomfueme.recipebook.ui.chats

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.danielanomfueme.recipebook.models.DataSource
import com.danielanomfueme.recipebook.R
import com.danielanomfueme.recipebook.ui.TopSpacingItemDecoration
import kotlinx.android.synthetic.main.activity_chats.*

class ChatsActivity : AppCompatActivity() {

    private lateinit var interactionAdapter: ChatsRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chats)

        initRecyclerView()
        addDataSet()
    }

    private fun addDataSet(){
        val data =
            DataSource.createDataSet()
        interactionAdapter.submitList(data)
    }

    private fun initRecyclerView(){
        chats_recycler.apply{
           layoutManager = LinearLayoutManager(this@ChatsActivity)
           val topSpacingDecoration =
               TopSpacingItemDecoration(2)
            addItemDecoration(topSpacingDecoration)
            interactionAdapter =
                ChatsRecyclerAdapter()
            adapter = interactionAdapter
        }
    }

}
