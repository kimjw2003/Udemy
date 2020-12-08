package com.anushka.navdemo5


import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.anushka.navdemo5.databinding.FragmentEmailBinding
import com.anushka.navdemo5.databinding.FragmentNameBinding

/**
 * A simple [Fragment] subclass.
 */
class EmailFragment : Fragment() {

    private lateinit var binding: FragmentEmailBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_email, container, false)

        var input_name = arguments!!.getString("user_name")

        binding.submitButton.setOnClickListener {
            if (!TextUtils.isEmpty(binding.emailEditText.text.toString())) {
                val bundle = bundleOf(
                    "user_email" to binding.emailEditText.text.toString(),
                    "user_name2" to input_name
                )
                    it.findNavController().navigate(R.id.action_emailFragment_to_welcomeFragment, bundle)
            }else{
                Toast.makeText(activity, "이메일을 입력해 주세요",Toast.LENGTH_SHORT).show()
            }
        }
        return binding.root
    }
}
