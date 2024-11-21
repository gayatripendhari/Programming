//WAJP to print prime no between 1  to 100
class P10{
    public static void main(String[] args) {
        for(int num=1;num<=100;num++){
            int count=0;
            if(num==1){
                count=1;
            }
            else{
                count=2;
            }
            for(int f=2;f<=num;f++){
                if(num%f==0){
                    count++;
                    if(count>2){
                        break;
                    }
                }
            }
            if(count==2){
                System.out.println(num);
            }

        }
    }
}