package com.simmariazi.myapplication.listener.register

import android.view.View
import com.sothree.slidinguppanel.SlidingUpPanelLayout

class OnOkClickListener(private val slidingUpPanelLayout: SlidingUpPanelLayout) : View.OnClickListener {
    override fun onClick(v: View?) {
        // slidingUpPanelLayout
        when(slidingUpPanelLayout.panelState)
        {
            SlidingUpPanelLayout.PanelState.COLLAPSED->{
                slidingUpPanelLayout.panelState = SlidingUpPanelLayout.PanelState.EXPANDED;
            }
            else->{
                slidingUpPanelLayout.panelState = SlidingUpPanelLayout.PanelState.COLLAPSED;
            }
        }

    }
}