package com.danielanomfueme.recipebook.ui.friends

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.danielanomfueme.recipebook.R
import com.danielanomfueme.recipebook.models.Interaction
import kotlinx.android.synthetic.main.chat_list_layout.view.user_image
import kotlinx.android.synthetic.main.chat_list_layout.view.user_name
import kotlinx.android.synthetic.main.friends_list_layout.view.*

class FriendsRecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var items: List<Interaction> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return InteractionViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.friends_list_layout,
                parent,
                false
            )
        )
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is InteractionViewHolder -> {
                holder.bind(items.get(position))
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun submitList(interactionList: List<Interaction>) {
        items = interactionList
    }

    class InteractionViewHolder constructor(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView) {

        val interactionUserImage = itemView.user_image
        val interactionUserName = itemView.user_name
        val interactionUserFriends = itemView.user_friends

        fun bind(interaction: Interaction) {
            interactionUserName.setText(interaction.name)
            interactionUserFriends.setText(interaction.friends)

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