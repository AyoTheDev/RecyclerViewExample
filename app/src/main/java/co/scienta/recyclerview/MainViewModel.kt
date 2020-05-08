/*
 * Copyright (C) Fluidic Analytics Limited, 2020.
 * All rights reserved.
 */

package co.scienta.recyclerview

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val listeItemsLiveData = MutableLiveData<List<RecyclerItem>>()

    fun loadData() {
        val items = getDataFromRepo()
        listeItemsLiveData.postValue(items)
    }

    private fun getDataFromRepo(): List<RecyclerItem> {
        return listOf(
            TypeZeroItem("Type 0"), TypeOneItem("Type 1"), TypeTwoItem("Type 2"),
            TypeThreeItem("Type 3"), TypeFourItem("Type 4"), TypeFiveItem("Type 5"),
            TypeSixItem("Type 6"), TypeSevenItem("Type 7"), TypeEightItem("Type 8"),
            TypeNineItem(getNestedDataInfo()), TypeFiveItem("Type 5"),
            TypeSixItem("Type 6"), TypeSevenItem("Type 7"), TypeEightItem("Type 8"), TypeFiveItem("Type 5"),
            TypeSixItem("Type 6"), TypeSevenItem("Type 7"), TypeEightItem("Type 8"), TypeFiveItem("Type 5"),
            TypeSixItem("Type 6"), TypeSevenItem("Type 7"), TypeEightItem("Type 8"), TypeFiveItem("Type 5"),
            TypeSixItem("Type 6"), TypeSevenItem("Type 7"), TypeEightItem("Type 8"), TypeFiveItem("Type 5"),
            TypeSixItem("Type 6"), TypeSevenItem("Type 7"), TypeEightItem("Type 8"), TypeFiveItem("Type 5"),
            TypeSixItem("Type 6"), TypeSevenItem("Type 7"), TypeEightItem("Type 8"), TypeFiveItem("Type 5"),
            TypeSixItem("Type 6"), TypeSevenItem("Type 7"), TypeEightItem("Type 8"), TypeFiveItem("Type 5"),
            TypeSixItem("Type 6"), TypeSevenItem("Type 7"), TypeEightItem("Type 8"), TypeFiveItem("Type 5"),
            TypeSixItem("Type 6"), TypeSevenItem("Type 7"), TypeEightItem("Type 8"), TypeFiveItem("Type 5"),
            TypeSixItem("Type 6"), TypeSevenItem("Type 7"), TypeEightItem("Type 8"), TypeFiveItem("Type 5"),
            TypeSixItem("Type 6"), TypeSevenItem("Type 7"), TypeEightItem("Type 8"))
    }

    private fun getNestedDataInfo(): List<RecyclerItem> {
        return listOf(
            TypeZeroItem("|NESTED|"),TypeZeroItem("|NESTED|"),TypeZeroItem("|NESTED|"),TypeZeroItem("|NESTED|")
            ,TypeZeroItem("|NESTED|"),TypeZeroItem("|NESTED|"),TypeZeroItem("|NESTED|"),TypeZeroItem("|NESTED|"),TypeZeroItem("|NESTED|")
            ,TypeZeroItem("|NESTED|"),TypeZeroItem("|NESTED|"),TypeZeroItem("|NESTED|"),TypeZeroItem("|NESTED|"),TypeZeroItem("|NESTED|"),TypeZeroItem("|NESTED|")
            ,TypeZeroItem("|NESTED|")
        )
    }
}