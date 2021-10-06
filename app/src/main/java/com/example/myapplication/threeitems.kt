package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.Adapters.itemsAdatpter
import com.example.myapplication.Adapters.myAdapter
import com.example.myapplication.Api.WebAPi
import com.example.myapplication.Api.retrofit
import com.example.myapplication.Model.Data
import com.example.myapplication.Model.Ecomrece
import com.example.myapplication.databinding.FragmentHomeBinding
import com.example.myapplication.databinding.FragmentThreeitemsBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class threeitems : Fragment() {
    lateinit var myAdapter: itemsAdatpter
    lateinit var webAPi: WebAPi
    lateinit var binding: FragmentThreeitemsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
     inflater.inflate(R.layout.fragment_threeitems, container, false)
    binding= FragmentThreeitemsBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//    var bundle=arguments
//        val parcelable = bundle!!.getParcelable<Data>("key")
var linearLayoutManager=LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        binding.re.layoutManager=linearLayoutManager
    webAPi=retrofit.getObject().create(WebAPi::class.java)
        val images = webAPi.getImages()
images.enqueue(object :Callback<Ecomrece>{
    override fun onResponse(call: Call<Ecomrece>?, response: Response<Ecomrece>?) {
var ecomrece=response!!.body()
        var data=ecomrece.data
        myAdapter= itemsAdatpter(data)
        binding.re.adapter=myAdapter
        myAdapter.notifyDataSetChanged()
    }

    override fun onFailure(call: Call<Ecomrece>?, t: Throwable?) {



    }
})



    }
}