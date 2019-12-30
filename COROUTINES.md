# COROUTINES
  
  
**Important Links**    
  https://blog.mindorks.com/mastering-kotlin-coroutines-in-android-step-by-step-guide  
https://blog.mindorks.com/what-are-coroutines-in-kotlin-bf4fecd476e9  
https://kotlinlang.org/docs/tutorials/coroutines/coroutines-basic-jvm.html  

  
## What is Coroutines ?  
**Co+Routines = Coroutines**  
Co - Coperation  
Routines - Functions  
When functions coperate with each other to execute known as **COROUTINES**. Coroutines is used to achieve asynchronous programming with using the cpu idle state. We can run multiple methods at the same time with the help of Coroutines.  
  
**Coroutines and Threads** both are doing multitasking but Thread is handled by the sustem/os and the coroutines is handled by the User as it can execute a few lines of function by taking advantage of the cooperation.It's an optimized framework written over the actual threading by taking advantage of the cooperative nature of functions to make it light and yet powerful. So, we can say that Coroutines are lightweight threads. A lightweight thread means it doesn’t map on the native thread, so it doesn’t require context switching on the processor, so they are faster.   
  
Coroutines are available in many languages. It is of 2 types  
1. Stackless   
2. Stackfull  
  
Kotlin implements stackless coroutines — it’s mean that the coroutines don’t have own stack, so they don’t map on the native thread.  
  
**NOTE - One can think of a coroutine as a light-weight thread. Like threads, coroutines can run in parallel, wait for each other and communicate. The biggest difference is that coroutines are very cheap, almost free: we can create thousands of them, and pay very little in terms of performance. True threads, on the other hand, are expensive to start and keep around. A thousand threads can be a serious challenge for a modern machine.**  
  
## Definition of Coroutines:  
A framework to manage concurrency in a more performant and simple way with its lightweight thread which is written on top of the actual threading framework to get the most out of it by taking the advantage of cooperative nature of functions.  
  
**Where we can use Coroutines**  
Lets take a simple example where we can  
1.Fetch User from the server.  
2.Show the User in the UI.  
  
When we will do any N/W operation in main thread it will show exception network on main thread. To avoid that we can use use the below solutions  
1. Call Back  
2. Rx Java  
3. Coroutines  
  
  suspend fun fetchAndShowUser() {  
     val user = fetchUser() // fetch on IO thread  
     showUser(user) // back on UI thread  
}  
  
Here, the above code looks synchronous, but it is asynchronous. We will see how is it possible.   
  
How to implement coroutines  
  
dependencies {  
  implementation "org.jetbrains.kotlinx:kotlinx-coroutines-core:x.x.x"  
  implementation "org.jetbrains.kotlinx:kotlinx-coroutines-android:x.x.x"  
}    
  
Now, our function fecthUser will look like below:  
  
suspend fun fetchUser(): User {  
    return GlobalScope.async(Dispatchers.IO) {  
        // make network call  
        // return user  
    }.await()  
}    
**EXAMPLE**  
GlobalScope.launch(Dispatchers.Main) {  
        val user = fetchUser() // fetch on IO thread  
        showUser(user) // back on UI thread  
    }  
    
showUser will run on UI thread because we have used the Dispatchers.Main to launch it.  
There are two functions in Kotlin to start the coroutines which are as follows:  
  
**1. launch{}
2. async{}**  
  
**Launch vs Async in Kotlin Coroutines**  
  
The difference is that the launch{} does not return anything and the async{}returns an instance of Deferred<T>, which has an await()function that returns the result of the coroutine like we have future in Java in which we do future.get() to the get the result.  
      
**The main keywords in Coroutines are**  
**1.Suspend -** Suspend function is a function that could be started, paused and resume.    
**2.GlobalScope -**  
**3.async() -**  
**4.launch() -**  
**5.await -**  
**6.Dispatchers -**  Dispatchers helps coroutines in deciding the thread on which the work has to be done. There are majorly three types of Dispatchers which are as **IO, Default, and Main**. IO dispatcher is used to do the network and disk related work. Default is used to do the CPU intensive work. Main is the UI thread of Android. In order to use these, we need to wrap the work under the async function. Async function looks like below.  
**7.Scopes -**  
**8.withContext() -** withContext is nothing but an another way writing the async where we do not have to write await().  




