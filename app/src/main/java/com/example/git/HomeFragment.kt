package com.example.git

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.git.adapter.MyRVAdapter
import com.example.git.database.Database
import com.example.git.databinding.FragmentHomeBinding
import com.example.git.model.Person


class HomeFragment : Fragment() {

    lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)

        val allBilloners = Database.getAllBilloners()

        val myOnClick = object :MyRVAdapter.MyOnClick{
            override fun myOnClick(person: Person) {
                val bundle = Bundle()
                bundle.putSerializable("key",person)

                findNavController().navigate(R.id.aboutFragment,bundle)
            }
        }

        val myRVAdapter = MyRVAdapter(allBilloners,myOnClick)
        binding.rv.adapter = myRVAdapter


        return binding.root
    }

}