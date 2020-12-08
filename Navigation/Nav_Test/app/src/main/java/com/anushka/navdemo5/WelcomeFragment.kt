package com.anushka.navdemo5


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.anushka.navdemo5.databinding.FragmentEmailBinding
import com.anushka.navdemo5.databinding.FragmentWelcomeBinding

/**
 * A simple [Fragment] subclass.
 */
class WelcomeFragment : Fragment() {

    private lateinit var binding: FragmentWelcomeBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_welcome, container, false)

        var input_name = arguments!!.getString("user_name2")
        var input_email = arguments!!.getString("user_email")

        binding.nameTextView.text = input_name.toString()
        binding.emailTextView.text = input_email.toString()

        binding.viewTermsButton.setOnClickListener {
            it.findNavController().navigate(R.id.action_welcomeFragment_to_termsFragment)
        }

        return binding.root
    }
}
