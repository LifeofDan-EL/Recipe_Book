package com.danielanomfueme.recipebook.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.danielanomfueme.recipebook.R
import com.danielanomfueme.recipebook.models.Interaction
import kotlinx.android.synthetic.main.home_list_layout.view.*

class HomeRecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    private  var items: List<Interaction> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return InteractionViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.home_list_layout,
                parent,
                false
            )
        )
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
            when(holder){
                is InteractionViewHolder ->{
                    holder.bind(items.get(position))
                }
            }
    }

    override fun getItemCount(): Int {
        return items.size
    }
    fun submitList(interactionList: List<Interaction>){
        items = interactionList
    }

    class InteractionViewHolder constructor(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView){
        val interactionTitle = itemView.int_title
        val interactionTime = itemView.int_time

        fun bind (interaction: Interaction){
            interactionTitle.setText(interaction.title)
            interactionTime.setText(interaction.time)
        }
    }
}