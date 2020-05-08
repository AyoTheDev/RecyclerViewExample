/*
 * Copyright (C) Fluidic Analytics Limited, 2020.
 * All rights reserved.
 */

package co.scienta.recyclerview.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import co.scienta.recyclerview.*
import co.scienta.recyclerview.databinding.*
import co.scienta.recyclerview.utils.RecyclerViewItemDiffCallback
import co.scienta.recyclerview.viewholders.*
import java.lang.IllegalStateException

class NestedAdapter(private val listener: ItemListListener) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object {
        private const val TYPE_0 = 0
        private const val TYPE_1 = 1
        private const val TYPE_2 = 2
        private const val TYPE_3 = 3
        private const val TYPE_4 = 4
        private const val TYPE_5 = 5
        private const val TYPE_6 = 6
        private const val TYPE_7 = 7
        private const val TYPE_8 = 8
    }

    private val items = mutableListOf<RecyclerItem>()

    fun update(list: List<RecyclerItem>) {
        val diffCallBack =
            RecyclerViewItemDiffCallback(items, list)
        val diffResult = DiffUtil.calculateDiff(diffCallBack)
        items.clear()
        items.addAll(list)
        diffResult.dispatchUpdatesTo(this)
    }

    fun getItem(position: Int) = items[position]

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return when (viewType) {
            TYPE_0 -> {
                val binding: Item0ViewBinding = Item0ViewBinding.inflate(inflater)
                TypeZeroViewHolder(binding, listener)
            }
            TYPE_1 -> {
                val binding: Item1ViewBinding = Item1ViewBinding.inflate(inflater)
                TypeOneViewHolder(binding, listener)
            }
            TYPE_2 -> {
                val binding: Item2ViewBinding = Item2ViewBinding.inflate(inflater)
                TypeTwoViewHolder(binding, listener)
            }
            TYPE_3 -> {
                val binding: Item3ViewBinding = Item3ViewBinding.inflate(inflater)
                TypeThreeViewHolder(binding, listener)
            }
            TYPE_4 -> {
                val binding: Item4ViewBinding = Item4ViewBinding.inflate(inflater)
                TypeFourViewHolder(binding, listener)
            }
            TYPE_5 -> {
                val binding: Item5ViewBinding = Item5ViewBinding.inflate(inflater)
                TypeFiveViewHolder(binding, listener)
            }
            TYPE_6 -> {
                val binding: Item6ViewBinding = Item6ViewBinding.inflate(inflater)
                TypeSixViewHolder(binding, listener)
            }
            TYPE_7 -> {
                val binding: Item7ViewBinding = Item7ViewBinding.inflate(inflater)
                TypeSevenViewHolder(binding, listener)
            }
            TYPE_8 -> {
                val binding: Item8ViewBinding = Item8ViewBinding.inflate(inflater)
                TypeEightViewHolder(binding, listener)
            }
            else -> throw IllegalStateException("unhandled view type")
        }
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        return when (holder) {
            is TypeZeroViewHolder -> holder.bind(items[position] as TypeZeroItem)
            is TypeOneViewHolder -> holder.bind(items[position] as TypeOneItem)
            is TypeTwoViewHolder -> holder.bind(items[position] as TypeTwoItem)
            is TypeThreeViewHolder -> holder.bind(items[position] as TypeThreeItem)
            is TypeFourViewHolder -> holder.bind(items[position] as TypeFourItem)
            is TypeFiveViewHolder -> holder.bind(items[position] as TypeFiveItem)
            is TypeSixViewHolder -> holder.bind(items[position] as TypeSixItem)
            is TypeSevenViewHolder -> holder.bind(items[position] as TypeSevenItem)
            is TypeEightViewHolder -> holder.bind(items[position] as TypeEightItem)
            else -> throw IllegalStateException("view holder not recognised")
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when (items[position]) {
            is TypeZeroItem -> TYPE_0
            is TypeOneItem -> TYPE_1
            is TypeTwoItem -> TYPE_2
            is TypeThreeItem -> TYPE_3
            is TypeFourItem -> TYPE_4
            is TypeFiveItem -> TYPE_5
            is TypeSixItem -> TYPE_6
            is TypeSevenItem -> TYPE_7
            is TypeEightItem -> TYPE_8
            else -> throw IllegalStateException("item type not recognised")
        }
    }
}