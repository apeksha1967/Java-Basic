package One;

public class _10_Arrays {

	public static void main(String[] args) {
		int num = 7;
		int[] array;
		array = new int[3];
		System.out.println("  "+array[0]);
		System.out.println("#####");
		
		array[0]=1;
		array[1]=2;
		array[2]=3;
		
		 for(int i=0;i<array.length;i++) {
			 System.out.println("  "+array[i]);
		 }
		 
		 System.out.println("#####");
		 
		int[] array2 = {4,5,6};
		for(int i=0;i<array2.length;i++) {
			 System.out.println("  "+array2[i]);
		 }
		System.out.println("#####");
		
		//array of string
		String[] fruits = {"Apple","Kiwi","Mango","Banana"};
		for(String fruit:fruits) {
			System.out.println(fruit);
		}
		System.out.println("#####");
		
		//multi-dimensional arrays
		int[][] grid = {
				{1,2,3},
				{4,5},
				{6,7,8,9}
		};
		System.out.println(grid[1][0]);
		System.out.println(grid[2][2]);
		System.out.println("#####");
		
		for(int row = 0;row<grid.length;row++) {
			for(int col=0;col<grid[row].length;col++) {
				System.out.print(grid[row][col]+"\t");
			}
			System.out.println();
		}

	}

}
