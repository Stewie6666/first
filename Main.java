import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int cost=in.nextInt();
        int i=0;
        for(int a=0;a<=n;a++){
            for(int b=0;b<=n;b++){
                for(int c=0;c<=n;c++){
                    if(a+b+c==n&&3*a+2*b+c==cost){
                        System.out.println(a + " " + b + " " + c);
                        i = 1;}
                }
            }
        }
        if(i==0)
            System.out.println("No answer");
    }
}






class 贷款计算{//33
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        double N = n*0.8;
        double M = (n*0.009*Math.pow(1+0.009,m)/(Math.pow(1+0.009,m)-1))*m+n;
        String a =String.format("%.0f\n",N);
        String b =String.format("%.0f\n",M);
        System.out.print(a+b);
    }
}





class 夏季促销{//1034
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        double b;
        if(a<500){
            b=a;
        }else if(a>=500&&a<1000){
            b=a*0.95;
        }else if(a>=1000&&a<3000){
            b=a*0.9;
        }else if(a>=3000&&a<5000){
            b=a*0.85;
        }else{
            b=a*0.8;}
            System.out.printf("%.2f",b);
    }
}



class 分段函数求值{//1035
    public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
         int x = in.nextInt();
         int y = 0;
         if(x<-2){
             y=7-2*x;}
         else if(x>=-2&&x<3){
             y=5-Math.abs(3*x+2) ;}
         else if(x>=3){
             y=3*x+4;}
        System.out.printf("%d",y);
   }
}




class 某年某月有多少天{//1036
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int y = in.nextInt();
        int m = in.nextInt();
        int d = 0;
        if(m==2){
              if((y%4==0&&y%100!=0)||y%400==0){d=29;}
              else{d=28;}}
        else{
               if(m==1||m==3||m==5||m==7||m==8||m==10||m==12||y%400==0){d=31;}
               else{d=30;} }
               System.out.println(d);
   }
}

class 四则运算{//1037
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double s1 = in.nextDouble();
        char op = in.next().charAt(0);
        double s2 = in.nextDouble();
        if(op=='+'){System.out.printf("%.2f",s1 + s2);}
        else if(op=='-'){System.out.printf("%.2f",s1 - s2);}
        else if(op=='*'){System.out.printf("%.2f",s1 * s2);}
        else if(op=='/'){
            if(Math.abs(s2) < 1e-10)System.out.println("Wrong input!");
            else System.out.printf("%.2f",s1 / s2);}
        else System.out.println("Wrong input!");
    }
}


class 绝对值最大 {//1038
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int max = a;
        if(Math.abs(b)>Math.abs(max))max=b;
        if(Math.abs(c)>Math.abs(max))max=c;
        System.out.println(max);
   }
}


class n个数求和{//1039
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int m = in.nextInt();
            sum += m;
        }
        System.out.println(sum);
    }
}


class 数列求和1{//1040
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double sum = 0;
        double m = 1;
        for(int i=0;i<n;i++){
            sum+=1/m;
            m+=2;
        }
        System.out.printf("%.2f",sum);
    }
}



class 数列求和2{//41
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double sum = 0;
        int m = 1;
        double s = 1.0;
        for(int i=0;i<n;i++){
            sum+=s/m;
            m+=2;
            s=-s;
        }
        System.out.printf("%.2f",sum);
    }
}



class 数列求和3 {//42
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double a = 1.0;
        double b = 1.0;
        double sum = 0;
        for(int i=1;i<=n;i++){
            sum+=i*(a/b);
            b+=2;
            a=-a;
        }
        System.out.printf("%.3f",sum);
    }
}


class 最大值{//43
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] max = new int[n];
        for(int i=0;i<n;i++){
          max[i]=in.nextInt();
        }
        Arrays.sort(max);
        System.out.println(max[n-1]);
    }
}


class 不及格率{//44
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        double x;
        double s = 0;
        double h=0;
        for(int i=1;i<=n;i++){
            x = in.nextDouble();
            if(x<60) {h++;}
            }
        s=h/n;
        System.out.printf("%.2f",s);
    }
}

class 数值统计 {//45
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        int x;
        for(int i=0;i<n;i++){
            x = in.nextInt();
            if(x<0) a++;
            else if(x==0) b++;
            else if(x>0) c++;}
            System.out.printf("%d %d %d",a,b,c);
    }
}


class 奇数的乘积{//46
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x;
        int m = 1;
        for(int i=0;i<n;i++){
            x = in.nextInt();
            if(x%2>0) m*=x;
        }
        System.out.println(m);
    }
}


class 对数表 {//47
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        for(int i=m;i<=n;i++){
            System.out.printf("%4d%8.4f\n", i,Math.log(i));
        }
   }
}



class 阶乘表 {//48
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double m = 1;
        for(int i=1;i<=n;i++){
            m*=i;
        System.out.printf("%-4d%-20.0f\n",i,m);  }
   }
}


class 平方和与立方和 {//49
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int x = 0;
        int y = 0;
        for(int i=m;i<=n;i++){
            if(i%2>0) y=y+i*i*i;
            if(i%2==0) x=x+i*i;
        }
        System.out.printf("%d %d",x,y);
    }
}


