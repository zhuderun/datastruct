package isumi.datastruct.list.link;

import isumi.datastruct.MyIterator;

public class App {

    public static void main(String [] args){
        MyLinkList<Integer> list = new MyLinkList<Integer>();
        for(int i = 0;i<10;i++){
            list.add(i);
        }

        MyIterator<Integer> ite = list.iterator();
        while(ite.hasNext()){
            System.out.println(ite.next());
        }



    }
}
