class Box{
    int length;
    int width;
    int height;
    
    Box(int length,int width, int height){
      this.length=length;
      this.width=width;
      this.height=height;
    }
    
    void volume(){
      int vol= this.length * this.width* this.height;
      System.out.println("result" +vol);
    }
  }
  public class main{
    public static void main(String args[])
    {
      Box box = new Box(2,5,3);
      box.volume();
    }
  }