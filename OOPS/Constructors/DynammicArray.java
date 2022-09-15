public class DynammicArray {
    private int nextElement;
    int arr[];
    public DynammicArray(){
        arr = new int[5];
        nextElement=0; 
    }


    public int size(){
        return nextElement;
    }

    public int get(int i){
        if(i >= nextElement){
            return -1;
        }

        return arr[i];
    }

    public void set(int i, int val){
        if(i >= nextElement){
            return;
        }

        arr[i] = val;

    }

    public boolean isEmpty(){
        return nextElement == 0;
        // if(nextElement == 0){
        //     return true;
        // }

        // return false;
    }

    public int removeLast(){
        if(nextElement == 0){
            return -1;
        }

        int temp = arr[nextElement - 1];
        nextElement--;
        return temp; 
    }


    public void add(int ele){
        if(nextElement == arr.length){
            doubleArray();
        }

        arr[nextElement] = ele;
        nextElement++;
    }


    private void doubleArray() {
        int temp[] = arr;
        arr = new int[temp.length * 2];

        for(int i = 0; i < temp.length; i++){
            arr[i] = temp[i];
        }
    }
}
