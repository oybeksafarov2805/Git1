package com.example.git.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.git.databinding.ItemBinding
import com.example.git.model.Person
import com.squareup.picasso.Picasso

class MyRVAdapter(val list: ArrayList<Person>,val myOnClick: MyOnClick) : RecyclerView.Adapter<MyRVAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    // hozir haligi aytgan dasturimni yuklayabdi
    // ha//Ustoz, bundan ko'ra temView yaxshi ediku // bilmadim
    //endi yana urinib ko'ramiz

    inner class MyViewHolder(val binding: ItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun onBind(person: Person) {
            binding.tvName.text = person.full_name
            binding.tvMoney.text = person.money + " $"
            Picasso.get().load(person.image).into(binding.img1)

            binding.root.setOnClickListener {
                myOnClick.myOnClick(person)
            }

        }


    }

    interface MyOnClick {
        fun myOnClick(person: Person)
    }


}