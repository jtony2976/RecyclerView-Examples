package androidtitlan.gdg.recyclerview_examples.fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import androidtitlan.gdg.recyclerview_examples.R;
import androidtitlan.gdg.recyclerview_examples.adapter.AdapterExample;
import androidtitlan.gdg.recyclerview_examples.model.Picture;

/**
 * Created by Jhordan on 13/10/15.
 */
public class LinearHorizontalFragment extends BaseFragment {

    public static LinearHorizontalFragment newInstance() {
        return new LinearHorizontalFragment();
    }


    @Override
    protected RecyclerView.LayoutManager getLayoutManager() {
        return getLinearLayoutManager();
    }


    @Override
    protected int getItemLayout() {
        return R.layout.item_type_two;
    }

    @Override
    protected RecyclerView.Adapter getAdapter(ArrayList<Picture> pictureList, int itemLayout) {
        return new AdapterExample(pictureList,itemLayout);
    }


    private LinearLayoutManager getLinearLayoutManager() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(
                getActivity(),
                LinearLayoutManager.HORIZONTAL,
                false);

        return linearLayoutManager;
    }
}

