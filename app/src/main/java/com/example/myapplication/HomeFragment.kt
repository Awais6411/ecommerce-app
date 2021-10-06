package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.Adapters.myAdapter
import com.example.myapplication.Api.WebAPi
import com.example.myapplication.Api.retrofit
import com.example.myapplication.Model.Ecomrece
import com.example.myapplication.databinding.FragmentHomeBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomeFragment : Fragment() {
lateinit var myAdapter: myAdapter
lateinit var webAPi: WebAPi
lateinit var binding: FragmentHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        inflater.inflate(R.layout.fragment_home, container, false)
    binding= FragmentHomeBinding.inflate(inflater)
    return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    webAPi=retrofit.getObject().create(WebAPi::class.java)
        val data = webAPi.getData()
        var layout=LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        binding.recyclerView.layoutManager=layout

        data.enqueue(object : Callback<Ecomrece> {
            override fun onResponse(call: Call<Ecomrece>, response: Response<Ecomrece>) {
                if (response.code() == 200) {

                    val ecomrece =response.body()
                    val data1 =ecomrece.data

                    myAdapter= myAdapter(this@HomeFragment,data1,context!!)
                    binding.recyclerView.adapter=myAdapter
                }
                myAdapter.notifyDataSetChanged()

            }
            override fun onFailure(call: Call<Ecomrece>, t: Throwable) {
                Toast.makeText(context,t.message,Toast.LENGTH_LONG).show()

            }
        })

    }
}