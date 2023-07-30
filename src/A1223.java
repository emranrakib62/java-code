
 class A1223 implements Runnable{
    public void run(){
          for(int i=0;i<15;i++){
            
        
        System.out.println(""+i);
        
    } try{
    Thread.sleep(2000);
}catch(InterruptedException e){
            System.out.println(e);
}
    }
}
