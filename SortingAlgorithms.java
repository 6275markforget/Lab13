package unl.cse.sorting;

import java.util.List;

public class SortingAlgorithms {

	/**
	 * A basic implementation of
	 * <a href="https://en.wikipedia.org/wiki/Selection_sort">Selection Sort</a>.
	 * 
	 * @param locations
	 */
	public static void selectionSort(List<Location> locations) {
		for (int i = 0; i < locations.size(); i++) {
			int minIndex = i;
			for (int j = i + 1; j < locations.size(); j++) {
				if (locations.get(j).compareTo(locations.get(minIndex)) < 0) {
					minIndex = j;
				}
			}
			// swap
			Location temp = locations.get(i);
			locations.set(i, locations.get(minIndex));
			locations.set(minIndex, temp);
		}
	}

	/**
	 * A basic implementation of
	 * <a href="https://en.wikipedia.org/wiki/Insertion_sort">Insertion Sort</a>.
	 * 
	 * @param locations
	 */
	public static void insertionSort(List<Location> locations) {
		// TODO: implement insertion sort here
		//iterate through list
		for(int j = 1; j < locations.size(); j++) {
		//compare current key to predecessor
			int key = locations[j];
			int i = j - 1;
		//while current key is smaller than predecessor, compare to elements before. Move the greater elements up a position to make space for key
			while(locations.get(i).compareTo(locations.get(key) < 0) {
				i--;
			}
			// swap
			Location temp = locations.get(i);
			locations.set(i, locations.get(key));
			locations.set(key, temp);
		}
	}

	/**
	 * A recursive implementation of
	 * <a href="https://en.wikipedia.org/wiki/Quicksort">Quick Sort</a>.
	 * 
	 * @param locations
	 */
	public static void quickSort(List<Location> locations) {
		quickSortRecursive(locations, 0, locations.size() - 1);
	}

	/**
	 * Recursive call for the {@link #quickSort(List)} method.
	 * @param locations
	 * @param low
	 * @param high
	 */
	private static void quickSortRecursive(List<Location> locations, int low, int high) {
		// TODO: implement quick sort here
		https://www.geeksforgeeks.org/insertion-sort/
	}
}
