class HelloWorld {
    public static void main(String[] args) {
              int a=3;
              int b=5;
              int resultado = Calcular(a,b);

              System.out.println(a+" elevado "+b+" igual "+resultado);       
} 
public static int Calcular(int n,int b){
    int x=1;
       if(n>0&&b==0){
        return x;
       } else if(n==0&&b>=1){
       return 0;

       }
       else{
           for(int i=1;i<=b;i++)
           x=x*n;
       }
       return x;
  }
}