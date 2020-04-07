package com.danielanomfueme.recipebook

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.danielanomfueme.recipebook.models.Interaction
import kotlinx.android.synthetic.main.chat_list_layout.view.*

class ChatsRecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    private  var items: List<Interaction> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return InteractionViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.chat_list_layout, parent, false)
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

        val interactionUserImage = itemView.user_image
        val interactionUserName = itemView.user_name
        val interactionUserMessage = itemView.user_maessage

        fun bind (interaction: Interaction){
            interactionUserName.setText(interaction.name)
            interactionUserMessage.setText(interaction.message)

            val requestOptions = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)

            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOptions)
                .load(interaction.image)
                .into(interactionUserImage)
        }
    }
}