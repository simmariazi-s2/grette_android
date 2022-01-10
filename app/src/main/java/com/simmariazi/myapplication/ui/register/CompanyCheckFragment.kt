package com.simmariazi.myapplication.ui.register

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.simmariazi.myapplication.R
import com.simmariazi.myapplication.databinding.FragmentCompanyCheckBinding
import com.simmariazi.myapplication.databinding.FragmentPasswordBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [CompanyCheckFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CompanyCheckFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private var binding: FragmentCompanyCheckBinding? = null;

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
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_company_check, container, false)
        return binding!!.root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment CompanyCheckFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            CompanyCheckFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding!!.tvDirectInput.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                val controller = Navigation.findNavController(view)
                controller.navigate(R.id.action_companyCheckFragment_to_companySetUpFragment)
            }
        })
        binding!!.btnConfirmCompanyName.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                val controller = Navigation.findNavController(view)
                controller.navigate(R.id.action_companyCheckFragment_to_nickname)
            }
        })
    }
}