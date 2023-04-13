class SelectionSort{
  public static void main(String args[]){
    int a[]={50,20,10,5,30};
    int temp;
    for(int i=0;i<a.length-1;i++){
      for(int j=i+1;j<a.length;j++){
        if(a[i]>a[j]){
          temp=a[i];
          a[i]=a[j];
          a[j]=temp;
        }
      }
    }
    System.out.println("Sorted array is:");
    for(int i=0;i<a.length;i++){
      System.out.print(a[i]+" ");
    }
  }
}