
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);

        char p[]={'V','V','V','V','V','V','V','V','V','V','V','V','V','V','V','V','F','F','F','F','F','F','F','F','F','F','F','F','F','F','F','F'};
        char q[]={'V','V','V','V','V','V','V','V','F','F','F','F','F','F','F','F','V','V','V','V','V','V','V','V','F','F','F','F','F','F','F','F'};
        char r[]={'V','V','V','V','F','F','F','F','V','V','V','V','F','F','F','F','V','V','V','V','F','F','F','F','V','V','V','V','F','F','F','F'};
        char s[]={'V','V','F','F','V','V','F','F','V','V','F','F','V','V','F','F','V','V','F','F','V','V','F','F','V','V','F','F','V','V','F','F'};
        char t[]={'V','F','V','F','V','F','V','F','V','F','V','F','V','F','V','F','V','F','V','F','V','F','V','F','V','F','V','F','V','F','V','F'};
        char signos[]={'V','^','↔','¬','►',' '};
        char np[]={'F','F','F','F','F','F','F','F','F','F','F','F','F','F','F','F','V','V','V','V','V','V','V','V','V','V','V','V','V','V','V','V'};
        char nq[]={'F','F','F','F','F','F','F','F','V','V','V','V','V','V','V','V','F','F','F','F','F','F','F','F','V','V','V','V','V','V','V','V'};
        char nr[]={'F','F','F','F','V','V','V','V','F','F','F','F','V','V','V','V','F','F','F','F','V','V','V','V','F','F','F','F','V','V','V','V'};
        char ns[]={'F','F','V','V','F','F','V','V','F','F','V','V','F','F','V','V','F','F','V','V','F','F','V','V','F','F','V','V','F','F','V','V'};
        char nt[]={'F','V','F','V','F','V','F','V','F','V','F','V','F','V','F','V','F','V','F','V','F','V','F','V','F','V','F','V','F','V','F','V'};

        //p
        char rp1[]=new char[32];
        char rp2[]=new char[32];
        char rp3[]=new char[32];
        char rp4[]=new char[32];
        char rpf[]=new char[32];
        char rp5[]=new char[32];
        char rpc[]=new char[32];
        char rpff[]=new char[32];
        char rpfff[]=new char[32];

        //p1
        int a,b,c,f1,f2,im,f3,f4,f5,f6,prueba,op,impresion;
        //p2
        int d,e,f,ff1,ff2,imp,ff3,ff4,ff5,ff6,F22,finalito;
        //p3
        int g,h,i,pf1,pf2,pf3,pf4,pf5,pf6,im2,ax,y=0;
        //p4
        int j,k,l;
        //final
        int aa,bb,cc,dd,ee, op2;

        do{





        //p1
        System.out.println("Elige la opcion que deseas para llenar el primer espacio en: []p[][]q" +
                "\n1.V" +
                "\n2.^" +
                "\n3.↔" +
                "\n4.¬" +
                "\n5.►" +
                "\n6.Vacio");
        a=leer.nextInt();
        while(a!=4 && a!=6){
            System.out.println("Elige la opcion que deseas para llenar el primer espacio en: []p[][]q" +
                    "\n1.V" +
                    "\n2.^" +
                    "\n3.↔" +
                    "\n4.¬" +
                    "\n5.►" +
                    "\n6.Vacio");
            a=leer.nextInt();
        }
        System.out.println("Elige la opcion que deseas para llenar el segundo espacio en:"+signos[a-1]+"p[][]q" +
                "\n1.V" +
                "\n2.^" +
                "\n3.↔" +
                "\n4.¬" +
                "\n5.►" +
                "\n6.Vacio");
        b=leer.nextInt();
        while(b==4 || b==6){
            System.out.println("Elige la opcion que deseas para llenar el segundo espacio en: []p[][]q" +
                    "\n1.V" +
                    "\n2.^" +
                    "\n3.↔" +
                    "\n4.¬" +
                    "\n5.►" +
                    "\n6.Vacio");
            b=leer.nextInt();
        }
        System.out.println("Elige la opcion que deseas para llenar el tercer espacio en:"+signos[a-1]+"p"+signos[b-1]+"q" +
                "\n1.V" +
                "\n2.^" +
                "\n3.↔" +
                "\n4.¬" +
                "\n5.►" +
                "\n6.Vacio");
        c=leer.nextInt();
        while(c!=4 && c!=6){
            System.out.println("Elige la opcion que deseas para llenar el tercer espacio en:"+signos[a-1]+"p"+signos[b-1]+"[]q" +
                    "\n1.V" +
                    "\n2.^" +
                    "\n3.↔" +
                    "\n4.¬" +
                    "\n5.►" +
                    "\n6.Vacio");
            c=leer.nextInt();
        }
        System.out.println(signos[a-1]+"p"+signos[b-1]+signos[c-1]+"q");

        //ifa negacion
        if(a==4){
            f1=0;
            while(f1<32){
                if(p[f1]=='V'){
                    np[f1]='F';
                    f1++;
                }else{
                    np[f1]='V';
                    f1++;
                }
            }

        }
        //ifc negacion
        if(c==4){
            f2=0;
            while(f2<32){
                if(q[f2]=='V'){
                    nq[f2]='F';
                    f2++;
                }else{
                    nq[f2]='V';
                    f2++;
                }
            }
        }

        //vnegacion
        if(b==1 && c==4 && a==4){
            f3=0;
            while (f3<32){
                if ((np[f3]=='F' && nq[f3]=='F')){
                        rp1[f3]='F';
                        f3++;
                }else{
                    rp1[f3]='V';
                    f3++;
                }
            }

        }

        //^negacion
        if(b==2 && c==4 && a==4){
            f4=0;
            while (f4<32){
                if (np[f4]=='V' && nq[f4]=='V'){
                    rp1[f4]='V';
                    f4++;
                }else{
                    rp1[f4]='F';
                    f4++;
                }
            }
        }

        //bicondicional negacion
        if(b==3 && c==4 && a==4){
            f5=0;
            while (f5<32){
                if ((np[f5]=='F' && nq[f5]=='F') || (np[f5]=='V' && nq[f5]=='V')){
                    rp1[f5]='V';
                    f5++;
                }else{
                    rp1[f5]='F';
                    f5++;
                }
            }
        }
        //condicional negacion
        if(b==5 && c==4 && a==4){
            f6=0;
            while (f6<32){
                if (np[f6]=='V' && nq[f6]=='F'){
                    rp1[f6]='V';
                    f6++;
                }else{
                    rp1[f6]='F';
                    f6++;
                }
            }
        }
        //vacio
        if(b==1 && c==6 && a==6){
            f3=0;
            while (f3<32){
                if (p[f3]=='F' && q[f3]=='F'){
                    rp1[f3]='F';
                    f3++;
                }else{
                    rp1[f3]='V';
                    f3++;
                }
            }
        }

        //vacio
        if(b==2 && c==6 && a==6){
            f4=0;
            while (f4<32){
                if (p[f4]=='V' && q[f4]=='V'){
                    rp1[f4]='V';
                    f4++;
                }else{
                    rp1[f4]='F';
                    f4++;
                }
            }
        }

        //vacio
        if(b==3 && c==6 && a==6){
            f5=0;
            while (f5<32){
                if ((p[f5]=='F' && q[f5]=='F') || (p[f5]=='V' && q[f5]=='V')){
                    rp1[f5]='V';
                    f5++;
                }else{
                    rp1[f5]='F';
                    f5++;
                }
            }
        }
        //vacio
        if(b==5 && c==6 && a==6){
            f6=0;
            while (f6<32){
                if (p[f6]=='V' && q[f6]=='F'){
                    rp1[f6]='F';
                    f6++;
                }else{
                    rp1[f6]='V';
                    f6++;
                }
            }
        }

        //n y v
        if(b==1 && c==6 && a==4){
            f3=0;
            while (f3<32){
                if (np[f3]=='F' && q[f3]=='F'){
                    rp1[f3]='F';
                    f3++;
                }else{
                    rp1[f3]='V';
                    f3++;
                }
            }
        }

        //vacio
        if(b==2 && c==6 && a==4){
            f4=0;
            while (f4<32){
                if (np[f4]=='V' && q[f4]=='V'){
                    rp1[f4]='V';
                    f4++;
                }else{
                    rp1[f4]='F';
                    f4++;
                }
            }
        }

        //vacio
        if(b==3 && c==6 && a==4){
            f5=0;
            while (f5<32){
                if ((np[f5]=='F' && q[f5]=='F') || (np[f5]=='V' && q[f5]=='V')){
                    rp1[f5]='V';
                    f5++;
                }else{
                    rp1[f5]='F';
                    f5++;
                }
            }
        }
        //vacio
        if(b==5 && c==6 && a==4){
            f6=0;
            while (f6<32){
                if (np[f6]=='V' && q[f6]=='F'){
                    rp1[f6]='F';
                    f6++;
                }else{
                    rp1[f6]='V';
                    f6++;
                }
            }
        }


        //v y n
        if(b==1 && c==4 && a==6){
            f3=0;
            while (f3<32){
                if (p[f3]=='F' && nq[f3]=='F'){
                    rp1[f3]='F';
                    f3++;
                }else{
                    rp1[f3]='V';
                    f3++;
                }
            }
        }

        //vacio
        if(b==2 && c==4 && a==6){
            f4=0;
            while (f4<32){
                if (p[f4]=='V' && nq[f4]=='V'){
                    rp1[f4]='V';
                    f4++;
                }else{
                    rp1[f4]='F';
                    f4++;
                }
            }
        }

        //vacio
        if(b==3 && c==4 && a==6){
            f5=0;
            while (f5<32){
                if ((p[f5]=='F' && nq[f5]=='F') || (p[f5]=='V' && nq[f5]=='V')){
                    rp1[f5]='V';
                    f5++;
                }else{
                    rp1[f5]='F';
                    f5++;
                }
            }
        }
        //vacio
        if(b==5 && c==4 && a==6){
            f6=0;
            while (f6<32){
                if (p[f6]=='V' && nq[f6]=='F'){
                    rp1[f6]='F';
                    f6++;
                }else{
                    rp1[f6]='V';
                    f6++;
                }
            }
        }


        //p2
        System.out.println("Elige la opcion que deseas para llenar el primer espacio en: []q[][]r" +
                "\n1.V" +
                "\n2.^" +
                "\n3.↔" +
                "\n4.¬" +
                "\n5.►" +
                "\n6.Vacio");
        d=leer.nextInt();
        while(d!=4 && d!=6){
            System.out.println("Elige la opcion que deseas para llenar el primer espacio en: []q[][]r" +
                    "\n1.V" +
                    "\n2.^" +
                    "\n3.↔" +
                    "\n4.¬" +
                    "\n5.►" +
                    "\n6.Vacio");
            d=leer.nextInt();
        }
        System.out.println("Elige la opcion que deseas para llenar el segundo espacio en:"+signos[d-1]+"q[][]r" +
                "\n1.V" +
                "\n2.^" +
                "\n3.↔" +
                "\n4.¬" +
                "\n5.►" +
                "\n6.Vacio");
        e=leer.nextInt();
        while(e==4 || e==6){
            System.out.println("Elige la opcion que deseas para llenar el segundo espacio en: []q[][]r" +
                    "\n1.V" +
                    "\n2.^" +
                    "\n3.↔" +
                    "\n4.¬" +
                    "\n5.►" +
                    "\n6.Vacio");
            e=leer.nextInt();
        }
        System.out.println("Elige la opcion que deseas para llenar el tercer espacio en:"+signos[d-1]+"q"+signos[e-1]+"r" +
                "\n1.V" +
                "\n2.^" +
                "\n3.↔" +
                "\n4.¬" +
                "\n5.►" +
                "\n6.Vacio");
        f=leer.nextInt();
        while(f!=4 && f!=6){
            System.out.println("Elige la opcion que deseas para llenar el tercer espacio en:"+signos[d-1]+"q"+signos[e-1]+"[]r" +
                    "\n1.V" +
                    "\n2.^" +
                    "\n3.↔" +
                    "\n4.¬" +
                    "\n5.►" +
                    "\n6.Vacio");
            f=leer.nextInt();
        }
        System.out.println(signos[d-1]+"q"+signos[e-1]+signos[f-1]+"r");

        //ifa negacion
        if(f==4){
            ff1=0;
            while(ff1<32){
                if(r[ff1]=='V'){
                    nr[ff1]='F';
                    ff1++;
                }else{
                    nr[ff1]='V';
                    ff1++;
                }
            }

        }
        if(d==4){
            ff1=0;
            while(ff1<32){
                if(q[ff1]=='V'){
                    nq[ff1]='F';
                    ff1++;
                }else{
                    nq[ff1]='V';
                    ff1++;
                }
            }

        }

        //vnegacion
        if(e==1 && f==4 && d==4){
            ff3=0;
            while (ff3<32){
                if ((nq[ff3]=='F' && nr[ff3]=='F') || (nr[ff3]=='F' && nq[ff3]=='F')){
                    rp2[ff3]='V';
                    ff3++;
                }else{
                    rp2[ff3]='F';
                    ff3++;
                }
            }

        }

        //^negacion
        if(e==2 && f==4 && d==4){
            ff4=0;
            while (ff4<32){
                if (nq[ff4]=='V' && nr[ff4]=='V'){
                    rp2[ff4]='V';
                    ff4++;
                }else{
                    rp2[ff4]='F';
                    ff4++;
                }
            }
        }

        //bicondicional negacion
        if(e==3 && f==4 && d==4){
            f5=0;
            while (f5<32){
                if ((nq[f5]=='F' && nr[f5]=='F') || (nq[f5]=='V' && nr[f5]=='V')){
                    rp2[f5]='V';
                    f5++;
                }else{
                    rp2[f5]='F';
                    f5++;
                }
            }
        }
        //condicional negacion
        if(e==5 && f==4 && d==4){
            f6=0;
            while (f6<32){
                if (nq[f6]=='V' && nr[f6]=='F'){
                    rp2[f6]='F';
                    f6++;
                }else{
                    rp2[f6]='V';
                    f6++;
                }
            }
        }
        //vacio
        if(e==1 && f==6 && d==6){
            f3=0;
            while (f3<32){
                if (q[f3]=='F' && r[f3]=='F'){
                    rp2[f3]='F';
                    f3++;
                }else{
                    rp2[f3]='V';
                    f3++;
                }
            }
        }

        //vacio
        if(e==2 && f==6 && d==6){
            f4=0;
            while (f4<32){
                if (q[f4]=='V' && r[f4]=='V'){
                    rp2[f4]='V';
                    f4++;
                }else{
                    rp2[f4]='F';
                    f4++;
                }
            }
        }

        //vacio
        if(e==3 && f==6 && d==6){
            f5=0;
            while (f5<32){
                if ((q[f5]=='F' && r[f5]=='F') ||  (q[f5]=='V' && r[f5]=='V')){
                    rp2[f5]='V';
                    f5++;
                }else{
                    rp2[f5]='F';
                    f5++;
                }
            }
        }
        //vacio
        if(e==5 && f==6 && d==6){
            f6=0;
            while (f6<32){
                if (q[f6]=='V' && r[f6]=='F'){
                    rp2[f6]='F';
                    f6++;
                }else{
                    rp2[f6]='V';
                    f6++;
                }
            }
        }

        //n y v
        if(e==1 && f==6 && d==4){
            f3=0;
            while (f3<32){
                if (nq[f3]=='F' && r[f3]=='F'){
                    rp2[f3]='F';
                    f3++;
                }else{
                    rp2[f3]='V';
                    f3++;
                }
            }
        }

        //vacio
        if(e==2 && f==6 && d==4){
            f4=0;
            while (f4<32){
                if (nq[f4]=='V' && r[f4]=='V'){
                    rp2[f4]='V';
                    f4++;
                }else{
                    rp2[f4]='F';
                    f4++;
                }
            }
        }

        //vacio
        if(e==3 && f==6 && d==4){
            f5=0;
            while (f5<32){
                if ((nq[f5]=='F' && r[f5]=='F') || (nq[f5]=='V' && r[f5]=='V')){
                    rp2[f5]='V';
                    f5++;
                }else{
                    rp2[f5]='F';
                    f5++;
                }
            }
        }
        //vacio
        if(e==5 && f==6 && d==4){
            f6=0;
            while (f6<32){
                if (nq[f6]=='V' && r[f6]=='F'){
                    rp2[f6]='F';
                    f6++;
                }else{
                    rp2[f6]='V';
                    f6++;
                }
            }
        }


        //v y n
        if(e==1 && f==4 && d==6){
            f3=0;
            while (f3<32){
                if (q[f3]=='F' && nr[f3]=='F'){
                    rp2[f3]='F';
                    f3++;
                }else{
                    rp2[f3]='V';
                    f3++;
                }
            }
        }

        //vacio
        if(e==2 && f==4 && d==6){
            f4=0;
            while (f4<32){
                if (q[f4]=='V' && nr[f4]=='V'){
                    rp2[f4]='V';
                    f4++;
                }else{
                    rp2[f4]='F';
                    f4++;
                }
            }
        }

        //vacio
        if(e==3 && f==4 && d==6){
            f5=0;
            while (f5<32){
                if ((q[f5]=='F' && nr[f5]=='F') || (q[f5]=='V' && nr[f5]=='V')){
                    rp2[f5]='V';
                    f5++;
                }else{
                    rp2[f5]='F';
                    f5++;
                }
            }
        }
        //vacio
        if(e==5 && f==4 && d==6){
            f6=0;
            while (f6<32){
                if (q[f6]=='V' && nr[f6]=='F'){
                    rp2[f6]='F';
                    f6++;
                }else{
                    rp2[f6]='V';
                    f6++;
                }
            }
        }


        //p3
        System.out.println("Elige la opcion que deseas para llenar el primer espacio en: []r[][]s" +
                "\n1.V" +
                "\n2.^" +
                "\n3.↔" +
                "\n4.¬" +
                "\n5.►" +
                "\n6.Vacio");
        g=leer.nextInt();
        while(g!=4 && g!=6){
            System.out.println("Elige la opcion que deseas para llenar el primer espacio en: []r[][]s" +
                    "\n1.V" +
                    "\n2.^" +
                    "\n3.↔" +
                    "\n4.¬" +
                    "\n5.►" +
                    "\n6.Vacio");
            g=leer.nextInt();
        }
        System.out.println("Elige la opcion que deseas para llenar el segundo espacio en:"+signos[g-1]+"r[][]s" +
                "\n1.V" +
                "\n2.^" +
                "\n3.↔" +
                "\n4.¬" +
                "\n5.►" +
                "\n6.Vacio");
        h=leer.nextInt();
        while(h==4 || h==6){
            System.out.println("Elige la opcion que deseas para llenar el segundo espacio en: []r[][]s" +
                    "\n1.V" +
                    "\n2.^" +
                    "\n3.↔" +
                    "\n4.¬" +
                    "\n5.►" +
                    "\n6.Vacio");
            h=leer.nextInt();
        }
        System.out.println("Elige la opcion que deseas para llenar el tercer espacio en:"+signos[g-1]+"r"+signos[h-1]+"s" +
                "\n1.V" +
                "\n2.^" +
                "\n3.↔" +
                "\n4.¬" +
                "\n5.►" +
                "\n6.Vacio");
        i=leer.nextInt();
        while(i!=4 && i!=6){
            System.out.println("Elige la opcion que deseas para llenar el tercer espacio en:"+signos[g-1]+"r"+signos[h-1]+"[]s" +
                    "\n1.V" +
                    "\n2.^" +
                    "\n3.↔" +
                    "\n4.¬" +
                    "\n5.►" +
                    "\n6.Vacio");
            i=leer.nextInt();
        }
        System.out.println(signos[g-1]+"r"+signos[h-1]+signos[i-1]+"s");


        //ifc negacion
        if(i==4){
            f2=0;
            while(f2<32){
                if(s[f2]=='V'){
                    ns[f2]='F';
                    f2++;
                }else{
                    ns[f2]='V';
                    f2++;
                }
            }
        }
        if(g==4){
            f2=0;
            while(f2<32){
                if(r[f2]=='V'){
                    nr[f2]='F';
                    f2++;
                }else{
                    nr[f2]='V';
                    f2++;
                }
            }
        }
        //vnegacion
        if(h==1 && i==4 && g==4){
            f3=0;
            while (f3<32){
                if (nr[f3]=='F' && ns[f3]=='F'){
                    rp3[f3]='F';
                    f3++;
                }else{
                    rp3[f3]='V';
                    f3++;
                }
            }

        }

        //^negacion
        if(h==2 && i==4 && g==4){
            f4=0;
            while (f4<32){
                if (nr[f4]=='V' && ns[f4]=='V'){
                    rp3[f4]='V';
                    f4++;
                }else{
                    rp3[f4]='F';
                    f4++;
                }
            }
        }

        //bicondicional negacion
        if(h==3 && i==4 && g==4){
            f5=0;
            while (f5<32){
                if ((nr[f5]=='F' && ns[f5]=='F') || (nr[f5]=='V' && ns[f5]=='V')){
                    rp3[f5]='V';
                    f5++;
                }else{
                    rp3[f5]='F';
                    f5++;
                }
            }
        }
        //condicional negacion
        if(h==5 && i==4 && g==4){
            f6=0;
            while (f6<32){
                if (nr[f6]=='V' && ns[f6]=='F'){
                    rp3[f6]='F';
                    f6++;
                }else{
                    rp3[f6]='V';
                    f6++;
                }
            }
        }
        //vacio
        if(h==1 && i==6 && g==6){
            f3=0;
            while (f3<32){
                if (r[f3]=='F' && s[f3]=='F'){
                    rp3[f3]='F';
                    f3++;
                }else{
                    rp3[f3]='V';
                    f3++;
                }
            }
        }

        //vacio
        if(h==2 && i==6 && g==6){
            f4=0;
            while (f4<32){
                if (r[f4]=='V' && s[f4]=='V'){
                    rp3[f4]='F';
                    f4++;
                }else{
                    rp3[f4]='V';
                    f4++;
                }
            }
        }

        //vacio
        if(h==3 && i==6 && g==6){
            f5=0;
            while (f5<32){
                if ((r[f5]=='F' && s[f5]=='F')  || (r[f5]=='V' && s[f5]=='V')){
                    rp3[f5]='V';
                    f5++;
                }else{
                    rp3[f5]='F';
                    f5++;
                }
            }
        }
        //vacio
        if(h==5 && i==6 && g==6){
            f6=0;
            while (f6<32){
                if (r[f6]=='V' && s[f6]=='F'){
                    rp3[f6]='F';
                    f6++;
                }else{
                    rp3[f6]='V';
                    f6++;
                }
            }
        }

        //n y v
        if(h==1 && i==6 && g==4){
            f3=0;
            while (f3<32){
                if (nr[f3]=='F' && s[f3]=='F'){
                    rp3[f3]='F';
                    f3++;
                }else{
                    rp3[f3]='V';
                    f3++;
                }
            }
        }

        //vacio
        if(h==2 && i==6 && g==4){
            f4=0;
            while (f4<32){
                if (nr[f4]=='V' && s[f4]=='V'){
                    rp3[f4]='V';
                    f4++;
                }else{
                    rp3[f4]='F';
                    f4++;
                }
            }
        }

        //vacio
        if(h==3 && i==6 && g==4){
            f5=0;
            while (f5<32){
                if ((nr[f5]=='F' && s[f5]=='F') || (nr[f5]=='V' && s[f5]=='V')){
                    rp3[f5]='V';
                    f5++;
                }else{
                    rp3[f5]='F';
                    f5++;
                }
            }
        }
        //vacio
        if(h==5 && i==6 && g==4){
            f6=0;
            while (f6<32){
                if ((s[f6]=='V' && nr[f6]=='F') || (nr[f6]=='V' && s[f6]=='F')){
                    rp3[f6]='F';
                    f6++;
                }else{
                    rp3[f6]='V';
                    f6++;
                }
            }
        }


        //v y n
        if(h==1 && i==4 && g==6){
            f3=0;
            while (f3<32){
                if (r[f3]=='F' && ns[f3]=='F'){
                    rp3[f3]='F';
                    f3++;
                }else{
                    rp3[f3]='V';
                    f3++;
                }
            }
        }

        //vacio
        if(h==2 && i==4 && g==6){
            f4=0;
            while (f4<32){
                if (r[f4]=='V' && ns[f4]=='V'){
                    rp3[f4]='V';
                    f4++;
                }else{
                    rp3[f4]='F';
                    f4++;
                }
            }
        }

        //vacio
        if(h==3 && i==4 && g==6){
            f5=0;
            while (f5<32){
                if ((r[f5]=='F' && ns[f5]=='F')  || (r[f5]=='V' && ns[f5]=='V')){
                    rp3[f5]='V';
                    f5++;
                }else{
                    rp3[f5]='F';
                    f5++;
                }
            }
        }
        //vacio
        if(h==5 && i==4 && g==6){
            f6=0;
            while (f6<32){
                if (r[f6]=='V' && ns[f6]=='F'){
                    rp3[f6]='F';
                    f6++;
                }else{
                    rp3[f6]='V';
                    f6++;
                }
            }
        }


        //p4
        System.out.println("Elige la opcion que deseas para llenar el primer espacio en: []s[][]t" +
                "\n1.V" +
                "\n2.^" +
                "\n3.↔" +
                "\n4.¬" +
                "\n5.►" +
                "\n6.Vacio");
        j=leer.nextInt();
        while(j!=4 && j!=6){
            System.out.println("Elige la opcion que deseas para llenar el primer espacio en: []s[][]t" +
                    "\n1.V" +
                    "\n2.^" +
                    "\n3.↔" +
                    "\n4.¬" +
                    "\n5.►" +
                    "\n6.Vacio");
            j=leer.nextInt();
        }
        System.out.println("Elige la opcion que deseas para llenar el segundo espacio en:"+signos[j-1]+"s[][]t" +
                "\n1.V" +
                "\n2.^" +
                "\n3.↔" +
                "\n4.¬" +
                "\n5.►" +
                "\n6.Vacio");
        k=leer.nextInt();
        while(k==4 || k==6){
            System.out.println("Elige la opcion que deseas para llenar el segundo espacio en: []s[][]t" +
                    "\n1.V" +
                    "\n2.^" +
                    "\n3.↔" +
                    "\n4.¬" +
                    "\n5.►" +
                    "\n6.Vacio");
            k=leer.nextInt();
        }
        System.out.println("Elige la opcion que deseas para llenar el tercer espacio en:"+signos[j-1]+"s"+signos[k-1]+"t" +
                "\n1.V" +
                "\n2.^" +
                "\n3.↔" +
                "\n4.¬" +
                "\n5.►" +
                "\n6.Vacio");
        l=leer.nextInt();
        while(l!=4 && l!=6){
            System.out.println("Elige la opcion que deseas para llenar el tercer espacio en:"+signos[j-1]+"s"+signos[k-1]+"[]t" +
                    "\n1.V" +
                    "\n2.^" +
                    "\n3.↔" +
                    "\n4.¬" +
                    "\n5.►" +
                    "\n6.Vacio");
            l=leer.nextInt();
        }
        System.out.println(signos[j-1]+"s"+signos[k-1]+signos[l-1]+"t");
        //ifc negacion
        if(l==4){
            f2=0;
            while(f2<32){
                if(t[f2]=='V'){
                    nt[f2]='F';
                    f2++;
                }else{
                    nt[f2]='V';
                    f2++;
                }
            }
        }
        if(j==4){
            f2=0;
            while(f2<32){
                if(s[f2]=='V'){
                    ns[f2]='F';
                    f2++;
                }else{
                    ns[f2]='V';
                    f2++;
                }
            }
        }
        //vnegacion
        if(k==1 && l==4 && j==4){
            f3=0;
            while (f3<32){
                if ((nt[f3]=='F' && ns[f3]=='F') || (ns[f3]=='F' && nt[f3]=='F')){
                    rp4[f3]='F';
                    f3++;
                }else{
                    rp4[f3]='V';
                    f3++;
                }
            }

        }

        //^negacion
        if(k==2 && l==4 && j==4){
            f4=0;
            while (f4<32){
                if (ns[f4]=='V' && nt[f4]=='V'){
                    rp4[f4]='V';
                    f4++;
                }else{
                    rp4[f4]='F';
                    f4++;
                }
            }
        }

        //bicondicional negacion
        if(k==3 && l==4 && j==4){
            f5=0;
            while (f5<32){
                if ((ns[f5]=='F' && nt[f5]=='F')  || (ns[f5]=='V' && nt[f5]=='V')){
                    rp4[f5]='V';
                    f5++;
                }else{
                    rp4[f5]='F';
                    f5++;
                }
            }
        }
        //condicional negacion
        if(k==5 && l==4 && j==4){
            f6=0;
            while (f6<32){
                if (ns[f6]=='V' && nt[f6]=='F'){
                    rp4[f6]='F';
                    f6++;
                }else{
                    rp4[f6]='V';
                    f6++;
                }
            }
        }
        //vacio
        if(k==1 && l==6 && j==6){
            f3=0;
            while (f3<32){
                if (s[f3]=='F' && t[f3]=='F'){
                    rp4[f3]='F';
                    f3++;
                }else{
                    rp4[f3]='V';
                    f3++;
                }
            }
        }

        //vacio
        if(k==2 && l==6 && j==6){
            f4=0;
            while (f4<32){
                if (s[f4]=='V' && t[f4]=='V'){
                    rp4[f4]='V';
                    f4++;
                }else{
                    rp4[f4]='F';
                    f4++;
                }
            }
        }

        //vacio
        if(k==3 && l==6 && j==6){
            f5=0;
            while (f5<32){
                if ((s[f5]=='F' && t[f5]=='F') || (s[f5]=='V' && t[f5]=='V')){
                    rp4[f5]='V';
                    f5++;
                }else{
                    rp4[f5]='F';
                    f5++;
                }
            }
        }
        //vacio
        if(k==5 && l==6 && j==6){
            f6=0;
            while (f6<32){
                if (s[f6]=='V' && t[f6]=='F'){
                    rp4[f6]='F';
                    f6++;
                }else{
                    rp4[f6]='V';
                    f6++;
                }
            }
        }

        //n y v
        if(k==1 && l==6 && j==4){
            f3=0;
            while (f3<32){
                if (ns[f3]=='F' && t[f3]=='F'){
                    rp4[f3]='F';
                    f3++;
                }else{
                    rp4[f3]='V';
                    f3++;
                }
            }
        }

        //vacio
        if(k==2 && l==6 && j==4){
            f4=0;
            while (f4<32){
                if (ns[f4]=='V' && t[f4]=='V'){
                    rp4[f4]='V';
                    f4++;
                }else{
                    rp4[f4]='F';
                    f4++;
                }
            }
        }

        //vacio
        if(k==3 && l==6 && j==4){
            f5=0;
            while (f5<32){
                if ((ns[f5]=='F' && t[f5]=='F') || (ns[f5]=='V' && t[f5]=='V')){
                    rp4[f5]='V';
                    f5++;
                }else{
                    rp4[f5]='F';
                    f5++;
                }
            }
        }
        //vacio
        if(k==5 && l==6 && j==4){
            f6=0;
            while (f6<32){
                if (ns[f6]=='V' && t[f6]=='F'){
                    rp4[f6]='F';
                    f6++;
                }else{
                    rp4[f6]='V';
                    f6++;
                }
            }
        }


        //v y n
        if(k==1 && l==4 && j==6){
            f3=0;
            while (f3<32){
                if (s[f3]=='F' && nt[f3]=='F'){
                    rp4[f3]='F';
                    f3++;
                }else{
                    rp4[f3]='V';
                    f3++;
                }
            }
        }

        //vacio
        if(k==2 && l==4 && j==6){
            f4=0;
            while (f4<32){
                if (s[f4]=='V' && nt[f4]=='V'){
                    rp4[f4]='V';
                    f4++;
                }else{
                    rp4[f4]='F';
                    f4++;
                }
            }
        }

        //vacio
        if(k==3 && l==4 && j==6){
            f5=0;
            while (f5<32){
                if ((s[f5]=='F' && nt[f5]=='F') || (s[f5]=='V' && nt[f5]=='V')){
                    rp4[f5]='V';
                    f5++;
                }else{
                    rp4[f5]='F';
                    f5++;
                }
            }
        }
        //vacio
        if(k==5 && l==4 && j==6){
            f6=0;
            while (f6<32){
                if (s[f6]=='V' && nt[f6]=='F'){
                    rp4[f6]='F';
                    f6++;
                }else{
                    rp4[f6]='V';
                    f6++;
                }
            }
        }

        //conclusion

        //p4
        System.out.println("Elige la opcion que deseas para llenar el primer espacio en: ([]p[][]q)[][]r" +
                "\n1.V" +
                "\n2.^" +
                "\n3.↔" +
                "\n4.¬" +
                "\n5.►" +
                "\n6.Vacio");
        aa=leer.nextInt();
        while(aa!=4 && aa!=6){
            System.out.println("Elige la opcion que deseas para llenar el primer espacio en: ([]p[][]q)[][]r" +
                    "\n1.V" +
                    "\n2.^" +
                    "\n3.↔" +
                    "\n4.¬" +
                    "\n5.►" +
                    "\n6.Vacio");
            aa=leer.nextInt();
        }
        System.out.println("Elige la opcion que deseas para llenar el segundo espacio en:("+signos[aa-1]+"p[][]q)[][]r"+
                "\n1.V" +
                "\n2.^" +
                "\n3.↔" +
                "\n4.¬" +
                "\n5.►" +
                "\n6.Vacio");
        bb=leer.nextInt();
        while(bb==4 || bb==6){
            System.out.println("Elige la opcion que deseas para llenar el segundo espacio en: ([]p[][]q)[][]r" +
                    "\n1.V" +
                    "\n2.^" +
                    "\n3.↔" +
                    "\n4.¬" +
                    "\n5.►" +
                    "\n6.Vacio");
            bb=leer.nextInt();
        }
        System.out.println("Elige la opcion que deseas para llenar el tercer espacio en:("+signos[aa-1]+"p"+signos[bb-1]+"[]q)[][]r" +
                "\n1.V" +
                "\n2.^" +
                "\n3.↔" +
                "\n4.¬" +
                "\n5.►" +
                "\n6.Vacio");
        cc=leer.nextInt();
        while(cc!=4 && cc!=6){
            System.out.println("Elige la opcion que deseas para llenar el tercer espacio en:([]p[][]q)[][]r" +
                    "\n1.V" +
                    "\n2.^" +
                    "\n3.↔" +
                    "\n4.¬" +
                    "\n5.►" +
                    "\n6.Vacio");
            cc=leer.nextInt();
        }
        System.out.println("Elige la opcion que deseas para llenar el cuarto espacio en:("+signos[aa-1]+"p"+signos[bb-1]+signos[cc-1]+"q)[][]r" +
                "\n1.V" +
                "\n2.^" +
                "\n3.↔" +
                "\n4.¬" +
                "\n5.►" +
                "\n6.Vacio");
        dd=leer.nextInt();
        while(dd==4 && dd==6){
            System.out.println("Elige la opcion que deseas para llenar el cuarto espacio en:([]p[][]q)[][]r" +
                    "\n1.V" +
                    "\n2.^" +
                    "\n3.↔" +
                    "\n4.¬" +
                    "\n5.►" +
                    "\n6.Vacio");
            dd=leer.nextInt();
        }
        System.out.println("Elige la opcion que deseas para llenar el quinto espacio en:("+signos[aa-1]+"p"+signos[bb-1]+signos[cc-1]+"q)"+signos[dd-1]+"[]r" +
                "\n1.V" +
                "\n2.^" +
                "\n3.↔" +
                "\n4.¬" +
                "\n5.►" +
                "\n6.Vacio");
        ee=leer.nextInt();
        while(ee!=4 && ee!=6){
            System.out.println("Elige la opcion que deseas para llenar el quinto espacio en:([]p[][]q)[][]r" +
                    "\n1.V" +
                    "\n2.^" +
                    "\n3.↔" +
                    "\n4.¬" +
                    "\n5.►" +
                    "\n6.Vacio");
            ee=leer.nextInt();
        }
        if(aa==4){
            f2=0;
            while(f2<32){
                if(p[f2]=='V'){
                    np[f2]='F';
                    f2++;
                }else{
                    np[f2]='V';
                    f2++;
                }
            }
        }
        if(cc==4){
            f2=0;
            while(f2<32){
                if(q[f2]=='V'){
                    nq[f2]='F';
                    f2++;
                }else{
                    nq[f2]='V';
                    f2++;
                }
            }
        }
        if(ee==4){
            f2=0;
            while(f2<32){
                if(r[f2]=='V'){
                    nr[f2]='F';
                    f2++;
                }else{
                    nr[f2]='V';
                    f2++;
                }
            }
        }


        if(bb==1 && aa==4 && cc==4){
            ff1=0;
            while (ff1<32){
                if (np[ff1]=='F' && nq[ff1]=='F'){
                    rp5[ff1]='F';
                    ff1++;
                }else{
                    rp5[ff1]='V';
                    ff1++;
                }
            }

        }
        if(bb==2 && aa==4 && cc==4){
            ff1=0;
            while (ff1<32){
                if (np[ff1]=='V' && nq[ff1]=='V'){
                    rp5[ff1]='V';
                    ff1++;
                }else{
                    rp5[ff1]='F';
                    ff1++;
                }
            }

        }

        if(bb==3 && aa==4 && cc==4){
            ff1=0;
            while (ff1<32){
                if ((np[ff1]=='V' && nq[ff1]=='V') || (np[ff1]=='F' && nq[ff1]=='F')){
                    rp5[ff1]='V';
                    ff1++;
                }else{
                    rp5[ff1]='F';
                    ff1++;
                }
            }

        }

        if(bb==5 && aa==4 && cc==4){
            ff1=0;
            while (ff1<32){
                if (np[ff1]=='V' && nq[ff1]=='F'){
                    rp5[ff1]='F';
                    ff1++;
                }else{
                    rp5[ff1]='V';
                    ff1++;
                }
            }

        }

        if(bb==1 && aa==4 && cc==6){
            ff1=0;
            while (ff1<32){
                if (np[ff1]=='F' && q[ff1]=='F'){
                    rp5[ff1]='F';
                    ff1++;
                }else{
                    rp5[ff1]='V';
                    ff1++;
                }
            }

        }

        if(bb==2 && aa==4 && cc==6){
            ff1=0;
            while (ff1<32){
                if (np[ff1]=='V' && q[ff1]=='V'){
                    rp5[ff1]='V';
                    ff1++;
                }else{
                    rp5[ff1]='F';
                    ff1++;
                }
            }

        }

        if(bb==3 && aa==4 && cc==6){
            ff1=0;
            while (ff1<32){
                if ((np[ff1]=='V' && q[ff1]=='V') || (np[ff1]=='F' && q[ff1]=='F')){
                    rp5[ff1]='V';
                    ff1++;
                }else{
                    rp5[ff1]='F';
                    ff1++;
                }
            }

        }

        if(bb==5 && aa==4 && cc==6){
            ff1=0;
            while (ff1<32){
                if (np[ff1]=='V' && q[ff1]=='F'){
                    rp5[ff1]='F';
                    ff1++;
                }else{
                    rp5[ff1]='V';
                    ff1++;
                }
            }

        }

        if(bb==1 && aa==6 && cc==6){
            ff1=0;
            while (ff1<32){
                if (p[ff1]=='F' && q[ff1]=='F'){
                    rp5[ff1]='F';
                    ff1++;
                }else{
                    rp5[ff1]='V';
                    ff1++;
                }
            }

        }

        if(bb==2 && aa==6 && cc==6){
            ff1=0;
            while (ff1<32){
                if (p[ff1]=='V' && q[ff1]=='V'){
                    rp5[ff1]='V';
                    ff1++;
                }else{
                    rp5[ff1]='F';
                    ff1++;
                }
            }

        }


        if(bb==3 && aa==6 && cc==6){
            ff1=0;
            while (ff1<32){
                if ((p[ff1]=='V' && q[ff1]=='V') || (p[ff1]=='F' && q[ff1]=='F')){
                    rp5[ff1]='V';
                    ff1++;
                }else{
                    rp5[ff1]='F';
                    ff1++;
                }
            }

        }

        if(bb==5 && aa==6 && cc==6){
            ff1=0;
            while (ff1<32){
                if (p[ff1]=='V' && q[ff1]=='F'){
                    rp5[ff1]='F';
                    ff1++;
                }else{
                    rp5[ff1]='V';
                    ff1++;
                }
            }

        }

        if(bb==1 && aa==6 && cc==4){
            ff1=0;
            while (ff1<32){
                if (p[ff1]=='F' && nq[ff1]=='F'){
                    rp5[ff1]='F';
                    ff1++;
                }else{
                    rp5[ff1]='V';
                    ff1++;
                }
            }

        }

        if(bb==2 && aa==6 && cc==4){
            ff1=0;
            while (ff1<32){
                if (p[ff1]=='V' && nq[ff1]=='V'){
                    rp5[ff1]='V';
                    ff1++;
                }else{
                    rp5[ff1]='F';
                    ff1++;
                }
            }

        }

        if(bb==3 && aa==6 && cc==4){
            ff1=0;
            while (ff1<32){
                if ((p[ff1]=='V' && nq[ff1]=='V') || (p[ff1]=='F' && nq[ff1]=='F')){
                    rp5[ff1]='V';
                    ff1++;
                }else{
                    rp5[ff1]='F';
                    ff1++;
                }
            }

        }

        if(bb==5 && aa==6 && cc==4){
            ff1=0;
            while (ff1<32){
                if (p[ff1]=='V' && nq[ff1]=='F'){
                    rp5[ff1]='F';
                    ff1++;
                }else{
                    rp5[ff1]='F';
                    ff1++;
                }
            }

        }

        int fff;

        if(dd==1 && ee==4){
            fff = 0;
            while (fff<32){
                if (rp5[fff]=='F' && nr[fff]=='F'){
                    rpff[fff]='F';
                    fff++;
                }else{
                    rpff[fff]='V';
                    fff++;
                }
            }
        }

        if(dd==2 && ee==4){
            fff = 0;
            while (fff<32){
                if (rp5[fff]=='V' && nr[fff]=='V'){
                    rpff[fff]='V';
                    fff++;
                }else{
                    rpff[fff]='F';
                    fff++;
                }
            }
        }

        if(dd==3 && ee==4){
            fff = 0;
            while (fff<32){
                if ((rp5[fff]=='V' && nr[fff]=='V') ||(rp5[fff]=='F' && nr[fff]=='F')){
                    rpff[fff]='V';
                    fff++;
                }else{
                    rpff[fff]='F';
                    fff++;
                }
            }
        }

        if(dd==5 && ee==4){
            fff = 0;
            while (fff<32){
                if (rp5[fff]=='V' && nr[fff]=='F'){
                    rpff[fff]='F';
                    fff++;
                }else{
                    rpff[fff]='V';
                    fff++;
                }
            }
        }

        if(dd==1 && ee==6){
            fff = 0;
            while (fff<32){
                if (rp5[fff]=='F' && r[fff]=='F'){
                    rpff[fff]='F';
                    fff++;
                }else{
                    rpff[fff]='V';
                    fff++;
                }
            }
        }

        if(dd==2 && ee==6){
            fff = 0;
            while (fff<32){
                if (rp5[fff]=='V' && r[fff]=='V'){
                    rpff[fff]='V';
                    fff++;
                }else{
                    rpff[fff]='F';
                    fff++;
                }
            }
        }

        if(dd==3 && ee==6){
            fff = 0;
            while (fff<32){
                if ((rp5[fff]=='V' && r[fff]=='V') ||(rp5[fff]=='F' && r[fff]=='F')){
                    rpff[fff]='V';
                    fff++;
                }else{
                    rpff[fff]='F';
                    fff++;
                }
            }
        }


        if(dd==5 && ee==6){
            fff = 0;
            while (fff<32){
                if (rp5[fff]=='V' && r[fff]=='F'){
                    rpff[fff]='F';
                    fff++;
                }else{
                    rpff[fff]='V';
                    fff++;
                }
            }
        }



        System.out.println();
        System.out.println();
        System.out.println();


        do{
            System.out.println("P1...."+signos[a-1]+"p"+signos[b-1]+signos[c-1]+"q");
            System.out.println("P2...."+signos[d-1]+"q"+signos[e-1]+signos[f-1]+"r");
            System.out.println("P3...."+signos[g-1]+"r"+signos[h-1]+signos[i-1]+"s");
            System.out.println("P4...."+signos[j-1]+"s"+signos[k-1]+signos[l-1]+"t");
            System.out.println("C...."+"("+signos[aa-1]+"p"+signos[bb-1]+signos[cc-1]+"q)"+signos[dd-1]+signos[ee-1]+"r");
            System.out.println("Ingresa la opcion que deseas:" +
                    "\n1.P1\t2.P2\t3.P3\t4.P4" +
                    "\n5.P1 y P2\t6.P1 y P3\t7.P1 y P4" +
                    "\n8.P2 y P3\t9.P2 y P4" +
                    "\n 10.P3 y P4" +
                    "\n 11.P1,P2 y P3\t12.P1,P2,P4\t13.P1,P3,P4" +
                    "\n 14.P2,P3,P4" +
                    "\n 15.P1,P2,P3,P4");
            op=leer.nextInt();
            switch (op){
                case 1:
                     F22=0;
                    while(F22<32){
                        if(rp1[F22]=='V' && rpff[F22]=='F' ){
                            rpfff[F22]='F';
                            F22++;
                        }else{
                            rpfff[F22]='V';
                            F22++;
                        }
                    }
                     ax=0;
                    while(ax<32){
                        if(rpfff[ax]=='V'){
                            y++;
                            ax++;
                        }else{
                            y--;
                            ax++;
                        }
                    }
                    if(y==32){
                        System.out.println("Es tautologia");
                    }else{
                        System.out.println("No es tautologia");
                    }
                    impresion=0;

                    System.out.println("p\tq\tr\ts\tt\t¬p\t¬q\t¬r\t¬s\t¬t\tP1\tC\tResultado");
                    while(impresion<32){

                        System.out.println(p[impresion]+"\t"+q[impresion]+"\t"+r[impresion]+"\t"+s[impresion]+"\t"+t[impresion]+"\t"+np[impresion]+"\t"+nq[impresion]+"\t"+nr[impresion]+"\t"+ns[impresion]+"\t"+nt[impresion]+"\t"+rp1[impresion]+"\t"+rpff[impresion]+"\t"+rpfff[impresion]);
                        impresion++;
                    }


                    break;
                case 2:
                     F22=0;
                    while(F22<32){
                        if(rp2[F22]=='V' && rpff[F22]=='F' ){
                            rpfff[F22]='F';
                            F22++;
                        }else{
                            rpfff[F22]='V';
                            F22++;
                        }
                    }
                     ax=0;
                    while(ax<32){
                        if(rpfff[ax]=='V'){
                            y++;
                            ax++;
                        }else{
                            y--;
                            ax++;
                        }
                    }
                    if(y==32){
                        System.out.println("Es tautologia");
                    }else{
                        System.out.println("No es tautologia");
                    }
                    impresion=0;

                    System.out.println("p\tq\tr\ts\tt\t¬p\t¬q\t¬r\t¬s\t¬t\tP2\tC\tResultado");
                    while(impresion<32){

                        System.out.println(p[impresion]+"\t"+q[impresion]+"\t"+r[impresion]+"\t"+s[impresion]+"\t"+t[impresion]+"\t"+np[impresion]+"\t"+nq[impresion]+"\t"+nr[impresion]+"\t"+ns[impresion]+"\t"+nt[impresion]+"\t"+rp2[impresion]+"\t"+rpff[impresion]+"\t"+rpfff[impresion]);
                        impresion++;
                    }

                    break;
                case 3:
                    F22=0;
                    while(F22<32){
                        if(rp3[F22]=='V' && rpff[F22]=='F' ){
                            rpfff[F22]='F';
                            F22++;
                        }else{
                            rpfff[F22]='V';
                            F22++;
                        }
                    }
                     ax=0;
                    while(ax<32){
                        if(rpfff[ax]=='V'){
                            y++;
                            ax++;
                        }else{
                            y--;
                            ax++;
                        }
                    }
                    if(y==32){
                        System.out.println("Es tautologia");
                    }else{
                        System.out.println("No es tautologia");
                    }
                    impresion=0;

                    System.out.println("p\tq\tr\ts\tt\t¬p\t¬q\t¬r\t¬s\t¬t\tP3\tC\tResultado");
                    while(impresion<32){

                        System.out.println(p[impresion]+"\t"+q[impresion]+"\t"+r[impresion]+"\t"+s[impresion]+"\t"+t[impresion]+"\t"+np[impresion]+"\t"+nq[impresion]+"\t"+nr[impresion]+"\t"+ns[impresion]+"\t"+nt[impresion]+"\t"+rp3[impresion]+"\t"+rpff[impresion]+"\t"+rpfff[impresion]);
                        impresion++;
                    }

                    break;
                case 4:
                    F22=0;
                    while(F22<32){
                        if(rp4[F22]=='V' && rpff[F22]=='F' ){
                            rpfff[F22]='F';
                            F22++;
                        }else{
                            rpfff[F22]='V';
                            F22++;
                        }
                    }
                     ax=0;
                    while(ax<32){
                        if(rpfff[ax]=='V'){
                            y++;
                            ax++;
                        }else{
                            y--;
                            ax++;
                        }
                    }
                    if(y==32){
                        System.out.println("Es tautologia");
                    }else{
                        System.out.println("No es tautologia");
                    }
                    impresion=0;

                    System.out.println("p\tq\tr\ts\tt\t¬p\t¬q\t¬r\t¬s\t¬t\tP4\tC\tResultado");
                    while(impresion<32){

                        System.out.println(p[impresion]+"\t"+q[impresion]+"\t"+r[impresion]+"\t"+s[impresion]+"\t"+t[impresion]+"\t"+np[impresion]+"\t"+nq[impresion]+"\t"+nr[impresion]+"\t"+ns[impresion]+"\t"+nt[impresion]+"\t"+rp4[impresion]+"\t"+rpff[impresion]+"\t"+rpfff[impresion]);
                        impresion++;
                    }

                    break;
                case 5:
                    finalito=0;
                    while(finalito<32){
                        if(rp1[finalito]=='V' && rp2[finalito]=='V'){
                            rpf[finalito]='V';
                            finalito++;
                        }else{
                            rpf[finalito]='F';
                            finalito++;
                        }
                    }

                    F22=0;
                    while(F22<32){
                        if(rpf[F22]=='V' && rpff[F22]=='F' ){
                            rpfff[F22]='F';
                            F22++;
                        }else{
                            rpfff[F22]='V';
                            F22++;
                        }
                    }
                     ax=0;
                    while(ax<32){
                        if(rpfff[ax]=='V'){
                            y++;
                            ax++;
                        }else{
                            y--;
                            ax++;
                        }
                    }
                    if(y==32){
                        System.out.println("Es tautologia");
                    }else{
                        System.out.println("No es tautologia");
                    }
                    impresion=0;

                    System.out.println("p\tq\tr\ts\tt\t¬p\t¬q\t¬r\t¬s\t¬t\tP1\tP2\tpT\tC\tResultado");
                    while(impresion<32){

                        System.out.println(p[impresion]+"\t"+q[impresion]+"\t"+r[impresion]+"\t"+s[impresion]+"\t"+t[impresion]+"\t"+np[impresion]+"\t"+nq[impresion]+"\t"+nr[impresion]+"\t"+ns[impresion]+"\t"+nt[impresion]+"\t"+rp1[impresion]+"\t"+rp2[impresion]+"\t"+rpf[impresion]+"\t"+rpff[impresion]+"\t"+rpfff[impresion]);
                        impresion++;
                    }

                    break;
                case 6:
                    finalito=0;
                    while(finalito<32){
                        if(rp1[finalito]=='V' && rp3[finalito]=='V'){
                            rpf[finalito]='V';
                            finalito++;
                        }else{
                            rpf[finalito]='F';
                            finalito++;
                        }
                    }
                    F22=0;
                    while(F22<32){
                        if(rpf[F22]=='V' && rpff[F22]=='F' ){
                            rpfff[F22]='F';
                            F22++;
                        }else{
                            rpfff[F22]='V';
                            F22++;
                        }
                    }
                     ax=0;
                    while(ax<32){
                        if(rpfff[ax]=='V'){
                            y++;
                            ax++;
                        }else{
                            y--;
                            ax++;
                        }
                    }
                    if(y==32){
                        System.out.println("Es tautologia");
                    }else{
                        System.out.println("No es tautologia");
                    }
                    impresion=0;

                    System.out.println("p\tq\tr\ts\tt\t¬p\t¬q\t¬r\t¬s\t¬t\tP1\tP3\tpT\tC\tResultado");
                    while(impresion<32){

                        System.out.println(p[impresion]+"\t"+q[impresion]+"\t"+r[impresion]+"\t"+s[impresion]+"\t"+t[impresion]+"\t"+np[impresion]+"\t"+nq[impresion]+"\t"+nr[impresion]+"\t"+ns[impresion]+"\t"+nt[impresion]+"\t"+rp1[impresion]+"\t"+rp3[impresion]+"\t"+rpf[impresion]+"\t"+rpff[impresion]+"\t"+rpfff[impresion]);
                        impresion++;
                    }

                    break;
                case 7:
                    finalito=0;
                    while(finalito<32){
                        if(rp1[finalito]=='V' && rp4[finalito]=='V'){
                            rpf[finalito]='V';
                            finalito++;
                        }else{
                            rpf[finalito]='F';
                            finalito++;
                        }
                    }
                    F22=0;
                    while(F22<32){
                        if(rpf[F22]=='V' && rpff[F22]=='F' ){
                            rpfff[F22]='F';
                            F22++;
                        }else{
                            rpfff[F22]='V';
                            F22++;
                        }
                    }
                     ax=0;
                    while(ax<32){
                        if(rpfff[ax]=='V'){
                            y++;
                            ax++;
                        }else{
                            y--;
                            ax++;
                        }
                    }
                    if(y==32){
                        System.out.println("Es tautologia");
                    }else{
                        System.out.println("No es tautologia");
                    }
                    impresion=0;

                    System.out.println("p\tq\tr\ts\tt\t¬p\t¬q\t¬r\t¬s\t¬t\tP1\tP4\tpT\tC\tResultado");
                    while(impresion<32){

                        System.out.println(p[impresion]+"\t"+q[impresion]+"\t"+r[impresion]+"\t"+s[impresion]+"\t"+t[impresion]+"\t"+np[impresion]+"\t"+nq[impresion]+"\t"+nr[impresion]+"\t"+ns[impresion]+"\t"+nt[impresion]+"\t"+rp1[impresion]+"\t"+rp4[impresion]+"\t"+rpf[impresion]+"\t"+rpff[impresion]+"\t"+rpfff[impresion]);
                        impresion++;
                    }

                    break;
                case 8:
                    finalito=0;
                    while(finalito<32){
                        if(rp2[finalito]=='V' && rp3[finalito]=='V'){
                            rpf[finalito]='V';
                            finalito++;
                        }else{
                            rpf[finalito]='F';
                            finalito++;
                        }
                    }
                    F22=0;
                    while(F22<32){
                        if(rpf[F22]=='V' && rpff[F22]=='F' ){
                            rpfff[F22]='F';
                            F22++;
                        }else{
                            rpfff[F22]='V';
                            F22++;
                        }
                    }
                     ax=0;
                    while(ax<32){
                        if(rpfff[ax]=='V'){
                            y++;
                            ax++;
                        }else{
                            y--;
                            ax++;
                        }
                    }
                    if(y==32){
                        System.out.println("Es tautologia");
                    }else{
                        System.out.println("No es tautologia");
                    }
                    impresion=0;

                    System.out.println("p\tq\tr\ts\tt\t¬p\t¬q\t¬r\t¬s\t¬t\tP2\tP3\tpT\tC\tResultado");
                    while(impresion<32){

                        System.out.println(p[impresion]+"\t"+q[impresion]+"\t"+r[impresion]+"\t"+s[impresion]+"\t"+t[impresion]+"\t"+np[impresion]+"\t"+nq[impresion]+"\t"+nr[impresion]+"\t"+ns[impresion]+"\t"+nt[impresion]+"\t"+rp2[impresion]+"\t"+rp3[impresion]+"\t"+rpf[impresion]+"\t"+rpff[impresion]+"\t"+rpfff[impresion]);
                        impresion++;
                    }

                    break;
                case 9:
                    finalito=0;
                    while(finalito<32){
                        if(rp2[finalito]=='V' && rp4[finalito]=='V'){
                            rpf[finalito]='V';
                            finalito++;
                        }else{
                            rpf[finalito]='F';
                            finalito++;
                        }
                    }
                    F22=0;
                    while(F22<32){
                        if(rpf[F22]=='V' && rpff[F22]=='F' ){
                            rpfff[F22]='F';
                            F22++;
                        }else{
                            rpfff[F22]='V';
                            F22++;
                        }
                    }
                     ax=0;
                    while(ax<32){
                        if(rpfff[ax]=='V'){
                            y++;
                            ax++;
                        }else{
                            y--;
                            ax++;
                        }
                    }
                    if(y==32){
                        System.out.println("Es tautologia");
                    }else{
                        System.out.println("No es tautologia");
                    }
                    impresion=0;

                    System.out.println("p\tq\tr\ts\tt\t¬p\t¬q\t¬r\t¬s\t¬t\tP2\tP4\tpT\tC\tResultado");
                    while(impresion<32){

                        System.out.println(p[impresion]+"\t"+q[impresion]+"\t"+r[impresion]+"\t"+s[impresion]+"\t"+t[impresion]+"\t"+np[impresion]+"\t"+nq[impresion]+"\t"+nr[impresion]+"\t"+ns[impresion]+"\t"+nt[impresion]+"\t"+rp2[impresion]+"\t"+rp4[impresion]+"\t"+rpf[impresion]+"\t"+rpff[impresion]+"\t"+rpfff[impresion]);
                        impresion++;
                    }


                    break;
                case 10:
                    finalito=0;
                    while(finalito<32){
                        if(rp3[finalito]=='V' && rp4[finalito]=='V'){
                            rpf[finalito]='V';
                            finalito++;
                        }else{
                            rpf[finalito]='F';
                            finalito++;
                        }
                    }
                    F22=0;
                    while(F22<32){
                        if(rpf[F22]=='V' && rpff[F22]=='F' ){
                            rpfff[F22]='F';
                            F22++;
                        }else{
                            rpfff[F22]='V';
                            F22++;
                        }
                    }
                     ax=0;
                    while(ax<32){
                        if(rpfff[ax]=='V'){
                            y++;
                            ax++;
                        }else{
                            y--;
                            ax++;
                        }
                    }
                    if(y==32){
                        System.out.println("Es tautologia");
                    }else{
                        System.out.println("No es tautologia");
                    }
                    impresion=0;

                    System.out.println("p\tq\tr\ts\tt\t¬p\t¬q\t¬r\t¬s\t¬t\tP3\tP4\tpT\tC\tResultado");
                    while(impresion<32){

                        System.out.println(p[impresion]+"\t"+q[impresion]+"\t"+r[impresion]+"\t"+s[impresion]+"\t"+t[impresion]+"\t"+np[impresion]+"\t"+nq[impresion]+"\t"+nr[impresion]+"\t"+ns[impresion]+"\t"+nt[impresion]+"\t"+rp3[impresion]+"\t"+rp4[impresion]+"\t"+rpf[impresion]+"\t"+rpff[impresion]+"\t"+rpfff[impresion]);
                        impresion++;
                    }

                    break;
                case 11:
                    finalito=0;
                    while(finalito<32){
                        if(rp1[finalito]=='V' && rp2[finalito]=='V' && rp3[finalito]=='V'){
                            rpf[finalito]='V';
                            finalito++;
                        }else{
                            rpf[finalito]='F';
                            finalito++;
                        }
                    }
                    F22=0;
                    while(F22<32){
                        if(rpf[F22]=='V' && rpff[F22]=='F' ){
                            rpfff[F22]='F';
                            F22++;
                        }else{
                            rpfff[F22]='V';
                            F22++;
                        }
                    }
                     ax=0;
                    while(ax<32){
                        if(rpfff[ax]=='V'){
                            y++;
                            ax++;
                        }else{
                            y--;
                            ax++;
                        }
                    }
                    if(y==32){
                        System.out.println("Es tautologia");
                    }else{
                        System.out.println("No es tautologia");
                    }
                    impresion=0;

                    System.out.println("p\tq\tr\ts\tt\t¬p\t¬q\t¬r\t¬s\t¬t\tP1\tP2\tP3\tpT\tC\tResultado");
                    while(impresion<32){

                        System.out.println(p[impresion]+"\t"+q[impresion]+"\t"+r[impresion]+"\t"+s[impresion]+"\t"+t[impresion]+"\t"+np[impresion]+"\t"+nq[impresion]+"\t"+nr[impresion]+"\t"+ns[impresion]+"\t"+nt[impresion]+"\t"+rp1[impresion]+"\t"+rp2[impresion]+"\t"+rp3[impresion]+"\t"+rpf[impresion]+"\t"+rpff[impresion]+"\t"+rpfff[impresion]);
                        impresion++;
                    }

                    break;
                case 12:
                    finalito=0;
                    while(finalito<32){
                        if(rp1[finalito]=='V' && rp2[finalito]=='V' && rp4[finalito]=='V'){
                            rpf[finalito]='V';
                            finalito++;
                        }else{
                            rpf[finalito]='F';
                            finalito++;
                        }
                    }
                    F22=0;
                    while(F22<32){
                        if(rpf[F22]=='V' && rpff[F22]=='F' ){
                            rpfff[F22]='F';
                            F22++;
                        }else{
                            rpfff[F22]='V';
                            F22++;
                        }
                    }
                     ax=0;
                    while(ax<32){
                        if(rpfff[ax]=='V'){
                            y++;
                            ax++;
                        }else{
                            y--;
                            ax++;
                        }
                    }
                    if(y==32){
                        System.out.println("Es tautologia");
                    }else{
                        System.out.println("No es tautologia");
                    }
                    impresion=0;

                    System.out.println("p\tq\tr\ts\tt\t¬p\t¬q\t¬r\t¬s\t¬t\tP1\tP2\tP4\tpT\tC\tResultado");
                    while(impresion<32){

                        System.out.println(p[impresion]+"\t"+q[impresion]+"\t"+r[impresion]+"\t"+s[impresion]+"\t"+t[impresion]+"\t"+np[impresion]+"\t"+nq[impresion]+"\t"+nr[impresion]+"\t"+ns[impresion]+"\t"+nt[impresion]+"\t"+rp1[impresion]+"\t"+rp2[impresion]+"\t"+rp4[impresion]+"\t"+rpf[impresion]+"\t"+rpff[impresion]+"\t"+rpfff[impresion]);
                        impresion++;
                    }

                    break;
                case 13:
                    finalito=0;
                    while(finalito<32){
                        if(rp1[finalito]=='V' && rp3[finalito]=='V' && rp4[finalito]=='V'){
                            rpf[finalito]='V';
                            finalito++;
                        }else{
                            rpf[finalito]='F';
                            finalito++;
                        }
                    }
                    F22=0;
                    while(F22<32){
                        if(rpf[F22]=='V' && rpff[F22]=='F' ){
                            rpfff[F22]='F';
                            F22++;
                        }else{
                            rpfff[F22]='V';
                            F22++;
                        }
                    }
                     ax=0;
                    while(ax<32){
                        if(rpfff[ax]=='V'){
                            y++;
                            ax++;
                        }else{
                            y--;
                            ax++;
                        }
                    }
                    if(y==32){
                        System.out.println("Es tautologia");
                    }else{
                        System.out.println("No es tautologia");
                    }
                    impresion=0;

                    System.out.println("p\tq\tr\ts\tt\t¬p\t¬q\t¬r\t¬s\t¬t\tP1\tP3\tP4\tpT\tC\tResultado");
                    while(impresion<32){

                        System.out.println(p[impresion]+"\t"+q[impresion]+"\t"+r[impresion]+"\t"+s[impresion]+"\t"+t[impresion]+"\t"+np[impresion]+"\t"+nq[impresion]+"\t"+nr[impresion]+"\t"+ns[impresion]+"\t"+nt[impresion]+"\t"+rp1[impresion]+"\t"+rp3[impresion]+"\t"+rp4[impresion]+"\t"+rpf[impresion]+"\t"+rpff[impresion]+"\t"+rpfff[impresion]);
                        impresion++;
                    }

                    break;
                case 14:
                    finalito=0;
                    while(finalito<32){
                        if(rp2[finalito]=='V' && rp3[finalito]=='V' && rp4[finalito]=='V'){
                            rpf[finalito]='V';
                            finalito++;
                        }else{
                            rpf[finalito]='F';
                            finalito++;
                        }
                    }
                    F22=0;
                    while(F22<32){
                        if(rpf[F22]=='V' && rpff[F22]=='F' ){
                            rpfff[F22]='F';
                            F22++;
                        }else{
                            rpfff[F22]='V';
                            F22++;
                        }
                    }
                     ax=0;
                    while(ax<32){
                        if(rpfff[ax]=='V'){
                            y++;
                            ax++;
                        }else{
                            y--;
                            ax++;
                        }
                    }
                    if(y==32){
                        System.out.println("Es tautologia");
                    }else{
                        System.out.println("No es tautologia");
                    }
                    impresion=0;

                    System.out.println("p\tq\tr\ts\tt\t¬p\t¬q\t¬r\t¬s\t¬t\tP2\tP3\tP4\tpT\tC\tResultado");
                    while(impresion<32){

                        System.out.println(p[impresion]+"\t"+q[impresion]+"\t"+r[impresion]+"\t"+s[impresion]+"\t"+t[impresion]+"\t"+np[impresion]+"\t"+nq[impresion]+"\t"+nr[impresion]+"\t"+ns[impresion]+"\t"+nt[impresion]+"\t"+rp2[impresion]+"\t"+rp3[impresion]+"\t"+rp4[impresion]+"\t"+rpf[impresion]+"\t"+rpff[impresion]+"\t"+rpfff[impresion]);
                        impresion++;
                    }

                    break;
                case 15:
                    finalito=0;
                    while(finalito<32){
                        if(rp1[finalito]=='V' && rp2[finalito]=='V' && rp3[finalito]=='V' && rp4[finalito]=='V'){
                            rpf[finalito]='V';
                            finalito++;
                        }else{
                            rpf[finalito]='F';
                            finalito++;
                        }
                    }
                    F22=0;
                    while(F22<32){
                        if(rpf[F22]=='V' && rpff[F22]=='F' ){
                            rpfff[F22]='F';
                            F22++;
                        }else{
                            rpfff[F22]='V';
                            F22++;
                        }
                    }
                     ax=0;
                    while(ax<32){
                        if(rpfff[ax]=='V'){
                            y++;
                            ax++;
                        }else{
                            y--;
                            ax++;
                        }
                    }
                    if(y==32){
                        System.out.println("Es tautologia");
                    }else{
                    System.out.println("No es tautologia");
                }

                    impresion=0;
                    System.out.println("p\tq\tr\ts\tt\t¬p\t¬q\t¬r\t¬s\t¬t\tP1\tP2\tP3\tP4\tpT\tC\tResultado");
                    while(impresion<32){

                        System.out.println(p[impresion]+"\t"+q[impresion]+"\t"+r[impresion]+"\t"+s[impresion]+"\t"+t[impresion]+"\t"+np[impresion]+"\t"+nq[impresion]+"\t"+nr[impresion]+"\t"+ns[impresion]+"\t"+nt[impresion]+"\t"+rp1[impresion]+"\t"+rp2[impresion]+"\t"+rp3[impresion]+"\t"+rp4[impresion]+"\t"+rpf[impresion]+"\t"+rpff[impresion]+"\t"+rpfff[impresion]);
                        impresion++;
                    }



                    break;
                default:

            }

        }while (op<=0);

            System.out.println("Si deseas repetir el programa presiona '1'");
            op2=leer.nextInt();
            }while (op2==1);
   }
}