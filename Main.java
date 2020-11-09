import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arrayLength = sc.nextInt(); // first input
    int answer = sc.nextInt();//required element for output
    String [] a = new String[arrayLength]; //create string array with length determined by input
    for (int i = 0; i<a.length; i++){ //fill array
      a[i] = sc.next();
    }
    sc.close();//close scanner object
    
    for (int i = a.length-1; i>0; i--){ //outer-back to front (stops inner loop from unnecesarily looping to end everytime)
      for (int j=0; j<i; j++){ //inner loop does the swapping
        if (a[j].length()>a[j+1].length()){ //calls swap if wrong order by size
          swap(j, j+1, a);
        }
        if (a[j].length() == a[j+1].length()){ // calls method if wrong order alphabetically
          alpha(j, j+1, a);
        }
      }
    }
    System.out.println(a[answer]); //prints output as string
  }
  public static void swap(int left, int right, String[] a){ // swaps elements in space left & right
    String temp = a[left];
    a[left] = a[right];
    a[right] = temp;
  }
  public static void alpha(int left, int right, String[] a){ // swaps elements if in ascending order
    if (a[left].compareToIgnoreCase(a[right]) < 0){
      swap(left, right, a);
    }
  }
}