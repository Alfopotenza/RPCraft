package RPCraft.rPCraft;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;

public class CreateKingdom implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {
        if(commandSender instanceof Player player) {
            if(args.length == 0) {
                player.sendMessage("You're supposed to put a name!");
                return false;
            }
            City capital = new City(args[0], player.getLocation());
            Kingdom kingdom = new Kingdom(args[0], capital, player);
            player.sendMessage("The capital's name has been set to " + args[0] + ". To change that, use /setCapitalName");
            int kingdomMembers;
        }
        return true;
    }
}
