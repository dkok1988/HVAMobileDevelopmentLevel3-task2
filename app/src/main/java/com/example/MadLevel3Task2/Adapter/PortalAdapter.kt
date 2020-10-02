package com.example.MadLevel3Task2.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.MadLevel3Task2.Model.Portal
import com.example.MadLevel3Task2.R
import kotlinx.android.synthetic.main.item_portal.view.*

class PortalAdapter(
    private val portals: List<Portal>,
    private val clickListener: (Portal) -> Unit
) : RecyclerView.Adapter<PortalAdapter.ViewHolder>() {

    /** Creates and returns a ViewHolder object, inflating a standard layout called simple_list_item_1.*/
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_portal, parent, false)
        )
    }

    /** Returns the size of the list */
    override fun getItemCount(): Int {
        return portals.size
    }

    /** Called by RecyclerView to display the data at the specified position. */
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.databind(portals[position], clickListener)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun databind(portal: Portal, clickListener: (Portal) -> Unit) {
            itemView.titlePortal.text = portal.title
            itemView.urlPortal.text = portal.url
            // Click listener for each viewholder in the recycler view (link to portal URL)
            itemView.setOnClickListener { clickListener(portal) }
        }
    }
}