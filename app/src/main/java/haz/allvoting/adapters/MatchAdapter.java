package haz.allvoting.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import haz.allvoting.R;
import haz.allvoting.controllers.MatchController;
import haz.allvoting.data.vo.MatchVO;
import haz.allvoting.viewholders.MatchViewholder;

/**
 * Created by haz on 24/11/2017.
 */

public class MatchAdapter extends BaseRecyclerAdapter<MatchViewholder,MatchVO> {

    private MatchController mMatchController;

    public MatchAdapter(Context context, MatchController matchController) {
        super(context);
        mMatchController = matchController;
    }

    @Override
    public MatchViewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View matchView=mLayoutInflater.inflate(R.layout.home_screen , parent , false);
        return new MatchViewholder(matchView,mMatchController);
    }

    @Override
    public void onBindViewHolder(MatchViewholder holder, int position) {

        holder.bind(mData.get(position));
    }
}
