package biz.timecity.flamerat.lite.wehud;

import biz.timecity.flamerat.lite.wehud.WeState.BrushMode;

/**
 * refer to an item that is used as a brush
 * @author FlameRat
 *
 */
public class BrushItem {
	private BrushMode brushMode;
	private int itemId;
	private int blockId;
	/**
	 * = isHollow, isWithoutAir, isNatural
	 */
	private boolean bol_1=false;
	private int radius;
	private int height=0;
	
	/**
	 * 
	 * @return current brush mode
	 */
	public BrushMode GetBrushMode(){
		return brushMode;
	}
	/**
	 * 
	 * @param mode current brush mode
	 */
	public void SetBrushMode(BrushMode mode){
		brushMode=mode;
	}
	
	/**
	 * 
	 * @return the id of the brush item
	 */
	public int GetItemId(){
		return itemId;
	}
	/**
	 * 
	 * @param id the id of the brush item
	 */
	public void SetItemId(int id){
		itemId=id;
	}
	
	/**
	 * 
	 * @return the id of the brush block
	 */
	public int GetBlockId(){
		return blockId;
	}
	/**
	 * 
	 * @param id the id of the brush block
	 */
	public void SetBlockId(int id){
		blockId=id;
	}
	/**
	 * 
	 * @return whether the brush is hollow
	 */
	public boolean IsHollow(){
		return bol_1;
	}
	/**
	 * 
	 * @param is whether the brush is hollow
	 */
	public void SetHollow(boolean is){
		bol_1=is;
	}
	
	/**
	 * 
	 * @return whether the brush pastes air
	 */
	public boolean IsWithoutAir(){
		return bol_1;
	}
	/**
	 * 
	 * @param is whether the brush pastes air
	 */
	public void SetWithoutAir(boolean is){
		bol_1=is;
	}
	
	/**
	 * 
	 * @return whether the brush only interact natural terrain
	 */
	public boolean IsNatural(){
		return bol_1;
	}
	/**
	 * 
	 * @param is whether the brush only interact natural terrain
	 */
	public void SetNatural(boolean is){
		bol_1=is;
	}
	
	/**
	 * 
	 * @return the radius of the brush
	 */
	public int GetRadius(){
		return radius;
	}
	/**
	 * 
	 * @param rad the radius of the brush
	 */
	public void SetRadius(int rad){
		radius=rad;
	}
	
	/**
	 * 
	 * @return the height of the brush
	 */
	public int GetHeight(){
		return height;
	}
	/**
	 * 
	 * @param hei the height of the brush
	 */
	public void SetHeight(int hei){
		height=hei;
	}
}
