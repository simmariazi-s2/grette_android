package com.simmariazi.myapplication.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.simmariazi.myapplication.R
import com.simmariazi.myapplication.adapter.BoardAdapter
import com.simmariazi.myapplication.databinding.FragmentMainBinding
import com.simmariazi.myapplication.model.BoardModel


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MainFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MainFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private var binding:FragmentMainBinding? = null;

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
        //return inflater.inflate(R.layout.fragment_main, container, false)
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false);
        return binding!!.root;
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         *         * this fragment using the provided parameters.

         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment MainFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            MainFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val boardList = ArrayList<BoardModel>();
//        if(binding != null){
//
//            val rumorBoard = BoardModel.Builder().Color("#FFF1EB").BoardTitle("진짜래?")
//                .BoardContents("사내 소문들을 얘기해요\u2028확실하지 않은 정보도 괜찮아요").BoardIConID(R.drawable.ic__rumor_board).build();
//
//            val rumorBoard2 = BoardModel.Builder().Color("#F3FBFF").BoardTitle("진짜래?")
//                .BoardContents("사내 소문들을 얘기해요\u2028확실하지 않은 정보도 괜찮아요").BoardIConID(R.drawable.ic_rumo2_board).build();
//
//            val eatBoard = BoardModel.Builder().Color("#F5FFF5").BoardTitle("마시때")
//                .BoardContents("회사 근처 맛집, 별로인 곳 모두 맛집 게시판에 공유해요").BoardIConID(R.drawable.ic_eat_rest_board).build();
//
//            val canBoard =  BoardModel.Builder().Color("#F5FFF5").BoardTitle("할거래")
//                .BoardContents("사내 소문들을 얘기해요\u2028확실하지 않은 정보도 괜찮아요").BoardIConID(R.drawable.ic_can_board).build();
//
//            boardList.add(rumorBoard);
//            boardList.add(rumorBoard2);
//            boardList.add(eatBoard);
//            boardList.add(canBoard);
//
//            val boardViewPager = binding!!.boardList;
//
//            boardViewPager.setLayoutParams(
//                LinearLayout.LayoutParams(
//                    ViewGroup.LayoutParams.WRAP_CONTENT,
//                    ViewGroup.LayoutParams.MATCH_PARENT
//                )
//            )
//            boardViewPager.adapter = BoardAdapter(requireContext(), boardList);
//            boardViewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL;
//        }
    }
}