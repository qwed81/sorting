import java.io.*;
import java.util.*;

class RadixSort {
	public int compareNum; //static variables.
	public int moveNum;
	int getMax(int arr[], int n) {
		int mx = arr[0];
		for (int i = 1; i < n; i++) {
			compareNum++;
			if (arr[i] > mx) {
				compareNum++;
				mx = arr[i];
				moveNum++;
			}
		}
		return mx;
	}

	void countSort(int arr[], int n, int exp) {
		int output[] = new int[n];
		int i;
		int count[] = new int[10];
		Arrays.fill(count, 0);
		for (i = 0; i < n; i++) {
			compareNum++;
      if (arr[i] < 0) {
        arr[i] = -arr[i];
      }
			count[(arr[i] / exp) % 10]++;
			// Change count[i] so that count[i] now contains
			// actual position of this digit in output[]
		}
		for (i = 1; i < 10; i++) {
			compareNum++;
			count[i] += count[i - 1];
			moveNum++;
			// Build the output array
		}
		for (i = n - 1; i >= 0; i--) {
			compareNum++;
			output[count[(arr[i] / exp) % 10] - 1] = arr[i];
			moveNum++;
			count[(arr[i] / exp) % 10]--;
		}
		for (i = 0; i < n; i++) {
			compareNum++;
			arr[i] = output[i];
			moveNum++;
		}
	}

	void radixsort(int arr[], int n) { // Find the maximum number to know number of digits
		int m = getMax(arr, n);
		for (int exp = 1; m / exp > 0; exp *= 10) {
			compareNum++;
			countSort(arr, n, exp);
		}
	}

	void print(int arr[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	/**
	public static void main(String[] args) {
		int arr[] = { 170, 45, 75, 90, 802, 24, 2, 66 };
		int n = arr.length;
		radixsort(arr, n);
		print(arr, n);
	}
	*/
	public int getCompareNum(){
		return compareNum;
	}
	public int getMoveNum(){
		return moveNum;
	}
}
