package com.simmariazi.myapplication.ui.register

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.simmariazi.myapplication.R
import com.simmariazi.myapplication.databinding.FragmentCompanySetUpBinding
import com.simmariazi.myapplication.databinding.FragmentNicknameBinding
import com.simmariazi.myapplication.listener.onRegisterBtnOkClickListener
import com.simmariazi.myapplication.ui.RegisterActivity

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Nickname.newInstance] factory method to
 * create an instance of this fragment.
 */
class Nickname : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private var binding: FragmentNicknameBinding? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =  DataBindingUtil.inflate(inflater, R.layout.fragment_nickname, container, false)
        return binding!!.root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Nickname.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Nickname().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        return initialize()
    }

    private fun initialize() {
        // 사용자 동의서 표시
        val btnOK = binding!!.btnOk;
        val slideLayout = (requireActivity() as RegisterActivity).getAgreement();
        btnOK.setOnClickListener(onRegisterBtnOkClickListener(slideLayout));
    }
}