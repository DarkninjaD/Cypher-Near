package com.example.cypher_near

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cypher_near.adapter.CharacterListAdapter
import com.example.cypher_near.model.CypherCharacterSheet


class SelectCharacter : Fragment(R.layout.fragment_select_character) {

    private val mAdapter by lazy { CharacterListAdapter() }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val mView = super.onCreateView(inflater, container, savedInstanceState)
        val testRecyclerView = mView!!.findViewById<RecyclerView>(R.id.character_list)
        Log.d("test", "here")
        mAdapter.setData(testItem())
        Log.d("test", "here2")
        testRecyclerView.layoutManager = LinearLayoutManager(this.requireContext())
        Log.d("test", "here2")
        testRecyclerView.adapter = mAdapter

        return mView
    }

    private fun testItem() : List<CypherCharacterSheet> {
        val testChar : MutableList<CypherCharacterSheet> = mutableListOf()
        testChar.add(CypherCharacterSheet(charName = "Test 1", mightPool = 10, speedPool = 3, intelPool = 5))
        testChar.add(CypherCharacterSheet(charName = "Test 2", mightPool = 3, speedPool = 10, intelPool = 5))
        testChar.add(CypherCharacterSheet(charName = "Test 3", mightPool = 3, speedPool = 5, intelPool = 10))
        testChar.add(CypherCharacterSheet(charName = "Test 4", mightPool = 20, speedPool = 20, intelPool = 20))
        return testChar
    }
}