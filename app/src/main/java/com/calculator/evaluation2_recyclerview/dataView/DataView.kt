package com.calculator.evaluation2_recyclerview.dataView;

import com.calculator.evaluation2_recyclerview.R;
import com.calculator.evaluation2_recyclerview.dataModel.DataModel;


public class DataView {
    fun loadOffers():List<DataModel>{
        return listOf<DataModel>(
               DataModel(R.string.offer1,R.drawable.frame),
                DataModel(R.string.offer2,R.drawable.frame),
                DataModel(R.string.offer3,R.drawable.frame),
                DataModel(R.string.offer4,R.drawable.frame),
                DataModel(R.string.offer5,R.drawable.frame)

        )
    }
}
