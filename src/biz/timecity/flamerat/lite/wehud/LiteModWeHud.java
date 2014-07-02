package biz.timecity.flamerat.lite.wehud;

import java.io.File;

import org.apache.logging.log4j.Level;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.network.play.server.S02PacketChat;
import net.minecraft.util.IChatComponent;

import com.mumfrey.liteloader.ChatFilter;
import com.mumfrey.liteloader.Configurable;
import com.mumfrey.liteloader.LiteMod;
import com.mumfrey.liteloader.RenderListener;
import com.mumfrey.liteloader.Tickable;
import com.mumfrey.liteloader.modconfig.ConfigPanel;
import com.mumfrey.liteloader.util.log.LiteLoaderLogger; 

/**
 * the main class
 * @author FlameRat
 *
 */
public class LiteModWeHud implements LiteMod, Configurable, RenderListener,ChatFilter,Tickable {
	
	/**
	 * Write a message on the lite loader log.
	 * @param level The level of the message. Use prefix "Level." to see all
	 * @param msg The message that is going to log.
	 */
	public static void WriteLog(Level level,String msg){
		LiteLoaderLogger.getLogger().log(level, msg);
	}
	
	@Override
	public boolean onChat(S02PacketChat chatPacket, IChatComponent chat,
			String message) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void onRender() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onRenderGui(GuiScreen currentScreen) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onRenderWorld() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onSetupCameraTransform() {
		// TODO Auto-generated method stub

	}

	@Override
	public Class<? extends ConfigPanel> getConfigPanelClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		return "WE-HUD";
	}

	@Override
	public String getVersion() {
		return "0.0.1";
	}

	@Override
	public void init(File configPath) {
		WriteLog(Level.INFO,"WE-HUD is here!");
	}

	@Override
	public void upgradeSettings(String version, File configPath,
			File oldConfigPath) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTick(Minecraft minecraft, float partialTicks, boolean inGame,
			boolean clock) {
		// TODO Auto-generated method stub
		
	}

}
