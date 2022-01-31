package com.simmariazi.myapplication.ui.register

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.simmariazi.myapplication.R
import com.simmariazi.myapplication.common.CommonFunction
import com.simmariazi.myapplication.common.StartApplication
import com.simmariazi.myapplication.databinding.FragmentPasswordBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [PasswordFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PasswordFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private var binding: FragmentPasswordBinding? = null;

    private lateinit var controller: NavController;

    private lateinit var common:CommonFunction;


    // 뒤로가기 이벤트 처리 콜백
    private lateinit var onBackPressedCallback:OnBackPressedCallback;
    private var mBackWait:Long = 0;

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
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_password, container, false)
        return binding!!.root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment PasswordFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            PasswordFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        onBackPressedCallback = object : OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                if(System.currentTimeMillis() - mBackWait >= 2000){
                    mBackWait = System.currentTimeMillis();
                    common.printSnackBar(binding!!.passwordLayout, "'뒤로가기'를 한번 더 누르면 종료됩니다.");
                }
                else{
                    if(controller != null)
                        controller.popBackStack();
                }
            }
        }

        requireActivity().onBackPressedDispatcher.addCallback(onBackPressedCallback);
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        common = StartApplication.common;

        binding!!.btnOk.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                controller = Navigation.findNavController(view)
                controller.navigate(R.id.action_passwordFragment_to_companyCheckFragment)
            }
        })
    }
}