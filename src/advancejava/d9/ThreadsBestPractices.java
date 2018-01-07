/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancejava.d9;

/**
 *
 * @author dichha
 */
/*
The multiprocessor and multicore hardware architectures greatly influence the 
design and execution model of applicatoins which run on them nowdays. In order
to utilize the full power of available computational units, the applications 
should be ready to support multiple execution flows which are running 
concurrently and competing for resources and memory. 
Concurrent programming brings a lot of challenges related to data access and 
non-deterministic flow of events which can lead to unexpected crashes and 
strange failures. 
*/
/*
Threads are the foundational building blocks of concurrent applications in Java. 
Threads are sometimes called lightweight processes and they allow multiple 
execution flows to proceed concurrently. Every single application in Java has
at least one thread called the main thread. Every Java thread exists inside 
JVM only and may not reflect any OS thread. 

Threads in Javas are instaces of class Thread. Typically, it is not recommended
to directly create and manage threads using the instance of Thread class.
*/
public class ThreadsBestPractices {
    public static void main(String[] args){
        /*
        Threads in Javas are instances of class Thread. Typically, it is not recommended
        to directly create and manage threads using the instance of Thread class.
        */
        new Thread (new Runnable() {
            @Override
            public void run(){
                //some implementataion here
            }
        });
        
        /*
        Or the same example using Java 8 lambda function: 
        public static void main(String[] args){
            new Thread(() -> { // some implementation here  }).start;
        
        */
        /*
        Thread have a complex lifecycle and can be in one of the following 
        states ( a thread can be in only one state at a given point in time).
        
        Thread State                            Description
        ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        NEW         A thread has now yet started in this state. 
        RUNNABLE    A thread executing in the Java virtual machine is in this state.
        BLOCKED     A thread this is blocked waiting for a monitor lock is in
        WAITING     A thread that is waiting indefinitely for another thread to 
                    perform a particular action is in this state. 
        TIMED_WAITING   A thread that is waiting indefinitely for another thread
                    to perform a particular action is in this state.
        TERMINATED  A thread that has exited is in this state.      
        */
        
        /*
        Threads could be assembled into groups. A thread group represents a 
        set of threads and also include other thread group(thus forming a tree).
        Threads groups intended to be a nice feature however they are 
        not recommended for use nowdays as executors and thread pool are much 
        alternatives. 
        
        */
        
       
        
    }
     /*
        CONCURRENCY, SYNCHRONIZATION AND IMMUTABILITY
        In mostly every Java application, multiple threads need to communicate
        with each other and access shared data. Reading this data is not so much 
        of a problem, however uncoordinated modification of it is a straight road
        to disaster (so called racing conditions). That is the point where 
        synchronixation kicks in. Synchronication is a meachism to ensure that 
        several concurrently running threads will not execute the specifically 
        guarded (synchronized) block of application code at the same time. 
        If one of the threads has begun to execute a synchronized block of 
        the code, any other thread trying to execute the same block must
        watit until the first one finishes. 
        
        Java languages has synchronization support built-in in the form of 
        synchronized keyword. This keyword can be applied to instance methods, 
        static methods or used around arbitrary execution blocks and guarantees
        that only one thread at a time will be invoke it. 
        For eg.: 
        */
        public synchronized void performAction(){
            // Some implementation here
        }
        public static synchronized void performClassAction(){
            // Some implementation here
        }
        
