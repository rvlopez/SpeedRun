package speedrun.example.com.speedrun.app.games.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.games_item.view.*
import speedrun.example.com.speedrun.R
import speedrun.example.com.speedrun.core.extensions.inflate
import speedrun.example.com.speedrun.entity.SpeedRunGameEntity

class GamesAdapter(private val onItemClickListener: GameItemSelectedListener)
    : RecyclerView.Adapter<GamesAdapter.ViewHolder>() {

    private var speedRunGames: MutableList<SpeedRunGameEntity> = mutableListOf()

    override fun getItemCount() = speedRunGames.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
            ViewHolder(parent.inflate(R.layout.games_item))

    override fun onBindViewHolder(holder: ViewHolder, position: Int)
            = holder.bind(speedRunGames[position], onItemClickListener)

    fun setItems(speedRunGames: MutableList<SpeedRunGameEntity>) {
        this.speedRunGames = speedRunGames
        notifyDataSetChanged()
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bind(item: SpeedRunGameEntity, onItemClickListener: GameItemSelectedListener) = with(itemView) {
            val context = itemView.context

            Glide.with(context).load(item.assets.coverLarge.uri).into(gameLogo)
            gameName.text = item.names.international
            setOnClickListener { onItemClickListener.onGameItemSelected(item) }
        }
    }
}