package com.example.careerpath

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import java.util.Locale

class ResultRvAdapter (private val mContext: Context, private val resultList:List<Departments>): RecyclerView.Adapter<ResultRvAdapter.CardViewDesignObjectHolder>(){
    inner class CardViewDesignObjectHolder(view: View): RecyclerView.ViewHolder(view) {
        var CardView: CardView
        var departmentName : TextView

        init {
            CardView = view.findViewById(R.id.CardView)
            departmentName = view.findViewById(R.id.departmentName)


        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewDesignObjectHolder {
        val design = LayoutInflater.from(mContext).inflate(R.layout.cardview,parent,false)
        return  CardViewDesignObjectHolder(design)
    }

    override fun getItemCount(): Int {
        return 5
    }

    override fun onBindViewHolder(holder: CardViewDesignObjectHolder, position: Int) {
        val department = resultList[position]
        holder.departmentName.text = department.name

        holder.CardView.setOnClickListener(View.OnClickListener {
            val intent = Intent(mContext,DepartmentDetailsActivity::class.java)
            intent.putExtra("departmentName", department.name)
            mContext.startActivity(intent)
        })

    }


}