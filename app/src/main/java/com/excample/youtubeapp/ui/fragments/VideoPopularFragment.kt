package com.excample.youtubeapp.ui.fragments

import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import by.kirich1409.viewbindingdelegate.viewBinding
import com.excample.youtubeapp.R
import com.excample.youtubeapp.base.BaseFragment
import com.excample.youtubeapp.databinding.FragmentVideoPopularBinding
import com.excample.youtubeapp.ui.adapters.VideoPopularAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class VideoPopularFragment :
    BaseFragment<FragmentVideoPopularBinding, VideoPopularViewModel>(R.layout.fragment_video_popular) {

    override val viewModel: VideoPopularViewModel by viewModels()
    override val binding by viewBinding(FragmentVideoPopularBinding::bind)
    private var adapterVideoPopularAdapter = VideoPopularAdapter()

    override fun initialize() {
        binding.recyclerView.adapter = adapterVideoPopularAdapter
    }

    override fun setupListeners() = with(binding.recyclerView) {
        adapter = adapterVideoPopularAdapter
    }

    override fun setupSubscribes() {
        subscribeToVideoPopular()
    }

    private fun subscribeToVideoPopular() {
        viewModel.fetchVideosPopular("ru", "mostPopular", "snippet").observe(viewLifecycleOwner) {
            lifecycleScope.launch {
                adapterVideoPopularAdapter.submitData(it)
            }
        }
    }
}












