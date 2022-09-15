public class GettersAndSetters {
    private int RollNo;
    public void setRollNo(int RollNo) {
        if (RollNo < 0){
            return;
        }
        this.RollNo = RollNo;
    }

    public void getRollNo() {
        System.out.println(" this value= "+ this);
        System.out.println("RollNo is "+ RollNo);
        
    }

}

