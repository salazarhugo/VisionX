package com.brock.visionx.data

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.brock.visionx.R

class ImageLabelingAdapter(private val myDataset: List<ImageLabel>) :
    RecyclerView.Adapter<ImageLabelingAdapter.MyViewHolder>() {

    class MyViewHolder(val itemView: View) : RecyclerView.ViewHolder(itemView) {
        val labelTextView = itemView.findViewById<TextView>(R.id.textView_label)
//        val messageButton = itemView.findViewById<Button>(R.id.message_button)
    }

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): ImageLabelingAdapter.MyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_image_label, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.labelTextView.text = myDataset[position].label
//        holder.textView_confidence.text = myDataset[position].confidence.toString()
    }

    override fun getItemCount() = myDataset.size
}

