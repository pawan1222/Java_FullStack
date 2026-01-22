package Multithreading;
/*
Multithreading:
    Multithreading is a Java is a process of executing multiple threads simultaneously.
    A thread is a lightweight subprocess, the smallest unit of processing.
    Threads are independent, if there occurs exception in one thread, it doesn't affect other threads.
    Multithreading and multiprocessing are used to achieve multitasking.
    But we use multithreading than multiprocessing because threads share a common memory area.
    They dont allocate separate memory area, so it is more efficient and context switching between threads is faster than processes.
    Java multithreading is mostly used in games, animations etc.

    Advantages of java multithreading:
    1. Improved performance
    2. Simplicity
    3. Better resource utilization
    4. Enhanced responsiveness
    5. Improved scalability

    Multitasking:
        Multitasking is a process of executing multiple tasks simultaneously.
        Multitasking is of two types:
        1. Process-based multitasking (Multiprocessing)
        2. Thread-based multitasking (Multithreading)

    process-based multitasking:(Multiprocessing)
        In process-based multitasking, each task is executed as a separate process.
        Each process has its own memory space.
        Context switching between processes is slower than threads.

    thread-based multitasking:(Multithreading)
        In thread-based multitasking, each task is executed as a separate thread within a process.
        Threads share a common memory space.
        Context switching between threads is faster than processes.

    Life cycle of thread:
        1.New
        2.Runnable
        3.Running
        4.Non-Running(Blocked)
        5.Terminated

        the life cycle of the thread in java is controlled by JVM.

    New:
        The thread is in new state if you create an instance of Thread class but before the invocation of start() method.

    Runnable:
        The Thread is in runnable state after invocation of start() method, but the thread schedular has not selected
        it to be the running thread.

    Running:
        The thread is in running state if the thread schedular has selected it.

    Non-runnable:
        This is the state when the thread is still alive, but is currently not eligible to run.

    Terminated:
        A thread is in terminated or dead state when its run() method exits.


    How to create thread?
        1.By extending Thread class.
        2.By implementing Runnable interface.

    Thread class:
        Thread class provide constructor and methods to create and perform operations on thread.
        Thread class extends Object class and implements Runnable interface.

    Commonly used Constructors of Thread class:
        Thread();
        Thread(String name)
        Thread(Runnable r)
        Thread(Runnable r,String name)

    Commonly used methods of thread class:
        1.Public void run(): is used to perform action for a thread

        2.public void start(): starts the execution of the thread.JVM calls the run() method on the thread.
        3.public void sleep(long milisecond)
        4.public void join(): waits for a thread to die.
        5.public void join(long miliceconds): waits for a thread to die for the specified miliseconds.
        6.public int getPriority(): return thename of the thread.
        7.public int setPriority(int priority): changes the priority of the thread.
        8.public String getName(); return the name of the thread.
        9.public void setName(String name): chaneg the name of the thread.
        10.public Thread currentThread()





    Runnable interface:
	    The Runnable interface should be implemented by any class whose instances are intended to be executed by a 
	    thread. Runnable interface have only one method named run().
	
	    public void run(): is used to perform action for a thread.


    Thread Schedular:
        Thread schedular in java is the part of the jvm that decides which thread should run.
        There is no guarantee that which runnable thread will be chosen to run by the thread schedular.
        Only one thread at a time will run in a single process.

    Daemon Thread in Java :
        A Daemon Thread is a background thread that runs to support user threads.
        When all user (non-daemon) threads finish, the JVM automatically terminates daemon threads.
        Daemon thread runs in background
        JVM does not wait for daemon threads
        setDaemon(true) must be called before start()
        It is a low priority thread.

    Java Thread Pool :
	    Java Thread pool represents a group of worker threads that are waiting for the job and reuse many times.
	    In case of thread pool, a group of fixed size threads are created. A thread from the thread pool is pulled
	    out and assigned a job by the service provider. After completion of the job, thread is contained in the 
	    thread pool again.	
	    Better performance It saves time because there is no need to create new thread.
	    It is used in Servlet and JSP where container creates a thread pool to process the request.

        In a thread pool, we do NOT create threads directly.
        We create a pool, and the pool creates & manages threads.

        ExecutorService pool = Executors.newFixedThreadPool(3);
        Pool created
        3 threads are created internally
        Threads are ready and waiting


        In Java thread pools, execute() is needed to submit a task to the pool so that a worker thread can run it.
        execute() sends a task to the thread pool
        The thread pool decides WHICH thread will run it
        You do not create or start threads manually

        

*/
public class multithread {
    public static void main(String[] args) {
        
    }
}
