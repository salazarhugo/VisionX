package com.brock.visionx.ui.imagelabeling

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.brock.visionx.R
import com.brock.visionx.data.ImageLabel
import com.brock.visionx.data.ImageLabelingAdapter
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.image_labeling_fragment.*
import java.io.File


class ImageLabelingFragment : Fragment() {

    val viewModel  by viewModels<ImageLabelingViewModel>()
    val args: ImageLabelingFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.image_labeling_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val viewManager = LinearLayoutManager(requireContext())
        val viewAdapter = ImageLabelingAdapter(listOf<ImageLabel>(
            ImageLabel("Tree", 0.597434),
            ImageLabel("House", 0.7434),
            ImageLabel("Football", 0.98434),
            ImageLabel("Kitchen", 0.4234),
        ))

        Glide.with(this)
            .load(File(args.imagePath))
            .into(imageView_photo)

//        recyclerView.apply {
//            setHasFixedSize(true)
//            layoutManager = viewManager
//            adapter = viewAdapter
//        }
//        textView_result.text = args.result
    }

}