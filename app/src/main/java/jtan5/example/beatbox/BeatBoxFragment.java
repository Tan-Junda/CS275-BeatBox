package jtan5.example.beatbox;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import jtan5.example.beatbox.databinding.FragmentBeatBoxBinding;

public class BeatBoxFragment extends Fragment {
    public static BeatBoxFragment newInstance() {
        return new BeatBoxFragment();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        FragmentBeatBoxBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_beat_box, container,false);
        binding.recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 3));
        return binding.getRoot();
    }
    private class SoundAdapter extends  RecyclerView.Adapter<SoundAdapter> {
        @Override
        public SoundHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater.from(getActivity());
            ListItemSoundBinding binding = DataBindingUtil.inflate(inflater, R.layout.list_item_sound, parent, false);
        }
        @Override
        public void onBindViewHolder(SoundHolder holder, int position) {

        }
        @Override
        public int getItemCount() {
            return 0;
        }
    }

    private class SoundHolder extends RecyclerView.ViewHolder {
        private ListItemSoundBinding mBinding;
        private SoundHolder(ListItemSoudBinding binding) {
            super(binding.getRoot());
            mBinding = binding;
        }
    }
}
