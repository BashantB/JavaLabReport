class JavaException{
    public static void main(String args[]){
        try{
            throw new Custom(2);

        }
        catch(Custom e){
            System.out.println(e) ;
        }
    }
}
class Custom extends Exception{
    int a;
    Custom(int b) {
        a=b;
    }
    public String toString(){
        return ("Exception Number is "+a) ;
    }
}