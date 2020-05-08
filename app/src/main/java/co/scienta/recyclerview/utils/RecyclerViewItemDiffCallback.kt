/*
 * Copyright (C) Fluidic Analytics Limited, 2020.
 * All rights reserved.
 */

package co.scienta.recyclerview.utils

import androidx.recyclerview.widget.DiffUtil
import co.scienta.recyclerview.RecyclerItem
/**
 * A Callback class used to calculate the difference between two lists.
 */
class RecyclerViewItemDiffCallback(private val oldList: List<RecyclerItem>, private val newList: List<RecyclerItem>) :
        DiffUtil.Callback() {

    override fun getOldListSize(): Int {
        return oldList.size
    }

    override fun getNewListSize(): Int {
        return newList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition].id == newList[newItemPosition].id
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val old = oldList[oldItemPosition]
        val new = newList[newItemPosition]
        return old.id == new.id
    }
}
