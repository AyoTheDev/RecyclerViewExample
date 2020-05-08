package co.scienta.recyclerview

import android.os.Bundle
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import co.scienta.recyclerview.adapters.ItemListListener
import co.scienta.recyclerview.adapters.MainAdapter
import co.scienta.recyclerview.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    private val mainAdapter: MainAdapter by lazy {
        MainAdapter(
            adapterListener
        )
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.mainList.adapter = mainAdapter

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        observeViewModel()
        viewModel.loadData()
    }

    private fun observeViewModel() {
        viewModel.listeItemsLiveData.observe(this, Observer { items -> mainAdapter.update(items) } )

    }

    private val adapterListener = object : ItemListListener {
        override fun onClick(position: Int) {
            Toast.makeText(this@MainActivity, "Clicked item", LENGTH_SHORT).show()
        }

        override fun onChildClick(position: Int) {
            Toast.makeText(this@MainActivity, "Clicked child item", LENGTH_SHORT).show()
        }
    }
}
