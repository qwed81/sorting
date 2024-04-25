
public class SelectionSort {
	/** The method for sorting the numbers */
	public long compareNum; //static variables.
	public long moveNum;
	public void selectionSort(int[] list) { //int[] list?
		for (int i = 0; i < list.length -1; i++) {
			// Find the minimum in the list[i..list.length-1]
			int currentMin = list[i];
			int currentMinIndex = i;
			
			for (int j = i+1; j < list.length; j++) {
				compareNum++;
				if (currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
			
			//	Swap list[i] wiht list[currentMinIndex[ if necessary
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
				moveNum++;
			}
		}
	}
	public long getCompareNum(){
		return compareNum;
	}
	public long getMoveNum(){
		return moveNum;
	}
}
