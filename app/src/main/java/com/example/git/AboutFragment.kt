package com.example.git

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.git.databinding.FragmentAboutBinding
import com.example.git.model.Person
import com.squareup.picasso.Picasso

class AboutFragment : Fragment() {

    lateinit var binding: FragmentAboutBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAboutBinding.inflate(layoutInflater)
        val person = arguments?.getSerializable("key") as Person
        binding.tvAbout.text = person.about
        binding.tvName.text = person.full_name
        Picasso.get().load(person.image).into(binding.img1)
        return binding.root
    }

}