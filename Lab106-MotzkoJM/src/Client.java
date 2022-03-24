
public class Client {

    public static void main(String[] args) {
        //timing test for array stack, linked stack, array queue, linked queue
        long start, stop, aElapse, lElapse, aqElapse, lqElapse, apElapse, aqdElapse, lpElapse, lqdElapse, elapse1, elapse2, elapse3, elapse4, elapse5, elapse6;
        int N = 100000; //needs to be 100,000,000

        ArrayStack aTest = new ArrayStack(N);
        LinkedStack lTest = new LinkedStack();//need N in parameters?
        ArrayQueue aqTest = new ArrayQueue(N);
        LinkedQueue lqTest = new LinkedQueue();//need N in parameters?

        for (int i = 1; i < N; i *= 10) {

//array stack test push
            start = System.currentTimeMillis();
            for (int j = 0; j < i; j++) {
                aTest.push(j);                     //for these pushes and pops do i need to do them seperately? like outputting wise?
//                aTest.pop();
            }
            stop = System.currentTimeMillis();
            aElapse = stop - start;
            //array stack pop
            start = System.currentTimeMillis();
            for (int jj = 0; jj < i; jj++) {
                aTest.pop();
            }
            stop = System.currentTimeMillis();
            apElapse = stop - start;

//array queue
            start = System.currentTimeMillis();
            for (int a = 0; a < i; a++) {
                aqTest.enqueue(a);
//                aqTest.dequeue();
            }
            stop = System.currentTimeMillis();
            aqElapse = stop - start;
            //array queue dequeue
            start = System.currentTimeMillis();
            for (int aa = 0; aa < i; aa++) {
                aqTest.dequeue();
            }
            stop = System.currentTimeMillis();
            aqdElapse = stop - start;

//linked stack???
            start = System.currentTimeMillis();
            for (int l = 0; l < i; l++) {
                lTest.push(l);
//                lTest.pop();
            }
            stop = System.currentTimeMillis();
            lElapse = stop - start;
            //inked stack pop
            start = System.currentTimeMillis();
            for (int ll = 0; ll < i; ll++) {
                lTest.pop();
            }
            stop = System.currentTimeMillis();
            lpElapse = stop - start;

//linked queue ?
            start = System.currentTimeMillis();
            for (int q = 0; q < i; q++) {
                lqTest.enqueue(q);
//                lqTest.dequeue();
            }
            stop = System.currentTimeMillis();
            lqElapse = stop - start;
            //linked queue dequeue
            start = System.currentTimeMillis();
            for (int qq = 0; qq < i; qq++) {
                lqTest.dequeue();
            }
            stop = System.currentTimeMillis();
            lqdElapse = stop - start;

            //^	Set the reference of the structure to null once you have completed the time measurement for a specific value of n
           
            
//somthing for array list specifically
            Stack<Integer> arrayStack;
            arrayStack = new ArrayStack<>();

            start = System.currentTimeMillis();
            for (int as = 0; as < i; as++) {
                arrayStack.push(as);
            }
            stop = System.currentTimeMillis();
            elapse1 = stop - start;
            //remove
            start = System.currentTimeMillis();
            for(int as2 = 0; as2 < i; as2++){
                arrayStack.pop();
            }
            stop = System.currentTimeMillis();
            elapse5 = stop - start;

            
            
            start = System.currentTimeMillis();
            for (int as3 = 0; as3 < i; as3++) {
                arrayStack.push(as3);
            }
            stop = System.currentTimeMillis();
            elapse2 = stop - start;
            //remove
            start = System.currentTimeMillis();
            for(int as4 = 0; as4 < i; as4++){
                arrayStack.pop();
            }
            stop = System.currentTimeMillis();
            elapse6 = stop - start;

            
//array list as a queue
            //queue works
            Queue<Integer> arrayQueue;
            arrayQueue = new ArrayQueue(); //?

            start = System.currentTimeMillis();
            for (int aq = 0; aq < i; aq++) {
                arrayQueue.enqueue(aq); //?
                arrayQueue.dequeue(); //need to remove starting at count
            }
            stop = System.currentTimeMillis();
            elapse3 = stop - start;

            start = System.currentTimeMillis();
            for (int aq2 = 0; aq2 < i; aq2++) {
                arrayQueue.enqueue(arrayQueue.size());
                arrayQueue.dequeue(); //at index 0
            }
            stop = System.currentTimeMillis();
            elapse4 = stop - start;
            //adaptor?

            System.out.printf("|%,d|%,d|%,d|%,d|%,d|%,d|%,d|%,d|%,d|%,d|%,d|%,d|%,d|%,d|%,d|\n",
                    i, aElapse, apElapse, aqElapse, aqdElapse, lElapse, lpElapse, lqElapse, lqdElapse, elapse3, elapse4, elapse1, elapse2, elapse5, elapse6); //elapse1, 2, elapse5, 6
        }
    }
}
//still need an ascii table class and an adaptor class(for array list)?
