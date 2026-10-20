package lat.pam.recyclerviewsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Mengambil RecyclerView berdasarkan ID
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)

        // Mengatur LayoutManager menjadi Linear (vertikal)
        recyclerview.layoutManager = LinearLayoutManager(this)

        // Membuat ArrayList untuk menampung data model
        val data = ArrayList<ItemsViewModel>()

        // Perulangan untuk membuat 20 data item
        for (i in 1..20) {
            data.add(ItemsViewModel("Item " + i))
        }

        // Memasukkan data ke dalam CustomAdapter
        val adapter = CustomAdapter(data)
        Log.d("test string", "Jumlah data: " + data.size)

        // Menghubungkan adapter dengan recyclerview
        recyclerview.adapter = adapter
    }
}