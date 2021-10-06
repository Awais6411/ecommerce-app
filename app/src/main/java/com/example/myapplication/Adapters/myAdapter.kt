package com.example.myapplication.Adapters

import android.content.Context
import android.graphics.BitmapFactory
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.HomeFragment
import com.example.myapplication.Model.Data
import com.example.myapplication.R
import kotlinx.coroutines.*
import java.net.URL

class myAdapter(var fragment:HomeFragment,var list: ArrayList<Data>,var context: Context)
    : RecyclerView.Adapter<myAdapter.myViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.recycle,parent,false)
        return myViewHolder(view)
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        var data1=list[position]
        holder.shoename.text=data1.brandname
        holder.price.text=data1.price.toString()
        CoroutineScope(Dispatchers.IO).launch{

         var url:URL= URL("http://10.0.2.2/ecomrece/images/"+data1.image)
           var bitmap=BitmapFactory.decodeStream(url.openStream())
            withContext(Dispatchers.Main){
               holder.imageView.setImageBitmap(bitmap)
           }

        }
var navHost= NavHostFragment.findNavController(fragment)
        holder.imageView.setOnClickListener(){
            var bundle=Bundle()
bundle.putParcelable("key",data1)
navHost.navigate(R.id.detailFragment,bundle)

        }

    }

    override fun getItemCount(): Int {
        return list.size
    }


    class myViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView) {

        var imageView=itemView.findViewById<ImageView>(R.id.shoeimg)
        var shoename=itemView.findViewById<TextView>(R.id.name)
        var price=itemView.findViewById<TextView>(R.id.price)




    }

}