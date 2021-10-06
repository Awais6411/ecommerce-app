package com.example.myapplication.Fragments

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myapplication.Model.Data
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentDetailBinding
import kotlinx.coroutines.*
import java.net.URL


class detailFragment : Fragment() {
lateinit var   url:URL
lateinit var   url1:URL
lateinit var   url2:URL
lateinit var   url3:URL
lateinit var bitmap:Bitmap
lateinit var bitmap1:Bitmap
lateinit var bitmap2:Bitmap
lateinit var bitmap3:Bitmap
lateinit var bitmap4:Bitmap
    lateinit var binding: FragmentDetailBinding
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
        inflater.inflate(R.layout.fragment_detail, container, false)
        binding = FragmentDetailBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var bundle = arguments
        val parcelable = bundle!!.getParcelable<Data>("key")
        binding.dtname.text = parcelable!!.brandname
        binding.brnd.text = parcelable!!.brandname
        binding.dtprice.text = parcelable!!.price.toString()
        when (parcelable!!.brandname) {
            "Nike" -> {
                CoroutineScope(Dispatchers.IO).launch {
                     url = URL("http://10.0.2.2/ecomrece/images/" + parcelable.image)
                    bitmap = BitmapFactory.decodeStream(url.openStream())
                    withContext(Dispatchers.Main){
                    binding.dtimg.setImageBitmap(bitmap)
                    }
                    url = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img1)
                     url1 = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img2)
                     url2 = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img3)
                     url3 = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img4)
                    bitmap1 = BitmapFactory.decodeStream(url.openStream())
                    bitmap2 = BitmapFactory.decodeStream(url1.openStream())
                    bitmap3 = BitmapFactory.decodeStream(url2.openStream())
                    bitmap4= BitmapFactory.decodeStream(url3.openStream())
                withContext(Dispatchers.Main){

                    binding.dt1.setImageBitmap(bitmap1)

                    binding.dt2.setImageBitmap(bitmap2)

                    binding.dt3.setImageBitmap(bitmap3)

                    binding.dt4.setImageBitmap(bitmap4)

                }

                }

            }
            "Nike RX100" -> { CoroutineScope(Dispatchers.IO).launch {
               url = URL("http://10.0.2.2/ecomrece/images/" + parcelable.image)
                bitmap = BitmapFactory.decodeStream(url.openStream())
                withContext(Dispatchers.Main){
                    binding.dtimg.setImageBitmap(bitmap)
                }
                url = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img1)
                 url1 = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img2)
                 url2 = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img3)
                 url3 = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img4)
                  bitmap1 = BitmapFactory.decodeStream(url.openStream())
                bitmap2 = BitmapFactory.decodeStream(url1.openStream())
                 bitmap3 = BitmapFactory.decodeStream(url2.openStream())
                 bitmap4 = BitmapFactory.decodeStream(url3.openStream())
                withContext(Dispatchers.Main){
                    binding.dt1.setImageBitmap(bitmap1)
                    binding.dt2.setImageBitmap(bitmap2)
                    binding.dt3.setImageBitmap(bitmap3)
                    binding.dt4.setImageBitmap(bitmap4)
                }
            }
            }
            "Nike BTX" -> { CoroutineScope(Dispatchers.IO).launch {
                 url = URL("http://10.0.2.2/ecomrece/images/" + parcelable.image)
               bitmap = BitmapFactory.decodeStream(url.openStream())
                withContext(Dispatchers.Main){
                    binding.dtimg.setImageBitmap(bitmap)
                }
                url = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img1)
                url1 = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img2)
                url2 = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img3)
                 url3 = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img4)
                  bitmap1 = BitmapFactory.decodeStream(url.openStream())
                 bitmap2 = BitmapFactory.decodeStream(url1.openStream())
                bitmap3 = BitmapFactory.decodeStream(url2.openStream())
                 bitmap4 = BitmapFactory.decodeStream(url3.openStream())
                withContext(Dispatchers.Main){
                    binding.dt1.setImageBitmap(bitmap1)
                    binding.dt2.setImageBitmap(bitmap2)
                    binding.dt3.setImageBitmap(bitmap3)
                    binding.dt4.setImageBitmap(bitmap4)
                }
            }


            }
            "Jordan 12B" -> {

                CoroutineScope(Dispatchers.IO).launch {
                   url = URL("http://10.0.2.2/ecomrece/images/" + parcelable.image)
                    bitmap = BitmapFactory.decodeStream(url.openStream())
                    withContext(Dispatchers.Main){
                        binding.dtimg.setImageBitmap(bitmap)
                    }
                    url = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img1)
                url1 = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img2)
                  url2 = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img3)
                    url3 = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img4)
                   bitmap1 = BitmapFactory.decodeStream(url.openStream())
                  bitmap2 = BitmapFactory.decodeStream(url1.openStream())
                 bitmap3 = BitmapFactory.decodeStream(url2.openStream())
                    bitmap4 = BitmapFactory.decodeStream(url3.openStream())
                    withContext(Dispatchers.Main){
                        binding.dt1.setImageBitmap(bitmap1)
                        binding.dt2.setImageBitmap(bitmap2)
                        binding.dt3.setImageBitmap(bitmap3)
                        binding.dt4.setImageBitmap(bitmap4)
                    }
                }
            }
            "Jordan 43BZ" -> {



                CoroutineScope(Dispatchers.IO).launch {
                     url = URL("http://10.0.2.2/ecomrece/images/" + parcelable.image)
                    bitmap = BitmapFactory.decodeStream(url.openStream())
                    withContext(Dispatchers.Main){
                        binding.dtimg.setImageBitmap(bitmap)
                    }
                    url = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img1)
                  url1 = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img2)
                    url2 = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img3)
                url3 = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img4)
                   bitmap1 = BitmapFactory.decodeStream(url.openStream())
                 bitmap2 = BitmapFactory.decodeStream(url1.openStream())
                  bitmap3 = BitmapFactory.decodeStream(url2.openStream())
                   bitmap4 = BitmapFactory.decodeStream(url3.openStream())
                    withContext(Dispatchers.Main){
                        binding.dt1.setImageBitmap(bitmap1)
                        binding.dt2.setImageBitmap(bitmap2)
                        binding.dt3.setImageBitmap(bitmap3)
                        binding.dt4.setImageBitmap(bitmap4)
                    }
                }
            }
            "Jordan X" -> {
                CoroutineScope(Dispatchers.IO).launch {
                   url = URL("http://10.0.2.2/ecomrece/images/" + parcelable.image)
                   bitmap = BitmapFactory.decodeStream(url.openStream())
                    withContext(Dispatchers.Main){
                        binding.dtimg.setImageBitmap(bitmap)
                    }
                    url = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img1)
                 url1 = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img2)
                   url2 = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img3)
                url3 = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img4)
                    bitmap1 = BitmapFactory.decodeStream(url.openStream())
                    bitmap2 = BitmapFactory.decodeStream(url1.openStream())
                 bitmap3 = BitmapFactory.decodeStream(url2.openStream())
                 bitmap4 = BitmapFactory.decodeStream(url3.openStream())
                    withContext(Dispatchers.Main){
                        binding.dt1.setImageBitmap(bitmap1)
                        binding.dt2.setImageBitmap(bitmap2)
                        binding.dt3.setImageBitmap(bitmap3)
                        binding.dt4.setImageBitmap(bitmap4)
                    }
                }
            }
            "Homka D" -> {

                CoroutineScope(Dispatchers.IO).launch {
                  url = URL("http://10.0.2.2/ecomrece/images/" + parcelable.image)
                  bitmap = BitmapFactory.decodeStream(url.openStream())
                    withContext(Dispatchers.Main){
                        binding.dtimg.setImageBitmap(bitmap)
                    }
                    url = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img1)
                  url1 = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img2)
                     url2 = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img3)
                 url3 = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img4)
                    bitmap1 = BitmapFactory.decodeStream(url.openStream())
                  bitmap2 = BitmapFactory.decodeStream(url1.openStream())
                     bitmap3 = BitmapFactory.decodeStream(url2.openStream())
                   bitmap4 = BitmapFactory.decodeStream(url3.openStream())
                    withContext(Dispatchers.Main){
                        binding.dt1.setImageBitmap(bitmap1)
                        binding.dt2.setImageBitmap(bitmap2)
                        binding.dt3.setImageBitmap(bitmap3)
                        binding.dt4.setImageBitmap(bitmap4)
                    }
                }
            }
            "Addidas 13" -> { CoroutineScope(Dispatchers.IO).launch {
               url = URL("http://10.0.2.2/ecomrece/images/" + parcelable.image)
                bitmap = BitmapFactory.decodeStream(url.openStream())
                withContext(Dispatchers.Main){
                    binding.dtimg.setImageBitmap(bitmap)
                }
                url = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img1)
             url1 = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img2)
             url2 = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img3)
               url3 = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img4)
                  bitmap1 = BitmapFactory.decodeStream(url.openStream())
               bitmap2 = BitmapFactory.decodeStream(url1.openStream())
               bitmap3 = BitmapFactory.decodeStream(url2.openStream())
              bitmap4 = BitmapFactory.decodeStream(url3.openStream())
                withContext(Dispatchers.Main){
                    binding.dt1.setImageBitmap(bitmap1)
                    binding.dt2.setImageBitmap(bitmap2)
                    binding.dt3.setImageBitmap(bitmap3)
                    binding.dt4.setImageBitmap(bitmap4)
                }
            }
            }
            "Addidas RX" -> { CoroutineScope(Dispatchers.IO).launch {
                url = URL("http://10.0.2.2/ecomrece/images/" + parcelable.image)
                 bitmap = BitmapFactory.decodeStream(url.openStream())
                withContext(Dispatchers.Main){
                    binding.dtimg.setImageBitmap(bitmap)
                }
                url = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img1)
                 url1 = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img2)
                url2 = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img3)
                 url3 = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img4)
                  bitmap1 = BitmapFactory.decodeStream(url.openStream())
              bitmap2 = BitmapFactory.decodeStream(url1.openStream())
                 bitmap3 = BitmapFactory.decodeStream(url2.openStream())
                bitmap4 = BitmapFactory.decodeStream(url3.openStream())
                withContext(Dispatchers.Main){
                    binding.dt1.setImageBitmap(bitmap1)
                    binding.dt2.setImageBitmap(bitmap2)
                    binding.dt3.setImageBitmap(bitmap3)
                    binding.dt4.setImageBitmap(bitmap4)
                }
            }
            }
            "Addidas BTR" -> { CoroutineScope(Dispatchers.IO).launch {
               url = URL("http://10.0.2.2/ecomrece/images/" + parcelable.image)
                 bitmap = BitmapFactory.decodeStream(url.openStream())
                withContext(Dispatchers.Main){
                    binding.dtimg.setImageBitmap(bitmap)
                }
                url = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img1)
               url1 = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img2)
               url2 = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img3)
               url3 = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img4)
                 bitmap1 = BitmapFactory.decodeStream(url.openStream())
              bitmap2 = BitmapFactory.decodeStream(url1.openStream())
                 bitmap3 = BitmapFactory.decodeStream(url2.openStream())
                bitmap4 = BitmapFactory.decodeStream(url3.openStream())
                withContext(Dispatchers.Main){
                    binding.dt1.setImageBitmap(bitmap1)
                    binding.dt2.setImageBitmap(bitmap2)
                    binding.dt3.setImageBitmap(bitmap3)
                    binding.dt4.setImageBitmap(bitmap4)
                }
            }

            }
            "Addidas MC23" -> {
                CoroutineScope(Dispatchers.IO).launch {
                     url = URL("http://10.0.2.2/ecomrece/images/" + parcelable.image)
                    bitmap = BitmapFactory.decodeStream(url.openStream())
                    withContext(Dispatchers.Main){
                        binding.dtimg.setImageBitmap(bitmap)
                    }
                    url = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img1)
                    url1 = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img2)
                    url2 = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img3)
                     url3 = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img4)
                     bitmap1 = BitmapFactory.decodeStream(url.openStream())
                    bitmap2 = BitmapFactory.decodeStream(url1.openStream())
                    bitmap3 = BitmapFactory.decodeStream(url2.openStream())
                     bitmap4 = BitmapFactory.decodeStream(url3.openStream())
                    withContext(Dispatchers.Main){
                        binding.dt1.setImageBitmap(bitmap1)
                        binding.dt2.setImageBitmap(bitmap2)
                        binding.dt3.setImageBitmap(bitmap3)
                        binding.dt4.setImageBitmap(bitmap4)
                    }
                }


            }
            "Puma T1" -> { CoroutineScope(Dispatchers.IO).launch {
                 url = URL("http://10.0.2.2/ecomrece/images/" + parcelable.image)
                bitmap = BitmapFactory.decodeStream(url.openStream())
                withContext(Dispatchers.Main){
                    binding.dtimg.setImageBitmap(bitmap)
                }
                url = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img1)
                url1 = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img2)
                 url2 = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img3)
                 url3 = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img4)
                 bitmap1 = BitmapFactory.decodeStream(url.openStream())
                bitmap2 = BitmapFactory.decodeStream(url1.openStream())
              bitmap3 = BitmapFactory.decodeStream(url2.openStream())
                 bitmap4 = BitmapFactory.decodeStream(url3.openStream())
                withContext(Dispatchers.Main){
                    binding.dt1.setImageBitmap(bitmap1)
                    binding.dt2.setImageBitmap(bitmap2)
                    binding.dt3.setImageBitmap(bitmap3)
                    binding.dt4.setImageBitmap(bitmap4)
                }
            }

            }
            "Puma RX5" -> {
                CoroutineScope(Dispatchers.IO).launch {
                   url = URL("http://10.0.2.2/ecomrece/images/" + parcelable.image)
                     bitmap = BitmapFactory.decodeStream(url.openStream())
                    withContext(Dispatchers.Main){
                        binding.dtimg.setImageBitmap(bitmap)
                    }
                    url = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img1)
                    url1 = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img2)
                     url2 = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img3)
                     url3 = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img4)
                     bitmap1 = BitmapFactory.decodeStream(url.openStream())
                    bitmap2 = BitmapFactory.decodeStream(url1.openStream())
                    bitmap3 = BitmapFactory.decodeStream(url2.openStream())
                     bitmap4 = BitmapFactory.decodeStream(url3.openStream())
                    withContext(Dispatchers.Main){
                        binding.dt1.setImageBitmap(bitmap1)
                        binding.dt2.setImageBitmap(bitmap2)
                        binding.dt3.setImageBitmap(bitmap3)
                        binding.dt4.setImageBitmap(bitmap4)
                    }
                }
            }
            "Puma X5" -> {
                CoroutineScope(Dispatchers.IO).launch {
                    url = URL("http://10.0.2.2/ecomrece/images/" + parcelable.image)
                     bitmap = BitmapFactory.decodeStream(url.openStream())
                    withContext(Dispatchers.Main){
                        binding.dtimg.setImageBitmap(bitmap)
                    }
                    url = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img1)
                    url1 = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img2)
                    url2 = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img3)
                     url3 = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img4)
                    bitmap1 = BitmapFactory.decodeStream(url.openStream())
                    bitmap2 = BitmapFactory.decodeStream(url1.openStream())
                   bitmap3 = BitmapFactory.decodeStream(url2.openStream())
                     bitmap4 = BitmapFactory.decodeStream(url3.openStream())
                    withContext(Dispatchers.Main){
                        binding.dt1.setImageBitmap(bitmap1)
                        binding.dt2.setImageBitmap(bitmap2)
                        binding.dt3.setImageBitmap(bitmap3)
                        binding.dt4.setImageBitmap(bitmap4)
                    }
                }
            }
            "PumaHB" -> {
                CoroutineScope(Dispatchers.IO).launch {
                url = URL("http://10.0.2.2/ecomrece/images/" + parcelable.image)
                 bitmap = BitmapFactory.decodeStream(url.openStream())
                withContext(Dispatchers.Main){
                    binding.dtimg.setImageBitmap(bitmap)
                }
                url = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img1)
               url1 = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img2)
                 url2 = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img3)
                url3 = URL("http://10.0.2.2/ecomrece/demo/" + parcelable.img4)
                    bitmap1 = BitmapFactory.decodeStream(url.openStream())
                    bitmap2 = BitmapFactory.decodeStream(url1.openStream())
                 bitmap3 = BitmapFactory.decodeStream(url2.openStream())
                 bitmap4 = BitmapFactory.decodeStream(url3.openStream())
                withContext(Dispatchers.Main){
                    binding.dt1.setImageBitmap(bitmap1)
                    binding.dt2.setImageBitmap(bitmap2)
                    binding.dt3.setImageBitmap(bitmap3)
                    binding.dt4.setImageBitmap(bitmap4)
                }
            }
            }
        }

binding.button2.setOnClickListener()
{
    var bundle=Bundle()
    bundle.putParcelable("key",parcelable)
    findNavController().navigate(R.id.threeitems,bundle)

}
    }
}