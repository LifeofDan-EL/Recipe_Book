package com.danielanomfueme.recipebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    private lateinit var interactionAdapter: HomeRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        val cardViewRecipe = findViewById<CardView>(R.id.recipe_cardView)
        cardViewRecipe.setOnClickListener{
            val intent = Intent(this, RecipesActivity::class.java)
            startActivity(intent)
        }

        val cardViewChats = findViewById<CardView>(R.id.chats_cardView)
        cardViewChats.setOnClickListener{
            val intent = Intent(this, ChatsActivity::class.java)
            startActivity(intent)
        }

        val cardViewNetworks = findViewById<CardView>(R.id.network_cardView)
        cardViewNetworks.setOnClickListener{
            val intent = Intent(this, NetworksActivity::class.java)
            startActivity(intent)
        }

        val cardViewFriends = findViewById<CardView>(R.id.friends_cardView)
        cardViewFriends.setOnClickListener{
            val intent = Intent(this, FriendsActivity::class.java)
            startActivity(intent)
        }

        val cardViewFavourites = findViewById<CardView>(R.id.favourite_cardView)
        cardViewFavourites.setOnClickListener{
            val intent = Intent(this, FavouriteActivity::class.java)
            startActivity(intent)
        }
        val cardViewUploads = findViewById<CardView>(R.id.uploads_cardView)
        cardViewUploads.setOnClickListener{
            val intent = Intent(this, UploadsActivity::class.java)
            startActivity(intent)
        }

        initRecyclerView()
        addDataSet()
    }

    private fun addDataSet(){
        val data = DataSource.createDataSet()
        interactionAdapter.submitList(data)
    }

    private fun initRecyclerView(){
        home_recycler.apply{
            layoutManager = LinearLayoutManager(this@HomeActivity)
            val topSpacingDecoration = TopSpacingItemDecoration(30)
            addItemDecoration(topSpacingDecoration)
            interactionAdapter = HomeRecyclerAdapter()
            adapter = interactionAdapter
        }
    }
}
