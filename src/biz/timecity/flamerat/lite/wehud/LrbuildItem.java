package biz.timecity.flamerat.lite.wehud;

/**
 * refer to an item that is used as a long range build wand
 * @author FlameRat
 *
 */
public class LrbuildItem {
	private int itemId;
	private int leftButtonBlockId;
	private int rightButtonBlockId;
	
	/**
	 * 
	 * @return item used as lrbuild wand
	 */
	public int GetItemId(){
		return itemId;
	}
	/**
	 * 
	 * @param id item used as lrbuild wand
	 */
	public void SetItemId(int id){
		itemId=id;
	}
	
	/**
	 * 
	 * @return the block bound to left button
	 */
	public int GetLeftButtonBlockId(){
		return leftButtonBlockId;
	}
	/**
	 * 
	 * @param id the block bound to left button
	 */
	public void SetLeftButtonBlockId(int id){
		leftButtonBlockId=id;
	}
	
	/**
	 * 
	 * @return the block bound to right button
	 */
	public int GetRightButtonBlockId(){
		return rightButtonBlockId;
	}
	/**
	 * 
	 * @param id the block bound to right button
	 */
	public void SetRightButtonBlockId(int id){
		rightButtonBlockId=id;
	}
}
