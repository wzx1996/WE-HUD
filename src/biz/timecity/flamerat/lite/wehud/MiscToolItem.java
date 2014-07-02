package biz.timecity.flamerat.lite.wehud;

import biz.timecity.flamerat.lite.wehud.WeState.MiscToolMode;

public class MiscToolItem {
	private MiscToolMode miscToolMode;
	private int itemId;
	/**
	 * = type, pattern
	 */
	private String str_1;
	/**
	 * = blockId, radius
	 */
	private int int_1;
	
	/**
	 * 
	 * @return the id of the item that used as a tool
	 */
	public int GetItemId(){
		return itemId;
	}
	/**
	 * 
	 * @param id the id of the item that used as a tool
	 */
	public void SetItemId(int id){
		itemId=id;
	}
	
	/**
	 * 
	 * @return the mode of the tool
	 */
	public MiscToolMode GetMiscToolMode(){
		return miscToolMode;
	}
	/**
	 * 
	 * @param mode the mode of the tool
	 */
	public void SetMiscToolMode(MiscToolMode mode){
		miscToolMode=mode;
	}
	
	/**
	 * 
	 * @return the tree type
	 */
	public String GetType(){
		return str_1;
	}
	/**
	 * 
	 * @param type the tree type
	 */
	public void SetType(String type){
		str_1=type;
	}
	
	/**
	 * 
	 * @return the id of the target block
	 */
	public int GetBlockId(){
		return int_1;
	}
	/**
	 * 
	 * @param id the id of the target block
	 */
	public void SetBlockId(int id){
		int_1=id;
	}
	
	/**
	 * 
	 * @return flood fill pattern
	 */
	public String GetPattern(){
		return str_1;
	}
	/**
	 * 
	 * @param patt flood fill pattern
	 */
	public void SetPattern(String patt){
		str_1=patt;
	}
	
	/**
	 * 
	 * @return flood fill radius
	 */
	public int GetRadius(){
		return int_1;
	}
	/**
	 * 
	 * @param rad flood fill radius
	 */
	public void SetRadius(int rad){
		int_1=rad;
	}
}
