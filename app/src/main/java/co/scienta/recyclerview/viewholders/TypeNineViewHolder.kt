/*
 * Copyright (C) Fluidic Analytics Limited, 2020.
 * All rights reserved.
 */

package co.scienta.recyclerview.viewholders


import android.view.View
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import co.scienta.recyclerview.adapters.MainAdapter
import co.scienta.recyclerview.TypeNineItem
import co.scienta.recyclerview.R
import co.scienta.recyclerview.adapters.ItemListListener
import co.scienta.recyclerview.adapters.NestedAdapter
import co.scienta.recyclerview.databinding.Item9ViewBinding

class TypeNineViewHolder(private val binding: Item9ViewBinding, private val listener: ItemListListener)
    : RecyclerView.ViewHolder(binding.root), View.OnClickListener {


    init {
        binding.root.setOnClickListener(this)
    }

    private val context = binding.root.context

    private val adapter: NestedAdapter by lazy { NestedAdapter(listener) }

    fun bind(item: TypeNineItem, viewPool: RecyclerView.RecycledViewPool) {

        val nestedLayoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)

        binding.nestedList.apply {
            layoutManager = nestedLayoutManager
            adapter = this@TypeNineViewHolder.adapter
            setRecycledViewPool(viewPool)
        }

        adapter.update(item.items)
    }

    override fun onClick(v: View?) {
        listener.onClick(adapterPosition)
    }
}