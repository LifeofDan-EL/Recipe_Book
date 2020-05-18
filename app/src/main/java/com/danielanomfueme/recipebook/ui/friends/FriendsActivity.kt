package com.danielanomfueme.recipebook.ui.friends

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.danielanomfueme.recipebook.models.DataSource
import com.danielanomfueme.recipebook.R
import com.danielanomfueme.recipebook.ui.TopSpacingItemDecoration
import kotlinx.android.synthetic.main.activity_friends.*

class FriendsActivity : AppCompatActivity() {


    private lateinit var interactionAdapter: FriendsRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_friends)

        initRecyclerView()
        addDataSet()
    }

    private fun addDataSet(){
        val data =
            DataSource.createDataSet()
        interactionAdapter.submitList(data)
    }

    private fun initRecyclerView(){
        friends_recycler.apply{
            layoutManager = LinearLayoutManager(this@FriendsActivity)
            val topSpacingDecoration =
                TopSpacingItemDecoration(8)
            addItemDecoration(topSpacingDecoration)
            interactionAdapter =
                FriendsRecyclerAdapter()
            adapter = interactionAdapter
        }
    }
}
