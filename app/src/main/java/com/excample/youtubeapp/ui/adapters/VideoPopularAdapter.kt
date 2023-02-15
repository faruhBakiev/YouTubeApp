package com.excample.youtubeapp.ui.adapters


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.excample.youtubeapp.data.models.PopularVideo
import com.excample.youtubeapp.databinding.ItemVideosPopularBinding

class VideoPopularAdapter :
    PagingDataAdapter<PopularVideo, VideoPopularAdapter.VideoPopularViewHolder>(diffUtil) {

    inner class VideoPopularViewHolder(private val binding: ItemVideosPopularBinding) :
        ViewHolder(binding.root) {

        fun onBind(item: PopularVideo) = with(binding) {
            Glide.with(binding.imageViewYouTube.context)
                .load(item.snippet.thumbnails.standard.url)
                .into(binding.imageViewYouTube)
            Glide.with(binding.imageViewYouTubeMini.context)
                .load(item.snippet.thumbnails.standard.url)
                .into(binding.imageViewYouTubeMini)
            binding.tvStoke.text = item.snippet.channelTitle
            binding.tvStroke2.text = item.snippet.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoPopularViewHolder {
        return VideoPopularViewHolder(
            ItemVideosPopularBinding.inflate(
                LayoutInflater.from(parent.context),
                parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: VideoPopularViewHolder, position: Int) {
        getItem(position)?.let {
            holder.onBind(it)
        }
    }

    companion object {
        val diffUtil = object : DiffUtil.ItemCallback<PopularVideo>() {
            override fun areItemsTheSame(oldItem: PopularVideo, newItem: PopularVideo): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: PopularVideo, newItem: PopularVideo): Boolean {
                return oldItem == newItem
            }
        }
    }
}