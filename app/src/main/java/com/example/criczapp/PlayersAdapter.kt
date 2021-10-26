package com.example.criczapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView

class PlayersAdapter(private val countryName:String,context: Context):RecyclerView.Adapter<PlayersAdapter.PlayersViewHolder>(){


    private val countrySquad:List<String>

    init {
        val sw= countryName.slice(0..2)
        val p= context.resources.getIdentifier(sw,"array",context.packageName)
        val ps= context.resources.getStringArray(p).toList()
        countrySquad=ps
    }

    class PlayersViewHolder(view: View):RecyclerView.ViewHolder(view)
    {
        val button= view.findViewById<Button>(R.id.button_item)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayersViewHolder {
       val layout= LayoutInflater.from(parent.context).inflate(R.layout.item_view,parent,false)
        return PlayersViewHolder(layout)
    }

    override fun onBindViewHolder(holder: PlayersViewHolder, position: Int) {

        val item=countrySquad[position]
        holder.button.text=item

        holder.button.setOnClickListener {



        }

    }

    override fun getItemCount(): Int {
       return countrySquad.size
    }
}