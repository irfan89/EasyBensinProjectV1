package order

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.ScaleAnimation
import androidx.fragment.app.Fragment
import com.example.irfan.easybensinv1.main.R
import kotlinx.android.synthetic.main.fragment_order_diesel.*


class OrderDieselFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_order_diesel, container, false)
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

        btnPriceDiesel.setOnClickListener {
            btnPriceDiesel.visibility = View.INVISIBLE
            //clPriceReg.visibility = View.VISIBLE
            clPriceDiesel.startAnimation(scaleAnimExpand)
        }
        clPriceDiesel.setOnClickListener {
            btnPriceDiesel.postDelayed({ btnPriceDiesel.visibility = View.VISIBLE }, 350)
            clPriceDiesel.startAnimation(scaleAnimShrink)
            clPriceDiesel.postDelayed({ clPriceDiesel.visibility = View.INVISIBLE }, 500)

        }
    }


}
