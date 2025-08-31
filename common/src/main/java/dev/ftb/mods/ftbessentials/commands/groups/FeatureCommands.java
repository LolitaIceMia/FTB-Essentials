package dev.ftb.mods.ftbessentials.commands.groups;

import dev.ftb.mods.ftbessentials.commands.FTBCommand;
import dev.ftb.mods.ftbessentials.commands.impl.kit.GiveMeKitCommand;
import dev.ftb.mods.ftbessentials.commands.impl.kit.KitCommand;

import java.util.List;

/**
 * 这个类用于注册特定功能组的命令，这些命令具有自己的命名空间
 * 当前专门用于注册套件(kit)相关的命令
 * <p>
 * 命令分组策略:
 * - FeatureCommands: 专门用于特定功能组的命令，如kit命令
 * - TeleportingCommands: 专门用于传送相关的命令
 * - 其他通用命令直接在FTBCommands中注册
 * </p>
 * 
 * @see TeleportingCommands
 * @see dev.ftb.mods.ftbessentials.commands.FTBCommands
 */
public class FeatureCommands {
    /**
     * 套件相关命令列表
     * 包含所有与套件系统相关的命令实现
     * 
     * 当前包含的命令:
     * - {@link KitCommand} - 套件管理命令 (/kit)
     * - {@link GiveMeKitCommand} - 给予玩家套件命令 (/giveme kit)
     */
    public static final List<FTBCommand> COMMANDS = List.of(
            new KitCommand(),
            new GiveMeKitCommand()
    );
}