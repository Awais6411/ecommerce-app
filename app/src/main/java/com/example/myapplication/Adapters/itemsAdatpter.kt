package com.example.myapplication.Adapters

import android.graphics.BitmapFactory
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Model.Data
import com.example.myapplication.R
import kotlinx.coroutines.*
import okhttp3.Dispatcher
import java.net.URL

class itemsAdatpter(var list: ArrayList<Data>) : RecyclerView.Adapter<itemsAdatpter.myHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myHolder {
var view=LayoutInflater.from(parent.context).inflate(R.layout.itemlist_3,parent,false)
  return myHolder(view)
    }

    override fun onBindViewHolder(holder: myHolder, position: Int) {
        var data = list[position]
        holder.lname.text = data.brandname
        holder.price.text = data.price.toString()
        CoroutineScope(Dispatchers.IO).launch {
            var url = URL("http://10.0.2.2/ecomrece/images1/${data.image}")
            var bitmap = BitmapFactory.decodeStream(url.openStream())
            withContext(Dispatchers.Main) {
                holder.limage.setImageBitmap(bitmap)
            }


        }
        var str=1
        holder.plus.setOnClickListener(){
            var df=(str+1)
            holder.amount.text=df.toString()
            str++
        }

        holder.minus.setOnClickListener(){
            if ((holder.amount.text)==1.toString()){

            }
            else{
            var df=(str!!-1).toString()
            holder.amount.text=df.toString()
                str--
            }
        }




    }
    override fun getItemCount(): Int {
    return 4
    }


    class myHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {

        var lname=itemView.findViewById<TextView>(R.id.tname)
        var price=itemView.findViewById<TextView>(R.id.tprice)
        var limage=itemView.findViewById<ImageView>(R.id.img)
        var card1=itemView.findViewById<CardView>(R.id.card1);
        var card2=itemView.findViewById<CardView>(R.id.card2);
        var minus=itemView.findViewById<ImageView>(R.id.minus);
        var plus=itemView.findViewById<ImageButton>(R.id.plus);
        var amount=itemView.findViewById<TextView>(R.id.amnt);


    }


}