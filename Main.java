import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the sorting method of choice: "); //insertionSort
        System.out.println("1) Insertion Sort");
        System.out.println("2) Selection Sort");
        System.out.println("3) Quick Sort");
        System.out.println("4) Merge Sort");
        System.out.println("5) Heap Sort");
        System.out.println("6) Radix Sort");
        System.out.println("7) All");
                                                                    
        int sortingMethodChoice = input.nextInt();
        if (sortingMethodChoice == 7) {
          for (int i = 1; i <= 6; i++) {
            performSort(i);
            System.out.println();
          }
        } else {
          performSort(sortingMethodChoice);
        }
    }

    static void performSort(int sortingMethodChoice) {
      Random rd = new Random(); //Random object.
      int size=50000; //size integer variable.
      int [] arr = new int[size]; //creating new int array.
      for(int i=0; i<arr.length;i++){ //random order
          arr[i] = rd.nextInt();
      }
      int [] inOrderArray = new int[size];
      for(int i=0; i< inOrderArray.length; i++){
          inOrderArray[i] = arr[i];
      }
      Arrays.sort(inOrderArray);  //inorder
      int [] reverseArray = new int[size];
      for(int i=0; i< reverseArray.length; i++){
          reverseArray[i] = arr[i];
      }
      int start =0;
      int end=reverseArray.length-1; //reverseOrder
      while(start < end){
          int temp =reverseArray[start];
          reverseArray[start] = reverseArray[end];
          reverseArray[end]=temp;
          start++;
          end--;
      }
      int [] almostOrder = new int[size];
      for(int i=0; i<almostOrder.length; i++){
          almostOrder[i] = arr[i];
      }
      for(int i=0; i<size; i++){
          almostOrder[i]=i;
      }
      for(int i=0; i<(size*0.2);i++){ //almostOrder
          int first= rd.nextInt(size);
          int second=rd.nextInt(size);

          int temp =almostOrder[first];
          almostOrder[first]=almostOrder[second];
          almostOrder[second]=temp;
      }

      if(sortingMethodChoice==1){
          System.out.println("Performing Insertion Sort");
          InsertionSort one = new InsertionSort(); //InsertionSort objects
          InsertionSort two = new InsertionSort();
          InsertionSort three = new InsertionSort();
          InsertionSort four = new InsertionSort();
          long beginning1 = System.currentTimeMillis();
          one.insertionSort(inOrderArray);
          long ending1 = System.currentTimeMillis();
          long time1 = ending1-beginning1;
          System.out.println("Time for Inorder: " + time1); //time for inorder
          System.out.println("Comparisons for Inorder: " + one.getCompareNum()); //Inorder comparisons.
          System.out.println("Movements for Inorder: " + one.getMoveNum()); //Inorder movements.
          long beginning2 = System.currentTimeMillis();
          two.insertionSort(reverseArray);
          long ending2 = System.currentTimeMillis();
          long time2 = ending2-beginning2;
          System.out.println("Time for reverse: " + time2); //time for reverse
          System.out.println("Comparisons for reverse: " + (two.getCompareNum())); //comparisons for reverse.
          System.out.println("Movements for reverse: " + two.getMoveNum()); //movements for reverse.
          long beginning3 = System.currentTimeMillis();
          three.insertionSort(almostOrder);
          long ending3 = System.currentTimeMillis();
          long time3 = ending3-beginning3;
          System.out.println("Time for almost: " + time3); //Time for almost.
          System.out.println("Comparisons for almost: " + (three.getCompareNum()));//Comparisons for almost.
          System.out.println("Movements for almost: " + three.getMoveNum()); //Movements for almost.
          long beginning4 = System.currentTimeMillis();
          four.insertionSort(arr);
          long ending4 = System.currentTimeMillis();
          long time4 = ending1-beginning1;
          System.out.println("Time for random: " + time4); //Time for random.
          System.out.println("Comparisons for random: " + four.getCompareNum());//Comparisons for random.
          System.out.println("Movements for random: " + four.getMoveNum());
      }
      else if(sortingMethodChoice==2){ //selectionSort
          System.out.println("Performing Selection Sort");
          SelectionSort one = new SelectionSort(); //SelectionSort objects.
          SelectionSort two = new SelectionSort();
          SelectionSort three = new SelectionSort();
          SelectionSort four = new SelectionSort();
          long beginning1 = System.currentTimeMillis();
          one.selectionSort(inOrderArray);
          long ending1 = System.currentTimeMillis();
          long time1 = ending1-beginning1;
          System.out.println("Time for Inorder: " + time1); //Time for inorder.
          System.out.println("Comparisons for Inorder: " + one.getCompareNum()); //Comparisons for inorder.
          System.out.println("Movements for Inorder: " + one.getMoveNum()); //Movements for Inorder.
          long beginning2 = System.currentTimeMillis();
          two.selectionSort(reverseArray);
          long ending2 = System.currentTimeMillis();
          long time2 = ending2-beginning2;
          System.out.println(time2);
          System.out.println("Time for Reverse: " + time2); //Time for reverse order.
          System.out.println("Comparisons for reverse: " + two.getCompareNum()); //Comparisons for reverse order.
          System.out.println("Movements for reverse: " + two.getMoveNum());//Movements for reverse order.
          long beginning3 = System.currentTimeMillis();
          three.selectionSort(almostOrder);
          long ending3 = System.currentTimeMillis();
          long time3 = ending3-beginning3;
          System.out.println(time3);
          System.out.println("Time for almost: " + time3); //Time for almost.
          System.out.println("Comparisons for almost: " + three.getCompareNum()); //Comparisons for almost.
          System.out.println("Movements for almost: " + three.getMoveNum()); //Movements for almost.
          long beginning4 = System.currentTimeMillis();
          four.selectionSort(arr);
          long ending4 = System.currentTimeMillis();
          long time4 = ending4-beginning4;
          System.out.println(time4);
          System.out.println("Time for random: " + time4); //Time for random.
          System.out.println("Comparisons for random: " + four.getCompareNum()); //Comparisons for random.
          System.out.println("Movements for random: " + four.getMoveNum()); //Movements for random.

      }
      else if(sortingMethodChoice==3){ //quickSort
          System.out.println("Performing Quick Sort");
          QuickSort one = new QuickSort(); //QuickSort objects.
          QuickSort two = new QuickSort();
          QuickSort three = new QuickSort();
          QuickSort four = new QuickSort();
          long beginning1 = System.currentTimeMillis();
          one.quickSort(inOrderArray);
          long ending1 = System.currentTimeMillis();
          long time1 = ending1-beginning1;
          System.out.println("Time for Inorder: " + time1); //Time for inorder.
          System.out.println("Comparisons for Inorder: " + one.getCompareNum()); //Comparison for Inorder.
          System.out.println("Movements for Inorder: " + one.getMoveNum());//Movements for Inorder.
          long beginning2 = System.currentTimeMillis();
          two.quickSort(reverseArray);
          long ending2 = System.currentTimeMillis();
          long time2 = ending2-beginning2;
          System.out.println("Time for reverse: " + time2); //Time for reverse.
          System.out.println("Comparisons for reverse: " + (two.getCompareNum())); //Comparisons for reverse.
          System.out.println("Movements for reverse: " + two.getMoveNum()); //Movements for reverse.
          long beginning3 = System.currentTimeMillis();
          three.quickSort(almostOrder);
          long ending3 = System.currentTimeMillis();
          long time3 = ending3-beginning3;
          System.out.println("Time for almost: " + time3); //Time for almost.
          System.out.println("Comparisons for almost: " + (three.getCompareNum())); //Comparisons for almost.
          System.out.println("Movements for almost: " + three.getMoveNum()); //Movements for almost.
          long beginning4 = System.currentTimeMillis();
          four.quickSort(arr);
          long ending4 = System.currentTimeMillis();
          long time4 = ending4-beginning4;
          System.out.println("Time for random: " + time4); //Time for random.
          System.out.println("Comparisons for random: " + four.getCompareNum()); //Comparisons for random.
          System.out.println("Movements for random: " + four.getMoveNum()); //Movements for random.
      }
      else if(sortingMethodChoice==4){ //mergeSort
          System.out.println("Performing Merge Sort");
          MergeSort one = new MergeSort();
          MergeSort two = new MergeSort();
          MergeSort three = new MergeSort();
          MergeSort four = new MergeSort();
          long beginning1 = System.currentTimeMillis();
          one.mergeSort(inOrderArray);
          long ending1 = System.currentTimeMillis();
          long time1 = ending1-beginning1;
          System.out.println("Time for Inorder: " + time1); //Time for inorder.
          System.out.println("Comparisons for Inorder: " + one.getCompareNum()); //Comparison for Inorder.
          System.out.println("Movements for Inorder: " + one.getMoveNum());//Movements for Inorder.
          long beginning2 = System.currentTimeMillis();
          two.mergeSort(reverseArray);
          long ending2 = System.currentTimeMillis();
          long time2 = ending2-beginning2;
          System.out.println("Time for reverse: " + time2); //Time for reverse.
          System.out.println("Comparisons for reverse: " + (two.getCompareNum())); //Comparisons for reverse.
          System.out.println("Movements for reverse: " + two.getMoveNum()); //Movements for reverse.
          long beginning3 = System.currentTimeMillis();
          three.mergeSort(almostOrder);
          long ending3 = System.currentTimeMillis();
          long time3 = ending3-beginning3;
          System.out.println("Time for almost: " + time3); //Time for almost.
          System.out.println("Comparisons for almost: " + (three.getCompareNum())); //Comparisons for almost.
          System.out.println("Movements for almost: " + three.getMoveNum()); //Movements for almost.
          long beginning4 = System.currentTimeMillis();
          four.mergeSort(arr);
          long ending4 = System.currentTimeMillis();
          long time4 = ending4-beginning4;
          System.out.println("Time for random: " + time4); //Time for random.
          System.out.println("Comparisons for random: " + four.getCompareNum()); //Comparisons for random.
          System.out.println("Movements for random: " + four.getMoveNum()); //Movements for random.
      }
      else if(sortingMethodChoice==5){ //heapSort
          System.out.println("Performing Heap Sort");
          HeapSort one = new HeapSort(); //HeapSort objects.
          HeapSort two = new HeapSort();
          HeapSort three = new HeapSort();
          HeapSort four = new HeapSort();
          Integer[] arrayHeap1 = new Integer[size];
          for(int element=0; element<size; element++){
              arrayHeap1[element] = inOrderArray[element];
          }
          long beginning1 = System.currentTimeMillis();
          one.heapSort(arrayHeap1);
          long ending1 = System.currentTimeMillis();
          long time1 = ending1-beginning1;
          for(int i=0; i<size;i++){
              inOrderArray[i] = arrayHeap1[i];
          }
          System.out.println("Time for Inorder: " + time1);
          System.out.println("Comparisons for Inorder: " + one.getCompareNum());
          System.out.println("Movements for Inorder: " + one.getMoveNum());
          Integer[] arrayHeap2 = new Integer[size];
          for(int element=0; element<size; element++){
              arrayHeap2[element] = reverseArray[element];
          }
          long beginning2 = System.currentTimeMillis();
          two.heapSort(arrayHeap2);
          long ending2 = System.currentTimeMillis();
          long time2 = ending1-beginning1;
          for(int i=0; i<size;i++){
              reverseArray[i] = arrayHeap2[i];
          }
          System.out.println("Time for reverse: " + time2);
          System.out.println("Comparisons for reverse: " + (two.getCompareNum()));
          System.out.println("Movements for reverse: " + two.getMoveNum());
          Integer[] arrayHeap3 = new Integer[size];
          for(int element=0; element<size; element++){
              arrayHeap3[element] = almostOrder[element];
          }
          long beginning3 = System.currentTimeMillis();
          three.heapSort(arrayHeap3);
          long ending3 = System.currentTimeMillis();
          long time3 = ending3-beginning3;
          for(int i=0; i<size;i++){
              almostOrder[i] = arrayHeap3[i];
          }
          System.out.println("Time for almost: " + time3);
          System.out.println("Comparisons for almost: " + (three.getCompareNum()));
          System.out.println("Movements for almost: " + three.getMoveNum());
          Integer[] arrayHeap4 = new Integer[size];
          for(int element=0; element<size; element++){
              arrayHeap4[element] = arr[element];
          }
          long beginning4 = System.currentTimeMillis();
          four.heapSort(arrayHeap4);
          long ending4 = System.currentTimeMillis();
          long time4 = ending4-beginning4;
          for(int i=0; i<size;i++){
              arr[i] = arrayHeap4[i];
          }
          System.out.println("Time for random: " + time4);
          System.out.println("Comparisons for random: " + four.getCompareNum());
          System.out.println("Movements for random: " + four.getMoveNum());


      }
      else if(sortingMethodChoice==6){ //radixSort
          System.out.println("Performing Radix Sort");
          RadixSort one = new RadixSort(); //RadixSort objects.
          RadixSort two = new RadixSort();
          RadixSort three = new RadixSort();
          RadixSort four = new RadixSort();
          long beginning1 =System.currentTimeMillis();
          one.radixsort(inOrderArray,size);
          long ending1 = System.currentTimeMillis();
          long time1 = ending1-beginning1;
          System.out.println("Time for Inorder: " + time1);
          System.out.println("Comparisons for Inorder: " + one.getCompareNum());
          System.out.println("Movements for Inorder: " + one.getMoveNum());
          long beginning2 =System.currentTimeMillis();
          two.radixsort(reverseArray,size);
          long ending2 = System.currentTimeMillis();
          long time2 = ending2-beginning2;
          System.out.println("Time for reverse: " + time2);
          System.out.println("Comparisons for reverse: " + (two.getCompareNum()));
          System.out.println("Movements for reverse: " + two.getMoveNum());
          long beginning3 =System.currentTimeMillis();
          three.radixsort(almostOrder,size);
          long ending3 = System.currentTimeMillis();
          long time3 = ending3-beginning3;
          System.out.println("Time for almost: " + time3);
          System.out.println("Comparisons for almost: " + (three.getCompareNum()));
          System.out.println("Movements for almost: " + three.getMoveNum());
          long beginning4 =System.currentTimeMillis();
          four.radixsort(arr,size);
          long ending4 = System.currentTimeMillis();
          long time4 = ending4-beginning4;
          System.out.println("Time for random: " + time4);
          System.out.println("Comparisons for random: " + four.getCompareNum());
          System.out.println("Movements for random: " + four.getMoveNum());
      }
    }

}
