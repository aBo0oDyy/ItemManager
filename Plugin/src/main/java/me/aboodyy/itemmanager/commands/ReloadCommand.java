/*

    ItemManager - A plugin to manage items in player's inventory.
    Copyright (C) 2019 aBooDyy

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.

 */

package me.aboodyy.itemmanager.commands;

import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.CommandPermission;
import co.aikar.commands.annotation.Subcommand;
import org.bukkit.command.CommandSender;

import static me.aboodyy.itemmanager.ItemManager.pl;
import static me.aboodyy.itemmanager.utils.Messages.color;

@CommandAlias("itemmanager|imanager|im")
public class ReloadCommand extends ItemManagerCommand {

    @Subcommand("reload|r|rl")
    @CommandPermission("itemmanager.reload")
    public void onReload(CommandSender sender) {
        pl.reloadConfig();
        sender.sendMessage(color("&aConfig file has been successfully reloaded."));
    }

}
