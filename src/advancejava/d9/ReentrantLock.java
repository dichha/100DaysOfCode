/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancejava.d9;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author dichha
 */

/*
Additionally to the monitors, Java has support of the reentrant mutual 
exclusion locks(w/ the same basic behavior and semantics as the monitor 
lock but w/ more capabilities). Those locks are available through 
ReentrantLock class from java.utl.concurrent.locks. 
here is a typical lock uasage idiom:
*/
public class ReentrantLock {
   private final RentrantLock lock = new RentrantLock();
   public void performAction(){
       lock.lock(); 
       try{
           //Some implementation here
       }finally{
           lock.unlock();
       }
   }
   
   /*
   Please notice that any lock must be explicitly released by calling 
   the unlock() method (for synchronized methods and execution blocks
   Java compiler under the hood emits the instructions to release the 
   monitor lock). If the locks require writing more code, why they are better
   than monitors? Well, for couple of reasons but most importantly, locks
   could use timeouts while waiting for acquistion and fail fast(monitors 
   always wait indefinitely and do not have a way to specify the desired 
   timeout). For eg.: 
   
   */
   public void performActionWithTimeout() throws IntrerruptedException{
       if(lock.tryLock(1, TimeUnit.SECONDS)){
           try{
               // Some implementation here
           }finally{
               lock.unlock();
           }
       }
   }
   /*
   Now, when we have enough knowledge about monitors and locks, let us discuss
   how their usage affects thread states. 
   
   When any thread is waiting for the lock (acquired by another thread) using 
   lock() method call, it is in a WAITING state. However, when any thread is 
   waiting for the lock (acquired by another thread) using tryLock() method
   call with timeout, it is in a TIMED_WAITING state. In contrast, when any 
   thread is waiting for the waiting for the monitor (acquired by another thread)
   using synchronized method or execution block, it is in a BLOCKED state. 
   
   The examples we have seen so far are quite simple but lock management
   is really hard and full of pitfalls. The most infamous of them is deadlock:
   a situation in which two to more competing threads are waiting for 
   each other to procedd and thus neither ever does so. 
   Deadlocks usually occur when more than one lock or monitor lock are involved.
   JVM often is able to detect the canonical example of the deadlock looks like 
   this: 
   
   
   */
   private final ReentrantLock lock1 = new ReentrantLock();
   private final ReentrantLock lock2 = new ReentrantLock();
   
   public void performAction(){
       lock1.lock();
       try{
           // Some implementation here
           try{
               lock2.lock();
               // some implementation here
           }finally{
                lock2.unlock();
           }
           // some implementation here
       }finally{
           lock1.unlock();
       }
   }
   public void perfomAnotherAction(){
       lock2.lock();
       try{
           // Some implementation here
           try{
               lock1.lock();
               // Some implementation here
           }finally{
               lock1.unlock();
           }
           // Some implemenatation here
       }finally{
           lock2.unlock();
       }
   }
   /*
   The performAction() method tries to acquire lock1 and then lock2, while
   the method performAnotherAction() does it in the different order, lock2
   and then lock1. If by program execution flow those two methods are being
   called on the same class instance in two different threads, the deadlock is 
   very likely to hapen: the first thread will be waiting idefinitely for the 
   lock2 acquired by the second thread, while the second thread will be waiting 
   indefinitely for the lock1 acquired by the first one. 
 
   */
   
    
}
