package io.github.hielkemaps.hielkelib;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.Objective;

public final class HielkeLib extends JavaPlugin {

    private int sRank = 0;
    private int aRank = 0;
    private int bRank = 0;
    private int cRank = 0;

    @Override
    public void onEnable() {

    }

    private void getRankTimes(){
        Objective seconds = Bukkit.getScoreboardManager().getMainScoreboard().getObjective("seconds");
        if(seconds == null) return;

        sRank = seconds.getScore("rank_s").getScore();
        aRank = seconds.getScore("rank_a").getScore();
        bRank = seconds.getScore("rank_b").getScore();
        cRank = seconds.getScore("rank_c").getScore();
    }

    public Rank getRank(int seconds){
        if(seconds <= sRank) return Rank.S;
        if(seconds <= aRank) return Rank.A;
        if(seconds <= bRank) return Rank.B;
        if(seconds <= cRank) return Rank.C;
        return Rank.D;
    }

    public void onPlayerFinishedMap(Player player, int seconds){
        Rank rank = getRank(seconds);

        player.sendMessage(Component.text("I got " + rank.toString() + " rank!"));
    }

    public void onPlayerFinishedRace(Player player, String raceType, int place, int seconds, boolean isEvent){
        player.sendMessage(Component.text("I finished race " + raceType + " in " + place + " place and " + seconds + " seconds. Is event: " + isEvent));
    }

}
