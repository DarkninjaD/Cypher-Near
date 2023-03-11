package com.example.cypher_near.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cypher_near.databinding.SelectCharacterLayoutBinding
import com.example.cypher_near.model.CypherCharacterSheet

class CharacterListAdapter : RecyclerView.Adapter<CharacterListAdapter.MyViewHolder>() {

    private var charList = emptyList<CypherCharacterSheet>()

    class MyViewHolder(private val binding: SelectCharacterLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(result: CypherCharacterSheet) {
            binding.values = result
            binding.executePendingBindings()
        }

        companion object {
            fun from(parent: ViewGroup) : MyViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = SelectCharacterLayoutBinding.inflate(layoutInflater, parent, false)
                return MyViewHolder(binding)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder.from(parent)
    }

    override fun getItemCount(): Int {
        return charList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentRecipe = charList[position]
        holder.bind(currentRecipe)
    }

    fun setData(newData: List<CypherCharacterSheet>){
        charList = newData
        Log.e("Data", newData.size.toString())
        this.notifyDataSetChanged()
    }
}