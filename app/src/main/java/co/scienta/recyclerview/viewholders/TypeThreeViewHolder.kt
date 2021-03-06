/*
 * Copyright (C) Fluidic Analytics Limited, 2020.
 * All rights reserved.
 */

package co.scienta.recyclerview.viewholders


import android.view.View
import androidx.recyclerview.widget.RecyclerView
import co.scienta.recyclerview.adapters.MainAdapter
import co.scienta.recyclerview.TypeThreeItem
import co.scienta.recyclerview.R
import co.scienta.recyclerview.adapters.ItemListListener
import co.scienta.recyclerview.databinding.Item3ViewBinding

class TypeThreeViewHolder(private val binding: Item3ViewBinding, private val listener: ItemListListener)
    : RecyclerView.ViewHolder(binding.root), View.OnClickListener {

    init {
        binding.root.setOnClickListener(this)
    }

    private val context = binding.root.context

    fun bind(item: TypeThreeItem) {
        val text = context.getString(R.string.title)
        binding.title.text = String.format(text, "\"${item.text}\"")
    }

    override fun onClick(v: View?) {
        listener.onClick(adapterPosition)
    }
}