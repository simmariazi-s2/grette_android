package com.simmariazi.myapplication.ui.register

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.google.android.material.snackbar.Snackbar
import com.simmariazi.myapplication.R
import com.simmariazi.myapplication.common.CommonFunction
import com.simmariazi.myapplication.common.StartApplication
import com.simmariazi.myapplication.databinding.ActivityLoginBinding
import com.simmariazi.myapplication.databinding.FragmentEmailVerifyBinding
import com.simmariazi.myapplication.ui.custom.CustomSnackBar
import com.simmariazi.myapplication.viewModel.LoginViewModel
import com.simmariazi.myapplication.viewModel.LoginViewModelFactory
import com.simmariazi.myapplication.viewModel.RegisterViewModel
import com.simmariazi.myapplication.viewModel.RegisterViewModelFactory
import com.simmariazi.myapplication.webservice.LoginService
import com.simmariazi.myapplication.webservice.RegisterService

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [EmailVerifyFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class EmailVerifyFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private var binding:FragmentEmailVerifyBinding? = null;

    private lateinit var controller: NavController;

    // 뒤로가기 이벤트 처리 콜백
    private lateinit var onBackPressedCallback: OnBackPressedCallback;
    private var mBackWait:Long = 0;

    private lateinit var common:CommonFunction;

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
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_email_verify,container,false)
        return binding!!.root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment EmailVerifyFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            EmailVerifyFragment().apply {
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
                    common.printSnackBar(binding!!.layoutVerifyEmail, "'뒤로가기'를 한번 더 누르면 종료됩니다.", common.WARNING);
                }
                else
                    requireActivity().finish();
            }
        }
        requireActivity().onBackPressedDispatcher.addCallback(onBackPressedCallback);
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        common = StartApplication.common;

        binding!!.btnAcceptEmail.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                 controller = Navigation.findNavController(p0!!);
                controller.setGraph(R.navigation.nav_register);
                controller.navigate(R.id.action_emailVerifyFragment_to_passwordFragment2);
            }
        })
    }
}