package book;

public class Main {
    public static void main(String[] args) {
        // ProgrammingBook [] arrP = new ProgrammingBook[5];
        // FictionBook [] arrF = new FictionBook[5];
        
        // for(int i=0;i<5;i++){
        //     arrP[i] = new ProgrammingBook();
        //     arrP[i].setLanguage(arrLanguage[(int)(Math.random()*4)]);
        //     arrP[i].setPrice((int)(Math.random()*10)+1);
        //     arrF[i] = new FictionBook();
        //     arrF[i].setPrice((int)(Math.random()*10)+1);
        // }
        // int count=0;
        // for(int i=0;i<5;i++){
            //     if(arrP[i].getLanguage()=="Java"){
                //         count++;
        //     }
        // }
        // int sum=0;
        // for(int i=0;i<5;i++){
            //     sum+=arrP[i].getPrice()+arrF[i].getPrice();
            //     System.out.println(arrP[i].getLanguage()+" : "+arrP[i].getPrice());
            //     System.out.println(arrF[i].getPrice());
            // }
            // System.out.println("count= "+count);
            // System.out.println("sum = "+sum);
            
        String [] arrLanguage = {"Java","C++","PHP","Python"};
        Book [] book = new Book[10];
        for(int i=0;i<5;i++){
            book[i] = new ProgrammingBook();
            book[i+5] = new FictionBook();
        }
        for(int i=0;i<10;i++){
            for(Book a: book){
                if(a instanceof ProgrammingBook){
                    ((ProgrammingBook)book[i]).setLanguage(arrLanguage[(int)(Math.random()*4)]);
                }
            }
            book[i].setPrice((int)(Math.random()*10)+1);
        }
        for(int i=0;i<5;i++){
            System.out.println(((ProgrammingBook)book[i]).getLanguage());
        }
       System.out.println(book[1].toString());
       System.out.println(((ProgrammingBook)book[1]).toString());
    }
}