        // Or, alternatively, the example which uses the synchronized with 
        // a code block
        public void performActionBlock(){
            synchronized(this){
                // Some implementation here
            }
            
        }
        /*
        There is another very important effect of synchronized keyword: 
        it automatically esatablishes a happens-before relationship w/ any
        invocation of a synchronized method or code block for the same
        object. This guarantees that changes to the state of the object are
        visible to all threads. 
        
        Constructors cannot be synchronized (using the synchronized keyword
        with a constructor raises compiler error) b/c only thread which 
        creates an instance has access to it while instance is being constructed.
        
        In Java, synchronizatoin is built around an internal entity known 
        as monitor (or intrinsic/monitor lock). Monitor enforces exclusive access
        to an objects's state and establishes happens-before relationships.
        When any thread invokes a synchronized method, it automatically acquires
        the intrinsic (monitor) lock for that method's instance (or class in case
        of static methods) and releases it once the method returns. 
        
        Lastly, the synchronization in Hava is reentrant: it means that the 
        thread can acquire a lock which it already owns. Reentracy significantly 
        simplifies the programming model of the concurrent applications as the
        threads have fewer changes to block themselves.
        
        As you can see, concurency introduces a lot of complexity into the Java
        applications. However, there is a cure: immutability. We have talked about
        that many times already, but it is really important for multithreaded 
        applications in particular: immutable objects do not need the synchronization
        as they are never being update by more than one threads. 
        
        */
        
        /*
        FUTURES, EXECUTORS AND THREAD POOLS
        
        Creating new threads in Java is easy, but managing them is really tough. 
        Java standard library provides extremely useful abstractions in the 
        form of executors and thread pools targeted to simplify threads management. 
        
        Essentially, in its simplest implementation, thread pool creates and 
        maintains a list of threads, ready to be used right away. Applications, 
        instead of spawning new thread every time, just borrows the one 
        (or as many as needed) from the pool. Once borrowed thread finishes job, 
        it is returned back to the pool, and becomes available to pick up nest task.
        
        Though it is possible to use thread pools directly, Java standard 
        library provides an executors facade which has a set of factory method
        to create commonly used thread pool configurations. For eg., the code
        snippet below creates a thread pool w/ fixed number of threads
        
        ExecutorService executor = Executors.newFixedThreadPool(10);
        
        Executors could be used to offload any task so it will be executed in 
        separate thread from the thread pool (as a note, it is not recommended
        to use executors for long-running tasks. The executors' facade allows
        cutomizing the behavior of the underlying thread and supports following 
        configurations: 
        NEW, RUNNABLE, BLOCKED, WAITING, TIMED_WAITING, TERMINATED
        
        In some cases, the result of the execution is not very important so executors
        support fire-and-forget semantic, for eg.
        executor.execute(new Runnable(){
            @Override
            public void run(){
                // some implementation here
            }
        });
        
        The equivalent Java8 eg. is more concise: 
        executor.execute(()-> {
            // some implementation here
        });
        
        But if the result of the execution is important, Java std. library 
        provides another abstraction to represent the computation which 
        will happen at some point in the future, called Future<T>. For eg.
        Future<Long> result = executors.submit(new Callable<Long>(){
            @Override
            public Long call() throws Exception{
                // Some implementation here
                return ...; 
            }
        });
        
        The result of the Future<T> might not be available immediately so the 
        application should wait for it using a gamily of get(...) methods. 
        For eg.: 
        Long value = result.get(1, TimeUnit.SECONDS); 
        
        If result of the computation is not available w/in specified timeout, 
        the TimeoutException exception be raised. There is an overloaded version 
        of get() which waits forever but please prefer to use the one w/ timeout. 
        
        since the Java 8 release, developers have yet another version of the Future<T>,
        CompletableFuture<T>, which supports addition functions and actions that 
        trigger upon its completion. Not only that, w/ introduciton of streams, 
        Java 8 introduces a simple and very staraightforward way to perform 
        parallel collection processing using parallelStream() method, for eg.
        final Collection<String> strings = new ArrayList<>();
        // some implementation here
        
        final int sumOfLengths = strings.parallelStream()
            .filter(str - > !str.isEmpty())
            .mapToInt( str -> str.length())
            .sum();
        
        The simplicity, which xecutors and parallel streams brought to the Java 
        platform, made the concurrent & parallel programming much easier. But
        there is a catch: uncontrolled creation of thread pools and parallel
        streams could kill application performance so it is important to manage
        them accordingly. 
        
        
        
        
   
     
        
        
        
 
        */
        
        
}
