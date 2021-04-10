package mvvm.f4wzy.com.samplelogin.util

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.RotateAnimation
import android.widget.ImageView
import com.employee.R

class CustomeProgressDialog(context: Context?) : Dialog(context!!) {
    private lateinit var imageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_progress)
        imageView = (findViewById(R.id.img))
        setCancelable(false)
        setCanceledOnTouchOutside(false)
        val rotate = RotateAnimation(0f, 360f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f)
        rotate.duration = 1000
        rotate.repeatCount = Animation.INFINITE
        imageView.startAnimation(rotate)
    }

}