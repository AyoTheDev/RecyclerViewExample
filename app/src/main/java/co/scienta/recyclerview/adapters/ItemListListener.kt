package co.scienta.recyclerview.adapters

interface ItemListListener {

    fun onClick(position: Int)

    fun onChildClick(position: Int)
}