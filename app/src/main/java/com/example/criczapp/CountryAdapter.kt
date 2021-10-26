package com.example.criczapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView

class CountryAdapter(context: Context):RecyclerView.Adapter<CountryAdapter.CountryViewHolder>() {

    private val cList:List<String>
    init {
        val c=context.resources.getStringArray(R.array.countries).toList()
        cList=c
    }


    class CountryViewHolder(val view: View):RecyclerView.ViewHolder(view){

        val button= view.findViewById<Button>(R.id.button_item)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
       val layout=LayoutInflater.from(parent.context).inflate(R.layout.item_view,parent,false)
       return CountryViewHolder(layout)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        val item= cList[position]
        val context=holder.view.context


        holder.button.text=item

        holder.button.setOnClickListener {


        }


    }

    override fun getItemCount():Int= cList.size

}