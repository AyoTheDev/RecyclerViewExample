/*
 * Copyright (C) Fluidic Analytics Limited, 2020.
 * All rights reserved.
 */

package co.scienta.recyclerview
import java.util.*

//we use this ID in the DIffCallback class
abstract class RecyclerItem(val id: String = UUID.randomUUID().toString())

class TypeZeroItem(val text: String): RecyclerItem()

class TypeOneItem(val text: String): RecyclerItem()

class TypeTwoItem(val text: String): RecyclerItem()

class TypeThreeItem(val text: String): RecyclerItem()

class TypeFourItem(val text: String): RecyclerItem()

class TypeFiveItem(val text: String): RecyclerItem()

class TypeSixItem(val text: String): RecyclerItem()

class TypeSevenItem(val text: String): RecyclerItem()

class TypeEightItem(val text: String): RecyclerItem()

class TypeNineItem(val items: List<RecyclerItem>): RecyclerItem()