class  阶乘的累加和 {//50
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = 1;
        int s = 0;
        for(int i=1;i<=n;i++){
            m*=i;
            s+=m;
        }
        System.out.println(s);
   }
}


class 平方根的和{//51
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double item = in.nextDouble();
    int n = in.nextInt();
    double sum = 0;
    for(int i=1;i<=n;i++){
       sum+=item;
       item = Math.pow(item,0.5);
    }
    System.out.printf("%.2f",sum);
     }
}




class 数列求和4{//52
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int a = in.nextInt();
       int sum = 0;
       int x = a;
       for(int i=1;i<=n;i++){
           sum+=x;
           x=(10*x)+a;
       }
        System.out.println(sum);
    }
}



class 正弦函数{//53
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double sum = 0.0;
        double a = 1.0;
        double b = 1.0;
        for(int i=1;i<=10;i++){
            sum+=b*Math.pow(x,2*i-1)/a;
            b=-b;
            a=a*(2*i)*(2*i+1);
        }
        System.out.printf("%.3f",sum);
    }
}



class 猴子吃桃{//54
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = 1;
        for(int i=1;i<n;i++){
            m=2*(m+1);
        }
        System.out.println(m);
    }
}



class 兔子繁殖问题{//55
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] f = new int[46];
        f[1] = 1;
        f[2] = 1;
     for(int i=3;i<f.length;i++){
        f[i]=f[i-1]+f[i-2];}
    System.out.println(f[n]);
    }
}



class 幸运数字{//56
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int max = 0;
        int a = 0;
      for(int i=m;i<=n;i++){
          if(i%7==0&&i%4!=0){
              if(i>max)
                  max=i;
                  a=1;
          }
      }
        if(a==1){
            System.out.println(max);
        }else{
            System.out.println("no");
        }
    }
}



class 素数判定{//1057(?)
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if((n%2>0&&n%3>0&&n%5>0&&n%7>0&&n!=1)||n==2||n==3||n==5||n==7){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}




class 素数判定2{//1057(对)
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i;
        for (i = 2; i < n; i++) {
            if (n % i == 0) break;
        }
        if (n != 1 && i == n) System.out.println("Yes");
        else System.out.println("No");
    }
}



class 求解不等式{//1058
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        int i;
        long a = 0;
        long b = 1;
        for(i=1;i<=n;i++){
            b*=i;
            a+=b;
            if(a>=n) break;
        }
        System.out.println("m<="+(i-1));
    }
}



class 最高分{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int max = -1;
        for(int i=1; ;i++){
            n = in.nextInt();
            if(n<0) break;
            if(n>max) max = n;
        }
        System.out.println(max);
    }
}



class 逆序数字{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1; ;i++){
            System.out.print(n%10+" ");
            n /= 10;
            if(n==0) break;
        }
    }
}



class 顺序输出各位数字{//1061
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int h = 1;
        int a = n;
        for(int i=1; ;i++){
            a /= 10;
            h *= 10;
            if(a==1) break;}
        for(int i=1; ;i++){
            System.out.print(n/h+" ");
            n=n%h;
            h=h/10;
            if(h==0) break;
        }
    }
}



class 最大公约数{//1062
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int t;
        for(int i=1; ;i++){
            t=m%n;
            if(m%n==0)  break;
            m=n;
            n=t;
            }
        System.out.println(n);
    }
}




class 最大公约与最小公倍{//1063
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long m = in.nextLong();
        long n = in.nextLong();
        long t;
        long x = m*n;
        for(int i=1; ;i++){
            t=m%n;
            if(m%n==0)  break;
            m=n;
            n=t;
        }
        System.out.println(n+" "+x/n);
    }
}



class 加密字符{//1064
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n=in.nextLine();
        for(int i=0;i<n.length()-1;i++) {
            char x = n.charAt(i);
            if(x>='a'&&x<='y')
                x+=1;
            else if(x >='A'&&x<='Y')
                x+=33;
            else if(x=='Z'||x=='z')
                x='a';
            System.out.print(x);
        }
    }
}




class 统计数字字符的个数{//1065
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String m = in.nextLine();
        int x = 0;
        for ( int i = 0; i < m.length(); i++ ) {
            char a = m.charAt(i);
            if(a>='0'&&a<='9'){
                x++;
            }
        }
        System.out.println(x);
    }
}



class 字符分类统计{//1066
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String m = in.nextLine();
        int x = 0;
        int y = 0;
        int z = 0;
        for ( int i = 0; i < m.length(); i++ ) {
            char a = m.charAt(i);
            if((a>='a'&&a<='z')||(a>='A'&&a<='Z')){
                x++;
            }else if(a>='0'&&a<='9'){
                y++;
            }else z++;
        }
        System.out.println("letter:"+x);
        System.out.println("digit:"+y);
        System.out.println("other:"+z);
    }
}



class 有问题的里程表{//1067
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int real = num;
        for(int i = 1;i <= num;i++)
            if(i % 10 == 4||i / 10 % 10 == 4||i / 100 == 4)
                real--;
        System.out.print(real);
    }
}



class 向Z同学学习{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int M,k;
        M = in.nextInt();
        k = in.nextInt();
        int i,x;
        for(i=1,x=0;i<=M;i++,x++){
            if(i%k==0){
                M++;}
        }
        System.out.println(x);
    }
}




























































































































