package haz.allvoting.activities;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;
import haz.allvoting.R;
import haz.allvoting.adapters.MatchAdapter;
import haz.allvoting.controllers.MatchController;

public class MainActivity extends BaseActivity implements MatchController {

    @BindView(R.id.rvCategory)
    RecyclerView rvCategory;

    private MatchAdapter mMatchAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this,this);

        mMatchAdapter = new MatchAdapter(getApplicationContext(),this);
        rvCategory.setAdapter(mMatchAdapter);

        GridLayoutManager grMatch=new GridLayoutManager(getApplicationContext(),2);
        rvCategory.setLayoutManager(grMatch);

    }

    @Override
    public void onTapMatch(int id) {

    }


}
