package biz.timecity.flamerat.lite.wehud;

import java.util.LinkedList;
import org.apache.logging.log4j.Level;

import com.mumfrey.liteloader.util.log.LiteLoaderLogger;


/**
 * used for noting down the state of WE for further use
 * @author FlameRat
 *
 */
public final class WeState {
	public enum WandMode{
		CUBOID,EXTEND,POLY,ELLIPSOID,SPHERE,CYL,CONVEX
	}
	public enum BrushMode{
		EX,SMOOTH,CYLINDER,BUTCHER,SPHERE,CLIPBOARD,GRAVITY
	}
	
	private WandMode wandMode;
	private String brushMask;
	private LinkedList<BrushItem> brushItems;
	private LinkedList<LrbuildItem> lrbuildItems;
	
	/**
	 * 
	 * @return current wand mode
	 */
	public WandMode GetWandMode(){
		return wandMode;
	}
	/**
	 * 
	 * @param mode the mode that is going to note down
	 */
	public void SetWandMode(WandMode mode){
		wandMode=mode;
	}
	
	/**
	 * 
	 * @return current mask for display
	 */
	public String GetBrushMask(){
		return brushMask;
	}
	/**
	 * 
	 * @param mask fetched mask list
	 */
	public void SetBrushMask(String mask){
		brushMask=mask;
	}
	
	/**
	 * use item id to search whether it is used as a brush
	 * @param id the item id
	 * @return the brush item class if found, or null if the item is not used as a brush
	 */
	public BrushItem GetBrushItem(int id){
		for(int i=0;i<(brushItems.size());i++){
			BrushItem bItem=brushItems.get(i);
			if(id==bItem.GetItemId()){
				return bItem;
			}
		}
		return null;
	}
	/**
	 * delete the brush state of an item
	 * @param id the item id
	 */
	public void DeleteBrushItem(int id){
		for(int i=0;i<(brushItems.size());i++){
			BrushItem bItem=brushItems.get(i);
			if(id==bItem.GetItemId()){
				brushItems.remove(i);
				return;
			}
		}
		LiteModWeHud.WriteLog(org.apache.logging.log4j.Level.WARN,"id"+id+"is not a brush!");
		return;
	}
	
	/**
	 * use item id to search whether it is used as a lrbuild wand
	 * @param id the item id
	 * @return the brush item class if found, or null if the item is not used as a lrbuild wand
	 */
	public LrbuildItem GetLrbuildItem(int id){
		for(int i=0;i<(lrbuildItems.size());i++){
			LrbuildItem bItem=lrbuildItems.get(i);
			if(id==bItem.GetItemId()){
				return bItem;
			}
		}
		return null;
	}
	/**
	 * delete the lrbuild wand state of an item
	 * @param id the item id
	 */
	public void DeleteLrbuildItem(int id){
		for(int i=0;i<(lrbuildItems.size());i++){
			LrbuildItem bItem=lrbuildItems.get(i);
			if(id==bItem.GetItemId()){
				lrbuildItems.remove(i);
				return;
			}
		}
		LiteModWeHud.WriteLog(Level.WARN,"id"+id+"is not a lrbuild wand!");
		return;
	}

}
