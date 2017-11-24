package haz.allvoting.viewholders;

import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;

import butterknife.BindView;
import haz.allvoting.R;
import haz.allvoting.controllers.MatchController;
import haz.allvoting.data.vo.MatchVO;

/**
 * Created by haz on 24/11/2017.
 */

public class MatchViewholder extends BaseViewHolder<MatchVO> {

    @BindView(R.id.img_home)
    ImageView imgHome;

    @BindView(R.id.cdHome)
    CardView cdHome;

    public MatchViewholder(View itemView, MatchController mMatchController) {
        super(itemView);
    }

    @Override
    public void bind(MatchVO data) {

        imgHome.setImageResource(R.drawable.idol);
    
    }
}
