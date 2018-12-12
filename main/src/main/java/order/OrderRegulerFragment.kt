package order

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.ScaleAnimation
import androidx.fragment.app.Fragment
import com.example.irfan.easybensinv1.main.R
import kotlinx.android.synthetic.main.fragment_order_reguler.*


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class OrderRegulerFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_order_reguler, container, false)
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

        btnPriceReg.setOnClickListener {
            btnPriceReg.visibility = View.INVISIBLE
            //clPriceReg.visibility = View.VISIBLE
            clPriceReg.startAnimation(scaleAnimExpand)
        }
        clPriceReg.setOnClickListener {
            btnPriceReg.postDelayed({ btnPriceReg.visibility = View.VISIBLE }, 350)
            clPriceReg.startAnimation(scaleAnimShrink)
            clPriceReg.postDelayed({ clPriceReg.visibility = View.INVISIBLE }, 500)

        }
    }


}
