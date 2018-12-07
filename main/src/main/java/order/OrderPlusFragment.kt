package order

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.ScaleAnimation
import com.example.irfan.easybensinv1.main.R
import kotlinx.android.synthetic.main.fragment_order_plus.*


class OrderPlusFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_order_plus, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val scaleAnimExpand =
            ScaleAnimation(0F, 1F, 0F, 1F, Animation.RELATIVE_TO_SELF, 0F, Animation.RELATIVE_TO_SELF, 0.5F)
        scaleAnimExpand.duration = 500
        scaleAnimExpand.fillAfter = true
        val scaleAnimShrink =
            ScaleAnimation(1F, 0F, 1F, 0F, Animation.RELATIVE_TO_SELF, 0F, Animation.RELATIVE_TO_SELF, 0.5F)
        scaleAnimShrink.duration = 500

        btnPricePlus.setOnClickListener {
            btnPricePlus.visibility = View.INVISIBLE
            clPricePlus.startAnimation(scaleAnimExpand)
        }
        clPricePlus.setOnClickListener {
            btnPricePlus.postDelayed({ btnPricePlus.visibility = View.VISIBLE }, 350)
            clPricePlus.startAnimation(scaleAnimShrink)
            clPricePlus.postDelayed({ clPricePlus.visibility = View.INVISIBLE }, 500)

        }
    }


}
