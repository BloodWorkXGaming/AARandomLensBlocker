package atm.bloodworkxgaming.aarandomlensblocker;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkCheckHandler;
import net.minecraftforge.fml.relauncher.Side;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

@Mod(modid = AARandomLensBlocker.MODID, version = AARandomLensBlocker.VERSION)
public class AARandomLensBlocker
{
    public static final String MODID = "aarandomlensblocker";
    public static final String VERSION = "1.0";

    public static final Logger logger = LogManager.getLogger(MODID);
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        if (Loader.isModLoaded("actuallyadditions")){
            logger.info("ActuallyAdditions is loaded, registering blocker");
            MinecraftForge.EVENT_BUS.register(new CommonEventHandler());
        }
    }

    @NetworkCheckHandler
    public boolean matchModVersion(Map<String, String> remoteVersions, Side side) {
        return true;
    }
}
