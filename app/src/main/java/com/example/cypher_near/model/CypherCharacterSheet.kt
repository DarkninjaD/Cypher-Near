package com.example.cypher_near.model

data class CypherCharacterSheet(
    val charName: String = "",
    val charDescriptor: String = "",
    val charType: String = "",
    val charFocus: String = "",
    val mightTotal: Int = 0,
    val mightPool: Int =  0,
    val mightEdge: Int = 0,
    val speedTotal: Int = 0,
    val speedPool: Int = 0,
    val speedEdge: Int = 0,
    val intelTotal: Int = 0,
    val intelPool: Int = 0,
    val intelEdge: Int = 0,
    val charTier: Int = 0,
    val charEffort: Int = 0,
    val charXP: Int = 0
)
